package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
class ak<E> extends s<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final s<Object> f116a = new ak(new Object[0], 0);
    final transient Object[] b;
    private final transient int c;

    @Override // com.applovin.exoplayer2.common.a.q
    int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    boolean f() {
        return false;
    }

    ak(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    Object[] b() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    int d() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q
    int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // java.util.List
    public E get(int i) {
        Preconditions.checkElementIndex(i, this.c);
        return (E) this.b[i];
    }
}
