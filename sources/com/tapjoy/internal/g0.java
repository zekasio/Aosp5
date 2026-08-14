package com.tapjoy.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g0<K, V> extends f0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<K, c0<K, V>> f1800a = new LinkedHashMap<>(0, 0.75f, true);
    public int b;

    public g0(int i) {
        this.b = i;
    }

    public void a() {
        int size = this.f1800a.size() - this.b;
        if (size > 0) {
            Iterator<Map.Entry<K, c0<K, V>>> it = this.f1800a.entrySet().iterator();
            while (size > 0 && it.hasNext()) {
                size--;
                it.next();
                it.remove();
            }
        }
    }

    @Override // com.tapjoy.internal.d0
    public void put(K k, V v) {
        a(k, true).a(v);
        a();
    }

    @Override // com.tapjoy.internal.f0
    public c0<V> a(K k, boolean z) {
        c0<K, V> c0Var = this.f1800a.get(k);
        if (c0Var != null || !z) {
            return c0Var;
        }
        c0<V> c0Var2 = new c0<>(k);
        this.f1800a.put(k, c0Var2);
        a();
        return c0Var2;
    }
}
