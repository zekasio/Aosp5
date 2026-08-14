package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f352a;
    private final boolean b;
    private final boolean c;
    private long g;
    private String i;
    private com.applovin.exoplayer2.e.x j;
    private a k;
    private boolean l;
    private boolean n;
    private final boolean[] h = new boolean[3];
    private final r d = new r(7, 128);
    private final r e = new r(8, 128);
    private final r f = new r(6, 128);
    private long m = -9223372036854775807L;
    private final com.applovin.exoplayer2.l.y o = new com.applovin.exoplayer2.l.y();

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public m(z zVar, boolean z, boolean z2) {
        this.f352a = zVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.i = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.j = xVarA;
        this.k = new a(xVarA, this.b, this.c);
        this.f352a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.n |= (i & 2) != 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        this.g += (long) yVar.a();
        this.j.a(yVar, yVar.a());
        while (true) {
            int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.h);
            if (iA == iB) {
                a(bArrD, iC, iB);
                return;
            }
            int iB2 = com.applovin.exoplayer2.l.v.b(bArrD, iA);
            int i = iA - iC;
            if (i > 0) {
                a(bArrD, iC, iA);
            }
            int i2 = iB - iA;
            long j = this.g - ((long) i2);
            a(j, i2, i < 0 ? -i : 0, this.m);
            a(j, iB2, this.m);
            iC = iA + 3;
        }
    }

    private void a(long j, int i, long j2) {
        if (!this.l || this.k.a()) {
            this.d.a(i);
            this.e.a(i);
        }
        this.f.a(i);
        this.k.a(j, i, j2);
    }

    private void a(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.a()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    private void a(long j, int i, int i2, long j2) {
        if (!this.l || this.k.a()) {
            this.d.b(i2);
            this.e.b(i2);
            if (!this.l) {
                if (this.d.b() && this.e.b()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.d.f360a, this.d.b));
                    arrayList.add(Arrays.copyOf(this.e.f360a, this.e.b));
                    v.b bVarA = com.applovin.exoplayer2.l.v.a(this.d.f360a, 3, this.d.b);
                    v.a aVarB = com.applovin.exoplayer2.l.v.b(this.e.f360a, 3, this.e.b);
                    this.j.a(new v.a().a(this.i).f("video/avc").d(com.applovin.exoplayer2.l.e.a(bVarA.f631a, bVarA.b, bVarA.c)).g(bVarA.e).h(bVarA.f).b(bVarA.g).a(arrayList).a());
                    this.l = true;
                    this.k.a(bVarA);
                    this.k.a(aVarB);
                    this.d.a();
                    this.e.a();
                }
            } else if (this.d.b()) {
                this.k.a(com.applovin.exoplayer2.l.v.a(this.d.f360a, 3, this.d.b));
                this.d.a();
            } else if (this.e.b()) {
                this.k.a(com.applovin.exoplayer2.l.v.b(this.e.f360a, 3, this.e.b));
                this.e.a();
            }
        }
        if (this.f.b(i2)) {
            this.o.a(this.f.f360a, com.applovin.exoplayer2.l.v.a(this.f.f360a, this.f.b));
            this.o.d(4);
            this.f352a.a(j2, this.o);
        }
        if (this.k.a(j, i, this.l, this.n)) {
            this.n = false;
        }
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.j);
        ai.a(this.k);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f353a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<v.b> d = new SparseArray<>();
        private final SparseArray<v.a> e = new SparseArray<>();
        private final com.applovin.exoplayer2.l.z f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private C0027a m;
        private C0027a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        public a(com.applovin.exoplayer2.e.x xVar, boolean z, boolean z2) {
            this.f353a = xVar;
            this.b = z;
            this.c = z2;
            this.m = new C0027a();
            this.n = new C0027a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new com.applovin.exoplayer2.l.z(bArr, 0, 0);
            b();
        }

        public boolean a() {
            return this.c;
        }

        public void a(v.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void a(v.a aVar) {
            this.e.append(aVar.f630a, aVar);
        }

        public void b() {
            this.k = false;
            this.o = false;
            this.n.a();
        }

        public void a(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            C0027a c0027a = this.m;
            this.m = this.n;
            this.n = c0027a;
            c0027a.a();
            this.h = 0;
            this.k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.m.a.a(byte[], int, int):void");
        }

        public boolean a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.a(this.m))) {
                if (z && this.o) {
                    a(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                z2 = this.n.b();
            }
            boolean z4 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void a(int i) {
            long j = this.q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.r;
            this.f353a.a(j, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        /* JADX INFO: renamed from: com.applovin.exoplayer2.e.i.m$a$a, reason: collision with other inner class name */
        private static final class C0027a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f354a;
            private boolean b;
            private v.b c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private C0027a() {
            }

            public void a() {
                this.b = false;
                this.f354a = false;
            }

            public void a(int i) {
                this.e = i;
                this.b = true;
            }

            public void a(v.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = bVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.f354a = true;
                this.b = true;
            }

            public boolean b() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(C0027a c0027a) {
                int i;
                int i2;
                boolean z;
                if (!this.f354a) {
                    return false;
                }
                if (!c0027a.f354a) {
                    return true;
                }
                v.b bVar = (v.b) com.applovin.exoplayer2.l.a.a(this.c);
                v.b bVar2 = (v.b) com.applovin.exoplayer2.l.a.a(c0027a.c);
                return (this.f == c0027a.f && this.g == c0027a.g && this.h == c0027a.h && (!this.i || !c0027a.i || this.j == c0027a.j) && (((i = this.d) == (i2 = c0027a.d) || (i != 0 && i2 != 0)) && ((bVar.k != 0 || bVar2.k != 0 || (this.m == c0027a.m && this.n == c0027a.n)) && ((bVar.k != 1 || bVar2.k != 1 || (this.o == c0027a.o && this.p == c0027a.p)) && (z = this.k) == c0027a.k && (!z || this.l == c0027a.l))))) ? false : true;
            }
        }
    }
}
