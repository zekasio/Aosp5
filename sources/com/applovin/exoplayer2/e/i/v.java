package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class v {
    private boolean c;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ag f364a = new ag(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final com.applovin.exoplayer2.l.y b = new com.applovin.exoplayer2.l.y();

    v() {
    }

    public boolean a() {
        return this.c;
    }

    public ag b() {
        return this.f364a;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        if (!this.e) {
            return c(iVar, uVar);
        }
        if (this.g == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.d) {
            return b(iVar, uVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return a(iVar);
        }
        long jB = this.f364a.b(this.g) - this.f364a.b(j);
        this.h = jB;
        if (jB < 0) {
            com.applovin.exoplayer2.l.q.c("PsDurationReader", "Invalid duration: " + this.h + ". Using TIME_UNSET instead.");
            this.h = -9223372036854775807L;
        }
        return a(iVar);
    }

    public long c() {
        return this.h;
    }

    public static long a(com.applovin.exoplayer2.l.y yVar) {
        int iC = yVar.c();
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.a(bArr, 0, 9);
        yVar.d(iC);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.b.a(ai.f);
        this.c = true;
        iVar.a();
        return 0;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int iMin = (int) Math.min(20000L, iVar.d());
        long j = 0;
        if (iVar.c() != j) {
            uVar.f386a = j;
            return 1;
        }
        this.b.a(iMin);
        iVar.a();
        iVar.d(this.b.d(), 0, iMin);
        this.f = b(this.b);
        this.d = true;
        return 0;
    }

    private long b(com.applovin.exoplayer2.l.y yVar) {
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB - 3; iC++) {
            if (a(yVar.d(), iC) == 442) {
                yVar.d(iC + 4);
                long jA = a(yVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        long jD = iVar.d();
        int iMin = (int) Math.min(20000L, jD);
        long j = jD - ((long) iMin);
        if (iVar.c() != j) {
            uVar.f386a = j;
            return 1;
        }
        this.b.a(iMin);
        iVar.a();
        iVar.d(this.b.d(), 0, iMin);
        this.g = c(this.b);
        this.e = true;
        return 0;
    }

    private long c(com.applovin.exoplayer2.l.y yVar) {
        int iC = yVar.c();
        for (int iB = yVar.b() - 4; iB >= iC; iB--) {
            if (a(yVar.d(), iB) == 442) {
                yVar.d(iB + 4);
                long jA = a(yVar);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long b(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }
}
