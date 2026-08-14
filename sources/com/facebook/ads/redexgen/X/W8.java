package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0426Di {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC0417Co A02;
    public C0430Dm A03;
    public String A04;
    public boolean A05;
    public final C0435Dr A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0432Do A08 = new C0432Do(7, 128);
    public final C0432Do A06 = new C0432Do(8, 128);
    public final C0432Do A07 = new C0432Do(6, 128);
    public final C0551Ij A0A = new C0551Ij();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public W8(C0435Dr c0435Dr, boolean z, boolean z2) {
        this.A09 = c0435Dr;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W8.A02(long, int, int, long):void");
    }

    private void A03(long j, int i, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i);
            this.A06.A01(i);
        }
        this.A07.A01(i);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j, i, j2);
    }

    private void A04(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A03.A06(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) {
        int iA06 = c0551Ij.A06();
        int iA07 = c0551Ij.A07();
        byte[] bArr = c0551Ij.A00;
        this.A01 += (long) c0551Ij.A04();
        this.A02.AEG(c0551Ij, c0551Ij.A04());
        while (true) {
            int iA04 = C0547If.A04(bArr, iA06, iA07, this.A0D);
            if (iA04 == iA07) {
                A04(bArr, iA06, iA07);
                return;
            }
            int iA01 = C0547If.A01(bArr, iA04);
            int nalUnitOffset = iA04 - iA06;
            if (nalUnitOffset > 0) {
                A04(bArr, iA06, iA04);
            }
            int i = iA07 - iA04;
            long j = this.A01 - ((long) i);
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A02(j, i, offset, this.A00);
            A03(j, iA01, this.A00);
            iA06 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A04 = c0440Dw.A04();
        this.A02 = interfaceC0409Ce.AFD(c0440Dw.A03(), 2);
        this.A03 = new C0430Dm(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC0409Ce, c0440Dw);
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
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
