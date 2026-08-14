package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.am;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f606a;
    private boolean b;
    private long c;
    private long d;
    private am e = am.f38a;

    public ac(d dVar) {
        this.f606a = dVar;
    }

    public void a() {
        if (this.b) {
            return;
        }
        this.d = this.f606a.a();
        this.b = true;
    }

    public void b() {
        if (this.b) {
            a(c_());
            this.b = false;
        }
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.f606a.a();
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        long jA;
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jA2 = this.f606a.a() - this.d;
        if (this.e.b == 1.0f) {
            jA = com.applovin.exoplayer2.h.b(jA2);
        } else {
            jA = this.e.a(jA2);
        }
        return j + jA;
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        if (this.b) {
            a(c_());
        }
        this.e = amVar;
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.e;
    }
}
