package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1191dA implements InterfaceC01491l {
    public final /* synthetic */ C01411d A00;

    public C1191dA(C01411d c01411d) {
        this.A00 = c01411d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01491l
    public final void ABm(AdError adError) {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01491l
    public final void ABn() {
        this.A00.A04.A9v();
    }
}
