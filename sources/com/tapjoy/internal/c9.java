package com.tapjoy.internal;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class c9 implements w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8 f1776a = new u8();
    public final h9 b;
    public boolean c;

    public c9(h9 h9Var) {
        if (h9Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.b = h9Var;
    }

    @Override // com.tapjoy.internal.w8
    public int a() throws EOFException {
        d(4L);
        return this.f1776a.a();
    }

    @Override // com.tapjoy.internal.h9
    public long b(u8 u8Var, long j) {
        if (u8Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        u8 u8Var2 = this.f1776a;
        if (u8Var2.b == 0 && this.b.b(u8Var2, 8192L) == -1) {
            return -1L;
        }
        return this.f1776a.b(u8Var, Math.min(j, this.f1776a.b));
    }

    @Override // com.tapjoy.internal.w8
    public boolean c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.f1776a.c() && this.b.b(this.f1776a, 8192L) == -1;
    }

    @Override // com.tapjoy.internal.h9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.f1776a.d();
    }

    @Override // com.tapjoy.internal.w8
    public void d(long j) throws EOFException {
        u8 u8Var;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            u8Var = this.f1776a;
            if (u8Var.b >= j) {
                return;
            }
        } while (this.b.b(u8Var, 8192L) != -1);
        throw new EOFException();
    }

    @Override // com.tapjoy.internal.w8
    public byte readByte() throws EOFException {
        d(1L);
        return this.f1776a.readByte();
    }

    @Override // com.tapjoy.internal.w8
    public void skip(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            u8 u8Var = this.f1776a;
            if (u8Var.b == 0 && this.b.b(u8Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f1776a.b);
            this.f1776a.skip(jMin);
            j -= jMin;
        }
    }

    public String toString() {
        StringBuilder sbA = w1.a("buffer(");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // com.tapjoy.internal.w8
    public String c(long j) throws EOFException {
        d(j);
        return this.f1776a.c(j);
    }

    @Override // com.tapjoy.internal.w8
    public x8 b(long j) throws EOFException {
        d(j);
        return this.f1776a.b(j);
    }

    @Override // com.tapjoy.internal.w8
    public long b() throws EOFException {
        d(8L);
        return this.f1776a.b();
    }
}
