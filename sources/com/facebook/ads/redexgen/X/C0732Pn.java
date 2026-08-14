package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0732Pn {
    public static byte[] A00;
    public static String[] A01 = {"FlapraKYinr7Nj6zb2x", "Je7Oc75DeV26JYLGdoAYQBFZl5wXaWlc", "6eSxJX", "aEepWtzNMaW6JZj4waJ23HNf2aIS7LoC", "JwlyhY0m7wRpvvwBZvP15fqQyn91MpTE", "PlE1oLNOrYKtW3AWK6zlObYGaKJphnE8", "QTcNGp4T1DOVQL9", "izKSydL2onnSjNYNNJlTpUx2BXz"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
            String[] strArr = A01;
            if (strArr[3].charAt(25) == strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A01[7] = "ZkkNqMbSq2X5uLLX3N";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.DC2, 10, Ascii.CR, Ascii.CR, 10, Ascii.FF, -6, 9, 9, -8, 7, -6, 6, -2, 37, 38, 55, 42, 36, 38, 32, 46, 48, 37, 38, 45, 50, 53, 41, 39, 50, 43, 72, 76, 50, 54, 34, 57, 40, 53, 34, 19, 36, 38, 32, Ascii.ETB, 36, 17, Ascii.ETB, 32, Ascii.SYN, 34, 33, Ascii.ESC, 32, 38, -14, -18, -29, -5, -29, -28, -18, -25, -31, -16, -29, -17, -25, Ascii.CR, -3, Ascii.FF, -1, -1, 8, -7, 2, -1, 3, 1, 2, Ascii.SO, -22, -38, -23, -36, -36, -27, -42, -18, -32, -37, -21, -33, -48, -63, -56, -68, -45, -62, -49, -48, -58, -52, -53, Ascii.CR, -1, Ascii.CR, Ascii.CR, 3, 9, 8, -7, 3, -2};
    }

    static {
        A02();
    }

    public static Map<String, String> A01(C8U c8u, String str, String str2) {
        HashMap map = new HashMap();
        AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
        int i = c8u.getResources().getDisplayMetrics().widthPixels;
        int i2 = c8u.getResources().getDisplayMetrics().heightPixels;
        map.put(A00(105, 10, 61), c8u.A07().A02());
        map.put(A00(56, 13, 37), str2);
        map.put(A00(40, 16, 85), str);
        map.put(A00(14, 12, 100), String.valueOf(anonymousClass99.A09()));
        map.put(A00(82, 12, 26), String.valueOf((int) (i / Lr.A00)));
        map.put(A00(69, 13, 61), String.valueOf((int) (i2 / Lr.A00)));
        map.put(A00(32, 2, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), c8u.A03().A7m());
        map.put(A00(34, 6, 102), AnonymousClass99.A03);
        map.put(A00(26, 6, 105), Locale.getDefault().toString());
        map.put(A00(94, 11, 0), A00(0, 6, 127));
        map.put(A00(6, 8, 60), anonymousClass99.A05());
        return map;
    }
}
