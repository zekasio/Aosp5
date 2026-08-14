package com.tapjoy.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class k0<E> implements l0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<E> f1831a;

    public k0(List<E> list) {
        this.f1831a = list;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(E e) {
        return this.f1831a.add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f1831a.addAll(collection);
    }

    @Override // com.tapjoy.internal.l0
    public void b(int i) {
        a.a(this.f1831a, i);
    }

    @Override // java.util.Collection
    public void clear() {
        this.f1831a.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f1831a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f1831a.containsAll(collection);
    }

    @Override // java.util.Queue
    public E element() {
        E ePeek = peek();
        if (ePeek != null) {
            return ePeek;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return this.f1831a.equals(obj);
    }

    @Override // com.tapjoy.internal.l0
    public E get(int i) {
        return this.f1831a.get(i);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f1831a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f1831a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f1831a.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return this.f1831a.add(e);
    }

    @Override // java.util.Queue
    public E peek() {
        if (this.f1831a.isEmpty()) {
            return null;
        }
        return this.f1831a.get(0);
    }

    @Override // java.util.Queue
    public E poll() {
        if (this.f1831a.isEmpty()) {
            return null;
        }
        return this.f1831a.remove(0);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return this.f1831a.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f1831a.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f1831a.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.f1831a.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f1831a.toArray();
    }

    @Override // java.util.Queue
    public E remove() {
        E ePoll = poll();
        if (ePoll != null) {
            return ePoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f1831a.toArray(tArr);
    }
}
