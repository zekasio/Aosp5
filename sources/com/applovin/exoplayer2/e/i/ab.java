package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f331a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final ag b = new ag(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final com.applovin.exoplayer2.l.y c = new com.applovin.exoplayer2.l.y();

    ab(int i) {
        this.f331a = i;
    }

    public boolean a() {
        return this.d;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i) throws IOException {
        if (i <= 0) {
            return a(iVar);
        }
        if (!this.f) {
            return c(iVar, uVar, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.e) {
            return b(iVar, uVar, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(iVar);
        }
        long jB = this.b.b(this.h) - this.b.b(j);
        this.i = jB;
        if (jB < 0) {
            com.applovin.exoplayer2.l.q.c("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        return a(iVar);
    }

    public long b() {
        return this.i;
    }

    public ag c() {
        return this.b;
    }

    private int a(com.applovin.exoplayer2.e.i iVar) {
        this.c.a(ai.f);
        this.d = true;
        iVar.a();
        return 0;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i) throws IOException {
        int iMin = (int) Math.min(this.f331a, iVar.d());
        long j = 0;
        if (iVar.c() != j) {
            uVar.f386a = j;
            return 1;
        }
        this.c.a(iMin);
        iVar.a();
        iVar.d(this.c.d(), 0, iMin);
        this.g = a(this.c, i);
        this.e = true;
        return 0;
    }

    private long a(com.applovin.exoplayer2.l.y yVar, int i) {
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB; iC++) {
            if (yVar.d()[iC] == 71) {
                long jA = ae.a(yVar, iC, i);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar, int i) throws IOException {
        long jD = iVar.d();
        int iMin = (int) Math.min(this.f331a, jD);
        long j = jD - ((long) iMin);
        if (iVar.c() != j) {
            uVar.f386a = j;
            return 1;
        }
        this.c.a(iMin);
        iVar.a();
        iVar.d(this.c.d(), 0, iMin);
        this.h = b(this.c, i);
        this.f = true;
        return 0;
    }

    private long b(com.applovin.exoplayer2.l.y yVar, int i) {
        int iC = yVar.c();
        int iB = yVar.b();
        for (int i2 = iB - 188; i2 >= iC; i2--) {
            if (ae.a(yVar.d(), iC, iB, i2)) {
                long jA = ae.a(yVar, i2, i);
                if (jA != -9223372036854775807L) {
                    return jA;
                }
            }
        }
        return -9223372036854775807L;
    }
}
