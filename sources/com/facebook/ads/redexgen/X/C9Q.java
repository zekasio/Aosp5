package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Q {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, Ascii.ESC, 10, 10, Ascii.FF, Ascii.US, 8, 9, Ascii.SO, Ascii.EM, 2, 8, 0, 9, 47, 45, 38, 39, 46, Ascii.SI, 19, 53, 41, 44, 63, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C8U c8u) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        A00 = new HashMap<>();
        A00.put(A00(22, 6, 41), c8u.getPackageName());
        A02(c8u, A00);
        return new HashMap(A00);
    }

    public static synchronized Map<String, String> A02(C8U c8u, Map<String, String> map) {
        map.put(A00(41, 3, 83), A00(65, 7, 55));
        map.put(A00(44, 11, 68), c8u.A03().A7n());
        map.put(A00(33, 2, 37), c8u.A03().A7m());
        map.put(A00(35, 6, 31), AnonymousClass99.A03);
        AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
        map.put(A00(15, 7, 63), anonymousClass99.A06());
        map.put(A00(8, 7, 82), anonymousClass99.A05());
        map.put(A00(0, 8, 27), String.valueOf(anonymousClass99.A04()));
        map.put(A00(28, 5, 7), anonymousClass99.A0A());
        map.put(A00(55, 10, 72), c8u.A07().A02());
        return map;
    }
}
