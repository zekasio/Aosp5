package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1509a;
    private final LocationManager b = (LocationManager) p.y().getSystemService(FirebaseAnalytics.Param.LOCATION);
    private double c;
    private double d;
    private long e;

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    x(p pVar) {
        this.f1509a = pVar;
    }

    public boolean a() {
        return com.applovin.impl.sdk.utils.h.a("android.permission.ACCESS_COARSE_LOCATION", p.y());
    }

    public boolean b() {
        if (com.applovin.impl.sdk.utils.h.h()) {
            return this.b.isLocationEnabled();
        }
        return (com.applovin.impl.sdk.utils.h.c() && Settings.Secure.getInt(p.y().getContentResolver(), "location_mode", 0) == 0) ? false : true;
    }

    public boolean c() {
        if (this.f1509a.C().isLocationCollectionEnabled() && ((Boolean) this.f1509a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue() && a()) {
            return f() || this.e != 0;
        }
        return false;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f1509a.a(com.applovin.impl.sdk.c.b.ez)).longValue());
        if (this.e != 0 && System.currentTimeMillis() - this.e < millis) {
            return false;
        }
        Location locationA = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (locationA == null) {
            locationA = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (locationA == null) {
            return false;
        }
        this.c = locationA.getLatitude();
        this.d = locationA.getLongitude();
        this.e = System.currentTimeMillis();
        return true;
    }

    private Location a(String str, String str2) {
        if (!com.applovin.impl.sdk.utils.h.a(str2, p.y())) {
            return null;
        }
        try {
            return this.b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e) {
            this.f1509a.L();
            if (y.a()) {
                this.f1509a.L().b("LocationManager", "Failed to retrieve location from " + str + ": device does not support this location provider.", e);
            }
            return null;
        } catch (NullPointerException e2) {
            this.f1509a.L();
            if (y.a()) {
                this.f1509a.L().b("LocationManager", "Failed to retrieve location from " + str + ": location provider is not available.", e2);
            }
            return null;
        } catch (SecurityException e3) {
            this.f1509a.L();
            if (y.a()) {
                this.f1509a.L().b("LocationManager", "Failed to retrieve location from " + str + ": access denied.", e3);
            }
            return null;
        } catch (Throwable th) {
            this.f1509a.L();
            if (y.a()) {
                this.f1509a.L().b("LocationManager", "Failed to retrieve location from " + str + ".", th);
            }
            return null;
        }
    }
}
