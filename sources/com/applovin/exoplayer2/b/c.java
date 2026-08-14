package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.v;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f59a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private a(int i, int i2, int i3, int i4, int i5) {
            this.f60a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        yVar.e(1);
        return new v.a().a(str).f("audio/ac4").k(2).l(((yVar.h() & 32) >> 5) == 1 ? 48000 : 44100).a(eVar).c(str2).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.exoplayer2.b.c.a a(com.applovin.exoplayer2.l.x r11) {
        /*
            r0 = 16
            int r1 = r11.c(r0)
            int r0 = r11.c(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.c(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.c(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.c(r1)
            boolean r4 = r11.e()
            if (r4 == 0) goto L45
            int r4 = r11.c(r2)
            if (r4 <= 0) goto L45
            r11.b(r0)
        L45:
            boolean r4 = r11.e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r11 = r11.c(r3)
            if (r9 != r7) goto L67
            r4 = 13
            if (r11 != r4) goto L67
            int[] r0 = com.applovin.exoplayer2.b.c.f59a
            r11 = r0[r11]
            goto L97
        L67:
            if (r9 != r6) goto L96
            int[] r4 = com.applovin.exoplayer2.b.c.f59a
            int r6 = r4.length
            if (r11 >= r6) goto L96
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8c
            r7 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L80
            goto L91
        L80:
            if (r11 == r2) goto L93
            if (r11 == r6) goto L93
            if (r11 != r7) goto L91
            goto L93
        L87:
            if (r11 == r6) goto L93
            if (r11 != r7) goto L91
            goto L93
        L8c:
            if (r11 == r2) goto L93
            if (r11 != r6) goto L91
            goto L93
        L91:
            r11 = r4
            goto L97
        L93:
            int r4 = r4 + 1
            goto L91
        L96:
            r11 = 0
        L97:
            com.applovin.exoplayer2.b.c$a r0 = new com.applovin.exoplayer2.b.c$a
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.c.a(com.applovin.exoplayer2.l.x):com.applovin.exoplayer2.b.c$a");
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        if (i3 == 65535) {
            i3 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return a(new com.applovin.exoplayer2.l.x(bArr)).e;
    }

    public static void a(int i, com.applovin.exoplayer2.l.y yVar) {
        yVar.a(7);
        byte[] bArrD = yVar.d();
        bArrD[0] = -84;
        bArrD[1] = 64;
        bArrD[2] = -1;
        bArrD[3] = -1;
        bArrD[4] = (byte) ((i >> 16) & 255);
        bArrD[5] = (byte) ((i >> 8) & 255);
        bArrD[6] = (byte) (i & 255);
    }

    private static int a(com.applovin.exoplayer2.l.x xVar, int i) {
        int i2 = 0;
        while (true) {
            int iC = i2 + xVar.c(i);
            if (!xVar.e()) {
                return iC;
            }
            i2 = (iC + 1) << i;
        }
    }
}
