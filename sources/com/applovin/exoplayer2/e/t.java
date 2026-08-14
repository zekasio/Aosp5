package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f385a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public t(long[] jArr, long[] jArr2, long j) {
        com.applovin.exoplayer2.l.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f385a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f385a = jArr;
            this.b = jArr2;
        }
        this.c = j;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        if (!this.d) {
            return new v.a(w.f389a);
        }
        int iA = ai.a(this.b, j, true, true);
        w wVar = new w(this.b[iA], this.f385a[iA]);
        if (wVar.b == j || iA == this.b.length - 1) {
            return new v.a(wVar);
        }
        int i = iA + 1;
        return new v.a(wVar, new w(this.b[i], this.f385a[i]));
    }
}
