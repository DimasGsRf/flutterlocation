import Flutter
import UIKit
import SwiftLocation
import CoreLocation

@UIApplicationMain
public class SwiftLocationPlugin: NSObject, FlutterPlugin, LocationHostApi, UIApplicationDelegate {
    var globalLocationSettings: LocationSettings?
    var streamHandler: StreamHandler?
    
    
    init(_ messenger: FlutterBinaryMessenger, _ registrar: FlutterPluginRegistrar) {
        super.init()
        let eventChannel = FlutterEventChannel(name: "lyokone/location_stream", binaryMessenger: messenger)
        self.streamHandler = StreamHandler()
        eventChannel.setStreamHandler(self.streamHandler)
        
        registrar.addApplicationDelegate(self)
    }
    
    
    
    public func getLocationSettings(_ settings: LocationSettings?, completion: @escaping (LocationData?, FlutterError?) -> Void) {
        if !CLLocationManager.locationServicesEnabled() {
            UIApplication.shared.open(URL(string:UIApplication.openSettingsURLString)!)
            return completion(nil, FlutterError(code: "LOCATION_SERVICE_DISABLED",
                                                message: "The user have deactivated the location service, the settings page has been opened",
                                                details: nil))
        }
        
        if (Int(truncating: SwiftLocationPlugin.getPermissionNumber()) > 1) {
            return completion(nil, FlutterError(code: "PERMISSION_DENIED",
                                                message: "The user has denied the permission",
                                                details: nil))
        }
        
        let currentSettings = SwiftLocationPlugin.locationSettingsToGPSLocationOptions(settings ?? globalLocationSettings)
        
        if globalLocationSettings?.ignoreLastKnownPosition == false {
            let lastKnownPosition = SwiftLocation.lastKnownGPSLocation
            if (lastKnownPosition != nil) {
                completion(SwiftLocationPlugin.locationToData(lastKnownPosition!), nil)
                return;
            }
        }
        
        SwiftLocation.gpsLocationWith(currentSettings ?? getDefaultGPSLocationOptions()).then { result in // you can attach one or more subscriptions via `then`.
            switch result {
            case .success(let location):
                completion(SwiftLocationPlugin.locationToData(location), nil)
            case .failure(let error):
                completion(nil, FlutterError(code: "LOCATION_ERROR",
                                             message: error.localizedDescription,
                                             details: error.recoverySuggestion))
            }
        }
    }
    
    
    static public func locationToData(_ location: CLLocation) -> LocationData {
        if #available(iOS 13.4, *) {
            return LocationData.make(
                withLatitude: NSNumber(value: location.coordinate.latitude),
                longitude: NSNumber(value: location.coordinate.longitude),
                accuracy: NSNumber(value: location.horizontalAccuracy),
                altitude: NSNumber(value: location.altitude),
                bearing: NSNumber(value: location.course),
                bearingAccuracyDegrees: NSNumber(value: location.courseAccuracy),
                elaspedRealTimeNanos: nil,
                elaspedRealTimeUncertaintyNanos: nil,
                sattelites: nil,
                speed: NSNumber(value: location.speed),
                speedAccuracy: NSNumber(value: location.speedAccuracy),
                time: NSNumber(value: location.timestamp.timeIntervalSince1970),
                verticalAccuracy: NSNumber(value: location.verticalAccuracy),
                isMock: false)
        }
        return LocationData.make(
                withLatitude: NSNumber(value: location.coordinate.latitude),
                longitude: NSNumber(value: location.coordinate.longitude),
                accuracy: NSNumber(value: location.horizontalAccuracy),
                altitude: NSNumber(value: location.altitude),
                bearing: NSNumber(value: location.course),
                bearingAccuracyDegrees: nil,
                elaspedRealTimeNanos: nil,
                elaspedRealTimeUncertaintyNanos: nil,
                sattelites: nil,
                speed: NSNumber(value: location.speed),
                speedAccuracy: NSNumber(value: location.speedAccuracy),
                time: NSNumber(value: location.timestamp.timeIntervalSince1970),
                verticalAccuracy: NSNumber(value: location.verticalAccuracy),
                isMock: false)
    }
    
    
    public func getDefaultGPSLocationOptions() -> GPSLocationOptions {
        let defaultOption = GPSLocationOptions()
        defaultOption.minTimeInterval = 2
        defaultOption.subscription = .single
        
        return defaultOption
    }
    
    static private func mapAccuracy (_ accuracy: LocationAccuracy) -> GPSLocationOptions.Accuracy {
        switch (accuracy) {
            
        case .powerSave:
            return GPSLocationOptions.Accuracy.city
        case .low:
            return GPSLocationOptions.Accuracy.block
        case .balanced:
            return GPSLocationOptions.Accuracy.house
        case .high:
            return GPSLocationOptions.Accuracy.room
        case .navigation:
            return GPSLocationOptions.Accuracy.room
        @unknown default:
            return GPSLocationOptions.Accuracy.room
        }
    }
    
    
    static public func locationSettingsToGPSLocationOptions(_ settings: LocationSettings?) -> GPSLocationOptions? {
        if (settings == nil) {
            return nil
        }
        let options = GPSLocationOptions()
        
        let minTimeInterval = settings?.interval
        let accuracy = settings?.accuracy
        let askForPermission = settings?.askForPermission
        let minDistance = settings?.smallestDisplacement
        
        
        options.activityType = .automotiveNavigation
        options.subscription = .single
        
        if (minTimeInterval != nil) {
            options.minTimeInterval = Double(Int(truncating: minTimeInterval!) / 1000)
        }
        
        
        if (accuracy != nil) {
            options.accuracy = mapAccuracy(accuracy!)
        }
        
        if (askForPermission == false) {
            options.avoidRequestAuthorization = true
        }
        if (minDistance != nil) {
            options.minDistance = Double(truncating: minDistance!)
        }
        
        
        return options
    }
    
    
    public func setLocationSettingsSettings(_ settings: LocationSettings, error: AutoreleasingUnsafeMutablePointer<FlutterError?>) -> NSNumber? {
        globalLocationSettings = settings;
        
        return NSNumber(1)
    }
    
    static public func getPermissionNumber() -> NSNumber {
        let currentStatus = SwiftLocation.authorizationStatus
        
        switch currentStatus {
        case .notDetermined:
            return 2
        case .restricted:
            return 1
        case .denied:
            return 2
        case .authorizedAlways:
            return 0
        case .authorizedWhenInUse:
            return 0
        case .authorized:
            return 0
        @unknown default:
            return 4
        }
    }
    
    public func getPermissionStatusWithError(_ error: AutoreleasingUnsafeMutablePointer<FlutterError?>) -> NSNumber? {
        return SwiftLocationPlugin.getPermissionNumber()
    }
    
    public func requestPermission(completion: @escaping (NSNumber?, FlutterError?) -> Void) {
        SwiftLocation.requestAuthorization(.onlyInUse) { newStatus in
            switch newStatus {
            case .notDetermined:
                completion(4, nil)
            case .restricted:
                completion(1, nil)
            case .denied:
                completion(2, nil)
            case .authorizedAlways:
                completion(0, nil)
            case .authorizedWhenInUse:
                completion(0, nil)
            case .authorized:
                completion(0, nil)
            @unknown default:
                completion(4, nil)
            }
        }
    }
    
    
    public func isGPSEnabledWithError(_ error: AutoreleasingUnsafeMutablePointer<FlutterError?>) -> NSNumber? {
        if CLLocationManager.locationServicesEnabled() {
            return NSNumber(true)
        }
        return NSNumber(false)
    }
    
    public func isNetworkEnabledWithError(_ error: AutoreleasingUnsafeMutablePointer<FlutterError?>) -> NSNumber? {
        if CLLocationManager.locationServicesEnabled() {
            return NSNumber(true)
        }
        return NSNumber(false)
    }
    
    
    public static func register(with registrar: FlutterPluginRegistrar) {
        let messenger : FlutterBinaryMessenger = registrar.messenger()
        let api : LocationHostApi & NSObjectProtocol = SwiftLocationPlugin.init(messenger, registrar)
        
        
        LocationHostApiSetup(messenger, api);
    }
    
    @nonobjc public func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [AnyHashable : Any] = [:]) -> Bool {
        return true
    }
    
}
