package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> extends com.applovin.exoplayer2.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<T, b<T>> f462a = new HashMap<>();
    private Handler b;
    private com.applovin.exoplayer2.k.aa c;

    protected int a(T t, int i) {
        return i;
    }

    protected long a(T t, long j) {
        return j;
    }

    protected p.a a(T t, p.a aVar) {
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract void b(T t, p pVar, ba baVar);

    protected e() {
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.c = aaVar;
        this.b = ai.a();
    }

    @Override // com.applovin.exoplayer2.h.p
    public void e() throws IOException {
        Iterator<b<T>> it = this.f462a.values().iterator();
        while (it.hasNext()) {
            it.next().f464a.e();
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void a() {
        for (b<T> bVar : this.f462a.values()) {
            bVar.f464a.a(bVar.b);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void b() {
        for (b<T> bVar : this.f462a.values()) {
            bVar.f464a.b(bVar.b);
        }
    }

    @Override // com.applovin.exoplayer2.h.a
    protected void c() {
        for (b<T> bVar : this.f462a.values()) {
            bVar.f464a.c(bVar.b);
            bVar.f464a.a((q) bVar.c);
            bVar.f464a.a((com.applovin.exoplayer2.d.g) bVar.c);
        }
        this.f462a.clear();
    }

    protected final void a(final T t, p pVar) {
        com.applovin.exoplayer2.l.a.a(!this.f462a.containsKey(t));
        p.b bVar = new p.b() { // from class: com.applovin.exoplayer2.h.e$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.h.p.b
            public final void onSourceInfoRefreshed(p pVar2, ba baVar) {
                this.f$0.b(t, pVar2, baVar);
            }
        };
        a aVar = new a(t);
        this.f462a.put(t, new b<>(pVar, bVar, aVar));
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.b), (q) aVar);
        pVar.a((Handler) com.applovin.exoplayer2.l.a.b(this.b), (com.applovin.exoplayer2.d.g) aVar);
        pVar.a(bVar, this.c);
        if (d()) {
            return;
        }
        pVar.b(bVar);
    }

    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f464a;
        public final p.b b;
        public final e<T>.a c;

        public b(p pVar, p.b bVar, e<T>.a aVar) {
            this.f464a = pVar;
            this.b = bVar;
            this.c = aVar;
        }
    }

    private final class a implements com.applovin.exoplayer2.d.g, q {
        private final T b;
        private q.a c;
        private g.a d;

        @Override // com.applovin.exoplayer2.d.g
        public /* synthetic */ void e(int i, p.a aVar) {
            g.CC.$default$e(this, i, aVar);
        }

        public a(T t) {
            this.c = e.this.a((p.a) null);
            this.d = e.this.b((p.a) null);
            this.b = t;
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.c.a(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void b(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.c.b(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void c(int i, p.a aVar, j jVar, m mVar) {
            if (f(i, aVar)) {
                this.c.c(jVar, a(mVar));
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z) {
            if (f(i, aVar)) {
                this.c.a(jVar, a(mVar), iOException, z);
            }
        }

        @Override // com.applovin.exoplayer2.h.q
        public void a(int i, p.a aVar, m mVar) {
            if (f(i, aVar)) {
                this.c.a(a(mVar));
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
            p.a aVarA;
            if (aVar != null) {
                aVarA = e.this.a(this.b, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = e.this.a((Object) this.b, i);
            if (this.c.f472a != iA || !ai.a(this.c.b, aVarA)) {
                this.c = e.this.a(iA, aVarA, 0L);
            }
            if (this.d.f251a == iA && ai.a(this.d.b, aVarA)) {
                return true;
            }
            this.d = e.this.a(iA, aVarA);
            return true;
        }

        private m a(m mVar) {
            long jA = e.this.a(this.b, mVar.f);
            long jA2 = e.this.a(this.b, mVar.g);
            return (jA == mVar.f && jA2 == mVar.g) ? mVar : new m(mVar.f470a, mVar.b, mVar.c, mVar.d, mVar.e, jA, jA2);
        }
    }
}
