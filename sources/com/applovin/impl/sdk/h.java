package com.applovin.impl.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1330a = (int) TimeUnit.SECONDS.toMillis(30);
    private static final h m = new h();
    private Handler c;
    private Handler e;
    private p h;
    private Thread i;
    private final AtomicLong b = new AtomicLong(0);
    private final HandlerThread d = new HandlerThread("applovin-anr-detector");
    private final AtomicBoolean f = new AtomicBoolean();
    private final AtomicBoolean g = new AtomicBoolean();
    private long j = TimeUnit.SECONDS.toMillis(4);
    private long k = TimeUnit.SECONDS.toMillis(3);
    private long l = TimeUnit.SECONDS.toMillis(3);

    private h() {
    }

    private void b(p pVar) {
        if (this.g.compareAndSet(false, true)) {
            this.h = pVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1
                @Override // java.lang.Runnable
                public void run() {
                    h.this.i = Thread.currentThread();
                }
            });
            this.j = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fC)).longValue();
            this.k = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fD)).longValue();
            this.l = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fE)).longValue();
            this.c = new Handler(p.y().getMainLooper());
            this.d.start();
            this.c.post(new b());
            Handler handler = new Handler(this.d.getLooper());
            this.e = handler;
            handler.postDelayed(new a(), this.l / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.g.get()) {
            this.f.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c().openConnection();
            int i = f1330a;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            Log.d("applovin-anr-detector", "ANR reported with code " + httpURLConnection.getResponseCode());
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    private URL c() {
        String packageName;
        PackageInfo packageInfo;
        String creativeId;
        String networkName;
        PackageManager packageManager;
        String str = "";
        Context contextY = p.y();
        try {
            packageManager = contextY.getPackageManager();
            packageName = contextY.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        try {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        try {
            Object objC = this.h.Z().c();
            String str2 = "None";
            if (objC instanceof com.applovin.impl.sdk.ad.e) {
                networkName = "AppLovin";
                creativeId = Long.toString(((com.applovin.impl.sdk.ad.e) objC).getAdIdNumber());
            } else if (objC instanceof com.applovin.impl.mediation.a.a) {
                com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) objC;
                networkName = aVar.getNetworkName();
                creativeId = aVar.getCreativeId();
            } else {
                creativeId = "None";
                networkName = creativeId;
            }
            Thread thread = this.i;
            if (thread != null && thread.getStackTrace().length > 0) {
                StackTraceElement stackTraceElement = this.i.getStackTrace()[0];
                str2 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.h.a(com.applovin.impl.sdk.c.b.bn));
            sb.append("?type=anr&platform=android&package_name=");
            sb.append(a(packageName));
            sb.append("&applovin_random_token=");
            sb.append(a(this.h.q()));
            sb.append("&compass_random_token=");
            sb.append(a(this.h.p()));
            sb.append("&model=");
            sb.append(a(Build.MODEL));
            sb.append("&brand=");
            sb.append(a(Build.MANUFACTURER));
            sb.append("&brand_name=");
            sb.append(a(Build.BRAND));
            sb.append("&hardware=");
            sb.append(a(Build.HARDWARE));
            sb.append("&revision=");
            sb.append(a(Build.DEVICE));
            sb.append("&app_version=");
            if (packageInfo != null) {
                str = packageInfo.versionName;
            }
            sb.append(a(str));
            sb.append("&app_version_code=");
            sb.append(packageInfo != null ? packageInfo.versionCode : 0);
            sb.append("&os=");
            sb.append(a(Build.VERSION.RELEASE));
            sb.append("&api_level=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("&sdk_version=");
            sb.append(a(AppLovinSdk.VERSION));
            sb.append("&fs_ad_network=");
            sb.append(a(networkName));
            sb.append("&fs_ad_creative_id=");
            sb.append(a(creativeId));
            sb.append("&top_main_method=");
            sb.append(a(str2));
            sb.append("&aei=");
            sb.append(this.h.a(com.applovin.impl.sdk.c.b.ax));
            sb.append("&mei=");
            sb.append(this.h.a(com.applovin.impl.sdk.c.b.ay));
            return new URL(sb.toString());
        } catch (MalformedURLException unused3) {
            return null;
        }
    }

    public static void a(p pVar) {
        if (pVar != null) {
            if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fB)).booleanValue() && !Utils.isPubInDebugMode(p.y(), pVar)) {
                m.b(pVar);
            } else {
                m.a();
            }
        }
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f.get()) {
                return;
            }
            h.this.b.set(System.currentTimeMillis());
            h.this.c.postDelayed(this, h.this.k);
        }
    }

    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.b.get();
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > h.this.j) {
                h.this.a();
                h.this.b();
            }
            h.this.e.postDelayed(this, h.this.l);
        }
    }
}
