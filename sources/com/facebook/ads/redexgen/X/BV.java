package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BV extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, Ascii.SI, 3, 124, 112, 19, 63, 62, 54, 57, 55, 120, 110, 90, 75, 70, 64, 123, 93, 78, 76, 68, Ascii.SI, 70, 65, 70, 91, Ascii.SI, 73, 78, 70, 67, 74, 75, Ascii.NAK, Ascii.SI};
    }

    public BV(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(12, 24, 79));
        sb.append(i);
        sb.append(A00(3, 9, 48));
        sb.append(i2);
        String strA00 = A00(1, 2, 67);
        sb.append(strA00);
        sb.append(i3);
        sb.append(strA00);
        sb.append(i4);
        sb.append(A00(0, 1, 96));
        super(sb.toString());
        this.A00 = i;
    }
}
