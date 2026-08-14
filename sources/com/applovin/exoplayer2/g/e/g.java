package com.applovin.exoplayer2.g.e;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.g.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f431a = new a() { // from class: com.applovin.exoplayer2.g.e.g$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.e.g.a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return g.b(i, i2, i3, i4, i5);
        }
    };
    private final a b;

    public interface a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public g() {
        this(null);
    }

    public g(a aVar) {
        this.b = aVar;
    }

    @Override // com.applovin.exoplayer2.g.g
    protected com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public com.applovin.exoplayer2.g.a a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i);
        b bVarA = a(yVar);
        if (bVarA == null) {
            return null;
        }
        int iC = yVar.c();
        int i2 = bVarA.f432a == 2 ? 6 : 10;
        int iG = bVarA.c;
        if (bVarA.b) {
            iG = g(yVar, bVarA.c);
        }
        yVar.c(iC + iG);
        boolean z = false;
        if (!a(yVar, bVarA.f432a, i2, false)) {
            if (bVarA.f432a != 4 || !a(yVar, 4, i2, true)) {
                q.c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarA.f432a);
                return null;
            }
            z = true;
        }
        while (yVar.a() >= i2) {
            h hVarA = a(bVarA.f432a, yVar, z, i2, this.b);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static b a(y yVar) {
        if (yVar.a() < 10) {
            q.c("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iM = yVar.m();
        boolean z = false;
        if (iM != 4801587) {
            q.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iM)));
            return null;
        }
        int iH = yVar.h();
        yVar.e(1);
        int iH2 = yVar.h();
        int iV = yVar.v();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                q.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = yVar.q();
                yVar.e(iQ);
                iV -= iQ + 4;
            }
        } else {
            if (iH != 4) {
                q.c("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iV2 = yVar.v();
                yVar.e(iV2 - 4);
                iV -= iV2;
            }
            if ((iH2 & 16) != 0) {
                iV -= 10;
            }
        }
        if (iH < 4 && (iH2 & 128) != 0) {
            z = true;
        }
        return new b(iH, z, iV);
    }

    private static boolean a(y yVar, int i, int i2, boolean z) {
        int iM;
        long jM;
        int i3;
        int i4;
        int iC = yVar.c();
        while (true) {
            try {
                boolean z2 = true;
                if (yVar.a() < i2) {
                    return true;
                }
                if (i >= 3) {
                    iM = yVar.q();
                    jM = yVar.o();
                    i3 = yVar.i();
                } else {
                    iM = yVar.m();
                    jM = yVar.m();
                    i3 = 0;
                }
                if (iM == 0 && jM == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM) != 0) {
                        return false;
                    }
                    jM = (((jM >> 24) & 255) << 21) | (jM & 255) | (((jM >> 8) & 255) << 7) | (((jM >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                    if ((i3 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                        }
                    } else {
                        i4 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i4 += 4;
                }
                if (jM < i4) {
                    return false;
                }
                if (yVar.a() < jM) {
                    return false;
                }
                yVar.e((int) jM);
            } finally {
                yVar.d(iC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f4 A[Catch: all -> 0x0134, UnsupportedEncodingException -> 0x021d, TryCatch #1 {UnsupportedEncodingException -> 0x021d, blocks: (B:92:0x0122, B:162:0x01fe, B:94:0x012a, B:103:0x0143, B:105:0x014b, B:113:0x0165, B:122:0x017d, B:133:0x0198, B:140:0x01aa, B:146:0x01b9, B:152:0x01d3, B:159:0x01ef, B:160:0x01f4), top: B:172:0x0118, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.g.e.h a(int r20, com.applovin.exoplayer2.l.y r21, boolean r22, int r23, com.applovin.exoplayer2.g.e.g.a r24) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.g.a(int, com.applovin.exoplayer2.l.y, boolean, int, com.applovin.exoplayer2.g.e.g$a):com.applovin.exoplayer2.g.e.h");
    }

    private static l a(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new l("TXXX", str, a(bArr, iB, a(bArr, iB, iH), strA));
    }

    private static l a(y yVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        return new l(str, null, new String(bArr, 0, a(bArr, 0, iH), strA));
    }

    private static m b(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new m("WXXX", str, a(bArr, iB, b(bArr, iB), "ISO-8859-1"));
    }

    private static m b(y yVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        return new m(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static k c(y yVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        int iB = b(bArr, 0);
        return new k(new String(bArr, 0, iB, "ISO-8859-1"), b(bArr, iB + 1, i));
    }

    private static f d(y yVar, int i) throws UnsupportedEncodingException {
        int iH = yVar.h();
        String strA = a(iH);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int iB = b(bArr, 0);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i3 = iB + 1;
        int iA = a(bArr, i3, iH);
        String strA2 = a(bArr, i3, iA, strA);
        int iB2 = iA + b(iH);
        int iA2 = a(bArr, iB2, iH);
        return new f(str, strA2, a(bArr, iB2, iA2, strA), b(bArr, iA2 + b(iH), i2));
    }

    private static com.applovin.exoplayer2.g.e.a a(y yVar, int i, int i2) throws UnsupportedEncodingException {
        int iB;
        String str;
        int iH = yVar.h();
        String strA = a(iH);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        yVar.a(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iB, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[iB + 1] & UByte.MAX_VALUE;
        int i5 = iB + 2;
        int iA = a(bArr, i5, iH);
        return new com.applovin.exoplayer2.g.e.a(str, new String(bArr, i5, iA - i5, strA), i4, b(bArr, iA + b(iH), i3));
    }

    private static e e(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iH = yVar.h();
        String strA = a(iH);
        byte[] bArr = new byte[3];
        yVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yVar.a(bArr2, 0, i2);
        int iA = a(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iA, strA);
        int iB = iA + b(iH);
        return new e(str, str2, a(bArr2, iB, a(bArr2, iB, iH), strA));
    }

    private static c a(y yVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int iC = yVar.c();
        int iB = b(yVar.d(), iC);
        String str = new String(yVar.d(), iC, iB - iC, "ISO-8859-1");
        yVar.d(iB + 1);
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        long jO = yVar.o();
        long j = jO == 4294967295L ? -1L : jO;
        long jO2 = yVar.o();
        long j2 = jO2 == 4294967295L ? -1L : jO2;
        ArrayList arrayList = new ArrayList();
        int i4 = iC + i;
        while (yVar.c() < i4) {
            h hVarA = a(i2, yVar, z, i3, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new c(str, iQ, iQ2, j, j2, (h[]) arrayList.toArray(new h[0]));
    }

    private static d b(y yVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int iC = yVar.c();
        int iB = b(yVar.d(), iC);
        String str = new String(yVar.d(), iC, iB - iC, "ISO-8859-1");
        yVar.d(iB + 1);
        int iH = yVar.h();
        boolean z2 = (iH & 2) != 0;
        boolean z3 = (iH & 1) != 0;
        int iH2 = yVar.h();
        String[] strArr = new String[iH2];
        for (int i4 = 0; i4 < iH2; i4++) {
            int iC2 = yVar.c();
            int iB2 = b(yVar.d(), iC2);
            strArr[i4] = new String(yVar.d(), iC2, iB2 - iC2, "ISO-8859-1");
            yVar.d(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iC + i;
        while (yVar.c() < i5) {
            h hVarA = a(i2, yVar, z, i3, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new d(str, z2, z3, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    private static j f(y yVar, int i) {
        int i2 = yVar.i();
        int iM = yVar.m();
        int iM2 = yVar.m();
        int iH = yVar.h();
        int iH2 = yVar.h();
        x xVar = new x();
        xVar.a(yVar);
        int i3 = ((i - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iC = xVar.c(iH);
            int iC2 = xVar.c(iH2);
            iArr[i4] = iC;
            iArr2[i4] = iC2;
        }
        return new j(i2, iM, iM2, iArr, iArr2);
    }

    private static com.applovin.exoplayer2.g.e.b c(y yVar, int i, String str) {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        return new com.applovin.exoplayer2.g.e.b(str, bArr);
    }

    private static int g(y yVar, int i) {
        byte[] bArrD = yVar.d();
        int iC = yVar.c();
        int i2 = iC;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iC + i) {
                return i;
            }
            if ((bArrD[i2] & UByte.MAX_VALUE) == 255 && bArrD[i3] == 0) {
                System.arraycopy(bArrD, i2 + 2, bArrD, i3, (i - (i2 - iC)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String a(int i) {
        if (i == 1) {
            return HTTP.UTF_16;
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i == 3) {
            return "UTF-8";
        }
        return "ISO-8859-1";
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int a(byte[] bArr, int i, int i2) {
        int iB = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return ai.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f432a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.f432a = i;
            this.b = z;
            this.c = i2;
        }
    }
}
