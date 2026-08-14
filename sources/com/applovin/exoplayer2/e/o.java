package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f379a;
    private final long b;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public o(p pVar, long j) {
        this.f379a = pVar;
        this.b = j;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f379a.a();
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        com.applovin.exoplayer2.l.a.a(this.f379a.k);
        long[] jArr = this.f379a.k.f381a;
        long[] jArr2 = this.f379a.k.b;
        int iA = ai.a(jArr, this.f379a.a(j), true, false);
        w wVarA = a(iA == -1 ? 0L : jArr[iA], iA != -1 ? jArr2[iA] : 0L);
        if (wVarA.b == j || iA == jArr.length - 1) {
            return new v.a(wVarA);
        }
        int i = iA + 1;
        return new v.a(wVarA, a(jArr[i], jArr2[i]));
    }

    private w a(long j, long j2) {
        return new w((j * 1000000) / ((long) this.f379a.e), this.b + j2);
    }
}
