package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes.dex */
final class ar<E> extends w<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient E f128a;

    @LazyInit
    private transient int b;

    @Override // com.applovin.exoplayer2.common.a.q
    boolean f() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    ar(E e) {
        this.f128a = (E) Preconditions.checkNotNull(e);
    }

    ar(E e, int i) {
        this.f128a = e;
        this.b = i;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f128a.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return y.a(this.f128a);
    }

    @Override // com.applovin.exoplayer2.common.a.w
    s<E> i() {
        return s.a(this.f128a);
    }

    @Override // com.applovin.exoplayer2.common.a.q
    int a(Object[] objArr, int i) {
        objArr[i] = this.f128a;
        return i + 1;
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f128a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    boolean h() {
        return this.b != 0;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.f128a.toString() + ']';
    }
}
