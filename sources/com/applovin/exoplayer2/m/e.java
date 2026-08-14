package com.applovin.exoplayer2.m;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class e {
    private boolean c;
    private boolean d;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f654a = new a();
    private a b = new a();
    private long e = -9223372036854775807L;

    public void a() {
        this.f654a.a();
        this.b.a();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }

    public void a(long j) {
        this.f654a.a(j);
        if (this.f654a.b() && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.c()) {
                this.b.a();
                this.b.a(this.e);
            }
            this.c = true;
            this.b.a(j);
        }
        if (this.c && this.b.b()) {
            a aVar = this.f654a;
            this.f654a = this.b;
            this.b = aVar;
            this.c = false;
            this.d = false;
        }
        this.e = j;
        this.f = this.f654a.b() ? 0 : this.f + 1;
    }

    public boolean b() {
        return this.f654a.b();
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (b()) {
            return this.f654a.d();
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (b()) {
            return this.f654a.e();
        }
        return -9223372036854775807L;
    }

    public float f() {
        if (!b()) {
            return -1.0f;
        }
        double dE = this.f654a.e();
        Double.isNaN(dE);
        return (float) (1.0E9d / dE);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f655a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        public void a() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }

        public boolean b() {
            return this.d > 15 && this.h == 0;
        }

        public boolean c() {
            long j = this.d;
            if (j == 0) {
                return false;
            }
            return this.g[b(j - 1)];
        }

        public long d() {
            return this.f;
        }

        public long e() {
            long j = this.e;
            if (j == 0) {
                return 0L;
            }
            return this.f / j;
        }

        public void a(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f655a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f655a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int iB = b(j2);
                if (Math.abs(j4 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j4;
                    boolean[] zArr = this.g;
                    if (zArr[iB]) {
                        zArr[iB] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[iB]) {
                        zArr2[iB] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = j;
        }

        private static int b(long j) {
            return (int) (j % 15);
        }
    }
}
