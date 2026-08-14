package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1212dV implements InterfaceC01491l {
    public final /* synthetic */ C0474Fi A00;

    public C1212dV(C0474Fi c0474Fi) {
        this.A00 = c0474Fi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01491l
    public final void ABm(AdError adError) {
        this.A00.A01.ACF(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01491l
    public final void ABn() {
        this.A00.A0C.set(true);
        this.A00.A01.ACC(this.A00);
    }
}
