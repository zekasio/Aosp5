package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {
    private x b;
    private j c;
    private f d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f325a = new d();
    private a j = new a();

    protected abstract boolean a(y yVar, long j, a aVar) throws IOException;

    protected abstract long b(y yVar);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        v f326a;
        f b;

        a() {
        }
    }

    void a(j jVar, x xVar) {
        this.c = jVar;
        this.b = xVar;
        a(true);
    }

    protected void a(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void a(long j, long j2) {
        this.f325a.a();
        if (j == 0) {
            a(!this.l);
        } else if (this.h != 0) {
            this.e = b(j2);
            ((f) ai.a(this.d)).a(this.e);
            this.h = 2;
        }
    }

    final int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        a();
        int i = this.h;
        if (i == 0) {
            return b(iVar);
        }
        if (i == 1) {
            iVar.b((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            ai.a(this.d);
            return b(iVar, uVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.b);
        ai.a(this.c);
    }

    private boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (this.f325a.a(iVar)) {
            this.k = iVar.c() - this.f;
            if (!a(this.f325a.c(), this.f, this.j)) {
                return true;
            }
            this.f = iVar.c();
        }
        this.h = 3;
        return false;
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (!a(iVar)) {
            return -1;
        }
        this.i = this.j.f326a.z;
        if (!this.m) {
            this.b.a(this.j.f326a);
            this.m = true;
        }
        if (this.j.b != null) {
            this.d = this.j.b;
        } else if (iVar.d() == -1) {
            this.d = new b();
        } else {
            e eVarB = this.f325a.b();
            this.d = new com.applovin.exoplayer2.e.h.a(this, this.f, iVar.d(), eVarB.h + eVarB.i, eVarB.c, (eVarB.b & 4) != 0);
        }
        this.h = 2;
        this.f325a.d();
        return 0;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long jA = this.d.a(iVar);
        if (jA >= 0) {
            uVar.f386a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.l) {
            this.c.a((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.a(this.d.b()));
            this.l = true;
        }
        if (this.k > 0 || this.f325a.a(iVar)) {
            this.k = 0L;
            y yVarC = this.f325a.c();
            long jB = b(yVarC);
            if (jB >= 0) {
                long j = this.g;
                if (j + jB >= this.e) {
                    long jA2 = a(j);
                    this.b.a(yVarC, yVarC.b());
                    this.b.a(jA2, 1, yVarC.b(), 0, null);
                    this.e = -1L;
                }
            }
            this.g += jB;
            return 0;
        }
        this.h = 3;
        return -1;
    }

    protected long a(long j) {
        return (j * 1000000) / ((long) this.i);
    }

    protected long b(long j) {
        return (((long) this.i) * j) / 1000000;
    }

    protected void c(long j) {
        this.g = j;
    }

    private static final class b implements f {
        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            return -1L;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j) {
        }

        private b() {
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public com.applovin.exoplayer2.e.v b() {
            return new v.b(-9223372036854775807L);
        }
    }
}
