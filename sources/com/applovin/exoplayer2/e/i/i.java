package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ad.a> f346a;
    private final com.applovin.exoplayer2.e.x[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public i(List<ad.a> list) {
        this.f346a = list;
        this.b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            ad.a aVar = this.f346a.get(i);
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 3);
            xVarA.a(new v.a().a(dVar.c()).f("application/dvbsubs").a(Collections.singletonList(aVar.c)).c(aVar.f335a).a());
            this.b[i] = xVarA;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (com.applovin.exoplayer2.e.x xVar : this.b) {
                    xVar.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        if (this.c) {
            if (this.d != 2 || a(yVar, 32)) {
                if (this.d != 1 || a(yVar, 0)) {
                    int iC = yVar.c();
                    int iA = yVar.a();
                    for (com.applovin.exoplayer2.e.x xVar : this.b) {
                        yVar.d(iC);
                        xVar.a(yVar, iA);
                    }
                    this.e += iA;
                }
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.h() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
