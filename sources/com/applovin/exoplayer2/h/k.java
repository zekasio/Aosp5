package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.a f468a;
    private final long b;
    private final com.applovin.exoplayer2.k.b c;
    private p d;
    private n e;
    private n.a f;
    private a g;
    private boolean h;
    private long i = -9223372036854775807L;

    public interface a {
        void a(p.a aVar);

        void a(p.a aVar, IOException iOException);
    }

    public k(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j) {
        this.f468a = aVar;
        this.c = bVar;
        this.b = j;
    }

    public long g() {
        return this.b;
    }

    public void d(long j) {
        this.i = j;
    }

    public long h() {
        return this.i;
    }

    public void a(p pVar) {
        com.applovin.exoplayer2.l.a.b(this.d == null);
        this.d = pVar;
    }

    public void a(p.a aVar) {
        long jE = e(this.b);
        n nVarB = ((p) com.applovin.exoplayer2.l.a.b(this.d)).b(aVar, this.c, jE);
        this.e = nVarB;
        if (this.f != null) {
            nVarB.a(this, jE);
        }
    }

    public void i() {
        if (this.e != null) {
            ((p) com.applovin.exoplayer2.l.a.b(this.d)).a(this.e);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j) {
        this.f = aVar;
        n nVar = this.e;
        if (nVar != null) {
            nVar.a(this, e(this.b));
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        try {
            n nVar = this.e;
            if (nVar != null) {
                nVar.e_();
            } else {
                p pVar = this.d;
                if (pVar != null) {
                    pVar.e();
                }
            }
        } catch (IOException e) {
            a aVar = this.g;
            if (aVar == null) {
                throw e;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            aVar.a(this.f468a, e);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return ((n) ai.a(this.e)).b();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.i;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.i = -9223372036854775807L;
            j2 = j3;
        }
        return ((n) ai.a(this.e)).a(dVarArr, zArr, xVarArr, zArr2, j2);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j, boolean z) {
        ((n) ai.a(this.e)).a(j, z);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        return ((n) ai.a(this.e)).c();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        return ((n) ai.a(this.e)).d();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j) {
        return ((n) ai.a(this.e)).b(j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j, av avVar) {
        return ((n) ai.a(this.e)).a(j, avVar);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        return ((n) ai.a(this.e)).e();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j) {
        ((n) ai.a(this.e)).a(j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j) {
        n nVar = this.e;
        return nVar != null && nVar.c(j);
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        n nVar = this.e;
        return nVar != null && nVar.f();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) ai.a(this.f)).a(this);
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) ai.a(this.f)).a((n) this);
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(this.f468a);
        }
    }

    private long e(long j) {
        long j2 = this.i;
        return j2 != -9223372036854775807L ? j2 : j;
    }
}
