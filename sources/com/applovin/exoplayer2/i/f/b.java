package com.applovin.exoplayer2.i.f;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.i.a[] f523a;
    private final long[] b;

    public b(com.applovin.exoplayer2.i.a[] aVarArr, long[] jArr) {
        this.f523a = aVarArr;
        this.b = jArr;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j) {
        int iB = ai.b(this.b, j, false, false);
        if (iB < this.b.length) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.b.length;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i >= 0);
        com.applovin.exoplayer2.l.a.a(i < this.b.length);
        return this.b[i];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j) {
        int iA = ai.a(this.b, j, true, false);
        if (iA == -1 || this.f523a[iA] == com.applovin.exoplayer2.i.a.f486a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.f523a[iA]);
    }
}
