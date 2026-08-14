package com.applovin.exoplayer2.i.e;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<List<com.applovin.exoplayer2.i.a>> f521a;
    private final List<Long> b;

    public d(List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        this.f521a = list;
        this.b = list2;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j) {
        int iB = ai.b((List<? extends Comparable<? super Long>>) this.b, Long.valueOf(j), false, false);
        if (iB < this.b.size()) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.b.size();
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i >= 0);
        com.applovin.exoplayer2.l.a.a(i < this.b.size());
        return this.b.get(i).longValue();
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j) {
        int iA = ai.a((List<? extends Comparable<? super Long>>) this.b, Long.valueOf(j), true, false);
        if (iA == -1) {
            return Collections.emptyList();
        }
        return this.f521a.get(iA);
    }
}
