package com.tapjoy;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyAdIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1717a;
    public String b;
    public boolean c;

    public TapjoyAdIdClient(Context context) {
        this.f1717a = context;
    }

    public String getAdvertisingId() {
        return this.b;
    }

    public boolean isAdTrackingEnabled() {
        return this.c;
    }

    public boolean setupAdIdInfo() {
        try {
            this.b = AdvertisingIdClient.getAdvertisingIdInfo(this.f1717a).getId();
            this.c = !r1.isLimitAdTrackingEnabled();
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean setupAdIdInfoReflection() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = cls.getMethod("getAdvertisingIdInfo", Context.class);
            TapjoyLog.d("TapjoyAdIdClient", "Found method: " + method);
            Object objInvoke = method.invoke(cls, this.f1717a);
            Method method2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null);
            Method method3 = objInvoke.getClass().getMethod("getId", null);
            this.c = !((Boolean) method2.invoke(objInvoke, null)).booleanValue();
            this.b = (String) method3.invoke(objInvoke, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
