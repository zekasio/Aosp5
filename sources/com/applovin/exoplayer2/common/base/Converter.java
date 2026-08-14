package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    protected abstract A doBackward(B b2);

    protected abstract B doForward(A a2);

    protected Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    @NullableDecl
    B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a2));
    }

    @NullableDecl
    A correctedDoBackward(@NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b2));
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1
            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1.1
                    private final Iterator<? extends A> b;

                    {
                        this.b = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.b.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.b.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.b.remove();
                    }
                };
            }
        };
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        d dVar = new d(this);
        this.reverse = dVar;
        return dVar;
    }

    private static final class d<A, B> extends Converter<B, A> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Converter<A, B> f207a;

        d(Converter<A, B> converter) {
            this.f207a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected A doForward(B b) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected B doBackward(A a2) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        A correctedDoForward(@NullableDecl B b) {
            return this.f207a.correctedDoBackward(b);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        B correctedDoBackward(@NullableDecl A a2) {
            return this.f207a.correctedDoForward(a2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter<A, B> reverse() {
            return this.f207a;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof d) {
                return this.f207a.equals(((d) obj).f207a);
            }
            return false;
        }

        public int hashCode() {
            return this.f207a.hashCode() ^ (-1);
        }

        public String toString() {
            return this.f207a + ".reverse()";
        }
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new a(this, (Converter) Preconditions.checkNotNull(converter));
    }

    private static final class a<A, B, C> extends Converter<A, C> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Converter<A, B> f204a;
        final Converter<B, C> b;

        a(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f204a = converter;
            this.b = converter2;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected C doForward(A a2) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected A doBackward(C c) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        C correctedDoForward(@NullableDecl A a2) {
            return (C) this.b.correctedDoForward(this.f204a.correctedDoForward(a2));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        A correctedDoBackward(@NullableDecl C c) {
            return (A) this.f204a.correctedDoBackward(this.b.correctedDoBackward(c));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f204a.equals(aVar.f204a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.f204a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return this.f204a + ".andThen(" + this.b + ")";
        }
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new b(function, function2);
    }

    private static final class b<A, B> extends Converter<A, B> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function<? super A, ? extends B> f205a;
        private final Function<? super B, ? extends A> b;

        private b(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f205a = (Function) Preconditions.checkNotNull(function);
            this.b = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected B doForward(A a2) {
            return this.f205a.apply(a2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected A doBackward(B b) {
            return this.b.apply(b);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f205a.equals(bVar.f205a) && this.b.equals(bVar.b);
        }

        public int hashCode() {
            return (this.f205a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f205a + ", " + this.b + ")";
        }
    }

    public static <T> Converter<T, T> identity() {
        return c.f206a;
    }

    private static final class c<T> extends Converter<T, T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f206a = new c();

        @Override // com.applovin.exoplayer2.common.base.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> reverse() {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected T doBackward(T t) {
            return t;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected T doForward(T t) {
            return t;
        }

        private c() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }
    }
}
