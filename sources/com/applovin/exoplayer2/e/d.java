package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;

/* JADX INFO: loaded from: classes.dex */
public class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f272a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public d(long j, long j2, int i, int i2, boolean z) {
        this.f272a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = a(j, j2, i);
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.d != -1 || this.g;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        if (this.d == -1 && !this.g) {
            return new v.a(new w(0L, this.b));
        }
        long jC = c(j);
        long jB = b(jC);
        w wVar = new w(jB, jC);
        if (this.d != -1 && jB < j) {
            int i = this.c;
            if (((long) i) + jC < this.f272a) {
                long j2 = jC + ((long) i);
                return new v.a(wVar, new w(b(j2), j2));
            }
        }
        return new v.a(wVar);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f;
    }

    public long b(long j) {
        return a(j, this.b, this.e);
    }

    private static long a(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    private long c(long j) {
        long j2 = (j * ((long) this.e)) / 8000000;
        int i = this.c;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.d;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.b + Math.max(jMin, 0L);
    }
}
