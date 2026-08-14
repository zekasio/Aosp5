package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.exoplayer2.v f361a;
    private ag b;
    private com.applovin.exoplayer2.e.x c;

    public s(String str) {
        this.f361a = new v.a().f(str).a();
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.b = agVar;
        dVar.a();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 5);
        this.c = xVarA;
        xVarA.a(this.f361a);
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(com.applovin.exoplayer2.l.y yVar) {
        a();
        long jB = this.b.b();
        long jC = this.b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        if (jC != this.f361a.p) {
            com.applovin.exoplayer2.v vVarA = this.f361a.a().a(jC).a();
            this.f361a = vVarA;
            this.c.a(vVarA);
        }
        int iA = yVar.a();
        this.c.a(yVar, iA);
        this.c.a(jB, 1, iA, 0, null);
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.b);
        ai.a(this.c);
    }
}
