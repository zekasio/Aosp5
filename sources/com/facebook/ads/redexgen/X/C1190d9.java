package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1190d9 implements InterfaceC02445f {
    public final /* synthetic */ C01411d A00;

    public C1190d9(C01411d c01411d) {
        this.A00 = c01411d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA1() {
        this.A00.A04.A9v();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA2() {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }
}
