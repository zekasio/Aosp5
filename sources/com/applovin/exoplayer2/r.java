package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.l.p;
import com.applovin.exoplayer2.q;
import com.applovin.exoplayer2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
final class r extends d {
    private av A;
    private com.applovin.exoplayer2.h.z B;
    private boolean C;
    private an.a D;
    private ac E;
    private ac F;
    private al G;
    private int H;
    private int I;
    private long J;
    final com.applovin.exoplayer2.j.k b;
    final an.a c;
    private final ar[] d;
    private final com.applovin.exoplayer2.j.j e;
    private final com.applovin.exoplayer2.l.o f;
    private final s.e g;
    private final s h;
    private final com.applovin.exoplayer2.l.p<an.b> i;
    private final CopyOnWriteArraySet<q.a> j;
    private final ba.a k;
    private final List<a> l;
    private final boolean m;
    private final com.applovin.exoplayer2.h.r n;
    private final com.applovin.exoplayer2.a.a o;
    private final Looper p;
    private final com.applovin.exoplayer2.k.d q;
    private final long r;
    private final long s;
    private final com.applovin.exoplayer2.l.d t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    @Override // com.applovin.exoplayer2.an
    public long C() {
        return 3000L;
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
    }

    public r(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar, boolean z, av avVar, long j, long j2, z zVar, long j3, boolean z2, com.applovin.exoplayer2.l.d dVar2, Looper looper, an anVar, an.a aVar2) {
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.exoplayer2.l.ai.e + "]");
        com.applovin.exoplayer2.l.a.b(arVarArr.length > 0);
        this.d = (ar[]) com.applovin.exoplayer2.l.a.b(arVarArr);
        this.e = (com.applovin.exoplayer2.j.j) com.applovin.exoplayer2.l.a.b(jVar);
        this.n = rVar;
        this.q = dVar;
        this.o = aVar;
        this.m = z;
        this.A = avVar;
        this.r = j;
        this.s = j2;
        this.C = z2;
        this.p = looper;
        this.t = dVar2;
        this.u = 0;
        final an anVar2 = anVar != null ? anVar : this;
        this.i = new com.applovin.exoplayer2.l.p<>(looper, dVar2, new p.b() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda9
            @Override // com.applovin.exoplayer2.l.p.b
            public final void invoke(Object obj, com.applovin.exoplayer2.l.m mVar) {
                r.a(anVar2, (an.b) obj, mVar);
            }
        });
        this.j = new CopyOnWriteArraySet<>();
        this.l = new ArrayList();
        this.B = new z.a(0);
        com.applovin.exoplayer2.j.k kVar = new com.applovin.exoplayer2.j.k(new at[arVarArr.length], new com.applovin.exoplayer2.j.d[arVarArr.length], null);
        this.b = kVar;
        this.k = new ba.a();
        an.a aVarA = new an.a.C0009a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, jVar.a()).a(aVar2).a();
        this.c = aVarA;
        this.D = new an.a.C0009a().a(aVarA).a(3).a(9).a();
        this.E = ac.f26a;
        this.F = ac.f26a;
        this.H = -1;
        this.f = dVar2.a(looper, null);
        s.e eVar = new s.e() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda10
            @Override // com.applovin.exoplayer2.s.e
            public final void onPlaybackInfoUpdate(s.d dVar3) {
                this.f$0.b(dVar3);
            }
        };
        this.g = eVar;
        this.G = al.a(kVar);
        if (aVar != null) {
            aVar.a(anVar2, looper);
            a((an.d) aVar);
            dVar.a(new Handler(looper), aVar);
        }
        this.h = new s(arVarArr, jVar, kVar, aaVar, dVar, this.u, this.v, aVar, avVar, zVar, j3, z2, looper, dVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(an anVar, an.b bVar, com.applovin.exoplayer2.l.m mVar) {
        bVar.a(anVar, new an.c(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final s.d dVar) {
        this.f.a(new Runnable() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(dVar);
            }
        });
    }

    public void b(long j) {
        this.h.a(j);
    }

    public boolean q() {
        return this.G.p;
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.p;
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        a((an.b) dVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        b((an.b) dVar);
    }

    public void a(an.b bVar) {
        this.i.a(bVar);
    }

    public void b(an.b bVar) {
        this.i.b(bVar);
    }

    public void a(q.a aVar) {
        this.j.add(aVar);
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        return this.D;
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        return this.G.e;
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        return this.G.m;
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p e() {
        return this.G.f;
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        if (this.G.e != 1) {
            return;
        }
        al alVarA = this.G.a((p) null);
        al alVarA2 = alVarA.a(alVarA.f37a.d() ? 4 : 2);
        this.w++;
        this.h.a();
        a(alVarA2, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        a(Collections.singletonList(pVar));
    }

    public void a(List<com.applovin.exoplayer2.h.p> list) {
        a(list, true);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list, boolean z) {
        a(list, -1, -9223372036854775807L, z);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z) {
        a(z, 0, 1);
    }

    public void a(boolean z, int i, int i2) {
        if (this.G.l == z && this.G.m == i) {
            return;
        }
        this.w++;
        al alVarA = this.G.a(z, i);
        this.h.a(z, i);
        a(alVarA, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        return this.G.l;
    }

    @Override // com.applovin.exoplayer2.an
    public void c(final int i) {
        if (this.u != i) {
            this.u = i;
            this.h.a(i);
            this.i.a(8, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda8
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).d(i);
                }
            });
            X();
            this.i.a();
        }
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        return this.u;
    }

    @Override // com.applovin.exoplayer2.an
    public void b(final boolean z) {
        if (this.v != z) {
            this.v = z;
            this.h.a(z);
            this.i.a(9, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda12
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).e(z);
                }
            });
            X();
            this.i.a();
        }
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        return this.v;
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i, long j) {
        ba baVar = this.G.f37a;
        if (i < 0 || (!baVar.d() && i >= baVar.b())) {
            throw new y(baVar, i, j);
        }
        this.w++;
        if (K()) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            s.d dVar = new s.d(this.G);
            dVar.a(1);
            this.g.onPlaybackInfoUpdate(dVar);
            return;
        }
        int i2 = t() != 1 ? 2 : 1;
        int iG = G();
        al alVarA = a(this.G.a(i2), baVar, a(baVar, i, j));
        this.h.a(baVar, i, h.b(j));
        a(alVarA, 0, 1, true, true, 1, a(alVarA), iG);
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        return this.r;
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        return this.s;
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        return this.G.n;
    }

    public void a(boolean z, p pVar) {
        al alVarA;
        if (z) {
            alVarA = a(0, this.l.size()).a((p) null);
        } else {
            al alVar = this.G;
            alVarA = alVar.a(alVar.b);
            alVarA.q = alVarA.s;
            alVarA.r = 0L;
        }
        al alVarA2 = alVarA.a(1);
        if (pVar != null) {
            alVarA2 = alVarA2.a(pVar);
        }
        al alVar2 = alVarA2;
        this.w++;
        this.h.b();
        a(alVar2, 0, 1, false, alVar2.f37a.d() && !this.G.f37a.d(), 4, a(alVar2), -1);
    }

    public void E() {
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.exoplayer2.l.ai.e + "] [" + t.a() + "]");
        if (!this.h.c()) {
            this.i.b(10, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda13
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.e((an.b) obj);
                }
            });
        }
        this.i.b();
        this.f.a((Object) null);
        com.applovin.exoplayer2.a.a aVar = this.o;
        if (aVar != null) {
            this.q.a(aVar);
        }
        al alVarA = this.G.a(1);
        this.G = alVarA;
        al alVarA2 = alVarA.a(alVarA.b);
        this.G = alVarA2;
        alVarA2.q = alVarA2.s;
        this.G.r = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(an.b bVar) {
        bVar.a(p.a(new u(1), 1003));
    }

    public ao a(ao.b bVar) {
        return new ao(this.h, bVar, this.G.f37a, G(), this.t, this.h.d());
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        if (this.G.f37a.d()) {
            return this.I;
        }
        return this.G.f37a.c(this.G.b.f471a);
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        int iW = W();
        if (iW == -1) {
            return 0;
        }
        return iW;
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        if (K()) {
            p.a aVar = this.G.b;
            this.G.f37a.a(aVar.f471a, this.k);
            return h.a(this.k.b(aVar.b, aVar.c));
        }
        return p();
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        return h.a(a(this.G));
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        return h.a(this.G.r);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        return this.G.b.a();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        if (K()) {
            return this.G.b.b;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        if (K()) {
            return this.G.b.c;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        if (K()) {
            this.G.f37a.a(this.G.b.f471a, this.k);
            if (this.G.c == -9223372036854775807L) {
                return this.G.f37a.a(G(), this.f235a).a();
            }
            return this.k.b() + h.a(this.G.c);
        }
        return I();
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        if (this.G.f37a.d()) {
            return this.J;
        }
        if (this.G.k.d != this.G.b.d) {
            return this.G.f37a.a(G(), this.f235a).c();
        }
        long j = this.G.q;
        if (this.G.k.a()) {
            ba.a aVarA = this.G.f37a.a(this.G.k.f471a, this.k);
            long jA = aVarA.a(this.G.k.b);
            j = jA == Long.MIN_VALUE ? aVarA.d : jA;
        }
        return h.a(a(this.G.f37a, this.G.k, j));
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        return this.G.h;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        return new com.applovin.exoplayer2.j.h(this.G.i.c);
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.E;
    }

    public void a(com.applovin.exoplayer2.g.a aVar) {
        ac acVarA = this.E.a().a(aVar).a();
        if (acVarA.equals(this.E)) {
            return;
        }
        this.E = acVarA;
        this.i.b(14, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda11
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                this.f$0.d((an.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(an.b bVar) {
        bVar.a(this.E);
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        return this.G.f37a;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return com.applovin.exoplayer2.m.o.f666a;
    }

    @Override // com.applovin.exoplayer2.an
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.i.a> V() {
        return com.applovin.exoplayer2.common.a.s.g();
    }

    private int W() {
        if (this.G.f37a.d()) {
            return this.H;
        }
        return this.G.f37a.a(this.G.b.f471a, this.k).c;
    }

    private long a(al alVar) {
        if (alVar.f37a.d()) {
            return h.b(this.J);
        }
        if (alVar.b.a()) {
            return alVar.s;
        }
        return a(alVar.f37a, alVar.b, alVar.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(s.d dVar) {
        long j;
        boolean z;
        this.w -= dVar.b;
        boolean z2 = true;
        if (dVar.c) {
            this.x = dVar.d;
            this.y = true;
        }
        if (dVar.e) {
            this.z = dVar.f;
        }
        if (this.w == 0) {
            ba baVar = dVar.f676a.f37a;
            if (!this.G.f37a.d() && baVar.d()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!baVar.d()) {
                List<ba> listA = ((ap) baVar).a();
                com.applovin.exoplayer2.l.a.b(listA.size() == this.l.size());
                for (int i = 0; i < listA.size(); i++) {
                    this.l.get(i).b = listA.get(i);
                }
            }
            long jA = -9223372036854775807L;
            if (this.y) {
                if (dVar.f676a.b.equals(this.G.b) && dVar.f676a.d == this.G.s) {
                    z2 = false;
                }
                if (z2) {
                    if (baVar.d() || dVar.f676a.b.a()) {
                        jA = dVar.f676a.d;
                    } else {
                        jA = a(baVar, dVar.f676a.b, dVar.f676a.d);
                    }
                }
                j = jA;
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.y = false;
            a(dVar.f676a, 1, this.z, false, z, this.x, j, -1);
        }
    }

    private void a(final al alVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        al alVar2 = this.G;
        this.G = alVar;
        Pair<Boolean, Integer> pairA = a(alVar, alVar2, z2, i3, !alVar2.f37a.equals(alVar.f37a));
        boolean zBooleanValue = ((Boolean) pairA.first).booleanValue();
        final int iIntValue = ((Integer) pairA.second).intValue();
        ac acVarA = this.E;
        if (zBooleanValue) {
            abVar = alVar.f37a.d() ? null : alVar.f37a.a(alVar.f37a.a(alVar.b.f471a, this.k).c, this.f235a).d;
            acVarA = abVar != null ? abVar.e : ac.f26a;
        }
        if (!alVar2.j.equals(alVar.j)) {
            acVarA = acVarA.a().a(alVar.j).a();
        }
        boolean zEquals = acVarA.equals(this.E);
        this.E = acVarA;
        if (!alVar2.f37a.equals(alVar.f37a)) {
            this.i.a(0, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda15
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.b(alVar, i, (an.b) obj);
                }
            });
        }
        if (z2) {
            final an.e eVarA = a(i3, alVar2, i4);
            final an.e eVarC = c(j);
            this.i.a(11, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda21
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(i3, eVarA, eVarC, (an.b) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.i.a(1, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda22
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).a(abVar, iIntValue);
                }
            });
        }
        if (alVar2.f != alVar.f) {
            this.i.a(10, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.h(alVar, (an.b) obj);
                }
            });
            if (alVar.f != null) {
                this.i.a(10, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda2
                    @Override // com.applovin.exoplayer2.l.p.a
                    public final void invoke(Object obj) {
                        r.g(alVar, (an.b) obj);
                    }
                });
            }
        }
        if (alVar2.i != alVar.i) {
            this.e.a(alVar.i.d);
            final com.applovin.exoplayer2.j.h hVar = new com.applovin.exoplayer2.j.h(alVar.i.c);
            this.i.a(2, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda3
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(alVar, hVar, (an.b) obj);
                }
            });
        }
        if (!zEquals) {
            final ac acVar = this.E;
            this.i.a(14, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda4
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).a(acVar);
                }
            });
        }
        if (alVar2.g != alVar.g) {
            this.i.a(3, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda5
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.f(alVar, (an.b) obj);
                }
            });
        }
        if (alVar2.e != alVar.e || alVar2.l != alVar.l) {
            this.i.a(-1, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda6
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.e(alVar, (an.b) obj);
                }
            });
        }
        if (alVar2.e != alVar.e) {
            this.i.a(4, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda7
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.d(alVar, (an.b) obj);
                }
            });
        }
        if (alVar2.l != alVar.l) {
            this.i.a(5, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda16
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(alVar, i2, (an.b) obj);
                }
            });
        }
        if (alVar2.m != alVar.m) {
            this.i.a(6, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda17
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.c(alVar, (an.b) obj);
                }
            });
        }
        if (c(alVar2) != c(alVar)) {
            this.i.a(7, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda18
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.b(alVar, (an.b) obj);
                }
            });
        }
        if (!alVar2.n.equals(alVar.n)) {
            this.i.a(12, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda19
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(alVar, (an.b) obj);
                }
            });
        }
        if (z) {
            this.i.a(-1, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda20
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).b();
                }
            });
        }
        X();
        this.i.a();
        if (alVar2.o != alVar.o) {
            Iterator<q.a> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a(alVar.o);
            }
        }
        if (alVar2.p != alVar.p) {
            Iterator<q.a> it2 = this.j.iterator();
            while (it2.hasNext()) {
                it2.next().b(alVar.p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(al alVar, int i, an.b bVar) {
        bVar.a(alVar.f37a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i, an.e eVar, an.e eVar2, an.b bVar) {
        bVar.e(i);
        bVar.a(eVar, eVar2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(al alVar, an.b bVar) {
        bVar.b(alVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(al alVar, an.b bVar) {
        bVar.a(alVar.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, com.applovin.exoplayer2.j.h hVar, an.b bVar) {
        bVar.a(alVar.h, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(al alVar, an.b bVar) {
        bVar.c(alVar.g);
        bVar.b_(alVar.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(al alVar, an.b bVar) {
        bVar.a(alVar.l, alVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(al alVar, an.b bVar) {
        bVar.b(alVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, int i, an.b bVar) {
        bVar.b(alVar.l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(al alVar, an.b bVar) {
        bVar.c(alVar.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(al alVar, an.b bVar) {
        bVar.d(c(alVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(al alVar, an.b bVar) {
        bVar.a(alVar.n);
    }

    private an.e a(int i, al alVar, int i2) {
        int i3;
        Object obj;
        ab abVar;
        Object obj2;
        int i4;
        long jB;
        long jB2;
        ba.a aVar = new ba.a();
        if (alVar.f37a.d()) {
            i3 = i2;
            obj = null;
            abVar = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = alVar.b.f471a;
            alVar.f37a.a(obj3, aVar);
            int i5 = aVar.c;
            int iC = alVar.f37a.c(obj3);
            Object obj4 = alVar.f37a.a(i5, this.f235a).b;
            abVar = this.f235a.d;
            obj2 = obj3;
            i4 = iC;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            jB = aVar.e + aVar.d;
            if (alVar.b.a()) {
                jB = aVar.b(alVar.b.b, alVar.b.c);
                jB2 = b(alVar);
            } else {
                if (alVar.b.e != -1 && this.G.b.a()) {
                    jB = b(this.G);
                }
                jB2 = jB;
            }
        } else if (alVar.b.a()) {
            jB = alVar.s;
            jB2 = b(alVar);
        } else {
            jB = aVar.e + alVar.s;
            jB2 = jB;
        }
        return new an.e(obj, i3, abVar, obj2, i4, h.a(jB), h.a(jB2), alVar.b.b, alVar.b.c);
    }

    private an.e c(long j) {
        Object obj;
        ab abVar;
        Object obj2;
        int iC;
        int iG = G();
        if (this.G.f37a.d()) {
            obj = null;
            abVar = null;
            obj2 = null;
            iC = -1;
        } else {
            Object obj3 = this.G.b.f471a;
            this.G.f37a.a(obj3, this.k);
            iC = this.G.f37a.c(obj3);
            obj = this.G.f37a.a(iG, this.f235a).b;
            abVar = this.f235a.d;
            obj2 = obj3;
        }
        long jA = h.a(j);
        return new an.e(obj, iG, abVar, obj2, iC, jA, this.G.b.a() ? h.a(b(this.G)) : jA, this.G.b.b, this.G.b.c);
    }

    private static long b(al alVar) {
        ba.c cVar = new ba.c();
        ba.a aVar = new ba.a();
        alVar.f37a.a(alVar.b.f471a, aVar);
        if (alVar.c == -9223372036854775807L) {
            return alVar.f37a.a(aVar.c, cVar).b();
        }
        return aVar.c() + alVar.c;
    }

    private Pair<Boolean, Integer> a(al alVar, al alVar2, boolean z, int i, boolean z2) {
        ba baVar = alVar2.f37a;
        ba baVar2 = alVar.f37a;
        if (baVar2.d() && baVar.d()) {
            return new Pair<>(false, -1);
        }
        int i2 = 3;
        if (baVar2.d() != baVar.d()) {
            return new Pair<>(true, 3);
        }
        if (baVar.a(baVar.a(alVar2.b.f471a, this.k).c, this.f235a).b.equals(baVar2.a(baVar2.a(alVar.b.f471a, this.k).c, this.f235a).b)) {
            if (z && i == 0 && alVar2.b.d < alVar.b.d) {
                return new Pair<>(true, 0);
            }
            return new Pair<>(false, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(true, Integer.valueOf(i2));
    }

    private void X() {
        an.a aVar = this.D;
        an.a aVarA = a(this.c);
        this.D = aVarA;
        if (aVarA.equals(aVar)) {
            return;
        }
        this.i.a(13, new p.a() { // from class: com.applovin.exoplayer2.r$$ExternalSyntheticLambda14
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                this.f$0.c((an.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(an.b bVar) {
        bVar.a(this.D);
    }

    private void a(List<com.applovin.exoplayer2.h.p> list, int i, long j, boolean z) {
        int iB;
        long j2;
        int iW = W();
        long jI = I();
        this.w++;
        if (!this.l.isEmpty()) {
            b(0, this.l.size());
        }
        List<ah.c> listA = a(0, list);
        ba baVarY = Y();
        if (!baVarY.d() && i >= baVarY.b()) {
            throw new y(baVarY, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            iB = baVarY.b(this.v);
        } else if (i == -1) {
            iB = iW;
            j2 = jI;
        } else {
            iB = i;
            j2 = j;
        }
        al alVarA = a(this.G, baVarY, a(baVarY, iB, j2));
        int i2 = alVarA.e;
        if (iB != -1 && alVarA.e != 1) {
            i2 = (baVarY.d() || iB >= baVarY.b()) ? 4 : 2;
        }
        al alVarA2 = alVarA.a(i2);
        this.h.a(listA, iB, h.b(j2), this.B);
        a(alVarA2, 0, 1, false, (this.G.b.f471a.equals(alVarA2.b.f471a) || this.G.f37a.d()) ? false : true, 4, a(alVarA2), -1);
    }

    private List<ah.c> a(int i, List<com.applovin.exoplayer2.h.p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ah.c cVar = new ah.c(list.get(i2), this.m);
            arrayList.add(cVar);
            this.l.add(i2 + i, new a(cVar.b, cVar.f34a.f()));
        }
        this.B = this.B.a(i, arrayList.size());
        return arrayList;
    }

    private al a(int i, int i2) {
        com.applovin.exoplayer2.l.a.a(i >= 0 && i2 >= i && i2 <= this.l.size());
        int iG = G();
        ba baVarS = S();
        int size = this.l.size();
        this.w++;
        b(i, i2);
        ba baVarY = Y();
        al alVarA = a(this.G, baVarY, a(baVarS, baVarY));
        if (alVarA.e != 1 && alVarA.e != 4 && i < i2 && i2 == size && iG >= alVarA.f37a.b()) {
            alVarA = alVarA.a(4);
        }
        this.h.a(i, i2, this.B);
        return alVarA;
    }

    private void b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.l.remove(i3);
        }
        this.B = this.B.b(i, i2);
    }

    private ba Y() {
        return new ap(this.l, this.B);
    }

    private al a(al alVar, ba baVar, Pair<Object, Long> pair) {
        long jB;
        com.applovin.exoplayer2.l.a.a(baVar.d() || pair != null);
        ba baVar2 = alVar.f37a;
        al alVarA = alVar.a(baVar);
        if (baVar.d()) {
            p.a aVarA = al.a();
            long jB2 = h.b(this.J);
            al alVarA2 = alVarA.a(aVarA, jB2, jB2, jB2, 0L, com.applovin.exoplayer2.h.ad.f458a, this.b, com.applovin.exoplayer2.common.a.s.g()).a(aVarA);
            alVarA2.q = alVarA2.s;
            return alVarA2;
        }
        Object obj = alVarA.b.f471a;
        boolean zEquals = obj.equals(((Pair) com.applovin.exoplayer2.l.ai.a(pair)).first);
        p.a aVar = !zEquals ? new p.a(pair.first) : alVarA.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jB3 = h.b(N());
        if (!baVar2.d()) {
            jB3 -= baVar2.a(obj, this.k).c();
        }
        if (!zEquals || jLongValue < jB3) {
            com.applovin.exoplayer2.l.a.b(!aVar.a());
            al alVarA3 = alVarA.a(aVar, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? com.applovin.exoplayer2.h.ad.f458a : alVarA.h, !zEquals ? this.b : alVarA.i, !zEquals ? com.applovin.exoplayer2.common.a.s.g() : alVarA.j).a(aVar);
            alVarA3.q = jLongValue;
            return alVarA3;
        }
        if (jLongValue == jB3) {
            int iC = baVar.c(alVarA.k.f471a);
            if (iC == -1 || baVar.a(iC, this.k).c != baVar.a(aVar.f471a, this.k).c) {
                baVar.a(aVar.f471a, this.k);
                if (aVar.a()) {
                    jB = this.k.b(aVar.b, aVar.c);
                } else {
                    jB = this.k.d;
                }
                alVarA = alVarA.a(aVar, alVarA.s, alVarA.s, alVarA.d, jB - alVarA.s, alVarA.h, alVarA.i, alVarA.j).a(aVar);
                alVarA.q = jB;
            }
        } else {
            com.applovin.exoplayer2.l.a.b(!aVar.a());
            long jMax = Math.max(0L, alVarA.r - (jLongValue - jB3));
            long j = alVarA.q;
            if (alVarA.k.equals(alVarA.b)) {
                j = jLongValue + jMax;
            }
            alVarA = alVarA.a(aVar, jLongValue, jLongValue, jLongValue, jMax, alVarA.h, alVarA.i, alVarA.j);
            alVarA.q = j;
        }
        return alVarA;
    }

    private Pair<Object, Long> a(ba baVar, ba baVar2) {
        long jN = N();
        if (baVar.d() || baVar2.d()) {
            boolean z = !baVar.d() && baVar2.d();
            int iW = z ? -1 : W();
            if (z) {
                jN = -9223372036854775807L;
            }
            return a(baVar2, iW, jN);
        }
        Pair<Object, Long> pairA = baVar.a(this.f235a, this.k, G(), h.b(jN));
        Object obj = ((Pair) com.applovin.exoplayer2.l.ai.a(pairA)).first;
        if (baVar2.c(obj) != -1) {
            return pairA;
        }
        Object objA = s.a(this.f235a, this.k, this.u, this.v, obj, baVar, baVar2);
        if (objA != null) {
            baVar2.a(objA, this.k);
            return a(baVar2, this.k.c, baVar2.a(this.k.c, this.f235a).a());
        }
        return a(baVar2, -1, -9223372036854775807L);
    }

    private Pair<Object, Long> a(ba baVar, int i, long j) {
        if (baVar.d()) {
            this.H = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.J = j;
            this.I = 0;
            return null;
        }
        if (i == -1 || i >= baVar.b()) {
            i = baVar.b(this.v);
            j = baVar.a(i, this.f235a).a();
        }
        return baVar.a(this.f235a, this.k, i, h.b(j));
    }

    private long a(ba baVar, p.a aVar, long j) {
        baVar.a(aVar.f471a, this.k);
        return j + this.k.c();
    }

    private static boolean c(al alVar) {
        return alVar.e == 3 && alVar.l && alVar.m == 0;
    }

    private static final class a implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f670a;
        private ba b;

        public a(Object obj, ba baVar) {
            this.f670a = obj;
            this.b = baVar;
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.f670a;
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.b;
        }
    }
}
