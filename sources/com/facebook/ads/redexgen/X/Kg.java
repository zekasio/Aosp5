package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Kg {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;

    @SuppressLint({"NotWrittenPrivateField"})
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"WcKxqk7L6BbuUQ1o7qmtmX6WSmYBceUW", "BgR1wHMut0LLHWxcn1vNnqjOmnDpA7yk", "nofrFHfyJT7pmG0QketyEOeNZ4PDBNqx", "tJ6rTzDc1vJYhzSuFM6hiX1fKi0tAXSV", "zeDIr51bIn8XcOdXOM6dVjfvh9EOKJZZ", "x4ZdmXYSSnH60B6WOaypztUTceO04NF4", "XXJyOaEVU", "eLFDRkAKNxNhqN4Dib4JBju5Hz9f2MYZ"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-35, 43, -14, -35, 43, -14, -35, Ascii.FS, -14, -35, Ascii.FS, -14, -35, Ascii.FS, 9, 39, Ascii.GS, 34, Ascii.ESC, -44, 32, Ascii.NAK, 39, 40, -44, Ascii.NAK, Ascii.CAN, -44, 38, Ascii.EM, 39, 36, 35, 34, 39, Ascii.EM, -5, -52, -48, -8, -53, -52, -5, 5, 3, Ascii.DC2, -22, -1, 17, Ascii.DC2, -16, 3, 17, Ascii.SO, Ascii.CR, Ascii.FF, 17, 3};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, KM km) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        int i = C0599Kf.A00[km.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return 15000L;
        }
        if (A05[3].charAt(17) != 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "cMCvtLXy3JUCQlBDXi74HNVnq0if4CLO";
        strArr[1] = "Rwzrrq0i3HxLUmTnjjMGp9p8g57hQdnu";
        if (i != 4) {
            return -1000L;
        }
        return 15000L;
    }

    public static String A02(C0600Kh c0600Kh) {
        KV.A05(A01(43, 15, 94), A01(14, 22, 116), A01(36, 7, 87));
        return A02.get(A03(c0600Kh));
    }

    public static String A03(C0600Kh c0600Kh) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = c0600Kh.A07();
        objArr[1] = c0600Kh.A05();
        objArr[2] = Integer.valueOf(c0600Kh.A06() == null ? 0 : c0600Kh.A06().A00());
        objArr[3] = Integer.valueOf(c0600Kh.A06() != null ? c0600Kh.A06().A01() : 0);
        objArr[4] = Integer.valueOf(c0600Kh.A04());
        return String.format(locale, A01(0, 14, 120), objArr);
    }

    public static void A05(long j, C0600Kh c0600Kh) {
        A01.put(A03(c0600Kh), Long.valueOf(j));
    }

    public static void A06(C0600Kh c0600Kh) {
        A00.put(A03(c0600Kh), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C0600Kh c0600Kh) {
        A02.put(A03(c0600Kh), str);
    }

    public static boolean A08(C0600Kh c0600Kh) {
        if (A03) {
            return false;
        }
        String strA03 = A03(c0600Kh);
        if (!A00.containsKey(strA03)) {
            return false;
        }
        Long l = A00.get(strA03);
        if (A05[3].charAt(17) != 'M') {
            throw new RuntimeException();
        }
        A05[6] = "HNdF4hlEpt9Mz";
        return System.currentTimeMillis() - l.longValue() < A00(strA03, c0600Kh.A05());
    }
}
