package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0481Fp extends AbstractC1187d6 {
    public final /* synthetic */ C0474Fi A00;
    public final /* synthetic */ AbstractC1207dQ A01;
    public final /* synthetic */ C1196dF A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0481Fp(C0474Fi c0474Fi, boolean z, boolean z2, C1196dF c1196dF, AbstractC1207dQ abstractC1207dQ) {
        super(z);
        this.A00 = c0474Fi;
        this.A03 = z2;
        this.A02 = c1196dF;
        this.A01 = abstractC1207dQ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1187d6
    public final void A00() {
        this.A00.A01.ACF(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1187d6
    public final void A01(boolean z) {
        if (!JR.A1D(this.A00.A04) || !this.A03) {
            this.A00.A0C.set(true);
            this.A00.A01.ACC(this.A01);
        } else {
            C0474Fi c0474Fi = this.A00;
            c0474Fi.A07 = PB.A01(c0474Fi.A04, this.A02, 0, new C1214dX(this));
        }
    }
}
