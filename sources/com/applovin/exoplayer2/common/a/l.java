package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    transient long[] f147a;

    @MonotonicNonNullDecl
    transient Object[] b;

    @MonotonicNonNullDecl
    transient Object[] c;
    transient float d;
    transient int e;

    @MonotonicNonNullDecl
    private transient int[] f;
    private transient int g;
    private transient int h;

    @MonotonicNonNullDecl
    private transient Set<K> i;

    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> j;

    @MonotonicNonNullDecl
    private transient Collection<V> k;

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & ((long) i));
    }

    private static int b(long j) {
        return (int) j;
    }

    int a(int i, int i2) {
        return i - 1;
    }

    void b(int i) {
    }

    public static <K, V> l<K, V> a() {
        return new l<>();
    }

    public static <K, V> l<K, V> a(int i) {
        return new l<>(i);
    }

    l() {
        a(3, 1.0f);
    }

    l(int i) {
        this(i, 1.0f);
    }

    l(int i, float f) {
        a(i, f);
    }

    void a(int i, float f) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int iA = p.a(i, f);
        this.f = f(iA);
        this.d = f;
        this.b = new Object[i];
        this.c = new Object[i];
        this.f147a = g(i);
        this.g = Math.max(1, (int) (iA * f));
    }

    private static int[] f(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] g(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private int i() {
        return this.f.length - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f147a;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int iA = p.a(k);
        int i = i() & iA;
        int i2 = this.h;
        int[] iArr = this.f;
        int i3 = iArr[i];
        if (i3 == -1) {
            iArr[i] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (a(j) == iA && Objects.equal(k, objArr[i3])) {
                    V v2 = (V) objArr2[i3];
                    objArr2[i3] = v;
                    b(i3);
                    return v2;
                }
                int iB = b(j);
                if (iB == -1) {
                    jArr[i3] = a(j, i2);
                    break;
                }
                i3 = iB;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        h(i4);
        a(i2, k, v, iA);
        this.h = i4;
        if (i2 >= this.g) {
            i(this.f.length * 2);
        }
        this.e++;
        return null;
    }

    void a(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.f147a[i] = (((long) i2) << 32) | 4294967295L;
        this.b[i] = k;
        this.c[i] = v;
    }

    private void h(int i) {
        int length = this.f147a.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                c(iMax);
            }
        }
    }

    void c(int i) {
        this.b = Arrays.copyOf(this.b, i);
        this.c = Arrays.copyOf(this.c, i);
        long[] jArr = this.f147a;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f147a = jArrCopyOf;
    }

    private void i(int i) {
        if (this.f.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.d)) + 1;
        int[] iArrF = f(i);
        long[] jArr = this.f147a;
        int length = iArrF.length - 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            int iA = a(jArr[i3]);
            int i4 = iA & length;
            int i5 = iArrF[i4];
            iArrF[i4] = i3;
            jArr[i3] = (((long) iA) << 32) | (4294967295L & ((long) i5));
        }
        this.g = i2;
        this.f = iArrF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@NullableDecl Object obj) {
        int iA = p.a(obj);
        int iB = this.f[i() & iA];
        while (iB != -1) {
            long j = this.f147a[iB];
            if (a(j) == iA && Objects.equal(obj, this.b[iB])) {
                return iB;
            }
            iB = b(j);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iA = a(obj);
        b(iA);
        if (iA == -1) {
            return null;
        }
        return (V) this.c[iA];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return a(obj, p.a(obj));
    }

    @NullableDecl
    private V a(@NullableDecl Object obj, int i) {
        int i2 = i() & i;
        int i3 = this.f[i2];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (a(this.f147a[i3]) == i && Objects.equal(obj, this.b[i3])) {
                V v = (V) this.c[i3];
                if (i4 == -1) {
                    this.f[i2] = b(this.f147a[i3]);
                } else {
                    long[] jArr = this.f147a;
                    jArr[i4] = a(jArr[i4], b(jArr[i3]));
                }
                d(i3);
                this.h--;
                this.e++;
                return v;
            }
            int iB = b(this.f147a[i3]);
            if (iB == -1) {
                return null;
            }
            i4 = i3;
            i3 = iB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V j(int i) {
        return a(this.b[i], a(this.f147a[i]));
    }

    void d(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.b;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.c;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f147a;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int iA = a(j) & i();
            int[] iArr = this.f;
            int i2 = iArr[iA];
            if (i2 == size) {
                iArr[iA] = i;
                return;
            }
            while (true) {
                long j2 = this.f147a[i2];
                int iB = b(j2);
                if (iB == size) {
                    this.f147a[i2] = a(j2, i);
                    return;
                }
                i2 = iB;
            }
        } else {
            this.b[i] = null;
            this.c[i] = null;
            this.f147a[i] = -1;
        }
    }

    int b() {
        return isEmpty() ? -1 : 0;
    }

    int e(int i) {
        int i2 = i + 1;
        if (i2 < this.h) {
            return i2;
        }
        return -1;
    }

    private abstract class b<T> implements Iterator<T> {
        int b;
        int c;
        int d;

        abstract T a(int i);

        private b() {
            this.b = l.this.e;
            this.c = l.this.b();
            this.d = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.c;
            this.d = i;
            T tA = a(i);
            this.c = l.this.e(this.c);
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.a(this.d >= 0);
            this.b++;
            l.this.j(this.d);
            this.c = l.this.a(this.c, this.d);
            this.d = -1;
        }

        private void a() {
            if (l.this.e != this.b) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.i;
        if (set != null) {
            return set;
        }
        Set<K> setC = c();
        this.i = setC;
        return setC;
    }

    Set<K> c() {
        return new c();
    }

    class c extends AbstractSet<K> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iA = l.this.a(obj);
            if (iA == -1) {
                return false;
            }
            l.this.j(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return l.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }
    }

    Iterator<K> d() {
        return new l<K, V>.b<K>() { // from class: com.applovin.exoplayer2.common.a.l.1
            @Override // com.applovin.exoplayer2.common.a.l.b
            K a(int i) {
                return (K) l.this.b[i];
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setE = e();
        this.j = setE;
        return setE;
    }

    Set<Map.Entry<K, V>> e() {
        return new a();
    }

    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return l.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = l.this.a(entry.getKey());
            return iA != -1 && Objects.equal(l.this.c[iA], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = l.this.a(entry.getKey());
            if (iA == -1 || !Objects.equal(l.this.c[iA], entry.getValue())) {
                return false;
            }
            l.this.j(iA);
            return true;
        }
    }

    Iterator<Map.Entry<K, V>> f() {
        return new l<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.l.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.applovin.exoplayer2.common.a.l.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i) {
                return new d(i);
            }
        };
    }

    final class d extends com.applovin.exoplayer2.common.a.e<K, V> {

        @NullableDecl
        private final K b;
        private int c;

        d(int i) {
            this.b = (K) l.this.b[i];
            this.c = i;
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public K getKey() {
            return this.b;
        }

        private void a() {
            int i = this.c;
            if (i == -1 || i >= l.this.size() || !Objects.equal(this.b, l.this.b[this.c])) {
                this.c = l.this.a(this.b);
            }
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V getValue() {
            a();
            if (this.c == -1) {
                return null;
            }
            return (V) l.this.c[this.c];
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V setValue(V v) {
            a();
            if (this.c == -1) {
                l.this.put(this.b, v);
                return null;
            }
            V v2 = (V) l.this.c[this.c];
            l.this.c[this.c] = v;
            return v2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.h; i++) {
            if (Objects.equal(obj, this.c[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.k;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionG = g();
        this.k = collectionG;
        return collectionG;
    }

    Collection<V> g() {
        return new e();
    }

    class e extends AbstractCollection<V> {
        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return l.this.h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return l.this.h();
        }
    }

    Iterator<V> h() {
        return new l<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.l.3
            @Override // com.applovin.exoplayer2.common.a.l.b
            V a(int i) {
                return (V) l.this.c[i];
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.e++;
        Arrays.fill(this.b, 0, this.h, (Object) null);
        Arrays.fill(this.c, 0, this.h, (Object) null);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.f147a, -1L);
        this.h = 0;
    }
}
