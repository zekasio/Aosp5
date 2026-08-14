package com.applovin.exoplayer2.j;

import android.util.Pair;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f563a;

    protected abstract Pair<at[], d[]> a(a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f564a;
        private final String[] b;
        private final int[] c;
        private final ad[] d;
        private final int[] e;
        private final int[][][] f;
        private final ad g;

        a(String[] strArr, int[] iArr, ad[] adVarArr, int[] iArr2, int[][][] iArr3, ad adVar) {
            this.b = strArr;
            this.c = iArr;
            this.d = adVarArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = adVar;
            this.f564a = iArr.length;
        }

        public int a() {
            return this.f564a;
        }

        public int a(int i) {
            return this.c[i];
        }

        public ad b(int i) {
            return this.d[i];
        }
    }

    @Override // com.applovin.exoplayer2.j.j
    public final void a(Object obj) {
        this.f563a = (a) obj;
    }

    @Override // com.applovin.exoplayer2.j.j
    public final k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p {
        int[] iArrA;
        int[] iArr = new int[asVarArr.length + 1];
        int length = asVarArr.length + 1;
        ac[][] acVarArr = new ac[length][];
        int[][][] iArr2 = new int[asVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            acVarArr[i] = new ac[adVar.b];
            iArr2[i] = new int[adVar.b][];
        }
        int[] iArrA2 = a(asVarArr);
        for (int i2 = 0; i2 < adVar.b; i2++) {
            ac acVarA = adVar.a(i2);
            int iA = a(asVarArr, acVarA, iArr, u.e(acVarA.a(0).l) == 5);
            if (iA == asVarArr.length) {
                iArrA = new int[acVarA.f457a];
            } else {
                iArrA = a(asVarArr[iA], acVarA);
            }
            int i3 = iArr[iA];
            acVarArr[iA][i3] = acVarA;
            iArr2[iA][i3] = iArrA;
            iArr[iA] = i3 + 1;
        }
        ad[] adVarArr = new ad[asVarArr.length];
        String[] strArr = new String[asVarArr.length];
        int[] iArr3 = new int[asVarArr.length];
        for (int i4 = 0; i4 < asVarArr.length; i4++) {
            int i5 = iArr[i4];
            adVarArr[i4] = new ad((ac[]) ai.a(acVarArr[i4], i5));
            iArr2[i4] = (int[][]) ai.a(iArr2[i4], i5);
            strArr[i4] = asVarArr[i4].y();
            iArr3[i4] = asVarArr[i4].a();
        }
        a aVar2 = new a(strArr, iArr3, adVarArr, iArrA2, iArr2, new ad((ac[]) ai.a(acVarArr[asVarArr.length], iArr[asVarArr.length])));
        Pair<at[], d[]> pairA = a(aVar2, iArr2, iArrA2, aVar, baVar);
        return new k((at[]) pairA.first, (d[]) pairA.second, aVar2);
    }

    private static int a(as[] asVarArr, ac acVar, int[] iArr, boolean z) throws com.applovin.exoplayer2.p {
        int length = asVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < asVarArr.length; i2++) {
            as asVar = asVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < acVar.f457a; i3++) {
                iMax = Math.max(iMax, as.CC.c(asVar.a(acVar.a(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] a(as asVar, ac acVar) throws com.applovin.exoplayer2.p {
        int[] iArr = new int[acVar.f457a];
        for (int i = 0; i < acVar.f457a; i++) {
            iArr[i] = asVar.a(acVar.a(i));
        }
        return iArr;
    }

    private static int[] a(as[] asVarArr) throws com.applovin.exoplayer2.p {
        int length = asVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = asVarArr[i].o();
        }
        return iArr;
    }
}
