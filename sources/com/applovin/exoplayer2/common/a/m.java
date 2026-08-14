package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class m<T> extends ai<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f155a;

    m(Comparator<T> comparator) {
        this.f155a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f155a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f155a.equals(((m) obj).f155a);
        }
        return false;
    }

    public int hashCode() {
        return this.f155a.hashCode();
    }

    public String toString() {
        return this.f155a.toString();
    }
}
