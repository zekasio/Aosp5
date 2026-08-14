package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class i<F, T> extends ai<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Function<F, ? extends T> f146a;
    final ai<T> b;

    i(Function<F, ? extends T> function, ai<T> aiVar) {
        this.f146a = (Function) Preconditions.checkNotNull(function);
        this.b = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(F f, F f2) {
        return this.b.compare(this.f146a.apply(f), this.f146a.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f146a.equals(iVar.f146a) && this.b.equals(iVar.b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f146a, this.b);
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.f146a + ")";
    }
}
