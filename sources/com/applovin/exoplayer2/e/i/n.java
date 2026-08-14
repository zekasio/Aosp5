package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f355a;
    private String b;
    private com.applovin.exoplayer2.e.x c;
    private a d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final r g = new r(32, 128);
    private final r h = new r(33, 128);
    private final r i = new r(34, 128);
    private final r j = new r(39, 128);
    private final r k = new r(40, 128);
    private long m = -9223372036854775807L;
    private final com.applovin.exoplayer2.l.y n = new com.applovin.exoplayer2.l.y();

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public n(z zVar) {
        this.f355a = zVar;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.b = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.c = xVarA;
        this.d = new a(xVarA);
        this.f355a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        c();
        while (yVar.a() > 0) {
            int iC = yVar.c();
            int iB = yVar.b();
            byte[] bArrD = yVar.d();
            this.l += (long) yVar.a();
            this.c.a(yVar, yVar.a());
            while (iC < iB) {
                int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.f);
                if (iA == iB) {
                    a(bArrD, iC, iB);
                    return;
                }
                int iC2 = com.applovin.exoplayer2.l.v.c(bArrD, iA);
                int i = iA - iC;
                if (i > 0) {
                    a(bArrD, iC, iA);
                }
                int i2 = iB - iA;
                long j = this.l - ((long) i2);
                b(j, i2, i < 0 ? -i : 0, this.m);
                a(j, i2, iC2, this.m);
                iC = iA + 3;
            }
        }
    }

    private void a(long j, int i, int i2, long j2) {
        this.d.a(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.a(i2);
            this.h.a(i2);
            this.i.a(i2);
        }
        this.j.a(i2);
        this.k.a(i2);
    }

    private void a(byte[] bArr, int i, int i2) {
        this.d.a(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    private void b(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.b() && this.h.b() && this.i.b()) {
                this.c.a(a(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            this.n.a(this.j.f360a, com.applovin.exoplayer2.l.v.a(this.j.f360a, this.j.b));
            this.n.e(5);
            this.f355a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            this.n.a(this.k.f360a, com.applovin.exoplayer2.l.v.a(this.k.f360a, this.k.b));
            this.n.e(5);
            this.f355a.a(j2, this.n);
        }
    }

    private static com.applovin.exoplayer2.v a(String str, r rVar, r rVar2, r rVar3) {
        byte[] bArr = new byte[rVar.b + rVar2.b + rVar3.b];
        System.arraycopy(rVar.f360a, 0, bArr, 0, rVar.b);
        System.arraycopy(rVar2.f360a, 0, bArr, rVar.b, rVar2.b);
        System.arraycopy(rVar3.f360a, 0, bArr, rVar.b + rVar2.b, rVar3.b);
        com.applovin.exoplayer2.l.z zVar = new com.applovin.exoplayer2.l.z(rVar2.f360a, 0, rVar2.b);
        zVar.a(44);
        int iC = zVar.c(3);
        zVar.a();
        zVar.a(88);
        zVar.a(8);
        int i = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            if (zVar.b()) {
                i += 89;
            }
            if (zVar.b()) {
                i += 8;
            }
        }
        zVar.a(i);
        if (iC > 0) {
            zVar.a((8 - iC) * 2);
        }
        zVar.d();
        int iD = zVar.d();
        if (iD == 3) {
            zVar.a();
        }
        int iD2 = zVar.d();
        int iD3 = zVar.d();
        if (zVar.b()) {
            int iD4 = zVar.d();
            int iD5 = zVar.d();
            int iD6 = zVar.d();
            int iD7 = zVar.d();
            iD2 -= ((iD == 1 || iD == 2) ? 2 : 1) * (iD4 + iD5);
            iD3 -= (iD == 1 ? 2 : 1) * (iD6 + iD7);
        }
        zVar.d();
        zVar.d();
        int iD8 = zVar.d();
        for (int i3 = zVar.b() ? 0 : iC; i3 <= iC; i3++) {
            zVar.d();
            zVar.d();
            zVar.d();
        }
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        zVar.d();
        if (zVar.b() && zVar.b()) {
            a(zVar);
        }
        zVar.a(2);
        if (zVar.b()) {
            zVar.a(8);
            zVar.d();
            zVar.d();
            zVar.a();
        }
        b(zVar);
        if (zVar.b()) {
            for (int i4 = 0; i4 < zVar.d(); i4++) {
                zVar.a(iD8 + 5);
            }
        }
        zVar.a(2);
        float f = 1.0f;
        if (zVar.b()) {
            if (zVar.b()) {
                int iC2 = zVar.c(8);
                if (iC2 == 255) {
                    int iC3 = zVar.c(16);
                    int iC4 = zVar.c(16);
                    if (iC3 != 0 && iC4 != 0) {
                        f = iC3 / iC4;
                    }
                } else if (iC2 < com.applovin.exoplayer2.l.v.b.length) {
                    f = com.applovin.exoplayer2.l.v.b[iC2];
                } else {
                    com.applovin.exoplayer2.l.q.c("H265Reader", "Unexpected aspect_ratio_idc value: " + iC2);
                }
            }
            if (zVar.b()) {
                zVar.a();
            }
            if (zVar.b()) {
                zVar.a(4);
                if (zVar.b()) {
                    zVar.a(24);
                }
            }
            if (zVar.b()) {
                zVar.d();
                zVar.d();
            }
            zVar.a();
            if (zVar.b()) {
                iD3 *= 2;
            }
        }
        zVar.a(rVar2.f360a, 0, rVar2.b);
        zVar.a(24);
        return new v.a().a(str).f("video/hevc").d(com.applovin.exoplayer2.l.e.a(zVar)).g(iD2).h(iD3).b(f).a(Collections.singletonList(bArr)).a();
    }

    private static void a(com.applovin.exoplayer2.l.z zVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!zVar.b()) {
                    zVar.d();
                } else {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        zVar.e();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        zVar.e();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void b(com.applovin.exoplayer2.l.z zVar) {
        int iD = zVar.d();
        boolean zB = false;
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            if (i2 != 0) {
                zB = zVar.b();
            }
            if (zB) {
                zVar.a();
                zVar.d();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (zVar.b()) {
                        zVar.a();
                    }
                }
            } else {
                int iD2 = zVar.d();
                int iD3 = zVar.d();
                int i4 = iD2 + iD3;
                for (int i5 = 0; i5 < iD2; i5++) {
                    zVar.d();
                    zVar.a();
                }
                for (int i6 = 0; i6 < iD3; i6++) {
                    zVar.d();
                    zVar.a();
                }
                i = i4;
            }
        }
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.c);
        ai.a(this.d);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f356a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        private static boolean b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean c(int i) {
            return i < 32 || i == 40;
        }

        public a(com.applovin.exoplayer2.e.x xVar) {
            this.f356a = xVar;
        }

        public void a() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void a(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!c(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        a(i);
                    }
                    this.i = false;
                }
                if (b(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.g = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.f = false;
                } else {
                    this.d = i3 + (i2 - i);
                }
            }
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    a(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
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
            long j = this.l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.m;
            this.f356a.a(j, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }
    }
}
