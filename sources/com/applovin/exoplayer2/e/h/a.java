package com.applovin.exoplayer2.e.h;

import androidx.work.WorkRequest;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f317a;
    private final long b;
    private final long c;
    private final h d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public a(h hVar, long j, long j2, long j3, long j4, boolean z) {
        com.applovin.exoplayer2.l.a.a(j >= 0 && j2 > j);
        this.d = hVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.f317a = new e();
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public long a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i = this.e;
        if (i == 0) {
            long jC = iVar.c();
            this.g = jC;
            this.e = 1;
            long j = this.c - 65307;
            if (j > jC) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jC2 = c(iVar);
                if (jC2 != -1) {
                    return jC2;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            d(iVar);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = b(iVar);
        this.e = 4;
        return this.g;
    }

    @Override // com.applovin.exoplayer2.e.h.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0026a b() {
        if (this.f != 0) {
            return new C0026a();
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.e.h.f
    public void a(long j) {
        this.h = ai.a(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    private long c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long jC = iVar.c();
        if (!this.f317a.a(iVar, this.j)) {
            long j = this.i;
            if (j != jC) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f317a.a(iVar, false);
        iVar.a();
        long j2 = this.h - this.f317a.c;
        int i = this.f317a.h + this.f317a.i;
        if (0 <= j2 && j2 < 72000) {
            return -1L;
        }
        if (j2 < 0) {
            this.j = jC;
            this.l = this.f317a.c;
        } else {
            this.i = iVar.c() + ((long) i);
            this.k = this.f317a.c;
        }
        long j3 = this.j;
        long j4 = this.i;
        if (j3 - j4 < 100000) {
            this.j = j4;
            return j4;
        }
        long jC2 = iVar.c() - (((long) i) * (j2 <= 0 ? 2L : 1L));
        long j5 = this.j;
        long j6 = this.i;
        return ai.a(jC2 + ((j2 * (j5 - j6)) / (this.l - this.k)), j6, j5 - 1);
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (true) {
            this.f317a.a(iVar);
            this.f317a.a(iVar, false);
            if (this.f317a.c <= this.h) {
                iVar.b(this.f317a.h + this.f317a.i);
                this.i = iVar.c();
                this.k = this.f317a.c;
            } else {
                iVar.a();
                return;
            }
        }
    }

    long b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        this.f317a.a();
        if (!this.f317a.a(iVar)) {
            throw new EOFException();
        }
        this.f317a.a(iVar, false);
        iVar.b(this.f317a.h + this.f317a.i);
        long j = this.f317a.c;
        while ((this.f317a.b & 4) != 4 && this.f317a.a(iVar) && iVar.c() < this.c && this.f317a.a(iVar, true) && k.a(iVar, this.f317a.h + this.f317a.i)) {
            j = this.f317a.c;
        }
        return j;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.h.a$a, reason: collision with other inner class name */
    private final class C0026a implements v {
        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        private C0026a() {
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j) {
            return new v.a(new w(j, ai.a((a.this.b + ((a.this.d.b(j) * (a.this.c - a.this.b)) / a.this.f)) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, a.this.b, a.this.c - 1)));
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return a.this.d.a(a.this.f);
        }
    }
}
