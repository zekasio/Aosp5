package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class Equivalence<T> {
    protected abstract boolean doEquivalent(T t, T t2);

    protected abstract int doHash(T t);

    protected Equivalence() {
    }

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(s);
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @NullableDecl
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
        return new b(this, t);
    }

    private static final class b<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Equivalence<T> f209a;

        @NullableDecl
        private final T b;

        b(Equivalence<T> equivalence, @NullableDecl T t) {
            this.f209a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.b = t;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            return this.f209a.equivalent(t, this.b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f209a.equals(bVar.f209a) && Objects.equal(this.b, bVar.b);
        }

        public int hashCode() {
            return Objects.hashCode(this.f209a, this.b);
        }

        public String toString() {
            return this.f209a + ".equivalentTo(" + this.b + ")";
        }
    }

    public static Equivalence<Object> equals() {
        return a.f208a;
    }

    public static Equivalence<Object> identity() {
        return c.f210a;
    }

    static final class a extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f208a = new a();

        a() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    static final class c extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f210a = new c();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        c() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }
}
