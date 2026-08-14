package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.a.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba f89a = new ba() { // from class: com.applovin.exoplayer2.ba.1
        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public c a(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final g.a<ba> b = new g.a() { // from class: com.applovin.exoplayer2.ba$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return ba.a(bundle);
        }
    };

    public abstract a a(int i, a aVar, boolean z);

    public abstract c a(int i, c cVar, long j);

    public abstract Object a(int i);

    public abstract int b();

    public abstract int c();

    public abstract int c(Object obj);

    public static final class c implements g {

        @Deprecated
        public Object c;
        public Object e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;

        @Deprecated
        public boolean k;
        public ab.e l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f91a = new Object();
        private static final Object t = new Object();
        private static final ab u = new ab.b().a("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();
        public static final g.a<c> s = new g.a() { // from class: com.applovin.exoplayer2.ba$c$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return ba.c.a(bundle);
            }
        };
        public Object b = f91a;
        public ab d = u;

        public c a(Object obj, ab abVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ab.e eVar, long j4, long j5, int i, int i2, long j6) {
            this.b = obj;
            this.d = abVar != null ? abVar : u;
            this.c = (abVar == null || abVar.c == null) ? null : abVar.c.h;
            this.e = obj2;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z;
            this.j = z2;
            this.k = eVar != null;
            this.l = eVar;
            this.n = j4;
            this.o = j5;
            this.p = i;
            this.q = i2;
            this.r = j6;
            this.m = false;
            return this;
        }

        public long a() {
            return h.a(this.n);
        }

        public long b() {
            return this.n;
        }

        public long c() {
            return h.a(this.o);
        }

        public long d() {
            return com.applovin.exoplayer2.l.ai.c(this.h);
        }

        public boolean e() {
            com.applovin.exoplayer2.l.a.b(this.k == (this.l != null));
            return this.l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return com.applovin.exoplayer2.l.ai.a(this.b, cVar.b) && com.applovin.exoplayer2.l.ai.a(this.d, cVar.d) && com.applovin.exoplayer2.l.ai.a(this.e, cVar.e) && com.applovin.exoplayer2.l.ai.a(this.l, cVar.l) && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.b.hashCode()) * 31) + this.d.hashCode()) * 31;
            Object obj = this.e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            ab.e eVar = this.l;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j = this.f;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.g;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.h;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
            long j4 = this.n;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.o;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31;
            long j6 = this.r;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            ab abVar = bundle2 != null ? (ab) ab.g.fromBundle(bundle2) : null;
            long j = bundle.getLong(a(2), -9223372036854775807L);
            long j2 = bundle.getLong(a(3), -9223372036854775807L);
            long j3 = bundle.getLong(a(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(a(5), false);
            boolean z2 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            ab.e eVar = bundle3 != null ? (ab.e) ab.e.g.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(a(8), false);
            long j4 = bundle.getLong(a(9), 0L);
            long j5 = bundle.getLong(a(10), -9223372036854775807L);
            int i = bundle.getInt(a(11), 0);
            int i2 = bundle.getInt(a(12), 0);
            long j6 = bundle.getLong(a(13), 0L);
            c cVar = new c();
            cVar.a(t, abVar, null, j, j2, j3, z, z2, eVar, j4, j5, i, i2, j6);
            cVar.m = z3;
            return cVar;
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    public static final class a implements g {
        public static final g.a<a> g = new g.a() { // from class: com.applovin.exoplayer2.ba$a$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return ba.a.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f90a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        private com.applovin.exoplayer2.h.a.a h = com.applovin.exoplayer2.h.a.a.f454a;

        public a a(Object obj, Object obj2, int i, long j, long j2) {
            return a(obj, obj2, i, j, j2, com.applovin.exoplayer2.h.a.a.f454a, false);
        }

        public a a(Object obj, Object obj2, int i, long j, long j2, com.applovin.exoplayer2.h.a.a aVar, boolean z) {
            this.f90a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.h = aVar;
            this.f = z;
            return this;
        }

        public long a() {
            return this.d;
        }

        public long b() {
            return h.a(this.e);
        }

        public long c() {
            return this.e;
        }

        public int d() {
            return this.h.c;
        }

        public int e() {
            return this.h.f;
        }

        public long a(int i) {
            return this.h.a(i).f455a;
        }

        public int b(int i) {
            return this.h.a(i).a();
        }

        public int a(int i, int i2) {
            return this.h.a(i).a(i2);
        }

        public boolean c(int i) {
            return !this.h.a(i).c();
        }

        public int a(long j) {
            return this.h.a(j, this.d);
        }

        public int b(long j) {
            return this.h.b(j, this.d);
        }

        public int d(int i) {
            return this.h.a(i).b;
        }

        public long b(int i, int i2) {
            a.C0031a c0031aA = this.h.a(i);
            if (c0031aA.b != -1) {
                return c0031aA.e[i2];
            }
            return -9223372036854775807L;
        }

        public long f() {
            return this.h.d;
        }

        public boolean e(int i) {
            return this.h.a(i).g;
        }

        public long f(int i) {
            return this.h.a(i).f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            a aVar = (a) obj;
            return com.applovin.exoplayer2.l.ai.a(this.f90a, aVar.f90a) && com.applovin.exoplayer2.l.ai.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && com.applovin.exoplayer2.l.ai.a(this.h, aVar.h);
        }

        public int hashCode() {
            Object obj = this.f90a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.h.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            com.applovin.exoplayer2.h.a.a aVar;
            int i = bundle.getInt(g(0), 0);
            long j = bundle.getLong(g(1), -9223372036854775807L);
            long j2 = bundle.getLong(g(2), 0L);
            boolean z = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                aVar = (com.applovin.exoplayer2.h.a.a) com.applovin.exoplayer2.h.a.a.g.fromBundle(bundle2);
            } else {
                aVar = com.applovin.exoplayer2.h.a.a.f454a;
            }
            com.applovin.exoplayer2.h.a.a aVar2 = aVar;
            a aVar3 = new a();
            aVar3.a(null, null, i, j, j2, aVar2, z);
            return aVar3;
        }

        private static String g(int i) {
            return Integer.toString(i, 36);
        }
    }

    protected ba() {
    }

    public final boolean d() {
        return b() == 0;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? b(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int a(boolean z) {
        if (d()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(boolean z) {
        return d() ? -1 : 0;
    }

    public final c a(int i, c cVar) {
        return a(i, cVar, 0L);
    }

    public final int a(int i, a aVar, c cVar, int i2, boolean z) {
        int i3 = a(i, aVar).c;
        if (a(i3, cVar).q != i) {
            return i + 1;
        }
        int iA = a(i3, i2, z);
        if (iA == -1) {
            return -1;
        }
        return a(iA, cVar).p;
    }

    public final boolean b(int i, a aVar, c cVar, int i2, boolean z) {
        return a(i, aVar, cVar, i2, z) == -1;
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i, long j) {
        return (Pair) com.applovin.exoplayer2.l.a.b(a(cVar, aVar, i, j, 0L));
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i, long j, long j2) {
        com.applovin.exoplayer2.l.a.a(i, 0, b());
        a(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.p;
        a(i2, aVar);
        while (i2 < cVar.q && aVar.e != j) {
            int i3 = i2 + 1;
            if (a(i3, aVar).e > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, aVar, true);
        long jMin = j - aVar.e;
        if (aVar.d != -9223372036854775807L) {
            jMin = Math.min(jMin, aVar.d - 1);
        }
        return Pair.create(com.applovin.exoplayer2.l.a.b(aVar.b), Long.valueOf(Math.max(0L, jMin)));
    }

    public a a(Object obj, a aVar) {
        return a(c(obj), aVar, true);
    }

    public final a a(int i, a aVar) {
        return a(i, aVar, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (baVar.b() != b() || baVar.c() != c()) {
            return false;
        }
        c cVar = new c();
        a aVar = new a();
        c cVar2 = new c();
        a aVar2 = new a();
        for (int i = 0; i < b(); i++) {
            if (!a(i, cVar).equals(baVar.a(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < c(); i2++) {
            if (!a(i2, aVar, true).equals(baVar.a(i2, aVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        c cVar = new c();
        a aVar = new a();
        int iB = 217 + b();
        for (int i = 0; i < b(); i++) {
            iB = (iB * 31) + a(i, cVar).hashCode();
        }
        int iC = (iB * 31) + c();
        for (int i2 = 0; i2 < c(); i2++) {
            iC = (iC * 31) + a(i2, aVar, true).hashCode();
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ba a(Bundle bundle) {
        com.applovin.exoplayer2.common.a.s sVarA = a(c.s, com.applovin.exoplayer2.l.b.a(bundle, b(0)));
        com.applovin.exoplayer2.common.a.s sVarA2 = a(a.g, com.applovin.exoplayer2.l.b.a(bundle, b(1)));
        int[] intArray = bundle.getIntArray(b(2));
        if (intArray == null) {
            intArray = c(sVarA.size());
        }
        return new b(sVarA, sVarA2, intArray);
    }

    private static <T extends g> com.applovin.exoplayer2.common.a.s<T> a(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.applovin.exoplayer2.common.a.s.g();
        }
        s.a aVar2 = new s.a();
        com.applovin.exoplayer2.common.a.s<Bundle> sVarA = f.a(iBinder);
        for (int i = 0; i < sVarA.size(); i++) {
            aVar2.a(aVar.fromBundle(sVarA.get(i)));
        }
        return aVar2.a();
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    private static int[] c(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public static final class b extends ba {
        private final com.applovin.exoplayer2.common.a.s<c> c;
        private final com.applovin.exoplayer2.common.a.s<a> d;
        private final int[] e;
        private final int[] f;

        public b(com.applovin.exoplayer2.common.a.s<c> sVar, com.applovin.exoplayer2.common.a.s<a> sVar2, int[] iArr) {
            com.applovin.exoplayer2.l.a.a(sVar.size() == iArr.length);
            this.c = sVar;
            this.d = sVar2;
            this.e = iArr;
            this.f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f[iArr[i]] = i;
            }
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return this.c.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public c a(int i, c cVar, long j) {
            c cVar2 = this.c.get(i);
            cVar.a(cVar2.b, cVar2.d, cVar2.e, cVar2.f, cVar2.g, cVar2.h, cVar2.i, cVar2.j, cVar2.l, cVar2.n, cVar2.o, cVar2.p, cVar2.q, cVar2.r);
            cVar.m = cVar2.m;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                return z ? this.e[this.f[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return b(z);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != b(z)) {
                return z ? this.e[this.f[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(boolean z) {
            if (d()) {
                return -1;
            }
            if (z) {
                return this.e[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(boolean z) {
            if (d()) {
                return -1;
            }
            if (z) {
                return this.e[0];
            }
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return this.d.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i, a aVar, boolean z) {
            a aVar2 = this.d.get(i);
            aVar.a(aVar2.f90a, aVar2.b, aVar2.c, aVar2.d, aVar2.e, aVar2.h, aVar2.f);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i) {
            throw new UnsupportedOperationException();
        }
    }
}
