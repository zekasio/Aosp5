package com.applovin.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ay;
import com.applovin.exoplayer2.b;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.c;
import com.applovin.exoplayer2.k;
import com.applovin.exoplayer2.m.a.i;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.q;
import com.loopj.android.http.AsyncHttpClient;
import com.vungle.warren.AdLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class aw extends d implements q {
    private int A;
    private int B;
    private com.applovin.exoplayer2.c.e C;
    private com.applovin.exoplayer2.c.e D;
    private int E;
    private com.applovin.exoplayer2.b.d F;
    private float G;
    private boolean H;
    private List<com.applovin.exoplayer2.i.a> I;
    private boolean J;
    private boolean K;
    private com.applovin.exoplayer2.l.aa L;
    private boolean M;
    private boolean N;
    private o O;
    private com.applovin.exoplayer2.m.o P;
    protected final ar[] b;
    private final com.applovin.exoplayer2.l.g c;
    private final Context d;
    private final r e;
    private final b f;
    private final c g;
    private final CopyOnWriteArraySet<an.d> h;
    private final com.applovin.exoplayer2.a.a i;
    private final com.applovin.exoplayer2.b j;
    private final com.applovin.exoplayer2.c k;
    private final ay l;
    private final bb m;
    private final bc n;
    private final long o;
    private v p;
    private v q;
    private AudioTrack r;
    private Object s;
    private Surface t;
    private SurfaceHolder u;
    private com.applovin.exoplayer2.m.a.i v;
    private boolean w;
    private TextureView x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    @Deprecated
    public static final class a {
        private boolean A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f46a;
        private final au b;
        private com.applovin.exoplayer2.l.d c;
        private long d;
        private com.applovin.exoplayer2.j.j e;
        private com.applovin.exoplayer2.h.r f;
        private aa g;
        private com.applovin.exoplayer2.k.d h;
        private com.applovin.exoplayer2.a.a i;
        private Looper j;
        private com.applovin.exoplayer2.l.aa k;
        private com.applovin.exoplayer2.b.d l;
        private boolean m;
        private int n;
        private boolean o;
        private boolean p;
        private int q;
        private int r;
        private boolean s;
        private av t;
        private long u;
        private long v;
        private z w;
        private long x;
        private long y;
        private boolean z;

        @Deprecated
        public a(Context context) {
            this(context, new n(context), new com.applovin.exoplayer2.e.f());
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.e.l lVar) {
            this(context, auVar, new com.applovin.exoplayer2.j.c(context), new com.applovin.exoplayer2.h.f(context, lVar), new l(), com.applovin.exoplayer2.k.n.a(context), new com.applovin.exoplayer2.a.a(com.applovin.exoplayer2.l.d.f613a));
        }

        @Deprecated
        public a(Context context, au auVar, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar) {
            this.f46a = context;
            this.b = auVar;
            this.e = jVar;
            this.f = rVar;
            this.g = aaVar;
            this.h = dVar;
            this.i = aVar;
            this.j = com.applovin.exoplayer2.l.ai.c();
            this.l = com.applovin.exoplayer2.b.d.f61a;
            this.n = 0;
            this.q = 1;
            this.r = 0;
            this.s = true;
            this.t = av.e;
            this.u = 5000L;
            this.v = 15000L;
            this.w = new k.a().a();
            this.c = com.applovin.exoplayer2.l.d.f613a;
            this.x = 500L;
            this.y = AdLoader.RETRY_DELAY;
        }

        @Deprecated
        public aw a() {
            com.applovin.exoplayer2.l.a.b(!this.A);
            this.A = true;
            return new aw(this);
        }
    }

    protected aw(a aVar) throws Throwable {
        aw awVar;
        com.applovin.exoplayer2.l.g gVar = new com.applovin.exoplayer2.l.g();
        this.c = gVar;
        try {
            Context applicationContext = aVar.f46a.getApplicationContext();
            this.d = applicationContext;
            com.applovin.exoplayer2.a.a aVar2 = aVar.i;
            this.i = aVar2;
            this.L = aVar.k;
            this.F = aVar.l;
            this.y = aVar.q;
            this.z = aVar.r;
            this.H = aVar.p;
            this.o = aVar.y;
            b bVar = new b();
            this.f = bVar;
            c cVar = new c();
            this.g = cVar;
            this.h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(aVar.j);
            ar[] arVarArrA = aVar.b.a(handler, bVar, bVar, bVar, bVar);
            this.b = arVarArrA;
            this.G = 1.0f;
            if (com.applovin.exoplayer2.l.ai.f611a < 21) {
                this.E = d(0);
            } else {
                this.E = h.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            try {
                r rVar = new r(arVarArrA, aVar.e, aVar.f, aVar.g, aVar.h, aVar2, aVar.s, aVar.t, aVar.u, aVar.v, aVar.w, aVar.x, aVar.z, aVar.c, aVar.j, this, new an.a.C0009a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                awVar = this;
                try {
                    awVar.e = rVar;
                    rVar.a((an.b) bVar);
                    rVar.a((q.a) bVar);
                    if (aVar.d > 0) {
                        rVar.b(aVar.d);
                    }
                    com.applovin.exoplayer2.b bVar2 = new com.applovin.exoplayer2.b(aVar.f46a, handler, bVar);
                    awVar.j = bVar2;
                    bVar2.a(aVar.o);
                    com.applovin.exoplayer2.c cVar2 = new com.applovin.exoplayer2.c(aVar.f46a, handler, bVar);
                    awVar.k = cVar2;
                    cVar2.a(aVar.m ? awVar.F : null);
                    ay ayVar = new ay(aVar.f46a, handler, bVar);
                    awVar.l = ayVar;
                    ayVar.a(com.applovin.exoplayer2.l.ai.g(awVar.F.d));
                    bb bbVar = new bb(aVar.f46a);
                    awVar.m = bbVar;
                    bbVar.a(aVar.n != 0);
                    bc bcVar = new bc(aVar.f46a);
                    awVar.n = bcVar;
                    bcVar.a(aVar.n == 2);
                    awVar.O = b(ayVar);
                    awVar.P = com.applovin.exoplayer2.m.o.f666a;
                    awVar.a(1, 10, Integer.valueOf(awVar.E));
                    awVar.a(2, 10, Integer.valueOf(awVar.E));
                    awVar.a(1, 3, awVar.F);
                    awVar.a(2, 4, Integer.valueOf(awVar.y));
                    awVar.a(2, 5, Integer.valueOf(awVar.z));
                    awVar.a(1, 9, Boolean.valueOf(awVar.H));
                    awVar.a(2, 7, cVar);
                    awVar.a(6, 8, cVar);
                    gVar.a();
                } catch (Throwable th) {
                    th = th;
                    awVar.c.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                awVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            awVar = this;
        }
    }

    public boolean q() {
        Z();
        return this.e.q();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return this.P;
    }

    public void v() {
        Z();
        U();
        a((Object) null);
        a(0, 0);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            v();
            return;
        }
        U();
        this.w = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a((Object) null);
            a(0, 0);
        }
    }

    public void b(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.u) {
            return;
        }
        v();
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof com.applovin.exoplayer2.m.k) {
            U();
            a((Object) surfaceView);
            c(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof com.applovin.exoplayer2.m.a.i) {
                U();
                this.v = (com.applovin.exoplayer2.m.a.i) surfaceView;
                this.e.a(this.g).a(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT).a(this.v).i();
                this.v.a(this.f);
                a(this.v.getVideoSurface());
                c(surfaceView.getHolder());
                return;
            }
            a(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
        Z();
        b(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            v();
            return;
        }
        U();
        this.x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.x) {
            return;
        }
        v();
    }

    public void a(float f) {
        Z();
        float fA = com.applovin.exoplayer2.l.ai.a(f, 0.0f, 1.0f);
        if (this.G == fA) {
            return;
        }
        this.G = fA;
        W();
        this.i.a(fA);
        Iterator<an.d> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(fA);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public List<com.applovin.exoplayer2.i.a> V() {
        Z();
        return this.I;
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.e.r();
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.h.add(dVar);
        a((an.b) dVar);
    }

    @Deprecated
    public void a(an.b bVar) {
        com.applovin.exoplayer2.l.a.b(bVar);
        this.e.a(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.h.remove(dVar);
        b((an.b) dVar);
    }

    @Deprecated
    public void b(an.b bVar) {
        this.e.b(bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        Z();
        return this.e.t();
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        Z();
        return this.e.u();
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p e() {
        Z();
        return this.e.e();
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        Z();
        return this.e.s();
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        Z();
        boolean zX = x();
        int iA = this.k.a(zX, 2);
        a(zX, iA, b(zX, iA));
        this.e.w();
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        Z();
        this.e.a(pVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z) {
        Z();
        int iA = this.k.a(z, t());
        a(z, iA, b(z, iA));
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        Z();
        return this.e.x();
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        Z();
        return this.e.y();
    }

    @Override // com.applovin.exoplayer2.an
    public void c(int i) {
        Z();
        this.e.c(i);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(boolean z) {
        Z();
        this.e.b(z);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        Z();
        return this.e.z();
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i, long j) {
        Z();
        this.i.d();
        this.e.a(i, j);
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        Z();
        return this.e.A();
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        Z();
        return this.e.B();
    }

    @Override // com.applovin.exoplayer2.an
    public long C() {
        Z();
        return this.e.C();
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        Z();
        return this.e.D();
    }

    public void E() {
        AudioTrack audioTrack;
        Z();
        if (com.applovin.exoplayer2.l.ai.f611a < 21 && (audioTrack = this.r) != null) {
            audioTrack.release();
            this.r = null;
        }
        this.j.a(false);
        this.l.c();
        this.m.b(false);
        this.n.b(false);
        this.k.b();
        this.e.E();
        this.i.c();
        U();
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        if (this.M) {
            ((com.applovin.exoplayer2.l.aa) com.applovin.exoplayer2.l.a.b(this.L)).b(0);
            this.M = false;
        }
        this.I = Collections.emptyList();
        this.N = true;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        Z();
        return this.e.P();
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        Z();
        return this.e.Q();
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.e.R();
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        Z();
        return this.e.S();
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        Z();
        return this.e.F();
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        Z();
        return this.e.G();
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        Z();
        return this.e.H();
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        Z();
        return this.e.I();
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        Z();
        return this.e.J();
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        Z();
        return this.e.K();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        Z();
        return this.e.L();
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        Z();
        return this.e.M();
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        Z();
        return this.e.N();
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        Z();
        return this.e.O();
    }

    private void U() {
        if (this.v != null) {
            this.e.a(this.g).a(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT).a((Object) null).i();
            this.v.b(this.f);
            this.v = null;
        }
        TextureView textureView = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f) {
                com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.x.setSurfaceTextureListener(null);
            }
            this.x = null;
        }
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ar[] arVarArr = this.b;
        int length = arVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            ar arVar = arVarArr[i];
            if (arVar.a() == 2) {
                arrayList.add(this.e.a(arVar).a(1).a(obj).i());
            }
            i++;
        }
        Object obj2 = this.s;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ao) it.next()).a(this.o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.s;
            Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
        if (z) {
            this.e.a(false, p.a(new u(3), 1003));
        }
    }

    private void c(SurfaceHolder surfaceHolder) {
        this.w = false;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = this.u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        if (i == this.A && i2 == this.B) {
            return;
        }
        this.A = i;
        this.B = i2;
        this.i.a(i, i2);
        Iterator<an.d> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        a(1, 2, Float.valueOf(this.G * this.k.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.i.a_(this.H);
        Iterator<an.d> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a_(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.e.a(z2, i3, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int iT = t();
        if (iT != 1) {
            if (iT == 2 || iT == 3) {
                this.m.b(x() && !q());
                this.n.b(x());
                return;
            } else if (iT != 4) {
                throw new IllegalStateException();
            }
        }
        this.m.b(false);
        this.n.b(false);
    }

    private void Z() {
        this.c.d();
        if (Thread.currentThread() != r().getThread()) {
            String strA = com.applovin.exoplayer2.l.ai.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (this.J) {
                throw new IllegalStateException(strA);
            }
            com.applovin.exoplayer2.l.q.b("SimpleExoPlayer", strA, this.K ? null : new IllegalStateException());
            this.K = true;
        }
    }

    private void a(int i, int i2, Object obj) {
        for (ar arVar : this.b) {
            if (arVar.a() == i) {
                this.e.a(arVar).a(i2).a(obj).i();
            }
        }
    }

    private int d(int i) {
        AudioTrack audioTrack = this.r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.r.release();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.r.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(ay ayVar) {
        return new o(0, ayVar.a(), ayVar.b());
    }

    private final class b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, an.b, ay.a, b.InterfaceC0010b, com.applovin.exoplayer2.b.g, c.b, com.applovin.exoplayer2.g.e, com.applovin.exoplayer2.i.l, i.a, com.applovin.exoplayer2.m.n, q.a {
        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ab abVar, int i) {
            an.b.CC.$default$a(this, abVar, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ac acVar) {
            an.b.CC.$default$a(this, acVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ak akVar) {
            an.b.CC.$default$a(this, akVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(am amVar) {
            an.b.CC.$default$a(this, amVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.a aVar) {
            an.b.CC.$default$a(this, aVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.b.CC.$default$a(this, eVar, eVar2, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.b.CC.$default$a(this, anVar, cVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ba baVar, int i) {
            an.b.CC.$default$a(this, baVar, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an.b.CC.$default$a(this, adVar, hVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public /* synthetic */ void a(v vVar) {
            g.CC.$default$a(this, vVar);
        }

        @Override // com.applovin.exoplayer2.q.a
        public /* synthetic */ void a(boolean z) {
            q.a.CC.$default$a(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.exoplayer2.m.n
        public /* synthetic */ void a_(v vVar) {
            n.CC.$default$a_(this, vVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(ak akVar) {
            an.b.CC.$default$b(this, akVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(int i) {
            an.b.CC.$default$c(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(int i) {
            an.b.CC.$default$d(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(boolean z) {
            an.b.CC.$default$d(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(boolean z) {
            an.b.CC.$default$e(this, z);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private b() {
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.c.e eVar) {
            aw.this.C = eVar;
            aw.this.i.a(eVar);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str, long j, long j2) {
            aw.this.i.a(str, j, j2);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.p = vVar;
            aw.this.i.a(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(int i, long j) {
            aw.this.i.a(i, j);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.m.o oVar) {
            aw.this.P = oVar;
            aw.this.i.a(oVar);
            Iterator it = aw.this.h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVar);
            }
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Object obj, long j) {
            aw.this.i.a(obj, j);
            if (aw.this.s == obj) {
                Iterator it = aw.this.h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a();
                }
            }
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(String str) {
            aw.this.i.a(str);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void b(com.applovin.exoplayer2.c.e eVar) {
            aw.this.i.b(eVar);
            aw.this.p = null;
            aw.this.C = null;
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(long j, int i) {
            aw.this.i.a(j, i);
        }

        @Override // com.applovin.exoplayer2.m.n
        public void a(Exception exc) {
            aw.this.i.a(exc);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(com.applovin.exoplayer2.c.e eVar) {
            aw.this.D = eVar;
            aw.this.i.c(eVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str, long j, long j2) {
            aw.this.i.b(str, j, j2);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            aw.this.q = vVar;
            aw.this.i.b(vVar, hVar);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(long j) {
            aw.this.i.a(j);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a(int i, long j, long j2) {
            aw.this.i.a(i, j, j2);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(String str) {
            aw.this.i.b(str);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void d(com.applovin.exoplayer2.c.e eVar) {
            aw.this.i.d(eVar);
            aw.this.q = null;
            aw.this.D = null;
        }

        @Override // com.applovin.exoplayer2.b.g
        public void a_(boolean z) {
            if (aw.this.H == z) {
                return;
            }
            aw.this.H = z;
            aw.this.X();
        }

        @Override // com.applovin.exoplayer2.b.g
        public void b(Exception exc) {
            aw.this.i.b(exc);
        }

        @Override // com.applovin.exoplayer2.b.g
        public void c(Exception exc) {
            aw.this.i.c(exc);
        }

        @Override // com.applovin.exoplayer2.i.l
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            aw.this.I = list;
            Iterator it = aw.this.h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(list);
            }
        }

        @Override // com.applovin.exoplayer2.g.e
        public void a(com.applovin.exoplayer2.g.a aVar) {
            aw.this.i.a(aVar);
            aw.this.e.a(aVar);
            Iterator it = aw.this.h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(aVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (aw.this.w) {
                aw.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            aw.this.a(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (aw.this.w) {
                aw.this.a((Object) null);
            }
            aw.this.a(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            aw.this.a(surfaceTexture);
            aw.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            aw.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            aw.this.a((Object) null);
            aw.this.a(0, 0);
            return true;
        }

        @Override // com.applovin.exoplayer2.m.a.i.a
        public void a(Surface surface) {
            aw.this.a((Object) null);
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(float f) {
            aw.this.W();
        }

        @Override // com.applovin.exoplayer2.c.b
        public void a(int i) {
            boolean zX = aw.this.x();
            aw.this.a(zX, i, aw.b(zX, i));
        }

        @Override // com.applovin.exoplayer2.b.InterfaceC0010b
        public void a() {
            aw.this.a(false, -1, 3);
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void f(int i) {
            o oVarB = aw.b(aw.this.l);
            if (oVarB.equals(aw.this.O)) {
                return;
            }
            aw.this.O = oVarB;
            Iterator it = aw.this.h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVarB);
            }
        }

        @Override // com.applovin.exoplayer2.ay.a
        public void a(int i, boolean z) {
            Iterator it = aw.this.h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(i, z);
            }
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b_(boolean z) {
            if (aw.this.L != null) {
                if (!z || aw.this.M) {
                    if (z || !aw.this.M) {
                        return;
                    }
                    aw.this.L.b(0);
                    aw.this.M = false;
                    return;
                }
                aw.this.L.a(0);
                aw.this.M = true;
            }
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(boolean z, int i) {
            aw.this.Y();
        }

        @Override // com.applovin.exoplayer2.q.a
        public void b(boolean z) {
            aw.this.Y();
        }
    }

    private static final class c implements ao.b, com.applovin.exoplayer2.m.a.a, com.applovin.exoplayer2.m.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f48a;
        private com.applovin.exoplayer2.m.a.a b;
        private com.applovin.exoplayer2.m.l c;
        private com.applovin.exoplayer2.m.a.a d;

        private c() {
        }

        @Override // com.applovin.exoplayer2.ao.b
        public void a(int i, Object obj) {
            if (i == 7) {
                this.f48a = (com.applovin.exoplayer2.m.l) obj;
                return;
            }
            if (i == 8) {
                this.b = (com.applovin.exoplayer2.m.a.a) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            com.applovin.exoplayer2.m.a.i iVar = (com.applovin.exoplayer2.m.a.i) obj;
            if (iVar == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = iVar.getVideoFrameMetadataListener();
                this.d = iVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.exoplayer2.m.l
        public void a(long j, long j2, v vVar, MediaFormat mediaFormat) {
            com.applovin.exoplayer2.m.l lVar = this.c;
            if (lVar != null) {
                lVar.a(j, j2, vVar, mediaFormat);
            }
            com.applovin.exoplayer2.m.l lVar2 = this.f48a;
            if (lVar2 != null) {
                lVar2.a(j, j2, vVar, mediaFormat);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a(long j, float[] fArr) {
            com.applovin.exoplayer2.m.a.a aVar = this.d;
            if (aVar != null) {
                aVar.a(j, fArr);
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a(j, fArr);
            }
        }

        @Override // com.applovin.exoplayer2.m.a.a
        public void a() {
            com.applovin.exoplayer2.m.a.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }
}
