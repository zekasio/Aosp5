package com.tapjoy.internal;

import com.tapjoy.TJAdUnit;
import com.tapjoy.TJCacheListener;
import com.tapjoy.TJCorePlacement;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k4 implements TJCacheListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TJCorePlacement.c f1836a;

    public k4(TJCorePlacement.c cVar) {
        this.f1836a = cVar;
    }

    @Override // com.tapjoy.TJCacheListener
    public void onCachingComplete(int i) {
        if (y5.e) {
            TJCorePlacement.this.g.getTjBeacon().a("load", (Map<String, String>) null);
        }
        TJCorePlacement tJCorePlacement = TJCorePlacement.this;
        TJAdUnit adUnit = tJCorePlacement.getAdUnit();
        TJCorePlacement tJCorePlacement2 = TJCorePlacement.this;
        tJCorePlacement.i = adUnit.preload(tJCorePlacement2.d, tJCorePlacement2.b);
    }
}
