package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VZ implements InterfaceC0487Fv {
    public final int A00;
    public final /* synthetic */ CE A01;

    public VZ(CE ce, int i) {
        this.A01 = ce;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0487Fv
    public final boolean A8c() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0487Fv
    public final void A9X() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0487Fv
    public final int ADa(AZ az, X2 x2, boolean z) {
        return this.A01.A0P(this.A00, az, x2, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0487Fv
    public final int AEs(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
