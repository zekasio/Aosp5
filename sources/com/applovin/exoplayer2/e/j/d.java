package com.applovin.exoplayer2.e.j;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f375a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public d(b bVar, int i, long j, long j2) {
        this.f375a = bVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) bVar.e);
        this.d = j3;
        this.e = b(j3);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.e;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        long jA = ai.a((((long) this.f375a.c) * j) / (((long) this.b) * 1000000), 0L, this.d - 1);
        long j2 = this.c + (((long) this.f375a.e) * jA);
        long jB = b(jA);
        w wVar = new w(jB, j2);
        if (jB >= j || jA == this.d - 1) {
            return new v.a(wVar);
        }
        long j3 = jA + 1;
        return new v.a(wVar, new w(b(j3), this.c + (((long) this.f375a.e) * j3)));
    }

    private long b(long j) {
        return ai.d(j * ((long) this.b), 1000000L, this.f375a.c);
    }
}
