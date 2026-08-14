package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class v<K, V> extends g<K, V> implements Serializable {
    final transient u<K, ? extends q<V>> b;
    final transient int c;

    @Override // com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract q<V> b(K k);

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public /* bridge */ /* synthetic */ boolean b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<K, Collection<V>> f169a = aj.a();

        @MonotonicNonNullDecl
        Comparator<? super K> b;

        @MonotonicNonNullDecl
        Comparator<? super V> c;

        Collection<V> c() {
            return new ArrayList();
        }

        public a<K, V> b(K k, Iterable<? extends V> iterable) {
            if (k == null) {
                throw new NullPointerException("null key in entry: null=" + x.a(iterable));
            }
            Collection<V> collection = this.f169a.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    j.a(k, v);
                    collection.add(v);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionC = c();
            while (it.hasNext()) {
                V next = it.next();
                j.a(k, next);
                collectionC.add(next);
            }
            this.f169a.put(k, collectionC);
            return this;
        }

        public a<K, V> b(K k, V... vArr) {
            return b(k, Arrays.asList(vArr));
        }

        public v<K, V> b() {
            Collection collectionEntrySet = this.f169a.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                collectionEntrySet = ai.a(comparator).c().a(collectionEntrySet);
            }
            return t.a(collectionEntrySet, (Comparator) this.c);
        }
    }

    v(u<K, ? extends q<V>> uVar, int i) {
        this.b = uVar;
        this.c = i;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    @Deprecated
    public boolean c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    boolean g() {
        return this.b.i();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w<K> p() {
        return this.b.keySet();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Set<K> f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> b() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Map<K, Collection<V>> n() {
        throw new AssertionError("should never be called");
    }

    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> k() {
        return (q) super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> l() {
        return new b(this);
    }

    private static class b<K, V> extends q<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<K, V> f170a;

        b(v<K, V> vVar) {
            this.f170a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return this.f170a.m();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        boolean f() {
            return this.f170a.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f170a.d();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f170a.b(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ax<Map.Entry<K, V>> m() {
        return new ax<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.v.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<? extends Map.Entry<K, ? extends q<V>>> f167a;
            K b = null;
            Iterator<V> c = y.a();

            {
                this.f167a = v.this.b.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.c.hasNext() || this.f167a.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!this.c.hasNext()) {
                    Map.Entry<K, ? extends q<V>> next = this.f167a.next();
                    this.b = next.getKey();
                    this.c = next.getValue().iterator();
                }
                return ab.a(this.b, this.c.next());
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public q<V> h() {
        return (q) super.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public q<V> i() {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.exoplayer2.common.a.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ax<V> j() {
        return new ax<V>() { // from class: com.applovin.exoplayer2.common.a.v.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator<? extends q<V>> f168a;
            Iterator<V> b = y.a();

            {
                this.f168a = v.this.b.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext() || this.f168a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.b.hasNext()) {
                    this.b = this.f168a.next().iterator();
                }
                return this.b.next();
            }
        };
    }

    private static final class c<K, V> extends q<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient v<K, V> f171a;

        @Override // com.applovin.exoplayer2.common.a.q
        boolean f() {
            return true;
        }

        c(v<K, V> vVar) {
            this.f171a = vVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f171a.d(obj);
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<V> iterator() {
            return this.f171a.j();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        int a(Object[] objArr, int i) {
            ax<? extends q<V>> it = this.f171a.b.values().iterator();
            while (it.hasNext()) {
                i = it.next().a(objArr, i);
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f171a.d();
        }
    }
}
