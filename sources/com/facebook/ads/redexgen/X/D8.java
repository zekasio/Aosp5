package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D8 {
    public static byte[] A00;
    public static String[] A01 = {"vNU1Clptty9spXV3rmNWKqfECA0GCDno", "yQl7wYGB6utTXxK398wXXYrAeYZNPLId", "BVcq1q5Q", "NihUY4HxpsM0GkJJgFchlTfxDOIJFYzw", "lx4TwpHGLs68", "XI1Xq2FkjwcQfgB5bw70GFmYpaxAyyjl", "uRZmXRdJsodI", "Cygx2J1H2ENb6XLRYlHXnR1vUW4XHHOP"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{49, 37, 119, 106, 114, 102, 110, 115, 110, 115, 108, 88, 102, 114, 117, 113, 106, 120, 70, 121, 89, 110, 114, 106, 120, 121, 102, 114, 117, 73, 106, 113, 121, 102, 37, -112, -124, -42, -55, -47, -59, -51, -46, -51, -46, -53, -73, -59, -47, -44, -48, -55, -41, -83, -46, -89, -52, -39, -46, -49, -124, 71, 59, -115, ByteCompanionObject.MIN_VALUE, -120, 124, -124, -119, -124, -119, -126, 111, -124, -120, ByteCompanionObject.MIN_VALUE, -114, -113, 124, -120, -117, 95, ByteCompanionObject.MIN_VALUE, -121, -113, 124, 94, -125, 124, -119, -126, ByteCompanionObject.MIN_VALUE, -114, 59, -110, 120, -54, -67, -59, -71, -63, -58, -63, -58, -65, -85, -47, -58, -69, -64, -54, -57, -58, -63, -46, -71, -52, -63, -57, -58, -85, -71, -59, -56, -60, -67, -53, 120, 100, -105, -110, -112, 115, -124, -107, -106, -120, -107, -106, -76, -46, -39, -38, -35, -44, -39, -46, -117, -48, -49, -44, -33, -117, -41, -44, -34, -33, -91, -117, -48, -49, -44, -33, -117, -49, -38, -48, -34, -117, -39, -38, -33, -117, -34, -33, -52, -35, -33, -117, -30, -44, -33, -45, -117, -52, -117, -34, -28, -39, -50, -117, -34, -52, -40, -37, -41, -48, -103, -110, -73, -84, -72, -73, -68, -78, -68, -67, -82, -73, -67, 105, -68, -67, -85, -75, 105, -85, -72, -63, 105, -81, -72, -69, 105, -67, -69, -86, -84, -76, 105, 117, -109, -126, -124, -116, 65, -119, -126, -108, 65, -113, -112, 65, -108, -126, -114, -111, -115, -122, 65, -107, -126, -125, -115, -122, 65, -108, -118, -101, -122, 65, -118, -113, -121, -112, -109, -114, -126, -107, -118, -112, -113, -120, -95, -90, -88, -93, -93, -94, -91, -89, -104, -105, 83, -96, -104, -105, -100, -108, 83, -91, -108, -89, -104, 97, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -13, -13, -20, -21, -86, -9, -20, -21, -90, -75, -75, -79, -82, -88, -90, -71, -82, -76, -77, 116, -67, 114, -88, -90, -78, -86, -73, -90, 114, -78, -76, -71, -82, -76, -77, -78, -63, -63, -67, -70, -76, -78, -59, -70, -64, -65, ByteCompanionObject.MIN_VALUE, -55, 126, -66, -63, -123, 126, -76, -74, -78, 126, -121, -127, -119, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -77, -74, 122, 115, -68, -70, -70, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -85, -81, -93, -99, -91, -82, -93, -89, -97, 103, -82, -78, 109, -95, 124, -112, 127, -124, -118, 74, 78, -126, -117, -117, -126, -106, -123, -118, -112, 80, -126, -124, 84, -69, -49, -66, -61, -55, -119, -69, -58, -69, -67, -33, -13, -30, -25, -19, -83, -33, -21, -16, -85, -11, -32, 107, 127, 110, 115, 121, 57, 111, 107, 109, 61, -109, -89, -106, -101, -95, 97, -97, -94, 102, -109, 95, -98, -109, -90, -97, -65, -45, -62, -57, -51, -115, -53, -50, -61, -59, -68, -48, -65, -60, -54, -118, -51, -68, -46, -94, -74, -91, -86, -80, 112, -73, -81, -91, 111, -91, -75, -76, -87, -67, -84, -79, -73, 119, -66, -74, -84, 118, -84, -68, -69, 118, -80, -84, 109, -127, 112, 117, 123, 59, -126, 122, 112, 58, 112, ByteCompanionObject.MIN_VALUE, 127, 58, 116, 112, 71, 124, 126, 123, 114, 117, 120, 113, 73, 120, 110, 126, -119, -120, -119, 87, -32, -33, -32, -16, -124, -122, -113, -124, -43, -41, -32, -27, -110, -105, -104, -101, -109, 112, -93, -98, -100, -126, -104, -87, -108, 79, -94, -105, -98, -92, -101, -109, 79, -111, -108, 79, -97, -98, -94, -104, -93, -104, -91, -108, 101, 110, 101, 114, -119, -107, -112, -124, 67, -124, -105, -110, -112, 67, -116, -106, 67, -112, -124, -111, -121, -124, -105, -110, -107, -100, -50, -58, -43, -62, -100, -117, -99, -107, -99, -115, -110, -109, 74, -117, -98, -103, -105, 74, -109, -99, 74, -105, -117, -104, -114, -117, -98, -103, -100, -93, -51, -55, -49, -56, -108, -106, -125, -107, -59, -74, -65, -76, 113, -78, -59, -64, -66, 113, -70, -60, 113, -66, -78, -65, -75, -78, -59, -64, -61, -54, -48, -63, -44, -48, -39, -52, -57, -56, -77, -90, -95, -94, -84, 108, 112, -92, -83, -83, -52, -65, -70, -69, -59, -123, -73, -52, -71, -14, -27, -32, -31, -21, -85, -28, -31, -14, -33, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 85, -86, -99, -104, -103, -93, 99, -84, 97, -86, -94, -104, 98, -93, -94, 102, 98, -86, -92, 109};
    }

    static {
        A0J();
        A08 = C0567Iz.A08(A0I(696, 4, 97));
        A05 = C0567Iz.A08(A0I(662, 4, 88));
        A07 = C0567Iz.A08(A0I(692, 4, 90));
        A04 = C0567Iz.A08(A0I(636, 4, 39));
        A06 = C0567Iz.A08(A0I(666, 4, 31));
        A02 = C0567Iz.A08(A0I(606, 4, 0));
        A03 = C0567Iz.A08(A0I(632, 4, 95));
    }

    public static float A00(C0551Ij c0551Ij, int i) {
        c0551Ij.A0Y(i + 8);
        return c0551Ij.A0H() / c0551Ij.A0H();
    }

    public static int A01(C0551Ij c0551Ij) {
        int size = c0551Ij.A0E();
        int i = size & 127;
        while ((size & 128) == 128) {
            size = c0551Ij.A0E();
            i = (i << 7) | (size & 127);
        }
        return i;
    }

    public static int A02(C0551Ij c0551Ij) {
        c0551Ij.A0Y(16);
        int iA08 = c0551Ij.A08();
        if (iA08 == A05) {
            return 1;
        }
        int trackType = A08;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "sACqbdB9h4ZaSOP8RBXRhKf5pkODD9Ze";
        strArr[5] = "nfjFHkgcUdXk9ZZxpn0R0spMdbOfBjgH";
        if (iA08 == trackType) {
            return 2;
        }
        if (iA08 != A07 && iA08 != A04 && iA08 != A06 && iA08 != A02) {
            if (iA08 == A03) {
                return 4;
            }
            return -1;
        }
        String[] strArr2 = A01;
        if (strArr2[4].length() != strArr2[6].length()) {
            return 3;
        }
        String[] strArr3 = A01;
        strArr3[0] = "HjSYihfmO4Fjwo0SJsN86rpcIq24412o";
        strArr3[5] = "nDlBCf5sAdyqWE5fn1qZlgrWKnIrwKiA";
        return 3;
    }

    public static int A03(C0551Ij c0551Ij, int i, int i2) {
        int iA06 = c0551Ij.A06();
        while (iA06 - i < i2) {
            c0551Ij.A0Y(iA06);
            int iA08 = c0551Ij.A08();
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            if (c0551Ij.A08() == D3.A0S) {
                return iA06;
            }
            iA06 += iA08;
        }
        return -1;
    }

    public static long A04(C0551Ij c0551Ij) {
        int fullAtom = 8;
        c0551Ij.A0Y(8);
        int version = D3.A01(c0551Ij.A08());
        if (version != 0) {
            fullAtom = 16;
        }
        c0551Ij.A0Z(fullAtom);
        return c0551Ij.A0M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<long[], long[]> A05(com.facebook.ads.redexgen.X.C0897Wa r9) {
        /*
            if (r9 == 0) goto La
            int r0 = com.facebook.ads.redexgen.X.D3.A0O
            com.facebook.ads.redexgen.X.WZ r0 = r9.A07(r0)
            if (r0 != 0) goto L10
        La:
            r0 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r0)
            return r0
        L10:
            com.facebook.ads.redexgen.X.Ij r8 = r0.A00
            r0 = 8
            r8.A0Y(r0)
            int r0 = r8.A08()
            int r7 = com.facebook.ads.redexgen.X.D3.A01(r0)
            int r6 = r8.A0H()
            long[] r5 = new long[r6]
            long[] r4 = new long[r6]
            r3 = 0
        L28:
            if (r3 >= r6) goto L6d
            r9 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D8.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L3e
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            java.lang.String r1 = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn"
            r0 = 3
            r2[r0] = r1
            if (r7 != r9) goto L68
            long r0 = r8.A0N()
        L4b:
            r5[r3] = r0
            if (r7 != r9) goto L62
            long r0 = r8.A0L()
        L53:
            r4[r3] = r0
            short r0 = r8.A0U()
            if (r0 != r9) goto L86
            r0 = 2
            r8.A0Z(r0)
            int r3 = r3 + 1
            goto L28
        L62:
            int r0 = r8.A08()
            long r0 = (long) r0
            goto L53
        L68:
            long r0 = r8.A0M()
            goto L4b
        L6d:
            android.util.Pair r3 = android.util.Pair.create(r5, r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L96
            goto L38
        L86:
            r2 = 272(0x110, float:3.81E-43)
            r1 = 23
            r0 = 49
            java.lang.String r1 = A0I(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L96:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            java.lang.String r1 = "0OgbcJvER11tVuU6ktzS5zcploLwLpnU"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "Fpvfvil3v0kwqlJSCQAnqVBmdIeuMsHJ"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A05(com.facebook.ads.redexgen.X.Wa):android.util.Pair");
    }

    public static Pair<Long, String> A06(C0551Ij c0551Ij) {
        c0551Ij.A0Y(8);
        int iA01 = D3.A01(c0551Ij.A08());
        int version = iA01 == 0 ? 8 : 16;
        c0551Ij.A0Z(version);
        long jA0M = c0551Ij.A0M();
        int fullAtom = iA01 == 0 ? 4 : 8;
        c0551Ij.A0Z(fullAtom);
        int iA0I = c0551Ij.A0I();
        StringBuilder sb = new StringBuilder();
        sb.append(A0I(0, 0, 122));
        int version2 = iA0I >> 10;
        sb.append((char) ((version2 & 31) + 96));
        int version3 = iA0I >> 5;
        sb.append((char) ((version3 & 31) + 96));
        int version4 = iA0I & 31;
        sb.append((char) (version4 + 96));
        return Pair.create(Long.valueOf(jA0M), sb.toString());
    }

    public static Pair<String, byte[]> A07(C0551Ij c0551Ij, int i) {
        c0551Ij.A0Y(i + 8 + 4);
        c0551Ij.A0Z(1);
        A01(c0551Ij);
        c0551Ij.A0Z(2);
        int iA0E = c0551Ij.A0E();
        int flags = iA0E & 128;
        if (flags != 0) {
            c0551Ij.A0Z(2);
        }
        int flags2 = iA0E & 64;
        if (flags2 != 0) {
            int flags3 = c0551Ij.A0I();
            c0551Ij.A0Z(flags3);
        }
        int flags4 = iA0E & 32;
        if (flags4 != 0) {
            c0551Ij.A0Z(2);
        }
        c0551Ij.A0Z(1);
        A01(c0551Ij);
        int iA0E2 = c0551Ij.A0E();
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[5];
        int iCharAt = str.charAt(2);
        int flags5 = str2.charAt(2);
        if (iCharAt == flags5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "ipSJ7rerSzX8";
        strArr2[6] = "rVXKHnYgOQNY";
        String strA03 = C0544Ic.A03(iA0E2);
        String mimeType = A0I(482, 10, 92);
        if (!mimeType.equals(strA03)) {
            String mimeType2 = A0I(HttpStatus.SC_NOT_IMPLEMENTED, 13, 63);
            if (!mimeType2.equals(strA03)) {
                String mimeType3 = A0I(514, 16, 70);
                if (!mimeType3.equals(strA03)) {
                    c0551Ij.A0Z(12);
                    c0551Ij.A0Z(1);
                    int iA01 = A01(c0551Ij);
                    byte[] bArr = new byte[iA01];
                    c0551Ij.A0c(bArr, 0, iA01);
                    return Pair.create(strA03, bArr);
                }
            }
        }
        Pair<String, byte[]> pairCreate = Pair.create(strA03, null);
        if (A01[3].charAt(8) != 'p') {
            return pairCreate;
        }
        String[] strArr3 = A01;
        strArr3[1] = "09LVPMUcXpQFix5jag1XMCG3MLP6JHGE";
        strArr3[7] = "l6DCOVwnZaQMuPJJN9SXx5QHr45WFHuE";
        return pairCreate;
    }

    public static Pair<Integer, DP> A08(C0551Ij c0551Ij, int schemeInformationBoxPosition, int schemeInformationBoxSize) {
        int i = schemeInformationBoxPosition + 8;
        int i2 = -1;
        int childAtomSize = 0;
        String strA0S = null;
        Integer numValueOf = null;
        while (true) {
            int i3 = i - schemeInformationBoxPosition;
            if (A01[3].charAt(8) != 'p') {
                throw new RuntimeException();
            }
            A01[2] = "AMwqROlZ";
            if (i3 < schemeInformationBoxSize) {
                c0551Ij.A0Y(i);
                int iA08 = c0551Ij.A08();
                int iA082 = c0551Ij.A08();
                if (iA082 == D3.A0T) {
                    numValueOf = Integer.valueOf(c0551Ij.A08());
                } else if (iA082 == D3.A0z) {
                    c0551Ij.A0Z(4);
                    strA0S = c0551Ij.A0S(4);
                } else if (iA082 == D3.A0y) {
                    i2 = i;
                    childAtomSize = iA08;
                }
                i += iA08;
            } else {
                if (A0I(566, 4, 31).equals(strA0S) || A0I(558, 4, 36).equals(strA0S) || A0I(570, 4, 112).equals(strA0S) || A0I(562, 4, 123).equals(strA0S)) {
                    boolean z = true;
                    IK.A05(numValueOf != null, A0I(610, 22, 33));
                    IK.A05(i2 != -1, A0I(640, 22, 40));
                    DP dpA0D = A0D(c0551Ij, i2, childAtomSize, strA0S);
                    if (dpA0D == null) {
                        z = false;
                    }
                    IK.A05(z, A0I(670, 22, 79));
                    return Pair.create(numValueOf, dpA0D);
                }
                return null;
            }
        }
    }

    public static Pair<Integer, DP> A09(C0551Ij c0551Ij, int i, int i2) {
        Pair<Integer, DP> pairA08;
        int iA06 = c0551Ij.A06();
        while (iA06 - i < i2) {
            c0551Ij.A0Y(iA06);
            int iA08 = c0551Ij.A08();
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            if (c0551Ij.A08() == D3.A13 && (pairA08 = A08(c0551Ij, iA06, iA08)) != null) {
                return pairA08;
            }
            iA06 += iA08;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.D6 A0A(com.facebook.ads.redexgen.X.C0551Ij r24, int r25, int r26, java.lang.String r27, com.facebook.ads.internal.exoplayer2.drm.DrmInitData r28, boolean r29) throws com.facebook.ads.redexgen.X.C0360Af {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0A(com.facebook.ads.redexgen.X.Ij, int, int, java.lang.String, com.facebook.ads.internal.exoplayer2.drm.DrmInitData, boolean):com.facebook.ads.redexgen.X.D6");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.D7 A0B(com.facebook.ads.redexgen.X.C0551Ij r11) {
        /*
            r9 = 8
            r11.A0Y(r9)
            int r0 = r11.A08()
            int r8 = com.facebook.ads.redexgen.X.D3.A01(r0)
            r7 = 16
            if (r8 != 0) goto Lc0
            r0 = 8
        L13:
            r11.A0Z(r0)
            int r5 = r11.A08()
            r6 = 4
            r11.A0Z(r6)
            r4 = 1
            int r3 = r11.A06()
            if (r8 != 0) goto L26
            r9 = 4
        L26:
            r2 = 0
        L27:
            if (r2 >= r9) goto L33
            byte[] r1 = r11.A00
            int r0 = r3 + r2
            r1 = r1[r0]
            r0 = -1
            if (r1 == r0) goto Lbc
            r4 = 0
        L33:
            if (r4 == 0) goto La5
            r11.A0Z(r9)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L3d:
            r11.A0Z(r7)
            int r9 = r11.A08()
            int r8 = r11.A08()
            r11.A0Z(r6)
            int r7 = r11.A08()
            int r6 = r11.A08()
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r9 != 0) goto L66
            if (r8 != r10) goto L66
            int r0 = -r10
            if (r7 != r0) goto L66
            if (r6 != 0) goto L66
            r1 = 90
        L60:
            com.facebook.ads.redexgen.X.D7 r0 = new com.facebook.ads.redexgen.X.D7
            r0.<init>(r5, r3, r1)
            return r0
        L66:
            if (r9 != 0) goto L96
            int r11 = -r10
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L81
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L81:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D8.A01
            java.lang.String r1 = "i5DrkfhddIOc"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "TqiRE9mqRyND"
            r0 = 6
            r2[r0] = r1
            if (r8 != r11) goto L96
            if (r7 != r10) goto L96
            if (r6 != 0) goto L96
            r1 = 270(0x10e, float:3.78E-43)
            goto L60
        L96:
            int r0 = -r10
            if (r9 != r0) goto La3
            if (r8 != 0) goto La3
            if (r7 != 0) goto La3
            int r0 = -r10
            if (r6 != r0) goto La3
            r1 = 180(0xb4, float:2.52E-43)
            goto L60
        La3:
            r1 = 0
            goto L60
        La5:
            if (r8 != 0) goto Lb7
            long r3 = r11.A0M()
        Lab:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L3d
        Lb7:
            long r3 = r11.A0N()
            goto Lab
        Lbc:
            int r2 = r2 + 1
            goto L27
        Lc0:
            r0 = 16
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0B(com.facebook.ads.redexgen.X.Ij):com.facebook.ads.redexgen.X.D7");
    }

    public static DO A0C(C0897Wa c0897Wa, WZ wz, long j, DrmInitData drmInitData, boolean z, boolean z2) throws C0360Af {
        long jA0F;
        long j2 = j;
        C0897Wa c0897WaA06 = c0897Wa.A06(D3.A0d);
        int iA02 = A02(c0897WaA06.A07(D3.A0V).A00);
        if (iA02 == -1) {
            return null;
        }
        WZ wzA07 = c0897Wa.A07(D3.A1J);
        if (A01[3].charAt(8) != 'p') {
            throw new RuntimeException();
        }
        A01[2] = "QWUsjPBg";
        D7 d7A0B = A0B(wzA07.A00);
        if (j2 == -9223372036854775807L) {
            j2 = d7A0B.A02;
        }
        long jA04 = A04(wz.A00);
        if (j2 == -9223372036854775807L) {
            jA0F = -9223372036854775807L;
        } else {
            jA0F = C0567Iz.A0F(j2, 1000000L, jA04);
        }
        C0897Wa c0897WaA062 = c0897WaA06.A06(D3.A0h).A06(D3.A16);
        Pair<Long, String> pairA06 = A06(c0897WaA06.A07(D3.A0c).A00);
        D6 d6A0A = A0A(c0897WaA062.A07(D3.A1A).A00, d7A0B.A00, d7A0B.A01, (String) pairA06.second, drmInitData, z2);
        long[] editListDurations = null;
        long[] jArr = null;
        if (!z) {
            Pair<long[], long[]> pairA05 = A05(c0897Wa.A06(D3.A0N));
            editListDurations = (long[]) pairA05.first;
            jArr = (long[]) pairA05.second;
        }
        if (d6A0A.A02 == null) {
            return null;
        }
        return new DO(d7A0B.A00, iA02, ((Long) pairA06.first).longValue(), jA04, jA0F, d6A0A.A02, d6A0A.A01, d6A0A.A03, d6A0A.A00, editListDurations, jArr);
    }

    public static DP A0D(C0551Ij c0551Ij, int childPosition, int i, String str) {
        int constantIvSize = childPosition + 8;
        while (constantIvSize - childPosition < i) {
            c0551Ij.A0Y(constantIvSize);
            int defaultCryptByteBlock = c0551Ij.A08();
            if (c0551Ij.A08() == D3.A1G) {
                int version = D3.A01(c0551Ij.A08());
                boolean z = true;
                c0551Ij.A0Z(1);
                int i2 = 0;
                int i3 = 0;
                if (version == 0) {
                    c0551Ij.A0Z(1);
                } else {
                    int defaultSkipByteBlock = c0551Ij.A0E();
                    int patternByte = defaultSkipByteBlock & 240;
                    i2 = patternByte >> 4;
                    i3 = defaultSkipByteBlock & 15;
                }
                int version2 = c0551Ij.A0E();
                if (version2 != 1) {
                    z = false;
                }
                int iA0E = c0551Ij.A0E();
                byte[] bArr = new byte[16];
                int defaultPerSampleIvSize = bArr.length;
                c0551Ij.A0c(bArr, 0, defaultPerSampleIvSize);
                byte[] bArr2 = null;
                if (z && iA0E == 0) {
                    int iA0E2 = c0551Ij.A0E();
                    bArr2 = new byte[iA0E2];
                    c0551Ij.A0c(bArr2, 0, iA0E2);
                    if (A01[2].length() != 8) {
                        throw new RuntimeException();
                    }
                    A01[2] = "N18HcU44";
                }
                return new DP(z, str, iA0E, bArr, i2, i3, bArr2);
            }
            constantIvSize += defaultCryptByteBlock;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.DR A0E(com.facebook.ads.redexgen.X.DO r38, com.facebook.ads.redexgen.X.C0897Wa r39, com.facebook.ads.redexgen.X.C0411Cg r40) throws com.facebook.ads.redexgen.X.C0360Af {
        /*
            Method dump skipped, instruction units count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0E(com.facebook.ads.redexgen.X.DO, com.facebook.ads.redexgen.X.Wa, com.facebook.ads.redexgen.X.Cg):com.facebook.ads.redexgen.X.DR");
    }

    public static Metadata A0F(WZ wz, boolean z) {
        if (z) {
            return null;
        }
        C0551Ij c0551Ij = wz.A00;
        c0551Ij.A0Y(8);
        while (c0551Ij.A04() >= 8) {
            int iA06 = c0551Ij.A06();
            int iA08 = c0551Ij.A08();
            int iA082 = c0551Ij.A08();
            int atomType = D3.A0g;
            if (iA082 == atomType) {
                c0551Ij.A0Y(iA06);
                return A0H(c0551Ij, iA06 + iA08);
            }
            int atomType2 = iA08 - 8;
            c0551Ij.A0Z(atomType2);
        }
        return null;
    }

    public static Metadata A0G(C0551Ij c0551Ij, int i) {
        c0551Ij.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (c0551Ij.A06() < i) {
            Metadata.Entry entryA01 = DG.A01(c0551Ij);
            if (entryA01 != null) {
                arrayList.add(entryA01);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(C0551Ij c0551Ij, int i) {
        c0551Ij.A0Z(12);
        while (c0551Ij.A06() < i) {
            int iA06 = c0551Ij.A06();
            int iA08 = c0551Ij.A08();
            int iA082 = c0551Ij.A08();
            int atomType = D3.A0Z;
            if (iA082 == atomType) {
                c0551Ij.A0Y(iA06);
                return A0G(c0551Ij, iA06 + iA08);
            }
            int atomType2 = iA08 - 8;
            c0551Ij.A0Z(atomType2);
        }
        return null;
    }

    public static void A0K(C0551Ij c0551Ij, int i, int i2, int i3, int i4, int width, DrmInitData drmInitData, D6 d6, int childPosition) throws C0360Af {
        DrmInitData drmInitDataA02 = drmInitData;
        int stereoMode = i;
        c0551Ij.A0Y(i2 + 8 + 8);
        c0551Ij.A0Z(16);
        int iA0I = c0551Ij.A0I();
        int iA0I2 = c0551Ij.A0I();
        boolean z = false;
        float fA00 = 1.0f;
        c0551Ij.A0Z(50);
        int iA06 = c0551Ij.A06();
        int height = D3.A0R;
        if (stereoMode == height) {
            Pair<Integer, DP> pairA09 = A09(c0551Ij, i2, i3);
            if (pairA09 != null) {
                stereoMode = ((Integer) pairA09.first).intValue();
                if (drmInitDataA02 == null) {
                    drmInitDataA02 = null;
                } else {
                    drmInitDataA02 = drmInitDataA02.A02(((DP) pairA09.second).A02);
                }
                d6.A03[childPosition] = (DP) pairA09.second;
            }
            c0551Ij.A0Y(iA06);
        }
        List<byte[]> listSingletonList = null;
        String strA0I = null;
        byte[] bArrA0O = null;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "nt1AbbZdLf7H";
        strArr[6] = "te59XVvfeUPr";
        int i5 = -1;
        while (iA06 - i2 < i3) {
            c0551Ij.A0Y(iA06);
            int iA062 = c0551Ij.A06();
            int iA08 = c0551Ij.A08();
            if (iA08 == 0 && c0551Ij.A06() - i2 == i3) {
                break;
            }
            IK.A05(iA08 > 0, A0I(574, 32, 45));
            int iA082 = c0551Ij.A08();
            if (iA082 == D3.A08) {
                IK.A04(strA0I == null);
                strA0I = A0I(710, 9, 84);
                c0551Ij.A0Y(iA062 + 8);
                J1 j1A00 = J1.A00(c0551Ij);
                listSingletonList = j1A00.A04;
                d6.A00 = j1A00.A02;
                if (!z) {
                    fA00 = j1A00.A00;
                }
            } else if (iA082 == D3.A0Y) {
                IK.A04(strA0I == null);
                strA0I = A0I(719, 10, 122);
                c0551Ij.A0Y(iA062 + 8);
                J7 j7A00 = J7.A00(c0551Ij);
                listSingletonList = j7A00.A01;
                d6.A00 = j7A00.A00;
            } else if (iA082 == D3.A1U) {
                IK.A04(strA0I == null);
                strA0I = stereoMode == D3.A1S ? A0I(729, 19, 27) : A0I(748, 19, 50);
            } else if (iA082 == D3.A0D) {
                IK.A04(strA0I == null);
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "qKPn33WXRD1J";
                strArr2[6] = "UtAkzKHIBavs";
                strA0I = A0I(700, 10, 59);
            } else if (iA082 == D3.A0S) {
                IK.A04(strA0I == null);
                Pair<String, byte[]> pairA07 = A07(c0551Ij, iA062);
                strA0I = (String) pairA07.first;
                listSingletonList = Collections.singletonList((byte[]) pairA07.second);
            } else if (iA082 == D3.A0p) {
                fA00 = A00(c0551Ij, iA062);
                z = true;
            } else if (iA082 == D3.A1F) {
                bArrA0O = A0O(c0551Ij, iA062, iA08);
            } else if (iA082 == D3.A15) {
                int iA0E = c0551Ij.A0E();
                c0551Ij.A0Z(3);
                if (iA0E == 0) {
                    int iA0E2 = c0551Ij.A0E();
                    if (iA0E2 == 0) {
                        i5 = 0;
                    } else if (iA0E2 == 1) {
                        i5 = 1;
                    } else if (iA0E2 != 2) {
                        if (iA0E2 == 3) {
                            i5 = 3;
                        }
                    } else {
                        i5 = 2;
                    }
                }
            }
            iA06 += iA08;
        }
        if (strA0I == null) {
            return;
        }
        d6.A02 = Format.A04(Integer.toString(i4), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, width, fA00, bArrA0O, i5, null, drmInitDataA02);
    }

    public static void A0L(C0551Ij c0551Ij, int i, int i2, int i3, int i4, String str, D6 d6) throws C0360Af {
        String strA0I;
        c0551Ij.A0Y(i2 + 8 + 8);
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i == D3.A02) {
            strA0I = A0I(295, 20, 125);
        } else if (i == D3.A1O) {
            strA0I = A0I(388, 28, 56);
            int i5 = (i3 - 8) - 8;
            byte[] bArr = new byte[i5];
            c0551Ij.A0c(bArr, 0, i5);
            listSingletonList = Collections.singletonList(bArr);
        } else if (i == D3.A1W) {
            strA0I = A0I(367, 21, 68);
        } else if (i == D3.A18) {
            strA0I = A0I(295, 20, 125);
            j = 0;
        } else if (i == D3.A09) {
            strA0I = A0I(342, 25, 79);
            d6.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        d6.A02 = Format.A09(Integer.toString(i4), strA0I, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0M(com.facebook.ads.redexgen.X.C0551Ij r32, int r33, int r34, int r35, int r36, java.lang.String r37, boolean r38, com.facebook.ads.internal.exoplayer2.drm.DrmInitData r39, com.facebook.ads.redexgen.X.D6 r40, int r41) throws com.facebook.ads.redexgen.X.C0360Af {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D8.A0M(com.facebook.ads.redexgen.X.Ij, int, int, int, int, java.lang.String, boolean, com.facebook.ads.internal.exoplayer2.drm.DrmInitData, com.facebook.ads.redexgen.X.D6, int):void");
    }

    public static boolean A0N(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0567Iz.A06(3, 0, length);
        return jArr[0] <= j2 && j2 < jArr[latestDelayIndex] && jArr[C0567Iz.A06(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    public static byte[] A0O(C0551Ij c0551Ij, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c0551Ij.A0Y(i3);
            int iA08 = c0551Ij.A08();
            if (c0551Ij.A08() == D3.A0q) {
                return Arrays.copyOfRange(c0551Ij.A00, i3, i3 + iA08);
            }
            i3 += iA08;
        }
        return null;
    }
}
