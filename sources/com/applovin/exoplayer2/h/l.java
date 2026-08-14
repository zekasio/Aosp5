package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f469a;
    private final boolean b;
    private final ba.c c;
    private final ba.a d;
    private a e;
    private k f;
    private boolean g;
    private boolean h;
    private boolean i;

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.p
    public void e() {
    }

    public l(p pVar, boolean z) {
        this.f469a = pVar;
        this.b = z && pVar.i();
        this.c = new ba.c();
        this.d = new ba.a();
        ba baVarH = pVar.h();
        if (baVarH != null) {
            this.e = a.a(baVarH, (Object) null, (Object) null);
            this.i = true;
        } else {
            this.e = a.a(pVar.g());
        }
    }

    public ba f() {
        return this.e;
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        super.a(aaVar);
        if (this.b) {
            return;
        }
        this.g = true;
        a((Object) null, this.f469a);
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f469a.g();
    }

    @Override // com.applovin.exoplayer2.h.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j) {
        k kVar = new k(aVar, bVar, j);
        kVar.a(this.f469a);
        if (this.h) {
            kVar.a(aVar.a(a(aVar.f471a)));
        } else {
            this.f = kVar;
            if (!this.g) {
                this.g = true;
                a((Object) null, this.f469a);
            }
        }
        return kVar;
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((k) nVar).i();
        if (nVar == this.f) {
            this.f = null;
        }
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void c() {
        this.h = false;
        this.g = false;
        super.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.applovin.exoplayer2.h.e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Void r13, com.applovin.exoplayer2.h.p r14, com.applovin.exoplayer2.ba r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.l.b(java.lang.Void, com.applovin.exoplayer2.h.p, com.applovin.exoplayer2.ba):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.exoplayer2.h.e
    public p.a a(Void r1, p.a aVar) {
        return aVar.a(b(aVar.f471a));
    }

    private Object a(Object obj) {
        return (this.e.f == null || !obj.equals(a.d)) ? obj : this.e.f;
    }

    private Object b(Object obj) {
        return (this.e.f == null || !this.e.f.equals(obj)) ? obj : a.d;
    }

    private void a(long j) {
        k kVar = this.f;
        int iC = this.e.c(kVar.f468a.f471a);
        if (iC == -1) {
            return;
        }
        long j2 = this.e.a(iC, this.d).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        kVar.d(j);
    }

    private static final class a extends h {
        public static final Object d = new Object();
        private final Object e;
        private final Object f;

        public static a a(com.applovin.exoplayer2.ab abVar) {
            return new a(new b(abVar), ba.c.f91a, d);
        }

        public static a a(ba baVar, Object obj, Object obj2) {
            return new a(baVar, obj, obj2);
        }

        private a(ba baVar, Object obj, Object obj2) {
            super(baVar);
            this.e = obj;
            this.f = obj2;
        }

        public a a(ba baVar) {
            return new a(baVar, this.e, this.f);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.c a(int i, ba.c cVar, long j) {
            this.c.a(i, cVar, j);
            if (ai.a(cVar.b, this.e)) {
                cVar.b = ba.c.f91a;
            }
            return cVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.a a(int i, ba.a aVar, boolean z) {
            this.c.a(i, aVar, z);
            if (ai.a(aVar.b, this.f) && z) {
                aVar.b = d;
            }
            return aVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public int c(Object obj) {
            Object obj2;
            ba baVar = this.c;
            if (d.equals(obj) && (obj2 = this.f) != null) {
                obj = obj2;
            }
            return baVar.c(obj);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public Object a(int i) {
            Object objA = this.c.a(i);
            return ai.a(objA, this.f) ? d : objA;
        }
    }

    public static final class b extends ba {
        private final com.applovin.exoplayer2.ab c;

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 1;
        }

        public b(com.applovin.exoplayer2.ab abVar) {
            this.c = abVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.c a(int i, ba.c cVar, long j) {
            cVar.a(ba.c.f91a, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.m = true;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.a a(int i, ba.a aVar, boolean z) {
            aVar.a(z ? 0 : null, z ? a.d : null, 0, -9223372036854775807L, 0L, com.applovin.exoplayer2.h.a.a.f454a, true);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return obj == a.d ? 0 : -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i) {
            return a.d;
        }
    }
}
