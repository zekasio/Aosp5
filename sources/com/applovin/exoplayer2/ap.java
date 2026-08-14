package com.applovin.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ap extends a {
    private final int c;
    private final int d;
    private final int[] e;
    private final int[] f;
    private final ba[] g;
    private final Object[] h;
    private final HashMap<Object, Integer> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(Collection<? extends ag> collection, com.applovin.exoplayer2.h.z zVar) {
        super(false, zVar);
        int iB = 0;
        int size = collection.size();
        this.e = new int[size];
        this.f = new int[size];
        this.g = new ba[size];
        this.h = new Object[size];
        this.i = new HashMap<>();
        int iC = 0;
        int i = 0;
        for (ag agVar : collection) {
            this.g[i] = agVar.b();
            this.f[i] = iB;
            this.e[i] = iC;
            iB += this.g[i].b();
            iC += this.g[i].c();
            this.h[i] = agVar.a();
            this.i.put(this.h[i], Integer.valueOf(i));
            i++;
        }
        this.c = iB;
        this.d = iC;
    }

    List<ba> a() {
        return Arrays.asList(this.g);
    }

    @Override // com.applovin.exoplayer2.a
    protected int b(int i) {
        return com.applovin.exoplayer2.l.ai.a(this.e, i + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.a
    protected int c(int i) {
        return com.applovin.exoplayer2.l.ai.a(this.f, i + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.a
    protected int d(Object obj) {
        Integer num = this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.exoplayer2.a
    protected ba d(int i) {
        return this.g[i];
    }

    @Override // com.applovin.exoplayer2.a
    protected int e(int i) {
        return this.e[i];
    }

    @Override // com.applovin.exoplayer2.a
    protected int f(int i) {
        return this.f[i];
    }

    @Override // com.applovin.exoplayer2.a
    protected Object g(int i) {
        return this.h[i];
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return this.d;
    }
}
