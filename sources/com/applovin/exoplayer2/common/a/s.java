package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.q;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<E> extends q<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ay<Object> f162a = new b(ak.f116a, 0);

    @Override // com.applovin.exoplayer2.common.a.q
    public final s<E> e() {
        return this;
    }

    public static <E> s<E> g() {
        return (s<E>) ak.f116a;
    }

    public static <E> s<E> a(E e) {
        return c(e);
    }

    public static <E> s<E> a(E e, E e2) {
        return c(e, e2);
    }

    public static <E> s<E> a(E e, E e2, E e3, E e4, E e5) {
        return c(e, e2, e3, e4, e5);
    }

    public static <E> s<E> a(E e, E e2, E e3, E e4, E e5, E e6) {
        return c(e, e2, e3, e4, e5, e6);
    }

    public static <E> s<E> a(Collection<? extends E> collection) {
        if (collection instanceof q) {
            s<E> sVarE = ((q) collection).e();
            return sVarE.f() ? b(sVarE.toArray()) : sVarE;
        }
        return c(collection.toArray());
    }

    public static <E> s<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return g();
        }
        return c((Object[]) eArr.clone());
    }

    public static <E> s<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] objArrB = x.b(iterable);
        ah.a(objArrB);
        Arrays.sort(objArrB, comparator);
        return b(objArrB);
    }

    private static <E> s<E> c(Object... objArr) {
        return b(ah.a(objArr));
    }

    static <E> s<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> s<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return g();
        }
        return new ak(objArr, i);
    }

    s() {
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ay<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (ay<E>) f162a;
        }
        return new b(this, i);
    }

    static class b<E> extends com.applovin.exoplayer2.common.a.a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<E> f163a;

        b(s<E> sVar, int i) {
            super(sVar.size(), i);
            this.f163a = sVar;
        }

        @Override // com.applovin.exoplayer2.common.a.a
        protected E a(int i) {
            return this.f163a.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return aa.c(this, obj);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a */
    public s<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return g();
        }
        return b(i, i2);
    }

    s<E> b(int i, int i2) {
        return new c(i, i2 - i);
    }

    class c extends s<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final transient int f164a;
        final transient int b;

        @Override // com.applovin.exoplayer2.common.a.q
        boolean f() {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        public /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        c(int i, int i2) {
            this.f164a = i;
            this.b = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.b;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        Object[] b() {
            return s.this.b();
        }

        @Override // com.applovin.exoplayer2.common.a.q
        int c() {
            return s.this.c() + this.f164a;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        int d() {
            return s.this.c() + this.f164a + this.b;
        }

        @Override // java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, this.b);
            return s.this.get(i + this.f164a);
        }

        @Override // com.applovin.exoplayer2.common.a.s, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.b);
            s sVar = s.this;
            int i3 = this.f164a;
            return sVar.subList(i + i3, i2 + i3);
        }
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.common.a.q
    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return aa.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public static <E> a<E> i() {
        return new a<>();
    }

    public static final class a<E> extends q.a<E> {
        public a() {
            this(4);
        }

        a(int i) {
            super(i);
        }

        @Override // com.applovin.exoplayer2.common.a.q.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            super.a(e);
            return this;
        }

        public s<E> a() {
            this.c = true;
            return s.b(this.f160a, this.b);
        }
    }
}
