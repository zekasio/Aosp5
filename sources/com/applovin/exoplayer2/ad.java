package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;

/* JADX INFO: loaded from: classes.dex */
final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.n f28a;
    public final Object b;
    public final com.applovin.exoplayer2.h.x[] c;
    public boolean d;
    public boolean e;
    public ae f;
    public boolean g;
    private final boolean[] h;
    private final as[] i;
    private final com.applovin.exoplayer2.j.j j;
    private final ah k;
    private ad l;
    private com.applovin.exoplayer2.h.ad m = com.applovin.exoplayer2.h.ad.f458a;
    private com.applovin.exoplayer2.j.k n;
    private long o;

    public ad(as[] asVarArr, long j, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.k.b bVar, ah ahVar, ae aeVar, com.applovin.exoplayer2.j.k kVar) {
        this.i = asVarArr;
        this.o = j;
        this.j = jVar;
        this.k = ahVar;
        this.b = aeVar.f29a.f471a;
        this.f = aeVar;
        this.n = kVar;
        this.c = new com.applovin.exoplayer2.h.x[asVarArr.length];
        this.h = new boolean[asVarArr.length];
        this.f28a = a(aeVar.f29a, ahVar, bVar, aeVar.b, aeVar.d);
    }

    public long a(long j) {
        return j + a();
    }

    public long b(long j) {
        return j - a();
    }

    public long a() {
        return this.o;
    }

    public void c(long j) {
        this.o = j;
    }

    public long b() {
        return this.f.b + this.o;
    }

    public boolean c() {
        return this.d && (!this.e || this.f28a.d() == Long.MIN_VALUE);
    }

    public long d() {
        if (!this.d) {
            return this.f.b;
        }
        long jD = this.e ? this.f28a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f.e : jD;
    }

    public long e() {
        if (this.d) {
            return this.f28a.e();
        }
        return 0L;
    }

    public void a(float f, ba baVar) throws p {
        this.d = true;
        this.m = this.f28a.b();
        com.applovin.exoplayer2.j.k kVarB = b(f, baVar);
        long jMax = this.f.b;
        if (this.f.e != -9223372036854775807L && jMax >= this.f.e) {
            jMax = Math.max(0L, this.f.e - 1);
        }
        long jA = a(kVarB, jMax, false);
        this.o += this.f.b - jA;
        this.f = this.f.a(jA);
    }

    public void d(long j) {
        com.applovin.exoplayer2.l.a.b(m());
        if (this.d) {
            this.f28a.a(b(j));
        }
    }

    public void e(long j) {
        com.applovin.exoplayer2.l.a.b(m());
        this.f28a.c(b(j));
    }

    public com.applovin.exoplayer2.j.k b(float f, ba baVar) throws p {
        com.applovin.exoplayer2.j.k kVarA = this.j.a(this.i, h(), this.f.f29a, baVar);
        for (com.applovin.exoplayer2.j.d dVar : kVarA.c) {
            if (dVar != null) {
                dVar.a(f);
            }
        }
        return kVarA;
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j, boolean z) {
        return a(kVar, j, z, new boolean[this.i.length]);
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= kVar.f568a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !kVar.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        a(this.c);
        l();
        this.n = kVar;
        k();
        long jA = this.f28a.a(kVar.c, this.h, this.c, zArr, j);
        b(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            com.applovin.exoplayer2.h.x[] xVarArr = this.c;
            if (i2 >= xVarArr.length) {
                return jA;
            }
            if (xVarArr[i2] != null) {
                com.applovin.exoplayer2.l.a.b(kVar.a(i2));
                if (this.i[i2].a() != -2) {
                    this.e = true;
                }
            } else {
                com.applovin.exoplayer2.l.a.b(kVar.c[i2] == null);
            }
            i2++;
        }
    }

    public void f() {
        l();
        a(this.k, this.f28a);
    }

    public void a(ad adVar) {
        if (adVar == this.l) {
            return;
        }
        l();
        this.l = adVar;
        k();
    }

    public ad g() {
        return this.l;
    }

    public com.applovin.exoplayer2.h.ad h() {
        return this.m;
    }

    public com.applovin.exoplayer2.j.k i() {
        return this.n;
    }

    public void j() {
        if (this.f28a instanceof com.applovin.exoplayer2.h.d) {
            ((com.applovin.exoplayer2.h.d) this.f28a).a(0L, this.f.d == -9223372036854775807L ? Long.MIN_VALUE : this.f.d);
        }
    }

    private void k() {
        if (m()) {
            for (int i = 0; i < this.n.f568a; i++) {
                boolean zA = this.n.a(i);
                com.applovin.exoplayer2.j.d dVar = this.n.c[i];
                if (zA && dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    private void l() {
        if (m()) {
            for (int i = 0; i < this.n.f568a; i++) {
                boolean zA = this.n.a(i);
                com.applovin.exoplayer2.j.d dVar = this.n.c[i];
                if (zA && dVar != null) {
                    dVar.b();
                }
            }
        }
    }

    private void a(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i = 0;
        while (true) {
            as[] asVarArr = this.i;
            if (i >= asVarArr.length) {
                return;
            }
            if (asVarArr[i].a() == -2) {
                xVarArr[i] = null;
            }
            i++;
        }
    }

    private void b(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i = 0;
        while (true) {
            as[] asVarArr = this.i;
            if (i >= asVarArr.length) {
                return;
            }
            if (asVarArr[i].a() == -2 && this.n.a(i)) {
                xVarArr[i] = new com.applovin.exoplayer2.h.g();
            }
            i++;
        }
    }

    private boolean m() {
        return this.l == null;
    }

    private static com.applovin.exoplayer2.h.n a(p.a aVar, ah ahVar, com.applovin.exoplayer2.k.b bVar, long j, long j2) {
        com.applovin.exoplayer2.h.n nVarA = ahVar.a(aVar, bVar, j);
        return j2 != -9223372036854775807L ? new com.applovin.exoplayer2.h.d(nVarA, true, 0L, j2) : nVarA;
    }

    private static void a(ah ahVar, com.applovin.exoplayer2.h.n nVar) {
        try {
            if (nVar instanceof com.applovin.exoplayer2.h.d) {
                ahVar.a(((com.applovin.exoplayer2.h.d) nVar).f460a);
            } else {
                ahVar.a(nVar);
            }
        } catch (RuntimeException e) {
            com.applovin.exoplayer2.l.q.c("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}
