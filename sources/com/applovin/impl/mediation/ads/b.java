package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class b implements ad.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f972a;
    private final d b;
    private final ad c;
    private final ac d;
    private final a.InterfaceC0058a e;

    public b(d dVar, ViewGroup viewGroup, a.InterfaceC0058a interfaceC0058a, p pVar) {
        this.f972a = pVar;
        this.b = dVar;
        this.e = interfaceC0058a;
        this.d = new ac(viewGroup, pVar);
        ad adVar = new ad(viewGroup, pVar, this);
        this.c = adVar;
        adVar.a(dVar);
        pVar.L();
        if (y.a()) {
            pVar.L().b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.c.a();
    }

    public void b() {
        this.f972a.L();
        if (y.a()) {
            this.f972a.L().b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.H().compareAndSet(false, true)) {
            this.f972a.L();
            if (y.a()) {
                this.f972a.L().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                y.i("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else if (this.f972a.V() != null) {
                this.f972a.V().a(this.b);
            } else {
                this.b.K();
            }
            this.f972a.ap().processRawAdImpressionPostback(this.b, this.e);
        }
    }

    public d c() {
        return this.b;
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.I().compareAndSet(false, true)) {
            this.f972a.L();
            if (y.a()) {
                this.f972a.L().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f972a.ap().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }
}
