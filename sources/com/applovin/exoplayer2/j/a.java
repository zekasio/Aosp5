package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ad;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.l.q;
import com.loopj.android.http.AsyncHttpClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.exoplayer2.j.b {
    private final com.applovin.exoplayer2.k.d d;
    private final long e;
    private final long f;
    private final long g;
    private final float h;
    private final float i;
    private final s<C0040a> j;
    private final com.applovin.exoplayer2.l.d k;
    private float l;
    private int m;
    private int n;
    private long o;
    private com.applovin.exoplayer2.h.b.b p;

    public static class b implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f552a;
        private final int b;
        private final int c;
        private final float d;
        private final float e;
        private final com.applovin.exoplayer2.l.d f;

        public b() {
            this(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT, 25000, 25000, 0.7f, 0.75f, com.applovin.exoplayer2.l.d.f613a);
        }

        public b(int i, int i2, int i3, float f, float f2, com.applovin.exoplayer2.l.d dVar) {
            this.f552a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = f2;
            this.f = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.j.d.b
        public final d[] a(d.a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar) {
            d dVarA;
            s sVarB = a.b(aVarArr);
            d[] dVarArr = new d[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                d.a aVar2 = aVarArr[i];
                if (aVar2 != null && aVar2.b.length != 0) {
                    if (aVar2.b.length == 1) {
                        dVarA = new e(aVar2.f562a, aVar2.b[0], aVar2.c);
                    } else {
                        dVarA = a(aVar2.f562a, aVar2.b, aVar2.c, dVar, (s) sVarB.get(i));
                    }
                    dVarArr[i] = dVarA;
                }
            }
            return dVarArr;
        }

        protected a a(ac acVar, int[] iArr, int i, com.applovin.exoplayer2.k.d dVar, s<C0040a> sVar) {
            return new a(acVar, iArr, i, dVar, this.f552a, this.b, this.c, this.d, this.e, sVar, this.f);
        }
    }

    protected a(ac acVar, int[] iArr, int i, com.applovin.exoplayer2.k.d dVar, long j, long j2, long j3, float f, float f2, List<C0040a> list, com.applovin.exoplayer2.l.d dVar2) {
        super(acVar, iArr, i);
        if (j3 < j) {
            q.c("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.d = dVar;
        this.e = j * 1000;
        this.f = j2 * 1000;
        this.g = j3 * 1000;
        this.h = f;
        this.i = f2;
        this.j = s.a((Collection) list);
        this.k = dVar2;
        this.l = 1.0f;
        this.n = 0;
        this.o = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a() {
        this.o = -9223372036854775807L;
        this.p = null;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void b() {
        this.p = null;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a(float f) {
        this.l = f;
    }

    @Override // com.applovin.exoplayer2.j.d
    public int c() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s<s<C0040a>> b(d.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (d.a aVar : aVarArr) {
            if (aVar != null && aVar.b.length > 1) {
                s.a aVarI = s.i();
                aVarI.a(new C0040a(0L, 0L));
                arrayList.add(aVarI);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrC = c(aVarArr);
        int[] iArr = new int[jArrC.length];
        long[] jArr = new long[jArrC.length];
        for (int i = 0; i < jArrC.length; i++) {
            long[] jArr2 = jArrC[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        s<Integer> sVarA = a(jArrC);
        for (int i2 = 0; i2 < sVarA.size(); i2++) {
            int iIntValue = sVarA.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrC[iIntValue][i3];
            a(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        a(arrayList, jArr);
        s.a aVarI2 = s.i();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            s.a aVar2 = (s.a) arrayList.get(i5);
            aVarI2.a(aVar2 == null ? s.g() : aVar2.a());
        }
        return aVarI2.a();
    }

    private static long[][] c(d.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            d.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                for (int i2 = 0; i2 < aVar.b.length; i2++) {
                    jArr[i][i2] = aVar.f562a.a(aVar.b[i2]).h;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static s<Integer> a(long[][] jArr) {
        com.applovin.exoplayer2.common.a.ac acVarB = ad.a().b().b();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    acVarB.a(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return s.a(acVarB.h());
    }

    private static void a(List<s.a<C0040a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            s.a<C0040a> aVar = list.get(i);
            if (aVar != null) {
                aVar.a(new C0040a(j, jArr[i]));
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.j.a$a, reason: collision with other inner class name */
    public static final class C0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f551a;
        public final long b;

        public C0040a(long j, long j2) {
            this.f551a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0040a)) {
                return false;
            }
            C0040a c0040a = (C0040a) obj;
            return this.f551a == c0040a.f551a && this.b == c0040a.b;
        }

        public int hashCode() {
            return (((int) this.f551a) * 31) + ((int) this.b);
        }
    }
}
