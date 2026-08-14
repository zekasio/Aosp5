package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<Object> f230a = new a<>();

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    @NullableDecl
    public T orNull() {
        return null;
    }

    static <T> Optional<T> a() {
        return f230a;
    }

    private a() {
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(T t) {
        return (T) Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        return (T) Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }
}
