package com.applovin.impl.sdk;

import com.applovin.impl.sdk.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1260a;
    private final WeakReference<com.applovin.impl.sdk.ad.g> b;
    private final WeakReference<d.a> c;
    private com.applovin.impl.sdk.utils.p d;

    public static c a(com.applovin.impl.sdk.ad.g gVar, d.a aVar, p pVar) {
        c cVar = new c(gVar, aVar, pVar);
        cVar.a(gVar.Q());
        return cVar;
    }

    private c(com.applovin.impl.sdk.ad.g gVar, d.a aVar, p pVar) {
        this.b = new WeakReference<>(gVar);
        this.c = new WeakReference<>(aVar);
        this.f1260a = pVar;
    }

    public com.applovin.impl.sdk.ad.g a() {
        return this.b.get();
    }

    public void a(long j) {
        b();
        if (((Boolean) this.f1260a.a(com.applovin.impl.sdk.c.b.bG)).booleanValue() || !this.f1260a.Y().isApplicationPaused()) {
            this.d = com.applovin.impl.sdk.utils.p.a(j, this.f1260a, new Runnable() { // from class: com.applovin.impl.sdk.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.c();
                    c.this.f1260a.V().a(c.this);
                }
            });
        }
    }

    public void b() {
        com.applovin.impl.sdk.utils.p pVar = this.d;
        if (pVar != null) {
            pVar.d();
            this.d = null;
        }
    }

    public void c() {
        b();
        com.applovin.impl.sdk.ad.g gVarA = a();
        if (gVarA == null) {
            return;
        }
        gVarA.S();
        d.a aVar = this.c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(gVarA);
    }
}
