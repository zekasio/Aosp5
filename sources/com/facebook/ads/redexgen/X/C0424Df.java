package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0424Df {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0423De A04(C0551Ij c0551Ij) throws C0360Af {
        A0A(1, c0551Ij, false);
        long jA0K = c0551Ij.A0K();
        int iA0E = c0551Ij.A0E();
        long jA0K2 = c0551Ij.A0K();
        int iA0A = c0551Ij.A0A();
        int iA0A2 = c0551Ij.A0A();
        int iA0A3 = c0551Ij.A0A();
        int iA0E2 = c0551Ij.A0E();
        return new C0423De(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) Math.pow(2.0d, iA0E2 & 15), (int) Math.pow(2.0d, (iA0E2 & 240) >> 4), (c0551Ij.A0E() & 1) > 0, Arrays.copyOf(c0551Ij.A00, c0551Ij.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, Ascii.SUB, 7, Ascii.ETB, Ascii.FS, 6, 32, 1, Ascii.FS, Ascii.EM, 74, 87, 95, 74, 76, 91, 74, 75, Ascii.SI, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, Ascii.SI, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, Ascii.GS, 85, 88, 92, 89, 88, 79, Ascii.GS, 73, 68, 77, 88, Ascii.GS, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, Ascii.DC4, 0, 19, Ascii.US, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, Ascii.DLE, Ascii.ESC, 6, 82, 19, Ascii.DC4, 6, Ascii.ETB, 0, 82, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ETB, 1, 82, Ascii.FS, Ascii.GS, 6, 82, 1, Ascii.ETB, 6, 82, 19, 1, 82, Ascii.ETB, 10, 2, Ascii.ETB, 17, 6, Ascii.ETB, Ascii.SYN, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, Ascii.SO, 90, 87, 94, 75, Ascii.SO, 73, 92, 75, 79, 90, 75, 92, Ascii.SO, 90, 70, 79, 64, Ascii.SO, Ascii.FS, Ascii.SO, 64, 65, 90, Ascii.SO, 74, 75, 77, 65, 74, 79, 76, 66, 75, Ascii.DC4, Ascii.SO, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, Ascii.DC4, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, 127, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, Ascii.CAN, Ascii.CAN, 87, 4, Ascii.US, Ascii.CAN, 5, 3, 87, Ascii.US, Ascii.DC2, Ascii.SYN, 19, Ascii.DC2, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int val) {
        int i = 0;
        while (val > 0) {
            i++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0421Db A02(com.facebook.ads.redexgen.X.DZ r12) throws com.facebook.ads.redexgen.X.C0360Af {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0424Df.A02(com.facebook.ads.redexgen.X.DZ):com.facebook.ads.redexgen.X.Db");
    }

    public static C0422Dc A03(C0551Ij c0551Ij) throws C0360Af {
        A0A(3, c0551Ij, false);
        int len = (int) c0551Ij.A0K();
        String strA0S = c0551Ij.A0S(len);
        int len2 = strA0S.length();
        int i = 7 + 4 + len2;
        long jA0K = c0551Ij.A0K();
        int len3 = (int) jA0K;
        String[] strArr = new String[len3];
        int i2 = i + 4;
        for (int i3 = 0; i3 < jA0K; i3++) {
            int i4 = (int) c0551Ij.A0K();
            strArr[i3] = c0551Ij.A0S(i4);
            int i5 = strArr[i3].length();
            i2 = i2 + 4 + i5;
        }
        int i6 = c0551Ij.A0E();
        int i7 = i6 & 1;
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        A01[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        if (i7 != 0) {
            return new C0422Dc(strA0S, strArr, i2 + 1);
        }
        String vendor = A05(198, 30, 6);
        throw new C0360Af(vendor);
    }

    public static void A07(int mappingsCount, DZ dz) throws C0360Af {
        int iA02;
        int iA022 = dz.A02(6) + 1;
        for (int i = 0; i < iA022; i++) {
            int iA023 = dz.A02(16);
            if (iA023 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES) + iA023);
            } else {
                if (dz.A04()) {
                    iA02 = dz.A02(4) + 1;
                } else {
                    iA02 = 1;
                }
                boolean zA04 = dz.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (zA04) {
                    int iA024 = dz.A02(8) + 1;
                    for (int i2 = 0; i2 < iA024; i2++) {
                        int i3 = mappingsCount - 1;
                        dz.A03(A00(i3));
                        int i4 = mappingsCount - 1;
                        dz.A03(A00(i4));
                    }
                }
                int i5 = dz.A02(2);
                if (i5 == 0) {
                    if (iA02 > 1) {
                        for (int i6 = 0; i6 < mappingsCount; i6++) {
                            dz.A03(4);
                        }
                    }
                    for (int i7 = 0; i7 < iA02; i7++) {
                        dz.A03(8);
                        dz.A03(8);
                        dz.A03(8);
                    }
                } else {
                    throw new C0360Af(A05(HttpStatus.SC_NOT_ACCEPTABLE, 58, 50));
                }
            }
        }
    }

    public static void A08(DZ dz) throws C0360Af {
        int iA02 = dz.A02(6) + 1;
        for (int floorType = 0; floorType < iA02; floorType++) {
            int iA022 = dz.A02(16);
            if (iA022 == 0) {
                dz.A03(8);
                dz.A03(16);
                dz.A03(16);
                dz.A03(6);
                dz.A03(8);
                int iA023 = dz.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < iA023; rangeBits++) {
                    dz.A03(8);
                }
            } else {
                if (iA022 != 1) {
                    throw new C0360Af(A05(114, 41, 126) + iA022);
                }
                int j = dz.A02(5);
                int i = -1;
                int[] iArr = new int[j];
                for (int i2 = 0; i2 < j; i2++) {
                    iArr[i2] = dz.A02(4);
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                int[] iArr2 = new int[i + 1];
                int i3 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i3 < length) {
                        iArr2[i3] = dz.A02(3) + 1;
                        int classSubclasses = dz.A02(2);
                        if (classSubclasses > 0) {
                            dz.A03(8);
                        }
                        for (int i4 = 0; i4 < (1 << classSubclasses); i4++) {
                            dz.A03(8);
                        }
                        i3++;
                    } else {
                        dz.A03(2);
                        int count = dz.A02(4);
                        int i5 = 0;
                        int i6 = 0;
                        for (int k = 0; k < j; k++) {
                            int rangeBits2 = iArr[k];
                            i5 += iArr2[rangeBits2];
                            while (i6 < i5) {
                                dz.A03(count);
                                i6++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(DZ dz) throws C0360Af {
        int iA02 = dz.A02(6) + 1;
        for (int classifications = 0; classifications < iA02; classifications++) {
            if (dz.A02(16) <= 2) {
                dz.A03(24);
                dz.A03(24);
                dz.A03(24);
                int iA022 = dz.A02(6) + 1;
                dz.A03(8);
                int[] iArr = new int[iA022];
                for (int i = 0; i < iA022; i++) {
                    int iA023 = 0;
                    int iA024 = dz.A02(3);
                    if (dz.A04()) {
                        iA023 = dz.A02(5);
                    }
                    int highBits = iA023 * 8;
                    iArr[i] = highBits + iA024;
                }
                for (int i2 = 0; i2 < iA022; i2++) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        int k = 1 << i3;
                        if ((iArr[i2] & k) != 0) {
                            dz.A03(8);
                        }
                    }
                }
            } else {
                throw new C0360Af(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i, C0551Ij c0551Ij, boolean z) throws C0360Af {
        if (c0551Ij.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C0360Af(A05(464, 18, 64) + c0551Ij.A04());
        }
        if (c0551Ij.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C0360Af(A05(93, 21, 10) + Integer.toHexString(i));
        }
        if (c0551Ij.A0E() != 118 || c0551Ij.A0E() != 111 || c0551Ij.A0E() != 114 || c0551Ij.A0E() != 98 || c0551Ij.A0E() != 105 || c0551Ij.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C0360Af(A05(10, 28, 24));
        }
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
        strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
        return true;
    }

    public static Dd[] A0B(DZ dz) {
        int iA02 = dz.A02(6) + 1;
        Dd[] ddArr = new Dd[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            ddArr[windowType] = new Dd(dz.A04(), dz.A02(16), dz.A02(16), dz.A02(8));
        }
        return ddArr;
    }

    public static Dd[] A0C(C0551Ij c0551Ij, int i) throws C0360Af {
        A0A(5, c0551Ij, false);
        int i2 = c0551Ij.A0E() + 1;
        DZ dz = new DZ(c0551Ij.A00);
        dz.A03(c0551Ij.A06() * 8);
        for (int i3 = 0; i3 < i2; i3++) {
            A02(dz);
        }
        int iA02 = dz.A02(6) + 1;
        for (int timeCount = 0; timeCount < iA02; timeCount++) {
            int i4 = dz.A02(16);
            if (i4 != 0) {
                throw new C0360Af(A05(311, 52, 110));
            }
        }
        A08(dz);
        A09(dz);
        A07(i, dz);
        Dd[] ddArrA0B = A0B(dz);
        if (dz.A04()) {
            return ddArrA0B;
        }
        throw new C0360Af(A05(155, 43, 69));
    }
}
