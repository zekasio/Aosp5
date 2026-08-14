package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f460a;
    long b;
    long c;
    private n.a d;
    private a[] e = new a[0];
    private long f;

    public d(n nVar, boolean z, long j, long j2) {
        this.f460a = nVar;
        this.f = z ? j : -9223372036854775807L;
        this.b = j;
        this.c = j2;
    }

    public void a(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j) {
        this.d = aVar;
        this.f460a.a(this, j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        this.f460a.e_();
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return this.f460a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // com.applovin.exoplayer2.h.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(com.applovin.exoplayer2.j.d[] r13, boolean[] r14, com.applovin.exoplayer2.h.x[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.exoplayer2.h.d$a[] r2 = new com.applovin.exoplayer2.h.d.a[r2]
            r0.e = r2
            int r2 = r1.length
            com.applovin.exoplayer2.h.x[] r9 = new com.applovin.exoplayer2.h.x[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.exoplayer2.h.d$a[] r3 = r0.e
            r4 = r1[r2]
            com.applovin.exoplayer2.h.d$a r4 = (com.applovin.exoplayer2.h.d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.exoplayer2.h.x r11 = r4.f461a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.exoplayer2.h.n r2 = r0.f460a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.g()
            if (r4 == 0) goto L43
            long r4 = r0.b
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = a(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L61
            long r4 = r0.c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L63
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L63
        L61:
            r4 = 0
            goto L64
        L63:
            r4 = 1
        L64:
            com.applovin.exoplayer2.l.a.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L93
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.exoplayer2.h.d$a[] r4 = r0.e
            r4[r10] = r11
            goto L8a
        L73:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.e
            r4 = r4[r10]
            if (r4 == 0) goto L7f
            com.applovin.exoplayer2.h.x r4 = r4.f461a
            r5 = r9[r10]
            if (r4 == r5) goto L8a
        L7f:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.e
            com.applovin.exoplayer2.h.d$a r5 = new com.applovin.exoplayer2.h.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8a:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.e
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.a(com.applovin.exoplayer2.j.d[], boolean[], com.applovin.exoplayer2.h.x[], boolean[], long):long");
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j, boolean z) {
        this.f460a.a(j, z);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j) {
        this.f460a.a(j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (g()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long jC = c();
            return jC != -9223372036854775807L ? jC : j;
        }
        long jC2 = this.f460a.c();
        if (jC2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        com.applovin.exoplayer2.l.a.b(jC2 >= this.b);
        long j2 = this.c;
        if (j2 != Long.MIN_VALUE && jC2 > j2) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.b(z);
        return jC2;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long jD = this.f460a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.applovin.exoplayer2.h.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f = r0
            com.applovin.exoplayer2.h.d$a[] r0 = r6.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.applovin.exoplayer2.h.n r0 = r6.f460a
            long r0 = r0.b(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.b
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.exoplayer2.l.a.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.b(long):long");
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j, av avVar) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        return this.f460a.a(j, b(j, avVar));
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        long jE = this.f460a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j) {
        return this.f460a.c(j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.f460a.f();
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.d)).a((n) this);
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.d)).a(this);
    }

    boolean g() {
        return this.f != -9223372036854775807L;
    }

    private av b(long j, av avVar) {
        long jA = ai.a(avVar.f, 0L, j - this.b);
        long j2 = avVar.g;
        long j3 = this.c;
        long jA2 = ai.a(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jA == avVar.f && jA2 == avVar.g) ? avVar : new av(jA, jA2);
    }

    private static boolean a(long j, com.applovin.exoplayer2.j.d[] dVarArr) {
        if (j != 0) {
            for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
                if (dVar != null) {
                    com.applovin.exoplayer2.v vVarF = dVar.f();
                    if (!com.applovin.exoplayer2.l.u.a(vVarF.l, vVarF.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f461a;
        private boolean c;

        public a(x xVar) {
            this.f461a = xVar;
        }

        public void a() {
            this.c = false;
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            return !d.this.g() && this.f461a.b();
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            this.f461a.c();
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i) {
            if (d.this.g()) {
                return -3;
            }
            if (this.c) {
                gVar.a_(4);
                return -4;
            }
            int iA = this.f461a.a(wVar, gVar, i);
            if (iA == -5) {
                com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(wVar.b);
                if (vVar.B != 0 || vVar.C != 0) {
                    wVar.b = vVar.a().n(d.this.b != 0 ? 0 : vVar.B).o(d.this.c == Long.MIN_VALUE ? vVar.C : 0).a();
                }
                return -5;
            }
            if (d.this.c == Long.MIN_VALUE || ((iA != -4 || gVar.d < d.this.c) && !(iA == -3 && d.this.d() == Long.MIN_VALUE && !gVar.c))) {
                return iA;
            }
            gVar.a();
            gVar.a_(4);
            this.c = true;
            return -4;
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j) {
            if (d.this.g()) {
                return -3;
            }
            return this.f461a.a(j);
        }
    }
}
