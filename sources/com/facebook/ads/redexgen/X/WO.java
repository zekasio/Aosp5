package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WO extends DY {
    public static byte[] A02;
    public static String[] A03 = {"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    public WP A00;
    public IW A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, Ascii.DC2, 3, Ascii.SO, 8, 72, 1, Ascii.VT, 6, 4};
    }

    static {
        A03();
    }

    private int A00(C0551Ij c0551Ij) {
        int i = (c0551Ij.A00[2] & UByte.MAX_VALUE) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
            case 7:
                c0551Ij.A0Z(4);
                c0551Ij.A0O();
                int iA0E = i == 6 ? c0551Ij.A0E() : c0551Ij.A0I();
                c0551Ij.A0Y(0);
                return iA0E + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean A04(C0551Ij c0551Ij) {
        return c0551Ij.A04() >= 5 && c0551Ij.A0E() == 127 && c0551Ij.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0551Ij c0551Ij) {
        if (!A05(c0551Ij.A00)) {
            return -1L;
        }
        int iA00 = A00(c0551Ij);
        String[] strArr = A03;
        if (strArr[2].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "M0DKrSciZtY";
        strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0551Ij c0551Ij, long j, DX dx) throws InterruptedException, IOException {
        byte[] bArr = c0551Ij.A00;
        if (this.A01 == null) {
            this.A01 = new IW(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c0551Ij.A07());
            data[4] = ByteCompanionObject.MIN_VALUE;
            List listSingletonList = Collections.singletonList(data);
            dx.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.A00 = new WP(this);
            this.A00.A01(c0551Ij);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        WP wp = this.A00;
        if (wp != null) {
            wp.A00(j);
            dx.A01 = this.A00;
        }
        return false;
    }
}
