package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0959Yk implements InterfaceC02856v {
    public final /* synthetic */ C0957Yi A00;

    public C0959Yk(C0957Yi c0957Yi) {
        this.A00 = c0957Yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A03(SystemClock.elapsedRealtime() / 1000.0f);
    }
}
