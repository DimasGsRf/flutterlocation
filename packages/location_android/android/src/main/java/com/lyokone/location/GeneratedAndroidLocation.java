// Autogenerated from Pigeon (v3.1.5), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.lyokone.location;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class GeneratedAndroidLocation {

  public enum LocationAccuracy {
    powerSave(0),
    low(1),
    balanced(2),
    high(3),
    navigation(4);

    private int index;
    private LocationAccuracy(final int index) {
      this.index = index;
    }
  }

  public enum PermissionStatus {
    granted(0),
    grantedLimited(1),
    denied(2),
    deniedForever(3);

    private int index;
    private PermissionStatus(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class LocationData {
    private @Nullable Double latitude;
    public @Nullable Double getLatitude() { return latitude; }
    public void setLatitude(@Nullable Double setterArg) {
      this.latitude = setterArg;
    }

    private @Nullable Double longitude;
    public @Nullable Double getLongitude() { return longitude; }
    public void setLongitude(@Nullable Double setterArg) {
      this.longitude = setterArg;
    }

    private @Nullable Double accuracy;
    public @Nullable Double getAccuracy() { return accuracy; }
    public void setAccuracy(@Nullable Double setterArg) {
      this.accuracy = setterArg;
    }

    private @Nullable Double altitude;
    public @Nullable Double getAltitude() { return altitude; }
    public void setAltitude(@Nullable Double setterArg) {
      this.altitude = setterArg;
    }

    private @Nullable Double bearing;
    public @Nullable Double getBearing() { return bearing; }
    public void setBearing(@Nullable Double setterArg) {
      this.bearing = setterArg;
    }

    private @Nullable Double bearingAccuracyDegrees;
    public @Nullable Double getBearingAccuracyDegrees() { return bearingAccuracyDegrees; }
    public void setBearingAccuracyDegrees(@Nullable Double setterArg) {
      this.bearingAccuracyDegrees = setterArg;
    }

    private @Nullable Double elaspedRealTimeNanos;
    public @Nullable Double getElaspedRealTimeNanos() { return elaspedRealTimeNanos; }
    public void setElaspedRealTimeNanos(@Nullable Double setterArg) {
      this.elaspedRealTimeNanos = setterArg;
    }

    private @Nullable Double elaspedRealTimeUncertaintyNanos;
    public @Nullable Double getElaspedRealTimeUncertaintyNanos() { return elaspedRealTimeUncertaintyNanos; }
    public void setElaspedRealTimeUncertaintyNanos(@Nullable Double setterArg) {
      this.elaspedRealTimeUncertaintyNanos = setterArg;
    }

    private @Nullable Long sattelites;
    public @Nullable Long getSattelites() { return sattelites; }
    public void setSattelites(@Nullable Long setterArg) {
      this.sattelites = setterArg;
    }

    private @Nullable Double speed;
    public @Nullable Double getSpeed() { return speed; }
    public void setSpeed(@Nullable Double setterArg) {
      this.speed = setterArg;
    }

    private @Nullable Double speedAccuracy;
    public @Nullable Double getSpeedAccuracy() { return speedAccuracy; }
    public void setSpeedAccuracy(@Nullable Double setterArg) {
      this.speedAccuracy = setterArg;
    }

    private @Nullable Double time;
    public @Nullable Double getTime() { return time; }
    public void setTime(@Nullable Double setterArg) {
      this.time = setterArg;
    }

    private @Nullable Double verticalAccuracy;
    public @Nullable Double getVerticalAccuracy() { return verticalAccuracy; }
    public void setVerticalAccuracy(@Nullable Double setterArg) {
      this.verticalAccuracy = setterArg;
    }

    private @Nullable Boolean isMock;
    public @Nullable Boolean getIsMock() { return isMock; }
    public void setIsMock(@Nullable Boolean setterArg) {
      this.isMock = setterArg;
    }

    public static final class Builder {
      private @Nullable Double latitude;
      public @NonNull Builder setLatitude(@Nullable Double setterArg) {
        this.latitude = setterArg;
        return this;
      }
      private @Nullable Double longitude;
      public @NonNull Builder setLongitude(@Nullable Double setterArg) {
        this.longitude = setterArg;
        return this;
      }
      private @Nullable Double accuracy;
      public @NonNull Builder setAccuracy(@Nullable Double setterArg) {
        this.accuracy = setterArg;
        return this;
      }
      private @Nullable Double altitude;
      public @NonNull Builder setAltitude(@Nullable Double setterArg) {
        this.altitude = setterArg;
        return this;
      }
      private @Nullable Double bearing;
      public @NonNull Builder setBearing(@Nullable Double setterArg) {
        this.bearing = setterArg;
        return this;
      }
      private @Nullable Double bearingAccuracyDegrees;
      public @NonNull Builder setBearingAccuracyDegrees(@Nullable Double setterArg) {
        this.bearingAccuracyDegrees = setterArg;
        return this;
      }
      private @Nullable Double elaspedRealTimeNanos;
      public @NonNull Builder setElaspedRealTimeNanos(@Nullable Double setterArg) {
        this.elaspedRealTimeNanos = setterArg;
        return this;
      }
      private @Nullable Double elaspedRealTimeUncertaintyNanos;
      public @NonNull Builder setElaspedRealTimeUncertaintyNanos(@Nullable Double setterArg) {
        this.elaspedRealTimeUncertaintyNanos = setterArg;
        return this;
      }
      private @Nullable Long sattelites;
      public @NonNull Builder setSattelites(@Nullable Long setterArg) {
        this.sattelites = setterArg;
        return this;
      }
      private @Nullable Double speed;
      public @NonNull Builder setSpeed(@Nullable Double setterArg) {
        this.speed = setterArg;
        return this;
      }
      private @Nullable Double speedAccuracy;
      public @NonNull Builder setSpeedAccuracy(@Nullable Double setterArg) {
        this.speedAccuracy = setterArg;
        return this;
      }
      private @Nullable Double time;
      public @NonNull Builder setTime(@Nullable Double setterArg) {
        this.time = setterArg;
        return this;
      }
      private @Nullable Double verticalAccuracy;
      public @NonNull Builder setVerticalAccuracy(@Nullable Double setterArg) {
        this.verticalAccuracy = setterArg;
        return this;
      }
      private @Nullable Boolean isMock;
      public @NonNull Builder setIsMock(@Nullable Boolean setterArg) {
        this.isMock = setterArg;
        return this;
      }
      public @NonNull LocationData build() {
        LocationData pigeonReturn = new LocationData();
        pigeonReturn.setLatitude(latitude);
        pigeonReturn.setLongitude(longitude);
        pigeonReturn.setAccuracy(accuracy);
        pigeonReturn.setAltitude(altitude);
        pigeonReturn.setBearing(bearing);
        pigeonReturn.setBearingAccuracyDegrees(bearingAccuracyDegrees);
        pigeonReturn.setElaspedRealTimeNanos(elaspedRealTimeNanos);
        pigeonReturn.setElaspedRealTimeUncertaintyNanos(elaspedRealTimeUncertaintyNanos);
        pigeonReturn.setSattelites(sattelites);
        pigeonReturn.setSpeed(speed);
        pigeonReturn.setSpeedAccuracy(speedAccuracy);
        pigeonReturn.setTime(time);
        pigeonReturn.setVerticalAccuracy(verticalAccuracy);
        pigeonReturn.setIsMock(isMock);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("latitude", latitude);
      toMapResult.put("longitude", longitude);
      toMapResult.put("accuracy", accuracy);
      toMapResult.put("altitude", altitude);
      toMapResult.put("bearing", bearing);
      toMapResult.put("bearingAccuracyDegrees", bearingAccuracyDegrees);
      toMapResult.put("elaspedRealTimeNanos", elaspedRealTimeNanos);
      toMapResult.put("elaspedRealTimeUncertaintyNanos", elaspedRealTimeUncertaintyNanos);
      toMapResult.put("sattelites", sattelites);
      toMapResult.put("speed", speed);
      toMapResult.put("speedAccuracy", speedAccuracy);
      toMapResult.put("time", time);
      toMapResult.put("verticalAccuracy", verticalAccuracy);
      toMapResult.put("isMock", isMock);
      return toMapResult;
    }
    static @NonNull LocationData fromMap(@NonNull Map<String, Object> map) {
      LocationData pigeonResult = new LocationData();
      Object latitude = map.get("latitude");
      pigeonResult.setLatitude((Double)latitude);
      Object longitude = map.get("longitude");
      pigeonResult.setLongitude((Double)longitude);
      Object accuracy = map.get("accuracy");
      pigeonResult.setAccuracy((Double)accuracy);
      Object altitude = map.get("altitude");
      pigeonResult.setAltitude((Double)altitude);
      Object bearing = map.get("bearing");
      pigeonResult.setBearing((Double)bearing);
      Object bearingAccuracyDegrees = map.get("bearingAccuracyDegrees");
      pigeonResult.setBearingAccuracyDegrees((Double)bearingAccuracyDegrees);
      Object elaspedRealTimeNanos = map.get("elaspedRealTimeNanos");
      pigeonResult.setElaspedRealTimeNanos((Double)elaspedRealTimeNanos);
      Object elaspedRealTimeUncertaintyNanos = map.get("elaspedRealTimeUncertaintyNanos");
      pigeonResult.setElaspedRealTimeUncertaintyNanos((Double)elaspedRealTimeUncertaintyNanos);
      Object sattelites = map.get("sattelites");
      pigeonResult.setSattelites((sattelites == null) ? null : ((sattelites instanceof Integer) ? (Integer)sattelites : (Long)sattelites));
      Object speed = map.get("speed");
      pigeonResult.setSpeed((Double)speed);
      Object speedAccuracy = map.get("speedAccuracy");
      pigeonResult.setSpeedAccuracy((Double)speedAccuracy);
      Object time = map.get("time");
      pigeonResult.setTime((Double)time);
      Object verticalAccuracy = map.get("verticalAccuracy");
      pigeonResult.setVerticalAccuracy((Double)verticalAccuracy);
      Object isMock = map.get("isMock");
      pigeonResult.setIsMock((Boolean)isMock);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class LocationSettings {
    private @NonNull Boolean askForPermission;
    public @NonNull Boolean getAskForPermission() { return askForPermission; }
    public void setAskForPermission(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"askForPermission\" is null.");
      }
      this.askForPermission = setterArg;
    }

    private @NonNull String rationaleMessageForPermissionRequest;
    public @NonNull String getRationaleMessageForPermissionRequest() { return rationaleMessageForPermissionRequest; }
    public void setRationaleMessageForPermissionRequest(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"rationaleMessageForPermissionRequest\" is null.");
      }
      this.rationaleMessageForPermissionRequest = setterArg;
    }

    private @NonNull String rationaleMessageForGPSRequest;
    public @NonNull String getRationaleMessageForGPSRequest() { return rationaleMessageForGPSRequest; }
    public void setRationaleMessageForGPSRequest(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"rationaleMessageForGPSRequest\" is null.");
      }
      this.rationaleMessageForGPSRequest = setterArg;
    }

    private @NonNull Boolean useGooglePlayServices;
    public @NonNull Boolean getUseGooglePlayServices() { return useGooglePlayServices; }
    public void setUseGooglePlayServices(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"useGooglePlayServices\" is null.");
      }
      this.useGooglePlayServices = setterArg;
    }

    private @NonNull Boolean askForGooglePlayServices;
    public @NonNull Boolean getAskForGooglePlayServices() { return askForGooglePlayServices; }
    public void setAskForGooglePlayServices(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"askForGooglePlayServices\" is null.");
      }
      this.askForGooglePlayServices = setterArg;
    }

    private @NonNull Boolean askForGPS;
    public @NonNull Boolean getAskForGPS() { return askForGPS; }
    public void setAskForGPS(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"askForGPS\" is null.");
      }
      this.askForGPS = setterArg;
    }

    private @NonNull Boolean fallbackToGPS;
    public @NonNull Boolean getFallbackToGPS() { return fallbackToGPS; }
    public void setFallbackToGPS(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"fallbackToGPS\" is null.");
      }
      this.fallbackToGPS = setterArg;
    }

    private @NonNull Boolean ignoreLastKnownPosition;
    public @NonNull Boolean getIgnoreLastKnownPosition() { return ignoreLastKnownPosition; }
    public void setIgnoreLastKnownPosition(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"ignoreLastKnownPosition\" is null.");
      }
      this.ignoreLastKnownPosition = setterArg;
    }

    private @Nullable Double expirationDuration;
    public @Nullable Double getExpirationDuration() { return expirationDuration; }
    public void setExpirationDuration(@Nullable Double setterArg) {
      this.expirationDuration = setterArg;
    }

    private @Nullable Double expirationTime;
    public @Nullable Double getExpirationTime() { return expirationTime; }
    public void setExpirationTime(@Nullable Double setterArg) {
      this.expirationTime = setterArg;
    }

    private @NonNull Double fastestInterval;
    public @NonNull Double getFastestInterval() { return fastestInterval; }
    public void setFastestInterval(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"fastestInterval\" is null.");
      }
      this.fastestInterval = setterArg;
    }

    private @NonNull Double interval;
    public @NonNull Double getInterval() { return interval; }
    public void setInterval(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"interval\" is null.");
      }
      this.interval = setterArg;
    }

    private @Nullable Double maxWaitTime;
    public @Nullable Double getMaxWaitTime() { return maxWaitTime; }
    public void setMaxWaitTime(@Nullable Double setterArg) {
      this.maxWaitTime = setterArg;
    }

    private @Nullable Long numUpdates;
    public @Nullable Long getNumUpdates() { return numUpdates; }
    public void setNumUpdates(@Nullable Long setterArg) {
      this.numUpdates = setterArg;
    }

    private @NonNull LocationAccuracy accuracy;
    public @NonNull LocationAccuracy getAccuracy() { return accuracy; }
    public void setAccuracy(@NonNull LocationAccuracy setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"accuracy\" is null.");
      }
      this.accuracy = setterArg;
    }

    private @NonNull Double smallestDisplacement;
    public @NonNull Double getSmallestDisplacement() { return smallestDisplacement; }
    public void setSmallestDisplacement(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"smallestDisplacement\" is null.");
      }
      this.smallestDisplacement = setterArg;
    }

    private @NonNull Boolean waitForAccurateLocation;
    public @NonNull Boolean getWaitForAccurateLocation() { return waitForAccurateLocation; }
    public void setWaitForAccurateLocation(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"waitForAccurateLocation\" is null.");
      }
      this.waitForAccurateLocation = setterArg;
    }

    private @Nullable Double acceptableAccuracy;
    public @Nullable Double getAcceptableAccuracy() { return acceptableAccuracy; }
    public void setAcceptableAccuracy(@Nullable Double setterArg) {
      this.acceptableAccuracy = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private LocationSettings() {}
    public static final class Builder {
      private @Nullable Boolean askForPermission;
      public @NonNull Builder setAskForPermission(@NonNull Boolean setterArg) {
        this.askForPermission = setterArg;
        return this;
      }
      private @Nullable String rationaleMessageForPermissionRequest;
      public @NonNull Builder setRationaleMessageForPermissionRequest(@NonNull String setterArg) {
        this.rationaleMessageForPermissionRequest = setterArg;
        return this;
      }
      private @Nullable String rationaleMessageForGPSRequest;
      public @NonNull Builder setRationaleMessageForGPSRequest(@NonNull String setterArg) {
        this.rationaleMessageForGPSRequest = setterArg;
        return this;
      }
      private @Nullable Boolean useGooglePlayServices;
      public @NonNull Builder setUseGooglePlayServices(@NonNull Boolean setterArg) {
        this.useGooglePlayServices = setterArg;
        return this;
      }
      private @Nullable Boolean askForGooglePlayServices;
      public @NonNull Builder setAskForGooglePlayServices(@NonNull Boolean setterArg) {
        this.askForGooglePlayServices = setterArg;
        return this;
      }
      private @Nullable Boolean askForGPS;
      public @NonNull Builder setAskForGPS(@NonNull Boolean setterArg) {
        this.askForGPS = setterArg;
        return this;
      }
      private @Nullable Boolean fallbackToGPS;
      public @NonNull Builder setFallbackToGPS(@NonNull Boolean setterArg) {
        this.fallbackToGPS = setterArg;
        return this;
      }
      private @Nullable Boolean ignoreLastKnownPosition;
      public @NonNull Builder setIgnoreLastKnownPosition(@NonNull Boolean setterArg) {
        this.ignoreLastKnownPosition = setterArg;
        return this;
      }
      private @Nullable Double expirationDuration;
      public @NonNull Builder setExpirationDuration(@Nullable Double setterArg) {
        this.expirationDuration = setterArg;
        return this;
      }
      private @Nullable Double expirationTime;
      public @NonNull Builder setExpirationTime(@Nullable Double setterArg) {
        this.expirationTime = setterArg;
        return this;
      }
      private @Nullable Double fastestInterval;
      public @NonNull Builder setFastestInterval(@NonNull Double setterArg) {
        this.fastestInterval = setterArg;
        return this;
      }
      private @Nullable Double interval;
      public @NonNull Builder setInterval(@NonNull Double setterArg) {
        this.interval = setterArg;
        return this;
      }
      private @Nullable Double maxWaitTime;
      public @NonNull Builder setMaxWaitTime(@Nullable Double setterArg) {
        this.maxWaitTime = setterArg;
        return this;
      }
      private @Nullable Long numUpdates;
      public @NonNull Builder setNumUpdates(@Nullable Long setterArg) {
        this.numUpdates = setterArg;
        return this;
      }
      private @Nullable LocationAccuracy accuracy;
      public @NonNull Builder setAccuracy(@NonNull LocationAccuracy setterArg) {
        this.accuracy = setterArg;
        return this;
      }
      private @Nullable Double smallestDisplacement;
      public @NonNull Builder setSmallestDisplacement(@NonNull Double setterArg) {
        this.smallestDisplacement = setterArg;
        return this;
      }
      private @Nullable Boolean waitForAccurateLocation;
      public @NonNull Builder setWaitForAccurateLocation(@NonNull Boolean setterArg) {
        this.waitForAccurateLocation = setterArg;
        return this;
      }
      private @Nullable Double acceptableAccuracy;
      public @NonNull Builder setAcceptableAccuracy(@Nullable Double setterArg) {
        this.acceptableAccuracy = setterArg;
        return this;
      }
      public @NonNull LocationSettings build() {
        LocationSettings pigeonReturn = new LocationSettings();
        pigeonReturn.setAskForPermission(askForPermission);
        pigeonReturn.setRationaleMessageForPermissionRequest(rationaleMessageForPermissionRequest);
        pigeonReturn.setRationaleMessageForGPSRequest(rationaleMessageForGPSRequest);
        pigeonReturn.setUseGooglePlayServices(useGooglePlayServices);
        pigeonReturn.setAskForGooglePlayServices(askForGooglePlayServices);
        pigeonReturn.setAskForGPS(askForGPS);
        pigeonReturn.setFallbackToGPS(fallbackToGPS);
        pigeonReturn.setIgnoreLastKnownPosition(ignoreLastKnownPosition);
        pigeonReturn.setExpirationDuration(expirationDuration);
        pigeonReturn.setExpirationTime(expirationTime);
        pigeonReturn.setFastestInterval(fastestInterval);
        pigeonReturn.setInterval(interval);
        pigeonReturn.setMaxWaitTime(maxWaitTime);
        pigeonReturn.setNumUpdates(numUpdates);
        pigeonReturn.setAccuracy(accuracy);
        pigeonReturn.setSmallestDisplacement(smallestDisplacement);
        pigeonReturn.setWaitForAccurateLocation(waitForAccurateLocation);
        pigeonReturn.setAcceptableAccuracy(acceptableAccuracy);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("askForPermission", askForPermission);
      toMapResult.put("rationaleMessageForPermissionRequest", rationaleMessageForPermissionRequest);
      toMapResult.put("rationaleMessageForGPSRequest", rationaleMessageForGPSRequest);
      toMapResult.put("useGooglePlayServices", useGooglePlayServices);
      toMapResult.put("askForGooglePlayServices", askForGooglePlayServices);
      toMapResult.put("askForGPS", askForGPS);
      toMapResult.put("fallbackToGPS", fallbackToGPS);
      toMapResult.put("ignoreLastKnownPosition", ignoreLastKnownPosition);
      toMapResult.put("expirationDuration", expirationDuration);
      toMapResult.put("expirationTime", expirationTime);
      toMapResult.put("fastestInterval", fastestInterval);
      toMapResult.put("interval", interval);
      toMapResult.put("maxWaitTime", maxWaitTime);
      toMapResult.put("numUpdates", numUpdates);
      toMapResult.put("accuracy", accuracy == null ? null : accuracy.index);
      toMapResult.put("smallestDisplacement", smallestDisplacement);
      toMapResult.put("waitForAccurateLocation", waitForAccurateLocation);
      toMapResult.put("acceptableAccuracy", acceptableAccuracy);
      return toMapResult;
    }
    static @NonNull LocationSettings fromMap(@NonNull Map<String, Object> map) {
      LocationSettings pigeonResult = new LocationSettings();
      Object askForPermission = map.get("askForPermission");
      pigeonResult.setAskForPermission((Boolean)askForPermission);
      Object rationaleMessageForPermissionRequest = map.get("rationaleMessageForPermissionRequest");
      pigeonResult.setRationaleMessageForPermissionRequest((String)rationaleMessageForPermissionRequest);
      Object rationaleMessageForGPSRequest = map.get("rationaleMessageForGPSRequest");
      pigeonResult.setRationaleMessageForGPSRequest((String)rationaleMessageForGPSRequest);
      Object useGooglePlayServices = map.get("useGooglePlayServices");
      pigeonResult.setUseGooglePlayServices((Boolean)useGooglePlayServices);
      Object askForGooglePlayServices = map.get("askForGooglePlayServices");
      pigeonResult.setAskForGooglePlayServices((Boolean)askForGooglePlayServices);
      Object askForGPS = map.get("askForGPS");
      pigeonResult.setAskForGPS((Boolean)askForGPS);
      Object fallbackToGPS = map.get("fallbackToGPS");
      pigeonResult.setFallbackToGPS((Boolean)fallbackToGPS);
      Object ignoreLastKnownPosition = map.get("ignoreLastKnownPosition");
      pigeonResult.setIgnoreLastKnownPosition((Boolean)ignoreLastKnownPosition);
      Object expirationDuration = map.get("expirationDuration");
      pigeonResult.setExpirationDuration((Double)expirationDuration);
      Object expirationTime = map.get("expirationTime");
      pigeonResult.setExpirationTime((Double)expirationTime);
      Object fastestInterval = map.get("fastestInterval");
      pigeonResult.setFastestInterval((Double)fastestInterval);
      Object interval = map.get("interval");
      pigeonResult.setInterval((Double)interval);
      Object maxWaitTime = map.get("maxWaitTime");
      pigeonResult.setMaxWaitTime((Double)maxWaitTime);
      Object numUpdates = map.get("numUpdates");
      pigeonResult.setNumUpdates((numUpdates == null) ? null : ((numUpdates instanceof Integer) ? (Integer)numUpdates : (Long)numUpdates));
      Object accuracy = map.get("accuracy");
      pigeonResult.setAccuracy(accuracy == null ? null : LocationAccuracy.values()[(int)accuracy]);
      Object smallestDisplacement = map.get("smallestDisplacement");
      pigeonResult.setSmallestDisplacement((Double)smallestDisplacement);
      Object waitForAccurateLocation = map.get("waitForAccurateLocation");
      pigeonResult.setWaitForAccurateLocation((Boolean)waitForAccurateLocation);
      Object acceptableAccuracy = map.get("acceptableAccuracy");
      pigeonResult.setAcceptableAccuracy((Double)acceptableAccuracy);
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class LocationHostApiCodec extends StandardMessageCodec {
    public static final LocationHostApiCodec INSTANCE = new LocationHostApiCodec();
    private LocationHostApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return LocationData.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return LocationSettings.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return LocationSettings.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof LocationData) {
        stream.write(128);
        writeValue(stream, ((LocationData) value).toMap());
      } else 
      if (value instanceof LocationSettings) {
        stream.write(129);
        writeValue(stream, ((LocationSettings) value).toMap());
      } else 
      if (value instanceof LocationSettings) {
        stream.write(130);
        writeValue(stream, ((LocationSettings) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface LocationHostApi {
    void getLocation(@Nullable LocationSettings settings, Result<LocationData> result);
    @NonNull Boolean setLocationSettings(@NonNull LocationSettings settings);
    @NonNull Long getPermissionStatus();
    void requestPermission(Result<Long> result);
    @NonNull Boolean isGPSEnabled();
    @NonNull Boolean isNetworkEnabled();

    /** The codec used by LocationHostApi. */
    static MessageCodec<Object> getCodec() {
      return LocationHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `LocationHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, LocationHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.getLocation", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              LocationSettings settingsArg = (LocationSettings)args.get(0);
              Result<LocationData> resultCallback = new Result<LocationData>() {
                public void success(LocationData result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getLocation(settingsArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.setLocationSettings", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              LocationSettings settingsArg = (LocationSettings)args.get(0);
              if (settingsArg == null) {
                throw new NullPointerException("settingsArg unexpectedly null.");
              }
              Boolean output = api.setLocationSettings(settingsArg);
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.getPermissionStatus", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Long output = api.getPermissionStatus();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.requestPermission", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Long> resultCallback = new Result<Long>() {
                public void success(Long result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.requestPermission(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.isGPSEnabled", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Boolean output = api.isGPSEnabled();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.LocationHostApi.isNetworkEnabled", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Boolean output = api.isNetworkEnabled();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
