package com.applovin.exoplayer2.m;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.m.e f661a = new com.applovin.exoplayer2.m.e();
    private final b b;
    private final e c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void onDefaultDisplayChanged(Display display);
        }

        void a();

        void a(a aVar);
    }

    public m(Context context) {
        b bVarA = a(context);
        this.b = bVarA;
        this.c = bVarA != null ? e.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public void a(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        a(true);
    }

    public void a() {
        if (this.b != null) {
            ((e) com.applovin.exoplayer2.l.a.b(this.c)).b();
            this.b.a(new b.a() { // from class: com.applovin.exoplayer2.m.m$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.m.m.b.a
                public final void onDefaultDisplayChanged(Display display) {
                    this.f$0.a(display);
                }
            });
        }
    }

    public void b() {
        this.d = true;
        f();
        a(false);
    }

    public void a(Surface surface) {
        if (surface instanceof com.applovin.exoplayer2.m.d) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        h();
        this.e = surface;
        a(true);
    }

    public void c() {
        f();
    }

    public void a(float f) {
        this.i = f;
        f();
        a(false);
    }

    public void b(float f) {
        this.f = f;
        this.f661a.a();
        g();
    }

    public void a(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.f661a.a(j * 1000);
        g();
    }

    public void d() {
        this.d = false;
        h();
    }

    public void e() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            ((e) com.applovin.exoplayer2.l.a.b(this.c)).c();
        }
    }

    public long b(long j) {
        long j2;
        if (this.p == -1 || !this.f661a.b()) {
            j2 = j;
        } else {
            long jE = this.q + ((long) ((this.f661a.e() * (this.m - this.p)) / this.i));
            if (a(j, jE)) {
                j2 = jE;
            } else {
                f();
                j2 = j;
            }
        }
        this.n = this.m;
        this.o = j2;
        e eVar = this.c;
        if (eVar == null || this.k == -9223372036854775807L) {
            return j2;
        }
        long j3 = eVar.f664a;
        return j3 == -9223372036854775807L ? j2 : a(j2, j3, this.k) - this.l;
    }

    private void f() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    private static boolean a(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void g() {
        if (ai.f611a < 30 || this.e == null) {
            return;
        }
        float f = this.f661a.b() ? this.f661a.f() : this.f;
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            if (Math.abs(f - this.g) < ((!this.f661a.b() || this.f661a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (f == -1.0f && this.f661a.c() < 30) {
            return;
        }
        this.g = f;
        a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r4) {
        /*
            r3 = this;
            int r0 = com.applovin.exoplayer2.l.ai.f611a
            r1 = 30
            if (r0 < r1) goto L31
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L31
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L31
        L11:
            boolean r1 = r3.d
            if (r1 == 0) goto L22
            float r1 = r3.g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L22
            float r2 = r3.i
            float r1 = r1 * r2
            goto L23
        L22:
            r1 = 0
        L23:
            if (r4 != 0) goto L2c
            float r4 = r3.h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2c
            return
        L2c:
            r3.h = r1
            com.applovin.exoplayer2.m.m.a.a(r0, r1)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.m.a(boolean):void");
    }

    private void h() {
        Surface surface;
        if (ai.f611a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.k = j;
            this.l = (j * 80) / 100;
            return;
        }
        q.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b bVarA = ai.f611a >= 17 ? d.a(applicationContext) : null;
        return bVarA == null ? c.a(applicationContext) : bVarA;
    }

    private static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                q.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    private static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f662a;

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        private c(WindowManager windowManager) {
            this.f662a = windowManager;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f662a.getDefaultDisplay());
        }
    }

    private static final class d implements DisplayManager.DisplayListener, b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f663a;
        private b.a b;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(TJAdUnitConstants.String.DISPLAY);
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private d(DisplayManager displayManager) {
            this.f663a = displayManager;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            this.b = aVar;
            this.f663a.registerDisplayListener(this, ai.a());
            aVar.onDefaultDisplayChanged(b());
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
            this.f663a.unregisterDisplayListener(this);
            this.b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            b.a aVar = this.b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.onDefaultDisplayChanged(b());
        }

        private Display b() {
            return this.f663a.getDisplay(0);
        }
    }

    private static final class e implements Handler.Callback, Choreographer.FrameCallback {
        private static final e b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f664a = -9223372036854775807L;
        private final Handler c;
        private final HandlerThread d;
        private Choreographer e;
        private int f;

        public static e a() {
            return b;
        }

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.d = handlerThread;
            handlerThread.start();
            Handler handlerA = ai.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.c = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        public void b() {
            this.c.sendEmptyMessage(1);
        }

        public void c() {
            this.c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f664a = j;
            ((Choreographer) com.applovin.exoplayer2.l.a.b(this.e)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                d();
                return true;
            }
            if (i == 1) {
                e();
                return true;
            }
            if (i != 2) {
                return false;
            }
            f();
            return true;
        }

        private void d() {
            this.e = Choreographer.getInstance();
        }

        private void e() {
            int i = this.f + 1;
            this.f = i;
            if (i == 1) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.e)).postFrameCallback(this);
            }
        }

        private void f() {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.e)).removeFrameCallback(this);
                this.f664a = -9223372036854775807L;
            }
        }
    }
}
