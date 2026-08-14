package com.applovin.exoplayer2.common.a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class am<E> extends w<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final am<Object> f121a = new am<>(new Object[0], 0, null, 0, 0);
    final transient Object[] b;
    final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    @Override // com.applovin.exoplayer2.common.a.q
    int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    boolean f() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    boolean h() {
        return true;
    }

    am(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = p.a(obj);
        while (true) {
            int i = iA & this.d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a */
    public ax<E> iterator() {
        return e().iterator();
    }

    @Override // com.applovin.exoplayer2.common.a.q
    Object[] b() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    int d() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return i + this.f;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    s<E> i() {
        return s.b(this.b, this.f);
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.e;
    }
}
