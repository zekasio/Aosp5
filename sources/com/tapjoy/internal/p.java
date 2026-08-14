package com.tapjoy.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f1877a = false;
    public static volatile long b;
    public static volatile long c;
    public static volatile long d;

    static {
        a(false, "System", System.currentTimeMillis(), SystemClock.elapsedRealtime(), Long.MAX_VALUE);
    }

    public static synchronized void a(boolean z, String str, long j, long j2, long j3) {
        f1877a = z;
        b = j;
        c = j2;
        d = b - c;
        a();
        System.currentTimeMillis();
    }

    public static long a() {
        return SystemClock.elapsedRealtime() + d;
    }
}
