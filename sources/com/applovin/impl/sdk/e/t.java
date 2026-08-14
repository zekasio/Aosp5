package com.applovin.impl.sdk.e;

import com.applovin.impl.c.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
class t extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f1316a;
    private final AppLovinAdLoadListener b;

    t(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskRenderVastAd", pVar);
        this.b = appLovinAdLoadListener;
        this.f1316a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Rendering VAST ad...");
        }
        int size = this.f1316a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        com.applovin.impl.c.j jVarA = null;
        com.applovin.impl.c.n nVarA = null;
        com.applovin.impl.c.d dVarA = null;
        com.applovin.impl.c.c cVarA = null;
        String strA2 = "";
        for (com.applovin.impl.sdk.utils.t tVar : this.f1316a.b()) {
            com.applovin.impl.sdk.utils.t tVarC = tVar.c(com.applovin.impl.c.m.a(tVar) ? "Wrapper" : "InLine");
            if (tVarC != null) {
                com.applovin.impl.sdk.utils.t tVarC2 = tVarC.c("AdSystem");
                if (tVarC2 != null) {
                    jVarA = com.applovin.impl.c.j.a(tVarC2, jVarA, this.f);
                }
                strA = com.applovin.impl.c.m.a(tVarC, "AdTitle", strA);
                strA2 = com.applovin.impl.c.m.a(tVarC, "Description", strA2);
                com.applovin.impl.c.m.a(tVarC.a("Impression"), hashSet, this.f1316a, this.f);
                com.applovin.impl.sdk.utils.t tVarB = tVarC.b("ViewableImpression");
                if (tVarB != null) {
                    com.applovin.impl.c.m.a(tVarB.a("Viewable"), hashSet, this.f1316a, this.f);
                }
                com.applovin.impl.sdk.utils.t tVarC3 = tVarC.c("AdVerifications");
                if (tVarC3 != null) {
                    cVarA = com.applovin.impl.c.c.a(tVarC3, cVarA, this.f1316a, this.f);
                }
                com.applovin.impl.c.m.a(tVarC.a("Error"), hashSet2, this.f1316a, this.f);
                com.applovin.impl.sdk.utils.t tVarB2 = tVarC.b("Creatives");
                if (tVarB2 != null) {
                    for (com.applovin.impl.sdk.utils.t tVar2 : tVarB2.d()) {
                        com.applovin.impl.sdk.utils.t tVarB3 = tVar2.b("Linear");
                        if (tVarB3 != null) {
                            nVarA = com.applovin.impl.c.n.a(tVarB3, nVarA, this.f1316a, this.f);
                        } else {
                            com.applovin.impl.sdk.utils.t tVarC4 = tVar2.c("CompanionAds");
                            if (tVarC4 != null) {
                                com.applovin.impl.sdk.utils.t tVarC5 = tVarC4.c("Companion");
                                if (tVarC5 != null) {
                                    dVarA = com.applovin.impl.c.d.a(tVarC5, dVarA, this.f1316a, this.f);
                                }
                            } else {
                                com.applovin.impl.sdk.y yVar2 = this.h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.h.e(this.g, "Received and will skip rendering for an unidentified creative: " + tVar2);
                                }
                            }
                        }
                    }
                }
            } else {
                com.applovin.impl.sdk.y yVar3 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Did not find wrapper or inline response for node: " + tVar);
                }
            }
        }
        com.applovin.impl.c.a aVarA = new a.C0056a().a(this.f).a(this.f1316a.c()).b(this.f1316a.d()).a(this.f1316a.e()).a(this.f1316a.f()).a(strA).b(strA2).a(jVarA).a(nVarA).a(dVarA).a(cVarA).a(hashSet).a(cVarA).b(hashSet2).a();
        com.applovin.impl.c.f fVarA = com.applovin.impl.c.m.a(aVarA);
        if (fVarA == null) {
            com.applovin.impl.sdk.y yVar4 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Finished rendering VAST ad: " + aVarA);
            }
            aVarA.o().b();
            e eVar = new e(aVarA, this.f, this.b);
            o.a aVar = o.a.CACHING_OTHER;
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.bw)).booleanValue()) {
                if (aVarA.getType() == AppLovinAdType.REGULAR) {
                    aVar = o.a.CACHING_INTERSTITIAL;
                } else if (aVarA.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = o.a.CACHING_INCENTIVIZED;
                } else if (aVarA.getType() == AppLovinAdType.NATIVE) {
                    aVar = o.a.CACHING_NATIVE;
                }
            }
            this.f.M().a(eVar, aVar);
            return;
        }
        com.applovin.impl.c.m.a(this.f1316a, this.b, fVarA, -6, this.f);
    }
}
