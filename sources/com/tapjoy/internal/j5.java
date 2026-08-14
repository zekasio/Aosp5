package com.tapjoy.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class j5 {
    public static final j5 c = new j5(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1826a;
    public long b;

    public j5(long j) {
        this.f1826a = j;
        this.b = SystemClock.elapsedRealtime();
    }

    public boolean a() {
        try {
            return SystemClock.elapsedRealtime() - this.b > this.f1826a;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    public boolean a(long j) {
        try {
            return (SystemClock.elapsedRealtime() - this.b) + j > this.f1826a;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    public j5(long j, long j2) {
        this.f1826a = j;
        try {
            this.b = SystemClock.elapsedRealtime() - j2;
        } catch (NullPointerException unused) {
            this.b = -1L;
        }
    }
}
