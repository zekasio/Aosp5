package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IF {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(IE ie) {
        return ie.A5X(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(IE ie) {
        String strA5Z = ie.A5Z(A02(7, 9, 57), (String) null);
        if (strA5Z == null) {
            return null;
        }
        return Uri.parse(strA5Z);
    }

    public static void A04(IG ig) {
        ig.A01(A02(7, 9, 57));
    }

    public static void A05(IG ig, long j) {
        ig.A02(A02(0, 7, 27), j);
    }

    public static void A06(IG ig, Uri uri) {
        ig.A03(A02(7, 9, 57), uri.toString());
    }
}
