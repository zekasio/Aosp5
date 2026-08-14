package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1194dD implements InterfaceC02445f {
    public final /* synthetic */ C01411d A00;
    public final /* synthetic */ C0947Xy A01;
    public final /* synthetic */ boolean A02;

    public C1194dD(C01411d c01411d, C0947Xy c0947Xy, boolean z) {
        this.A00 = c01411d;
        this.A01 = c0947Xy;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA1() {
        if (!JR.A1A(this.A01) || !this.A02) {
            this.A00.A04.A9v();
        } else {
            C01411d c01411d = this.A00;
            c01411d.A02 = PB.A01(this.A01, c01411d.A03, 1, new C1195dE(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA2() {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }
}
