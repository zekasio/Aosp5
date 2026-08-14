package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W7 implements InterfaceC0426Di {
    public static byte[] A0E;
    public static String[] A0F = {"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    public long A00;
    public long A01;
    public InterfaceC0417Co A02;
    public C0431Dn A03;
    public String A04;
    public boolean A05;
    public final C0435Dr A0B;
    public final boolean[] A0D = new boolean[3];
    public final C0432Do A0A = new C0432Do(32, 128);
    public final C0432Do A08 = new C0432Do(33, 128);
    public final C0432Do A06 = new C0432Do(34, 128);
    public final C0432Do A07 = new C0432Do(39, 128);
    public final C0432Do A09 = new C0432Do(40, 128);
    public final C0551Ij A0C = new C0551Ij();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, Ascii.SI, 7, -4, -6, Ascii.VT, -4, -5, -73, -8, 10, 7, -4, -6, Ascii.VT, -10, 9, -8, Ascii.VT, 0, 6, -10, 0, -5, -6, -73, Ascii.CR, -8, 3, Ascii.FF, -4, -47, -73, 49, 36, Ascii.US, 32, 42, -22, 35, 32, 49, Ascii.RS};
    }

    static {
        A02();
    }

    public W7(C0435Dr c0435Dr) {
        this.A0B = c0435Dr;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.Format A00(java.lang.String r17, com.facebook.ads.redexgen.X.C0432Do r18, com.facebook.ads.redexgen.X.C0432Do r19, com.facebook.ads.redexgen.X.C0432Do r20) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W7.A00(java.lang.String, com.facebook.ads.redexgen.X.Do, com.facebook.ads.redexgen.X.Do, com.facebook.ads.redexgen.X.Do):com.facebook.ads.internal.exoplayer2.Format");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(long r6, int r8, int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W7.A03(long, int, int, long):void");
    }

    private void A04(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A03(j, i, i2, j2);
        } else {
            this.A0A.A01(i2);
            this.A08.A01(i2);
            this.A06.A01(i2);
        }
        this.A07.A01(i2);
        this.A09.A01(i2);
    }

    public static void A05(C0552Ik c0552Ik) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!c0552Ik.A0A()) {
                    c0552Ik.A04();
                } else {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c0552Ik.A03();
                    }
                    for (int i3 = 0; i3 < iMin; i3++) {
                        c0552Ik.A03();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    public static void A06(C0552Ik c0552Ik) {
        int iA04 = c0552Ik.A04();
        boolean zA0A = false;
        int stRpsIdx = 0;
        for (int numNegativePics = 0; numNegativePics < iA04; numNegativePics++) {
            if (numNegativePics != 0) {
                zA0A = c0552Ik.A0A();
            }
            if (zA0A) {
                c0552Ik.A06();
                c0552Ik.A04();
                for (int i = 0; i <= stRpsIdx; i++) {
                    if (c0552Ik.A0A()) {
                        c0552Ik.A06();
                    }
                }
            } else {
                int numPositivePics = c0552Ik.A04();
                int iA042 = c0552Ik.A04();
                stRpsIdx = numPositivePics + iA042;
                for (int i2 = 0; i2 < numPositivePics; i2++) {
                    c0552Ik.A04();
                    c0552Ik.A06();
                }
                for (int i3 = 0; i3 < iA042; i3++) {
                    c0552Ik.A04();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    A0F[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    c0552Ik.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i, int i2) {
        if (this.A05) {
            this.A03.A04(bArr, i, i2);
        } else {
            this.A0A.A02(bArr, i, i2);
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A09.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) {
        while (c0551Ij.A04() > 0) {
            int iA06 = c0551Ij.A06();
            int iA07 = c0551Ij.A07();
            byte[] bArr = c0551Ij.A00;
            this.A01 += (long) c0551Ij.A04();
            this.A02.AEG(c0551Ij, c0551Ij.A04());
            while (iA06 < iA07) {
                int iA04 = C0547If.A04(bArr, iA06, iA07, this.A0D);
                if (iA04 == iA07) {
                    A07(bArr, iA06, iA07);
                    return;
                }
                int iA00 = C0547If.A00(bArr, iA04);
                int nalUnitType = iA04 - iA06;
                if (nalUnitType > 0) {
                    A07(bArr, iA06, iA04);
                }
                int lengthToNalUnit = iA07 - iA04;
                long j = this.A01 - ((long) lengthToNalUnit);
                A03(j, lengthToNalUnit, nalUnitType < 0 ? -nalUnitType : 0, this.A00);
                long absolutePosition = this.A00;
                A04(j, lengthToNalUnit, iA00, absolutePosition);
                iA06 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A04 = c0440Dw.A04();
        this.A02 = interfaceC0409Ce.AFD(c0440Dw.A03(), 2);
        this.A03 = new C0431Dn(this.A02);
        this.A0B.A03(interfaceC0409Ce, c0440Dw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        C0547If.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
