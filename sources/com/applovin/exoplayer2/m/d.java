package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.applovin.exoplayer2.l.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Surface {
    private static int b;
    private static boolean c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f652a;
    private final a d;
    private boolean e;

    public static synchronized boolean a(Context context) {
        if (!c) {
            b = b(context);
            c = true;
        }
        return b != 0;
    }

    public static d a(Context context, boolean z) {
        com.applovin.exoplayer2.l.a.b(!z || a(context));
        return new a().a(z ? b : 0);
    }

    private d(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = aVar;
        this.f652a = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                this.d.a();
                this.e = true;
            }
        }
    }

    private static int b(Context context) {
        if (com.applovin.exoplayer2.l.n.a(context)) {
            return com.applovin.exoplayer2.l.n.a() ? 1 : 2;
        }
        return 0;
    }

    private static class a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.l.j f653a;
        private Handler b;
        private Error c;
        private RuntimeException d;
        private d e;

        public a() {
            super("ExoPlayer:DummySurface");
        }

        public d a(int i) {
            boolean z;
            start();
            this.b = new Handler(getLooper(), this);
            this.f653a = new com.applovin.exoplayer2.l.j(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.e == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.c;
            if (error != null) {
                throw error;
            }
            return (d) com.applovin.exoplayer2.l.a.b(this.e);
        }

        public void a() {
            com.applovin.exoplayer2.l.a.b(this.b);
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    q.c("DummySurface", "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    q.c("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b(int i) {
            com.applovin.exoplayer2.l.a.b(this.f653a);
            this.f653a.a(i);
            this.e = new d(this, this.f653a.b(), i != 0);
        }

        private void b() {
            com.applovin.exoplayer2.l.a.b(this.f653a);
            this.f653a.a();
        }
    }
}
