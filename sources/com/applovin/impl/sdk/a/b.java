package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f1194a;
    protected final p b;
    protected final y c;
    protected final String d;
    protected boolean e;
    protected AdSession f;
    protected AdEvents g;

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    protected void a(AdSession adSession) {
    }

    public b(AppLovinAdBase appLovinAdBase) {
        this.f1194a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.c = appLovinAdBase.getSdk().L();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.d = str;
    }

    public void b() {
        b(null);
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext adSessionContextA;
                if (!b.this.f1194a.isOpenMeasurementEnabled()) {
                    y yVar = b.this.c;
                    if (y.a()) {
                        b.this.c.c(b.this.d, "Skip starting session - Open Measurement disabled");
                        return;
                    }
                    return;
                }
                if (b.this.f != null) {
                    y yVar2 = b.this.c;
                    if (y.a()) {
                        b.this.c.d(b.this.d, "Attempting to start session again for ad: " + b.this.f1194a);
                        return;
                    }
                    return;
                }
                y yVar3 = b.this.c;
                if (y.a()) {
                    b.this.c.b(b.this.d, "Starting session");
                }
                AdSessionConfiguration adSessionConfigurationA = b.this.a();
                if (adSessionConfigurationA == null || (adSessionContextA = b.this.a(webView)) == null) {
                    return;
                }
                try {
                    b.this.f = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
                    try {
                        b bVar = b.this;
                        bVar.g = AdEvents.createAdEvents(bVar.f);
                        b bVar2 = b.this;
                        bVar2.a(bVar2.f);
                        b.this.f.start();
                        b.this.e = true;
                        y yVar4 = b.this.c;
                        if (y.a()) {
                            b.this.c.b(b.this.d, "Session started");
                        }
                    } catch (Throwable th) {
                        y yVar5 = b.this.c;
                        if (y.a()) {
                            b.this.c.b(b.this.d, "Failed to create ad events", th);
                        }
                    }
                } catch (Throwable th2) {
                    y yVar6 = b.this.c;
                    if (y.a()) {
                        b.this.c.b(b.this.d, "Failed to create session", th2);
                    }
                }
            }
        });
    }

    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.g.impressionOccurred();
            }
        });
    }

    public void a(View view) {
        a(view, Collections.emptyList());
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.f.registerAdView(view);
                b.this.f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            y yVar = b.this.c;
                            if (y.a()) {
                                b.this.c.b(b.this.d, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.f.error(ErrorType.VIDEO, str);
            }
        });
    }

    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                b.this.e = false;
                b.this.f.finish();
                b.this.f = null;
                b.this.g = null;
            }
        });
    }

    protected void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.e) {
                        y yVar = b.this.c;
                        if (y.a()) {
                            b.this.c.b(b.this.d, "Running operation: " + str);
                        }
                        runnable.run();
                    }
                } catch (Throwable th) {
                    y yVar2 = b.this.c;
                    if (y.a()) {
                        b.this.c.b(b.this.d, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }
}
