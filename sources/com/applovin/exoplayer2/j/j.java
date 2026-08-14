package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f567a;
    private com.applovin.exoplayer2.k.d b;

    public interface a {
    }

    public abstract k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p;

    public abstract void a(Object obj);

    public boolean a() {
        return false;
    }

    public final void a(a aVar, com.applovin.exoplayer2.k.d dVar) {
        this.f567a = aVar;
        this.b = dVar;
    }

    protected final com.applovin.exoplayer2.k.d d() {
        return (com.applovin.exoplayer2.k.d) com.applovin.exoplayer2.l.a.b(this.b);
    }
}
