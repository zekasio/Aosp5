package com.applovin.impl.sdk;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.measurement.AppMeasurement;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f1436a;
    protected final y b;

    public enum a {
        BLACK_VIEW("black_view"),
        CRASH(AppMeasurement.CRASH_ORIGIN);

        private final String c;

        a(String str) {
            this.c = str;
        }

        public String a() {
            return this.c;
        }
    }

    public t(p pVar) {
        this.f1436a = pVar;
        this.b = pVar.L();
    }

    public void a(a aVar, Map<String, String> map) {
        if (y.a()) {
            this.b.b("ErrorReporter", "Reporting " + aVar.a() + " error...");
        }
        this.f1436a.al().a(com.applovin.impl.sdk.network.j.o().c("https://ms.applovin.com/1.0/sdk/error").a(false).b("POST").a(a(aVar.a(), map)).a());
    }

    private Map<String, String> a(String str, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put(TapjoyAuctionFlags.AUCTION_TYPE, str);
        if (this.f1436a.S() != null) {
            map2.put(TapjoyConstants.TJC_PLATFORM, this.f1436a.Q().v());
        } else {
            map2.put(TapjoyConstants.TJC_PLATFORM, this.f1436a.R().f());
        }
        map2.put("applovin_random_token", this.f1436a.q());
        map2.put("compass_random_token", this.f1436a.p());
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        map2.put("aei", String.valueOf(this.f1436a.a(com.applovin.impl.sdk.c.b.ax)));
        map2.put("mei", String.valueOf(this.f1436a.a(com.applovin.impl.sdk.c.b.ay)));
        a(map2);
        b(map2);
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    private void a(Map<String, String> map) {
        PackageInfo packageInfo;
        try {
            packageInfo = p.y().getPackageManager().getPackageInfo(p.y().getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        map.put(TapjoyConstants.TJC_APP_VERSION_NAME, packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfo != null ? packageInfo.versionCode : 0));
    }

    private void b(Map<String, String> map) {
        Object objC = this.f1436a.Z().c();
        if (objC instanceof com.applovin.impl.sdk.ad.e) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.e) objC).getAdIdNumber()));
        } else if (objC instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) objC;
            map.put("fs_ad_network", aVar.getNetworkName());
            map.put("fs_ad_creative_id", aVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }
}
