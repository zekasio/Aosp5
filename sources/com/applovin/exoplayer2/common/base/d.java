package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class d<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f234a;

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    d(T t) {
        this.f234a = t;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T get() {
        return this.f234a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f234a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f234a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public T orNull() {
        return this.f234a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f234a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f234a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof d) {
            return this.f234a.equals(((d) obj).f234a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f234a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f234a + ")";
    }
}
