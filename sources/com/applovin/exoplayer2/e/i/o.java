package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class o implements j {
    private com.applovin.exoplayer2.e.x b;
    private boolean c;
    private int e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f357a = new com.applovin.exoplayer2.l.y(10);
    private long d = -9223372036854775807L;

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 5);
        this.b = xVarA;
        xVarA.a(new v.a().a(dVar.c()).f("application/id3").a());
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.b);
        if (this.c) {
            int iA = yVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                System.arraycopy(yVar.d(), yVar.c(), this.f357a.d(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.f357a.d(0);
                    if (73 != this.f357a.h() || 68 != this.f357a.h() || 51 != this.f357a.h()) {
                        com.applovin.exoplayer2.l.q.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.f357a.e(3);
                        this.e = this.f357a.v() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.a(yVar, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        int i;
        com.applovin.exoplayer2.l.a.a(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }
}
