package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f358a;
    private final com.applovin.exoplayer2.l.y b;
    private final com.applovin.exoplayer2.l.x c;
    private com.applovin.exoplayer2.e.x d;
    private String e;
    private com.applovin.exoplayer2.v f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public p(String str) {
        this.f358a = str;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(1024);
        this.b = yVar;
        this.c = new com.applovin.exoplayer2.l.x(yVar.d());
        this.k = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.d = jVar.a(dVar.b(), 1);
        this.e = dVar.c();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        com.applovin.exoplayer2.l.a.a(this.d);
        while (yVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int iH = yVar.h();
                    if ((iH & 224) == 224) {
                        this.j = iH;
                        this.g = 2;
                    } else if (iH != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int iH2 = ((this.j & (-225)) << 8) | yVar.h();
                    this.i = iH2;
                    if (iH2 > this.b.d().length) {
                        a(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i == 3) {
                    int iMin = Math.min(yVar.a(), this.i - this.h);
                    yVar.a(this.c.f636a, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.a(0);
                        a(this.c);
                        this.g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (yVar.h() == 86) {
                this.g = 1;
            }
        }
    }

    private void a(com.applovin.exoplayer2.l.x xVar) throws ai {
        if (!xVar.e()) {
            this.l = true;
            b(xVar);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.n != 0) {
                throw ai.b(null, null);
            }
            a(xVar, e(xVar));
            if (this.p) {
                xVar.b((int) this.q);
                return;
            }
            return;
        }
        throw ai.b(null, null);
    }

    private void b(com.applovin.exoplayer2.l.x xVar) throws ai {
        boolean zE;
        int iC = xVar.c(1);
        int iC2 = iC == 1 ? xVar.c(1) : 0;
        this.m = iC2;
        if (iC2 == 0) {
            if (iC == 1) {
                f(xVar);
            }
            if (!xVar.e()) {
                throw ai.b(null, null);
            }
            this.n = xVar.c(6);
            int iC3 = xVar.c(4);
            int iC4 = xVar.c(3);
            if (iC3 != 0 || iC4 != 0) {
                throw ai.b(null, null);
            }
            if (iC == 0) {
                int iB = xVar.b();
                int iD = d(xVar);
                xVar.a(iB);
                byte[] bArr = new byte[(iD + 7) / 8];
                xVar.a(bArr, 0, iD);
                com.applovin.exoplayer2.v vVarA = new v.a().a(this.e).f("audio/mp4a-latm").d(this.u).k(this.t).l(this.r).a(Collections.singletonList(bArr)).c(this.f358a).a();
                if (!vVarA.equals(this.f)) {
                    this.f = vVarA;
                    this.s = 1024000000 / ((long) vVarA.z);
                    this.d.a(vVarA);
                }
            } else {
                xVar.b(((int) f(xVar)) - d(xVar));
            }
            c(xVar);
            boolean zE2 = xVar.e();
            this.p = zE2;
            this.q = 0L;
            if (zE2) {
                if (iC == 1) {
                    this.q = f(xVar);
                } else {
                    do {
                        zE = xVar.e();
                        this.q = (this.q << 8) + ((long) xVar.c(8));
                    } while (zE);
                }
            }
            if (xVar.e()) {
                xVar.b(8);
                return;
            }
            return;
        }
        throw ai.b(null, null);
    }

    private void c(com.applovin.exoplayer2.l.x xVar) {
        int iC = xVar.c(3);
        this.o = iC;
        if (iC == 0) {
            xVar.b(8);
            return;
        }
        if (iC == 1) {
            xVar.b(9);
            return;
        }
        if (iC == 3 || iC == 4 || iC == 5) {
            xVar.b(6);
        } else {
            if (iC == 6 || iC == 7) {
                xVar.b(1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private int d(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iA = xVar.a();
        a.C0011a c0011aA = com.applovin.exoplayer2.b.a.a(xVar, true);
        this.u = c0011aA.c;
        this.r = c0011aA.f56a;
        this.t = c0011aA.b;
        return iA - xVar.a();
    }

    private int e(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iC;
        if (this.o != 0) {
            throw ai.b(null, null);
        }
        int i = 0;
        do {
            iC = xVar.c(8);
            i += iC;
        } while (iC == 255);
        return i;
    }

    private void a(com.applovin.exoplayer2.l.x xVar, int i) {
        int iB = xVar.b();
        if ((iB & 7) == 0) {
            this.b.d(iB >> 3);
        } else {
            xVar.a(this.b.d(), 0, i * 8);
            this.b.d(0);
        }
        this.d.a(this.b, i);
        long j = this.k;
        if (j != -9223372036854775807L) {
            this.d.a(j, 1, i, 0, null);
            this.k += this.s;
        }
    }

    private void a(int i) {
        this.b.a(i);
        this.c.a(this.b.d());
    }

    private static long f(com.applovin.exoplayer2.l.x xVar) {
        return xVar.c((xVar.c(2) + 1) * 8);
    }
}
