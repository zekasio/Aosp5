package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f359a;
    private final r.a b;
    private final String c;
    private com.applovin.exoplayer2.e.x d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public q() {
        this(null);
    }

    public q(String str) {
        this.f = 0;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        this.f359a = yVar;
        yVar.d()[0] = -1;
        this.b = new r.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.e = dVar.c();
        this.d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.d);
        while (yVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(yVar);
            } else if (i == 1) {
                c(yVar);
            } else if (i == 2) {
                d(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        byte[] bArrD = yVar.d();
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB; iC++) {
            byte b = bArrD[iC];
            boolean z = (b & UByte.MAX_VALUE) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                yVar.d(iC + 1);
                this.i = false;
                this.f359a.d()[1] = bArrD[iC];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        yVar.d(iB);
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), 4 - this.g);
        yVar.a(this.f359a.d(), this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.f359a.d(0);
        if (!this.b.a(this.f359a.q())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        this.k = this.b.c;
        if (!this.h) {
            this.j = (((long) this.b.g) * 1000000) / ((long) this.b.d);
            this.d.a(new v.a().a(this.e).f(this.b.b).f(4096).k(this.b.e).l(this.b.d).c(this.c).a());
            this.h = true;
        }
        this.f359a.d(0);
        this.d.a(this.f359a, 4);
        this.f = 2;
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), this.k - this.g);
        this.d.a(yVar, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            this.d.a(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }
}
