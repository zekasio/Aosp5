package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f343a = {73, 68, 51};
    private final boolean b;
    private final com.applovin.exoplayer2.l.x c;
    private final com.applovin.exoplayer2.l.y d;
    private final String e;
    private String f;
    private com.applovin.exoplayer2.e.x g;
    private com.applovin.exoplayer2.e.x h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private com.applovin.exoplayer2.e.x u;
    private long v;

    public static boolean a(int i) {
        return (i & 65526) == 65520;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public f(boolean z) {
        this(z, null);
    }

    public f(boolean z, String str) {
        this.c = new com.applovin.exoplayer2.l.x(new byte[7]);
        this.d = new com.applovin.exoplayer2.l.y(Arrays.copyOf(f343a, 10));
        e();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b = z;
        this.e = str;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.t = -9223372036854775807L;
        d();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 1);
        this.g = xVarA;
        this.u = xVarA;
        if (this.b) {
            dVar.a();
            com.applovin.exoplayer2.e.x xVarA2 = jVar.a(dVar.b(), 5);
            this.h = xVarA2;
            xVarA2.a(new v.a().a(dVar.c()).f("application/id3").a());
            return;
        }
        this.h = new com.applovin.exoplayer2.e.g();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.t = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        k();
        while (yVar.a() > 0) {
            int i = this.i;
            if (i == 0) {
                b(yVar);
            } else if (i == 1) {
                c(yVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (a(yVar, this.c.f636a, this.l ? 7 : 5)) {
                        j();
                    }
                } else if (i == 4) {
                    d(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(yVar, this.d.d(), 10)) {
                i();
            }
        }
    }

    public long c() {
        return this.r;
    }

    private void d() {
        this.m = false;
        e();
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i) {
        int iMin = Math.min(yVar.a(), i - this.j);
        yVar.a(bArr, this.j, iMin);
        int i2 = this.j + iMin;
        this.j = i2;
        return i2 == i;
    }

    private void e() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    private void f() {
        this.i = 2;
        this.j = f343a.length;
        this.s = 0;
        this.d.d(0);
    }

    private void a(com.applovin.exoplayer2.e.x xVar, long j, int i, int i2) {
        this.i = 4;
        this.j = i;
        this.u = xVar;
        this.v = j;
        this.s = i2;
    }

    private void g() {
        this.i = 3;
        this.j = 0;
    }

    private void h() {
        this.i = 1;
        this.j = 0;
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        byte[] bArrD = yVar.d();
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB) {
            int i = iC + 1;
            byte b = bArrD[iC];
            int i2 = b & UByte.MAX_VALUE;
            if (this.k == 512 && a((byte) -1, (byte) i2) && (this.m || a(yVar, iC - 1))) {
                this.p = (b & 8) >> 3;
                this.l = (b & 1) == 0;
                if (!this.m) {
                    h();
                } else {
                    g();
                }
                yVar.d(i);
                return;
            }
            int i3 = this.k;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.k = 768;
            } else if (i4 == 511) {
                this.k = 512;
            } else if (i4 == 836) {
                this.k = 1024;
            } else if (i4 == 1075) {
                f();
                yVar.d(i);
                return;
            } else if (i3 != 256) {
                this.k = 256;
            }
            iC = i;
        }
        yVar.d(iC);
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        if (yVar.a() == 0) {
            return;
        }
        this.c.f636a[0] = yVar.d()[yVar.c()];
        this.c.a(2);
        int iC = this.c.c(4);
        int i = this.o;
        if (i != -1 && iC != i) {
            d();
            return;
        }
        if (!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = iC;
        }
        g();
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i) {
        yVar.d(i + 1);
        if (!b(yVar, this.c.f636a, 1)) {
            return false;
        }
        this.c.a(4);
        int iC = this.c.c(1);
        int i2 = this.n;
        if (i2 != -1 && iC != i2) {
            return false;
        }
        if (this.o != -1) {
            if (!b(yVar, this.c.f636a, 1)) {
                return true;
            }
            this.c.a(2);
            if (this.c.c(4) != this.o) {
                return false;
            }
            yVar.d(i + 2);
        }
        if (!b(yVar, this.c.f636a, 4)) {
            return true;
        }
        this.c.a(14);
        int iC2 = this.c.c(13);
        if (iC2 < 7) {
            return false;
        }
        byte[] bArrD = yVar.d();
        int iB = yVar.b();
        int i3 = i + iC2;
        if (i3 >= iB) {
            return true;
        }
        byte b = bArrD[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iB) {
                return true;
            }
            return a((byte) -1, bArrD[i4]) && ((bArrD[i4] & 8) >> 3) == iC;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iB) {
            return true;
        }
        if (bArrD[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iB || bArrD[i6] == 51;
    }

    private boolean a(byte b, byte b2) {
        return a(((b & UByte.MAX_VALUE) << 8) | (b2 & UByte.MAX_VALUE));
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i) {
        if (yVar.a() < i) {
            return false;
        }
        yVar.a(bArr, 0, i);
        return true;
    }

    private void i() {
        this.h.a(this.d, 10);
        this.d.d(6);
        a(this.h, 0L, 10, this.d.v() + 10);
    }

    private void j() throws ai {
        this.c.a(0);
        if (!this.q) {
            int i = 2;
            int iC = this.c.c(2) + 1;
            if (iC != 2) {
                com.applovin.exoplayer2.l.q.c("AdtsReader", "Detected audio object type: " + iC + ", but assuming AAC LC.");
            } else {
                i = iC;
            }
            this.c.b(5);
            byte[] bArrA = com.applovin.exoplayer2.b.a.a(i, this.o, this.c.c(3));
            a.C0011a c0011aA = com.applovin.exoplayer2.b.a.a(bArrA);
            com.applovin.exoplayer2.v vVarA = new v.a().a(this.f).f("audio/mp4a-latm").d(c0011aA.c).k(c0011aA.b).l(c0011aA.f56a).a(Collections.singletonList(bArrA)).c(this.e).a();
            this.r = 1024000000 / ((long) vVarA.z);
            this.g.a(vVarA);
            this.q = true;
        } else {
            this.c.b(10);
        }
        this.c.b(4);
        int iC2 = this.c.c(13);
        int i2 = iC2 - 7;
        if (this.l) {
            i2 = iC2 - 9;
        }
        a(this.g, this.r, 0, i2);
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), this.s - this.j);
        this.u.a(yVar, iMin);
        int i = this.j + iMin;
        this.j = i;
        int i2 = this.s;
        if (i == i2) {
            long j = this.t;
            if (j != -9223372036854775807L) {
                this.u.a(j, 1, i2, 0, null);
                this.t += this.v;
            }
            e();
        }
    }

    private void k() {
        com.applovin.exoplayer2.l.a.b(this.g);
        com.applovin.exoplayer2.l.ai.a(this.u);
        com.applovin.exoplayer2.l.ai.a(this.h);
    }
}
