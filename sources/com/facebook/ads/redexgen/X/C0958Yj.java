package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0958Yj implements InterfaceC02856v {
    public final /* synthetic */ C0957Yi A00;

    public C0958Yj(C0957Yi c0957Yi) {
        this.A00 = c0957Yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A03(SystemClock.uptimeMillis() / 1000.0f);
    }
}
