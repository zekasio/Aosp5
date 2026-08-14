package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.common.a.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f508a = new b();
    private final j b = new j();
    private final Deque<k> c = new ArrayDeque();
    private int d;
    private boolean e;

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j) {
    }

    public c() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new e(new i.a() { // from class: com.applovin.exoplayer2.i.c$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.c.i.a
                public final void releaseOutputBuffer(com.applovin.exoplayer2.c.i iVar) {
                    this.f$0.a((k) iVar);
                }
            }));
        }
        this.d = 0;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.b(!this.e);
        com.applovin.exoplayer2.l.a.b(this.d == 1);
        com.applovin.exoplayer2.l.a.a(this.b == jVar);
        this.d = 2;
    }

    @Override // com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k b() throws h {
        com.applovin.exoplayer2.l.a.b(!this.e);
        if (this.d != 2 || this.c.isEmpty()) {
            return null;
        }
        k kVarRemoveFirst = this.c.removeFirst();
        if (this.b.c()) {
            kVarRemoveFirst.b(4);
        } else {
            kVarRemoveFirst.a(this.b.d, new a(this.b.d, this.f508a.a(((ByteBuffer) com.applovin.exoplayer2.l.a.b(this.b.b)).array())), 0L);
        }
        this.b.a();
        this.d = 0;
        return kVarRemoveFirst;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void c() {
        com.applovin.exoplayer2.l.a.b(!this.e);
        this.b.a();
        this.d = 0;
    }

    @Override // com.applovin.exoplayer2.c.d
    public void d() {
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        com.applovin.exoplayer2.l.a.b(this.c.size() < 2);
        com.applovin.exoplayer2.l.a.a(!this.c.contains(kVar));
        kVar.a();
        this.c.addFirst(kVar);
    }

    private static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f509a;
        private final s<com.applovin.exoplayer2.i.a> b;

        @Override // com.applovin.exoplayer2.i.f
        public int f_() {
            return 1;
        }

        public a(long j, s<com.applovin.exoplayer2.i.a> sVar) {
            this.f509a = j;
            this.b = sVar;
        }

        @Override // com.applovin.exoplayer2.i.f
        public int a(long j) {
            return this.f509a > j ? 0 : -1;
        }

        @Override // com.applovin.exoplayer2.i.f
        public long a(int i) {
            com.applovin.exoplayer2.l.a.a(i == 0);
            return this.f509a;
        }

        @Override // com.applovin.exoplayer2.i.f
        public List<com.applovin.exoplayer2.i.a> b(long j) {
            return j >= this.f509a ? this.b : s.g();
        }
    }
}
