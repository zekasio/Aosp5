package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f292a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public static g a(long j, long j2, r.a aVar, y yVar) {
        int iW;
        int i = aVar.g;
        int i2 = aVar.d;
        int iQ = yVar.q();
        if ((iQ & 1) != 1 || (iW = yVar.w()) == 0) {
            return null;
        }
        long jD = ai.d(iW, ((long) i) * 1000000, i2);
        if ((iQ & 6) != 6) {
            return new g(j2, aVar.c, jD);
        }
        long jO = yVar.o();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = yVar.h();
        }
        if (j != -1) {
            long j3 = j2 + jO;
            if (j != j3) {
                q.c("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new g(j2, aVar.c, jD, jO, jArr);
    }

    private g(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    private g(long j, int i, long j2, long j3, long[] jArr) {
        this.f292a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f != null;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        if (!a()) {
            return new v.a(new w(0L, this.f292a + ((long) this.b)));
        }
        long jA = ai.a(j, 0L, this.c);
        double d = jA;
        Double.isNaN(d);
        double d2 = this.c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) com.applovin.exoplayer2.l.a.a(this.f))[i];
                double d6 = i == 99 ? 256.0d : r3[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.d;
        Double.isNaN(d8);
        return new v.a(new w(jA, this.f292a + ai.a(Math.round((d4 / 256.0d) * d8), this.b, this.d - 1)));
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j) {
        double d;
        long j2 = j - this.f292a;
        if (!a() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.a(this.f);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int iA = ai.a(jArr, (long) d4, true, true);
        long jA = a(iA);
        long j3 = jArr[iA];
        int i = iA + 1;
        long jA2 = a(i);
        long j4 = iA == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = 0.0d;
        } else {
            double d5 = j3;
            Double.isNaN(d5);
            double d6 = j4 - j3;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = jA2 - jA;
        Double.isNaN(d7);
        return jA + Math.round(d * d7);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.e;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }
}
