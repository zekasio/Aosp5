package com.applovin.exoplayer2.e.g;

import android.net.Uri;
import android.util.Pair;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements com.applovin.exoplayer2.e.h, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f307a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.g.g$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return g.f();
        }
    };
    private final int b;
    private final y c;
    private final y d;
    private final y e;
    private final y f;
    private final ArrayDeque<a.C0024a> g;
    private final i h;
    private final List<a.InterfaceC0030a> i;
    private int j;
    private int k;
    private long l;
    private int m;
    private y n;
    private int o;
    private int p;
    private int q;
    private int r;
    private com.applovin.exoplayer2.e.j s;
    private a[] t;
    private long[][] u;
    private int v;
    private long w;
    private int x;
    private com.applovin.exoplayer2.g.f.b y;

    private static int a(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k a(k kVar) {
        return kVar;
    }

    private static boolean b(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private static boolean c(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] f() {
        return new com.applovin.exoplayer2.e.h[]{new g()};
    }

    public g() {
        this(0);
    }

    public g(int i) {
        this.b = i;
        this.j = (i & 4) != 0 ? 3 : 0;
        this.h = new i();
        this.i = new ArrayList();
        this.f = new y(16);
        this.g = new ArrayDeque<>();
        this.c = new y(com.applovin.exoplayer2.l.v.f629a);
        this.d = new y(4);
        this.e = new y();
        this.o = -1;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar, (this.b & 2) != 0);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.s = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.g.clear();
        this.m = 0;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        if (j == 0) {
            if (this.j != 3) {
                d();
                return;
            } else {
                this.h.a();
                this.i.clear();
                return;
            }
        }
        if (this.t != null) {
            d(j2);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i = this.j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return d(iVar, uVar);
                    }
                    if (i == 3) {
                        return c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(iVar, uVar)) {
                    return 1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.w;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j) {
        long j2;
        long jA;
        long j3;
        long j4;
        int iB;
        if (((a[]) com.applovin.exoplayer2.l.a.b(this.t)).length == 0) {
            return new v.a(w.f389a);
        }
        int i = this.v;
        if (i != -1) {
            n nVar = this.t[i].b;
            int iA = a(nVar, j);
            if (iA == -1) {
                return new v.a(w.f389a);
            }
            long j5 = nVar.f[iA];
            j2 = nVar.c[iA];
            if (j5 >= j || iA >= nVar.b - 1 || (iB = nVar.b(j)) == -1 || iB == iA) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = nVar.f[iB];
                j4 = nVar.c[iB];
            }
            jA = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jA = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.t;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.v) {
                n nVar2 = aVarArr[i2].b;
                long jA2 = a(nVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jA = a(nVar2, j3, jA);
                }
                j2 = jA2;
            }
            i2++;
        }
        w wVar = new w(j, j2);
        if (j3 == -9223372036854775807L) {
            return new v.a(wVar);
        }
        return new v.a(wVar, new w(j3, jA));
    }

    private void d() {
        this.j = 0;
        this.m = 0;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        a.C0024a c0024aPeek;
        if (this.m == 0) {
            if (!iVar.a(this.f.d(), 0, 8, true)) {
                e();
                return false;
            }
            this.m = 8;
            this.f.d(0);
            this.l = this.f.o();
            this.k = this.f.q();
        }
        long j = this.l;
        if (j == 1) {
            iVar.b(this.f.d(), 8, 8);
            this.m += 8;
            this.l = this.f.y();
        } else if (j == 0) {
            long jD = iVar.d();
            if (jD == -1 && (c0024aPeek = this.g.peek()) != null) {
                jD = c0024aPeek.b;
            }
            if (jD != -1) {
                this.l = (jD - iVar.c()) + ((long) this.m);
            }
        }
        if (this.l < this.m) {
            throw ai.a("Atom size less than header length (unsupported).");
        }
        if (c(this.k)) {
            long jC = iVar.c();
            long j2 = this.l;
            int i = this.m;
            long j3 = (jC + j2) - ((long) i);
            if (j2 != i && this.k == 1835365473) {
                c(iVar);
            }
            this.g.push(new a.C0024a(this.k, j3));
            if (this.l == this.m) {
                b(j3);
            } else {
                d();
            }
        } else if (b(this.k)) {
            com.applovin.exoplayer2.l.a.b(this.m == 8);
            com.applovin.exoplayer2.l.a.b(this.l <= 2147483647L);
            y yVar = new y((int) this.l);
            System.arraycopy(this.f.d(), 0, yVar.d(), 0, 8);
            this.n = yVar;
            this.j = 1;
        } else {
            e(iVar.c() - ((long) this.m));
            this.n = null;
            this.j = 1;
        }
        return true;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        boolean z;
        long j = this.l - ((long) this.m);
        long jC = iVar.c() + j;
        y yVar = this.n;
        if (yVar != null) {
            iVar.b(yVar.d(), this.m, (int) j);
            if (this.k == 1718909296) {
                this.x = a(yVar);
            } else if (!this.g.isEmpty()) {
                this.g.peek().a(new a.b(this.k, yVar));
            }
        } else if (j < 262144) {
            iVar.b((int) j);
        } else {
            uVar.f386a = iVar.c() + j;
            z = true;
            b(jC);
            return (z || this.j == 2) ? false : true;
        }
        z = false;
        b(jC);
        if (z) {
        }
    }

    private int c(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        int iA = this.h.a(iVar, uVar, this.i);
        if (iA == 1 && uVar.f386a == 0) {
            d();
        }
        return iA;
    }

    private void b(long j) throws ai {
        while (!this.g.isEmpty() && this.g.peek().b == j) {
            a.C0024a c0024aPop = this.g.pop();
            if (c0024aPop.f294a == 1836019574) {
                a(c0024aPop);
                this.g.clear();
                this.j = 2;
            } else if (!this.g.isEmpty()) {
                this.g.peek().a(c0024aPop);
            }
        }
        if (this.j != 2) {
            d();
        }
    }

    private void a(a.C0024a c0024a) throws ai {
        com.applovin.exoplayer2.g.a aVar;
        com.applovin.exoplayer2.g.a aVar2;
        ArrayList arrayList;
        List<n> list;
        int i;
        int size;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.x == 1;
        r rVar = new r();
        a.b bVarD = c0024a.d(1969517665);
        if (bVarD != null) {
            Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> pairA = b.a(bVarD);
            com.applovin.exoplayer2.g.a aVar3 = (com.applovin.exoplayer2.g.a) pairA.first;
            com.applovin.exoplayer2.g.a aVar4 = (com.applovin.exoplayer2.g.a) pairA.second;
            if (aVar3 != null) {
                rVar.a(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0024a c0024aE = c0024a.e(1835365473);
        com.applovin.exoplayer2.g.a aVarA = c0024aE != null ? b.a(c0024aE) : null;
        List<n> listA = b.a(c0024a, rVar, -9223372036854775807L, (com.applovin.exoplayer2.d.e) null, (this.b & 1) != 0, z, (Function<k, k>) new Function() { // from class: com.applovin.exoplayer2.e.g.g$$ExternalSyntheticLambda1
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return g.a((k) obj);
            }
        });
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.s);
        int size2 = listA.size();
        int i2 = 0;
        int i3 = -1;
        long j = -9223372036854775807L;
        while (i2 < size2) {
            n nVar = listA.get(i2);
            if (nVar.b == 0) {
                list = listA;
                i = size2;
                arrayList = arrayList2;
            } else {
                k kVar = nVar.f316a;
                int i4 = i3;
                arrayList = arrayList2;
                long j2 = kVar.e != -9223372036854775807L ? kVar.e : nVar.h;
                long jMax = Math.max(j, j2);
                list = listA;
                i = size2;
                a aVar5 = new a(kVar, nVar, jVar.a(i2, kVar.b));
                int i5 = nVar.e + 30;
                v.a aVarA2 = kVar.f.a();
                aVarA2.f(i5);
                if (kVar.b == 2 && j2 > 0 && nVar.b > 1) {
                    aVarA2.a(nVar.b / (j2 / 1000000.0f));
                }
                f.a(kVar.b, rVar, aVarA2);
                int i6 = kVar.b;
                com.applovin.exoplayer2.g.a[] aVarArr = new com.applovin.exoplayer2.g.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.i.isEmpty() ? null : new com.applovin.exoplayer2.g.a(this.i);
                f.a(i6, aVar2, aVarA, aVarA2, aVarArr);
                aVar5.c.a(aVarA2.a());
                if (kVar.b == 2) {
                    size = i4;
                    if (size == -1) {
                        size = arrayList.size();
                    }
                } else {
                    size = i4;
                }
                i3 = size;
                arrayList.add(aVar5);
                j = jMax;
            }
            i2++;
            arrayList2 = arrayList;
            listA = list;
            size2 = i;
        }
        this.v = i3;
        this.w = j;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.t = aVarArr2;
        this.u = a(aVarArr2);
        jVar.a();
        jVar.a(this);
    }

    private int d(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long jC = iVar.c();
        if (this.o == -1) {
            int iC = c(jC);
            this.o = iC;
            if (iC == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) com.applovin.exoplayer2.l.ai.a(this.t))[this.o];
        x xVar = aVar.c;
        int i = aVar.d;
        long j = aVar.b.c[i];
        int i2 = aVar.b.d[i];
        long j2 = (j - jC) + ((long) this.p);
        if (j2 < 0 || j2 >= 262144) {
            uVar.f386a = j;
            return 1;
        }
        if (aVar.f308a.g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        iVar.b((int) j2);
        if (aVar.f308a.j != 0) {
            byte[] bArrD = this.d.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i3 = aVar.f308a.j;
            int i4 = 4 - aVar.f308a.j;
            while (this.q < i2) {
                int i5 = this.r;
                if (i5 == 0) {
                    iVar.b(bArrD, i4, i3);
                    this.p += i3;
                    this.d.d(0);
                    int iQ = this.d.q();
                    if (iQ < 0) {
                        throw ai.b("Invalid NAL length", null);
                    }
                    this.r = iQ;
                    this.c.d(0);
                    xVar.a(this.c, 4);
                    this.q += 4;
                    i2 += i4;
                } else {
                    int iA = xVar.a((com.applovin.exoplayer2.k.g) iVar, i5, false);
                    this.p += iA;
                    this.q += iA;
                    this.r -= iA;
                }
            }
        } else {
            if ("audio/ac4".equals(aVar.f308a.f.l)) {
                if (this.q == 0) {
                    com.applovin.exoplayer2.b.c.a(i2, this.e);
                    xVar.a(this.e, 7);
                    this.q += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i6 = this.q;
                if (i6 >= i2) {
                    break;
                }
                int iA2 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i2 - i6, false);
                this.p += iA2;
                this.q += iA2;
                this.r -= iA2;
            }
        }
        xVar.a(aVar.b.f[i], aVar.b.g[i], i2, 0, null);
        aVar.d++;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        return 0;
    }

    private int c(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((a[]) com.applovin.exoplayer2.l.ai.a(this.t)).length; i3++) {
            a aVar = this.t[i3];
            int i4 = aVar.d;
            if (i4 != aVar.b.b) {
                long j5 = aVar.b.c[i4];
                long j6 = ((long[][]) com.applovin.exoplayer2.l.ai.a(this.u))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    private void d(long j) {
        for (a aVar : this.t) {
            n nVar = aVar.b;
            int iA = nVar.a(j);
            if (iA == -1) {
                iA = nVar.b(j);
            }
            aVar.d = iA;
        }
    }

    private void e() {
        if (this.x != 2 || (this.b & 2) == 0) {
            return;
        }
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.s);
        jVar.a(0, 4).a(new v.a().a(this.y == null ? null : new com.applovin.exoplayer2.g.a(this.y)).a());
        jVar.a();
        jVar.a(new v.b(-9223372036854775807L));
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        this.e.a(8);
        iVar.d(this.e.d(), 0, 8);
        b.a(this.e);
        iVar.b(this.e.c());
        iVar.a();
    }

    private void e(long j) {
        if (this.k == 1836086884) {
            int i = this.m;
            this.y = new com.applovin.exoplayer2.g.f.b(0L, j, -9223372036854775807L, j + ((long) i), this.l - ((long) i));
        }
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].b.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].b.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static long a(n nVar, long j, long j2) {
        int iA = a(nVar, j);
        return iA == -1 ? j2 : Math.min(nVar.c[iA], j2);
    }

    private static int a(n nVar, long j) {
        int iA = nVar.a(j);
        return iA == -1 ? nVar.b(j) : iA;
    }

    private static int a(y yVar) {
        yVar.d(8);
        int iA = a(yVar.q());
        if (iA != 0) {
            return iA;
        }
        yVar.e(4);
        while (yVar.a() > 0) {
            int iA2 = a(yVar.q());
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f308a;
        public final n b;
        public final x c;
        public int d;

        public a(k kVar, n nVar, x xVar) {
            this.f308a = kVar;
            this.b = nVar;
            this.c = xVar;
        }
    }
}
