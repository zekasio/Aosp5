package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.af;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f1298a;

    public n(com.applovin.impl.sdk.p pVar) {
        super("TaskInitializeSdk", pVar);
        this.f1298a = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.y yVar;
        String str2;
        StringBuilder sb;
        str = "succeeded";
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f1298a.P().d();
            this.f1298a.P().c(com.applovin.impl.sdk.d.f.e);
            this.f1298a.P().c(com.applovin.impl.sdk.d.f.f);
            this.f1298a.W().a(f());
            this.f1298a.W().b(f());
            this.f1298a.M().a(new b(this.f1298a), o.a.MAIN);
            if (this.f1298a.S() != null) {
                this.f1298a.S().c();
            } else {
                this.f1298a.R().e();
            }
            this.f1298a.ac().a();
            this.f1298a.af().a();
            if (Utils.isPubInDebugMode(f(), this.f1298a)) {
                this.f1298a.i();
            }
            this.f1298a.ai().collectAppHubData();
            b();
            if (((Boolean) this.f1298a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.n.1
                    @Override // java.lang.Runnable
                    public void run() {
                        af.a(n.this.f1298a);
                    }
                });
            }
            a();
            this.f1298a.a(true);
            this.f1298a.al().c();
            this.f1298a.G().maybeTrackAppOpenEvent();
            if ((this.f1298a.as().b() && !this.f1298a.e()) || (((Boolean) this.f1298a.a(com.applovin.impl.sdk.c.a.h)).booleanValue() && Utils.isPubInDebugMode(com.applovin.impl.sdk.p.y(), this.f1298a) && this.f1298a.f())) {
                this.f1298a.as().a();
            }
            this.f1298a.ag().a();
            if (((Boolean) this.f1298a.a(com.applovin.impl.sdk.c.b.aM)).booleanValue()) {
                this.f1298a.a(((Long) this.f1298a.a(com.applovin.impl.sdk.c.b.aN)).longValue());
            }
            com.applovin.impl.sdk.y yVar3 = this.h;
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.y.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f1298a.a(false);
                this.f1298a.ag().a();
                if (((Boolean) this.f1298a.a(com.applovin.impl.sdk.c.b.aM)).booleanValue()) {
                    this.f1298a.a(((Long) this.f1298a.a(com.applovin.impl.sdk.c.b.aN)).longValue());
                }
                com.applovin.impl.sdk.y yVar4 = this.h;
                if (!com.applovin.impl.sdk.y.a()) {
                    return;
                }
                yVar = this.h;
                str2 = this.g;
                sb = new StringBuilder("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (!this.f1298a.d()) {
                }
            } catch (Throwable th2) {
                this.f1298a.ag().a();
                if (((Boolean) this.f1298a.a(com.applovin.impl.sdk.c.b.aM)).booleanValue()) {
                    this.f1298a.a(((Long) this.f1298a.a(com.applovin.impl.sdk.c.b.aN)).longValue());
                }
                com.applovin.impl.sdk.y yVar5 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVar6 = this.h;
                    String str3 = this.g;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.f1298a.d() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append("ms");
                    yVar6.b(str3, sb2.toString());
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.y.a()) {
            yVar = this.h;
            str2 = this.g;
            sb = new StringBuilder("AppLovin SDK ");
            sb.append(AppLovinSdk.VERSION);
            sb.append(" initialization ");
            if (!this.f1298a.d()) {
                str = "failed";
            }
            sb.append(str);
            sb.append(" in ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            yVar.b(str2, sb.toString());
        }
    }

    private void a() {
        if (this.f1298a.ao().a()) {
            return;
        }
        Activity activityX = this.f1298a.x();
        if (activityX != null) {
            this.f1298a.ao().a(activityX);
        } else {
            this.f1298a.M().a(new z(this.f1298a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f1298a.ao().a(n.this.f1298a.w().a());
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void b() {
        Map<String, Object> mapD;
        Map<String, Object> mapC;
        if (this.f1298a.e()) {
            return;
        }
        boolean zD = this.f1298a.N().d();
        String str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.f1298a.S() != null) {
            if (zD) {
                str = this.f1298a.Q().d().b() + " (use this for test devices)";
            }
            mapD = this.f1298a.S().b();
            mapC = this.f1298a.S().g();
        } else {
            if (zD) {
                str = this.f1298a.R().k().b() + " (use this for test devices)";
            }
            mapD = this.f1298a.R().d();
            mapC = this.f1298a.R().c();
        }
        com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
        lVar.a().a("=====AppLovin SDK=====");
        lVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f1298a.a(com.applovin.impl.sdk.c.b.dU)).a("Ad Review Version", com.applovin.impl.sdk.g.a()).a("OM SDK Version", this.f1298a.ag().c());
        lVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a("GAID", str).a("Model", mapD.get("model")).a("Locale", mapD.get("locale")).a("Emulator", mapD.get("sim")).a("Tablet", mapD.get("is_tablet"));
        lVar.a("===App Info===").a("Application ID", mapC.get("package_name")).a("Target SDK", mapC.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.getExoPlayerVersionCode()));
        lVar.a("===SDK Settings===").a("SDK Key", this.f1298a.B()).a("Mediation Provider", this.f1298a.s()).a("TG", com.applovin.impl.sdk.utils.q.a(this.f1298a)).a("AEI", this.f1298a.a(com.applovin.impl.sdk.c.b.ax)).a("MEI", this.f1298a.a(com.applovin.impl.sdk.c.b.ay)).a("Test Mode On", Boolean.valueOf(this.f1298a.av().a())).a("Verbose Logging On", Boolean.valueOf(zD));
        lVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.b.a.a(f()));
        com.applovin.impl.b.a.b bVarAe = this.f1298a.ae();
        lVar.a("===Max Terms Flow===").a("Enabled", Boolean.valueOf(bVarAe.b())).a("Privacy Policy URI", bVarAe.d()).a("Terms of Service URI", bVarAe.e());
        lVar.a();
        com.applovin.impl.sdk.y.f("AppLovinSdk", lVar.toString());
    }
}
