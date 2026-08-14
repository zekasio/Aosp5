package com.tapjoy.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class k1<N, T> extends WeakReference<T> implements i1<N, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f1832a;

    public k1(N n, T t, ReferenceQueue<? super T> referenceQueue) {
        super(t, referenceQueue);
        this.f1832a = n;
    }
}
