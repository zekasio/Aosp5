package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BA {
    public static byte[] A00;
    public static String[] A01 = {"VvJRVU69OBzslE4p0Zfahzrb3nPsCKe", "zB", "Dc8Zie1A4h", "IkzAL6jiMaNeqHCHyOgeN31JBtAuXgmh", "IvEhEJvdlav", "U0ZY", "AtQ7wNEb", "nSd2surlWGidCnNOvkjufSfipgX2"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-12, 8, -9, -4, 2, -62, -12, -10, -58, -90, -70, -87, -82, -76, 116, -86, -90, -88, 120, -76, -56, -73, -68, -62, -126, -72, -76, -74, -122, ByteCompanionObject.MIN_VALUE, -67, -62, -74};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r3 == 32000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return r4 * 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r3 == 8056) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r3 = r4 * 4;
        r2 = com.facebook.ads.redexgen.X.BA.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r2[5].length() == r2[0].length()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        com.facebook.ads.redexgen.X.BA.A01[1] = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int r5, int r6) {
        /*
            int r4 = r6 / 2
            if (r5 < 0) goto L10
            int[] r2 = com.facebook.ads.redexgen.X.BA.A05
            int r0 = r2.length
            if (r5 >= r0) goto L10
            if (r6 < 0) goto L10
            int[] r1 = com.facebook.ads.redexgen.X.BA.A07
            int r0 = r1.length
            if (r4 < r0) goto L12
        L10:
            r0 = -1
            return r0
        L12:
            r3 = r2[r5]
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r3 != r0) goto L3b
            r3 = r1[r4]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BA.A01
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L35
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BA.A01
            java.lang.String r1 = "4eRsFOebWHxxrQNWOVJDeIaBrSAlnNpc"
            r0 = 3
            r2[r0] = r1
            int r0 = r6 % 2
            int r3 = r3 + r0
            int r0 = r3 * 2
            return r0
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3b:
            int[] r0 = com.facebook.ads.redexgen.X.BA.A02
            r4 = r0[r4]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BA.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L59
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BA.A01
            java.lang.String r1 = "WxhxKdWnRRsy4vVQ2SEOPzEThBAjhQcp"
            r0 = 3
            r2[r0] = r1
            r0 = 32000(0x7d00, float:4.4842E-41)
            if (r3 != r0) goto L6a
        L56:
            int r0 = r4 * 6
            return r0
        L59:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BA.A01
            java.lang.String r1 = "awXe"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "jT30HYGFGhYnOVyWil5hlLZLvnTO5rb"
            r0 = 0
            r2[r0] = r1
            r0 = 8056(0x1f78, float:1.1289E-41)
            if (r3 != r0) goto L6a
            goto L56
        L6a:
            int r3 = r4 * 4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BA.A01
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L86
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BA.A01
            java.lang.String r1 = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI"
            r0 = 1
            r2[r0] = r1
            return r3
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BA.A01(int, int):int");
    }

    public static int A02(ByteBuffer byteBuffer) {
        int endIndex = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = endIndex; i <= iLimit; i++) {
            int i2 = i + 4;
            if ((byteBuffer.getInt(i2) & (-16777217)) == -1167101192) {
                return i - endIndex;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? A03[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length >= 5) {
            int fscod = (bArr[4] & 192) >> 6;
            return A01(fscod, bArr[4] & 63);
        }
        if (A01[7].length() == 0) {
            throw new RuntimeException();
        }
        A01[6] = "NuFbE2RcGiFtx9wQ";
        return -1;
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static Format A07(C0551Ij c0551Ij, String str, String str2, DrmInitData drmInitData) {
        int i = A05[(c0551Ij.A0E() & 192) >> 6];
        int iA0E = c0551Ij.A0E();
        int nextByte = A04[(iA0E & 56) >> 3];
        if ((iA0E & 4) != 0) {
            nextByte++;
        }
        return Format.A07(str, A0A(0, 9, 127), null, -1, -1, nextByte, i, null, drmInitData, 0, str2);
    }

    public static Format A08(C0551Ij c0551Ij, String str, String str2, DrmInitData drmInitData) {
        c0551Ij.A0Z(2);
        int i = A05[(c0551Ij.A0E() & 192) >> 6];
        int iA0E = c0551Ij.A0E();
        int channelCount = A04[(iA0E & 14) >> 1];
        if ((iA0E & 1) != 0) {
            channelCount++;
        }
        int numDepSub = (c0551Ij.A0E() & 30) >> 1;
        if (numDepSub > 0) {
            int numDepSub2 = c0551Ij.A0E();
            if ((numDepSub2 & 2) != 0) {
                channelCount += 2;
            }
        }
        String strA0A = A0A(9, 10, 49);
        if (c0551Ij.A04() > 0 && (c0551Ij.A0E() & 1) != 0) {
            strA0A = A0A(19, 14, 63);
        }
        return Format.A07(str, strA0A, null, -1, -1, channelCount, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.B9 A09(com.facebook.ads.redexgen.X.C0550Ii r19) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BA.A09(com.facebook.ads.redexgen.X.Ii):com.facebook.ads.redexgen.X.B9");
    }
}
