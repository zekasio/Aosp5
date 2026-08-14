package com.applovin.impl.sdk;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WebView f1241a;
    private static String b;
    private static final Object c = new Object();
    private static final AtomicBoolean d = new AtomicBoolean();

    public static void a(p pVar) {
    }

    static {
        if (b()) {
            b = (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.L, "", p.y());
            return;
        }
        b = "";
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, (Object) null, p.y());
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, (Object) null, p.y());
    }

    public static void b(final p pVar) {
        if (b() || d.getAndSet(true)) {
            return;
        }
        if (com.applovin.impl.sdk.utils.h.b()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.af.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        synchronized (af.c) {
                            String unused = af.b = WebSettings.getDefaultUserAgent(p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, af.b, p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, Build.VERSION.RELEASE, p.y());
                        }
                    } catch (Throwable th) {
                        pVar.L();
                        if (y.a()) {
                            pVar.L().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.af.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        af.a(pVar);
                        synchronized (af.c) {
                            String unused = af.b = af.f1241a.getSettings().getUserAgentString();
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.L, af.b, p.y());
                            com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.M, Build.VERSION.RELEASE, p.y());
                        }
                    } catch (Throwable th) {
                        pVar.L();
                        if (y.a()) {
                            pVar.L().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }

    public static String a() {
        String str;
        synchronized (c) {
            str = b;
        }
        return str;
    }

    public static boolean b() {
        boolean zEquals;
        synchronized (c) {
            zEquals = Build.VERSION.RELEASE.equals((String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.M, "", p.y()));
        }
        return zEquals;
    }
}
