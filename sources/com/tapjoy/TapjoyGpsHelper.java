package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.internal.w1;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyGpsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1729a;
    public String b;
    public boolean c;
    public int d = 0;
    public int e = 0;
    public boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;

    public TapjoyGpsHelper(Context context) {
        this.f1729a = context;
    }

    public void checkGooglePlayIntegration() throws TapjoyIntegrationException {
        if (!isGooglePlayServicesAvailable()) {
            throw new TapjoyIntegrationException("Tapjoy SDK is disabled because Google Play Services was not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
        if (!isGooglePlayManifestConfigured()) {
            throw new TapjoyIntegrationException("Failed to load manifest.xml meta-data, 'com.google.android.gms.version' not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
    }

    public String getAdvertisingId() {
        return this.b;
    }

    public int getDeviceGooglePlayServicesVersion() {
        return this.d;
    }

    public int getPackagedGooglePlayServicesVersion() {
        return this.e;
    }

    public boolean isAdIdAvailable() {
        return this.f;
    }

    public boolean isAdTrackingEnabled() {
        return this.c;
    }

    public boolean isAdvertisingIdAllowed() {
        SharedPreferences sharedPreferences = this.f1729a.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        if (!sharedPreferences.contains(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID)) {
            return true;
        }
        this.i = Boolean.valueOf(sharedPreferences.getBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, false));
        return !r0.booleanValue();
    }

    public boolean isGooglePlayManifestConfigured() {
        if (this.h == null) {
            try {
                this.e = this.f1729a.getPackageManager().getApplicationInfo(this.f1729a.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
                this.h = true;
            } catch (Exception unused) {
                this.h = false;
            }
        }
        return this.h.booleanValue();
    }

    public boolean isGooglePlayServicesAvailable() {
        if (this.g == null) {
            try {
                this.f1729a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.g = true;
            } catch (Error unused) {
                this.g = false;
            } catch (Exception unused2) {
                this.g = false;
            }
        }
        return this.g.booleanValue();
    }

    public void loadAdvertisingId(boolean z) {
        TapjoyLog.i("TapjoyGpsHelper", "Looking for Google Play Services...");
        if (!isGooglePlayServicesAvailable() || !isGooglePlayManifestConfigured()) {
            TapjoyLog.i("TapjoyGpsHelper", "Google Play Services not found");
            return;
        }
        TapjoyLog.i("TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
        TapjoyLog.i("TapjoyGpsHelper", "Packaged Google Play Services version: " + this.e);
        TapjoyAdIdClient tapjoyAdIdClient = new TapjoyAdIdClient(this.f1729a);
        if (isAdvertisingIdAllowed()) {
            this.f = tapjoyAdIdClient.setupAdIdInfo();
        } else {
            this.f = false;
        }
        try {
            this.d = this.f1729a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            TapjoyLog.i("TapjoyGpsHelper", "Device's Google Play Services version: " + this.d);
        } catch (Exception unused) {
            TapjoyLog.i("TapjoyGpsHelper", "Error getting device's Google Play Services version");
        }
        if (this.f) {
            this.c = tapjoyAdIdClient.isAdTrackingEnabled();
            this.b = tapjoyAdIdClient.getAdvertisingId();
            StringBuilder sbA = w1.a("Found advertising ID: ");
            sbA.append(this.b);
            TapjoyLog.i("TapjoyGpsHelper", sbA.toString());
            TapjoyLog.i("TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.c));
            return;
        }
        TapjoyLog.i("TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
        if (z) {
            this.c = false;
            if (isAdvertisingIdAllowed()) {
                this.b = "00000000-0000-0000-0000-000000000000";
                this.f = true;
            } else {
                resetAdvertisingID();
                this.f = false;
            }
        }
    }

    public void resetAdvertisingID() {
        this.b = "";
    }
}
