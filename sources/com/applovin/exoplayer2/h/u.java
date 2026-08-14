package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.s;
import com.applovin.exoplayer2.h.t;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.k.i;

/* JADX INFO: loaded from: classes.dex */
public final class u extends com.applovin.exoplayer2.h.a implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab f478a;
    private final ab.f b;
    private final i.a c;
    private final s.a d;
    private final com.applovin.exoplayer2.d.h e;
    private final com.applovin.exoplayer2.k.v f;
    private final int g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private com.applovin.exoplayer2.k.aa l;

    @Override // com.applovin.exoplayer2.h.p
    public void e() {
    }

    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i.a f479a;
        private s.a b;
        private com.applovin.exoplayer2.d.i c;
        private com.applovin.exoplayer2.k.v d;
        private int e;
        private String f;
        private Object g;

        public a(i.a aVar) {
            this(aVar, new com.applovin.exoplayer2.e.f());
        }

        public a(i.a aVar, final com.applovin.exoplayer2.e.l lVar) {
            this(aVar, new s.a() { // from class: com.applovin.exoplayer2.h.u$a$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.h.s.a
                public final s createProgressiveMediaExtractor() {
                    return u.a.a(lVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ s a(com.applovin.exoplayer2.e.l lVar) {
            return new c(lVar);
        }

        public a(i.a aVar, s.a aVar2) {
            this.f479a = aVar;
            this.b = aVar2;
            this.c = new com.applovin.exoplayer2.d.d();
            this.d = new com.applovin.exoplayer2.k.r();
            this.e = 1048576;
        }

        public u a(com.applovin.exoplayer2.ab abVar) {
            com.applovin.exoplayer2.l.a.b(abVar.c);
            boolean z = abVar.c.h == null && this.g != null;
            boolean z2 = abVar.c.f == null && this.f != null;
            if (z && z2) {
                abVar = abVar.a().a(this.g).b(this.f).a();
            } else if (z) {
                abVar = abVar.a().a(this.g).a();
            } else if (z2) {
                abVar = abVar.a().b(this.f).a();
            }
            com.applovin.exoplayer2.ab abVar2 = abVar;
            return new u(abVar2, this.f479a, this.b, this.c.a(abVar2), this.d, this.e);
        }
    }

    private u(com.applovin.exoplayer2.ab abVar, i.a aVar, s.a aVar2, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.k.v vVar, int i) {
        this.b = (ab.f) com.applovin.exoplayer2.l.a.b(abVar.c);
        this.f478a = abVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = hVar;
        this.f = vVar;
        this.g = i;
        this.h = true;
        this.i = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f478a;
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.l = aaVar;
        this.e.a();
        f();
    }

    @Override // com.applovin.exoplayer2.h.p
    public n b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j) {
        com.applovin.exoplayer2.k.i iVarC = this.c.c();
        com.applovin.exoplayer2.k.aa aaVar = this.l;
        if (aaVar != null) {
            iVarC.a(aaVar);
        }
        return new t(this.b.f25a, iVarC, this.d.createProgressiveMediaExtractor(), this.e, b(aVar), this.f, a(aVar), this, bVar, this.b.f, this.g);
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((t) nVar).g();
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void c() {
        this.e.b();
    }

    @Override // com.applovin.exoplayer2.h.t.b
    public void a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.i;
        }
        if (!this.h && this.i == j && this.j == z && this.k == z2) {
            return;
        }
        this.i = j;
        this.j = z;
        this.k = z2;
        this.h = false;
        f();
    }

    private void f() {
        ba aaVar = new aa(this.i, this.j, false, this.k, null, this.f478a);
        if (this.h) {
            aaVar = new h(aaVar) { // from class: com.applovin.exoplayer2.h.u.1
                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.c a(int i, ba.c cVar, long j) {
                    super.a(i, cVar, j);
                    cVar.m = true;
                    return cVar;
                }

                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.a a(int i, ba.a aVar, boolean z) {
                    super.a(i, aVar, z);
                    aVar.f = true;
                    return aVar;
                }
            };
        }
        a(aaVar);
    }
}
