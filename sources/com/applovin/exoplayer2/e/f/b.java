package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.r;

/* JADX INFO: loaded from: classes.dex */
final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f288a;
    private final r b;
    private final r c;
    private long d;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public b(long j, long j2, long j3) {
        this.d = j;
        this.f288a = j3;
        r rVar = new r();
        this.b = rVar;
        r rVar2 = new r();
        this.c = rVar2;
        rVar.a(0L);
        rVar2.a(j2);
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j) {
        return this.b.a(ai.a(this.c, j, true, true));
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f288a;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        int iA = ai.a(this.b, j, true, true);
        w wVar = new w(this.b.a(iA), this.c.a(iA));
        if (wVar.b == j || iA == this.b.a() - 1) {
            return new v.a(wVar);
        }
        int i = iA + 1;
        return new v.a(wVar, new w(this.b.a(i), this.c.a(i)));
    }

    public void a(long j, long j2) {
        if (b(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }

    public boolean b(long j) {
        r rVar = this.b;
        return j - rVar.a(rVar.a() - 1) < 100000;
    }

    void d(long j) {
        this.d = j;
    }
}
