package com.applovin.exoplayer2.i.i;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f537a;

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return 1;
    }

    public b(List<com.applovin.exoplayer2.i.a> list) {
        this.f537a = Collections.unmodifiableList(list);
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j) {
        return j >= 0 ? this.f537a : Collections.emptyList();
    }
}
