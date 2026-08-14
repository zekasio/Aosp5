package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class b9 implements v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8 f1764a = new u8();
    public final g9 b;
    public boolean c;

    public b9(g9 g9Var) {
        if (g9Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.b = g9Var;
    }

    @Override // com.tapjoy.internal.g9
    public void a(u8 u8Var, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f1764a.a(u8Var, j);
        a();
    }

    @Override // com.tapjoy.internal.g9, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.c) {
            return;
        }
        try {
            if (this.f1764a.b > 0) {
                g9 g9Var = this.b;
                u8 u8Var = this.f1764a;
                g9Var.a(u8Var, u8Var.b);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th == null) {
            return;
        }
        j9.a(th);
        throw null;
    }

    @Override // com.tapjoy.internal.g9, java.io.Flushable
    public void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        u8 u8Var = this.f1764a;
        long j = u8Var.b;
        if (j > 0) {
            this.b.a(u8Var, j);
        }
        this.b.flush();
    }

    public String toString() {
        StringBuilder sbA = w1.a("buffer(");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // com.tapjoy.internal.v8
    public v8 writeByte(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f1764a.writeByte(i);
        return a();
    }

    @Override // com.tapjoy.internal.v8
    public v8 a(x8 x8Var) {
        if (!this.c) {
            this.f1764a.a(x8Var);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.tapjoy.internal.v8
    public v8 a(String str) {
        if (!this.c) {
            this.f1764a.a(str);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.tapjoy.internal.v8
    public v8 a(int i) {
        if (!this.c) {
            this.f1764a.a(i);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.tapjoy.internal.v8
    public v8 a(long j) {
        if (!this.c) {
            this.f1764a.a(j);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public v8 a() {
        if (!this.c) {
            u8 u8Var = this.f1764a;
            long j = u8Var.b;
            if (j == 0) {
                j = 0;
            } else {
                d9 d9Var = u8Var.f1925a.g;
                int i = d9Var.c;
                if (i < 8192 && d9Var.e) {
                    j -= (long) (i - d9Var.b);
                }
            }
            if (j > 0) {
                this.b.a(this.f1764a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
