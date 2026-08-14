package com.applovin.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f43a;
    private final a b;
    private final com.applovin.exoplayer2.l.d c;
    private final ba d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void a(ao aoVar);
    }

    public interface b {
        void a(int i, Object obj) throws p;
    }

    public ao(a aVar, b bVar, ba baVar, int i, com.applovin.exoplayer2.l.d dVar, Looper looper) {
        this.b = aVar;
        this.f43a = bVar;
        this.d = baVar;
        this.g = looper;
        this.c = dVar;
        this.h = i;
    }

    public ba a() {
        return this.d;
    }

    public b b() {
        return this.f43a;
    }

    public ao a(int i) {
        com.applovin.exoplayer2.l.a.b(!this.k);
        this.e = i;
        return this;
    }

    public int c() {
        return this.e;
    }

    public ao a(Object obj) {
        com.applovin.exoplayer2.l.a.b(!this.k);
        this.f = obj;
        return this;
    }

    public Object d() {
        return this.f;
    }

    public Looper e() {
        return this.g;
    }

    public long f() {
        return this.i;
    }

    public int g() {
        return this.h;
    }

    public boolean h() {
        return this.j;
    }

    public ao i() {
        com.applovin.exoplayer2.l.a.b(!this.k);
        if (this.i == -9223372036854775807L) {
            com.applovin.exoplayer2.l.a.a(this.j);
        }
        this.k = true;
        this.b.a(this);
        return this;
    }

    public synchronized boolean j() {
        return this.n;
    }

    public synchronized void a(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public synchronized boolean a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        com.applovin.exoplayer2.l.a.b(this.k);
        com.applovin.exoplayer2.l.a.b(this.g.getThread() != Thread.currentThread());
        long jA = this.c.a() + j;
        while (true) {
            z = this.m;
            if (z || j <= 0) {
                break;
            }
            this.c.c();
            wait(j);
            j = jA - this.c.a();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.l;
    }
}
