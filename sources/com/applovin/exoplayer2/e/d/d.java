package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {
    private final long b;
    private final j c;

    public d(long j, j jVar) {
        this.b = j;
        this.c = jVar;
    }

    @Override // com.applovin.exoplayer2.e.j
    public x a(int i, int i2) {
        return this.c.a(i, i2);
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.c.a();
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final v vVar) {
        this.c.a(new v() { // from class: com.applovin.exoplayer2.e.d.d.1
            @Override // com.applovin.exoplayer2.e.v
            public boolean a() {
                return vVar.a();
            }

            @Override // com.applovin.exoplayer2.e.v
            public long b() {
                return vVar.b();
            }

            @Override // com.applovin.exoplayer2.e.v
            public v.a a(long j) {
                v.a aVarA = vVar.a(j);
                return new v.a(new w(aVarA.f387a.b, aVarA.f387a.c + d.this.b), new w(aVarA.b.b, aVarA.b.c + d.this.b));
            }
        });
    }
}
