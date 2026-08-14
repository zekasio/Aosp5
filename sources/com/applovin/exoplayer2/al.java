package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class al {
    private static final p.a t = new p.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba f37a;
    public final p.a b;
    public final long c;
    public final long d;
    public final int e;
    public final p f;
    public final boolean g;
    public final com.applovin.exoplayer2.h.ad h;
    public final com.applovin.exoplayer2.j.k i;
    public final List<com.applovin.exoplayer2.g.a> j;
    public final p.a k;
    public final boolean l;
    public final int m;
    public final am n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public static al a(com.applovin.exoplayer2.j.k kVar) {
        ba baVar = ba.f89a;
        p.a aVar = t;
        return new al(baVar, aVar, -9223372036854775807L, 0L, 1, null, false, com.applovin.exoplayer2.h.ad.f458a, kVar, com.applovin.exoplayer2.common.a.s.g(), aVar, false, 0, am.f38a, 0L, 0L, 0L, false, false);
    }

    public al(ba baVar, p.a aVar, long j, long j2, int i, p pVar, boolean z, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.k kVar, List<com.applovin.exoplayer2.g.a> list, p.a aVar2, boolean z2, int i2, am amVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f37a = baVar;
        this.b = aVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = pVar;
        this.g = z;
        this.h = adVar;
        this.i = kVar;
        this.j = list;
        this.k = aVar2;
        this.l = z2;
        this.m = i2;
        this.n = amVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }

    public static p.a a() {
        return t;
    }

    public al a(p.a aVar, long j, long j2, long j3, long j4, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.k kVar, List<com.applovin.exoplayer2.g.a> list) {
        return new al(this.f37a, aVar, j2, j3, this.e, this.f, this.g, adVar, kVar, list, this.k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    public al a(ba baVar) {
        return new al(baVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(int i) {
        return new al(this.f37a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(p pVar) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, pVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(boolean z) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(p.a aVar) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(boolean z, int i) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public al a(am amVar) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, amVar, this.q, this.r, this.s, this.o, this.p);
    }

    public al b(boolean z) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public al c(boolean z) {
        return new al(this.f37a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, z);
    }
}
