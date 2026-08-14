package com.tapjoy.internal;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class s<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f1901a;

    public s(Iterator it) {
        this.f1901a = it;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f1901a;
    }
}
