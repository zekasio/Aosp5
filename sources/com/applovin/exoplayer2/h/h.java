package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ba {
    protected final ba c;

    public h(ba baVar) {
        this.c = baVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return this.c.b();
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(int i, int i2, boolean z) {
        return this.c.a(i, i2, z);
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(int i, int i2, boolean z) {
        return this.c.b(i, i2, z);
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(boolean z) {
        return this.c.a(z);
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(boolean z) {
        return this.c.b(z);
    }

    @Override // com.applovin.exoplayer2.ba
    public ba.c a(int i, ba.c cVar, long j) {
        return this.c.a(i, cVar, j);
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return this.c.c();
    }

    @Override // com.applovin.exoplayer2.ba
    public ba.a a(int i, ba.a aVar, boolean z) {
        return this.c.a(i, aVar, z);
    }

    @Override // com.applovin.exoplayer2.ba
    public int c(Object obj) {
        return this.c.c(obj);
    }

    @Override // com.applovin.exoplayer2.ba
    public Object a(int i) {
        return this.c.a(i);
    }
}
