package com.tapjoy.internal;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public class l1<N, T> extends ReferenceQueue<T> implements j1<N, T> {
    public k1<N, T> a(N n, T t) {
        return new k1<>(n, t, this);
    }

    @Override // java.lang.ref.ReferenceQueue
    public k1<N, T> poll() {
        return (k1) super.poll();
    }
}
