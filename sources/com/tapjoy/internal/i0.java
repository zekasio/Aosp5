package com.tapjoy.internal;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i0<E> extends AbstractQueue<E> implements l0<E> {

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1816a = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1816a < i0.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            i0 i0Var = i0.this;
            int i = this.f1816a;
            this.f1816a = i + 1;
            return i0Var.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1816a != 1) {
                throw new UnsupportedOperationException("For the first element only");
            }
            i0.this.b(1);
            this.f1816a = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }
}
