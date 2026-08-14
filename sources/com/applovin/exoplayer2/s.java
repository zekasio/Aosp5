package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.m;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.warren.AdLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class s implements Handler.Callback, ah.d, ao.a, n.a, j.a, m.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private g K;
    private long L;
    private int M;
    private boolean N;
    private p O;
    private long P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ar[] f671a;
    private final Set<ar> b;
    private final as[] c;
    private final com.applovin.exoplayer2.j.j d;
    private final com.applovin.exoplayer2.j.k e;
    private final aa f;
    private final com.applovin.exoplayer2.k.d g;
    private final com.applovin.exoplayer2.l.o h;
    private final HandlerThread i;
    private final Looper j;
    private final ba.c k;
    private final ba.a l;
    private final long m;
    private final boolean n;
    private final m o;
    private final ArrayList<c> p;
    private final com.applovin.exoplayer2.l.d q;
    private final e r;
    private final af s;
    private final ah t;
    private final z u;
    private final long v;
    private av w;
    private al x;
    private d y;
    private boolean z;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f674a;
        public final int b;
        public final int c;
        public final com.applovin.exoplayer2.h.z d;
    }

    public interface e {
        void onPlaybackInfoUpdate(d dVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public al f676a;
        public int b;
        public boolean c;
        public int d;
        public boolean e;
        public int f;
        private boolean g;

        public d(al alVar) {
            this.f676a = alVar;
        }

        public void a(int i) {
            this.g |= i > 0;
            this.b += i;
        }

        public void a(al alVar) {
            this.g |= this.f676a != alVar;
            this.f676a = alVar;
        }

        public void b(int i) {
            if (this.c && this.d != 5) {
                com.applovin.exoplayer2.l.a.a(i == 5);
                return;
            }
            this.g = true;
            this.c = true;
            this.d = i;
        }

        public void c(int i) {
            this.g = true;
            this.e = true;
            this.f = i;
        }
    }

    public s(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.j.k kVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, int i, boolean z, com.applovin.exoplayer2.a.a aVar, av avVar, z zVar, long j, boolean z2, Looper looper, com.applovin.exoplayer2.l.d dVar2, e eVar) {
        this.r = eVar;
        this.f671a = arVarArr;
        this.d = jVar;
        this.e = kVar;
        this.f = aaVar;
        this.g = dVar;
        this.E = i;
        this.F = z;
        this.w = avVar;
        this.u = zVar;
        this.v = j;
        this.P = j;
        this.A = z2;
        this.q = dVar2;
        this.m = aaVar.e();
        this.n = aaVar.f();
        al alVarA = al.a(kVar);
        this.x = alVarA;
        this.y = new d(alVarA);
        this.c = new as[arVarArr.length];
        for (int i2 = 0; i2 < arVarArr.length; i2++) {
            arVarArr[i2].a(i2);
            this.c[i2] = arVarArr[i2].b();
        }
        this.o = new m(this, dVar2);
        this.p = new ArrayList<>();
        this.b = com.applovin.exoplayer2.common.a.aq.b();
        this.k = new ba.c();
        this.l = new ba.a();
        jVar.a(this, dVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.s = new af(aVar, handler);
        this.t = new ah(this, aVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.h = dVar2.a(looper2, this);
    }

    public void a(long j) {
        this.P = j;
    }

    public void a() {
        this.h.b(0).a();
    }

    public void a(boolean z, int i) {
        this.h.a(1, z ? 1 : 0, i).a();
    }

    public void a(int i) {
        this.h.a(11, i, 0).a();
    }

    public void a(boolean z) {
        this.h.a(12, z ? 1 : 0, 0).a();
    }

    public void a(ba baVar, int i, long j) {
        this.h.a(3, new g(baVar, i, j)).a();
    }

    public void b() {
        this.h.b(6).a();
    }

    public void a(List<ah.c> list, int i, long j, com.applovin.exoplayer2.h.z zVar) {
        this.h.a(17, new a(list, zVar, i, j)).a();
    }

    public void a(int i, int i2, com.applovin.exoplayer2.h.z zVar) {
        this.h.a(20, i, i2, zVar).a();
    }

    @Override // com.applovin.exoplayer2.ao.a
    public synchronized void a(ao aoVar) {
        if (!this.z && this.i.isAlive()) {
            this.h.a(14, aoVar).a();
            return;
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        aoVar.a(false);
    }

    public synchronized boolean c() {
        if (!this.z && this.i.isAlive()) {
            this.h.c(7);
            a(new Supplier() { // from class: com.applovin.exoplayer2.s$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return this.f$0.K();
                }
            }, this.v);
            return this.z;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean K() {
        return Boolean.valueOf(this.z);
    }

    public Looper d() {
        return this.j;
    }

    @Override // com.applovin.exoplayer2.ah.d
    public void e() {
        this.h.c(22);
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.h.a(8, nVar).a();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.h.a(9, nVar).a();
    }

    @Override // com.applovin.exoplayer2.m.a
    public void a(am amVar) {
        this.h.a(16, amVar).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        ad adVarD;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    n();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((am) message.obj);
                    break;
                case 5:
                    a((av) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    p();
                    return true;
                case 8:
                    c((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 9:
                    d((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 10:
                    q();
                    break;
                case 11:
                    c(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    b((ao) message.obj);
                    break;
                case 15:
                    d((ao) message.obj);
                    break;
                case 16:
                    a((am) message.obj, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    b(message.arg1, message.arg2, (com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 21:
                    a((com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 22:
                    h();
                    break;
                case 23:
                    c(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (ai e2) {
            if (e2.b == 1) {
                i = e2.f35a ? 3001 : 3003;
            } else if (e2.b == 4) {
                i = e2.f35a ? 3002 : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            a(e2, i);
        } catch (f.a e3) {
            a(e3, e3.f250a);
        } catch (com.applovin.exoplayer2.h.b e4) {
            a(e4, 1002);
        } catch (com.applovin.exoplayer2.k.j e5) {
            a(e5, e5.f579a);
        } catch (p e6) {
            e = e6;
            if (e.f669a == 1 && (adVarD = this.s.d()) != null) {
                e = e.a(adVarD.f.f29a);
            }
            if (e.g && this.O == null) {
                com.applovin.exoplayer2.l.q.b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                com.applovin.exoplayer2.l.o oVar = this.h;
                oVar.a(oVar.a(25, e));
            } else {
                p pVar = this.O;
                if (pVar != null) {
                    pVar.addSuppressed(e);
                    e = this.O;
                }
                com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.x = this.x.a(e);
            }
        } catch (IOException e7) {
            a(e7, 2000);
        } catch (RuntimeException e8) {
            p pVarA = p.a(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", pVarA);
            a(true, false);
            this.x = this.x.a(pVarA);
        }
        f();
        return true;
    }

    private void a(IOException iOException, int i) {
        p pVarA = p.a(iOException, i);
        ad adVarC = this.s.c();
        if (adVarC != null) {
            pVarA = pVarA.a(adVarC.f.f29a);
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", pVarA);
        a(false, false);
        this.x = this.x.a(pVarA);
    }

    private synchronized void a(Supplier<Boolean> supplier, long j) {
        long jA = this.q.a() + j;
        boolean z = false;
        while (!supplier.get().booleanValue() && j > 0) {
            try {
                this.q.c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jA - this.q.a();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(int i) {
        if (this.x.e != i) {
            this.x = this.x.a(i);
        }
    }

    private void f() {
        this.y.a(this.x);
        if (this.y.g) {
            this.r.onPlaybackInfoUpdate(this.y);
            this.y = new d(this.x);
        }
    }

    private void g() {
        this.y.a(1);
        a(false, false, false, true);
        this.f.a();
        b(this.x.f37a.d() ? 4 : 2);
        this.t.a(this.g.a());
        this.h.c(2);
    }

    private void a(a aVar) throws Throwable {
        this.y.a(1);
        if (aVar.c != -1) {
            this.K = new g(new ap(aVar.f673a, aVar.b), aVar.c, aVar.d);
        }
        a(this.t.a(aVar.f673a, aVar.b), false);
    }

    private void a(a aVar, int i) throws Throwable {
        this.y.a(1);
        ah ahVar = this.t;
        if (i == -1) {
            i = ahVar.b();
        }
        a(ahVar.a(i, aVar.f673a, aVar.b), false);
    }

    private void a(b bVar) throws Throwable {
        this.y.a(1);
        a(this.t.a(bVar.f674a, bVar.b, bVar.c, bVar.d), false);
    }

    private void b(int i, int i2, com.applovin.exoplayer2.h.z zVar) throws Throwable {
        this.y.a(1);
        a(this.t.a(i, i2, zVar), false);
    }

    private void h() throws Throwable {
        a(this.t.d(), true);
    }

    private void a(com.applovin.exoplayer2.h.z zVar) throws Throwable {
        this.y.a(1);
        a(this.t.a(zVar), false);
    }

    private void b(boolean z) {
        for (ad adVarC = this.s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().c) {
                if (dVar != null) {
                    dVar.a(z);
                }
            }
        }
    }

    private void a(boolean z, int i, boolean z2, int i2) throws p {
        this.y.a(z2 ? 1 : 0);
        this.y.c(i2);
        this.x = this.x.a(z, i);
        this.C = false;
        b(z);
        if (!J()) {
            j();
            l();
        } else if (this.x.e == 3) {
            i();
            this.h.c(2);
        } else if (this.x.e == 2) {
            this.h.c(2);
        }
    }

    private void c(boolean z) throws p {
        this.A = z;
        A();
        if (!this.B || this.s.d() == this.s.c()) {
            return;
        }
        f(true);
        h(false);
    }

    private void d(boolean z) {
        if (z == this.I) {
            return;
        }
        this.I = z;
        int i = this.x.e;
        if (z || i == 4 || i == 1) {
            this.x = this.x.b(z);
        } else {
            this.h.c(2);
        }
    }

    private void c(int i) throws p {
        this.E = i;
        if (!this.s.a(this.x.f37a, i)) {
            f(true);
        }
        h(false);
    }

    private void e(boolean z) throws p {
        this.F = z;
        if (!this.s.a(this.x.f37a, z)) {
            f(true);
        }
        h(false);
    }

    private void f(boolean z) throws p {
        p.a aVar = this.s.c().f.f29a;
        long jA = a(aVar, this.x.s, true, false);
        if (jA != this.x.s) {
            this.x = a(aVar, jA, this.x.c, this.x.d, z, 5);
        }
    }

    private void i() throws p {
        this.C = false;
        this.o.a();
        for (ar arVar : this.f671a) {
            if (c(arVar)) {
                arVar.e();
            }
        }
    }

    private void j() throws p {
        this.o.b();
        for (ar arVar : this.f671a) {
            if (c(arVar)) {
                a(arVar);
            }
        }
    }

    private void k() throws p {
        f(true);
    }

    private void l() throws p {
        ad adVarC = this.s.c();
        if (adVarC == null) {
            return;
        }
        long jC = adVarC.d ? adVarC.f28a.c() : -9223372036854775807L;
        if (jC != -9223372036854775807L) {
            b(jC);
            if (jC != this.x.s) {
                this.x = a(this.x.b, jC, this.x.c, jC, true, 5);
            }
        } else {
            long jA = this.o.a(adVarC != this.s.d());
            this.L = jA;
            long jB = adVarC.b(jA);
            c(this.x.s, jB);
            this.x.s = jB;
        }
        this.x.q = this.s.b().d();
        this.x.r = I();
        if (this.x.l && this.x.e == 3 && a(this.x.f37a, this.x.b) && this.x.n.b == 1.0f) {
            float fA = this.u.a(o(), I());
            if (this.o.d().b != fA) {
                this.o.a(this.x.n.a(fA));
                a(this.x.n, this.o.d().b, false, false);
            }
        }
    }

    private void m() {
        for (ad adVarC = this.s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().c) {
                if (dVar != null) {
                    dVar.h();
                }
            }
        }
    }

    private void n() throws IOException, p {
        boolean z;
        boolean z2;
        boolean z3;
        long jB = this.q.b();
        u();
        if (this.x.e == 1 || this.x.e == 4) {
            this.h.d(2);
            return;
        }
        ad adVarC = this.s.c();
        if (adVarC == null) {
            a(jB, 10L);
            return;
        }
        com.applovin.exoplayer2.l.ah.a("doSomeWork");
        l();
        if (adVarC.d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            adVarC.f28a.a(this.x.s - this.m, this.n);
            int i = 0;
            z = true;
            z2 = true;
            while (true) {
                ar[] arVarArr = this.f671a;
                if (i >= arVarArr.length) {
                    break;
                }
                ar arVar = arVarArr[i];
                if (c(arVar)) {
                    arVar.a(this.L, jElapsedRealtime);
                    z = z && arVar.A();
                    boolean z4 = adVarC.c[i] != arVar.f();
                    boolean z5 = z4 || (!z4 && arVar.g()) || arVar.z() || arVar.A();
                    z2 = z2 && z5;
                    if (!z5) {
                        arVar.k();
                    }
                }
                i++;
            }
        } else {
            adVarC.f28a.e_();
            z = true;
            z2 = true;
        }
        long j = adVarC.f.e;
        boolean z6 = z && adVarC.d && (j == -9223372036854775807L || j <= this.x.s);
        if (z6 && this.B) {
            this.B = false;
            a(false, this.x.m, false, 5);
        }
        if (z6 && adVarC.f.i) {
            b(4);
            j();
        } else if (this.x.e == 2 && g(z2)) {
            b(3);
            this.O = null;
            if (J()) {
                i();
            }
        } else if (this.x.e == 3 && (this.J != 0 ? !z2 : !s())) {
            this.C = J();
            b(2);
            if (this.C) {
                m();
                this.u.a();
            }
            j();
        }
        if (this.x.e == 2) {
            int i2 = 0;
            while (true) {
                ar[] arVarArr2 = this.f671a;
                if (i2 >= arVarArr2.length) {
                    break;
                }
                if (c(arVarArr2[i2]) && this.f671a[i2].f() == adVarC.c[i2]) {
                    this.f671a[i2].k();
                }
                i2++;
            }
            if (!this.x.g && this.x.r < 500000 && F()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (this.I != this.x.o) {
            this.x = this.x.b(this.I);
        }
        if ((J() && this.x.e == 3) || this.x.e == 2) {
            z3 = !b(jB, 10L);
        } else {
            if (this.J != 0 && this.x.e != 4) {
                a(jB, 1000L);
            } else {
                this.h.d(2);
            }
            z3 = false;
        }
        if (this.x.p != z3) {
            this.x = this.x.c(z3);
        }
        this.H = false;
        com.applovin.exoplayer2.l.ah.a();
    }

    private long o() {
        return a(this.x.f37a, this.x.b.f471a, this.x.s);
    }

    private long a(ba baVar, Object obj, long j) {
        baVar.a(baVar.a(obj, this.l).c, this.k);
        if (this.k.g != -9223372036854775807L && this.k.e() && this.k.j) {
            return h.b(this.k.d() - this.k.g) - (j + this.l.c());
        }
        return -9223372036854775807L;
    }

    private boolean a(ba baVar, p.a aVar) {
        if (aVar.a() || baVar.d()) {
            return false;
        }
        baVar.a(baVar.a(aVar.f471a, this.l).c, this.k);
        return this.k.e() && this.k.j && this.k.g != -9223372036854775807L;
    }

    private void a(long j, long j2) {
        this.h.d(2);
        this.h.a(2, j + j2);
    }

    private boolean b(long j, long j2) {
        if (this.I && this.H) {
            return false;
        }
        a(j, j2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:46:0x00fb, B:48:0x0102, B:52:0x0116, B:56:0x011f), top: B:73:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.applovin.exoplayer2.s.g r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(com.applovin.exoplayer2.s$g):void");
    }

    private long a(p.a aVar, long j, boolean z) throws p {
        return a(aVar, j, this.s.c() != this.s.d(), z);
    }

    private long a(p.a aVar, long j, boolean z, boolean z2) throws p {
        j();
        this.C = false;
        if (z2 || this.x.e == 3) {
            b(2);
        }
        ad adVarC = this.s.c();
        ad adVarG = adVarC;
        while (adVarG != null && !aVar.equals(adVarG.f.f29a)) {
            adVarG = adVarG.g();
        }
        if (z || adVarC != adVarG || (adVarG != null && adVarG.a(j) < 0)) {
            for (ar arVar : this.f671a) {
                b(arVar);
            }
            if (adVarG != null) {
                while (this.s.c() != adVarG) {
                    this.s.f();
                }
                this.s.a(adVarG);
                adVarG.c(0L);
                H();
            }
        }
        if (adVarG != null) {
            this.s.a(adVarG);
            if (!adVarG.d) {
                adVarG.f = adVarG.f.a(j);
            } else if (adVarG.e) {
                long jB = adVarG.f28a.b(j);
                adVarG.f28a.a(jB - this.m, this.n);
                j = jB;
            }
            b(j);
            D();
        } else {
            this.s.g();
            b(j);
        }
        h(false);
        this.h.c(2);
        return j;
    }

    private void b(long j) throws p {
        ad adVarC = this.s.c();
        if (adVarC != null) {
            j = adVarC.a(j);
        }
        this.L = j;
        this.o.a(j);
        for (ar arVar : this.f671a) {
            if (c(arVar)) {
                arVar.a(this.L);
            }
        }
        r();
    }

    private void b(am amVar) throws p {
        this.o.a(amVar);
        a(this.o.d(), true);
    }

    private void a(av avVar) {
        this.w = avVar;
    }

    private void a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.G != z) {
            this.G = z;
            if (!z) {
                for (ar arVar : this.f671a) {
                    if (!c(arVar) && this.b.remove(arVar)) {
                        arVar.n();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z, boolean z2) {
        a(z || !this.G, false, true, false);
        this.y.a(z2 ? 1 : 0);
        this.f.b();
        b(1);
    }

    private void p() {
        a(true, false, true, false);
        this.f.c();
        b(1);
        this.i.quit();
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(boolean, boolean, boolean, boolean):void");
    }

    private Pair<p.a, Long> a(ba baVar) {
        if (baVar.d()) {
            return Pair.create(al.a(), 0L);
        }
        Pair<Object, Long> pairA = baVar.a(this.k, this.l, baVar.b(this.F), -9223372036854775807L);
        p.a aVarA = this.s.a(baVar, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (aVarA.a()) {
            baVar.a(aVarA.f471a, this.l);
            jLongValue = aVarA.c == this.l.b(aVarA.b) ? this.l.f() : 0L;
        }
        return Pair.create(aVarA, Long.valueOf(jLongValue));
    }

    private void b(ao aoVar) throws p {
        if (aoVar.f() == -9223372036854775807L) {
            c(aoVar);
            return;
        }
        if (this.x.f37a.d()) {
            this.p.add(new c(aoVar));
            return;
        }
        c cVar = new c(aoVar);
        if (a(cVar, this.x.f37a, this.x.f37a, this.E, this.F, this.k, this.l)) {
            this.p.add(cVar);
            Collections.sort(this.p);
        } else {
            aoVar.a(false);
        }
    }

    private void c(ao aoVar) throws p {
        if (aoVar.e() == this.j) {
            e(aoVar);
            if (this.x.e == 3 || this.x.e == 2) {
                this.h.c(2);
                return;
            }
            return;
        }
        this.h.a(15, aoVar).a();
    }

    private void d(final ao aoVar) {
        Looper looperE = aoVar.e();
        if (!looperE.getThread().isAlive()) {
            com.applovin.exoplayer2.l.q.c("TAG", "Trying to send message on a dead thread.");
            aoVar.a(false);
        } else {
            this.q.a(looperE, null).a(new Runnable() { // from class: com.applovin.exoplayer2.s$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.f(aoVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ao aoVar) {
        try {
            e(aoVar);
        } catch (p e2) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void e(ao aoVar) throws p {
        if (aoVar.j()) {
            return;
        }
        try {
            aoVar.b().a(aoVar.c(), aoVar.d());
        } finally {
            aoVar.a(true);
        }
    }

    private void a(ba baVar, ba baVar2) {
        if (baVar.d() && baVar2.d()) {
            return;
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!a(this.p.get(size), baVar, baVar2, this.E, this.F, this.k, this.l)) {
                this.p.get(size).f675a.a(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x007d, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(long r9, long r11) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.c(long, long):void");
    }

    private void a(ar arVar) throws p {
        if (arVar.d_() == 2) {
            arVar.l();
        }
    }

    private void b(ar arVar) throws p {
        if (c(arVar)) {
            this.o.b(arVar);
            a(arVar);
            arVar.m();
            this.J--;
        }
    }

    private void q() throws p {
        float f2 = this.o.d().b;
        ad adVarD = this.s.d();
        boolean z = true;
        for (ad adVarC = this.s.c(); adVarC != null && adVarC.d; adVarC = adVarC.g()) {
            com.applovin.exoplayer2.j.k kVarB = adVarC.b(f2, this.x.f37a);
            if (kVarB.a(adVarC.i())) {
                if (adVarC == adVarD) {
                    z = false;
                }
            } else {
                if (z) {
                    ad adVarC2 = this.s.c();
                    boolean zA = this.s.a(adVarC2);
                    boolean[] zArr = new boolean[this.f671a.length];
                    long jA = adVarC2.a(kVarB, this.x.s, zA, zArr);
                    boolean z2 = (this.x.e == 4 || jA == this.x.s) ? false : true;
                    this.x = a(this.x.b, jA, this.x.c, this.x.d, z2, 5);
                    if (z2) {
                        b(jA);
                    }
                    boolean[] zArr2 = new boolean[this.f671a.length];
                    int i = 0;
                    while (true) {
                        ar[] arVarArr = this.f671a;
                        if (i >= arVarArr.length) {
                            break;
                        }
                        ar arVar = arVarArr[i];
                        zArr2[i] = c(arVar);
                        com.applovin.exoplayer2.h.x xVar = adVarC2.c[i];
                        if (zArr2[i]) {
                            if (xVar != arVar.f()) {
                                b(arVar);
                            } else if (zArr[i]) {
                                arVar.a(this.L);
                            }
                        }
                        i++;
                    }
                    a(zArr2);
                } else {
                    this.s.a(adVarC);
                    if (adVarC.d) {
                        adVarC.a(kVarB, Math.max(adVarC.f.b, adVarC.b(this.L)), false);
                    }
                }
                h(true);
                if (this.x.e != 4) {
                    D();
                    l();
                    this.h.c(2);
                    return;
                }
                return;
            }
        }
    }

    private void a(float f2) {
        for (ad adVarC = this.s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().c) {
                if (dVar != null) {
                    dVar.a(f2);
                }
            }
        }
    }

    private void r() {
        for (ad adVarC = this.s.c(); adVarC != null; adVarC = adVarC.g()) {
            for (com.applovin.exoplayer2.j.d dVar : adVarC.i().c) {
                if (dVar != null) {
                    dVar.g();
                }
            }
        }
    }

    private boolean g(boolean z) {
        if (this.J == 0) {
            return s();
        }
        if (!z) {
            return false;
        }
        if (!this.x.g) {
            return true;
        }
        long jB = a(this.x.f37a, this.s.c().f.f29a) ? this.u.b() : -9223372036854775807L;
        ad adVarB = this.s.b();
        return (adVarB.c() && adVarB.f.i) || (adVarB.f.f29a.a() && !adVarB.d) || this.f.a(I(), this.o.d().b, this.C, jB);
    }

    private boolean s() {
        ad adVarC = this.s.c();
        long j = adVarC.f.e;
        return adVarC.d && (j == -9223372036854775807L || this.x.s < j || !J());
    }

    private void a(ba baVar, boolean z) throws Throwable {
        boolean z2;
        f fVarA = a(baVar, this.x, this.K, this.s, this.E, this.F, this.k, this.l);
        p.a aVar = fVarA.f677a;
        long j = fVarA.c;
        boolean z3 = fVarA.d;
        long jA = fVarA.b;
        boolean z4 = (this.x.b.equals(aVar) && jA == this.x.s) ? false : true;
        g gVar = null;
        try {
            if (fVarA.e) {
                if (this.x.e != 1) {
                    b(4);
                }
                a(false, false, false, true);
            }
            try {
                if (z4) {
                    z2 = false;
                    if (!baVar.d()) {
                        for (ad adVarC = this.s.c(); adVarC != null; adVarC = adVarC.g()) {
                            if (adVarC.f.f29a.equals(aVar)) {
                                adVarC.f = this.s.a(baVar, adVarC.f);
                                adVarC.j();
                            }
                        }
                        jA = a(aVar, jA, z3);
                    }
                } else {
                    try {
                        z2 = false;
                        if (!this.s.a(baVar, this.L, t())) {
                            f(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        gVar = null;
                        g gVar2 = gVar;
                        a(baVar, aVar, this.x.f37a, this.x.b, fVarA.f ? jA : -9223372036854775807L);
                        if (z4 || j != this.x.c) {
                            Object obj = this.x.b.f471a;
                            ba baVar2 = this.x.f37a;
                            this.x = a(aVar, jA, j, this.x.d, z4 && z && !baVar2.d() && !baVar2.a(obj, this.l).f, baVar.c(obj) == -1 ? 4 : 3);
                        }
                        A();
                        a(baVar, this.x.f37a);
                        this.x = this.x.a(baVar);
                        if (!baVar.d()) {
                            this.K = gVar2;
                        }
                        h(false);
                        throw th;
                    }
                }
                a(baVar, aVar, this.x.f37a, this.x.b, fVarA.f ? jA : -9223372036854775807L);
                if (z4 || j != this.x.c) {
                    Object obj2 = this.x.b.f471a;
                    ba baVar3 = this.x.f37a;
                    this.x = a(aVar, jA, j, this.x.d, z4 && z && !baVar3.d() && !baVar3.a(obj2, this.l).f, baVar.c(obj2) == -1 ? 4 : 3);
                }
                A();
                a(baVar, this.x.f37a);
                this.x = this.x.a(baVar);
                if (!baVar.d()) {
                    this.K = null;
                }
                h(z2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(ba baVar, p.a aVar, ba baVar2, p.a aVar2, long j) {
        if (baVar.d() || !a(baVar, aVar)) {
            if (this.o.d().b != this.x.n.b) {
                this.o.a(this.x.n);
                return;
            }
            return;
        }
        baVar.a(baVar.a(aVar.f471a, this.l).c, this.k);
        this.u.a((ab.e) com.applovin.exoplayer2.l.ai.a(this.k.l));
        if (j != -9223372036854775807L) {
            this.u.a(a(baVar, aVar.f471a, j));
            return;
        }
        if (com.applovin.exoplayer2.l.ai.a(!baVar2.d() ? baVar2.a(baVar2.a(aVar2.f471a, this.l).c, this.k).b : null, this.k.b)) {
            return;
        }
        this.u.a(-9223372036854775807L);
    }

    private long t() {
        ad adVarD = this.s.d();
        if (adVarD == null) {
            return 0L;
        }
        long jA = adVarD.a();
        if (!adVarD.d) {
            return jA;
        }
        int i = 0;
        while (true) {
            ar[] arVarArr = this.f671a;
            if (i >= arVarArr.length) {
                return jA;
            }
            if (c(arVarArr[i]) && this.f671a[i].f() == adVarD.c[i]) {
                long jH = this.f671a[i].h();
                if (jH == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jA = Math.max(jH, jA);
            }
            i++;
        }
    }

    private void u() throws IOException, p {
        if (this.x.f37a.d() || !this.t.a()) {
            return;
        }
        v();
        w();
        x();
        z();
    }

    private void v() throws p {
        ae aeVarA;
        this.s.a(this.L);
        if (this.s.a() && (aeVarA = this.s.a(this.L, this.x)) != null) {
            ad adVarA = this.s.a(this.c, this.d, this.f.d(), this.t, aeVarA, this.e);
            adVarA.f28a.a(this, aeVarA.b);
            if (this.s.c() == adVarA) {
                b(adVarA.b());
            }
            h(false);
        }
        if (this.D) {
            this.D = F();
            G();
        } else {
            D();
        }
    }

    private void w() {
        ad adVarD = this.s.d();
        if (adVarD == null) {
            return;
        }
        int i = 0;
        if (adVarD.g() == null || this.B) {
            if (!adVarD.f.i && !this.B) {
                return;
            }
            while (true) {
                ar[] arVarArr = this.f671a;
                if (i >= arVarArr.length) {
                    return;
                }
                ar arVar = arVarArr[i];
                com.applovin.exoplayer2.h.x xVar = adVarD.c[i];
                if (xVar != null && arVar.f() == xVar && arVar.g()) {
                    a(arVar, (adVarD.f.e == -9223372036854775807L || adVarD.f.e == Long.MIN_VALUE) ? -9223372036854775807L : adVarD.a() + adVarD.f.e);
                }
                i++;
            }
        } else if (C()) {
            if (adVarD.g().d || this.L >= adVarD.g().b()) {
                com.applovin.exoplayer2.j.k kVarI = adVarD.i();
                ad adVarE = this.s.e();
                com.applovin.exoplayer2.j.k kVarI2 = adVarE.i();
                if (adVarE.d && adVarE.f28a.c() != -9223372036854775807L) {
                    c(adVarE.b());
                    return;
                }
                for (int i2 = 0; i2 < this.f671a.length; i2++) {
                    boolean zA = kVarI.a(i2);
                    boolean zA2 = kVarI2.a(i2);
                    if (zA && !this.f671a[i2].j()) {
                        boolean z = this.c[i2].a() == -2;
                        at atVar = kVarI.b[i2];
                        at atVar2 = kVarI2.b[i2];
                        if (!zA2 || !atVar2.equals(atVar) || z) {
                            a(this.f671a[i2], adVarE.b());
                        }
                    }
                }
            }
        }
    }

    private void x() throws p {
        ad adVarD = this.s.d();
        if (adVarD == null || this.s.c() == adVarD || adVarD.g || !y()) {
            return;
        }
        H();
    }

    private boolean y() throws p {
        ad adVarD = this.s.d();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        int i = 0;
        boolean z = false;
        while (true) {
            ar[] arVarArr = this.f671a;
            if (i >= arVarArr.length) {
                return !z;
            }
            ar arVar = arVarArr[i];
            if (c(arVar)) {
                boolean z2 = arVar.f() != adVarD.c[i];
                if (!kVarI.a(i) || z2) {
                    if (!arVar.j()) {
                        arVar.a(a(kVarI.c[i]), adVarD.c[i], adVarD.b(), adVarD.a());
                    } else if (arVar.A()) {
                        b(arVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void z() throws p {
        boolean z = false;
        while (B()) {
            if (z) {
                f();
            }
            ad adVarC = this.s.c();
            ad adVarF = this.s.f();
            al alVarA = a(adVarF.f.f29a, adVarF.f.b, adVarF.f.c, adVarF.f.b, true, 0);
            this.x = alVarA;
            a(alVarA.f37a, adVarF.f.f29a, this.x.f37a, adVarC.f.f29a, -9223372036854775807L);
            A();
            l();
            z = true;
        }
    }

    private void A() {
        ad adVarC = this.s.c();
        this.B = adVarC != null && adVarC.f.h && this.A;
    }

    private boolean B() {
        ad adVarC;
        ad adVarG;
        return J() && !this.B && (adVarC = this.s.c()) != null && (adVarG = adVarC.g()) != null && this.L >= adVarG.b() && adVarG.g;
    }

    private boolean C() {
        ad adVarD = this.s.d();
        if (!adVarD.d) {
            return false;
        }
        int i = 0;
        while (true) {
            ar[] arVarArr = this.f671a;
            if (i >= arVarArr.length) {
                return true;
            }
            ar arVar = arVarArr[i];
            com.applovin.exoplayer2.h.x xVar = adVarD.c[i];
            if (arVar.f() != xVar || (xVar != null && !arVar.g() && !a(arVar, adVarD))) {
                break;
            }
            i++;
        }
        return false;
    }

    private boolean a(ar arVar, ad adVar) {
        ad adVarG = adVar.g();
        return adVar.f.f && adVarG.d && ((arVar instanceof com.applovin.exoplayer2.i.m) || arVar.h() >= adVarG.b());
    }

    private void c(long j) {
        for (ar arVar : this.f671a) {
            if (arVar.f() != null) {
                a(arVar, j);
            }
        }
    }

    private void a(ar arVar, long j) {
        arVar.i();
        if (arVar instanceof com.applovin.exoplayer2.i.m) {
            ((com.applovin.exoplayer2.i.m) arVar).c(j);
        }
    }

    private void c(com.applovin.exoplayer2.h.n nVar) throws p {
        if (this.s.a(nVar)) {
            ad adVarB = this.s.b();
            adVarB.a(this.o.d().b, this.x.f37a);
            a(adVarB.h(), adVarB.i());
            if (adVarB == this.s.c()) {
                b(adVarB.f.b);
                H();
                this.x = a(this.x.b, adVarB.f.b, this.x.c, adVarB.f.b, false, 5);
            }
            D();
        }
    }

    private void d(com.applovin.exoplayer2.h.n nVar) {
        if (this.s.a(nVar)) {
            this.s.a(this.L);
            D();
        }
    }

    private void a(am amVar, boolean z) throws p {
        a(amVar, amVar.b, true, z);
    }

    private void a(am amVar, float f2, boolean z, boolean z2) throws p {
        if (z) {
            if (z2) {
                this.y.a(1);
            }
            this.x = this.x.a(amVar);
        }
        a(amVar.b);
        for (ar arVar : this.f671a) {
            if (arVar != null) {
                arVar.a(f2, amVar.b);
            }
        }
    }

    private void D() {
        boolean zE = E();
        this.D = zE;
        if (zE) {
            this.s.b().e(this.L);
        }
        G();
    }

    private boolean E() {
        long jB;
        if (!F()) {
            return false;
        }
        ad adVarB = this.s.b();
        long jD = d(adVarB.e());
        if (adVarB == this.s.c()) {
            jB = adVarB.b(this.L);
        } else {
            jB = adVarB.b(this.L) - adVarB.f.b;
        }
        return this.f.a(jB, jD, this.o.d().b);
    }

    private boolean F() {
        ad adVarB = this.s.b();
        return (adVarB == null || adVarB.e() == Long.MIN_VALUE) ? false : true;
    }

    private void G() {
        ad adVarB = this.s.b();
        boolean z = this.D || (adVarB != null && adVarB.f28a.f());
        if (z != this.x.g) {
            this.x = this.x.a(z);
        }
    }

    private al a(p.a aVar, long j, long j2, long j3, boolean z, int i) {
        com.applovin.exoplayer2.h.ad adVar;
        com.applovin.exoplayer2.j.k kVar;
        List<com.applovin.exoplayer2.g.a> list;
        com.applovin.exoplayer2.h.ad adVarH;
        com.applovin.exoplayer2.j.k kVarI;
        this.N = (!this.N && j == this.x.s && aVar.equals(this.x.b)) ? false : true;
        A();
        com.applovin.exoplayer2.h.ad adVar2 = this.x.h;
        com.applovin.exoplayer2.j.k kVar2 = this.x.i;
        List<com.applovin.exoplayer2.g.a> listG = this.x.j;
        if (this.t.a()) {
            ad adVarC = this.s.c();
            if (adVarC == null) {
                adVarH = com.applovin.exoplayer2.h.ad.f458a;
            } else {
                adVarH = adVarC.h();
            }
            if (adVarC == null) {
                kVarI = this.e;
            } else {
                kVarI = adVarC.i();
            }
            com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> sVarA = a(kVarI.c);
            if (adVarC != null && adVarC.f.c != j2) {
                adVarC.f = adVarC.f.b(j2);
            }
            adVar = adVarH;
            kVar = kVarI;
            list = sVarA;
        } else {
            if (!aVar.equals(this.x.b)) {
                adVar2 = com.applovin.exoplayer2.h.ad.f458a;
                kVar2 = this.e;
                listG = com.applovin.exoplayer2.common.a.s.g();
            }
            adVar = adVar2;
            kVar = kVar2;
            list = listG;
        }
        if (z) {
            this.y.b(i);
        }
        return this.x.a(aVar, j, j2, j3, I(), adVar, kVar, list);
    }

    private com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> a(com.applovin.exoplayer2.j.d[] dVarArr) {
        s.a aVar = new s.a();
        boolean z = false;
        for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
            if (dVar != null) {
                v vVarA = dVar.a(0);
                if (vVarA.j == null) {
                    aVar.a(new com.applovin.exoplayer2.g.a(new a.InterfaceC0030a[0]));
                } else {
                    aVar.a(vVarA.j);
                    z = true;
                }
            }
        }
        return z ? aVar.a() : com.applovin.exoplayer2.common.a.s.g();
    }

    private void H() throws p {
        a(new boolean[this.f671a.length]);
    }

    private void a(boolean[] zArr) throws p {
        ad adVarD = this.s.d();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        for (int i = 0; i < this.f671a.length; i++) {
            if (!kVarI.a(i) && this.b.remove(this.f671a[i])) {
                this.f671a[i].n();
            }
        }
        for (int i2 = 0; i2 < this.f671a.length; i2++) {
            if (kVarI.a(i2)) {
                a(i2, zArr[i2]);
            }
        }
        adVarD.g = true;
    }

    private void a(int i, boolean z) throws p {
        ar arVar = this.f671a[i];
        if (c(arVar)) {
            return;
        }
        ad adVarD = this.s.d();
        boolean z2 = adVarD == this.s.c();
        com.applovin.exoplayer2.j.k kVarI = adVarD.i();
        at atVar = kVarI.b[i];
        v[] vVarArrA = a(kVarI.c[i]);
        boolean z3 = J() && this.x.e == 3;
        boolean z4 = !z && z3;
        this.J++;
        this.b.add(arVar);
        arVar.a(atVar, vVarArrA, adVarD.c[i], this.L, z4, z2, adVarD.b(), adVarD.a());
        arVar.a(11, new ar.a() { // from class: com.applovin.exoplayer2.s.1
            @Override // com.applovin.exoplayer2.ar.a
            public void a(long j) {
                if (j >= AdLoader.RETRY_DELAY) {
                    s.this.H = true;
                }
            }

            @Override // com.applovin.exoplayer2.ar.a
            public void a() {
                s.this.h.c(2);
            }
        });
        this.o.a(arVar);
        if (z3) {
            arVar.e();
        }
    }

    private void h(boolean z) {
        long jD;
        ad adVarB = this.s.b();
        p.a aVar = adVarB == null ? this.x.b : adVarB.f.f29a;
        boolean zEquals = this.x.k.equals(aVar);
        if (!zEquals) {
            this.x = this.x.a(aVar);
        }
        al alVar = this.x;
        if (adVarB == null) {
            jD = alVar.s;
        } else {
            jD = adVarB.d();
        }
        alVar.q = jD;
        this.x.r = I();
        if ((!zEquals || z) && adVarB != null && adVarB.d) {
            a(adVarB.h(), adVarB.i());
        }
    }

    private long I() {
        return d(this.x.q);
    }

    private long d(long j) {
        ad adVarB = this.s.b();
        if (adVarB == null) {
            return 0L;
        }
        return Math.max(0L, j - adVarB.b(this.L));
    }

    private void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.k kVar) {
        this.f.a(this.f671a, adVar, kVar.c);
    }

    private boolean J() {
        return this.x.l && this.x.m == 0;
    }

    private static f a(ba baVar, al alVar, g gVar, af afVar, int i, boolean z, ba.c cVar, ba.a aVar) {
        long j;
        int i2;
        p.a aVar2;
        long jLongValue;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int iB;
        int iB2;
        boolean z5;
        af afVar2;
        long j2;
        boolean z6;
        int iB3;
        boolean z7;
        boolean z8;
        if (baVar.d()) {
            return new f(al.a(), 0L, -9223372036854775807L, false, true, false);
        }
        p.a aVar3 = alVar.b;
        Object obj = aVar3.f471a;
        boolean zA = a(alVar, aVar);
        if (alVar.b.a() || zA) {
            j = alVar.c;
        } else {
            j = alVar.s;
        }
        long j3 = j;
        boolean z9 = false;
        if (gVar != null) {
            i2 = -1;
            Pair<Object, Long> pairA = a(baVar, gVar, true, i, z, cVar, aVar);
            if (pairA == null) {
                iB3 = baVar.b(z);
                jLongValue = j3;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (gVar.c == -9223372036854775807L) {
                    iB3 = baVar.a(pairA.first, aVar).c;
                    jLongValue = j3;
                    z6 = false;
                } else {
                    obj = pairA.first;
                    jLongValue = ((Long) pairA.second).longValue();
                    z6 = true;
                    iB3 = -1;
                }
                z7 = alVar.e == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
            i3 = iB3;
            aVar2 = aVar3;
        } else {
            i2 = -1;
            if (alVar.f37a.d()) {
                iB = baVar.b(z);
            } else if (baVar.c(obj) == -1) {
                Object objA = a(cVar, aVar, i, z, obj, alVar.f37a, baVar);
                if (objA == null) {
                    iB2 = baVar.b(z);
                    z5 = true;
                } else {
                    iB2 = baVar.a(objA, aVar).c;
                    z5 = false;
                }
                i3 = iB2;
                z3 = z5;
                jLongValue = j3;
                aVar2 = aVar3;
                z2 = false;
                z4 = false;
            } else if (j3 == -9223372036854775807L) {
                iB = baVar.a(obj, aVar).c;
            } else if (zA) {
                aVar2 = aVar3;
                alVar.f37a.a(aVar2.f471a, aVar);
                if (alVar.f37a.a(aVar.c, cVar).p == alVar.f37a.c(aVar2.f471a)) {
                    Pair<Object, Long> pairA2 = baVar.a(cVar, aVar, baVar.a(obj, aVar).c, j3 + aVar.c());
                    obj = pairA2.first;
                    jLongValue = ((Long) pairA2.second).longValue();
                } else {
                    jLongValue = j3;
                }
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                aVar2 = aVar3;
                jLongValue = j3;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            i3 = iB;
            jLongValue = j3;
            aVar2 = aVar3;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i3 != i2) {
            Pair<Object, Long> pairA3 = baVar.a(cVar, aVar, i3, -9223372036854775807L);
            obj = pairA3.first;
            jLongValue = ((Long) pairA3.second).longValue();
            afVar2 = afVar;
            j2 = -9223372036854775807L;
        } else {
            afVar2 = afVar;
            j2 = jLongValue;
        }
        p.a aVarA = afVar2.a(baVar, obj, jLongValue);
        boolean z10 = aVarA.e == i2 || (aVar2.e != i2 && aVarA.b >= aVar2.e);
        boolean zEquals = aVar2.f471a.equals(obj);
        boolean z11 = zEquals && !aVar2.a() && !aVarA.a() && z10;
        baVar.a(obj, aVar);
        if (zEquals && !zA && j3 == j2 && ((aVarA.a() && aVar.e(aVarA.b)) || (aVar2.a() && aVar.e(aVar2.b)))) {
            z9 = true;
        }
        if (z11 || z9) {
            aVarA = aVar2;
        }
        if (aVarA.a()) {
            if (aVarA.equals(aVar2)) {
                jLongValue = alVar.s;
            } else {
                baVar.a(aVarA.f471a, aVar);
                jLongValue = aVarA.c == aVar.b(aVarA.b) ? aVar.f() : 0L;
            }
        }
        return new f(aVarA, jLongValue, j2, z2, z3, z4);
    }

    private static boolean a(al alVar, ba.a aVar) {
        p.a aVar2 = alVar.b;
        ba baVar = alVar.f37a;
        return baVar.d() || baVar.a(aVar2.f471a, aVar).f;
    }

    private static boolean a(c cVar, ba baVar, ba baVar2, int i, boolean z, ba.c cVar2, ba.a aVar) {
        if (cVar.d == null) {
            Pair<Object, Long> pairA = a(baVar, new g(cVar.f675a.a(), cVar.f675a.g(), cVar.f675a.f() == Long.MIN_VALUE ? -9223372036854775807L : h.b(cVar.f675a.f())), false, i, z, cVar2, aVar);
            if (pairA == null) {
                return false;
            }
            cVar.a(baVar.c(pairA.first), ((Long) pairA.second).longValue(), pairA.first);
            if (cVar.f675a.f() == Long.MIN_VALUE) {
                a(baVar, cVar, cVar2, aVar);
            }
            return true;
        }
        int iC = baVar.c(cVar.d);
        if (iC == -1) {
            return false;
        }
        if (cVar.f675a.f() == Long.MIN_VALUE) {
            a(baVar, cVar, cVar2, aVar);
            return true;
        }
        cVar.b = iC;
        baVar2.a(cVar.d, aVar);
        if (aVar.f && baVar2.a(aVar.c, cVar2).p == baVar2.c(cVar.d)) {
            Pair<Object, Long> pairA2 = baVar.a(cVar2, aVar, baVar.a(cVar.d, aVar).c, cVar.c + aVar.c());
            cVar.a(baVar.c(pairA2.first), ((Long) pairA2.second).longValue(), pairA2.first);
        }
        return true;
    }

    private static void a(ba baVar, c cVar, ba.c cVar2, ba.a aVar) {
        int i = baVar.a(baVar.a(cVar.d, aVar).c, cVar2).q;
        cVar.a(i, aVar.d != -9223372036854775807L ? aVar.d - 1 : Long.MAX_VALUE, baVar.a(i, aVar, true).b);
    }

    private static Pair<Object, Long> a(ba baVar, g gVar, boolean z, int i, boolean z2, ba.c cVar, ba.a aVar) {
        Pair<Object, Long> pairA;
        Object objA;
        ba baVar2 = gVar.f678a;
        if (baVar.d()) {
            return null;
        }
        ba baVar3 = baVar2.d() ? baVar : baVar2;
        try {
            pairA = baVar3.a(cVar, aVar, gVar.b, gVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (baVar.equals(baVar3)) {
            return pairA;
        }
        if (baVar.c(pairA.first) != -1) {
            return (baVar3.a(pairA.first, aVar).f && baVar3.a(aVar.c, cVar).p == baVar3.c(pairA.first)) ? baVar.a(cVar, aVar, baVar.a(pairA.first, aVar).c, gVar.c) : pairA;
        }
        if (z && (objA = a(cVar, aVar, i, z2, pairA.first, baVar3, baVar)) != null) {
            return baVar.a(cVar, aVar, baVar.a(objA, aVar).c, -9223372036854775807L);
        }
        return null;
    }

    static Object a(ba.c cVar, ba.a aVar, int i, boolean z, Object obj, ba baVar, ba baVar2) {
        int iC = baVar.c(obj);
        int iC2 = baVar.c();
        int iA = iC;
        int iC3 = -1;
        for (int i2 = 0; i2 < iC2 && iC3 == -1; i2++) {
            iA = baVar.a(iA, aVar, cVar, i, z);
            if (iA == -1) {
                break;
            }
            iC3 = baVar2.c(baVar.a(iA));
        }
        if (iC3 == -1) {
            return null;
        }
        return baVar2.a(iC3);
    }

    private static v[] a(com.applovin.exoplayer2.j.d dVar) {
        int iE = dVar != null ? dVar.e() : 0;
        v[] vVarArr = new v[iE];
        for (int i = 0; i < iE; i++) {
            vVarArr[i] = dVar.a(i);
        }
        return vVarArr;
    }

    private static boolean c(ar arVar) {
        return arVar.d_() != 0;
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ba f678a;
        public final int b;
        public final long c;

        public g(ba baVar, int i, long j) {
            this.f678a = baVar;
            this.b = i;
            this.c = j;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f677a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(p.a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f677a = aVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ao f675a;
        public int b;
        public long c;
        public Object d;

        public c(ao aoVar) {
            this.f675a = aoVar;
        }

        public void a(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.d;
            if ((obj == null) != (cVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - cVar.b;
            return i != 0 ? i : com.applovin.exoplayer2.l.ai.a(this.c, cVar.c);
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ah.c> f673a;
        private final com.applovin.exoplayer2.h.z b;
        private final int c;
        private final long d;

        private a(List<ah.c> list, com.applovin.exoplayer2.h.z zVar, int i, long j) {
            this.f673a = list;
            this.b = zVar;
            this.c = i;
            this.d = j;
        }
    }
}
