package com.tapjoy.internal;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1823a;
    public long b;

    public void a() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f1823a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
