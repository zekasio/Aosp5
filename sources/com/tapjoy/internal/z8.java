package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 implements h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i9 f1962a;
    public final /* synthetic */ InputStream b;

    public z8(i9 i9Var, InputStream inputStream) {
        this.f1962a = i9Var;
        this.b = inputStream;
    }

    @Override // com.tapjoy.internal.h9
    public long b(u8 u8Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f1962a.a();
            d9 d9VarB = u8Var.b(1);
            int i = this.b.read(d9VarB.f1783a, d9VarB.c, (int) Math.min(j, 8192 - d9VarB.c));
            if (i == -1) {
                return -1L;
            }
            d9VarB.c += i;
            long j2 = i;
            u8Var.b += j2;
            return j2;
        } catch (AssertionError e) {
            if (a9.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // com.tapjoy.internal.h9, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    public String toString() {
        StringBuilder sbA = w1.a("source(");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
