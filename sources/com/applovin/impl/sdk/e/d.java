package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    private final com.applovin.impl.sdk.ad.a b;
    private boolean c;
    private boolean d;

    public d(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, pVar, appLovinAdLoadListener);
        this.b = aVar;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public void c(boolean z) {
        this.d = z;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean zF = this.b.f();
        boolean z = this.d;
        if (zF || z) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Begin caching for streaming ad #" + this.b.getAdIdNumber() + "...");
            }
            c();
            if (zF) {
                if (this.c) {
                    i();
                }
                j();
                if (!this.c) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        } else {
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Begin processing for non-streaming ad #" + this.b.getAdIdNumber() + "...");
            }
            c();
            j();
            k();
            i();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.b.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.b, this.f);
        com.applovin.impl.sdk.d.d.a(jCurrentTimeMillis, this.b, this.f);
        a(this.b);
        a();
    }

    private void j() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Caching HTML resources...");
        }
        String strA = a(this.b.b(), this.b.I(), this.b);
        if (this.b.q() && this.b.isOpenMeasurementEnabled()) {
            strA = this.f.ag().a(strA);
        }
        this.b.a(strA);
        this.b.a(true);
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Finish caching non-video resources for ad #" + this.b.getAdIdNumber());
        }
        this.h.a(this.g, "Ad updated with cachedHTML = " + this.b.b());
    }

    private void k() {
        Uri uriA;
        if (b() || (uriA = a(this.b.i())) == null) {
            return;
        }
        if (this.b.aM()) {
            this.b.a(this.b.b().replaceFirst(this.b.e(), uriA.toString()));
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.b.g();
        this.b.a(uriA);
    }
}
