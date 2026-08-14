package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class g4<T> extends AbstractList<T> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<T> f1803a;

    public g4(List<T> list) {
        this.f1803a = new ArrayList<>(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.f1803a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1803a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.f1803a.toArray();
    }
}
