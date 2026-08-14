package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.g.g;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    private j b;
    private int c;
    private int d;
    private int e;
    private com.applovin.exoplayer2.g.f.b g;
    private i h;
    private c i;
    private g j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f273a = new y(6);
    private long f = -1;

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        if (b(iVar) != 65496) {
            return false;
        }
        int iB = b(iVar);
        this.d = iB;
        if (iB == 65504) {
            c(iVar);
            this.d = b(iVar);
        }
        if (this.d != 65505) {
            return false;
        }
        iVar.c(2);
        this.f273a.a(6);
        iVar.d(this.f273a.d(), 0, 6);
        return this.f273a.o() == 1165519206 && this.f273a.i() == 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i = this.c;
        if (i == 0) {
            d(iVar);
            return 0;
        }
        if (i == 1) {
            e(iVar);
            return 0;
        }
        if (i == 2) {
            f(iVar);
            return 0;
        }
        if (i == 4) {
            long jC = iVar.c();
            long j = this.f;
            if (jC != j) {
                uVar.f386a = j;
                return 1;
            }
            g(iVar);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || iVar != this.h) {
            this.h = iVar;
            this.i = new c(iVar, this.f);
        }
        int iA = ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(this.i, uVar);
        if (iA == 1) {
            uVar.f386a += this.f;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(j, j2);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
        g gVar = this.j;
        if (gVar != null) {
            gVar.c();
        }
    }

    private int b(i iVar) throws IOException {
        this.f273a.a(2);
        iVar.d(this.f273a.d(), 0, 2);
        return this.f273a.i();
    }

    private void c(i iVar) throws IOException {
        this.f273a.a(2);
        iVar.d(this.f273a.d(), 0, 2);
        iVar.c(this.f273a.i() - 2);
    }

    private void d(i iVar) throws IOException {
        this.f273a.a(2);
        iVar.b(this.f273a.d(), 0, 2);
        int i = this.f273a.i();
        this.d = i;
        if (i == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                b();
                return;
            }
        }
        if ((i < 65488 || i > 65497) && i != 65281) {
            this.c = 1;
        }
    }

    private void e(i iVar) throws IOException {
        this.f273a.a(2);
        iVar.b(this.f273a.d(), 0, 2);
        this.e = this.f273a.i() - 2;
        this.c = 2;
    }

    private void f(i iVar) throws IOException {
        String strB;
        if (this.d == 65505) {
            y yVar = new y(this.e);
            iVar.b(yVar.d(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.B()) && (strB = yVar.B()) != null) {
                com.applovin.exoplayer2.g.f.b bVarA = a(strB, iVar.d());
                this.g = bVarA;
                if (bVarA != null) {
                    this.f = bVarA.d;
                }
            }
        } else {
            iVar.b(this.e);
        }
        this.c = 0;
    }

    private void g(i iVar) throws IOException {
        if (!iVar.b(this.f273a.d(), 0, 1, true)) {
            b();
            return;
        }
        iVar.a();
        if (this.j == null) {
            this.j = new g();
        }
        c cVar = new c(iVar, this.f);
        this.i = cVar;
        if (this.j.a(cVar)) {
            this.j.a(new d(this.f, (j) com.applovin.exoplayer2.l.a.b(this.b)));
            a();
        } else {
            b();
        }
    }

    private void a() {
        a((a.InterfaceC0030a) com.applovin.exoplayer2.l.a.b(this.g));
        this.c = 5;
    }

    private void b() {
        a(new a.InterfaceC0030a[0]);
        ((j) com.applovin.exoplayer2.l.a.b(this.b)).a();
        this.b.a(new v.b(-9223372036854775807L));
        this.c = 6;
    }

    private void a(a.InterfaceC0030a... interfaceC0030aArr) {
        ((j) com.applovin.exoplayer2.l.a.b(this.b)).a(1024, 4).a(new v.a().e("image/jpeg").a(new com.applovin.exoplayer2.g.a(interfaceC0030aArr)).a());
    }

    private static com.applovin.exoplayer2.g.f.b a(String str, long j) throws IOException {
        b bVarA;
        if (j == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j);
    }
}
