package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WP implements DV, InterfaceC0414Cl {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ WO A04;

    public WP(WO wo) {
        this.A04 = wo;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C0551Ij c0551Ij) {
        c0551Ij.A0Z(1);
        int iA0G = c0551Ij.A0G() / 18;
        this.A02 = new long[iA0G];
        this.A03 = new long[iA0G];
        for (int i = 0; i < iA0G; i++) {
            this.A02[i] = c0551Ij.A0L();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i] = c0551Ij.A0L();
            c0551Ij.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final InterfaceC0414Cl A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long j) {
        int iA0B = C0567Iz.A0B(this.A02, this.A04.A04(j), true, true);
        long seekTimeUs = this.A04.A03(this.A02[iA0B]);
        C0415Cm c0415Cm = new C0415Cm(seekTimeUs, this.A00 + this.A03[iA0B]);
        if (seekTimeUs < j) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                long jA03 = this.A04.A03(jArr[iA0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new C0413Ck(c0415Cm, new C0415Cm(jA03, secondSeekTimeUs + this.A03[iA0B + 1]));
            }
        }
        return new C0413Ck(c0415Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long ADY(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.A01 = -1L;
        return j2;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long AF1(long j) {
        long jA04 = this.A04.A04(j);
        this.A01 = this.A02[C0567Iz.A0B(this.A02, jA04, true, true)];
        return jA04;
    }
}
