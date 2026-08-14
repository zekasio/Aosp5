package com.tapjoy.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1866a;

    public n8(long j) {
        this.f1866a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + this.f1866a;
        while (((v6) this).b.f1936a.a() && jElapsedRealtime - SystemClock.elapsedRealtime() > 0) {
            try {
                Thread.sleep(0L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
