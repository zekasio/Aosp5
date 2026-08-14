package com.applovin.impl.mediation;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f985a;
    private final y b;
    private final a c;
    private com.applovin.impl.sdk.utils.f d;

    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    c(p pVar, a aVar) {
        this.f985a = pVar;
        this.b = pVar.L();
        this.c = aVar;
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j) {
        if (y.a()) {
            this.b.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = com.applovin.impl.sdk.utils.f.a(j, this.f985a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = c.this.b;
                if (y.a()) {
                    c.this.b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                c.this.c.c(cVar);
            }
        });
    }

    public void a() {
        if (y.a()) {
            this.b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.sdk.utils.f fVar = this.d;
        if (fVar != null) {
            fVar.a();
            this.d = null;
        }
    }
}
