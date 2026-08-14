package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ae;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class f<K, V> implements ac<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> f143a;

    @MonotonicNonNullDecl
    private transient Set<K> b;

    @MonotonicNonNullDecl
    private transient Collection<V> c;

    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> d;

    abstract Set<K> f();

    abstract Collection<V> i();

    abstract Collection<Map.Entry<K, V>> l();

    abstract Iterator<Map.Entry<K, V>> m();

    abstract Map<K, Collection<V>> n();

    f() {
    }

    public boolean d(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k, @NullableDecl V v) {
        return b(k).add(v);
    }

    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f143a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionL = l();
        this.f143a = collectionL;
        return collectionL;
    }

    class a extends ae.b<K, V> {
        a() {
        }

        @Override // com.applovin.exoplayer2.common.a.ae.b
        ac<K, V> a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.m();
        }
    }

    class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return aq.a(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return aq.a(this, obj);
        }
    }

    public Set<K> p() {
        Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        Set<K> setF = f();
        this.b = setF;
        return setF;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionI = i();
        this.c = collectionI;
        return collectionI;
    }

    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.e();
        }
    }

    Iterator<V> j() {
        return ab.b(k().iterator());
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapN = n();
        this.d = mapN;
        return mapN;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ae.a(this, obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString();
    }
}
