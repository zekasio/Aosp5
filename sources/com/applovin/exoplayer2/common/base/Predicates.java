package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class Predicates {

    enum g implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.1
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.2
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.3
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.4
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> Predicate<T> a() {
            return this;
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysTrue() {
        return g.ALWAYS_TRUE.a();
    }

    public static <T> Predicate<T> alwaysFalse() {
        return g.ALWAYS_FALSE.a();
    }

    public static <T> Predicate<T> isNull() {
        return g.IS_NULL.a();
    }

    public static <T> Predicate<T> notNull() {
        return g.NOT_NULL.a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new f(predicate);
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new a(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new a(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new a(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new h(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new h(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new h(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        return t == null ? isNull() : new e(t);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new i(cls);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new c(collection);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new b(predicate, function);
    }

    private static class f<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Predicate<T> f219a;

        f(Predicate<T> predicate) {
            this.f219a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            return !this.f219a.apply(t);
        }

        public int hashCode() {
            return this.f219a.hashCode() ^ (-1);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return this.f219a.equals(((f) obj).f219a);
            }
            return false;
        }

        public String toString() {
            return "Predicates.not(" + this.f219a + ")";
        }
    }

    private static class a<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f214a;

        private a(List<? extends Predicate<? super T>> list) {
            this.f214a = list;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f214a.size(); i++) {
                if (!this.f214a.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f214a.hashCode() + 306654252;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof a) {
                return this.f214a.equals(((a) obj).f214a);
            }
            return false;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f214a);
        }
    }

    private static class h<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f221a;

        private h(List<? extends Predicate<? super T>> list) {
            this.f221a = list;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f221a.size(); i++) {
                if (this.f221a.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f221a.hashCode() + 87855567;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof h) {
                return this.f221a.equals(((h) obj).f221a);
            }
            return false;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f221a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    private static class e<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f218a;

        private e(T t) {
            this.f218a = t;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(T t) {
            return this.f218a.equals(t);
        }

        public int hashCode() {
            return this.f218a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof e) {
                return this.f218a.equals(((e) obj).f218a);
            }
            return false;
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f218a + ")";
        }
    }

    private static class d implements Predicate<Object>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f217a;

        private d(Class<?> cls) {
            this.f217a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
            return this.f217a.isInstance(obj);
        }

        public int hashCode() {
            return this.f217a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof d) && this.f217a == ((d) obj).f217a;
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f217a.getName() + ")";
        }
    }

    private static class i implements Predicate<Class<?>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f222a;

        private i(Class<?> cls) {
            this.f222a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.f222a.isAssignableFrom(cls);
        }

        public int hashCode() {
            return this.f222a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof i) && this.f222a == ((i) obj).f222a;
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f222a.getName() + ")";
        }
    }

    private static class c<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<?> f216a;

        private c(Collection<?> collection) {
            this.f216a = (Collection) Preconditions.checkNotNull(collection);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            try {
                return this.f216a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return this.f216a.equals(((c) obj).f216a);
            }
            return false;
        }

        public int hashCode() {
            return this.f216a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f216a + ")";
        }
    }

    private static class b<A, B> implements Predicate<A>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Predicate<B> f215a;
        final Function<A, ? extends B> b;

        private b(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f215a = (Predicate) Preconditions.checkNotNull(predicate);
            this.b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl A a2) {
            return this.f215a.apply(this.b.apply(a2));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.f215a.equals(bVar.f215a);
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.f215a.hashCode();
        }

        public String toString() {
            return this.f215a + "(" + this.b + ")";
        }
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }
}
