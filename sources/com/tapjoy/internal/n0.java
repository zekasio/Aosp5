package com.tapjoy.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class n0<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<K, k1<K, V>> f1858a = new HashMap<>();
    public final l1<K, V> b = new l1<>();

    public final V a(k1<K, V> k1Var) {
        if (k1Var != null) {
            return k1Var.get();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f1858a.clear();
        while (this.b.poll() != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        a();
        return this.f1858a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        a();
        Iterator<k1<K, V>> it = this.f1858a.values().iterator();
        while (it.hasNext()) {
            if (obj.equals(it.next().get())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        a();
        return a(this.f1858a.get(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        a();
        return this.f1858a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        a();
        return a(this.f1858a.put(k, this.b.a(k, v)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        return a(this.f1858a.remove(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        a();
        return this.f1858a.size();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        a();
        throw new UnsupportedOperationException();
    }

    public final void a() {
        while (true) {
            k1<K, V> k1VarPoll = this.b.poll();
            if (k1VarPoll == null) {
                return;
            } else {
                this.f1858a.remove(k1VarPoll.f1832a);
            }
        }
    }
}
