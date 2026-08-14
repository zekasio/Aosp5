package com.applovin.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.p;

/* JADX INFO: loaded from: classes.dex */
final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ba.a f30a = new ba.a();
    private final ba.c b = new ba.c();
    private final com.applovin.exoplayer2.a.a c;
    private final Handler d;
    private long e;
    private int f;
    private boolean g;
    private ad h;
    private ad i;
    private ad j;
    private int k;
    private Object l;
    private long m;

    private boolean a(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public af(com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.c = aVar;
        this.d = handler;
    }

    public boolean a(ba baVar, int i) {
        this.f = i;
        return a(baVar);
    }

    public boolean a(ba baVar, boolean z) {
        this.g = z;
        return a(baVar);
    }

    public boolean a(com.applovin.exoplayer2.h.n nVar) {
        ad adVar = this.j;
        return adVar != null && adVar.f28a == nVar;
    }

    public void a(long j) {
        ad adVar = this.j;
        if (adVar != null) {
            adVar.d(j);
        }
    }

    public boolean a() {
        ad adVar = this.j;
        return adVar == null || (!adVar.f.i && this.j.c() && this.j.f.e != -9223372036854775807L && this.k < 100);
    }

    public ae a(long j, al alVar) {
        if (this.j == null) {
            return a(alVar);
        }
        return a(alVar.f37a, this.j, j);
    }

    public ad a(as[] asVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.k.b bVar, ah ahVar, ae aeVar, com.applovin.exoplayer2.j.k kVar) {
        long jA;
        ad adVar = this.j;
        if (adVar == null) {
            jA = (!aeVar.f29a.a() || aeVar.c == -9223372036854775807L) ? 0L : aeVar.c;
        } else {
            jA = (adVar.a() + this.j.f.e) - aeVar.b;
        }
        ad adVar2 = new ad(asVarArr, jA, jVar, bVar, ahVar, aeVar, kVar);
        ad adVar3 = this.j;
        if (adVar3 != null) {
            adVar3.a(adVar2);
        } else {
            this.h = adVar2;
            this.i = adVar2;
        }
        this.l = null;
        this.j = adVar2;
        this.k++;
        h();
        return adVar2;
    }

    public ad b() {
        return this.j;
    }

    public ad c() {
        return this.h;
    }

    public ad d() {
        return this.i;
    }

    public ad e() {
        ad adVar = this.i;
        com.applovin.exoplayer2.l.a.b((adVar == null || adVar.g() == null) ? false : true);
        this.i = this.i.g();
        h();
        return this.i;
    }

    public ad f() {
        ad adVar = this.h;
        if (adVar == null) {
            return null;
        }
        if (adVar == this.i) {
            this.i = adVar.g();
        }
        this.h.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            this.l = this.h.b;
            this.m = this.h.f.f29a.d;
        }
        this.h = this.h.g();
        h();
        return this.h;
    }

    public boolean a(ad adVar) {
        boolean z = false;
        com.applovin.exoplayer2.l.a.b(adVar != null);
        if (adVar.equals(this.j)) {
            return false;
        }
        this.j = adVar;
        while (adVar.g() != null) {
            adVar = adVar.g();
            if (adVar == this.i) {
                this.i = this.h;
                z = true;
            }
            adVar.f();
            this.k--;
        }
        this.j.a((ad) null);
        h();
        return z;
    }

    public void g() {
        if (this.k == 0) {
            return;
        }
        ad adVarG = (ad) com.applovin.exoplayer2.l.a.a(this.h);
        this.l = adVarG.b;
        this.m = adVarG.f.f29a.d;
        while (adVarG != null) {
            adVarG.f();
            adVarG = adVarG.g();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        h();
    }

    public boolean a(ba baVar, long j, long j2) {
        ae aeVarA;
        ad adVarG = this.h;
        ad adVar = null;
        while (adVarG != null) {
            ae aeVar = adVarG.f;
            if (adVar == null) {
                aeVarA = a(baVar, aeVar);
            } else {
                ae aeVarA2 = a(baVar, adVar, j);
                if (aeVarA2 == null) {
                    return !a(adVar);
                }
                if (!a(aeVar, aeVarA2)) {
                    return !a(adVar);
                }
                aeVarA = aeVarA2;
            }
            adVarG.f = aeVarA.b(aeVar.c);
            if (!a(aeVar.e, aeVarA.e)) {
                adVarG.j();
                return (a(adVarG) || (adVarG == this.i && !adVarG.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((aeVarA.e > (-9223372036854775807L) ? 1 : (aeVarA.e == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVarG.a(aeVarA.e)) ? 1 : (j2 == ((aeVarA.e > (-9223372036854775807L) ? 1 : (aeVarA.e == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVarG.a(aeVarA.e)) ? 0 : -1)) >= 0))) ? false : true;
            }
            adVar = adVarG;
            adVarG = adVarG.g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.ae a(com.applovin.exoplayer2.ba r19, com.applovin.exoplayer2.ae r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.exoplayer2.h.p$a r3 = r2.f29a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.exoplayer2.h.p$a r4 = r2.f29a
            java.lang.Object r4 = r4.f471a
            com.applovin.exoplayer2.ba$a r5 = r0.f30a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.e
            if (r1 != r4) goto L2e
            goto L37
        L2e:
            com.applovin.exoplayer2.ba$a r1 = r0.f30a
            int r7 = r3.e
            long r7 = r1.a(r7)
            goto L38
        L37:
            r7 = r5
        L38:
            boolean r1 = r3.a()
            if (r1 == 0) goto L4a
            com.applovin.exoplayer2.ba$a r1 = r0.f30a
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.b(r5, r6)
        L48:
            r9 = r5
            goto L5e
        L4a:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L57
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L55
            goto L57
        L55:
            r9 = r7
            goto L5e
        L57:
            com.applovin.exoplayer2.ba$a r1 = r0.f30a
            long r5 = r1.a()
            goto L48
        L5e:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6e
            com.applovin.exoplayer2.ba$a r1 = r0.f30a
            int r4 = r3.b
            boolean r1 = r1.e(r4)
            r11 = r1
            goto L81
        L6e:
            int r1 = r3.e
            if (r1 == r4) goto L7f
            com.applovin.exoplayer2.ba$a r1 = r0.f30a
            int r4 = r3.e
            boolean r1 = r1.e(r4)
            if (r1 == 0) goto L7f
            r1 = 1
            r11 = 1
            goto L81
        L7f:
            r1 = 0
            r11 = 0
        L81:
            com.applovin.exoplayer2.ae r15 = new com.applovin.exoplayer2.ae
            long r4 = r2.b
            long r1 = r2.c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.af.a(com.applovin.exoplayer2.ba, com.applovin.exoplayer2.ae):com.applovin.exoplayer2.ae");
    }

    public p.a a(ba baVar, Object obj, long j) {
        return a(baVar, obj, j, a(baVar, obj), this.f30a);
    }

    private void h() {
        if (this.c != null) {
            final s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
            for (ad adVarG = this.h; adVarG != null; adVarG = adVarG.g()) {
                aVarI.a(adVarG.f.f29a);
            }
            ad adVar = this.i;
            final p.a aVar = adVar == null ? null : adVar.f.f29a;
            this.d.post(new Runnable() { // from class: com.applovin.exoplayer2.af$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(aVarI, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s.a aVar, p.a aVar2) {
        this.c.a(aVar.a(), aVar2);
    }

    private static p.a a(ba baVar, Object obj, long j, long j2, ba.a aVar) {
        baVar.a(obj, aVar);
        int iA = aVar.a(j);
        if (iA == -1) {
            return new p.a(obj, j2, aVar.b(j));
        }
        return new p.a(obj, iA, aVar.b(iA), j2);
    }

    private long a(ba baVar, Object obj) {
        int iC;
        int i = baVar.a(obj, this.f30a).c;
        Object obj2 = this.l;
        if (obj2 != null && (iC = baVar.c(obj2)) != -1 && baVar.a(iC, this.f30a).c == i) {
            return this.m;
        }
        for (ad adVarG = this.h; adVarG != null; adVarG = adVarG.g()) {
            if (adVarG.b.equals(obj)) {
                return adVarG.f.f29a.d;
            }
        }
        for (ad adVarG2 = this.h; adVarG2 != null; adVarG2 = adVarG2.g()) {
            int iC2 = baVar.c(adVarG2.b);
            if (iC2 != -1 && baVar.a(iC2, this.f30a).c == i) {
                return adVarG2.f.f29a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    private boolean a(ae aeVar, ae aeVar2) {
        return aeVar.b == aeVar2.b && aeVar.f29a.equals(aeVar2.f29a);
    }

    private boolean a(ba baVar) {
        ad adVarG = this.h;
        if (adVarG == null) {
            return true;
        }
        int iC = baVar.c(adVarG.b);
        while (true) {
            iC = baVar.a(iC, this.f30a, this.b, this.f, this.g);
            while (adVarG.g() != null && !adVarG.f.g) {
                adVarG = adVarG.g();
            }
            ad adVarG2 = adVarG.g();
            if (iC == -1 || adVarG2 == null || baVar.c(adVarG2.b) != iC) {
                break;
            }
            adVarG = adVarG2;
        }
        boolean zA = a(adVarG);
        adVarG.f = a(baVar, adVarG.f);
        return !zA;
    }

    private ae a(al alVar) {
        return a(alVar.f37a, alVar.b, alVar.c, alVar.s);
    }

    private ae a(ba baVar, ad adVar, long j) {
        long j2;
        ae aeVar = adVar.f;
        long jA = (adVar.a() + aeVar.e) - j;
        if (aeVar.g) {
            long j3 = 0;
            int iA = baVar.a(baVar.c(aeVar.f29a.f471a), this.f30a, this.b, this.f, this.g);
            if (iA == -1) {
                return null;
            }
            int i = baVar.a(iA, this.f30a, true).c;
            Object obj = this.f30a.b;
            long j4 = aeVar.f29a.d;
            if (baVar.a(i, this.b).p == iA) {
                Pair<Object, Long> pairA = baVar.a(this.b, this.f30a, i, -9223372036854775807L, Math.max(0L, jA));
                if (pairA == null) {
                    return null;
                }
                obj = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                ad adVarG = adVar.g();
                if (adVarG != null && adVarG.b.equals(obj)) {
                    j4 = adVarG.f.f29a.d;
                } else {
                    j4 = this.e;
                    this.e = 1 + j4;
                }
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return a(baVar, a(baVar, obj, j2, j4, this.f30a), j3, j2);
        }
        p.a aVar = aeVar.f29a;
        baVar.a(aVar.f471a, this.f30a);
        if (aVar.a()) {
            int i2 = aVar.b;
            int iD = this.f30a.d(i2);
            if (iD == -1) {
                return null;
            }
            int iA2 = this.f30a.a(i2, aVar.c);
            if (iA2 < iD) {
                return a(baVar, aVar.f471a, i2, iA2, aeVar.c, aVar.d);
            }
            long jLongValue2 = aeVar.c;
            if (jLongValue2 == -9223372036854775807L) {
                ba.c cVar = this.b;
                ba.a aVar2 = this.f30a;
                Pair<Object, Long> pairA2 = baVar.a(cVar, aVar2, aVar2.c, -9223372036854775807L, Math.max(0L, jA));
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            }
            return a(baVar, aVar.f471a, Math.max(a(baVar, aVar.f471a, aVar.b), jLongValue2), aeVar.c, aVar.d);
        }
        int iB = this.f30a.b(aVar.e);
        if (iB == this.f30a.d(aVar.e)) {
            return a(baVar, aVar.f471a, a(baVar, aVar.f471a, aVar.e), aeVar.e, aVar.d);
        }
        return a(baVar, aVar.f471a, aVar.e, iB, aeVar.e, aVar.d);
    }

    private ae a(ba baVar, p.a aVar, long j, long j2) {
        baVar.a(aVar.f471a, this.f30a);
        if (aVar.a()) {
            return a(baVar, aVar.f471a, aVar.b, aVar.c, j, aVar.d);
        }
        return a(baVar, aVar.f471a, j2, j, aVar.d);
    }

    private ae a(ba baVar, Object obj, int i, int i2, long j, long j2) {
        p.a aVar = new p.a(obj, i, i2, j2);
        long jB = baVar.a(aVar.f471a, this.f30a).b(aVar.b, aVar.c);
        long jF = i2 == this.f30a.b(i) ? this.f30a.f() : 0L;
        return new ae(aVar, (jB == -9223372036854775807L || jF < jB) ? jF : Math.max(0L, jB - 1), j, -9223372036854775807L, jB, this.f30a.e(aVar.b), false, false, false);
    }

    private ae a(ba baVar, Object obj, long j, long j2, long j3) {
        long jMax = j;
        baVar.a(obj, this.f30a);
        int iB = this.f30a.b(jMax);
        p.a aVar = new p.a(obj, j3, iB);
        boolean zA = a(aVar);
        boolean zA2 = a(baVar, aVar);
        boolean zA3 = a(baVar, aVar, zA);
        boolean z = iB != -1 && this.f30a.e(iB);
        long jA = iB != -1 ? this.f30a.a(iB) : -9223372036854775807L;
        long j4 = (jA == -9223372036854775807L || jA == Long.MIN_VALUE) ? this.f30a.d : jA;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        return new ae(aVar, jMax, j2, jA, j4, z, zA, zA2, zA3);
    }

    private boolean a(p.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean a(ba baVar, p.a aVar) {
        if (a(aVar)) {
            return baVar.a(baVar.a(aVar.f471a, this.f30a).c, this.b).q == baVar.c(aVar.f471a);
        }
        return false;
    }

    private boolean a(ba baVar, p.a aVar, boolean z) {
        int iC = baVar.c(aVar.f471a);
        return !baVar.a(baVar.a(iC, this.f30a).c, this.b).j && baVar.b(iC, this.f30a, this.b, this.f, this.g) && z;
    }

    private long a(ba baVar, Object obj, int i) {
        baVar.a(obj, this.f30a);
        long jA = this.f30a.a(i);
        if (jA == Long.MIN_VALUE) {
            return this.f30a.d;
        }
        return jA + this.f30a.f(i);
    }
}
