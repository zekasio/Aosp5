package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
class r<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NullableDecl
    final K f161a;

    @NullableDecl
    final V b;

    r(@NullableDecl K k, @NullableDecl V v) {
        this.f161a = k;
        this.b = v;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f161a;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
