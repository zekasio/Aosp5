package com.applovin.exoplayer2.e.i;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f332a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.i.ac$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return ac.d();
        }
    };
    private final int b;
    private final int c;
    private final List<ag> d;
    private final com.applovin.exoplayer2.l.y e;
    private final SparseIntArray f;
    private final ad.c g;
    private final SparseArray<ad> h;
    private final SparseBooleanArray i;
    private final SparseBooleanArray j;
    private final ab k;
    private aa l;
    private com.applovin.exoplayer2.e.j m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private ad r;
    private int s;
    private int t;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    static /* synthetic */ int b(ac acVar) {
        int i = acVar.n;
        acVar.n = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new ac()};
    }

    public ac() {
        this(0);
    }

    public ac(int i) {
        this(1, i, 112800);
    }

    public ac(int i, int i2, int i3) {
        this(i, new ag(0L), new g(i2), i3);
    }

    public ac(int i, ag agVar, ad.c cVar, int i2) {
        this.g = (ad.c) com.applovin.exoplayer2.l.a.b(cVar);
        this.c = i2;
        this.b = i;
        if (i == 1 || i == 2) {
            this.d = Collections.singletonList(agVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            arrayList.add(agVar);
        }
        this.e = new com.applovin.exoplayer2.l.y(new byte[9400], 0);
        this.i = new SparseBooleanArray();
        this.j = new SparseBooleanArray();
        this.h = new SparseArray<>();
        this.f = new SparseIntArray();
        this.k = new ab(i2);
        this.m = com.applovin.exoplayer2.e.j.f369a;
        this.t = -1;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.applovin.exoplayer2.e.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.exoplayer2.e.i r7) throws java.io.IOException {
        /*
            r6 = this;
            com.applovin.exoplayer2.l.y r0 = r6.e
            byte[] r0 = r0.d()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.d(r0, r2, r1)
            r1 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.b(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.ac.a(com.applovin.exoplayer2.e.i):boolean");
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.m = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        aa aaVar;
        com.applovin.exoplayer2.l.a.b(this.b != 2);
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ag agVar = this.d.get(i);
            boolean z = agVar.c() == -9223372036854775807L;
            if (!z) {
                long jA = agVar.a();
                z = (jA == -9223372036854775807L || jA == 0 || jA == j2) ? false : true;
            }
            if (z) {
                agVar.a(j2);
            }
        }
        if (j2 != 0 && (aaVar = this.l) != null) {
            aaVar.a(j2);
        }
        this.e.a(0);
        this.f.clear();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.valueAt(i2).a();
        }
        this.s = 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        long jD = iVar.d();
        if (this.o) {
            if (jD != -1 && this.b != 2 && !this.k.a()) {
                return this.k.a(iVar, uVar, this.t);
            }
            a(jD);
            if (this.q) {
                this.q = false;
                a(0L, 0L);
                if (iVar.c() != 0) {
                    uVar.f386a = 0L;
                    return 1;
                }
            }
            aa aaVar = this.l;
            if (aaVar != null && aaVar.b()) {
                return this.l.a(iVar, uVar);
            }
        }
        if (!b(iVar)) {
            return -1;
        }
        int iA = a();
        int iB = this.e.b();
        if (iA > iB) {
            return 0;
        }
        int iQ = this.e.q();
        if ((8388608 & iQ) != 0) {
            this.e.d(iA);
            return 0;
        }
        int i = (4194304 & iQ) != 0 ? 1 : 0;
        int i2 = (2096896 & iQ) >> 8;
        boolean z = (iQ & 32) != 0;
        ad adVar = (iQ & 16) != 0 ? this.h.get(i2) : null;
        if (adVar == null) {
            this.e.d(iA);
            return 0;
        }
        if (this.b != 2) {
            int i3 = iQ & 15;
            int i4 = this.f.get(i2, i3 - 1);
            this.f.put(i2, i3);
            if (i4 == i3) {
                this.e.d(iA);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                adVar.a();
            }
        }
        if (z) {
            int iH = this.e.h();
            i |= (this.e.h() & 64) != 0 ? 2 : 0;
            this.e.e(iH - 1);
        }
        boolean z2 = this.o;
        if (a(i2)) {
            this.e.c(iA);
            adVar.a(this.e, i);
            this.e.c(iB);
        }
        if (this.b != 2 && !z2 && this.o && jD != -1) {
            this.q = true;
        }
        this.e.d(iA);
        return 0;
    }

    private void a(long j) {
        if (this.p) {
            return;
        }
        this.p = true;
        if (this.k.b() != -9223372036854775807L) {
            aa aaVar = new aa(this.k.c(), this.k.b(), j, this.t, this.c);
            this.l = aaVar;
            this.m.a(aaVar.a());
            return;
        }
        this.m.a(new v.b(this.k.b()));
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] bArrD = this.e.d();
        if (9400 - this.e.c() < 188) {
            int iA = this.e.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.e.c(), bArrD, 0, iA);
            }
            this.e.a(bArrD, iA);
        }
        while (this.e.a() < 188) {
            int iB = this.e.b();
            int iA2 = iVar.a(bArrD, iB, 9400 - iB);
            if (iA2 == -1) {
                return false;
            }
            this.e.c(iB + iA2);
        }
        return true;
    }

    private int a() throws ai {
        int iC = this.e.c();
        int iB = this.e.b();
        int iA = ae.a(this.e.d(), iC, iB);
        this.e.d(iA);
        int i = iA + 188;
        if (i > iB) {
            int i2 = this.s + (iA - iC);
            this.s = i2;
            if (this.b == 2 && i2 > 376) {
                throw ai.b("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.s = 0;
        }
        return i;
    }

    private boolean a(int i) {
        return this.b == 2 || this.o || !this.j.get(i, false);
    }

    private void b() {
        this.i.clear();
        this.h.clear();
        SparseArray<ad> sparseArrayA = this.g.a();
        int size = sparseArrayA.size();
        for (int i = 0; i < size; i++) {
            this.h.put(sparseArrayA.keyAt(i), sparseArrayA.valueAt(i));
        }
        this.h.put(0, new y(new a()));
        this.r = null;
    }

    private class a implements x {
        private final com.applovin.exoplayer2.l.x b = new com.applovin.exoplayer2.l.x(new byte[4]);

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        public a() {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            if (yVar.h() == 0 && (yVar.h() & 128) != 0) {
                yVar.e(6);
                int iA = yVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    yVar.a(this.b, 4);
                    int iC = this.b.c(16);
                    this.b.b(3);
                    if (iC == 0) {
                        this.b.b(13);
                    } else {
                        int iC2 = this.b.c(13);
                        if (ac.this.h.get(iC2) == null) {
                            ac.this.h.put(iC2, new y(ac.this.new b(iC2)));
                            ac.b(ac.this);
                        }
                    }
                }
                if (ac.this.b != 2) {
                    ac.this.h.remove(0);
                }
            }
        }
    }

    private class b implements x {
        private final com.applovin.exoplayer2.l.x b = new com.applovin.exoplayer2.l.x(new byte[5]);
        private final SparseArray<ad> c = new SparseArray<>();
        private final SparseIntArray d = new SparseIntArray();
        private final int e;

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        public b(int i) {
            this.e = i;
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            ag agVar;
            if (yVar.h() != 2) {
                return;
            }
            if (ac.this.b == 1 || ac.this.b == 2 || ac.this.n == 1) {
                agVar = (ag) ac.this.d.get(0);
            } else {
                agVar = new ag(((ag) ac.this.d.get(0)).a());
                ac.this.d.add(agVar);
            }
            if ((yVar.h() & 128) == 0) {
                return;
            }
            yVar.e(1);
            int i = yVar.i();
            int i2 = 3;
            yVar.e(3);
            yVar.a(this.b, 2);
            this.b.b(3);
            int i3 = 13;
            ac.this.t = this.b.c(13);
            yVar.a(this.b, 2);
            int i4 = 4;
            this.b.b(4);
            yVar.e(this.b.c(12));
            if (ac.this.b == 2 && ac.this.r == null) {
                ad.b bVar = new ad.b(21, null, null, com.applovin.exoplayer2.l.ai.f);
                ac acVar = ac.this;
                acVar.r = acVar.g.a(21, bVar);
                if (ac.this.r != null) {
                    ac.this.r.a(agVar, ac.this.m, new ad.d(i, 21, 8192));
                }
            }
            this.c.clear();
            this.d.clear();
            int iA = yVar.a();
            while (iA > 0) {
                yVar.a(this.b, 5);
                int iC = this.b.c(8);
                this.b.b(i2);
                int iC2 = this.b.c(i3);
                this.b.b(i4);
                int iC3 = this.b.c(12);
                ad.b bVarA = a(yVar, iC3);
                if (iC == 6 || iC == 5) {
                    iC = bVarA.f336a;
                }
                iA -= iC3 + 5;
                int i5 = ac.this.b == 2 ? iC : iC2;
                if (!ac.this.i.get(i5)) {
                    ad adVarA = (ac.this.b == 2 && iC == 21) ? ac.this.r : ac.this.g.a(iC, bVarA);
                    if (ac.this.b != 2 || iC2 < this.d.get(i5, 8192)) {
                        this.d.put(i5, iC2);
                        this.c.put(i5, adVarA);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.d.size();
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.d.keyAt(i6);
                int iValueAt = this.d.valueAt(i6);
                ac.this.i.put(iKeyAt, true);
                ac.this.j.put(iValueAt, true);
                ad adVarValueAt = this.c.valueAt(i6);
                if (adVarValueAt != null) {
                    if (adVarValueAt != ac.this.r) {
                        adVarValueAt.a(agVar, ac.this.m, new ad.d(i, iKeyAt, 8192));
                    }
                    ac.this.h.put(iValueAt, adVarValueAt);
                }
            }
            if (ac.this.b == 2) {
                if (ac.this.o) {
                    return;
                }
                ac.this.m.a();
                ac.this.n = 0;
                ac.this.o = true;
                return;
            }
            ac.this.h.remove(this.e);
            ac acVar2 = ac.this;
            acVar2.n = acVar2.b == 1 ? 0 : ac.this.n - 1;
            if (ac.this.n == 0) {
                ac.this.m.a();
                ac.this.o = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.applovin.exoplayer2.e.i.ad.b a(com.applovin.exoplayer2.l.y r14, int r15) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.ac.b.a(com.applovin.exoplayer2.l.y, int):com.applovin.exoplayer2.e.i.ad$b");
        }
    }
}
