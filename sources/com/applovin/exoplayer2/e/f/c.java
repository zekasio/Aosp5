package com.applovin.exoplayer2.e.f;

import android.util.Pair;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.g.e.j;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f289a;
    private final long[] b;
    private final long c;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return -1L;
    }

    public static c a(long j, j jVar, long j2) {
        int length = jVar.d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (jVar.b + jVar.d[i3]);
            j3 += (long) (jVar.c + jVar.e[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new c(jArr, jArr2, j2);
    }

    private c(long[] jArr, long[] jArr2, long j) {
        this.f289a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? h.b(jArr2[jArr2.length - 1]) : j;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        Pair<Long, Long> pairA = a(h.a(ai.a(j, 0L, this.c)), this.b, this.f289a);
        return new v.a(new w(h.b(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j) {
        return h.b(((Long) a(j, this.f289a, this.b).second).longValue());
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.c;
    }

    private static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        double d;
        int iA = ai.a(jArr, j, true, true);
        long j2 = jArr[iA];
        long j3 = jArr2[iA];
        int i = iA + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = j4 - j2;
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        double d5 = j5 - j3;
        Double.isNaN(d5);
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * d5)) + j3));
    }
}
