package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class aw<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f129a;

    abstract T a(F f);

    aw(Iterator<? extends F> it) {
        this.f129a = (Iterator) Preconditions.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f129a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f129a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f129a.remove();
    }
}
