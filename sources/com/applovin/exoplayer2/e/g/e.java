package com.applovin.exoplayer2.e.g;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f303a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.g.e$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return e.d();
        }
    };
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final v c = new v.a().f("application/x-emsg").a();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.applovin.exoplayer2.e.j H;
    private x[] I;
    private x[] J;
    private boolean K;
    private final int d;
    private final k e;
    private final List<v> f;
    private final SparseArray<b> g;
    private final y h;
    private final y i;
    private final y j;
    private final byte[] k;
    private final y l;
    private final ag m;
    private final com.applovin.exoplayer2.g.b.c n;
    private final y o;
    private final ArrayDeque<a.C0024a> p;
    private final ArrayDeque<a> q;
    private final x r;
    private int s;
    private int t;
    private long u;
    private int v;
    private y w;
    private long x;
    private int y;
    private long z;

    private static boolean b(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    private static boolean c(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    protected k a(k kVar) {
        return kVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    public e() {
        this(0);
    }

    public e(int i) {
        this(i, null);
    }

    public e(int i, ag agVar) {
        this(i, agVar, null, Collections.emptyList());
    }

    public e(int i, ag agVar, k kVar, List<v> list) {
        this(i, agVar, kVar, list, null);
    }

    public e(int i, ag agVar, k kVar, List<v> list, x xVar) {
        this.d = i;
        this.m = agVar;
        this.e = kVar;
        this.f = Collections.unmodifiableList(list);
        this.r = xVar;
        this.n = new com.applovin.exoplayer2.g.b.c();
        this.o = new y(16);
        this.h = new y(com.applovin.exoplayer2.l.v.f629a);
        this.i = new y(5);
        this.j = new y();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new y(bArr);
        this.p = new ArrayDeque<>();
        this.q = new ArrayDeque<>();
        this.g = new SparseArray<>();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.H = com.applovin.exoplayer2.e.j.f369a;
        this.I = new x[0];
        this.J = new x[0];
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.H = jVar;
        a();
        b();
        k kVar = this.e;
        if (kVar != null) {
            this.g.put(0, new b(jVar.a(0, kVar.b), new n(this.e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.H.a();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.valueAt(i).a();
        }
        this.q.clear();
        this.y = 0;
        this.z = j2;
        this.p.clear();
        a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i = this.s;
            if (i != 0) {
                if (i == 1) {
                    c(iVar);
                } else if (i == 2) {
                    d(iVar);
                } else if (e(iVar)) {
                    return 0;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    private void a() {
        this.s = 0;
        this.v = 0;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.v == 0) {
            if (!iVar.a(this.o.d(), 0, 8, true)) {
                return false;
            }
            this.v = 8;
            this.o.d(0);
            this.u = this.o.o();
            this.t = this.o.q();
        }
        long j = this.u;
        if (j == 1) {
            iVar.b(this.o.d(), 8, 8);
            this.v += 8;
            this.u = this.o.y();
        } else if (j == 0) {
            long jD = iVar.d();
            if (jD == -1 && !this.p.isEmpty()) {
                jD = this.p.peek().b;
            }
            if (jD != -1) {
                this.u = (jD - iVar.c()) + ((long) this.v);
            }
        }
        if (this.u < this.v) {
            throw ai.a("Atom size less than header length (unsupported).");
        }
        long jC = iVar.c() - ((long) this.v);
        int i = this.t;
        if ((i == 1836019558 || i == 1835295092) && !this.K) {
            this.H.a(new v.b(this.A, jC));
            this.K = true;
        }
        if (this.t == 1836019558) {
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                m mVar = this.g.valueAt(i2).b;
                mVar.b = jC;
                mVar.d = jC;
                mVar.c = jC;
            }
        }
        int i3 = this.t;
        if (i3 == 1835295092) {
            this.C = null;
            this.x = jC + this.u;
            this.s = 2;
            return true;
        }
        if (c(i3)) {
            long jC2 = (iVar.c() + this.u) - 8;
            this.p.push(new a.C0024a(this.t, jC2));
            if (this.u == this.v) {
                a(jC2);
            } else {
                a();
            }
        } else if (b(this.t)) {
            if (this.v != 8) {
                throw ai.a("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.u;
            if (j2 > 2147483647L) {
                throw ai.a("Leaf atom with length > 2147483647 (unsupported).");
            }
            y yVar = new y((int) j2);
            System.arraycopy(this.o.d(), 0, yVar.d(), 0, 8);
            this.w = yVar;
            this.s = 1;
        } else {
            if (this.u > 2147483647L) {
                throw ai.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.w = null;
            this.s = 1;
        }
        return true;
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i = ((int) this.u) - this.v;
        y yVar = this.w;
        if (yVar != null) {
            iVar.b(yVar.d(), 8, i);
            a(new a.b(this.t, yVar), iVar.c());
        } else {
            iVar.b(i);
        }
        a(iVar.c());
    }

    private void a(long j) throws ai {
        while (!this.p.isEmpty() && this.p.peek().b == j) {
            a(this.p.pop());
        }
        a();
    }

    private void a(a.b bVar, long j) throws ai {
        if (!this.p.isEmpty()) {
            this.p.peek().a(bVar);
            return;
        }
        if (bVar.f294a == 1936286840) {
            Pair<Long, com.applovin.exoplayer2.e.c> pairA = a(bVar.b, j);
            this.B = ((Long) pairA.first).longValue();
            this.H.a((com.applovin.exoplayer2.e.v) pairA.second);
            this.K = true;
            return;
        }
        if (bVar.f294a == 1701671783) {
            a(bVar.b);
        }
    }

    private void a(a.C0024a c0024a) throws ai {
        if (c0024a.f294a == 1836019574) {
            b(c0024a);
        } else if (c0024a.f294a == 1836019558) {
            c(c0024a);
        } else {
            if (this.p.isEmpty()) {
                return;
            }
            this.p.peek().a(c0024a);
        }
    }

    private void b(a.C0024a c0024a) throws ai {
        int i = 0;
        com.applovin.exoplayer2.l.a.b(this.e == null, "Unexpected moov box.");
        com.applovin.exoplayer2.d.e eVarA = a(c0024a.c);
        a.C0024a c0024a2 = (a.C0024a) com.applovin.exoplayer2.l.a.b(c0024a.e(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0024a2.c.size();
        long jC = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = c0024a2.c.get(i2);
            if (bVar.f294a == 1953654136) {
                Pair<Integer, c> pairB = b(bVar.b);
                sparseArray.put(((Integer) pairB.first).intValue(), (c) pairB.second);
            } else if (bVar.f294a == 1835362404) {
                jC = c(bVar.b);
            }
        }
        List<n> listA = com.applovin.exoplayer2.e.g.b.a(c0024a, new r(), jC, eVarA, (this.d & 16) != 0, false, (Function<k, k>) new Function() { // from class: com.applovin.exoplayer2.e.g.e$$ExternalSyntheticLambda1
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return this.f$0.a((k) obj);
            }
        });
        int size2 = listA.size();
        if (this.g.size() == 0) {
            while (i < size2) {
                n nVar = listA.get(i);
                k kVar = nVar.f316a;
                this.g.put(kVar.f313a, new b(this.H.a(i, kVar.b), nVar, a(sparseArray, kVar.f313a)));
                this.A = Math.max(this.A, kVar.e);
                i++;
            }
            this.H.a();
            return;
        }
        com.applovin.exoplayer2.l.a.b(this.g.size() == size2);
        while (i < size2) {
            n nVar2 = listA.get(i);
            k kVar2 = nVar2.f316a;
            this.g.get(kVar2.f313a).a(nVar2, a(sparseArray, kVar2.f313a));
            i++;
        }
    }

    private c a(SparseArray<c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) com.applovin.exoplayer2.l.a.b(sparseArray.get(i));
    }

    private void c(a.C0024a c0024a) throws ai {
        a(c0024a, this.g, this.e != null, this.d, this.k);
        com.applovin.exoplayer2.d.e eVarA = a(c0024a.c);
        if (eVarA != null) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                this.g.valueAt(i).a(eVarA);
            }
        }
        if (this.z != -9223372036854775807L) {
            int size2 = this.g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.g.valueAt(i2).a(this.z);
            }
            this.z = -9223372036854775807L;
        }
    }

    private void b() {
        int i;
        x[] xVarArr = new x[2];
        this.I = xVarArr;
        x xVar = this.r;
        int i2 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.d & 4) != 0) {
            xVarArr[i] = this.H.a(100, 5);
            i3 = 101;
            i++;
        }
        x[] xVarArr2 = (x[]) com.applovin.exoplayer2.l.ai.a(this.I, i);
        this.I = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.a(c);
        }
        this.J = new x[this.f.size()];
        while (i2 < this.J.length) {
            x xVarA = this.H.a(i3, 3);
            xVarA.a(this.f.get(i2));
            this.J[i2] = xVarA;
            i2++;
            i3++;
        }
    }

    private void a(y yVar) {
        long jD;
        String str;
        long jD2;
        String str2;
        long jO;
        long jC;
        if (this.I.length == 0) {
            return;
        }
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        if (iA == 0) {
            String str3 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            String str4 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            long jO2 = yVar.o();
            jD = com.applovin.exoplayer2.l.ai.d(yVar.o(), 1000000L, jO2);
            long j = this.B;
            long j2 = j != -9223372036854775807L ? j + jD : -9223372036854775807L;
            str = str3;
            jD2 = com.applovin.exoplayer2.l.ai.d(yVar.o(), 1000L, jO2);
            str2 = str4;
            jO = yVar.o();
            jC = j2;
        } else {
            if (iA != 1) {
                q.c("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iA);
                return;
            }
            long jO3 = yVar.o();
            jC = com.applovin.exoplayer2.l.ai.d(yVar.y(), 1000000L, jO3);
            long jD3 = com.applovin.exoplayer2.l.ai.d(yVar.o(), 1000L, jO3);
            long jO4 = yVar.o();
            str = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            jD2 = jD3;
            jO = jO4;
            str2 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            jD = -9223372036854775807L;
        }
        byte[] bArr = new byte[yVar.a()];
        yVar.a(bArr, 0, yVar.a());
        y yVar2 = new y(this.n.a(new com.applovin.exoplayer2.g.b.a(str, str2, jD2, jO, bArr)));
        int iA2 = yVar2.a();
        for (x xVar : this.I) {
            yVar2.d(0);
            xVar.a(yVar2, iA2);
        }
        if (jC == -9223372036854775807L) {
            this.q.addLast(new a(jD, iA2));
            this.y += iA2;
            return;
        }
        ag agVar = this.m;
        if (agVar != null) {
            jC = agVar.c(jC);
        }
        for (x xVar2 : this.I) {
            xVar2.a(jC, 1, iA2, 0, null);
        }
    }

    private static Pair<Integer, c> b(y yVar) {
        yVar.d(12);
        return Pair.create(Integer.valueOf(yVar.q()), new c(yVar.q() - 1, yVar.q(), yVar.q(), yVar.q()));
    }

    private static long c(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 0 ? yVar.o() : yVar.y();
    }

    private static void a(a.C0024a c0024a, SparseArray<b> sparseArray, boolean z, int i, byte[] bArr) throws ai {
        int size = c0024a.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.C0024a c0024a2 = c0024a.d.get(i2);
            if (c0024a2.f294a == 1953653094) {
                b(c0024a2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void b(a.C0024a c0024a, SparseArray<b> sparseArray, boolean z, int i, byte[] bArr) throws ai {
        b bVarA = a(((a.b) com.applovin.exoplayer2.l.a.b(c0024a.d(1952868452))).b, sparseArray, z);
        if (bVarA == null) {
            return;
        }
        m mVar = bVarA.b;
        long j = mVar.r;
        boolean z2 = mVar.s;
        bVarA.a();
        bVarA.l = true;
        a.b bVarD = c0024a.d(1952867444);
        if (bVarD != null && (i & 2) == 0) {
            mVar.r = d(bVarD.b);
            mVar.s = true;
        } else {
            mVar.r = j;
            mVar.s = z2;
        }
        a(c0024a, bVarA, i);
        l lVarA = bVarA.d.f316a.a(((c) com.applovin.exoplayer2.l.a.b(mVar.f315a)).f301a);
        a.b bVarD2 = c0024a.d(1935763834);
        if (bVarD2 != null) {
            a((l) com.applovin.exoplayer2.l.a.b(lVarA), bVarD2.b, mVar);
        }
        a.b bVarD3 = c0024a.d(1935763823);
        if (bVarD3 != null) {
            a(bVarD3.b, mVar);
        }
        a.b bVarD4 = c0024a.d(1936027235);
        if (bVarD4 != null) {
            b(bVarD4.b, mVar);
        }
        a(c0024a, lVarA != null ? lVarA.b : null, mVar);
        int size = c0024a.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = c0024a.c.get(i2);
            if (bVar.f294a == 1970628964) {
                a(bVar.b, mVar, bArr);
            }
        }
    }

    private static void a(a.C0024a c0024a, b bVar, int i) throws ai {
        List<a.b> list = c0024a.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            a.b bVar2 = list.get(i4);
            if (bVar2.f294a == 1953658222) {
                y yVar = bVar2.b;
                yVar.d(12);
                int iW = yVar.w();
                if (iW > 0) {
                    i3 += iW;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.b.a(i2, i3);
        int i5 = 0;
        int iA = 0;
        for (int i6 = 0; i6 < size; i6++) {
            a.b bVar3 = list.get(i6);
            if (bVar3.f294a == 1953658222) {
                iA = a(bVar, i5, i, bVar3.b, iA);
                i5++;
            }
        }
    }

    private static void a(l lVar, y yVar, m mVar) throws ai {
        int i;
        int i2 = lVar.d;
        yVar.d(8);
        if ((com.applovin.exoplayer2.e.g.a.b(yVar.q()) & 1) == 1) {
            yVar.e(8);
        }
        int iH = yVar.h();
        int iW = yVar.w();
        if (iW > mVar.f) {
            throw ai.b("Saiz sample count " + iW + " is greater than fragment sample count" + mVar.f, null);
        }
        if (iH == 0) {
            boolean[] zArr = mVar.n;
            i = 0;
            for (int i3 = 0; i3 < iW; i3++) {
                int iH2 = yVar.h();
                i += iH2;
                zArr[i3] = iH2 > i2;
            }
        } else {
            i = iH * iW;
            Arrays.fill(mVar.n, 0, iW, iH > i2);
        }
        Arrays.fill(mVar.n, iW, mVar.f, false);
        if (i > 0) {
            mVar.a(i);
        }
    }

    private static void a(y yVar, m mVar) throws ai {
        yVar.d(8);
        int iQ = yVar.q();
        if ((com.applovin.exoplayer2.e.g.a.b(iQ) & 1) == 1) {
            yVar.e(8);
        }
        int iW = yVar.w();
        if (iW != 1) {
            throw ai.b("Unexpected saio entry count: " + iW, null);
        }
        mVar.d += com.applovin.exoplayer2.e.g.a.a(iQ) == 0 ? yVar.o() : yVar.y();
    }

    private static b a(y yVar, SparseArray<b> sparseArray, boolean z) {
        int iQ;
        int iQ2;
        int iQ3;
        int iQ4;
        yVar.d(8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        b bVarValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(yVar.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jY = yVar.y();
            bVarValueAt.b.c = jY;
            bVarValueAt.b.d = jY;
        }
        c cVar = bVarValueAt.e;
        if ((iB & 2) != 0) {
            iQ = yVar.q() - 1;
        } else {
            iQ = cVar.f301a;
        }
        if ((iB & 8) != 0) {
            iQ2 = yVar.q();
        } else {
            iQ2 = cVar.b;
        }
        if ((iB & 16) != 0) {
            iQ3 = yVar.q();
        } else {
            iQ3 = cVar.c;
        }
        if ((iB & 32) != 0) {
            iQ4 = yVar.q();
        } else {
            iQ4 = cVar.d;
        }
        bVarValueAt.b.f315a = new c(iQ, iQ2, iQ3, iQ4);
        return bVarValueAt;
    }

    private static long d(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 1 ? yVar.y() : yVar.o();
    }

    private static int a(b bVar, int i, int i2, y yVar, int i3) throws ai {
        boolean z;
        int iQ;
        boolean z2;
        int iQ2;
        boolean z3;
        boolean z4;
        boolean z5;
        b bVar2 = bVar;
        yVar.d(8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        k kVar = bVar2.d.f316a;
        m mVar = bVar2.b;
        c cVar = (c) com.applovin.exoplayer2.l.ai.a(mVar.f315a);
        mVar.h[i] = yVar.w();
        mVar.g[i] = mVar.c;
        if ((iB & 1) != 0) {
            long[] jArr = mVar.g;
            jArr[i] = jArr[i] + ((long) yVar.q());
        }
        boolean z6 = (iB & 4) != 0;
        int iQ3 = cVar.d;
        if (z6) {
            iQ3 = yVar.q();
        }
        boolean z7 = (iB & 256) != 0;
        boolean z8 = (iB & 512) != 0;
        boolean z9 = (iB & 1024) != 0;
        boolean z10 = (iB & 2048) != 0;
        long jD = 0;
        if (kVar.h != null && kVar.h.length == 1 && kVar.h[0] == 0) {
            jD = com.applovin.exoplayer2.l.ai.d(((long[]) com.applovin.exoplayer2.l.ai.a(kVar.i))[0], 1000000L, kVar.c);
        }
        int[] iArr = mVar.i;
        int[] iArr2 = mVar.j;
        long[] jArr2 = mVar.k;
        boolean[] zArr = mVar.l;
        int i4 = iQ3;
        boolean z11 = kVar.b == 2 && (i2 & 1) != 0;
        int i5 = i3 + mVar.h[i];
        boolean z12 = z11;
        long j = kVar.c;
        long j2 = jD;
        long j3 = mVar.r;
        int i6 = i3;
        while (i6 < i5) {
            int iA = a(z7 ? yVar.q() : cVar.b);
            if (z8) {
                z = z7;
                iQ = yVar.q();
            } else {
                z = z7;
                iQ = cVar.c;
            }
            int iA2 = a(iQ);
            if (z9) {
                z2 = z6;
                iQ2 = yVar.q();
            } else if (i6 == 0 && z6) {
                z2 = z6;
                iQ2 = i4;
            } else {
                z2 = z6;
                iQ2 = cVar.d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iArr2[i6] = (int) ((((long) yVar.q()) * 1000000) / j);
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iArr2[i6] = 0;
            }
            jArr2[i6] = com.applovin.exoplayer2.l.ai.d(j3, 1000000L, j) - j2;
            if (!mVar.s) {
                jArr2[i6] = jArr2[i6] + bVar2.d.h;
            }
            iArr[i6] = iA2;
            zArr[i6] = ((iQ2 >> 16) & 1) == 0 && (!z12 || i6 == 0);
            j3 += (long) iA;
            i6++;
            bVar2 = bVar;
            z7 = z;
            j = j;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        mVar.r = j3;
        return i5;
    }

    private static int a(int i) throws ai {
        if (i >= 0) {
            return i;
        }
        throw ai.b("Unexpected negative value: " + i, null);
    }

    private static void a(y yVar, m mVar, byte[] bArr) throws ai {
        yVar.d(8);
        yVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, b)) {
            a(yVar, 16, mVar);
        }
    }

    private static void b(y yVar, m mVar) throws ai {
        a(yVar, 0, mVar);
    }

    private static void a(y yVar, int i, m mVar) throws ai {
        yVar.d(i + 8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        if ((iB & 1) != 0) {
            throw ai.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iW = yVar.w();
        if (iW == 0) {
            Arrays.fill(mVar.n, 0, mVar.f, false);
            return;
        }
        if (iW != mVar.f) {
            throw ai.b("Senc sample count " + iW + " is different from fragment sample count" + mVar.f, null);
        }
        Arrays.fill(mVar.n, 0, iW, z);
        mVar.a(yVar.a());
        mVar.a(yVar);
    }

    private static void a(a.C0024a c0024a, String str, m mVar) throws ai {
        byte[] bArr = null;
        y yVar = null;
        y yVar2 = null;
        for (int i = 0; i < c0024a.c.size(); i++) {
            a.b bVar = c0024a.c.get(i);
            y yVar3 = bVar.b;
            if (bVar.f294a == 1935828848) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (bVar.f294a == 1936158820) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar == null || yVar2 == null) {
            return;
        }
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        if (iA == 1) {
            yVar.e(4);
        }
        if (yVar.q() != 1) {
            throw ai.a("Entry count in sbgp != 1 (unsupported).");
        }
        yVar2.d(8);
        int iA2 = com.applovin.exoplayer2.e.g.a.a(yVar2.q());
        yVar2.e(4);
        if (iA2 == 1) {
            if (yVar2.o() == 0) {
                throw ai.a("Variable length description in sgpd found (unsupported)");
            }
        } else if (iA2 >= 2) {
            yVar2.e(4);
        }
        if (yVar2.o() != 1) {
            throw ai.a("Entry count in sgpd != 1 (unsupported).");
        }
        yVar2.e(1);
        int iH = yVar2.h();
        int i2 = (iH & 240) >> 4;
        int i3 = iH & 15;
        boolean z = yVar2.h() == 1;
        if (z) {
            int iH2 = yVar2.h();
            byte[] bArr2 = new byte[16];
            yVar2.a(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = yVar2.h();
                bArr = new byte[iH3];
                yVar2.a(bArr, 0, iH3);
            }
            mVar.m = true;
            mVar.o = new l(z, str, iH2, bArr2, i2, i3, bArr);
        }
    }

    private static Pair<Long, com.applovin.exoplayer2.e.c> a(y yVar, long j) throws ai {
        long jY;
        long jY2;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        long jO = yVar.o();
        if (iA == 0) {
            jY = yVar.o();
            jY2 = yVar.o();
        } else {
            jY = yVar.y();
            jY2 = yVar.y();
        }
        long j2 = jY;
        long j3 = j + jY2;
        long jD = com.applovin.exoplayer2.l.ai.d(j2, 1000000L, jO);
        yVar.e(2);
        int i = yVar.i();
        int[] iArr = new int[i];
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        long j4 = j2;
        long j5 = jD;
        int i2 = 0;
        while (i2 < i) {
            int iQ = yVar.q();
            if ((iQ & Integer.MIN_VALUE) != 0) {
                throw ai.b("Unhandled indirect reference", null);
            }
            long jO2 = yVar.o();
            iArr[i2] = iQ & Integer.MAX_VALUE;
            jArr[i2] = j3;
            jArr3[i2] = j5;
            long j6 = j4 + jO2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = i;
            int[] iArr2 = iArr;
            long jD2 = com.applovin.exoplayer2.l.ai.d(j6, 1000000L, jO);
            jArr4[i2] = jD2 - jArr5[i2];
            yVar.e(4);
            j3 += (long) iArr2[i2];
            i2++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            i = i3;
            j4 = j6;
            j5 = jD2;
        }
        return Pair.create(Long.valueOf(jD), new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3));
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int size = this.g.size();
        long j = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i = 0; i < size; i++) {
            m mVar = this.g.valueAt(i).b;
            if (mVar.q && mVar.d < j) {
                j = mVar.d;
                bVarValueAt = this.g.valueAt(i);
            }
        }
        if (bVarValueAt == null) {
            this.s = 3;
            return;
        }
        int iC = (int) (j - iVar.c());
        if (iC < 0) {
            throw ai.b("Offset to encryption data was negative.", null);
        }
        iVar.b(iC);
        bVarValueAt.b.a(iVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean e(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int iA;
        b bVarA = this.C;
        Throwable th = null;
        if (bVarA == null) {
            bVarA = a(this.g);
            if (bVarA == null) {
                int iC = (int) (this.x - iVar.c());
                if (iC < 0) {
                    throw ai.b("Offset to end of mdat was negative.", null);
                }
                iVar.b(iC);
                a();
                return false;
            }
            int iC2 = (int) (bVarA.c() - iVar.c());
            if (iC2 < 0) {
                q.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iC2 = 0;
            }
            iVar.b(iC2);
            this.C = bVarA;
        }
        int i = 4;
        int i2 = 1;
        if (this.s == 3) {
            this.D = bVarA.d();
            if (bVarA.f < bVarA.i) {
                iVar.b(this.D);
                bVarA.g();
                if (!bVarA.f()) {
                    this.C = null;
                }
                this.s = 3;
                return true;
            }
            if (bVarA.d.f316a.g == 1) {
                this.D -= 8;
                iVar.b(8);
            }
            if ("audio/ac4".equals(bVarA.d.f316a.f.l)) {
                this.E = bVarA.a(this.D, 7);
                com.applovin.exoplayer2.b.c.a(this.D, this.l);
                bVarA.f305a.a(this.l, 7);
                this.E += 7;
            } else {
                this.E = bVarA.a(this.D, 0);
            }
            this.D += this.E;
            this.s = 4;
            this.F = 0;
        }
        k kVar = bVarA.d.f316a;
        x xVar = bVarA.f305a;
        long jB = bVarA.b();
        ag agVar = this.m;
        if (agVar != null) {
            jB = agVar.c(jB);
        }
        long j = jB;
        if (kVar.j == 0) {
            while (true) {
                int i3 = this.E;
                int i4 = this.D;
                if (i3 >= i4) {
                    break;
                }
                this.E += xVar.a((com.applovin.exoplayer2.k.g) iVar, i4 - i3, false);
            }
        } else {
            byte[] bArrD = this.i.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i5 = kVar.j + 1;
            int i6 = 4 - kVar.j;
            while (this.E < this.D) {
                int i7 = this.F;
                if (i7 == 0) {
                    iVar.b(bArrD, i6, i5);
                    this.i.d(0);
                    int iQ = this.i.q();
                    if (iQ < i2) {
                        throw ai.b("Invalid NAL length", th);
                    }
                    this.F = iQ - 1;
                    this.h.d(0);
                    xVar.a(this.h, i);
                    xVar.a(this.i, i2);
                    this.G = this.J.length > 0 && com.applovin.exoplayer2.l.v.a(kVar.f.l, bArrD[i]);
                    this.E += 5;
                    this.D += i6;
                } else {
                    if (this.G) {
                        this.j.a(i7);
                        iVar.b(this.j.d(), 0, this.F);
                        xVar.a(this.j, this.F);
                        iA = this.F;
                        int iA2 = com.applovin.exoplayer2.l.v.a(this.j.d(), this.j.b());
                        this.j.d("video/hevc".equals(kVar.f.l) ? 1 : 0);
                        this.j.c(iA2);
                        com.applovin.exoplayer2.e.b.a(j, this.j, this.J);
                    } else {
                        iA = xVar.a((com.applovin.exoplayer2.k.g) iVar, i7, false);
                    }
                    this.E += iA;
                    this.F -= iA;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iE = bVarA.e();
        l lVarH = bVarA.h();
        xVar.a(j, iE, this.D, 0, lVarH != null ? lVarH.c : null);
        b(j);
        if (!bVarA.f()) {
            this.C = null;
        }
        this.s = 3;
        return true;
    }

    private void b(long j) {
        while (!this.q.isEmpty()) {
            a aVarRemoveFirst = this.q.removeFirst();
            this.y -= aVarRemoveFirst.b;
            long jC = aVarRemoveFirst.f304a + j;
            ag agVar = this.m;
            if (agVar != null) {
                jC = agVar.c(jC);
            }
            for (x xVar : this.I) {
                xVar.a(jC, 1, aVarRemoveFirst.b, this.y, null);
            }
        }
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVarValueAt = sparseArray.valueAt(i);
            if ((bVarValueAt.l || bVarValueAt.f != bVarValueAt.d.b) && (!bVarValueAt.l || bVarValueAt.h != bVarValueAt.b.e)) {
                long jC = bVarValueAt.c();
                if (jC < j) {
                    bVar = bVarValueAt;
                    j = jC;
                }
            }
        }
        return bVar;
    }

    private static com.applovin.exoplayer2.d.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            a.b bVar = list.get(i);
            if (bVar.f294a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.b.d();
                UUID uuidB = h.b(bArrD);
                if (uuidB == null) {
                    q.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(uuidB, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.applovin.exoplayer2.d.e(arrayList);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f304a;
        public final int b;

        public a(long j, int i) {
            this.f304a = j;
            this.b = i;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f305a;
        public n d;
        public c e;
        public int f;
        public int g;
        public int h;
        public int i;
        private boolean l;
        public final m b = new m();
        public final y c = new y();
        private final y j = new y(1);
        private final y k = new y();

        public b(x xVar, n nVar, c cVar) {
            this.f305a = xVar;
            this.d = nVar;
            this.e = cVar;
            a(nVar, cVar);
        }

        public void a(n nVar, c cVar) {
            this.d = nVar;
            this.e = cVar;
            this.f305a.a(nVar.f316a.f);
            a();
        }

        public void a(com.applovin.exoplayer2.d.e eVar) {
            l lVarA = this.d.f316a.a(((c) com.applovin.exoplayer2.l.ai.a(this.b.f315a)).f301a);
            this.f305a.a(this.d.f316a.f.a().a(eVar.a(lVarA != null ? lVarA.b : null)).a());
        }

        public void a() {
            this.b.a();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void a(long j) {
            for (int i = this.f; i < this.b.f && this.b.b(i) < j; i++) {
                if (this.b.l[i]) {
                    this.i = i;
                }
            }
        }

        public long b() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.b(this.f);
        }

        public long c() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public int d() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        public int e() {
            int i;
            if (!this.l) {
                i = this.d.g[this.f];
            } else {
                i = this.b.l[this.f] ? 1 : 0;
            }
            return h() != null ? i | 1073741824 : i;
        }

        public boolean f() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int a(int i, int i2) {
            y yVar;
            int length;
            l lVarH = h();
            if (lVarH == null) {
                return 0;
            }
            if (lVarH.d != 0) {
                yVar = this.b.p;
                length = lVarH.d;
            } else {
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.ai.a(lVarH.e);
                this.k.a(bArr, bArr.length);
                yVar = this.k;
                length = bArr.length;
            }
            boolean zC = this.b.c(this.f);
            boolean z = zC || i2 != 0;
            this.j.d()[0] = (byte) ((z ? 128 : 0) | length);
            this.j.d(0);
            this.f305a.a(this.j, 1, 1);
            this.f305a.a(yVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zC) {
                this.c.a(8);
                byte[] bArrD = this.c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i2 >> 8) & 255);
                bArrD[3] = (byte) (i2 & 255);
                bArrD[4] = (byte) ((i >> 24) & 255);
                bArrD[5] = (byte) ((i >> 16) & 255);
                bArrD[6] = (byte) ((i >> 8) & 255);
                bArrD[7] = (byte) (i & 255);
                this.f305a.a(this.c, 8, 1);
                return length + 9;
            }
            y yVar2 = this.b.p;
            int i3 = yVar2.i();
            yVar2.e(-2);
            int i4 = (i3 * 6) + 2;
            if (i2 != 0) {
                this.c.a(i4);
                byte[] bArrD2 = this.c.d();
                yVar2.a(bArrD2, 0, i4);
                int i5 = (((bArrD2[2] & UByte.MAX_VALUE) << 8) | (bArrD2[3] & UByte.MAX_VALUE)) + i2;
                bArrD2[2] = (byte) ((i5 >> 8) & 255);
                bArrD2[3] = (byte) (i5 & 255);
                yVar2 = this.c;
            }
            this.f305a.a(yVar2, i4, 1);
            return length + 1 + i4;
        }

        public void g() {
            l lVarH = h();
            if (lVarH == null) {
                return;
            }
            y yVar = this.b.p;
            if (lVarH.d != 0) {
                yVar.e(lVarH.d);
            }
            if (this.b.c(this.f)) {
                yVar.e(yVar.i() * 6);
            }
        }

        public l h() {
            l lVarA;
            if (!this.l) {
                return null;
            }
            int i = ((c) com.applovin.exoplayer2.l.ai.a(this.b.f315a)).f301a;
            if (this.b.o != null) {
                lVarA = this.b.o;
            } else {
                lVarA = this.d.f316a.a(i);
            }
            if (lVarA == null || !lVarA.f314a) {
                return null;
            }
            return lVarA;
        }
    }
}
