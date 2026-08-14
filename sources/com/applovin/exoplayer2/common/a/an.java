package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class an extends ai<Comparable> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final an f122a = new an();

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.applovin.exoplayer2.common.a.ai
    public <S extends Comparable> ai<S> a() {
        return ai.b();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private an() {
    }
}
