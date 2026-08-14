package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: classes.dex */
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f610a;
    private long b;
    private long c;
    private final ThreadLocal<Long> d = new ThreadLocal<>();

    public ag(long j) {
        a(j);
    }

    public synchronized long a() {
        long j;
        j = this.f610a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long b() {
        long jA;
        long j = this.c;
        if (j != -9223372036854775807L) {
            jA = j + this.b;
        } else {
            jA = a();
        }
        return jA;
    }

    public synchronized long c() {
        return this.b;
    }

    public synchronized void a(long j) {
        this.f610a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long jE = e(j2);
            long j3 = (4294967296L + jE) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - jE) < Math.abs(j - jE)) {
                j = j4;
            }
        }
        return c(d(j));
    }

    public synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b == -9223372036854775807L) {
            long jLongValue = this.f610a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) a.b(this.d.get())).longValue();
            }
            this.b = jLongValue - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public static long d(long j) {
        return (j * 1000000) / 90000;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }
}
