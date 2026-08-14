package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.69, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass69 {
    public static byte[] A00;
    public static String[] A01 = {"sGwMbgPEVh4FwXWa", "9MCcaPs0cGd03qEkyl2X69dbSrrSW7Zr", "87eAjjgYTnizuEo7xhBpFeLb40Hm6wuS", "lReHfqhewEavArrd", "ewvVStI6GxGms8C3aQphiMoMwaYMXO3K", "xvalPSKIlI5sW7TQ", "zMwpaK24Vgrta9nCJMzGQdczaD8NI08n", "2D5lQzNrtBbYQ5DHntvZJtwThsuyUgKB"};

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A01[0].length() != 16) {
                throw new RuntimeException();
            }
            A01[7] = "REysSn8h8uGvW44FsW7tFN1ShWtMejXq";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A00 = new byte[]{97, 103, 92, 98, 96, 92, 96, 97, 3, 5, 62, 3, 8, Ascii.SO, Ascii.FF, 4, Ascii.NAK, 19, 8, 2, 62, Ascii.DC2, 8, 6, Ascii.SI, 0, Ascii.CR, 62, 2, 8, 19, 2, Ascii.DC4, Ascii.CR, 0, 19, 62, 3, Ascii.DC4, 7, 7, 4, 19, 62, Ascii.CR, 4, Ascii.SI, 6, Ascii.NAK, 9, 63, 57, 2, 63, 48, 2, 41, 52, 48, 56, 2, 56, 45, 46, 52, 49, 50, 51, 98, 100, 95, 100, 121, 110, 97, 109, 105, 99, 95, 115, 105, 103, 110, 97, 108, 95, 99, 105, 114, 99, 117, 108, 97, 114, 95, 98, 117, 102, 102, 101, 114, 95, 108, 101, 110, 103, 116, 104, Ascii.FS, Ascii.SUB, 33, Ascii.ESC, Ascii.FF, Ascii.FF, 17, Ascii.FF, 33, Ascii.FF, Ascii.ESC, Ascii.SO, 17, Ascii.FF, 10, 33, Ascii.CR, Ascii.US, 19, Ascii.SO, Ascii.DC2, Ascii.ETB, Ascii.DLE, Ascii.EM, 33, Ascii.FF, Ascii.US, 10, Ascii.ESC, 80, 86, 109, 84, 94, 93, 83, 70, 109, 87, 66, 65, 91, 94, 93, 92, 41, 47, Ascii.DC4, 34, 37, 63, 46, 57, 61, 42, 39, Ascii.DC4, 47, 62, 57, 42, 63, 34, 36, 37, Ascii.DC4, 56, 8, Ascii.SO, 53, 3, Ascii.EM, 53, 3, 4, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.FS, Ascii.VT, 6, 53, 7, 5, Ascii.SO, Ascii.SI, 53, Ascii.SI, 4, Ascii.VT, 8, 6, Ascii.SI, Ascii.SO, 46, 40, 19, 34, 46, 33, 19, 56, 37, 33, 41, 19, 41, 60, 63, 37, 32, 35, 34, Ascii.SI, 9, 50, 2, Ascii.GS, 8, Ascii.US, Ascii.FF, Ascii.EM, 4, 2, 3, Ascii.FF, 1, 50, 1, 2, 10, 10, 4, 3, 10, 50, Ascii.RS, Ascii.FF, 0, Ascii.GS, 1, 4, 3, 10, 50, Ascii.US, Ascii.FF, Ascii.EM, 8, 73, 79, 116, 91, 70, 116, 91, 89, 68, 91, 116, 93, 74, 71, 116, 72, 68, 94, 69, 95, 115, 117, 78, 99, 101, 75, 77, 118, 90, 64, 78, 71, 72, 69, 118, 74, 70, 71, 79, 64, 78, 118, 17, Ascii.ETB, 44, 0, Ascii.SUB, Ascii.DC4, Ascii.GS, Ascii.DC2, Ascii.US, 0, 44, Ascii.DLE, Ascii.FS, Ascii.GS, Ascii.NAK, Ascii.SUB, Ascii.DC4, 94, 88, 99, 79, 72, 93, 72, 85, 95, 99, 79, 85, 91, 82, 93, 80, 99, 95, 85, 78, 95, 73, 80, 93, 78, 99, 94, 73, 90, 90, 89, 78, 99, 80, 89, 82, 91, 72, 84, 92, 90};
    }

    static {
        A0O();
    }

    public static double A00(Context context) {
        return JR.A0O(context).A29(A0C(108, 29, 13), 0.0d);
    }

    public static double A01(Context context) {
        return JR.A0O(context).A29(A0C(221, 36, 30), 0.0d);
    }

    public static float A02(Context context) {
        return JR.A0O(context).A2A(A0C(137, 16, 65), 0.0f);
    }

    public static int A03(Context context) {
        return JR.A0O(context).A2B(A0C(8, 42, 18), 0);
    }

    public static int A04(Context context) {
        return JR.A0O(context).A2B(A0C(68, 40, 115), 0);
    }

    public static int A05(Context context) {
        return JR.A0O(context).A2B(A0C(153, 22, 56), 0);
    }

    public static int A06(Context context) {
        return JR.A0O(context).A2B(A0C(257, 20, 88), 0);
    }

    public static int A07(Context context) {
        return JR.A0O(context).A2B(A0C(316, 39, 79), 0);
    }

    public static long A08(Context context) {
        return JR.A0O(context).A2C(A0C(50, 18, 46), 0L);
    }

    public static long A09(Context context) {
        return JR.A0O(context).A2C(A0C(HttpStatus.SC_ACCEPTED, 19, 63), 0L);
    }

    public static EnumC02866w A0A(Context context) {
        return EnumC02866w.A00(JR.A0O(context).A2B(A0C(277, 5, 98), 0));
    }

    public static String A0B(int i) {
        return A0C(282, 17, 90) + i;
    }

    public static String A0D(Context context) {
        JR jrA0O = JR.A0O(context);
        String strA0C = A0C(355, 2, 84);
        String strA2D = jrA0O.A2D(A0C(299, 17, 0), strA0C);
        return strA2D == null ? strA0C : strA2D;
    }

    public static String A0E(Context context) {
        return A0L(context, 10920);
    }

    public static String A0F(Context context) {
        return A0L(context, 10300);
    }

    public static String A0G(Context context) {
        return A0L(context, 10941);
    }

    public static String A0H(Context context) {
        return A0L(context, 10943);
    }

    public static String A0I(Context context) {
        return A0L(context, 10944);
    }

    public static String A0J(Context context) {
        return A0L(context, 10945);
    }

    public static String A0K(Context context) {
        return A0L(context, 10940);
    }

    public static String A0L(Context context, int i) {
        JR jrA0O = JR.A0O(context);
        String strA0B = A0B(i);
        String strA0C = A0C(355, 2, 84);
        String strA2D = jrA0O.A2D(strA0B, strA0C);
        return strA2D == null ? strA0C : strA2D;
    }

    public static HashMap<Integer, Integer> A0M() {
        return new HashMap<>();
    }

    public static Map<Integer, String> A0N(Context context) {
        HashMap map = new HashMap();
        map.put(10920, A0E(context));
        map.put(10941, A0G(context));
        map.put(10300, A0F(context));
        map.put(10940, A0K(context));
        map.put(10943, A0H(context));
        map.put(10944, A0I(context));
        map.put(10945, A0J(context));
        return Collections.unmodifiableMap(map);
    }

    public static boolean A0P(Context context) {
        return JR.A0O(context).A2G(A0C(175, 27, 25), false);
    }

    public static boolean A0Q(Context context) {
        return JR.A0O(context).A2G(A0C(0, 8, 112), false);
    }
}
