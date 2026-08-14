package com.tapjoy.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class m1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<T> f1848a;

    public T a() {
        WeakReference<T> weakReference = this.f1848a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(T t) {
        this.f1848a = new WeakReference<>(t);
    }
}
