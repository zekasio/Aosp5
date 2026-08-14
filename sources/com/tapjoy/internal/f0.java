package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0<K, V> implements d0<K, V> {
    public abstract c0<V> a(K k, boolean z);

    @Override // com.tapjoy.internal.d0
    public V get(K k) {
        c0<V> c0VarA = a(k, false);
        if (c0VarA != null) {
            return c0VarA.f1765a;
        }
        return null;
    }
}
