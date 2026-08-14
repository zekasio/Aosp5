package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BF extends C1135cB {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public BG A03;
    public int[] A04;
    public final C0947Xy A05;
    public final PT A06;
    public final PU A07;

    public BF(C0947Xy c0947Xy, PU pu, PT pt) {
        super(c0947Xy);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c0947Xy;
        this.A07 = pu;
        this.A06 = pt;
        this.A01 = -1;
        this.A03 = new BG(this, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // com.facebook.ads.redexgen.X.C4T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1J(com.facebook.ads.redexgen.X.C02144b r17, com.facebook.ads.redexgen.X.C02214i r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BF.A1J(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.C1135cB, com.facebook.ads.redexgen.X.C4T
    public final void A1t(int i) {
        A2F(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1135cB, com.facebook.ads.redexgen.X.C4T
    public final void A21(F9 f9, C02214i c02214i, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2K(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new BG(this, this.A05);
    }

    public final void A2L(int i) {
        this.A01 = i;
    }

    public final void A2M(int i) {
        this.A02 = i;
    }
}
