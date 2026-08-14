package com.applovin.exoplayer2.e.b;

import android.net.Uri;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f268a = new l() { // from class: com.applovin.exoplayer2.e.b.b$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return b.b();
        }
    };
    private final byte[] b;
    private final y c;
    private final boolean d;
    private final m.a e;
    private j f;
    private x g;
    private int h;
    private com.applovin.exoplayer2.g.a i;
    private p j;
    private int k;
    private int l;
    private a m;
    private int n;
    private long o;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new b()};
    }

    public b() {
        this(0);
    }

    public b(int i) {
        this.b = new byte[42];
        this.c = new y(new byte[32768], 0);
        this.d = (i & 1) != 0;
        this.e = new m.a();
        this.h = 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        n.a(iVar, false);
        return n.a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f = jVar;
        this.g = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i = this.h;
        if (i == 0) {
            b(iVar);
            return 0;
        }
        if (i == 1) {
            c(iVar);
            return 0;
        }
        if (i == 2) {
            d(iVar);
            return 0;
        }
        if (i == 3) {
            e(iVar);
            return 0;
        }
        if (i == 4) {
            f(iVar);
            return 0;
        }
        if (i == 5) {
            return b(iVar, uVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        if (j == 0) {
            this.h = 0;
        } else {
            a aVar = this.m;
            if (aVar != null) {
                aVar.a(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.c.a(0);
    }

    private void b(i iVar) throws IOException {
        this.i = n.b(iVar, !this.d);
        this.h = 1;
    }

    private void c(i iVar) throws IOException {
        byte[] bArr = this.b;
        iVar.d(bArr, 0, bArr.length);
        iVar.a();
        this.h = 2;
    }

    private void d(i iVar) throws IOException {
        n.b(iVar);
        this.h = 3;
    }

    private void e(i iVar) throws IOException {
        n.a aVar = new n.a(this.j);
        boolean zA = false;
        while (!zA) {
            zA = n.a(iVar, aVar);
            this.j = (p) ai.a(aVar.f378a);
        }
        com.applovin.exoplayer2.l.a.b(this.j);
        this.k = Math.max(this.j.c, 6);
        ((x) ai.a(this.g)).a(this.j.a(this.b, this.i));
        this.h = 4;
    }

    private void f(i iVar) throws IOException {
        this.l = n.c(iVar);
        ((j) ai.a(this.f)).a(b(iVar.c(), iVar.d()));
        this.h = 5;
    }

    private int b(i iVar, u uVar) throws IOException {
        boolean z;
        com.applovin.exoplayer2.l.a.b(this.g);
        com.applovin.exoplayer2.l.a.b(this.j);
        a aVar = this.m;
        if (aVar != null && aVar.b()) {
            return this.m.a(iVar, uVar);
        }
        if (this.o == -1) {
            this.o = m.a(iVar, this.j);
            return 0;
        }
        int iB = this.c.b();
        if (iB < 32768) {
            int iA = iVar.a(this.c.d(), iB, 32768 - iB);
            z = iA == -1;
            if (!z) {
                this.c.c(iB + iA);
            } else if (this.c.a() == 0) {
                a();
                return -1;
            }
        } else {
            z = false;
        }
        int iC = this.c.c();
        int i = this.n;
        int i2 = this.k;
        if (i < i2) {
            y yVar = this.c;
            yVar.e(Math.min(i2 - i, yVar.a()));
        }
        long jA = a(this.c, z);
        int iC2 = this.c.c() - iC;
        this.c.d(iC);
        this.g.a(this.c, iC2);
        this.n += iC2;
        if (jA != -1) {
            a();
            this.n = 0;
            this.o = jA;
        }
        if (this.c.a() < 16) {
            int iA2 = this.c.a();
            System.arraycopy(this.c.d(), this.c.c(), this.c.d(), 0, iA2);
            this.c.d(0);
            this.c.c(iA2);
        }
        return 0;
    }

    private v b(long j, long j2) {
        com.applovin.exoplayer2.l.a.b(this.j);
        if (this.j.k != null) {
            return new o(this.j, j);
        }
        if (j2 != -1 && this.j.j > 0) {
            a aVar = new a(this.j, this.l, j, j2);
            this.m = aVar;
            return aVar.a();
        }
        return new v.b(this.j.a());
    }

    private long a(y yVar, boolean z) {
        boolean zA;
        com.applovin.exoplayer2.l.a.b(this.j);
        int iC = yVar.c();
        while (iC <= yVar.b() - 16) {
            yVar.d(iC);
            if (m.a(yVar, this.j, this.l, this.e)) {
                yVar.d(iC);
                return this.e.f377a;
            }
            iC++;
        }
        if (z) {
            while (iC <= yVar.b() - this.k) {
                yVar.d(iC);
                try {
                    zA = m.a(yVar, this.j, this.l, this.e);
                } catch (IndexOutOfBoundsException unused) {
                    zA = false;
                }
                if (yVar.c() <= yVar.b() ? zA : false) {
                    yVar.d(iC);
                    return this.e.f377a;
                }
                iC++;
            }
            yVar.d(yVar.b());
            return -1L;
        }
        yVar.d(iC);
        return -1L;
    }

    private void a() {
        ((x) ai.a(this.g)).a((this.o * 1000000) / ((long) ((p) ai.a(this.j)).e), 1, this.n, 0, null);
    }
}
