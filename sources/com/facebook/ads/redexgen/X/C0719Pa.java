package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0719Pa {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1B A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, Ascii.FF, 10, Ascii.ESC, Ascii.CR, Ascii.DC2, Ascii.ETB, Ascii.CR};
    }

    public C0719Pa(int i, int i2, C1B c1b) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c1b;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1B A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String strA00 = A00(0, 0, 12);
        sb.append(strA00);
        map.put(A00(7, 7, 94), sb.toString());
        map.put(A00(0, 7, 55), this.A00 + strA00);
        return map;
    }
}
