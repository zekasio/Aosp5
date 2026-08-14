package com.tapjoy.internal;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6 f1853a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final Runnable c = new a();
    public ScheduledFuture<?> d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m7.this.b.compareAndSet(true, false)) {
                com.tapjoy.internal.a.e("The session ended");
                m7.this.f1853a.c();
                s5.d.notifyObservers();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m7.this.f1853a.d();
        }
    }

    public m7(x6 x6Var) {
        new b();
        this.f1853a = x6Var;
    }

    public void a() {
        if (this.b.get()) {
            if (!Boolean.FALSE.booleanValue()) {
                this.c.run();
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.d;
            if (scheduledFuture == null || scheduledFuture.cancel(false)) {
                this.d = n7.f1865a.schedule(this.c, 3000L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
