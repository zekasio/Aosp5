package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0784Rn {
    A03(A00(10, 4, 24)),
    A04(A00(14, 6, 108));

    public static byte[] A01;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -19, -16, -16, -70, -75, -87, -90, -71, -86, -35, -32, -29, -29, 64, 59, 47, 44, 63, 48};
    }

    static {
        A01();
    }

    EnumC0784Rn(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
