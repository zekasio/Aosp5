package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class h4<T> extends AbstractList<T> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f1810a;
    public List<T> b;

    public h4(List<T> list) {
        this.f1810a = list;
        this.b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        List<T> list = this.b;
        List<T> list2 = this.f1810a;
        if (list == list2) {
            this.b = new ArrayList(list2);
        }
        this.b.add(i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i) {
        List<T> list = this.b;
        List<T> list2 = this.f1810a;
        if (list == list2) {
            this.b = new ArrayList(list2);
        }
        return this.b.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        List<T> list = this.b;
        List<T> list2 = this.f1810a;
        if (list == list2) {
            this.b = new ArrayList(list2);
        }
        return this.b.set(i, t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }
}
