package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.76, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass76 {
    A08(0),
    A06(1),
    A07(2),
    A05(3),
    A04(4);

    public static byte[] A01;
    public static String[] A02 = {"hSeSDY0of3XMKYBSawTW6", "sohFiklnBFgr2LMW5unaYXIdoh7LpqJ4", "J1GkrQhOQSKZr22Vk671BdQ9PLpp91zg", "xQM0SIi3n9Poy2F", "WAUXlS76Mh78MuMCacZeL0Bf36KHKL6J", "Ow19vI2XbPOH", "viGaH6ErnKztM5tSpUcz87FTndzVVCSd", "WNqW8CjWCVSKFZCXl6PMQeKqqDuJb9Ju"};
    public int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[6].charAt(17) == 'X') {
            throw new RuntimeException();
        }
        A02[4] = "pgudaYbRqTPjGMZ4ZZfMqbLkPBqXKu6s";
        A01 = new byte[]{-79, -78, -73, -62, -84, -80, -77, -81, -88, -80, -88, -79, -73, -88, -89, -42, -41, -36, -25, -37, -35, -40, -40, -41, -38, -36, -51, -52, Ascii.ETB, Ascii.CAN, 40, Ascii.EM, Ascii.SO, Ascii.ESC, Ascii.SYN, Ascii.DC2, Ascii.FS, Ascii.FS, Ascii.DC2, Ascii.CAN, Ascii.ETB, -70, -63, -72, -72, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    AnonymousClass76(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
