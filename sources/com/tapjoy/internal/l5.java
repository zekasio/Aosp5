package com.tapjoy.internal;

import android.util.Log;
import com.tapjoy.TapjoyLog;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class l5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f1843a;
    public final /* synthetic */ n5 b;

    public l5(n5 n5Var, CountDownLatch countDownLatch) {
        this.b = n5Var;
        this.f1843a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.b.f1864a = n5.b();
            } catch (Exception e) {
                TapjoyLog.w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
            }
        } finally {
            this.f1843a.countDown();
        }
    }
}
