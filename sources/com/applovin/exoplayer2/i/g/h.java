package com.applovin.exoplayer2.i.g;

import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class h implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f532a;
    private final long[] b;
    private final Map<String, g> c;
    private final Map<String, e> d;
    private final Map<String, String> e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f532a = dVar;
        this.d = map2;
        this.e = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.b = dVar.b();
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
        return this.b[i];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j) {
        return this.f532a.a(j, this.c, this.d, this.e);
    }
}
