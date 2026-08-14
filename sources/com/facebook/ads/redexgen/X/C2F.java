package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum C2F {
    A05(A00(22, 6, 6)),
    A03(A00(14, 4, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES)),
    A04(A00(18, 4, 24));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 67, 78, 79, Ascii.SI, Ascii.SO, Ascii.SI, 4, 91, 76, 89, 70, 91, 93, 119, 118, 123, 122, Ascii.NAK, Ascii.DC4, Ascii.NAK, Ascii.RS, Ascii.ETB, 0, Ascii.NAK, 10, Ascii.ETB, 17};
    }

    static {
        A01();
    }

    C2F(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
