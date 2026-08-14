package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BX extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 108, 125, 112, 118, 77, 107, 120, 122, 114, 57, 110, 107, 112, 109, 124, 57, 127, 120, 112, 117, 124, 125, 35, 57};
    }

    public BX(int i) {
        super(A00(0, 25, 85) + i);
        this.A00 = i;
    }
}
