package com.applovin.exoplayer2.h;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<p.b> f453a = new ArrayList<>(1);
    private final HashSet<p.b> b = new HashSet<>(1);
    private final q.a c = new q.a();
    private final g.a d = new g.a();
    private Looper e;
    private ba f;

    protected void a() {
    }

    protected abstract void a(com.applovin.exoplayer2.k.aa aaVar);

    protected void b() {
    }

    protected abstract void c();

    @Override // com.applovin.exoplayer2.h.p
    public /* synthetic */ ba h() {
        return p.CC.$default$h(this);
    }

    @Override // com.applovin.exoplayer2.h.p
    public /* synthetic */ boolean i() {
        return p.CC.$default$i(this);
    }

    protected final void a(ba baVar) {
        this.f = baVar;
        Iterator<p.b> it = this.f453a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, baVar);
        }
    }

    protected final q.a a(p.a aVar) {
        return this.c.a(0, aVar, 0L);
    }

    protected final q.a a(int i, p.a aVar, long j) {
        return this.c.a(i, aVar, j);
    }

    protected final g.a b(p.a aVar) {
        return this.d.a(0, aVar);
    }

    protected final g.a a(int i, p.a aVar) {
        return this.d.a(i, aVar);
    }

    protected final boolean d() {
        return !this.b.isEmpty();
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, q qVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(qVar);
        this.c.a(handler, qVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(q qVar) {
        this.c.a(qVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(Handler handler, com.applovin.exoplayer2.d.g gVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(gVar);
        this.d.a(handler, gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(com.applovin.exoplayer2.d.g gVar) {
        this.d.a(gVar);
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar, com.applovin.exoplayer2.k.aa aaVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        com.applovin.exoplayer2.l.a.a(looper == null || looper == looperMyLooper);
        ba baVar = this.f;
        this.f453a.add(bVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(bVar);
            a(aaVar);
        } else if (baVar != null) {
            a(bVar);
            bVar.onSourceInfoRefreshed(this, baVar);
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void a(p.b bVar) {
        com.applovin.exoplayer2.l.a.b(this.e);
        boolean zIsEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (zIsEmpty) {
            a();
        }
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void b(p.b bVar) {
        boolean zIsEmpty = this.b.isEmpty();
        this.b.remove(bVar);
        if (zIsEmpty || !this.b.isEmpty()) {
            return;
        }
        b();
    }

    @Override // com.applovin.exoplayer2.h.p
    public final void c(p.b bVar) {
        this.f453a.remove(bVar);
        if (this.f453a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.b.clear();
            c();
            return;
        }
        b(bVar);
    }
}
