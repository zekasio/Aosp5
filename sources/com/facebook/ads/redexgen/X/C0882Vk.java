package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.gms.drive.MetadataChangeSet;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0882Vk implements EG {
    public static byte[] A01;
    public static String[] A02 = {"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE, "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    public static final int A03;
    public static final ES A04;

    @Nullable
    public final ES A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ChapterFrame A06(C0551Ij c0551Ij, int i, int i2, boolean z, int i3, @Nullable ES es) throws UnsupportedEncodingException {
        int iA06 = c0551Ij.A06();
        int iA02 = A02(c0551Ij.A00, iA06);
        String str = new String(c0551Ij.A00, iA06, iA02 - iA06, A0I(169, 10, 52));
        c0551Ij.A0Y(iA02 + 1);
        int iA08 = c0551Ij.A08();
        int iA082 = c0551Ij.A08();
        long jA0M = c0551Ij.A0M();
        if (jA0M == 4294967295L) {
            jA0M = -1;
        }
        long jA0M2 = c0551Ij.A0M();
        if (jA0M2 == 4294967295L) {
            jA0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = iA06 + i;
        while (c0551Ij.A06() < i4) {
            Id3Frame id3FrameA0B = A0B(i2, c0551Ij, z, i3, es);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iA08, iA082, jA0M, jA0M2, id3FrameArr);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, Ascii.SO, 6, -12, 10, Ascii.ESC, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, Ascii.NAK, 2, 86, 67, 73, Ascii.DLE, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, -39, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, Ascii.SO, -7, -76, -7, Ascii.FF, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, Ascii.SI, 32, 65, 63, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, Ascii.SO, -5, 1, -70, 17, 3, Ascii.SO, 2, -70, 7, -5, 4, 9, Ascii.FF, -16, -1, Ascii.FF, Ascii.CR, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, Ascii.SI, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, Ascii.FF, -1, Ascii.CR, Ascii.CR, 3, 9, 8, -70, Ascii.CR, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, Ascii.VT, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, 63, 75, 67, Ascii.DC4, Ascii.CAN, Ascii.CAN, Ascii.CAN, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, Ascii.RS, 38, 63, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, Ascii.SUB, Ascii.NAK, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, Ascii.VT, -15, -18, 7, Ascii.FF, Ascii.SO, 9, 9, 8, Ascii.VT, Ascii.CR, -2, -3, -71, -4, 1, -6, Ascii.VT, -6, -4, Ascii.CR, -2, Ascii.VT, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, Ascii.DC2, Ascii.SYN, 10, Ascii.DLE, Ascii.SO, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, -31, -27, -39, -33, -35, -89, -30, -24, -33};
    }

    static {
        A0L();
        A04 = new C0883Vl();
        A03 = C0567Iz.A08(A0I(166, 3, 87));
    }

    public C0882Vk() {
        this(null);
    }

    public C0882Vk(@Nullable ES es) {
        this.A00 = es;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0551Ij c0551Ij, int i) {
        byte[] bArr = c0551Ij.A00;
        for (int iA06 = c0551Ij.A06(); iA06 + 1 < i; iA06++) {
            if ((bArr[iA06] & UByte.MAX_VALUE) == 255 && bArr[iA06 + 1] == 0) {
                System.arraycopy(bArr, iA06 + 2, bArr, iA06 + 1, (i - iA06) - 2);
                i--;
            }
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int iA02 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iA02;
        }
        while (iA02 < bArr.length - 1) {
            if (iA02 % 2 == 0 && bArr[iA02 + 1] == 0) {
                return iA02;
            }
            iA02 = A02(bArr, iA02 + 1);
        }
        return bArr.length;
    }

    public static ApicFrame A04(C0551Ij c0551Ij, int i, int i2) throws UnsupportedEncodingException {
        int iA02;
        String strA0M;
        int iA0E = c0551Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0551Ij.A0c(bArr, 0, i - 1);
        String strA0I = A0I(458, 6, 63);
        String strA0I2 = A0I(169, 10, 52);
        if (i2 == 2) {
            iA02 = 2;
            strA0M = strA0I + C0567Iz.A0M(new String(bArr, 0, 3, strA0I2));
            if (A0I(474, 9, 14).equals(strA0M)) {
                strA0M = A0I(464, 10, 41);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA0M = C0567Iz.A0M(new String(bArr, 0, iA02, strA0I2));
            if (strA0M.indexOf(47) == -1) {
                strA0M = strA0I + strA0M;
            }
        }
        int encoding = bArr[iA02 + 1] & UByte.MAX_VALUE;
        int i3 = iA02 + 2;
        int iA03 = A03(bArr, i3, iA0E);
        int descriptionEndIndex = iA03 - i3;
        String str = new String(bArr, i3, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int descriptionEndIndex2 = bArr.length;
        byte[] pictureData = A0N(bArr, iA00, descriptionEndIndex2);
        return new ApicFrame(strA0M, str, encoding, pictureData);
    }

    public static BinaryFrame A05(C0551Ij c0551Ij, int i, String str) {
        byte[] bArr = new byte[i];
        c0551Ij.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0551Ij c0551Ij, int framePosition, int elementIdEndIndex, boolean z, int i, @Nullable ES es) throws UnsupportedEncodingException {
        int iA06 = c0551Ij.A06();
        int iA02 = A02(c0551Ij.A00, iA06);
        String strA0I = A0I(169, 10, 52);
        String str = new String(c0551Ij.A00, iA06, iA02 - iA06, strA0I);
        c0551Ij.A0Y(iA02 + 1);
        int iA0E = c0551Ij.A0E();
        boolean z2 = (iA0E & 2) != 0;
        boolean z3 = (iA0E & 1) != 0;
        int ctocFlags = c0551Ij.A0E();
        String[] strArr = new String[ctocFlags];
        for (int childCount = 0; childCount < ctocFlags; childCount++) {
            int iA062 = c0551Ij.A06();
            int i2 = A02(c0551Ij.A00, iA062);
            strArr[childCount] = new String(c0551Ij.A00, iA062, i2 - iA062, strA0I);
            int startIndex = i2 + 1;
            c0551Ij.A0Y(startIndex);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = iA06 + framePosition;
        while (c0551Ij.A06() < i3) {
            Id3Frame id3FrameA0B = A0B(elementIdEndIndex, c0551Ij, z, i, es);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0551Ij c0551Ij, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iA0E = c0551Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] data = new byte[3];
        c0551Ij.A0c(data, 0, 3);
        String str = new String(data, 0, 3);
        byte[] bArr = new byte[i - 4];
        c0551Ij.A0c(bArr, 0, i - 4);
        int iA03 = A03(bArr, 0, iA0E);
        String str2 = new String(bArr, 0, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int textEndIndex = A03(bArr, iA00, iA0E);
        String text = A0K(bArr, iA00, textEndIndex, strA0H);
        return new CommentFrame(str, str2, text);
    }

    public static GeobFrame A09(C0551Ij c0551Ij, int i) throws UnsupportedEncodingException {
        int iA0E = c0551Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0551Ij.A0c(bArr, 0, i - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, A0I(169, 10, 52));
        int i2 = iA02 + 1;
        int filenameEndIndex = A03(bArr, i2, iA0E);
        String strA0K = A0K(bArr, i2, filenameEndIndex, strA0H);
        int iA00 = A00(iA0E) + filenameEndIndex;
        int filenameEndIndex2 = A03(bArr, iA00, iA0E);
        String strA0K2 = A0K(bArr, iA00, filenameEndIndex2, strA0H);
        int iA002 = A00(iA0E) + filenameEndIndex2;
        int objectDataStartIndex = bArr.length;
        return new GeobFrame(str, strA0K, strA0K2, A0N(bArr, iA002, objectDataStartIndex));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[PHI: r2 r3 r5 r6
      0x0084: PHI (r2v11 'majorVersion' int) = (r2v3 'majorVersion' int), (r2v14 'majorVersion' int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r3v8 'hasExtendedHeader' boolean) = (r3v2 'hasExtendedHeader' boolean), (r3v9 'hasExtendedHeader' boolean) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r6v3 int) = (r6v0 int), (r6v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[PHI: r2 r3 r5 r6
      0x00b3: PHI (r2v4 'majorVersion' int) = (r2v3 'majorVersion' int), (r2v14 'majorVersion' int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r3v3 'hasExtendedHeader' boolean) = (r3v2 'hasExtendedHeader' boolean), (r3v9 'hasExtendedHeader' boolean) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.ET A0A(com.facebook.ads.redexgen.X.C0551Ij r9) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0882Vk.A0A(com.facebook.ads.redexgen.X.Ij):com.facebook.ads.redexgen.X.ET");
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0205 A[Catch: UnsupportedEncodingException -> 0x0243, all -> 0x0254, Merged into TryCatch #1 {all -> 0x0254, UnsupportedEncodingException -> 0x0243, blocks: (B:90:0x012c, B:159:0x020f, B:162:0x0243, B:92:0x0134, B:99:0x014a, B:102:0x0154, B:110:0x016e, B:119:0x0186, B:131:0x01a1, B:141:0x01ca, B:151:0x01e3, B:156:0x01f8, B:157:0x0205), top: B:168:0x0122 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.X.C0551Ij r24, boolean r25, int r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.ES r27) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0882Vk.A0B(int, com.facebook.ads.redexgen.X.Ij, boolean, int, com.facebook.ads.redexgen.X.ES):com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C0551Ij c0551Ij, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0551Ij.A0c(bArr, 0, i);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, A0I(169, 10, 52)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0551Ij c0551Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iA0E = c0551Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0551Ij.A0c(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, iA0E);
        String str = new String(bArr, 0, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + descriptionEndIndex;
        return new TextInformationFrame(A0I(353, 4, 86), str, A0K(bArr, iA00, A03(bArr, iA00, iA0E), strA0H));
    }

    public static TextInformationFrame A0E(C0551Ij c0551Ij, int encoding, String charset) throws UnsupportedEncodingException {
        if (encoding < 1) {
            return null;
        }
        int iA0E = c0551Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[encoding - 1];
        c0551Ij.A0c(bArr, 0, encoding - 1);
        int valueEndIndex = A03(bArr, 0, iA0E);
        String value = new String(bArr, 0, valueEndIndex, strA0H);
        return new TextInformationFrame(charset, null, value);
    }

    public static UrlLinkFrame A0F(C0551Ij c0551Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "x";
            strArr2[1] = "0";
            return null;
        }
        int descriptionEndIndex = c0551Ij.A0E();
        String strA0H = A0H(descriptionEndIndex);
        byte[] bArr = new byte[i - 1];
        c0551Ij.A0c(bArr, 0, i - 1);
        int iA03 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, iA03, strA0H);
        int iA00 = A00(descriptionEndIndex) + iA03;
        return new UrlLinkFrame(A0I(454, 4, 16), str, A0K(bArr, iA00, A02(bArr, iA00), A0I(169, 10, 52)));
    }

    public static UrlLinkFrame A0G(C0551Ij c0551Ij, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0551Ij.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i) {
        String strA0I = A0I(169, 10, 52);
        if (i == 0) {
            return strA0I;
        }
        if (i == 1) {
            return A0I(357, 6, 5);
        }
        if (i == 2) {
            return A0I(363, 8, 4);
        }
        if (i != 3) {
            return strA0I;
        }
        String[] strArr = A02;
        if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
            throw new RuntimeException();
        }
        A02[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
        return A0I(371, 5, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES);
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 109), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return A0I(0, 0, 105);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0M(com.facebook.ads.redexgen.X.C0551Ij r17, int r18, int r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0882Vk.A0M(com.facebook.ads.redexgen.X.Ij, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (A02[3].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
        strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
        return bArrCopyOfRange;
    }

    public final Metadata A0O(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C0551Ij c0551Ij = new C0551Ij(bArr, i);
        ET etA0A = A0A(c0551Ij);
        if (etA0A == null) {
            return null;
        }
        int iA06 = c0551Ij.A06();
        int i2 = etA0A.A01 == 2 ? 6 : 10;
        int iA01 = etA0A.A00;
        if (etA0A.A02) {
            iA01 = A01(c0551Ij, etA0A.A00);
        }
        c0551Ij.A0X(iA06 + iA01);
        boolean unsignedIntFrameSizeHack = false;
        if (!A0M(c0551Ij, etA0A.A01, i2, false)) {
            int i3 = etA0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            A02[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i3 == 4 && A0M(c0551Ij, 4, i2, true)) {
                unsignedIntFrameSizeHack = true;
            } else {
                Log.w(A0I(179, 10, 114), A0I(84, 45, 2) + etA0A.A01);
                return null;
            }
        }
        while (c0551Ij.A04() >= i2) {
            Id3Frame id3FrameA0B = A0B(etA0A.A01, c0551Ij, unsignedIntFrameSizeHack, i2, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4h(DJ dj) {
        ByteBuffer byteBuffer = dj.A01;
        return A0O(byteBuffer.array(), byteBuffer.limit());
    }
}
