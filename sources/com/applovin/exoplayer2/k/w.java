package com.applovin.exoplayer2.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f596a = a(false, -9223372036854775807L);
    public static final b b = a(true, -9223372036854775807L);
    public static final b c;
    public static final b d;
    private final ExecutorService e;
    private c<? extends d> f;
    private IOException g;

    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public interface d {
        void a();

        void b() throws IOException;
    }

    public interface e {
        void h();
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        c = new b(2, j);
        d = new b(3, j);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f597a;
        private final long b;

        private b(int i, long j) {
            this.f597a = i;
            this.b = j;
        }

        public boolean a() {
            int i = this.f597a;
            return i == 0 || i == 1;
        }
    }

    public w(String str) {
        this.e = ai.a("ExoPlayer:Loader:" + str);
    }

    public static b a(boolean z, long j) {
        return new b(z ? 1 : 0, j);
    }

    public boolean a() {
        return this.g != null;
    }

    public void b() {
        this.g = null;
    }

    public <T extends d> long a(T t, a<T> aVar, int i) {
        Looper looper = (Looper) com.applovin.exoplayer2.l.a.a(Looper.myLooper());
        this.g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new c(looper, t, aVar, i, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public boolean c() {
        return this.f != null;
    }

    public void d() {
        ((c) com.applovin.exoplayer2.l.a.a(this.f)).a(false);
    }

    public void a(e eVar) {
        c<? extends d> cVar = this.f;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.e.execute(new f(eVar));
        }
        this.e.shutdown();
    }

    public void a(int i) throws IOException {
        IOException iOException = this.g;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f;
        if (cVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = cVar.f598a;
            }
            cVar.a(i);
        }
    }

    private final class c<T extends d> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f598a;
        private final T c;
        private final long d;
        private a<T> e;
        private IOException f;
        private int g;
        private Thread h;
        private boolean i;
        private volatile boolean j;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.c = t;
            this.e = aVar;
            this.f598a = i;
            this.d = j;
        }

        public void a(int i) throws IOException {
            IOException iOException = this.f;
            if (iOException != null && this.g > i) {
                throw iOException;
            }
        }

        public void a(long j) {
            com.applovin.exoplayer2.l.a.b(w.this.f == null);
            w.this.f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }

        public void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.i = true;
                    this.c.a();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((a) com.applovin.exoplayer2.l.a.b(this.e)).a(this.c, jElapsedRealtime, jElapsedRealtime - this.d, true);
                this.e = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.i;
                    this.h = Thread.currentThread();
                }
                if (!z) {
                    ah.a("load:" + this.c.getClass().getSimpleName());
                    try {
                        this.c.b();
                        ah.a();
                    } catch (Throwable th) {
                        ah.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                }
                if (this.j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.j) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.j) {
                    return;
                }
                com.applovin.exoplayer2.l.q.c("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(2, new g(e2)).sendToTarget();
            } catch (Error e3) {
                if (!this.j) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.j) {
                    return;
                }
                com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new g(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long jC;
            if (this.j) {
                return;
            }
            if (message.what == 0) {
                a();
                return;
            }
            if (message.what == 3) {
                throw ((Error) message.obj);
            }
            b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.d;
            a aVar = (a) com.applovin.exoplayer2.l.a.b(this.e);
            if (this.i) {
                aVar.a(this.c, jElapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    aVar.a(this.c, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception handling load completed", e);
                    w.this.g = new g(e);
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f = iOException;
            int i2 = this.g + 1;
            this.g = i2;
            b bVarA = aVar.a(this.c, jElapsedRealtime, j, iOException, i2);
            if (bVarA.f597a != 3) {
                if (bVarA.f597a != 2) {
                    if (bVarA.f597a == 1) {
                        this.g = 1;
                    }
                    if (bVarA.b != -9223372036854775807L) {
                        jC = bVarA.b;
                    } else {
                        jC = c();
                    }
                    a(jC);
                    return;
                }
                return;
            }
            w.this.g = this.f;
        }

        private void a() {
            this.f = null;
            w.this.e.execute((Runnable) com.applovin.exoplayer2.l.a.b(w.this.f));
        }

        private void b() {
            w.this.f = null;
        }

        private long c() {
            return Math.min((this.g - 1) * 1000, 5000);
        }
    }

    private static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f599a;

        public f(e eVar) {
            this.f599a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f599a.h();
        }
    }
}
