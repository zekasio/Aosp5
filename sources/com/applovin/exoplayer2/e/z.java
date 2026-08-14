package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f393a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.f393a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f395a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f395a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f394a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.f394a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static d a(com.applovin.exoplayer2.l.y yVar) throws ai {
        a(1, yVar, false);
        int iX = yVar.x();
        int iH = yVar.h();
        int iX2 = yVar.x();
        int iR = yVar.r();
        if (iR <= 0) {
            iR = -1;
        }
        int iR2 = yVar.r();
        if (iR2 <= 0) {
            iR2 = -1;
        }
        int iR3 = yVar.r();
        if (iR3 <= 0) {
            iR3 = -1;
        }
        int iH2 = yVar.h();
        return new d(iX, iH, iX2, iR, iR2, iR3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (yVar.h() & 1) > 0, Arrays.copyOf(yVar.d(), yVar.b()));
    }

    public static b b(com.applovin.exoplayer2.l.y yVar) throws ai {
        return a(yVar, true, true);
    }

    public static b a(com.applovin.exoplayer2.l.y yVar, boolean z, boolean z2) throws ai {
        if (z) {
            a(3, yVar, false);
        }
        String strF = yVar.f((int) yVar.p());
        int length = strF.length();
        long jP = yVar.p();
        String[] strArr = new String[(int) jP];
        int length2 = length + 15;
        for (int i = 0; i < jP; i++) {
            String strF2 = yVar.f((int) yVar.p());
            strArr[i] = strF2;
            length2 = length2 + 4 + strF2.length();
        }
        if (z2 && (yVar.h() & 1) == 0) {
            throw ai.b("framing bit expected to be set", null);
        }
        return new b(strF, strArr, length2 + 1);
    }

    public static boolean a(int i, com.applovin.exoplayer2.l.y yVar, boolean z) throws ai {
        if (yVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ai.b("too short header: " + yVar.a(), null);
        }
        if (yVar.h() != i) {
            if (z) {
                return false;
            }
            throw ai.b("expected header type " + Integer.toHexString(i), null);
        }
        if (yVar.h() == 118 && yVar.h() == 111 && yVar.h() == 114 && yVar.h() == 98 && yVar.h() == 105 && yVar.h() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ai.b("expected characters 'vorbis'", null);
    }

    public static c[] a(com.applovin.exoplayer2.l.y yVar, int i) throws ai {
        a(5, yVar, false);
        int iH = yVar.h() + 1;
        y yVar2 = new y(yVar.d());
        yVar2.b(yVar.c() * 8);
        for (int i2 = 0; i2 < iH; i2++) {
            d(yVar2);
        }
        int iA = yVar2.a(6) + 1;
        for (int i3 = 0; i3 < iA; i3++) {
            if (yVar2.a(16) != 0) {
                throw ai.b("placeholder of time domain transforms not zeroed out", null);
            }
        }
        c(yVar2);
        b(yVar2);
        a(i, yVar2);
        c[] cVarArrA = a(yVar2);
        if (yVar2.a()) {
            return cVarArrA;
        }
        throw ai.b("framing bit after modes not set as expected", null);
    }

    private static c[] a(y yVar) {
        int iA = yVar.a(6) + 1;
        c[] cVarArr = new c[iA];
        for (int i = 0; i < iA; i++) {
            cVarArr[i] = new c(yVar.a(), yVar.a(16), yVar.a(16), yVar.a(8));
        }
        return cVarArr;
    }

    private static void a(int i, y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i2 = 0; i2 < iA; i2++) {
            int iA2 = yVar.a(16);
            if (iA2 != 0) {
                com.applovin.exoplayer2.l.q.d("VorbisUtil", "mapping type other than 0 not supported: " + iA2);
            } else {
                int iA3 = yVar.a() ? yVar.a(4) + 1 : 1;
                if (yVar.a()) {
                    int iA4 = yVar.a(8) + 1;
                    for (int i3 = 0; i3 < iA4; i3++) {
                        int i4 = i - 1;
                        yVar.b(a(i4));
                        yVar.b(a(i4));
                    }
                }
                if (yVar.a(2) != 0) {
                    throw ai.b("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iA3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        yVar.b(4);
                    }
                }
                for (int i6 = 0; i6 < iA3; i6++) {
                    yVar.b(8);
                    yVar.b(8);
                    yVar.b(8);
                }
            }
        }
    }

    private static void b(y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            if (yVar.a(16) > 2) {
                throw ai.b("residueType greater than 2 is not decodable", null);
            }
            yVar.b(24);
            yVar.b(24);
            yVar.b(24);
            int iA2 = yVar.a(6) + 1;
            yVar.b(8);
            int[] iArr = new int[iA2];
            for (int i2 = 0; i2 < iA2; i2++) {
                iArr[i2] = ((yVar.a() ? yVar.a(5) : 0) * 8) + yVar.a(3);
            }
            for (int i3 = 0; i3 < iA2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        yVar.b(8);
                    }
                }
            }
        }
    }

    private static void c(y yVar) throws ai {
        int iA = yVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            int iA2 = yVar.a(16);
            if (iA2 == 0) {
                yVar.b(8);
                yVar.b(16);
                yVar.b(16);
                yVar.b(6);
                yVar.b(8);
                int iA3 = yVar.a(4) + 1;
                for (int i2 = 0; i2 < iA3; i2++) {
                    yVar.b(8);
                }
            } else {
                if (iA2 != 1) {
                    throw ai.b("floor type greater than 1 not decodable: " + iA2, null);
                }
                int iA4 = yVar.a(5);
                int[] iArr = new int[iA4];
                int i3 = -1;
                for (int i4 = 0; i4 < iA4; i4++) {
                    int iA5 = yVar.a(4);
                    iArr[i4] = iA5;
                    if (iA5 > i3) {
                        i3 = iA5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = yVar.a(3) + 1;
                    int iA6 = yVar.a(2);
                    if (iA6 > 0) {
                        yVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << iA6); i7++) {
                        yVar.b(8);
                    }
                }
                yVar.b(2);
                int iA7 = yVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iA4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        yVar.b(iA7);
                        i9++;
                    }
                }
            }
        }
    }

    private static a d(y yVar) throws ai {
        if (yVar.a(24) != 5653314) {
            throw ai.b("expected code book to start with [0x56, 0x43, 0x42] at " + yVar.b(), null);
        }
        int iA = yVar.a(16);
        int iA2 = yVar.a(24);
        long[] jArr = new long[iA2];
        boolean zA = yVar.a();
        long jA = 0;
        if (!zA) {
            boolean zA2 = yVar.a();
            for (int i = 0; i < iA2; i++) {
                if (zA2) {
                    if (yVar.a()) {
                        jArr[i] = yVar.a(5) + 1;
                    } else {
                        jArr[i] = 0;
                    }
                } else {
                    jArr[i] = yVar.a(5) + 1;
                }
            }
        } else {
            int iA3 = yVar.a(5) + 1;
            int i2 = 0;
            while (i2 < iA2) {
                int iA4 = yVar.a(a(iA2 - i2));
                for (int i3 = 0; i3 < iA4 && i2 < iA2; i3++) {
                    jArr[i2] = iA3;
                    i2++;
                }
                iA3++;
            }
        }
        int iA5 = yVar.a(4);
        if (iA5 > 2) {
            throw ai.b("lookup type greater than 2 not decodable: " + iA5, null);
        }
        if (iA5 == 1 || iA5 == 2) {
            yVar.b(32);
            yVar.b(32);
            int iA6 = yVar.a(4) + 1;
            yVar.b(1);
            if (iA5 != 1) {
                jA = ((long) iA2) * ((long) iA);
            } else if (iA != 0) {
                jA = a(iA2, iA);
            }
            yVar.b((int) (jA * ((long) iA6)));
        }
        return new a(iA, iA2, jArr, iA5, zA);
    }

    private static long a(long j, long j2) {
        double d2 = j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(j, 1.0d / d2));
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f392a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f392a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }
}
