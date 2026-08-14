package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum KA {
    A03,
    A05,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, Ascii.SYN, Ascii.NAK};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(KA ka) {
        if (ka == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        int i = K9.A00[ka.ordinal()];
        if (i == 1) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        A01[5] = "KWBYg9gUO";
        if (i == 2) {
            return VideoAutoplayBehavior.ON;
        }
        if (i != 3) {
            VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
            String[] strArr = A01;
            if (strArr[0].charAt(5) == strArr[4].charAt(5)) {
                A01[2] = "D4DDJWMfk";
                return videoAutoplayBehavior;
            }
            String[] strArr2 = A01;
            strArr2[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
            strArr2[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
            return videoAutoplayBehavior;
        }
        return VideoAutoplayBehavior.OFF;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static KA[] valuesCustom() {
        KA[] kaArrValuesCustom = values();
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "qrA";
        strArr[3] = "mB";
        return (KA[]) kaArrValuesCustom.clone();
    }
}
