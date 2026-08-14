package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f291a;
    private final long[] b;
    private final long c;
    private final long d;

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    public static f a(long j, long j2, r.a aVar, y yVar) {
        int iH;
        yVar.e(10);
        int iQ = yVar.q();
        if (iQ <= 0) {
            return null;
        }
        int i = aVar.d;
        long jD = ai.d(iQ, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int i2 = yVar.i();
        int i3 = yVar.i();
        int i4 = yVar.i();
        yVar.e(2);
        long j3 = j2 + ((long) aVar.c);
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i5 = 0;
        long j4 = j2;
        while (i5 < i2) {
            int i6 = i3;
            long j5 = j3;
            jArr[i5] = (((long) i5) * jD) / ((long) i2);
            jArr2[i5] = Math.max(j4, j5);
            if (i4 == 1) {
                iH = yVar.h();
            } else if (i4 == 2) {
                iH = yVar.i();
            } else if (i4 == 3) {
                iH = yVar.m();
            } else {
                if (i4 != 4) {
                    return null;
                }
                iH = yVar.w();
            }
            j4 += (long) (iH * i6);
            i5++;
            j3 = j5;
            i3 = i6;
        }
        if (j != -1 && j != j4) {
            q.c("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new f(jArr, jArr2, jD, j4);
    }

    private f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f291a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        int iA = ai.a(this.f291a, j, true, true);
        w wVar = new w(this.f291a[iA], this.b[iA]);
        if (wVar.b >= j || iA == this.f291a.length - 1) {
            return new v.a(wVar);
        }
        int i = iA + 1;
        return new v.a(wVar, new w(this.f291a[i], this.b[i]));
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j) {
        return this.f291a[ai.a(this.b, j, true, true)];
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.d;
    }
}
