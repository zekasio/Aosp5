package com.tapjoy.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y8 implements g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i9 f1953a;
    public final /* synthetic */ OutputStream b;

    public y8(i9 i9Var, OutputStream outputStream) {
        this.f1953a = i9Var;
        this.b = outputStream;
    }

    @Override // com.tapjoy.internal.g9
    public void a(u8 u8Var, long j) throws IOException {
        j9.a(u8Var.b, 0L, j);
        while (j > 0) {
            this.f1953a.a();
            d9 d9Var = u8Var.f1925a;
            int iMin = (int) Math.min(j, d9Var.c - d9Var.b);
            this.b.write(d9Var.f1783a, d9Var.b, iMin);
            d9Var.b += iMin;
            long j2 = iMin;
            j -= j2;
            u8Var.b -= j2;
            if (d9Var.b == d9Var.c) {
                u8Var.f1925a = d9Var.a();
                e9.a(d9Var);
            }
        }
    }

    @Override // com.tapjoy.internal.g9, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // com.tapjoy.internal.g9, java.io.Flushable
    public void flush() throws IOException {
        this.b.flush();
    }

    public String toString() {
        StringBuilder sbA = w1.a("sink(");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
