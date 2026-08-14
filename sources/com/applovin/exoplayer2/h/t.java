package com.applovin.exoplayer2.h;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.h.i;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class t implements com.applovin.exoplayer2.e.j, n, w.c, w.a<a>, w.e {
    private static final Map<String, String> b = t();
    private static final com.applovin.exoplayer2.v c = new v.a().a("icy").f("application/x-icy").a();
    private e A;
    private com.applovin.exoplayer2.e.v B;
    private boolean D;
    private boolean F;
    private boolean G;
    private int H;
    private long J;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private final Uri d;
    private final com.applovin.exoplayer2.k.i e;
    private final com.applovin.exoplayer2.d.h f;
    private final com.applovin.exoplayer2.k.v g;
    private final q.a h;
    private final g.a i;
    private final b j;
    private final com.applovin.exoplayer2.k.b k;
    private final String l;
    private final long m;
    private final s o;
    private n.a t;
    private com.applovin.exoplayer2.g.d.b u;
    private boolean x;
    private boolean y;
    private boolean z;
    private final com.applovin.exoplayer2.k.w n = new com.applovin.exoplayer2.k.w("ProgressiveMediaPeriod");
    private final com.applovin.exoplayer2.l.g p = new com.applovin.exoplayer2.l.g();
    private final Runnable q = new Runnable() { // from class: com.applovin.exoplayer2.h.t$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.n();
        }
    };
    private final Runnable r = new Runnable() { // from class: com.applovin.exoplayer2.h.t$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.u();
        }
    };
    private final Handler s = ai.a();
    private d[] w = new d[0];
    private w[] v = new w[0];
    private long K = -9223372036854775807L;
    private long I = -1;
    private long C = -9223372036854775807L;
    private int E = 1;

    interface b {
        void a(long j, boolean z, boolean z2);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j) {
    }

    public t(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.d.h hVar, g.a aVar, com.applovin.exoplayer2.k.v vVar, q.a aVar2, b bVar, com.applovin.exoplayer2.k.b bVar2, String str, int i) {
        this.d = uri;
        this.e = iVar;
        this.f = hVar;
        this.i = aVar;
        this.g = vVar;
        this.h = aVar2;
        this.j = bVar;
        this.k = bVar2;
        this.l = str;
        this.m = i;
        this.o = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (this.O) {
            return;
        }
        ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
    }

    public void g() {
        if (this.y) {
            for (w wVar : this.v) {
                wVar.d();
            }
        }
        this.n.a(this);
        this.s.removeCallbacksAndMessages(null);
        this.t = null;
        this.O = true;
    }

    @Override // com.applovin.exoplayer2.k.w.e
    public void h() {
        for (w wVar : this.v) {
            wVar.a();
        }
        this.o.a();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j) {
        this.t = aVar;
        this.p.a();
        o();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        i();
        if (this.N && !this.y) {
            throw com.applovin.exoplayer2.ai.b("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        s();
        return this.A.f477a;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j) {
        com.applovin.exoplayer2.j.d dVar;
        s();
        ad adVar = this.A.f477a;
        boolean[] zArr3 = this.A.c;
        int i = this.H;
        int i2 = 0;
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            x xVar = xVarArr[i3];
            if (xVar != null && (dVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) xVar).b;
                com.applovin.exoplayer2.l.a.b(zArr3[i4]);
                this.H--;
                zArr3[i4] = false;
                xVarArr[i3] = null;
            }
        }
        boolean z = !this.F ? j == 0 : i != 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            if (xVarArr[i5] == null && (dVar = dVarArr[i5]) != null) {
                com.applovin.exoplayer2.l.a.b(dVar.e() == 1);
                com.applovin.exoplayer2.l.a.b(dVar.b(0) == 0);
                int iA = adVar.a(dVar.d());
                com.applovin.exoplayer2.l.a.b(!zArr3[iA]);
                this.H++;
                zArr3[iA] = true;
                xVarArr[i5] = new c(iA);
                zArr2[i5] = true;
                if (!z) {
                    w wVar = this.v[iA];
                    z = (wVar.a(j, true) || wVar.f() == 0) ? false : true;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.G = false;
            if (this.n.c()) {
                w[] wVarArr = this.v;
                int length = wVarArr.length;
                while (i2 < length) {
                    wVarArr[i2].k();
                    i2++;
                }
                this.n.d();
            } else {
                w[] wVarArr2 = this.v;
                int length2 = wVarArr2.length;
                while (i2 < length2) {
                    wVarArr2[i2].b();
                    i2++;
                }
            }
        } else if (z) {
            j = b(j);
            while (i2 < xVarArr.length) {
                if (xVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.F = true;
        return j;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j, boolean z) {
        s();
        if (r()) {
            return;
        }
        boolean[] zArr = this.A.c;
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            this.v[i].a(j, z, zArr[i]);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j) {
        if (this.N || this.n.a() || this.L) {
            return false;
        }
        if (this.y && this.H == 0) {
            return false;
        }
        boolean zA = this.p.a();
        if (this.n.c()) {
            return zA;
        }
        o();
        return true;
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.n.c() && this.p.e();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        if (this.H == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.N && p() <= this.M) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.J;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long jQ;
        s();
        boolean[] zArr = this.A.b;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.K;
        }
        if (this.z) {
            int length = this.v.length;
            jQ = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.v[i].j()) {
                    jQ = Math.min(jQ, this.v[i].h());
                }
            }
        } else {
            jQ = Long.MAX_VALUE;
        }
        if (jQ == Long.MAX_VALUE) {
            jQ = q();
        }
        return jQ == Long.MIN_VALUE ? this.J : jQ;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j) {
        s();
        boolean[] zArr = this.A.b;
        if (!this.B.a()) {
            j = 0;
        }
        int i = 0;
        this.G = false;
        this.J = j;
        if (r()) {
            this.K = j;
            return j;
        }
        if (this.E != 7 && a(zArr, j)) {
            return j;
        }
        this.L = false;
        this.K = j;
        this.N = false;
        if (this.n.c()) {
            w[] wVarArr = this.v;
            int length = wVarArr.length;
            while (i < length) {
                wVarArr[i].k();
                i++;
            }
            this.n.d();
        } else {
            this.n.b();
            w[] wVarArr2 = this.v;
            int length2 = wVarArr2.length;
            while (i < length2) {
                wVarArr2[i].b();
                i++;
            }
        }
        return j;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j, av avVar) {
        s();
        if (!this.B.a()) {
            return 0L;
        }
        v.a aVarA = this.B.a(j);
        return avVar.a(j, aVarA.f387a.b, aVarA.b.b);
    }

    boolean a(int i) {
        return !m() && this.v[i].b(this.N);
    }

    void b(int i) throws IOException {
        this.v[i].e();
        i();
    }

    void i() throws IOException {
        this.n.a(this.g.a(this.E));
    }

    int a(int i, com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i2) {
        if (m()) {
            return -3;
        }
        c(i);
        int iA = this.v[i].a(wVar, gVar, i2, this.N);
        if (iA == -3) {
            d(i);
        }
        return iA;
    }

    int a(int i, long j) {
        if (m()) {
            return 0;
        }
        c(i);
        w wVar = this.v[i];
        int iB = wVar.b(j, this.N);
        wVar.a(iB);
        if (iB == 0) {
            d(i);
        }
        return iB;
    }

    private void c(int i) {
        s();
        boolean[] zArr = this.A.d;
        if (zArr[i]) {
            return;
        }
        com.applovin.exoplayer2.v vVarA = this.A.f477a.a(i).a(0);
        this.h.a(com.applovin.exoplayer2.l.u.e(vVarA.l), vVarA, 0, (Object) null, this.J);
        zArr[i] = true;
    }

    private void d(int i) {
        s();
        boolean[] zArr = this.A.b;
        if (this.L && zArr[i]) {
            if (this.v[i].b(false)) {
                return;
            }
            this.K = 0L;
            this.L = false;
            this.G = true;
            this.J = 0L;
            this.M = 0;
            for (w wVar : this.v) {
                wVar.b();
            }
            ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
        }
    }

    private boolean m() {
        return this.G || r();
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j, long j2) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.C == -9223372036854775807L && (vVar = this.B) != null) {
            boolean zA = vVar.a();
            long jQ = q();
            long j3 = jQ == Long.MIN_VALUE ? 0L : jQ + WorkRequest.MIN_BACKOFF_MILLIS;
            this.C = j3;
            this.j.a(j3, zA, this.D);
        }
        com.applovin.exoplayer2.k.z zVar = aVar.d;
        j jVar = new j(aVar.b, aVar.l, zVar.e(), zVar.f(), j, j2, zVar.d());
        this.g.a(aVar.b);
        this.h.b(jVar, 1, -1, null, 0, null, aVar.k, this.C);
        a(aVar);
        this.N = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j, long j2, boolean z) {
        com.applovin.exoplayer2.k.z zVar = aVar.d;
        j jVar = new j(aVar.b, aVar.l, zVar.e(), zVar.f(), j, j2, zVar.d());
        this.g.a(aVar.b);
        this.h.c(jVar, 1, -1, null, 0, null, aVar.k, this.C);
        if (z) {
            return;
        }
        a(aVar);
        for (w wVar : this.v) {
            wVar.b();
        }
        if (this.H > 0) {
            ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
        }
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public w.b a(a aVar, long j, long j2, IOException iOException, int i) {
        w.b bVarA;
        a(aVar);
        com.applovin.exoplayer2.k.z zVar = aVar.d;
        j jVar = new j(aVar.b, aVar.l, zVar.e(), zVar.f(), j, j2, zVar.d());
        long jA = this.g.a(new v.a(jVar, new m(1, -1, null, 0, null, com.applovin.exoplayer2.h.a(aVar.k), com.applovin.exoplayer2.h.a(this.C)), iOException, i));
        if (jA == -9223372036854775807L) {
            bVarA = com.applovin.exoplayer2.k.w.d;
        } else {
            int iP = p();
            boolean z = iP > this.M;
            if (a(aVar, iP)) {
                bVarA = com.applovin.exoplayer2.k.w.a(z, jA);
            } else {
                bVarA = com.applovin.exoplayer2.k.w.c;
            }
        }
        boolean zA = bVarA.a();
        this.h.a(jVar, 1, -1, null, 0, null, aVar.k, this.C, iOException, !zA);
        if (!zA) {
            this.g.a(aVar.b);
        }
        return bVarA;
    }

    @Override // com.applovin.exoplayer2.e.j
    public com.applovin.exoplayer2.e.x a(int i, int i2) {
        return a(new d(i, false));
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.x = true;
        this.s.post(this.q);
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final com.applovin.exoplayer2.e.v vVar) {
        this.s.post(new Runnable() { // from class: com.applovin.exoplayer2.h.t$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(vVar);
            }
        });
    }

    com.applovin.exoplayer2.e.x j() {
        return a(new d(0, true));
    }

    @Override // com.applovin.exoplayer2.h.w.c
    public void a(com.applovin.exoplayer2.v vVar) {
        this.s.post(this.q);
    }

    private com.applovin.exoplayer2.e.x a(d dVar) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.w[i])) {
                return this.v[i];
            }
        }
        w wVarA = w.a(this.k, this.s.getLooper(), this.f, this.i);
        wVarA.a(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.w, i2);
        dVarArr[length] = dVar;
        this.w = (d[]) ai.a((Object[]) dVarArr);
        w[] wVarArr = (w[]) Arrays.copyOf(this.v, i2);
        wVarArr[length] = wVarA;
        this.v = (w[]) ai.a((Object[]) wVarArr);
        return wVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(com.applovin.exoplayer2.e.v vVar) {
        this.B = this.u == null ? vVar : new v.b(-9223372036854775807L);
        this.C = vVar.b();
        boolean z = this.I == -1 && vVar.b() == -9223372036854775807L;
        this.D = z;
        this.E = z ? 7 : 1;
        this.j.a(this.C, vVar.a(), this.D);
        if (this.y) {
            return;
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.applovin.exoplayer2.g.a aVarA;
        if (this.O || this.y || !this.x || this.B == null) {
            return;
        }
        for (w wVar : this.v) {
            if (wVar.g() == null) {
                return;
            }
        }
        this.p.b();
        int length = this.v.length;
        ac[] acVarArr = new ac[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            com.applovin.exoplayer2.v vVarA = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.v[i].g());
            String str = vVarA.l;
            boolean zA = com.applovin.exoplayer2.l.u.a(str);
            boolean z = zA || com.applovin.exoplayer2.l.u.b(str);
            zArr[i] = z;
            this.z = z | this.z;
            com.applovin.exoplayer2.g.d.b bVar = this.u;
            if (bVar != null) {
                if (zA || this.w[i].b) {
                    com.applovin.exoplayer2.g.a aVar = vVarA.j;
                    if (aVar == null) {
                        aVarA = new com.applovin.exoplayer2.g.a(bVar);
                    } else {
                        aVarA = aVar.a(bVar);
                    }
                    vVarA = vVarA.a().a(aVarA).a();
                }
                if (zA && vVarA.f == -1 && vVarA.g == -1 && bVar.f423a != -1) {
                    vVarA = vVarA.a().d(bVar.f423a).a();
                }
            }
            acVarArr[i] = new ac(vVarA.a(this.f.a(vVarA)));
        }
        this.A = new e(new ad(acVarArr), zArr);
        this.y = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a((n) this);
    }

    private void a(a aVar) {
        if (this.I == -1) {
            this.I = aVar.m;
        }
    }

    private void o() {
        a aVar = new a(this.d, this.e, this.o, this, this.p);
        if (this.y) {
            com.applovin.exoplayer2.l.a.b(r());
            long j = this.C;
            if (j != -9223372036854775807L && this.K > j) {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
            aVar.a(((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.b(this.B)).a(this.K).f387a.c, this.K);
            for (w wVar : this.v) {
                wVar.a(this.K);
            }
            this.K = -9223372036854775807L;
        }
        this.M = p();
        this.h.a(new j(aVar.b, aVar.l, this.n.a(aVar, this, this.g.a(this.E))), 1, -1, null, 0, null, aVar.k, this.C);
    }

    private boolean a(a aVar, int i) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.I != -1 || ((vVar = this.B) != null && vVar.b() != -9223372036854775807L)) {
            this.M = i;
            return true;
        }
        if (this.y && !m()) {
            this.L = true;
            return false;
        }
        this.G = this.y;
        this.J = 0L;
        this.M = 0;
        for (w wVar : this.v) {
            wVar.b();
        }
        aVar.a(0L, 0L);
        return true;
    }

    private boolean a(boolean[] zArr, long j) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            if (!this.v[i].a(j, false) && (zArr[i] || !this.z)) {
                return false;
            }
        }
        return true;
    }

    private int p() {
        int iC = 0;
        for (w wVar : this.v) {
            iC += wVar.c();
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        long jMax = Long.MIN_VALUE;
        for (w wVar : this.v) {
            jMax = Math.max(jMax, wVar.h());
        }
        return jMax;
    }

    private boolean r() {
        return this.K != -9223372036854775807L;
    }

    private void s() {
        com.applovin.exoplayer2.l.a.b(this.y);
        com.applovin.exoplayer2.l.a.b(this.A);
        com.applovin.exoplayer2.l.a.b(this.B);
    }

    private final class c implements x {
        private final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            return t.this.a(this.b);
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            t.this.b(this.b);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i) {
            return t.this.a(this.b, wVar, gVar, i);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j) {
            return t.this.a(this.b, j);
        }
    }

    final class a implements i.a, w.d {
        private final Uri c;
        private final com.applovin.exoplayer2.k.z d;
        private final s e;
        private final com.applovin.exoplayer2.e.j f;
        private final com.applovin.exoplayer2.l.g g;
        private volatile boolean i;
        private long k;
        private com.applovin.exoplayer2.e.x n;
        private boolean o;
        private final com.applovin.exoplayer2.e.u h = new com.applovin.exoplayer2.e.u();
        private boolean j = true;
        private long m = -1;
        private final long b = j.a();
        private com.applovin.exoplayer2.k.l l = a(0);

        public a(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.e.j jVar, com.applovin.exoplayer2.l.g gVar) {
            this.c = uri;
            this.d = new com.applovin.exoplayer2.k.z(iVar);
            this.e = sVar;
            this.f = jVar;
            this.g = gVar;
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void a() {
            this.i = true;
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void b() throws IOException {
            int iA = 0;
            while (iA == 0 && !this.i) {
                try {
                    long j = this.h.f386a;
                    com.applovin.exoplayer2.k.l lVarA = a(j);
                    this.l = lVarA;
                    long jA = this.d.a(lVarA);
                    this.m = jA;
                    if (jA != -1) {
                        this.m = jA + j;
                    }
                    t.this.u = com.applovin.exoplayer2.g.d.b.a(this.d.b());
                    com.applovin.exoplayer2.k.g iVar = this.d;
                    if (t.this.u != null && t.this.u.f != -1) {
                        iVar = new i(this.d, t.this.u.f, this);
                        com.applovin.exoplayer2.e.x xVarJ = t.this.j();
                        this.n = xVarJ;
                        xVarJ.a(t.c);
                    }
                    long jC = j;
                    this.e.a(iVar, this.c, this.d.b(), j, this.m, this.f);
                    if (t.this.u != null) {
                        this.e.b();
                    }
                    if (this.j) {
                        this.e.a(jC, this.k);
                        this.j = false;
                    }
                    while (true) {
                        long j2 = jC;
                        while (iA == 0 && !this.i) {
                            try {
                                this.g.c();
                                iA = this.e.a(this.h);
                                jC = this.e.c();
                                if (jC > t.this.m + j2) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.g.b();
                        t.this.s.post(t.this.r);
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (this.e.c() != -1) {
                        this.h.f386a = this.e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.d);
                } catch (Throwable th) {
                    if (iA != 1 && this.e.c() != -1) {
                        this.h.f386a = this.e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.d);
                    throw th;
                }
            }
        }

        @Override // com.applovin.exoplayer2.h.i.a
        public void a(com.applovin.exoplayer2.l.y yVar) {
            long jMax = !this.o ? this.k : Math.max(t.this.q(), this.k);
            int iA = yVar.a();
            com.applovin.exoplayer2.e.x xVar = (com.applovin.exoplayer2.e.x) com.applovin.exoplayer2.l.a.b(this.n);
            xVar.a(yVar, iA);
            xVar.a(jMax, 1, iA, 0, null);
            this.o = true;
        }

        private com.applovin.exoplayer2.k.l a(long j) {
            return new l.a().a(this.c).a(j).b(t.this.l).b(6).a(t.b).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.h.f386a = j;
            this.k = j2;
            this.j = true;
            this.o = false;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ad f477a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(ad adVar, boolean[] zArr) {
            this.f477a = adVar;
            this.b = zArr;
            this.c = new boolean[adVar.b];
            this.d = new boolean[adVar.b];
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f476a;
        public final boolean b;

        public d(int i, boolean z) {
            this.f476a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f476a == dVar.f476a && this.b == dVar.b;
        }

        public int hashCode() {
            return (this.f476a * 31) + (this.b ? 1 : 0);
        }
    }

    private static Map<String, String> t() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        return Collections.unmodifiableMap(map);
    }
}
