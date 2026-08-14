package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0858Uk implements InterfaceC0542Ia {
    public static String[] A05 = {"JbcDsPAiqgb9rsViVRKehTXv1iFS9Alt", "AfEyeuF2jCfkWNmIQlP22Iq9vQ5XDBZo", "cIPTiq2qkEqnYzKxb3sH3HOJO6VigB4N", "bIuwftDwBGArWYVN2grLSP1kPnHfbgfq", "1GGMxn0jatOJtlepcpEnLiyqpa0L6Zpp", "dBndgbsmlMbgteIClih73P1Nf1skDdlq", "kMZcBPwOEd1j6nxu2sFbdi5kLjNzhQnH", "M7tzCbQcNsxxyZ9EacAqZIMXmH340eiG"};
    public long A00;
    public long A01;
    public C0362Ah A02 = C0362Ah.A04;
    public boolean A03;
    public final IN A04;

    public C0858Uk(IN in) {
        this.A04 = in;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A58();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            long jA7H = A7H();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            A02(jA7H);
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A58();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah A7E() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final long A7H() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA58 = this.A04.A58();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
            long j = jA58 - this.A00;
            if (this.A02.A01 == 1.0f) {
                long jA00 = AG.A00(j);
                if (A05[3].charAt(4) != 'j') {
                    A05[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                    return elapsedSinceBaseMs + jA00;
                }
                A05[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                return elapsedSinceBaseMs + jA00;
            }
            return elapsedSinceBaseMs + this.A02.A00(j);
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah AEf(C0362Ah c0362Ah) {
        if (this.A03) {
            A02(A7H());
        }
        this.A02 = c0362Ah;
        return c0362Ah;
    }
}
