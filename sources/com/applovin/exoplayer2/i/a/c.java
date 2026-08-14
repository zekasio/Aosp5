package com.applovin.exoplayer2.i.a;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.g;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
abstract class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f495a = new ArrayDeque<>();
    private final ArrayDeque<k> b;
    private final PriorityQueue<a> c;
    private a d;
    private long e;
    private long f;

    /* JADX WARN: Can't rename method to resolve collision */
    protected abstract void a(j jVar);

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
    }

    protected abstract boolean f();

    protected abstract f g();

    public c() {
        for (int i = 0; i < 10; i++) {
            this.f495a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new b(new i.a() { // from class: com.applovin.exoplayer2.i.a.c$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.c.i.a
                public final void releaseOutputBuffer(i iVar) {
                    this.f$0.a((k) iVar);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j) {
        this.e = j;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(this.d == null);
        if (this.f495a.isEmpty()) {
            return null;
        }
        a aVarPollFirst = this.f495a.pollFirst();
        this.d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.a(jVar == this.d);
        a aVar = (a) jVar;
        if (aVar.b()) {
            a(aVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            aVar.g = j;
            this.c.add(aVar);
        }
        this.d = null;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k b() throws h {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((a) ai.a(this.c.peek())).d <= this.e) {
            a aVar = (a) ai.a(this.c.poll());
            if (aVar.c()) {
                k kVar = (k) ai.a(this.b.pollFirst());
                kVar.b(4);
                a(aVar);
                return kVar;
            }
            a((j) aVar);
            if (f()) {
                f fVarG = g();
                k kVar2 = (k) ai.a(this.b.pollFirst());
                kVar2.a(aVar.d, fVarG, Long.MAX_VALUE);
                a(aVar);
                return kVar2;
            }
            a(aVar);
        }
        return null;
    }

    private void a(a aVar) {
        aVar.a();
        this.f495a.add(aVar);
    }

    protected void a(k kVar) {
        kVar.a();
        this.b.add(kVar);
    }

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a((a) ai.a(this.c.poll()));
        }
        a aVar = this.d;
        if (aVar != null) {
            a(aVar);
            this.d = null;
        }
    }

    protected final k j() {
        return this.b.pollFirst();
    }

    protected final long k() {
        return this.e;
    }

    private static final class a extends j implements Comparable<a> {
        private long g;

        private a() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (c() != aVar.c()) {
                return c() ? 1 : -1;
            }
            long j = this.d - aVar.d;
            if (j == 0) {
                j = this.g - aVar.g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends k {
        private i.a<b> c;

        public b(i.a<b> aVar) {
            this.c = aVar;
        }

        @Override // com.applovin.exoplayer2.c.i
        public final void f() {
            this.c.releaseOutputBuffer(this);
        }
    }
}
