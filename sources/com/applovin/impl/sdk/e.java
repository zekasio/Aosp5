package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1279a;
    private final y b;
    private final Map<com.applovin.impl.sdk.ad.d, aa> d = CollectionUtils.map();
    private final Map<com.applovin.impl.sdk.ad.d, aa> e = CollectionUtils.map();
    private final Object c = new Object();

    e(p pVar) {
        this.f1279a = pVar;
        this.b = pVar.L();
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.f()) {
            this.d.put(dVar, new aa());
            this.e.put(dVar, new aa());
        }
    }

    public AppLovinAdImpl a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.f fVar;
        synchronized (this.c) {
            aa aaVarD = d(dVar);
            if (aaVarD.a() > 0) {
                e(dVar).a(aaVarD.c());
                fVar = new com.applovin.impl.sdk.ad.f(dVar, this.f1279a);
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            if (y.a()) {
                this.b.b("AdPreloadManager", "Retrieved ad of zone " + dVar + "...");
            }
        } else if (y.a()) {
            this.b.b("AdPreloadManager", "Unable to retrieve ad of zone " + dVar + "...");
        }
        return fVar;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (y.a()) {
                this.b.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public AppLovinAdImpl b(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplC;
        synchronized (this.c) {
            appLovinAdImplC = f(dVar).c();
        }
        return appLovinAdImplC;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.c) {
            appLovinAdImplD = f(dVar).d();
        }
        return appLovinAdImplD;
    }

    private aa d(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.c) {
            aaVar = this.d.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.d.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa e(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.c) {
            aaVar = this.e.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.e.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa f(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.c) {
            aa aaVarE = e(dVar);
            if (aaVarE.a() > 0) {
                return aaVarE;
            }
            return d(dVar);
        }
    }
}
