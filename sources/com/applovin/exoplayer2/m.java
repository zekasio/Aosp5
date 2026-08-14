package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class m implements com.applovin.exoplayer2.l.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.ac f639a;
    private final a b;
    private ar c;
    private com.applovin.exoplayer2.l.s d;
    private boolean e = true;
    private boolean f;

    public interface a {
        void a(am amVar);
    }

    public m(a aVar, com.applovin.exoplayer2.l.d dVar) {
        this.b = aVar;
        this.f639a = new com.applovin.exoplayer2.l.ac(dVar);
    }

    public void a() {
        this.f = true;
        this.f639a.a();
    }

    public void b() {
        this.f = false;
        this.f639a.b();
    }

    public void a(long j) {
        this.f639a.a(j);
    }

    public void a(ar arVar) throws p {
        com.applovin.exoplayer2.l.s sVar;
        com.applovin.exoplayer2.l.s sVarC = arVar.c();
        if (sVarC == null || sVarC == (sVar = this.d)) {
            return;
        }
        if (sVar != null) {
            throw p.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.d = sVarC;
        this.c = arVar;
        sVarC.a(this.f639a.d());
    }

    public void b(ar arVar) {
        if (arVar == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public long a(boolean z) {
        b(z);
        return c_();
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        if (this.e) {
            return this.f639a.c_();
        }
        return ((com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.d)).c_();
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        com.applovin.exoplayer2.l.s sVar = this.d;
        if (sVar != null) {
            sVar.a(amVar);
            amVar = this.d.d();
        }
        this.f639a.a(amVar);
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        com.applovin.exoplayer2.l.s sVar = this.d;
        if (sVar != null) {
            return sVar.d();
        }
        return this.f639a.d();
    }

    private void b(boolean z) {
        if (c(z)) {
            this.e = true;
            if (this.f) {
                this.f639a.a();
                return;
            }
            return;
        }
        com.applovin.exoplayer2.l.s sVar = (com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.d);
        long jC_ = sVar.c_();
        if (this.e) {
            if (jC_ < this.f639a.c_()) {
                this.f639a.b();
                return;
            } else {
                this.e = false;
                if (this.f) {
                    this.f639a.a();
                }
            }
        }
        this.f639a.a(jC_);
        am amVarD = sVar.d();
        if (amVarD.equals(this.f639a.d())) {
            return;
        }
        this.f639a.a(amVarD);
        this.b.a(amVarD);
    }

    private boolean c(boolean z) {
        ar arVar = this.c;
        return arVar == null || arVar.A() || (!this.c.z() && (z || this.c.g()));
    }
}
