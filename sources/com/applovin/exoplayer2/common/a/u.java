package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<K, V> implements Serializable, Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f165a = new Map.Entry[0];

    @LazyInit
    private transient w<Map.Entry<K, V>> b;

    @LazyInit
    private transient w<K> c;

    @LazyInit
    private transient q<V> d;

    abstract w<Map.Entry<K, V>> d();

    abstract w<K> f();

    public abstract V get(@NullableDecl Object obj);

    abstract q<V> h();

    abstract boolean i();

    public static <K, V> u<K, V> a() {
        return (u<K, V>) al.b;
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super V> f166a;
        Object[] b;
        int c;
        boolean d;

        public a() {
            this(4);
        }

        a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, q.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public a<K, V> a(K k, V v) {
            a(this.c + 1);
            j.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public u<K, V> a() {
            b();
            this.d = true;
            return al.a(this.c, this.b);
        }

        void b() {
            int i;
            if (this.f166a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, ai.a(this.f166a).a(ab.b()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    public static <K, V> u<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            if (!uVar.i()) {
                return uVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> u<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    u() {
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.b;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> wVarD = d();
        this.b = wVarD;
        return wVarD;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.c;
        if (wVar != null) {
            return wVar;
        }
        w<K> wVarF = f();
        this.c = wVarF;
        return wVarF;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q<V> values() {
        q<V> qVar = this.d;
        if (qVar != null) {
            return qVar;
        }
        q<V> qVarH = h();
        this.d = qVarH;
        return qVarH;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return ab.d(this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return aq.a(entrySet());
    }

    public String toString() {
        return ab.a(this);
    }
}
