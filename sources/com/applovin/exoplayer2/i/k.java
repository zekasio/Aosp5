package com.applovin.exoplayer2.i;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends com.applovin.exoplayer2.c.i implements f {
    private f c;
    private long d;

    public void a(long j, f fVar, long j2) {
        this.f103a = j;
        this.c = fVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f103a;
        }
        this.d = j2;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return ((f) com.applovin.exoplayer2.l.a.b(this.c)).f_();
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.c)).a(i) + this.d;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.c)).a(j - this.d);
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<a> b(long j) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.c)).b(j - this.d);
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.c = null;
    }
}
