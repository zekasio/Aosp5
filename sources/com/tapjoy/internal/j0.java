package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class j0<E> extends i0<E> implements l0<E>, Flushable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0<E> f1824a;
    public final LinkedList<E> b = new LinkedList<>();
    public final LinkedList<E> c = new LinkedList<>();
    public int d;
    public boolean e;

    public j0(l0<E> l0Var) {
        this.f1824a = l0Var;
        int size = l0Var.size();
        this.d = size;
        this.e = size == 0;
    }

    @Override // com.tapjoy.internal.l0
    public void b(int i) {
        if (i < 1 || i > this.d) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= this.b.size()) {
            a.a(this.b, i);
            this.f1824a.b(i);
        } else {
            this.b.clear();
            int size = (this.c.size() + i) - this.d;
            if (size < 0) {
                this.f1824a.b(i);
            } else {
                this.f1824a.clear();
                this.e = true;
                if (size > 0) {
                    a.a(this.c, size);
                }
            }
        }
        this.d -= i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } finally {
            l0<E> l0Var = this.f1824a;
            if (l0Var instanceof Closeable) {
                ((Closeable) l0Var).close();
            }
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.c.isEmpty()) {
            return;
        }
        this.f1824a.addAll(this.c);
        if (this.e) {
            this.b.addAll(this.c);
        }
        this.c.clear();
    }

    @Override // com.tapjoy.internal.l0
    public E get(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.b.size();
        if (i < size) {
            return this.b.get(i);
        }
        if (this.e) {
            return this.c.get(i - size);
        }
        if (i >= this.f1824a.size()) {
            return this.c.get(i - this.f1824a.size());
        }
        E e = null;
        while (size <= i) {
            e = this.f1824a.get(size);
            this.b.add(e);
            size++;
        }
        if (this.c.size() + i + 1 == this.d) {
            this.e = true;
        }
        return e;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        this.c.add(e);
        this.d++;
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        if (this.d < 1) {
            return null;
        }
        if (!this.b.isEmpty()) {
            return this.b.element();
        }
        if (this.e) {
            return this.c.element();
        }
        E ePeek = this.f1824a.peek();
        this.b.add(ePeek);
        if (this.d == this.c.size() + this.b.size()) {
            this.e = true;
        }
        return ePeek;
    }

    @Override // java.util.Queue
    public E poll() {
        E eRemove;
        if (this.d < 1) {
            return null;
        }
        if (!this.b.isEmpty()) {
            eRemove = this.b.remove();
            this.f1824a.b(1);
        } else if (this.e) {
            eRemove = this.c.remove();
        } else {
            eRemove = this.f1824a.remove();
            if (this.d == this.c.size() + 1) {
                this.e = true;
            }
        }
        this.d--;
        return eRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.d;
    }
}
