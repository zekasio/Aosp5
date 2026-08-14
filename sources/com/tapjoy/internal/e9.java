package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d9 f1795a;
    public static long b;

    public static d9 a() {
        synchronized (e9.class) {
            d9 d9Var = f1795a;
            if (d9Var == null) {
                return new d9();
            }
            f1795a = d9Var.f;
            d9Var.f = null;
            b -= 8192;
            return d9Var;
        }
    }

    public static void a(d9 d9Var) {
        if (d9Var.f == null && d9Var.g == null) {
            if (d9Var.d) {
                return;
            }
            synchronized (e9.class) {
                long j = b;
                if (j + 8192 > 65536) {
                    return;
                }
                b = j + 8192;
                d9Var.f = f1795a;
                d9Var.c = 0;
                d9Var.b = 0;
                f1795a = d9Var;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
