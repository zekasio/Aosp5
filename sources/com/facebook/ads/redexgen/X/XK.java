package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XK implements InterfaceC0356Ab {
    public static byte[] A0A;
    public static String[] A0B = {"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final V9 A07;
    public final C0555In A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, -31, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, -31, -18, -55, -17};
    }

    static {
        A02();
    }

    public XK() {
        this(new V9(true, 65536));
    }

    @Deprecated
    public XK(V9 v9) {
        this(v9, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public XK(V9 v9, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(v9, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public XK(V9 v9, int i, int i2, int i3, int i4, int i5, boolean z, C0555In c0555In) {
        String strA01 = A01(21, 1, 103);
        String strA012 = A01(54, 19, 80);
        A03(i3, 0, strA012, strA01);
        String strA013 = A01(22, 32, 46);
        A03(i4, 0, strA013, strA01);
        String strA014 = A01(84, 11, 100);
        A03(i, i3, strA014, strA012);
        A03(i, i4, strA014, strA013);
        A03(i2, i, A01(73, 11, 106), strA014);
        this.A07 = v9;
        this.A06 = ((long) i) * 1000;
        this.A05 = ((long) i2) * 1000;
        this.A04 = ((long) i3) * 1000;
        this.A03 = ((long) i4) * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = c0555In;
    }

    private final int A00(XG[] xgArr, HR hr) {
        int iA01 = 0;
        for (int i = 0; i < xgArr.length; i++) {
            if (hr.A00(i) != null) {
                iA01 += C0567Iz.A01(xgArr[i].A7i());
            }
        }
        return iA01;
    }

    public static void A03(int i, int i2, String str, String str2) {
        IK.A05(i >= i2, str + A01(0, 21, 48) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        C0555In c0555In = this.A08;
        if (c0555In != null && this.A01) {
            c0555In.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final HW A5h() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final long A5m() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final void AC5() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final void ACR() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final void ACZ(XG[] xgArr, TrackGroupArray trackGroupArray, HR hr) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(xgArr, hr);
        }
        this.A00 = iA00;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final boolean AED() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AEl(long r9, float r11) {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.V9 r0 = r8.A07
            int r1 = r0.A02()
            int r0 = r8.A00
            r6 = 1
            r5 = 0
            if (r1 < r0) goto L86
            r7 = 1
        Ld:
            boolean r4 = r8.A01
            long r0 = r8.A06
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L21
            long r2 = com.facebook.ads.redexgen.X.C0567Iz.A0C(r0, r11)
            long r0 = r8.A05
            long r0 = java.lang.Math.min(r2, r0)
        L21:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7b
            boolean r3 = r8.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XK.A0B
            r0 = 1
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XK.A0B
            java.lang.String r1 = "Ppn0DE"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L40
            if (r7 != 0) goto L79
        L40:
            r8.A01 = r6
        L42:
            com.facebook.ads.redexgen.X.In r6 = r8.A08
            if (r6 == 0) goto L68
            boolean r3 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XK.A0B
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XK.A0B
            java.lang.String r1 = "7hiTZk3TS6kdJpPH1OWD5iH5Lha"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "uWsgjDiVcVLtDVCTZxMR"
            r0 = 7
            r2[r0] = r1
            if (r3 == r4) goto L68
        L63:
            if (r3 == 0) goto L6b
            r6.A00(r5)
        L68:
            boolean r0 = r8.A01
            return r0
        L6b:
            r6.A03(r5)
            goto L68
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XK.A0B
            java.lang.String r1 = "I9dScF5ijEM2hd"
            r0 = 6
            r2[r0] = r1
            if (r3 == r4) goto L68
            goto L63
        L79:
            r6 = 0
            goto L40
        L7b:
            long r1 = r8.A05
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L83
            if (r7 == 0) goto L42
        L83:
            r8.A01 = r5
            goto L42
        L86:
            r7 = 0
            goto Ld
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XK.AEl(long, float):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final boolean AEo(long j, float f, boolean z) {
        long jA0D = C0567Iz.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        if (A0B[6].length() == 13) {
            throw new RuntimeException();
        }
        A0B[6] = "eSzKm";
        return j2 <= 0 || jA0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0356Ab
    public final void onPrepared() {
        A04(false);
    }
}
