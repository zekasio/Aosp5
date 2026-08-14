package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f269a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f269a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int b(long j) {
        return ai.a(this.e, j, true, true);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        int iB = b(j);
        w wVar = new w(this.e[iB], this.c[iB]);
        if (wVar.b >= j || iB == this.f269a - 1) {
            return new v.a(wVar);
        }
        int i = iB + 1;
        return new v.a(wVar, new w(this.e[i], this.c[i]));
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f269a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
