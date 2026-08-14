package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.c.f;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.c.i;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<I extends g, O extends i, E extends f> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f104a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    protected abstract E a(I i, O o, boolean z);

    protected abstract E a(Throwable th);

    protected abstract I g();

    protected abstract O h();

    protected j(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            ((I[]) this.e)[i] = g();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((O[]) this.f)[i2] = h();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.applovin.exoplayer2.c.j.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                j.this.k();
            }
        };
        this.f104a = thread;
        thread.start();
    }

    protected final void a(int i) {
        com.applovin.exoplayer2.l.a.b(this.g == this.e.length);
        for (I i2 : this.e) {
            i2.f(i);
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final I a() throws f {
        I i;
        synchronized (this.b) {
            i();
            com.applovin.exoplayer2.l.a.b(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.applovin.exoplayer2.c.d
    public final void a(I i) throws f {
        synchronized (this.b) {
            i();
            com.applovin.exoplayer2.l.a.a(i == this.i);
            this.c.addLast(i);
            j();
            this.i = null;
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final O b() throws f {
        synchronized (this.b) {
            i();
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.removeFirst();
        }
    }

    protected void a(O o) {
        synchronized (this.b) {
            b(o);
            j();
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public final void c() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                b(i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b(this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().f();
            }
        }
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f104a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.applovin.exoplayer2.c.f */
    private void i() throws f, E {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    private void j() {
        if (m()) {
            this.b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (l());
    }

    private boolean l() throws InterruptedException {
        E e;
        synchronized (this.b) {
            while (!this.l && !m()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            I iRemoveFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (iRemoveFirst.c()) {
                o.b(4);
            } else {
                if (iRemoveFirst.b()) {
                    o.b(Integer.MIN_VALUE);
                }
                try {
                    e = (E) a(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) a((Throwable) e2);
                } catch (RuntimeException e3) {
                    e = (E) a((Throwable) e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    o.f();
                } else if (o.b()) {
                    this.m++;
                    o.f();
                } else {
                    o.b = this.m;
                    this.m = 0;
                    this.d.addLast(o);
                }
                b(iRemoveFirst);
            }
            return true;
        }
    }

    private boolean m() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private void b(I i) {
        i.a();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o;
    }
}
