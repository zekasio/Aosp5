package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ab;
import com.applovin.exoplayer2.common.a.f;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class d<K, V> extends com.applovin.exoplayer2.common.a.f<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map<K, Collection<V>> f133a;
    private transient int b;

    abstract Collection<V> c();

    static /* synthetic */ int a(d dVar, int i2) {
        int i3 = dVar.b + i2;
        dVar.b = i3;
        return i3;
    }

    static /* synthetic */ int b(d dVar) {
        int i2 = dVar.b;
        dVar.b = i2 - 1;
        return i2;
    }

    static /* synthetic */ int b(d dVar, int i2) {
        int i3 = dVar.b - i2;
        dVar.b = i3;
        return i3;
    }

    static /* synthetic */ int c(d dVar) {
        int i2 = dVar.b;
        dVar.b = i2 + 1;
        return i2;
    }

    protected d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f133a = map;
    }

    Collection<V> c(@NullableDecl K k) {
        return c();
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public int d() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public boolean a(@NullableDecl K k, @NullableDecl V v) {
        Collection<V> collection = this.f133a.get(k);
        if (collection == null) {
            Collection<V> collectionC = c(k);
            if (collectionC.add(v)) {
                this.b++;
                this.f133a.put(k, collectionC);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v)) {
            return false;
        }
        this.b++;
        return true;
    }

    <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public void e() {
        Iterator<Collection<V>> it = this.f133a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f133a.clear();
        this.b = 0;
    }

    @Override // com.applovin.exoplayer2.common.a.ac
    public Collection<V> b(@NullableDecl K k) {
        Collection<V> collectionC = this.f133a.get(k);
        if (collectionC == null) {
            collectionC = c(k);
        }
        return a((Object) k, (Collection) collectionC);
    }

    Collection<V> a(@NullableDecl K k, Collection<V> collection) {
        return new i(k, collection, null);
    }

    final List<V> a(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
        if (list instanceof RandomAccess) {
            return new f(k, list, iVar);
        }
        return new j(k, list, iVar);
    }

    class i extends AbstractCollection<V> {

        @NullableDecl
        final K b;
        Collection<V> c;

        @NullableDecl
        final d<K, V>.i d;

        @NullableDecl
        final Collection<V> e;

        i(@NullableDecl K k, Collection<V> collection, @NullableDecl d<K, V>.i iVar) {
            this.b = k;
            this.c = collection;
            this.d = iVar;
            this.e = iVar == null ? null : iVar.e();
        }

        void a() {
            Collection<V> collection;
            d<K, V>.i iVar = this.d;
            if (iVar != null) {
                iVar.a();
                if (this.d.e() != this.e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.c.isEmpty() || (collection = (Collection) d.this.f133a.get(this.b)) == null) {
                    return;
                }
                this.c = collection;
            }
        }

        void b() {
            d<K, V>.i iVar = this.d;
            if (iVar != null) {
                iVar.b();
            } else if (this.c.isEmpty()) {
                d.this.f133a.remove(this.b);
            }
        }

        K c() {
            return this.b;
        }

        void d() {
            d<K, V>.i iVar = this.d;
            if (iVar == null) {
                d.this.f133a.put(this.b, this.c);
            } else {
                iVar.d();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            a();
            return this.c.size();
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.c.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            a();
            return this.c.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            a();
            return this.c.toString();
        }

        Collection<V> e() {
            return this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            a();
            return new a();
        }

        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<V> f142a;
            final Collection<V> b;

            a() {
                this.b = i.this.c;
                this.f142a = d.c((Collection) i.this.c);
            }

            a(Iterator<V> it) {
                this.b = i.this.c;
                this.f142a = it;
            }

            void a() {
                i.this.a();
                if (i.this.c != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f142a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f142a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f142a.remove();
                d.b(d.this);
                i.this.b();
            }

            Iterator<V> b() {
                a();
                return this.f142a;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            a();
            boolean zIsEmpty = this.c.isEmpty();
            boolean zAdd = this.c.add(v);
            if (zAdd) {
                d.c(d.this);
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        d<K, V>.i f() {
            return this.d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.c.addAll(collection);
            if (zAddAll) {
                d.a(d.this, this.c.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            a();
            return this.c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            a();
            return this.c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.c.clear();
            d.b(d.this, size);
            b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            a();
            boolean zRemove = this.c.remove(obj);
            if (zRemove) {
                d.b(d.this);
                b();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.c.removeAll(collection);
            if (zRemoveAll) {
                d.a(d.this, this.c.size() - size);
                b();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.c.retainAll(collection);
            if (zRetainAll) {
                d.a(d.this, this.c.size() - size);
                b();
            }
            return zRetainAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> c(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    class j extends d<K, V>.i implements List<V> {
        j(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k, list, iVar);
        }

        List<V> g() {
            return (List) e();
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i, collection);
            if (zAddAll) {
                d.a(d.this, e().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            a();
            return g().get(i);
        }

        @Override // java.util.List
        public V set(int i, V v) {
            a();
            return g().set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            a();
            boolean zIsEmpty = e().isEmpty();
            g().add(i, v);
            d.c(d.this);
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public V remove(int i) {
            a();
            V vRemove = g().remove(i);
            d.b(d.this);
            b();
            return vRemove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            a();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            a();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            a();
            return new a(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            a();
            return d.this.a(c(), g().subList(i, i2), f() == null ? this : f());
        }

        private class a extends d<K, V>.i.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i) {
                super(j.this.g().listIterator(i));
            }

            private ListIterator<V> c() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                c().set(v);
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = j.this.isEmpty();
                c().add(v);
                d.c(d.this);
                if (zIsEmpty) {
                    j.this.d();
                }
            }
        }
    }

    private class f extends d<K, V>.j implements RandomAccess {
        f(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k, list, iVar);
        }
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Set<K> f() {
        return new c(this.f133a);
    }

    final Set<K> g() {
        Map<K, Collection<V>> map = this.f133a;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f133a);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f133a);
        }
        return new c(this.f133a);
    }

    private class c extends ab.c<K, Collection<V>> {
        c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = c().entrySet().iterator();
            return new Iterator<K>() { // from class: com.applovin.exoplayer2.common.a.d.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NullableDecl
                Map.Entry<K, Collection<V>> f140a;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f140a = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    com.applovin.exoplayer2.common.a.j.a(this.f140a != null);
                    Collection<V> value = this.f140a.getValue();
                    it.remove();
                    d.b(d.this, value.size());
                    value.clear();
                    this.f140a = null;
                }
            };
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = c().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.b(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }

        @Override // com.applovin.exoplayer2.common.a.ab.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }
    }

    private class h extends d<K, V>.c implements SortedSet<K> {
        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(b().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(b().tailMap(k));
        }
    }

    class e extends d<K, V>.h implements NavigableSet<K> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.exoplayer2.common.a.d.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return b().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return b().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return b().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return b().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) y.c(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) y.c(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new e(b().headMap(k, z));
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(b().subMap(k, z, k2, z2));
        }

        @Override // com.applovin.exoplayer2.common.a.d.h, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new e(b().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        Collection collection = (Collection) ab.c(this.f133a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.b -= size;
        }
    }

    private abstract class b<T> implements Iterator<T> {
        final Iterator<Map.Entry<K, Collection<V>>> b;

        @NullableDecl
        K c = null;

        @MonotonicNonNullDecl
        Collection<V> d = null;
        Iterator<V> e = y.c();

        abstract T a(K k, V v);

        b() {
            this.b = d.this.f133a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext() || this.e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.b.next();
                this.c = next.getKey();
                Collection<V> value = next.getValue();
                this.d = value;
                this.e = value.iterator();
            }
            return a(this.c, this.e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.e.remove();
            if (this.d.isEmpty()) {
                this.b.remove();
            }
            d.b(d.this);
        }
    }

    @Override // com.applovin.exoplayer2.common.a.f, com.applovin.exoplayer2.common.a.ac
    public Collection<V> h() {
        return super.h();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Collection<V> i() {
        return new f.c();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Iterator<V> j() {
        return new d<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.d.1
            @Override // com.applovin.exoplayer2.common.a.d.b
            V a(K k, V v) {
                return v;
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    public Collection<Map.Entry<K, V>> k() {
        return super.k();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Collection<Map.Entry<K, V>> l() {
        if (this instanceof ap) {
            return new f.b();
        }
        return new f.a();
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Iterator<Map.Entry<K, V>> m() {
        return new d<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.d.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.applovin.exoplayer2.common.a.d.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(K k, V v) {
                return ab.a(k, v);
            }
        };
    }

    @Override // com.applovin.exoplayer2.common.a.f
    Map<K, Collection<V>> n() {
        return new a(this.f133a);
    }

    final Map<K, Collection<V>> o() {
        Map<K, Collection<V>> map = this.f133a;
        if (map instanceof NavigableMap) {
            return new C0014d((NavigableMap) this.f133a);
        }
        if (map instanceof SortedMap) {
            return new g((SortedMap) this.f133a);
        }
        return new a(this.f133a);
    }

    private class a extends ab.e<K, Collection<V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final transient Map<K, Collection<V>> f136a;

        a(Map<K, Collection<V>> map) {
            this.f136a = map;
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new C0013a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ab.b(this.f136a, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) ab.a((Map) this.f136a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a(obj, (Collection) collection);
        }

        @Override // com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f136a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f136a.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionC = d.this.c();
            collectionC.addAll(collectionRemove);
            d.b(d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionC;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f136a.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f136a.hashCode();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f136a.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f136a == d.this.f133a) {
                d.this.e();
            } else {
                y.d(new b());
            }
        }

        Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return ab.a(key, d.this.a((Object) key, (Collection) entry.getValue()));
        }

        /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.d$a$a, reason: collision with other inner class name */
        class C0013a extends ab.b<K, Collection<V>> {
            C0013a() {
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b
            Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return k.a(a.this.f136a.entrySet(), obj);
            }

            @Override // com.applovin.exoplayer2.common.a.ab.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.e(((Map.Entry) obj).getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f138a;

            @NullableDecl
            Collection<V> b;

            b() {
                this.f138a = a.this.f136a.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f138a.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f138a.next();
                this.b = next.getValue();
                return a.this.a((Map.Entry) next);
            }

            @Override // java.util.Iterator
            public void remove() {
                com.applovin.exoplayer2.common.a.j.a(this.b != null);
                this.f138a.remove();
                d.b(d.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }
    }

    private class g extends d<K, V>.a implements SortedMap<K, Collection<V>> {

        @MonotonicNonNullDecl
        SortedSet<K> d;

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> g() {
            return (SortedMap) this.f136a;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return g().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(g().headMap(k));
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(g().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(g().tailMap(k));
        }

        @Override // com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetH = h();
            this.d = sortedSetH;
            return sortedSetH;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.exoplayer2.common.a.ab.e
        /* JADX INFO: renamed from: e */
        public SortedSet<K> h() {
            return new h(g());
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.d$d, reason: collision with other inner class name */
    class C0014d extends d<K, V>.g implements NavigableMap<K, Collection<V>> {
        C0014d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.exoplayer2.common.a.d.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = g().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return a((Map.Entry) entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return g().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = g().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return a((Map.Entry) entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return g().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = g().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a((Map.Entry) entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return g().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = g().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return a((Map.Entry) entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return g().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a((Map.Entry) entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a((Map.Entry) entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a((Iterator) entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return a((Iterator) descendingMap().entrySet().iterator());
        }

        Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionC = d.this.c();
            collectionC.addAll(next.getValue());
            it.remove();
            return ab.a(next.getKey(), d.this.a(collectionC));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C0014d(g().descendingMap());
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.d.a, com.applovin.exoplayer2.common.a.ab.e, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.applovin.exoplayer2.common.a.d.g, com.applovin.exoplayer2.common.a.ab.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return new e(g());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return f();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C0014d(g().subMap(k, z, k2, z2));
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C0014d(g().headMap(k, z));
        }

        @Override // com.applovin.exoplayer2.common.a.d.g, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C0014d(g().tailMap(k, z));
        }
    }
}
