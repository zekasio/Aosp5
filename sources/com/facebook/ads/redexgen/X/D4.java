package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D4 {
    public static byte[] A09;
    public static String[] A0A = {"fT4", "9XJ", "BdT8ugCih1Mpz00LrHVoF8KqNvgOr8AQ", "ItU4Mc5lT2NsoQYD", "XQJ1SNvFfokPp3KD", "IGCc23FH28N7ANBVj9k1dGnz4ha0U", "1lzK38hIt0", "A8GyDlY1o0KAgmQELzlat0ZxMGcgz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C0551Ij A06;
    public final C0551Ij A07;
    public final boolean A08;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{Ascii.ESC, Ascii.DC4, Ascii.SI, Ascii.SO, 9, 34, Ascii.RS, Ascii.NAK, 8, 19, Ascii.SYN, 93, Ascii.DLE, 8, Ascii.SO, 9, 93, Ascii.US, Ascii.CAN, 93, 76};
    }

    static {
        A01();
    }

    public D4(C0551Ij c0551Ij, C0551Ij c0551Ij2, boolean z) {
        this.A07 = c0551Ij;
        this.A06 = c0551Ij2;
        this.A08 = z;
        c0551Ij2.A0Y(12);
        this.A05 = c0551Ij2.A0H();
        c0551Ij.A0Y(12);
        this.A04 = c0551Ij.A0H();
        IK.A06(c0551Ij.A08() == 1, A00(0, 21, 44));
        this.A00 = -1;
    }

    public final boolean A02() {
        long jA0M;
        int iA0H;
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == this.A05) {
            if (A0A[6].length() == 19) {
                throw new RuntimeException();
            }
            A0A[2] = "dfpT2dt5bGn60gbEA6wBElGJneIfVZr3";
            return false;
        }
        if (this.A08) {
            jA0M = this.A06.A0N();
        } else {
            jA0M = this.A06.A0M();
        }
        this.A02 = jA0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i2 = this.A04 - 1;
            this.A04 = i2;
            if (i2 > 0) {
                C0551Ij c0551Ij = this.A07;
                String[] strArr = A0A;
                if (strArr[0].length() != strArr[1].length()) {
                    iA0H = c0551Ij.A0H() - 1;
                } else {
                    A0A[2] = "DxoiDv7jb7q87sjQbqIMGefCzqS86q5Y";
                    iA0H = c0551Ij.A0H() - 1;
                }
            } else {
                iA0H = -1;
            }
            this.A03 = iA0H;
        }
        return true;
    }
}
