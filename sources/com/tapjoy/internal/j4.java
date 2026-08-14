package com.tapjoy.internal;

import com.tapjoy.FiveRocksIntegration;
import com.tapjoy.TJPlacement;
import com.tapjoy.TapjoyConnectCore;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 implements m6 {
    @Override // com.tapjoy.internal.m6
    public void a(String str) {
    }

    @Override // com.tapjoy.internal.m6
    public void a(String str, k6 k6Var) {
        if (k6Var != null) {
            ((o7) k6Var).a(new i4(this, str));
        }
    }

    @Override // com.tapjoy.internal.m6
    public void b(String str) {
        TJPlacement tJPlacement;
        synchronized (FiveRocksIntegration.f1622a) {
            tJPlacement = FiveRocksIntegration.f1622a.get(str);
        }
        if (tJPlacement == null || tJPlacement.a() == null) {
            return;
        }
        tJPlacement.a().onContentReady(tJPlacement);
    }

    @Override // com.tapjoy.internal.m6
    public void c(String str) {
    }

    @Override // com.tapjoy.internal.m6
    public void d(String str) {
        TJPlacement tJPlacement;
        synchronized (FiveRocksIntegration.f1622a) {
            tJPlacement = FiveRocksIntegration.f1622a.get(str);
        }
        if (tJPlacement == null || tJPlacement.a() == null) {
            return;
        }
        tJPlacement.a().onContentShow(tJPlacement);
    }

    @Override // com.tapjoy.internal.m6
    public void a(String str, String str2, k6 k6Var) {
        TJPlacement tJPlacement;
        if (k6Var != null) {
            ((o7) k6Var).a(new i4(this, str));
        }
        synchronized (FiveRocksIntegration.f1622a) {
            tJPlacement = FiveRocksIntegration.f1622a.get(str);
        }
        if (tJPlacement != null) {
            TapjoyConnectCore.viewDidClose(str2);
            if (tJPlacement.a() != null) {
                tJPlacement.a().onContentDismiss(tJPlacement);
            }
        }
    }
}
