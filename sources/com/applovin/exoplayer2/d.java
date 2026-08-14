package com.applovin.exoplayer2;

import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ba.c f235a = new ba.c();

    protected d() {
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a(int i) {
        return s().a(i);
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a() {
        return t() == 3 && x() && u() == 0;
    }

    public final void b_() {
        b(G());
    }

    public final void b(int i) {
        a(i, -9223372036854775807L);
    }

    @Override // com.applovin.exoplayer2.an
    public final void a(long j) {
        a(G(), j);
    }

    @Override // com.applovin.exoplayer2.an
    public final void c() {
        b(-A());
    }

    @Override // com.applovin.exoplayer2.an
    public final void d() {
        b(B());
    }

    public final boolean a_() {
        return l() != -1;
    }

    public final void f() {
        int iL = l();
        if (iL != -1) {
            b(iL);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void g() {
        if (S().d() || K()) {
            return;
        }
        boolean zA_ = a_();
        if (n() && !o()) {
            if (zA_) {
                f();
            }
        } else if (zA_ && I() <= C()) {
            f();
        } else {
            a(0L);
        }
    }

    public final boolean h() {
        return k() != -1;
    }

    public final void i() {
        int iK = k();
        if (iK != -1) {
            b(iK);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void j() {
        if (S().d() || K()) {
            return;
        }
        if (h()) {
            i();
        } else if (n() && m()) {
            b_();
        }
    }

    public final int k() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -1;
        }
        return baVarS.a(G(), q(), z());
    }

    public final int l() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -1;
        }
        return baVarS.b(G(), q(), z());
    }

    public final boolean m() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f235a).j;
    }

    public final boolean n() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f235a).e();
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean o() {
        ba baVarS = S();
        return !baVarS.d() && baVarS.a(G(), this.f235a).i;
    }

    public final long p() {
        ba baVarS = S();
        if (baVarS.d()) {
            return -9223372036854775807L;
        }
        return baVarS.a(G(), this.f235a).c();
    }

    protected an.a a(an.a aVar) {
        return new an.a.C0009a().a(aVar).a(3, !K()).a(4, o() && !K()).a(5, a_() && !K()).a(6, !S().d() && (a_() || !n() || o()) && !K()).a(7, h() && !K()).a(8, !S().d() && (h() || (n() && m())) && !K()).a(9, !K()).a(10, o() && !K()).a(11, o() && !K()).a();
    }

    private int q() {
        int iY = y();
        if (iY == 1) {
            return 0;
        }
        return iY;
    }

    private void b(long j) {
        long jI = I() + j;
        long jH = H();
        if (jH != -9223372036854775807L) {
            jI = Math.min(jI, jH);
        }
        a(Math.max(jI, 0L));
    }
}
