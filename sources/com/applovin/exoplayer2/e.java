package com.applovin.exoplayer2;

import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ar, as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f261a;
    private at c;
    private int d;
    private int e;
    private com.applovin.exoplayer2.h.x f;
    private v[] g;
    private long h;
    private long i;
    private boolean k;
    private boolean l;
    private final w b = new w();
    private long j = Long.MIN_VALUE;

    @Override // com.applovin.exoplayer2.ar
    public /* synthetic */ void a(float f, float f2) throws p {
        ar.CC.$default$a(this, f, f2);
    }

    @Override // com.applovin.exoplayer2.ao.b
    public void a(int i, Object obj) throws p {
    }

    protected void a(long j, boolean z) throws p {
    }

    protected void a(boolean z, boolean z2) throws p {
    }

    protected void a(v[] vVarArr, long j, long j2) throws p {
    }

    @Override // com.applovin.exoplayer2.ar
    public final as b() {
        return this;
    }

    @Override // com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return null;
    }

    @Override // com.applovin.exoplayer2.as
    public int o() throws p {
        return 0;
    }

    protected void p() throws p {
    }

    protected void q() {
    }

    protected void r() {
    }

    protected void s() {
    }

    public e(int i) {
        this.f261a = i;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public final int a() {
        return this.f261a;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(int i) {
        this.d = i;
    }

    @Override // com.applovin.exoplayer2.ar
    public final int d_() {
        return this.e;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(at atVar, v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j, boolean z, boolean z2, long j2, long j3) throws p {
        com.applovin.exoplayer2.l.a.b(this.e == 0);
        this.c = atVar;
        this.e = 1;
        this.i = j;
        a(z, z2);
        a(vVarArr, xVar, j2, j3);
        a(j, z);
    }

    @Override // com.applovin.exoplayer2.ar
    public final void e() throws p {
        com.applovin.exoplayer2.l.a.b(this.e == 1);
        this.e = 2;
        p();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j, long j2) throws p {
        com.applovin.exoplayer2.l.a.b(!this.k);
        this.f = xVar;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.g = vVarArr;
        this.h = j2;
        a(vVarArr, j, j2);
    }

    @Override // com.applovin.exoplayer2.ar
    public final com.applovin.exoplayer2.h.x f() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean g() {
        return this.j == Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.ar
    public final long h() {
        return this.j;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void i() {
        this.k = true;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean j() {
        return this.k;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void k() throws IOException {
        ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).c();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(long j) throws p {
        this.k = false;
        this.i = j;
        this.j = j;
        a(j, false);
    }

    @Override // com.applovin.exoplayer2.ar
    public final void l() {
        com.applovin.exoplayer2.l.a.b(this.e == 2);
        this.e = 1;
        q();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void m() {
        com.applovin.exoplayer2.l.a.b(this.e == 1);
        this.b.a();
        this.e = 0;
        this.f = null;
        this.g = null;
        this.k = false;
        r();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void n() {
        com.applovin.exoplayer2.l.a.b(this.e == 0);
        this.b.a();
        s();
    }

    protected final w t() {
        this.b.a();
        return this.b;
    }

    protected final v[] u() {
        return (v[]) com.applovin.exoplayer2.l.a.b(this.g);
    }

    protected final at v() {
        return (at) com.applovin.exoplayer2.l.a.b(this.c);
    }

    protected final int w() {
        return this.d;
    }

    protected final p a(Throwable th, v vVar, int i) {
        return a(th, vVar, false, i);
    }

    protected final p a(Throwable th, v vVar, boolean z, int i) {
        int i2;
        if (vVar == null || this.l) {
            i2 = 4;
        } else {
            this.l = true;
            try {
                int iC = as.CC.c(a(vVar));
                this.l = false;
                i2 = iC;
            } catch (p unused) {
                this.l = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.l = false;
                throw th2;
            }
        }
        return p.a(th, y(), w(), vVar, i2, z, i);
    }

    protected final int a(w wVar, com.applovin.exoplayer2.c.g gVar, int i) {
        int iA = ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).a(wVar, gVar, i);
        if (iA == -4) {
            if (gVar.c()) {
                this.j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            gVar.d += this.h;
            this.j = Math.max(this.j, gVar.d);
        } else if (iA == -5) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(wVar.b);
            if (vVar.p != Long.MAX_VALUE) {
                wVar.b = vVar.a().a(vVar.p + this.h).a();
            }
        }
        return iA;
    }

    protected int b(long j) {
        return ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).a(j - this.h);
    }

    protected final boolean x() {
        return g() ? this.k : ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).b();
    }
}
