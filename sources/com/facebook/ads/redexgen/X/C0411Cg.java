package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0411Cg {
    public static byte[] A02;
    public static String[] A03 = {"di8Sf9Pe7Jbfr41S9La3sE0XUXUbIcTt", "VdReIzyhJEkxgwUPMqeI1KmebCO9QkDh", "oL0VvX6tDLEIK9z1dEY1PtjpuEVwAQ4k", "mKzHDdQgrsp66MEU970RQbCyF", "y1nS2Utxj9rUbNITrIgIYwtdoX0kLvBw", "fSxpMgDRgawYiaXZH4Uz0154e", "ZtMJpUGbuzN6IhF", "0I28Lm89b1qn6II"};
    public static final ES A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "HJDAX8MhmPuczgxrb1BIwyZzboPzSHEz";
            strArr2[1] = "hQdnt0euFC7WLrk25AhIcQLHRa72NrIb";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{47, -15, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -15, -7, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -6, -15, -7, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -6, 71, 83, 81, Ascii.DC2, 69, 84, 84, 80, 73, Ascii.DC2, 77, 56, 89, 82, 73, 87, 77, 56, 89, 82, 55, 49, 52, 38};
    }

    static {
        A01();
        A04 = new C0914Wr();
        A05 = Pattern.compile(A00(0, 50, 82));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int i = Integer.parseInt(matcher.group(1), 16);
                int encoderDelay = Integer.parseInt(matcher.group(2), 16);
                if (i > 0 || encoderDelay > 0) {
                    this.A00 = i;
                    this.A01 = encoderDelay;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.A00 = i2;
            this.A01 = i3;
            return true;
        }
        String[] strArr = A03;
        if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "eE8liYxgzzft2czJer5Cb1MId";
        strArr2[5] = "8t68lQEI2igrSMQNmlK51xizE";
        return false;
    }

    public final boolean A05(Metadata metadata) {
        for (int i = 0; i < metadata.A00(); i++) {
            Metadata.Entry entryA01 = metadata.A01(i);
            boolean z = entryA01 instanceof CommentFrame;
            String strA00 = A00(66, 8, 101);
            if (z) {
                CommentFrame commentFrame = (CommentFrame) entryA01;
                if (strA00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else {
                boolean z2 = entryA01 instanceof InternalFrame;
                String[] strArr = A03;
                if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[4] = "JUr596XT5dN8x1JiD53IGmhrrDc6hzgO";
                strArr2[1] = "1JQdlsQIbSDn6BLSr5BIwZm7GWHfhsN6";
                if (z2) {
                    InternalFrame internalFrame = (InternalFrame) entryA01;
                    if (A00(50, 16, 101).equals(internalFrame.A01) && strA00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
