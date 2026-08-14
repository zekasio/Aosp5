package com.tapjoy.internal;

import androidx.work.PeriodicWorkRequest;
import com.loopj.android.http.AsyncHttpClient;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class w6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f1936a;
    public final Object b;
    public final Thread c;
    public q1 d;
    public boolean e;

    public w6(File file) {
        l7 l7Var = new l7(file);
        this.f1936a = l7Var;
        this.b = l7Var;
        Integer.valueOf(l7Var.c());
        Thread thread = new Thread(this, "5Rocks");
        this.c = thread;
        thread.start();
    }

    public final void a(long j) {
        if (j > 0) {
            synchronized (this.b) {
                this.e = false;
                Long.valueOf(j);
                this.b.wait(j);
            }
            return;
        }
        synchronized (this.b) {
            this.e = false;
            if (this.d == null || this.f1936a.a()) {
                this.b.wait();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 1;
        while (true) {
            long j = 0;
            while (this.d != null && this.f1936a.c() > 0 && j <= 0) {
                try {
                    if (this.f1936a.c() > 10000) {
                        l7 l7Var = this.f1936a;
                        l7Var.b(l7Var.c() - AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
                    }
                    w4 w4VarC = this.f1936a.c(0);
                    if (w4VarC == null) {
                        break;
                    }
                    i5 i5Var = w4VarC.l;
                    if (i5Var != null && i5Var.q == null) {
                        n7.f.await(3L, TimeUnit.SECONDS);
                    }
                    if (!p.f1877a) {
                        n7.b.await(3L, TimeUnit.SECONDS);
                    }
                    long jMin = (this.e || w4VarC.c == z4.APP || this.f1936a.c() >= 100 || w4VarC.e.longValue() > System.currentTimeMillis()) ? 0L : Math.min(Math.max((w4VarC.e.longValue() + 60000) - System.currentTimeMillis(), 0L), 60000L);
                    if (jMin <= 0) {
                        l8 l8Var = new l8();
                        l8Var.a(w4VarC);
                        for (int i2 = 1; i2 < 100 && i2 < this.f1936a.c(); i2++) {
                            w4 w4VarC2 = this.f1936a.c(i2);
                            if (w4VarC2 == null || !l8Var.a(w4VarC2)) {
                                break;
                            }
                        }
                        i++;
                        try {
                            Integer.valueOf(l8Var.e());
                            Integer.valueOf(i);
                            ((r1) this.d).a(l8Var);
                            this.f1936a.b(l8Var.e());
                        } catch (Exception unused) {
                        }
                        try {
                            Integer.valueOf(l8Var.e());
                            j = jMin;
                            i = 0;
                        } catch (Exception unused2) {
                            i = 0;
                            Integer.valueOf(l8Var.e());
                            j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                        }
                    } else {
                        j = jMin;
                    }
                } catch (InterruptedException | Exception unused3) {
                    return;
                }
            }
            this.f1936a.flush();
            a(j);
        }
    }

    public final void a(boolean z) {
        synchronized (this.b) {
            this.e = z;
            this.b.notify();
        }
    }

    public void a() {
        if (this.d == null || this.f1936a.a()) {
            return;
        }
        a(true);
    }

    public void a(w4 w4Var) {
        try {
            this.f1936a.a(w4Var);
            if (this.d != null) {
                if (!a.b && w4Var.c == z4.CUSTOM) {
                    a(false);
                    return;
                } else {
                    a(true);
                    return;
                }
            }
            this.f1936a.flush();
        } catch (Exception unused) {
        }
    }
}
