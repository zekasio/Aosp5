package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import com.vungle.warren.AdLoader;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f1301a = Executors.newFixedThreadPool(4);
    private final com.applovin.impl.sdk.p b;
    private final com.applovin.impl.sdk.y c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;
    private final List<c> f = new ArrayList(5);
    private final Object g = new Object();
    private boolean h;

    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_NATIVE,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_APP_OPEN,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    public o(com.applovin.impl.sdk.p pVar) {
        this.b = pVar;
        this.c = pVar.L();
        this.d = a("auxiliary_operations", ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cs)).intValue());
        this.e = a("shared_thread_pool", ((Integer) pVar.a(com.applovin.impl.sdk.c.b.as)).intValue());
    }

    public boolean a() {
        return this.h;
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j) {
        a(aVar, aVar2, j, false);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j, boolean z) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        }
        if (!a(new c(this.b, aVar, aVar2))) {
            a(aVar, j, z);
        } else if (com.applovin.impl.sdk.y.a()) {
            this.c.c(aVar.e(), "Task execution delayed until after init");
        }
    }

    public void a(Runnable runnable) {
        this.d.submit(runnable);
    }

    public Executor b() {
        return this.e;
    }

    public ExecutorService c() {
        return f1301a;
    }

    public void a(com.applovin.impl.sdk.e.a aVar) {
        if (aVar != null) {
            try {
                if (Utils.isMainThread() && ((Boolean) this.b.a(com.applovin.impl.sdk.c.b.fO)).booleanValue()) {
                    this.e.submit(aVar);
                } else {
                    aVar.run();
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.c.b(aVar.e(), "Task failed execution", th);
                    return;
                }
                return;
            }
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.c.e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    private void a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.e.submit(runnable);
        } else if (z) {
            com.applovin.impl.sdk.utils.f.a(j, this.b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    o.this.e.execute(runnable);
                }
            });
        } else {
            this.e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    public void d() {
        synchronized (this.g) {
            this.h = false;
        }
    }

    public void e() {
        synchronized (this.g) {
            this.h = true;
            for (c cVar : this.f) {
                a(cVar.d, cVar.e);
            }
            this.f.clear();
        }
    }

    private boolean a(c cVar) {
        if (cVar.d.g()) {
            return false;
        }
        synchronized (this.g) {
            if (this.h) {
                return false;
            }
            this.f.add(cVar);
            return true;
        }
    }

    private ScheduledThreadPoolExecutor a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new b(str));
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f1306a;
        private final String b;
        private final com.applovin.impl.sdk.y c;
        private final com.applovin.impl.sdk.e.a d;
        private final a e;

        c(com.applovin.impl.sdk.p pVar, com.applovin.impl.sdk.e.a aVar, a aVar2) {
            this.f1306a = pVar;
            this.c = pVar.L();
            this.b = aVar.e();
            this.d = aVar;
            this.e = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.y yVar;
            String str;
            StringBuilder sb;
            try {
                com.applovin.impl.sdk.utils.h.a();
                if (!this.f1306a.c() || this.d.g()) {
                    this.d.run();
                } else {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.c.c(this.b, "Task re-scheduled...");
                    }
                    this.f1306a.M().a(this.d, this.e, AdLoader.RETRY_DELAY);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.c.b(this.b, "Task failed execution", th);
                    }
                    if (!com.applovin.impl.sdk.y.a()) {
                        return;
                    }
                    yVar = this.c;
                    str = this.b;
                    sb = new StringBuilder();
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.c.c(this.b, this.e + " queue finished task " + this.d.e());
                    }
                    throw th2;
                }
            }
            if (com.applovin.impl.sdk.y.a()) {
                yVar = this.c;
                str = this.b;
                sb = new StringBuilder();
                sb.append(this.e);
                sb.append(" queue finished task ");
                sb.append(this.d.e());
                yVar.c(str, sb.toString());
            }
        }
    }

    private class b implements ThreadFactory {
        private final String b;

        b(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.b + ":" + Utils.shortenKey(o.this.b.B()));
            thread.setDaemon(true);
            thread.setPriority(((Integer) o.this.b.a(com.applovin.impl.sdk.c.b.fP)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    com.applovin.impl.sdk.y unused = o.this.c;
                    if (com.applovin.impl.sdk.y.a()) {
                        o.this.c.b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }
}
