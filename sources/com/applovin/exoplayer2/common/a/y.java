package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    static <T> ax<T> a() {
        return b();
    }

    static <T> ay<T> b() {
        return (ay<T>) a.f174a;
    }

    private enum b implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            j.a(false);
        }
    }

    static <T> Iterator<T> c() {
        return b.INSTANCE;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static String a(Iterator<?> it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    @NullableDecl
    public static <T> T a(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T b(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    static <T> T c(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static void d(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    private static final class a<T> extends com.applovin.exoplayer2.common.a.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ay<Object> f174a = new a(new Object[0], 0, 0, 0);
        private final T[] b;
        private final int c;

        a(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.b = tArr;
            this.c = i;
        }

        @Override // com.applovin.exoplayer2.common.a.a
        protected T a(int i) {
            return this.b[this.c + i];
        }
    }

    public static <T> ax<T> a(@NullableDecl final T t) {
        return new ax<T>() { // from class: com.applovin.exoplayer2.common.a.y.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f173a;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f173a;
            }

            @Override // java.util.Iterator
            public T next() {
                if (this.f173a) {
                    throw new NoSuchElementException();
                }
                this.f173a = true;
                return (T) t;
            }
        };
    }
}
