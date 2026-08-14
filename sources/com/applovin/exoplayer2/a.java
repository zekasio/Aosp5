package com.applovin.exoplayer2;

import android.util.Pair;
import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ba {
    private final int c;
    private final com.applovin.exoplayer2.h.z d;
    private final boolean e;

    protected abstract int b(int i);

    protected abstract int c(int i);

    protected abstract int d(Object obj);

    protected abstract ba d(int i);

    protected abstract int e(int i);

    protected abstract int f(int i);

    protected abstract Object g(int i);

    public static Object a(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public a(boolean z, com.applovin.exoplayer2.h.z zVar) {
        this.e = z;
        this.d = zVar;
        this.c = zVar.a();
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iC = c(i);
        int iF = f(iC);
        int iA = d(iC).a(i - iF, i2 != 2 ? i2 : 0, z);
        if (iA != -1) {
            return iF + iA;
        }
        int iA2 = a(iC, z);
        while (iA2 != -1 && d(iA2).d()) {
            iA2 = a(iA2, z);
        }
        if (iA2 != -1) {
            return f(iA2) + d(iA2).b(z);
        }
        if (i2 == 2) {
            return b(z);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(int i, int i2, boolean z) {
        if (this.e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iC = c(i);
        int iF = f(iC);
        int iB = d(iC).b(i - iF, i2 != 2 ? i2 : 0, z);
        if (iB != -1) {
            return iF + iB;
        }
        int iB2 = b(iC, z);
        while (iB2 != -1 && d(iB2).d()) {
            iB2 = b(iB2, z);
        }
        if (iB2 != -1) {
            return f(iB2) + d(iB2).a(z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(boolean z) {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int iB = z ? this.d.b() : i - 1;
        while (d(iB).d()) {
            iB = b(iB, z);
            if (iB == -1) {
                return -1;
            }
        }
        return f(iB) + d(iB).a(z);
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int iC = z ? this.d.c() : 0;
        while (d(iC).d()) {
            iC = a(iC, z);
            if (iC == -1) {
                return -1;
            }
        }
        return f(iC) + d(iC).b(z);
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.c a(int i, ba.c cVar, long j) {
        int iC = c(i);
        int iF = f(iC);
        int iE = e(iC);
        d(iC).a(i - iF, cVar, j);
        Object objG = g(iC);
        if (!ba.c.f91a.equals(cVar.b)) {
            objG = a(objG, cVar.b);
        }
        cVar.b = objG;
        cVar.p += iE;
        cVar.q += iE;
        return cVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(Object obj, ba.a aVar) {
        Object objA = a(obj);
        Object objB = b(obj);
        int iD = d(objA);
        int iF = f(iD);
        d(iD).a(objB, aVar);
        aVar.c += iF;
        aVar.b = obj;
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(int i, ba.a aVar, boolean z) {
        int iB = b(i);
        int iF = f(iB);
        d(iB).a(i - e(iB), aVar, z);
        aVar.c += iF;
        if (z) {
            aVar.b = a(g(iB), com.applovin.exoplayer2.l.a.b(aVar.b));
        }
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final int c(Object obj) {
        int iC;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objA = a(obj);
        Object objB = b(obj);
        int iD = d(objA);
        if (iD == -1 || (iC = d(iD).c(objB)) == -1) {
            return -1;
        }
        return e(iD) + iC;
    }

    @Override // com.applovin.exoplayer2.ba
    public final Object a(int i) {
        int iB = b(i);
        return a(g(iB), d(iB).a(i - e(iB)));
    }

    private int a(int i, boolean z) {
        if (z) {
            return this.d.a(i);
        }
        if (i < this.c - 1) {
            return i + 1;
        }
        return -1;
    }

    private int b(int i, boolean z) {
        if (z) {
            return this.d.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}
