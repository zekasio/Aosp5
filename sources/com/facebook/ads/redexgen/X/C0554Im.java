package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0554Im extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33, 45, 101, 100, 106, 101, 104, 126, 121, 48, 61, Ascii.US, 4, 2, Ascii.US, 4, Ascii.EM, Ascii.DC4, 77, Ascii.EM, 2, 2, 77, 1, 2, Ascii.SUB, 77, 54, Ascii.GS, Ascii.US, 4, 2, Ascii.US, 4, Ascii.EM, Ascii.DC4, 80, 65};
    }

    public C0554Im(int i, int i2) {
        super(A00(10, 27, 94) + i + A00(0, 10, 62) + i2 + A00(37, 1, 47));
    }
}
