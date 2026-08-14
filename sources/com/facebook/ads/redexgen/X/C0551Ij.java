package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0551Ij {
    public static byte[] A03;
    public static String[] A04 = {"HJCnnsvFRKCxDDAbEWuhDIcdg3xeT1pm", "aXWy8CvsRXCMVcJtmBA1wVRdgUuSFZpH", "GQPvM", "pDI65rPXKWggiakX8tUTXOsWDv9apWvH", "LM6A01RjpialbK5Oi", "vEfQavrNrAXrkYYeEOthMrPonFtv4Upj", "EEXi7u9hiAizt85cGACEO5SSNblzx1I5", "5Jpn3XfqvoPj"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-33, 4, Ascii.FF, -9, 2, -1, -6, -74, -21, -22, -36, -61, -50, -74, 9, -5, 7, Ascii.VT, -5, 4, -7, -5, -74, -7, 5, 4, 10, -1, 4, Ascii.VT, -9, 10, -1, 5, 4, -74, -8, Ascii.SI, 10, -5, -48, -74, -67, -30, -22, -43, -32, -35, -40, -108, -55, -56, -70, -95, -84, -108, -25, -39, -27, -23, -39, -30, -41, -39, -108, -38, -35, -26, -25, -24, -108, -42, -19, -24, -39, -82, -108, -113, -86, -85, 91, -99, -92, -81, 91, -87, -86, -81, 91, -75, -96, -83, -86, 117, 91, -49, -50, -64, -89, -78};
    }

    static {
        A01();
    }

    public C0551Ij() {
    }

    public C0551Ij(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C0551Ij(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C0551Ij(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 24;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & UByte.MAX_VALUE) << 8);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return (bArr[i7] & UByte.MAX_VALUE) | i6;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & UByte.MAX_VALUE) << 24) >> 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i4;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & UByte.MAX_VALUE) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return ((bArr[i7] & UByte.MAX_VALUE) << 24) | i6;
    }

    public final int A0B() {
        int iA0A = A0A();
        if (iA0A >= 0) {
            return iA0A;
        }
        throw new IllegalStateException(A00(77, 18, 35) + iA0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i2;
    }

    public final int A0D() {
        int b2 = A0E();
        int b3 = A0E();
        int b4 = A0E();
        int b22 = (b2 << 21) | (b3 << 14);
        int b32 = b4 << 7;
        return b22 | b32 | A0E();
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = (bArr[i3] & UByte.MAX_VALUE) | i2;
        this.A02 += 2;
        return i4;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 16;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i4;
    }

    public final int A0H() {
        int iA08 = A08();
        if (iA08 >= 0) {
            return iA08;
        }
        throw new IllegalStateException(A00(77, 18, 35) + iA08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (bArr[i3] & UByte.MAX_VALUE) | i2;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | ((255 & ((long) bArr[i8])) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | ((255 & ((long) bArr[i4])) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | (255 & ((long) bArr[i8]));
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | (255 & ((long) bArr[i4]));
    }

    public final long A0N() {
        long jA0L = A0L();
        if (jA0L >= 0) {
            return jA0L;
        }
        throw new IllegalStateException(A00(77, 18, 35) + jA0L);
    }

    public final long A0O() {
        int i = 0;
        long j = this.A00[this.A02];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int j2 = 1 << i2;
            long j3 = ((long) j2) & j;
            if (A04[3].charAt(7) == 'H') {
                throw new RuntimeException();
            }
            A04[7] = "lhGNf9ZIwuKG";
            if (j3 != 0) {
                i2--;
            } else if (i2 < 6) {
                int j4 = 1 << i2;
                j &= (long) (j4 - 1);
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            int i3 = 1;
            while (i3 < i) {
                byte[] bArr = this.A00;
                int i4 = this.A02;
                byte b = bArr[i4 + i3];
                if ((b & 192) == 128) {
                    long j5 = j << 6;
                    String[] strArr = A04;
                    String str = strArr[5];
                    String str2 = strArr[6];
                    int iCharAt = str.charAt(9);
                    int i5 = str2.charAt(9);
                    if (iCharAt != i5) {
                        A04[7] = "BvJ8XuqLfWkj";
                        int i6 = b & 63;
                        j = j5 | ((long) i6);
                        i3 += 0;
                    } else {
                        A04[7] = "bl64THqm1YbP";
                        int i7 = b & 63;
                        j = j5 | ((long) i7);
                        i3++;
                    }
                } else {
                    throw new NumberFormatException(A00(0, 42, 126) + j);
                }
            }
            int i8 = this.A02;
            this.A02 = i8 + i;
            return j;
        }
        throw new NumberFormatException(A00(42, 35, 92) + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r6.A02 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r6.A02 == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L28
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0551Ij.A04
            r0 = 3
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L22
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0551Ij.A04
            java.lang.String r1 = "Lp13SRVWSAlchtHB237WPpHnlSgF4gaJ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rKST0dS6uAv5sauBNsTeIX1rNmAgPgcE"
            r0 = 6
            r2[r0] = r1
            return r3
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            int r5 = r6.A02
        L2a:
            int r0 = r6.A01
            if (r5 >= r0) goto L3b
            byte[] r0 = r6.A00
            r0 = r0[r5]
            boolean r0 = com.facebook.ads.redexgen.X.C0567Iz.A0d(r0)
            if (r0 != 0) goto L3b
            int r5 = r5 + 1
            goto L2a
        L3b:
            int r4 = r6.A02
            int r0 = r5 - r4
            r3 = 3
            if (r0 < r3) goto L5d
            byte[] r2 = r6.A00
            r1 = r2[r4]
            r0 = -17
            if (r1 != r0) goto L5d
            int r0 = r4 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L5d
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L5d
            int r4 = r4 + r3
            r6.A02 = r4
        L5d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r5 - r1
            java.lang.String r4 = com.facebook.ads.redexgen.X.C0567Iz.A0R(r2, r1, r0)
            r6.A02 = r5
            int r2 = r6.A02
            int r3 = r6.A01
            if (r2 != r3) goto L70
            return r4
        L70:
            byte[] r0 = r6.A00
            r1 = r0[r2]
            r0 = 13
            if (r1 != r0) goto La5
            int r0 = r2 + 1
            r6.A02 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0551Ij.A04
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0551Ij.A04
            java.lang.String r1 = "7WLwSFEg60VT5h1w5xCSRnUKgnyD8yNS"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "aRAvn4znRhpfiIQyr1UPz3MngzOxDO2U"
            r0 = 0
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
        L98:
            return r4
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0551Ij.A04
            java.lang.String r1 = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB"
            r0 = 3
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
            goto L98
        La5:
            byte[] r0 = r6.A00
            int r2 = r6.A02
            r1 = r0[r2]
            r0 = 10
            if (r1 != r0) goto Lb3
            int r0 = r2 + 1
            r6.A02 = r0
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0551Ij.A0P():java.lang.String");
    }

    public final String A0Q() {
        if (A04() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < this.A01 && this.A00[i] != 0) {
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        String strA0R = C0567Iz.A0R(bArr, i2, i - i2);
        this.A02 = i;
        int i3 = this.A02;
        if (i3 < this.A01) {
            this.A02 = i3 + 1;
        }
        return strA0R;
    }

    public final String A0R(int lastIndex) {
        if (lastIndex == 0) {
            return A00(0, 0, 47);
        }
        int i = lastIndex;
        int i2 = (this.A02 + lastIndex) - 1;
        if (i2 < this.A01 && this.A00[i2] == 0) {
            i--;
        }
        String strA0R = C0567Iz.A0R(this.A00, this.A02, i);
        this.A02 += lastIndex;
        return strA0R;
    }

    public final String A0S(int i) {
        return A0T(i, Charset.forName(A00(95, 5, 98)));
    }

    public final String A0T(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) ((bArr[i3] & UByte.MAX_VALUE) | i2);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        A0b(A05() < i ? new byte[i] : this.A00, i);
    }

    public final void A0X(int i) {
        IK.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Y(int i) {
        IK.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(C0550Ii c0550Ii, int i) {
        A0c(c0550Ii.A00, 0, i);
        c0550Ii.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
