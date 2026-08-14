package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class e0<K, V> implements h0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0<K, V> f1784a;

    public e0(f0<K, V> f0Var) {
        this.f1784a = f0Var;
    }

    @Override // com.tapjoy.internal.d0
    public V get(K k) {
        c0<V> c0VarA;
        V v;
        synchronized (this.f1784a) {
            c0VarA = this.f1784a.a(k, false);
        }
        if (c0VarA == null) {
            return null;
        }
        synchronized (c0VarA) {
            v = c0VarA.f1765a;
        }
        return v;
    }

    @Override // com.tapjoy.internal.d0
    public void put(K k, V v) {
        c0<V> c0VarA;
        synchronized (this.f1784a) {
            c0VarA = this.f1784a.a(k, true);
        }
        synchronized (c0VarA) {
            c0VarA.f1765a = v;
        }
    }
}
