package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class ab {

    private enum a implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.applovin.exoplayer2.common.a.ab.a.1
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.applovin.exoplayer2.common.a.ab.a.2
            @Override // com.applovin.exoplayer2.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static <K> Function<Map.Entry<K, ?>, K> a() {
        return a.KEY;
    }

    static <V> Function<Map.Entry<?, V>, V> b() {
        return a.VALUE;
    }

    static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, K>(it) { // from class: com.applovin.exoplayer2.common.a.ab.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.applovin.exoplayer2.common.a.aw
            public K a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> Iterator<V> b(Iterator<Map.Entry<K, V>> it) {
        return new aw<Map.Entry<K, V>, V>(it) { // from class: com.applovin.exoplayer2.common.a.ab.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.applovin.exoplayer2.common.a.aw
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    static int a(int i) {
        if (i < 3) {
            j.a(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> IdentityHashMap<K, V> c() {
        return new IdentityHashMap<>();
    }

    public static <K, V> Map.Entry<K, V> a(@NullableDecl K k, @NullableDecl V v) {
        return new r(k, v);
    }

    static abstract class e<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> f109a;

        @MonotonicNonNullDecl
        private transient Set<K> b;

        @MonotonicNonNullDecl
        private transient Collection<V> c;

        abstract Set<Map.Entry<K, V>> a();

        e() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f109a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f109a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.b;
            if (set != null) {
                return set;
            }
            Set<K> setH = h();
            this.b = setH;
            return setH;
        }

        Set<K> h() {
            return new c(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionI = i();
            this.c = collectionI;
            return collectionI;
        }

        Collection<V> i() {
            return new d(this);
        }
    }

    static <V> V a(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String a(Map<?, ?> map) {
        StringBuilder sbA = k.a(map.size());
        sbA.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static class c<K, V> extends aq.a<K> {
        final Map<K, V> d;

        c(Map<K, V> map) {
            this.d = (Map) Preconditions.checkNotNull(map);
        }

        Map<K, V> c() {
            return this.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return ab.a(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            c().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }
    }

    static class d<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f108a;

        d(Map<K, V> map) {
            this.f108a = (Map) Preconditions.checkNotNull(map);
        }

        final Map<K, V> a() {
            return this.f108a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return ab.b(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetA.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }
    }

    static abstract class b<K, V> extends aq.a<Map.Entry<K, V>> {
        abstract Map<K, V> a();

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objA = ab.a((Map<?, Object>) a(), key);
            if (Objects.equal(objA, entry.getValue())) {
                return objA != null || a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return aq.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.applovin.exoplayer2.common.a.aq.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetA = aq.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetA.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetA);
            }
        }
    }
}
