package com.applovin.exoplayer2;

import android.os.Handler;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class ah {
    private final d d;
    private final q.a e;
    private final g.a f;
    private final HashMap<c, b> g;
    private final Set<c> h;
    private boolean j;
    private com.applovin.exoplayer2.k.aa k;
    private com.applovin.exoplayer2.h.z i = new z.a(0);
    private final IdentityHashMap<com.applovin.exoplayer2.h.n, c> b = new IdentityHashMap<>();
    private final Map<Object, c> c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f31a = new ArrayList();

    public interface d {
        void e();
    }

    public ah(d dVar, com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.d = dVar;
        q.a aVar2 = new q.a();
        this.e = aVar2;
        g.a aVar3 = new g.a();
        this.f = aVar3;
        this.g = new HashMap<>();
        this.h = new HashSet();
        if (aVar != null) {
            aVar2.a(handler, aVar);
            aVar3.a(handler, aVar);
        }
    }

    public ba a(List<c> list, com.applovin.exoplayer2.h.z zVar) {
        a(0, this.f31a.size());
        return a(this.f31a.size(), list, zVar);
    }

    public ba a(int i, List<c> list, com.applovin.exoplayer2.h.z zVar) {
        if (!list.isEmpty()) {
            this.i = zVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.f31a.get(i2 - 1);
                    cVar.a(cVar2.d + cVar2.f34a.f().b());
                } else {
                    cVar.a(0);
                }
                b(i2, cVar.f34a.f().b());
                this.f31a.add(i2, cVar);
                this.c.put(cVar.b, cVar);
                if (this.j) {
                    c(cVar);
                    if (this.b.isEmpty()) {
                        this.h.add(cVar);
                    } else {
                        b(cVar);
                    }
                }
            }
        }
        return d();
    }

    public ba a(int i, int i2, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i >= 0 && i <= i2 && i2 <= b());
        this.i = zVar;
        a(i, i2);
        return d();
    }

    public ba a(int i, int i2, int i3, com.applovin.exoplayer2.h.z zVar) {
        com.applovin.exoplayer2.l.a.a(i >= 0 && i <= i2 && i2 <= b() && i3 >= 0);
        this.i = zVar;
        if (i == i2 || i == i3) {
            return d();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int iB = this.f31a.get(iMin).d;
        com.applovin.exoplayer2.l.ai.a(this.f31a, i, i2, i3);
        while (iMin <= iMax) {
            c cVar = this.f31a.get(iMin);
            cVar.d = iB;
            iB += cVar.f34a.f().b();
            iMin++;
        }
        return d();
    }

    public boolean a() {
        return this.j;
    }

    public int b() {
        return this.f31a.size();
    }

    public ba a(com.applovin.exoplayer2.h.z zVar) {
        int iB = b();
        if (zVar.a() != iB) {
            zVar = zVar.d().a(0, iB);
        }
        this.i = zVar;
        return d();
    }

    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(!this.j);
        this.k = aaVar;
        for (int i = 0; i < this.f31a.size(); i++) {
            c cVar = this.f31a.get(i);
            c(cVar);
            this.h.add(cVar);
        }
        this.j = true;
    }

    public com.applovin.exoplayer2.h.n a(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j) {
        Object objA = a(aVar.f471a);
        p.a aVarA = aVar.a(b(aVar.f471a));
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.c.get(objA));
        a(cVar);
        cVar.c.add(aVarA);
        com.applovin.exoplayer2.h.k kVarB = cVar.f34a.b(aVarA, bVar, j);
        this.b.put(kVarB, cVar);
        e();
        return kVarB;
    }

    public void a(com.applovin.exoplayer2.h.n nVar) {
        c cVar = (c) com.applovin.exoplayer2.l.a.b(this.b.remove(nVar));
        cVar.f34a.a(nVar);
        cVar.c.remove(((com.applovin.exoplayer2.h.k) nVar).f468a);
        if (!this.b.isEmpty()) {
            e();
        }
        d(cVar);
    }

    public void c() {
        for (b bVar : this.g.values()) {
            try {
                bVar.f33a.c(bVar.b);
            } catch (RuntimeException e) {
                com.applovin.exoplayer2.l.q.c("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f33a.a((com.applovin.exoplayer2.h.q) bVar.c);
            bVar.f33a.a((com.applovin.exoplayer2.d.g) bVar.c);
        }
        this.g.clear();
        this.h.clear();
        this.j = false;
    }

    public ba d() {
        if (this.f31a.isEmpty()) {
            return ba.f89a;
        }
        int iB = 0;
        for (int i = 0; i < this.f31a.size(); i++) {
            c cVar = this.f31a.get(i);
            cVar.d = iB;
            iB += cVar.f34a.f().b();
        }
        return new ap(this.f31a, this.i);
    }

    private void a(c cVar) {
        this.h.add(cVar);
        b bVar = this.g.get(cVar);
        if (bVar != null) {
            bVar.f33a.a(bVar.b);
        }
    }

    private void e() {
        Iterator<c> it = this.h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c.isEmpty()) {
                b(next);
                it.remove();
            }
        }
    }

    private void b(c cVar) {
        b bVar = this.g.get(cVar);
        if (bVar != null) {
            bVar.f33a.b(bVar.b);
        }
    }

    private void a(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVarRemove = this.f31a.remove(i3);
            this.c.remove(cVarRemove.b);
            b(i3, -cVarRemove.f34a.f().b());
            cVarRemove.e = true;
            if (this.j) {
                d(cVarRemove);
            }
        }
    }

    private void b(int i, int i2) {
        while (i < this.f31a.size()) {
            this.f31a.get(i).d += i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p.a b(c cVar, p.a aVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (cVar.c.get(i).d == aVar.d) {
                return aVar.a(a(cVar, aVar.f471a));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(c cVar, int i) {
        return i + cVar.d;
    }

    private void c(c cVar) {
        com.applovin.exoplayer2.h.l lVar = cVar.f34a;
        p.b bVar = new p.b() { // from class: com.applovin.exoplayer2.ah$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(com.applovin.exoplayer2.h.p pVar, ba baVar) {
                this.f$0.a(pVar, baVar);
            }
        };
        a aVar = new a(cVar);
        this.g.put(cVar, new b(lVar, bVar, aVar));
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.h.q) aVar);
        lVar.a(com.applovin.exoplayer2.l.ai.b(), (com.applovin.exoplayer2.d.g) aVar);
        lVar.a(bVar, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.exoplayer2.h.p pVar, ba baVar) {
        this.d.e();
    }

    private void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(this.g.remove(cVar));
            bVar.f33a.c(bVar.b);
            bVar.f33a.a((com.applovin.exoplayer2.h.q) bVar.c);
            bVar.f33a.a((com.applovin.exoplayer2.d.g) bVar.c);
            this.h.remove(cVar);
        }
    }

    private static Object a(Object obj) {
        return ap.a(obj);
    }

    private static Object b(Object obj) {
        return ap.b(obj);
    }

    private static Object a(c cVar, Object obj) {
        return ap.a(cVar.b, obj);
    }

    static final class c implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.l f34a;
        public int d;
        public boolean e;
        public final List<p.a> c = new ArrayList();
        public final Object b = new Object();

        public c(com.applovin.exoplayer2.h.p pVar, boolean z) {
            this.f34a = new com.applovin.exoplayer2.h.l(pVar, z);
        }

        public void a(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.b;
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.f34a.f();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p f33a;
        public final p.b b;
        public final a c;

        public b(com.applovin.exoplayer2.h.p pVar, p.b bVar, a aVar) {
            this.f33a = pVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements com.applovin.exoplayer2.d.g, com.applovin.exoplayer2.h.q {
        private final c b;
        private q.a c;
        private g.a d;

        @Override // com.applovin.exoplayer2.d.g
        public /* synthetic */ void e(int i, p.a aVar) {
            g.CC.$default$e(this, i, aVar);
        }

        public a(c cVar) {
            this.c = ah.this.e;
            this.d = ah.this.f;
            this.b = cVar;
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i, aVar)) {
                this.c.a(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i, aVar)) {
                this.c.b(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i, aVar)) {
                this.c.c(jVar, mVar);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.c.a(jVar, mVar, iOException, z);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, com.applovin.exoplayer2.h.m mVar) {
            if (f(i, aVar)) {
                this.c.a(mVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i, p.a aVar, int i2) {
            if (f(i, aVar)) {
                this.d.a(i2);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.d.a();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void a(int i, p.a aVar, Exception exc) {
            if (f(i, aVar)) {
                this.d.a(exc);
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void b(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.d.b();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void c(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.d.c();
            }
        }

        @Override // com.applovin.exoplayer2.d.g
        public void d(int i, p.a aVar) {
            if (f(i, aVar)) {
                this.d.d();
            }
        }

        private boolean f(int i, p.a aVar) {
            p.a aVarB;
            if (aVar != null) {
                aVarB = ah.b(this.b, aVar);
                if (aVarB == null) {
                    return false;
                }
            } else {
                aVarB = null;
            }
            int iB = ah.b(this.b, i);
            if (this.c.f472a != iB || !com.applovin.exoplayer2.l.ai.a(this.c.b, aVarB)) {
                this.c = ah.this.e.a(iB, aVarB, 0L);
            }
            if (this.d.f251a == iB && com.applovin.exoplayer2.l.ai.a(this.d.b, aVarB)) {
                return true;
            }
            this.d = ah.this.f.a(iB, aVarB);
            return true;
        }
    }
}
