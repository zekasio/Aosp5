package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f247a = new Object();
    private ab.d b;
    private h c;
    private t.b d;
    private String e;

    @Override // com.applovin.exoplayer2.d.i
    public h a(ab abVar) {
        h hVar;
        com.applovin.exoplayer2.l.a.b(abVar.c);
        ab.d dVar = abVar.c.c;
        if (dVar == null || ai.f611a < 18) {
            return h.b;
        }
        synchronized (this.f247a) {
            if (!ai.a(dVar, this.b)) {
                this.b = dVar;
                this.c = a(dVar);
            }
            hVar = (h) com.applovin.exoplayer2.l.a.b(this.c);
        }
        return hVar;
    }

    private h a(ab.d dVar) {
        t.b bVarA = this.d;
        if (bVarA == null) {
            bVarA = new q.a().a(this.e);
        }
        p pVar = new p(dVar.b == null ? null : dVar.b.toString(), dVar.f, bVarA);
        ax<Map.Entry<String, String>> it = dVar.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            pVar.a(next.getKey(), next.getValue());
        }
        c cVarA = new c.a().a(dVar.f21a, o.f257a).a(dVar.d).b(dVar.e).a(com.applovin.exoplayer2.common.b.c.a(dVar.g)).a(pVar);
        cVarA.a(0, dVar.a());
        return cVarA;
    }
}
