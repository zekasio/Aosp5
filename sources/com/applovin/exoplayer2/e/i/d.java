package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.c;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f341a;
    private final com.applovin.exoplayer2.l.y b;
    private final String c;
    private String d;
    private com.applovin.exoplayer2.e.x e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private com.applovin.exoplayer2.v k;
    private int l;
    private long m;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public d() {
        this(null);
    }

    public d(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[16]);
        this.f341a = xVar;
        this.b = new com.applovin.exoplayer2.l.y(xVar.f636a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.d = dVar.c();
        this.e = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.e);
        while (yVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(yVar.a(), this.l - this.g);
                        this.e.a(yVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            long j = this.m;
                            if (j != -9223372036854775807L) {
                                this.e.a(j, 1, i3, 0, null);
                                this.m += this.j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(yVar, this.b.d(), 16)) {
                    c();
                    this.b.d(0);
                    this.e.a(this.b, 16);
                    this.f = 2;
                }
            } else if (b(yVar)) {
                this.f = 1;
                this.b.d()[0] = -84;
                this.b.d()[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i) {
        int iMin = Math.min(yVar.a(), i - this.g);
        yVar.a(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        int iH;
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = yVar.h() == 172;
            } else {
                iH = yVar.h();
                this.h = iH == 172;
                if (iH == 64 || iH == 65) {
                    break;
                }
            }
        }
        this.i = iH == 65;
        return true;
    }

    private void c() {
        this.f341a.a(0);
        c.a aVarA = com.applovin.exoplayer2.b.c.a(this.f341a);
        if (this.k == null || aVarA.c != this.k.y || aVarA.b != this.k.z || !"audio/ac4".equals(this.k.l)) {
            com.applovin.exoplayer2.v vVarA = new v.a().a(this.d).f("audio/ac4").k(aVarA.c).l(aVarA.b).c(this.c).a();
            this.k = vVarA;
            this.e.a(vVarA);
        }
        this.l = aVarA.d;
        this.j = (((long) aVarA.e) * 1000000) / ((long) this.k.z);
    }
}
