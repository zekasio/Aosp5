package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
class x extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c.e f1321a;
    private final AppLovinAdLoadListener b;

    x(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskResolveVastWrapper", pVar);
        this.b = appLovinAdLoadListener;
        this.f1321a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = com.applovin.impl.c.m.a(this.f1321a);
        if (StringUtils.isValidString(strA)) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Resolving VAST ad with depth " + this.f1321a.a() + " at " + strA);
            }
            try {
                this.f.M().a((a) new u<com.applovin.impl.sdk.utils.t>(com.applovin.impl.sdk.network.c.a(this.f).a(strA).b("GET").a(com.applovin.impl.sdk.utils.t.f1501a).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.eP)).intValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.eQ)).intValue()).c(false).a(), this.f) { // from class: com.applovin.impl.sdk.e.x.1
                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(com.applovin.impl.sdk.utils.t tVar, int i) {
                        this.f.M().a((a) r.a(tVar, x.this.f1321a, x.this.b, x.this.f));
                    }

                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(int i, String str, com.applovin.impl.sdk.utils.t tVar) {
                        com.applovin.impl.sdk.y yVar2 = this.h;
                        if (com.applovin.impl.sdk.y.a()) {
                            this.h.e(this.g, "Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        x.this.a(i);
                    }
                });
                return;
            } catch (Throwable th) {
                com.applovin.impl.sdk.y yVar2 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        com.applovin.impl.sdk.y yVar3 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        com.applovin.impl.c.m.a(this.f1321a, this.b, i == -1001 ? com.applovin.impl.c.f.TIMED_OUT : com.applovin.impl.c.f.GENERAL_WRAPPER_ERROR, i, this.f);
    }
}
