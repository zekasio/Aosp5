package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class ao<T> extends ai<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ai<? super T> f123a;

    ao(ai<? super T> aiVar) {
        this.f123a = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f123a.compare(t2, t);
    }

    @Override // com.applovin.exoplayer2.common.a.ai
    public <S extends T> ai<S> a() {
        return this.f123a;
    }

    public int hashCode() {
        return -this.f123a.hashCode();
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ao) {
            return this.f123a.equals(((ao) obj).f123a);
        }
        return false;
    }

    public String toString() {
        return this.f123a + ".reverse()";
    }
}
