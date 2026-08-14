package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v8 f1788a;

    public e4(v8 v8Var) {
        this.f1788a = v8Var;
    }

    public static int b(int i, z3 z3Var) {
        return (i << 3) | z3Var.f1958a;
    }

    public static int c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void a(int i, z3 z3Var) {
        b((i << 3) | z3Var.f1958a);
    }

    public void b(int i) {
        while ((i & (-128)) != 0) {
            this.f1788a.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.f1788a.writeByte(i);
    }

    public void a(x8 x8Var) {
        this.f1788a.a(x8Var);
    }

    public void a(int i) {
        this.f1788a.a(i);
    }

    public void a(long j) {
        this.f1788a.a(j);
    }

    public void b(long j) {
        while (((-128) & j) != 0) {
            this.f1788a.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f1788a.writeByte((int) j);
    }
}
