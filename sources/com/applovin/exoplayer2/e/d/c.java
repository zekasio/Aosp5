package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.q;

/* JADX INFO: loaded from: classes.dex */
final class c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f276a;

    public c(i iVar, long j) {
        super(iVar);
        com.applovin.exoplayer2.l.a.a(iVar.c() >= j);
        this.f276a = j;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long c() {
        return super.c() - this.f276a;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long b() {
        return super.b() - this.f276a;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long d() {
        return super.d() - this.f276a;
    }
}
