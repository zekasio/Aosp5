package com.applovin.exoplayer2.h;

import android.os.Looper;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w implements com.applovin.exoplayer2.e.x {
    private boolean A;
    private com.applovin.exoplayer2.v B;
    private com.applovin.exoplayer2.v C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f482a;
    private final com.applovin.exoplayer2.d.h d;
    private final g.a e;
    private final Looper f;
    private c g;
    private com.applovin.exoplayer2.v h;
    private com.applovin.exoplayer2.d.f i;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean x;
    private final a b = new a();
    private int j = 1000;
    private int[] k = new int[1000];
    private long[] l = new long[1000];
    private long[] o = new long[1000];
    private int[] n = new int[1000];
    private int[] m = new int[1000];
    private x.a[] p = new x.a[1000];
    private final ab<b> c = new ab<>(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.h.w$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.l.h
        public final void accept(Object obj) {
            w.a((w.b) obj);
        }
    });
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;
    private boolean z = true;
    private boolean y = true;

    public interface c {
        void a(com.applovin.exoplayer2.v vVar);
    }

    @Override // com.applovin.exoplayer2.e.x
    public /* synthetic */ int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) {
        return a(gVar, i, z, 0);
    }

    @Override // com.applovin.exoplayer2.e.x
    public /* synthetic */ void a(com.applovin.exoplayer2.l.y yVar, int i) {
        a(yVar, i, 0);
    }

    public static w a(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, g.a aVar) {
        return new w(bVar, (Looper) com.applovin.exoplayer2.l.a.b(looper), (com.applovin.exoplayer2.d.h) com.applovin.exoplayer2.l.a.b(hVar), (g.a) com.applovin.exoplayer2.l.a.b(aVar));
    }

    protected w(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, g.a aVar) {
        this.f = looper;
        this.d = hVar;
        this.e = aVar;
        this.f482a = new v(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.b.release();
    }

    public void a() {
        a(true);
        n();
    }

    public final void b() {
        a(false);
    }

    public void a(boolean z) {
        this.f482a.a();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.c.b();
        if (z) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    public final void a(long j) {
        this.u = j;
    }

    public final int c() {
        return this.r + this.q;
    }

    public void d() {
        k();
        n();
    }

    public void e() throws IOException {
        com.applovin.exoplayer2.d.f fVar = this.i;
        if (fVar != null && fVar.c() == 1) {
            throw ((f.a) com.applovin.exoplayer2.l.a.b(this.i.e()));
        }
    }

    public final int f() {
        return this.r + this.t;
    }

    public final synchronized com.applovin.exoplayer2.v g() {
        return this.z ? null : this.C;
    }

    public final synchronized long h() {
        return this.w;
    }

    public final synchronized long i() {
        return Math.max(this.v, e(this.t));
    }

    public final synchronized boolean j() {
        return this.x;
    }

    public synchronized boolean b(boolean z) {
        com.applovin.exoplayer2.v vVar;
        boolean z2 = true;
        if (!o()) {
            if (!z && !this.x && ((vVar = this.C) == null || vVar == this.h)) {
                z2 = false;
            }
            return z2;
        }
        if (this.c.a(f()).f484a != this.h) {
            return true;
        }
        return c(f(this.t));
    }

    public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i, boolean z) {
        int iA = a(wVar, gVar, (i & 2) != 0, z, this.b);
        if (iA == -4 && !gVar.c()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f482a.b(gVar, this.b);
                } else {
                    this.f482a.a(gVar, this.b);
                }
            }
            if (!z2) {
                this.t++;
            }
        }
        return iA;
    }

    public final synchronized boolean a(long j, boolean z) {
        l();
        int iF = f(this.t);
        if (o() && j >= this.o[iF] && (j <= this.w || z)) {
            int iA = a(iF, this.q - this.t, j, true);
            if (iA == -1) {
                return false;
            }
            this.u = j;
            this.t += iA;
            return true;
        }
        return false;
    }

    public final synchronized int b(long j, boolean z) {
        int iF = f(this.t);
        if (o() && j >= this.o[iF]) {
            if (j > this.w && z) {
                return this.q - this.t;
            }
            int iA = a(iF, this.q - this.t, j, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.q     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.applovin.exoplayer2.l.a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.t = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(int):void");
    }

    public final void a(long j, boolean z, boolean z2) {
        this.f482a.a(b(j, z, z2));
    }

    public final void k() {
        this.f482a.a(m());
    }

    public final void a(c cVar) {
        this.g = cVar;
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.v vVarB = b(vVar);
        this.A = false;
        this.B = vVar;
        boolean zC = c(vVarB);
        c cVar = this.g;
        if (cVar == null || !zC) {
            return;
        }
        cVar.a(vVarB);
    }

    @Override // com.applovin.exoplayer2.e.x
    public final int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z, int i2) throws IOException {
        return this.f482a.a(gVar, i, z);
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.l.y yVar, int i, int i2) {
        this.f482a.a(yVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // com.applovin.exoplayer2.e.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r12, int r14, int r15, int r16, com.applovin.exoplayer2.e.x.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            com.applovin.exoplayer2.v r0 = r8.B
            java.lang.Object r0 = com.applovin.exoplayer2.l.a.a(r0)
            com.applovin.exoplayer2.v r0 = (com.applovin.exoplayer2.v) r0
            r11.a(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L51
            long r6 = r8.u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L51
            boolean r0 = r8.F
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.<init>(r6)
            com.applovin.exoplayer2.v r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.exoplayer2.l.q.c(r6, r0)
            r8.F = r2
        L4d:
            r0 = r14 | 1
            r6 = r0
            goto L52
        L51:
            r6 = r14
        L52:
            boolean r0 = r8.H
            if (r0 == 0) goto L63
            if (r3 == 0) goto L62
            boolean r0 = r11.b(r4)
            if (r0 != 0) goto L5f
            goto L62
        L5f:
            r8.H = r1
            goto L63
        L62:
            return
        L63:
            com.applovin.exoplayer2.h.v r0 = r8.f482a
            long r0 = r0.c()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(long, int, int, int, com.applovin.exoplayer2.e.x$a):void");
    }

    protected com.applovin.exoplayer2.v b(com.applovin.exoplayer2.v vVar) {
        return (this.G == 0 || vVar.p == Long.MAX_VALUE) ? vVar : vVar.a().a(vVar.p + this.G).a();
    }

    private synchronized void l() {
        this.t = 0;
        this.f482a.b();
    }

    private synchronized int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, boolean z, boolean z2, a aVar) {
        gVar.c = false;
        if (!o()) {
            if (!z2 && !this.x) {
                com.applovin.exoplayer2.v vVar = this.C;
                if (vVar == null || (!z && vVar == this.h)) {
                    return -3;
                }
                a((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(vVar), wVar);
                return -5;
            }
            gVar.a_(4);
            return -4;
        }
        com.applovin.exoplayer2.v vVar2 = this.c.a(f()).f484a;
        if (!z && vVar2 == this.h) {
            int iF = f(this.t);
            if (!c(iF)) {
                gVar.c = true;
                return -3;
            }
            gVar.a_(this.n[iF]);
            gVar.d = this.o[iF];
            if (gVar.d < this.u) {
                gVar.b(Integer.MIN_VALUE);
            }
            aVar.f483a = this.m[iF];
            aVar.b = this.l[iF];
            aVar.c = this.p[iF];
            return -4;
        }
        a(vVar2, wVar);
        return -5;
    }

    private synchronized boolean c(com.applovin.exoplayer2.v vVar) {
        this.z = false;
        if (ai.a(vVar, this.C)) {
            return false;
        }
        if (!this.c.c() && this.c.a().f484a.equals(vVar)) {
            this.C = this.c.a().f484a;
        } else {
            this.C = vVar;
        }
        this.E = com.applovin.exoplayer2.l.u.a(this.C.l, this.C.i);
        this.F = false;
        return true;
    }

    private synchronized long b(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.q;
        if (i2 != 0) {
            long[] jArr = this.o;
            int i3 = this.s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.t) != i2) {
                    i2 = i + 1;
                }
                int iA = a(i3, i2, j, z);
                if (iA == -1) {
                    return -1L;
                }
                return d(iA);
            }
        }
        return -1L;
    }

    private synchronized long m() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    private void n() {
        com.applovin.exoplayer2.d.f fVar = this.i;
        if (fVar != null) {
            fVar.b(this.e);
            this.i = null;
            this.h = null;
        }
    }

    private synchronized void a(long j, int i, long j2, int i2, x.a aVar) {
        h.a aVarA;
        int i3 = this.q;
        if (i3 > 0) {
            int iF = f(i3 - 1);
            com.applovin.exoplayer2.l.a.a(this.l[iF] + ((long) this.m[iF]) <= j2);
        }
        this.x = (536870912 & i) != 0;
        this.w = Math.max(this.w, j);
        int iF2 = f(this.q);
        this.o[iF2] = j;
        this.l[iF2] = j2;
        this.m[iF2] = i2;
        this.n[iF2] = i;
        this.p[iF2] = aVar;
        this.k[iF2] = this.D;
        if (this.c.c() || !this.c.a().f484a.equals(this.C)) {
            com.applovin.exoplayer2.d.h hVar = this.d;
            if (hVar != null) {
                aVarA = hVar.a((Looper) com.applovin.exoplayer2.l.a.b(this.f), this.e, this.C);
            } else {
                aVarA = h.a.b;
            }
            this.c.a(c(), new b((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.C), aVarA));
        }
        int i4 = this.q + 1;
        this.q = i4;
        int i5 = this.j;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            x.a[] aVarArr = new x.a[i6];
            int i7 = this.s;
            int i8 = i5 - i7;
            System.arraycopy(this.l, i7, jArr, 0, i8);
            System.arraycopy(this.o, this.s, jArr2, 0, i8);
            System.arraycopy(this.n, this.s, iArr2, 0, i8);
            System.arraycopy(this.m, this.s, iArr3, 0, i8);
            System.arraycopy(this.p, this.s, aVarArr, 0, i8);
            System.arraycopy(this.k, this.s, iArr, 0, i8);
            int i9 = this.s;
            System.arraycopy(this.l, 0, jArr, i8, i9);
            System.arraycopy(this.o, 0, jArr2, i8, i9);
            System.arraycopy(this.n, 0, iArr2, i8, i9);
            System.arraycopy(this.m, 0, iArr3, i8, i9);
            System.arraycopy(this.p, 0, aVarArr, i8, i9);
            System.arraycopy(this.k, 0, iArr, i8, i9);
            this.l = jArr;
            this.o = jArr2;
            this.n = iArr2;
            this.m = iArr3;
            this.p = aVarArr;
            this.k = iArr;
            this.s = 0;
            this.j = i6;
        }
    }

    private synchronized boolean b(long j) {
        if (this.q == 0) {
            return j > this.v;
        }
        if (i() >= j) {
            return false;
        }
        b(this.r + c(j));
        return true;
    }

    private long b(int i) {
        int iC = c() - i;
        boolean z = false;
        com.applovin.exoplayer2.l.a.a(iC >= 0 && iC <= this.q - this.t);
        int i2 = this.q - iC;
        this.q = i2;
        this.w = Math.max(this.v, e(i2));
        if (iC == 0 && this.x) {
            z = true;
        }
        this.x = z;
        this.c.c(i);
        int i3 = this.q;
        if (i3 == 0) {
            return 0L;
        }
        int iF = f(i3 - 1);
        return this.l[iF] + ((long) this.m[iF]);
    }

    private boolean o() {
        return this.t != this.q;
    }

    private void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.w wVar) {
        com.applovin.exoplayer2.v vVar2 = this.h;
        boolean z = vVar2 == null;
        com.applovin.exoplayer2.d.e eVar = z ? null : vVar2.o;
        this.h = vVar;
        com.applovin.exoplayer2.d.e eVar2 = vVar.o;
        com.applovin.exoplayer2.d.h hVar = this.d;
        wVar.b = hVar != null ? vVar.a(hVar.a(vVar)) : vVar;
        wVar.f702a = this.i;
        if (this.d == null) {
            return;
        }
        if (z || !ai.a(eVar, eVar2)) {
            com.applovin.exoplayer2.d.f fVar = this.i;
            com.applovin.exoplayer2.d.f fVarB = this.d.b((Looper) com.applovin.exoplayer2.l.a.b(this.f), this.e, vVar);
            this.i = fVarB;
            wVar.f702a = fVarB;
            if (fVar != null) {
                fVar.b(this.e);
            }
        }
    }

    private boolean c(int i) {
        com.applovin.exoplayer2.d.f fVar = this.i;
        return fVar == null || fVar.c() == 4 || ((this.n[i] & 1073741824) == 0 && this.i.d());
    }

    private int a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.j) {
                i = 0;
            }
        }
        return i3;
    }

    private int c(long j) {
        int i = this.q;
        int iF = f(i - 1);
        while (i > this.t && this.o[iF] >= j) {
            i--;
            iF--;
            if (iF == -1) {
                iF = this.j - 1;
            }
        }
        return i;
    }

    private long d(int i) {
        this.v = Math.max(this.v, e(i));
        this.q -= i;
        int i2 = this.r + i;
        this.r = i2;
        int i3 = this.s + i;
        this.s = i3;
        int i4 = this.j;
        if (i3 >= i4) {
            this.s = i3 - i4;
        }
        int i5 = this.t - i;
        this.t = i5;
        if (i5 < 0) {
            this.t = 0;
        }
        this.c.b(i2);
        if (this.q == 0) {
            int i6 = this.s;
            if (i6 == 0) {
                i6 = this.j;
            }
            int i7 = i6 - 1;
            return this.l[i7] + ((long) this.m[i7]);
        }
        return this.l[this.s];
    }

    private long e(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.o[iF]);
            if ((this.n[iF] & 1) != 0) {
                break;
            }
            iF--;
            if (iF == -1) {
                iF = this.j - 1;
            }
        }
        return jMax;
    }

    private int f(int i) {
        int i2 = this.s + i;
        int i3 = this.j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f483a;
        public long b;
        public x.a c;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f484a;
        public final h.a b;

        private b(com.applovin.exoplayer2.v vVar, h.a aVar) {
            this.f484a = vVar;
            this.b = aVar;
        }
    }
}
