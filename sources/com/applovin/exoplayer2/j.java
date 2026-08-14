package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class j implements i {
    private final long b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f550a = -9223372036854775807L;
    private final boolean c = false;

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar) {
        anVar.w();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, boolean z) {
        anVar.a(z);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i, long j) {
        anVar.a(i, j);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar) {
        anVar.g();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean c(an anVar) {
        anVar.j();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean d(an anVar) {
        if (!this.c) {
            anVar.c();
            return true;
        }
        if (!a() || !anVar.o()) {
            return true;
        }
        a(anVar, -this.f550a);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean e(an anVar) {
        if (!this.c) {
            anVar.d();
            return true;
        }
        if (!b() || !anVar.o()) {
            return true;
        }
        a(anVar, this.b);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i) {
        anVar.c(i);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar, boolean z) {
        anVar.b(z);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a() {
        return !this.c || this.f550a > 0;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b() {
        return !this.c || this.b > 0;
    }

    private static void a(an anVar, long j) {
        long jI = anVar.I() + j;
        long jH = anVar.H();
        if (jH != -9223372036854775807L) {
            jI = Math.min(jI, jH);
        }
        anVar.a(Math.max(jI, 0L));
    }
}
