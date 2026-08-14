package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f339a;
    private final com.applovin.exoplayer2.l.y b;
    private final String c;
    private String d;
    private com.applovin.exoplayer2.e.x e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private com.applovin.exoplayer2.v j;
    private int k;
    private long l;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public b() {
        this(null);
    }

    public b(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[128]);
        this.f339a = xVar;
        this.b = new com.applovin.exoplayer2.l.y(xVar.f636a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
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
            this.l = j;
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
                        int iMin = Math.min(yVar.a(), this.k - this.g);
                        this.e.a(yVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.k;
                        if (i2 == i3) {
                            long j = this.l;
                            if (j != -9223372036854775807L) {
                                this.e.a(j, 1, i3, 0, null);
                                this.l += this.i;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(yVar, this.b.d(), 128)) {
                    c();
                    this.b.d(0);
                    this.e.a(this.b, 128);
                    this.f = 2;
                }
            } else if (b(yVar)) {
                this.f = 1;
                this.b.d()[0] = Ascii.VT;
                this.b.d()[1] = 119;
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
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = yVar.h() == 11;
            } else {
                int iH = yVar.h();
                if (iH == 119) {
                    this.h = false;
                    return true;
                }
                this.h = iH == 11;
            }
        }
    }

    private void c() {
        this.f339a.a(0);
        b.a aVarA = com.applovin.exoplayer2.b.b.a(this.f339a);
        if (this.j == null || aVarA.d != this.j.y || aVarA.c != this.j.z || !ai.a((Object) aVarA.f58a, (Object) this.j.l)) {
            com.applovin.exoplayer2.v vVarA = new v.a().a(this.d).f(aVarA.f58a).k(aVarA.d).l(aVarA.c).c(this.c).a();
            this.j = vVarA;
            this.e.a(vVarA);
        }
        this.k = aVarA.e;
        this.i = (((long) aVarA.f) * 1000000) / ((long) this.j.z);
    }
}
