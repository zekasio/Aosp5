package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {
    private final String b;
    private String c;
    private com.applovin.exoplayer2.e.x d;
    private int f;
    private int g;
    private long h;
    private com.applovin.exoplayer2.v i;
    private int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f345a = new com.applovin.exoplayer2.l.y(new byte[18]);
    private int e = 0;
    private long k = -9223372036854775807L;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public h(String str) {
        this.b = str;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.c = dVar.c();
        this.d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.d);
        while (yVar.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(yVar.a(), this.j - this.f);
                        this.d.a(yVar, iMin);
                        int i2 = this.f + iMin;
                        this.f = i2;
                        int i3 = this.j;
                        if (i2 == i3) {
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.a(j, 1, i3, 0, null);
                                this.k += this.h;
                            }
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(yVar, this.f345a.d(), 18)) {
                    c();
                    this.f345a.d(0);
                    this.d.a(this.f345a, 18);
                    this.e = 2;
                }
            } else if (b(yVar)) {
                this.e = 1;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i) {
        int iMin = Math.min(yVar.a(), i - this.f);
        yVar.a(bArr, this.f, iMin);
        int i2 = this.f + iMin;
        this.f = i2;
        return i2 == i;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (yVar.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int iH = i | yVar.h();
            this.g = iH;
            if (com.applovin.exoplayer2.b.o.a(iH)) {
                byte[] bArrD = this.f345a.d();
                int i2 = this.g;
                bArrD[0] = (byte) ((i2 >> 24) & 255);
                bArrD[1] = (byte) ((i2 >> 16) & 255);
                bArrD[2] = (byte) ((i2 >> 8) & 255);
                bArrD[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] bArrD = this.f345a.d();
        if (this.i == null) {
            com.applovin.exoplayer2.v vVarA = com.applovin.exoplayer2.b.o.a(bArrD, this.c, this.b, null);
            this.i = vVarA;
            this.d.a(vVarA);
        }
        this.j = com.applovin.exoplayer2.b.o.b(bArrD);
        this.h = (int) ((((long) com.applovin.exoplayer2.b.o.a(bArrD)) * 1000000) / ((long) this.i.z));
    }
}
