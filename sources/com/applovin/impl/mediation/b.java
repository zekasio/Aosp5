package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b implements a.InterfaceC0057a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f973a;
    private final c b;
    private final MaxAdListener c;

    public b(p pVar, MaxAdListener maxAdListener) {
        this.c = maxAdListener;
        this.f973a = new a(pVar);
        this.b = new c(pVar, this);
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long jD = cVar.D();
        if (jD >= 0) {
            this.b.a(cVar, jD);
        }
        if (cVar.E()) {
            this.f973a.a(cVar, this);
        }
    }

    public void a(MaxAd maxAd) {
        this.b.a();
        this.f973a.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.c.onAdHidden(cVar);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0057a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.onAdHidden(cVar);
            }
        }, cVar.F());
    }
}
