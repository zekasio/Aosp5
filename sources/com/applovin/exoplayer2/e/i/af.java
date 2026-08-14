package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f338a;
    private final com.applovin.exoplayer2.e.x[] b;

    public af(List<com.applovin.exoplayer2.v> list) {
        this.f338a = list;
        this.b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 3);
            com.applovin.exoplayer2.v vVar = this.f338a.get(i);
            String str = vVar.l;
            com.applovin.exoplayer2.l.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            xVarA.a(new v.a().a(dVar.c()).f(str).b(vVar.d).c(vVar.c).p(vVar.D).a(vVar.n).a());
            this.b[i] = xVarA;
        }
    }

    public void a(long j, com.applovin.exoplayer2.l.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        int iH = yVar.h();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            com.applovin.exoplayer2.e.b.b(j, yVar, this.b);
        }
    }
}
