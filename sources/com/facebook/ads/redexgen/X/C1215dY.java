package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1215dY implements InterfaceC02445f {
    public final /* synthetic */ C0474Fi A00;
    public final /* synthetic */ boolean A01;

    public C1215dY(C0474Fi c0474Fi, boolean z) {
        this.A00 = c0474Fi;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA1() {
        if (!JR.A1D(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.ACC(this.A00);
        } else {
            C0474Fi c0474Fi = this.A00;
            c0474Fi.A07 = PB.A01(c0474Fi.A04, (C1196dF) this.A00.A03, 0, new C1216dZ(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02445f
    public final void AA2() {
        this.A00.A01.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
