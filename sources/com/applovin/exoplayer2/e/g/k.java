package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final v f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final l[] k;

    public k(int i, int i2, long j, long j2, long j3, v vVar, int i3, l[] lVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f313a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = vVar;
        this.g = i3;
        this.k = lVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public l a(int i) {
        l[] lVarArr = this.k;
        if (lVarArr == null) {
            return null;
        }
        return lVarArr[i];
    }
}
