package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.y;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f1496a;
    private Timer b;
    private long c;
    private long d;
    private final Runnable e;
    private long f;
    private final Object g = new Object();

    public static p a(long j, com.applovin.impl.sdk.p pVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        p pVar2 = new p(pVar, runnable);
        pVar2.c = System.currentTimeMillis();
        pVar2.d = j;
        try {
            Timer timer = new Timer();
            pVar2.b = timer;
            timer.schedule(pVar2.e(), j);
        } catch (OutOfMemoryError e) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("Timer", "Failed to create timer due to OOM error", e);
            }
        }
        return pVar2;
    }

    private p(com.applovin.impl.sdk.p pVar, Runnable runnable) {
        this.f1496a = pVar;
        this.e = runnable;
    }

    public long a() {
        if (this.b != null) {
            return this.d - (System.currentTimeMillis() - this.c);
        }
        return this.d - this.f;
    }

    public void b() {
        synchronized (this.g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f = Math.max(1L, System.currentTimeMillis() - this.c);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public void c() {
        synchronized (this.g) {
            long j = this.f;
            if (j > 0) {
                try {
                    long j2 = this.d - j;
                    this.d = j2;
                    if (j2 < 0) {
                        this.d = 0L;
                    }
                    Timer timer = new Timer();
                    this.b = timer;
                    timer.schedule(e(), this.d);
                    this.c = System.currentTimeMillis();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public void d() {
        synchronized (this.g) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.p pVar = this.f1496a;
                        if (pVar != null) {
                            pVar.L();
                            if (y.a()) {
                                this.f1496a.L();
                                if (y.a()) {
                                    this.f1496a.L().b("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.f = 0L;
                        throw th2;
                    }
                }
                this.f = 0L;
            }
        }
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.p.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    p.this.e.run();
                    synchronized (p.this.g) {
                        p.this.b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (p.this.f1496a != null) {
                            p.this.f1496a.L();
                            if (y.a()) {
                                p.this.f1496a.L();
                                if (y.a()) {
                                    p.this.f1496a.L().b("Timer", "Encountered error while executing timed task", th);
                                }
                            }
                        }
                        synchronized (p.this.g) {
                            p.this.b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (p.this.g) {
                            p.this.b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }
}
