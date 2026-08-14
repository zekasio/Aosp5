package com.tapjoy.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 {
    public static String d;
    public static boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f1865a = Executors.newScheduledThreadPool(1);
    public static final CountDownLatch b = new CountDownLatch(1);
    public static final Runnable c = new a();
    public static final CountDownLatch f = new CountDownLatch(1);

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (p.f1877a) {
                n7.b.countDown();
                return;
            }
            j6 j6Var = new j6();
            if (!j6Var.a("pool.ntp.org", (int) 20000)) {
                n7.f1865a.schedule(this, 300L, TimeUnit.SECONDS);
            } else {
                p.a(true, "SNTP", j6Var.f1827a, j6Var.b, j6Var.c / 2);
                n7.b.countDown();
            }
        }
    }
}
