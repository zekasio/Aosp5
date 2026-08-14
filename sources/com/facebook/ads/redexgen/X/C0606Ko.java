package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0606Ko {
    public static byte[] A00;
    public static String[] A01 = {"DRlsPwjpEwtNoZv5ySnxf", "lqEqsXUgP0JMZJfgrKxewN2wIWHzYKcc", "dBjDOWAGvP7mSKAaP52zl", "ype", "mP5mKraLiX8XnVkHST8LkS5AYOMnukgh", "WxiRHArz5NNbCsZRJT7jzOWIY3Iz", "jBZrwNF22PwjCa8Ii6ulb8rFZ5hC5AS6", "qRbUwr6kgq5VO8gbp3xyKAMHfEJZ"};
    public static final AtomicReference<String> A02;
    public static final AtomicReference<String> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{118, 98, 123, 116, 126, 116, 120, 126, 116, 121, 125, 116, 116, 122, 116, 125, 124, 98, 47, 56, 42, 62, 72, 6, 3, 9, Ascii.DLE, 56, Ascii.VT, 8, 0, 0, Ascii.SO, 9, 0, 72, Ascii.FF, 66, 71, 77, 84, 124, 80, 90, 77, 64, 17, 111, 46, 37, 52, 55, 47, 50, 43, Ascii.US, 33, 36, 51, Ascii.US, 35, 47, 45, 45, 47, 46, 88, 68, 68, 64, 67, 10, Ascii.US, Ascii.US, 87, 66, 81, 64, 88, Ascii.NAK, 67, Ascii.RS, 86, 81, 83, 85, 82, 95, 95, 91, Ascii.RS, 83, 95, 93, 4, Ascii.CAN, Ascii.CAN, Ascii.FS, Ascii.US, 86, 67, 67, Ascii.ESC, Ascii.ESC, Ascii.ESC, 73, Ascii.US, 66, 10, Ascii.CR, Ascii.SI, 9, Ascii.SO, 3, 3, 7, 66, Ascii.SI, 3, 1, 83, 83, 83};
    }

    static {
        A09();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>();
    }

    public static String A01(C8U c8u) {
        return A05(c8u) + A00(47, 19, 24);
    }

    public static String A02(C8U c8u) {
        return A07(c8u, JR.A0Q(c8u)) + A00(22, 14, 63);
    }

    public static String A03(C8U c8u) {
        return A05(c8u) + A00(1, 21, 21);
    }

    public static String A04(C8U c8u) {
        return A07(c8u, JR.A0R(c8u)) + A00(36, 11, 123);
    }

    public static String A05(C8U c8u) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return A06(c8u, A00(66, 28, 104));
    }

    public static String A06(C8U c8u, String str) {
        String strA00;
        String prefix = c8u.A03().A7l();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(prefix)) {
            strA00 = A00(0, 0, 29);
        } else {
            strA00 = A00(0, 1, 0) + prefix;
        }
        objArr[0] = strA00;
        if (A01[4].charAt(27) == 'a') {
            throw new RuntimeException();
        }
        A01[1] = "Rtsd39h1DjNUt9rd7OM3RjcgvmtBKqBR";
        return String.format(locale, str, objArr);
    }

    public static String A07(C8U c8u, String str) {
        String str2 = A03.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return A08(A06(c8u, A00(94, 26, 52)), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), str2);
    }
}
