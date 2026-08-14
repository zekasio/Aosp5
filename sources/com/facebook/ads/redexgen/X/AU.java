package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AU {
    public int A00;
    public int A01;
    public C0361Ag A02;
    public boolean A03;

    public AU() {
    }

    public /* synthetic */ AU(AR ar) {
        this();
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            IK.A03(i == 4);
        } else {
            this.A03 = true;
            this.A00 = i;
        }
    }

    public final void A05(C0361Ag c0361Ag) {
        this.A02 = c0361Ag;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C0361Ag c0361Ag) {
        return c0361Ag != this.A02 || this.A01 > 0 || this.A03;
    }
}
