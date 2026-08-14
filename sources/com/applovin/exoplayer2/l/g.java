package com.applovin.exoplayer2.l;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f616a;
    private boolean b;

    public g() {
        this(d.f613a);
    }

    public g(d dVar) {
        this.f616a = dVar;
    }

    public synchronized boolean a() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean b() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized void c() throws InterruptedException {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean e() {
        return this.b;
    }
}
