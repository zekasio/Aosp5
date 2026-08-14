package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f1512a;
    private final Map<String, com.applovin.impl.mediation.a.a> b = CollectionUtils.map(4);
    private final Object c = new Object();

    z(p pVar) {
        this.f1512a = pVar.L();
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.c) {
            if (y.a()) {
                this.f1512a.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.b.put(aVar.getAdUnitId(), aVar);
        }
    }

    public com.applovin.impl.mediation.a.a a(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.c) {
            aVar = this.b.get(str);
        }
        return aVar;
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.c) {
            String adUnitId = aVar.getAdUnitId();
            com.applovin.impl.mediation.a.a aVar2 = this.b.get(adUnitId);
            if (aVar == aVar2) {
                if (y.a()) {
                    this.f1512a.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                }
                this.b.remove(adUnitId);
            } else if (y.a()) {
                this.f1512a.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }
}
