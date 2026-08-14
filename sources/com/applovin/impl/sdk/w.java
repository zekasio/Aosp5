package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f1505a = new a();
    private final p b;
    private long d;
    private long g;
    private Object h;
    private final AtomicBoolean c = new AtomicBoolean();
    private final Object e = new Object();
    private final AtomicBoolean f = new AtomicBoolean();
    private final Map<String, a> i = CollectionUtils.map();
    private final Object j = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1508a = -1;
        private int b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            long jA = a();
            return ((((int) (jA ^ (jA >>> 32))) + 59) * 59) + b();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + a() + ", attemptCount=" + b() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public long a() {
            return this.f1508a;
        }

        public int b() {
            return this.b;
        }
    }

    w(p pVar) {
        this.b = pVar;
    }

    public boolean a() {
        return this.f.get();
    }

    public void a(boolean z) {
        synchronized (this.e) {
            this.f.set(z);
            if (z) {
                this.g = System.currentTimeMillis();
                this.b.L();
                if (y.a()) {
                    this.b.L().b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.g);
                }
                final long jLongValue = ((Long) this.b.a(com.applovin.impl.sdk.c.b.cu)).longValue();
                if (jLongValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.w.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (w.this.a() && System.currentTimeMillis() - w.this.g >= jLongValue) {
                                w.this.b.L();
                                if (y.a()) {
                                    w.this.b.L().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                w.this.f.set(false);
                            }
                        }
                    }, jLongValue);
                }
            } else {
                this.g = 0L;
                this.b.L();
                if (y.a()) {
                    this.b.L().b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public boolean b() {
        return this.c.get();
    }

    public Object c() {
        return this.h;
    }

    public void a(final Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.c.compareAndSet(false, true)) {
            this.h = obj;
            this.d = System.currentTimeMillis();
            this.b.L();
            if (y.a()) {
                this.b.L().b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.d);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long jLongValue = ((Long) this.b.a(com.applovin.impl.sdk.c.b.cv)).longValue();
            if (jLongValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.w.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (w.this.c.get() && System.currentTimeMillis() - w.this.d >= jLongValue) {
                            w.this.b.L();
                            if (y.a()) {
                                w.this.b.L().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            w.this.b(obj);
                        }
                    }
                }, jLongValue);
            }
        }
    }

    public void b(Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.c.compareAndSet(true, false)) {
            this.h = null;
            this.b.L();
            if (y.a()) {
                this.b.L().b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void a(String str) {
        synchronized (this.j) {
            a aVar = this.i.get(str);
            if (aVar == null) {
                aVar = new a();
                this.i.put(str, aVar);
            }
            aVar.f1508a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.j) {
            aVar = this.i.get(str);
            if (aVar == null) {
                aVar = f1505a;
            }
        }
        return aVar;
    }

    public void c(String str) {
        synchronized (this.j) {
            this.i.remove(str);
        }
    }
}
