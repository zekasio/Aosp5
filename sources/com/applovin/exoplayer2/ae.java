package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;

/* JADX INFO: loaded from: classes.dex */
final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.a f29a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    ae(p.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        com.applovin.exoplayer2.l.a.a(!z4 || z2);
        com.applovin.exoplayer2.l.a.a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        com.applovin.exoplayer2.l.a.a(z5);
        this.f29a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public ae a(long j) {
        return j == this.b ? this : new ae(this.f29a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public ae b(long j) {
        return j == this.c ? this : new ae(this.f29a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.b == aeVar.b && this.c == aeVar.c && this.d == aeVar.d && this.e == aeVar.e && this.f == aeVar.f && this.g == aeVar.g && this.h == aeVar.h && this.i == aeVar.i && com.applovin.exoplayer2.l.ai.a(this.f29a, aeVar.f29a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f29a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
