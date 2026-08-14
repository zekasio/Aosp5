package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface q {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.h.q$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(q _this, int i, p.a aVar, j jVar, m mVar) {
        }

        public static void $default$a(q _this, int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z) {
        }

        public static void $default$a(q _this, int i, p.a aVar, m mVar) {
        }

        public static void $default$b(q _this, int i, p.a aVar, j jVar, m mVar) {
        }

        public static void $default$c(q _this, int i, p.a aVar, j jVar, m mVar) {
        }
    }

    void a(int i, p.a aVar, j jVar, m mVar);

    void a(int i, p.a aVar, j jVar, m mVar, IOException iOException, boolean z);

    void a(int i, p.a aVar, m mVar);

    void b(int i, p.a aVar, j jVar, m mVar);

    void c(int i, p.a aVar, j jVar, m mVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f472a;
        public final p.a b;
        private final CopyOnWriteArrayList<C0032a> c;
        private final long d;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0032a> copyOnWriteArrayList, int i, p.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.f472a = i;
            this.b = aVar;
            this.d = j;
        }

        public a a(int i, p.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public void a(Handler handler, q qVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(qVar);
            this.c.add(new C0032a(handler, qVar));
        }

        public void a(q qVar) {
            for (C0032a c0032a : this.c) {
                if (c0032a.b == qVar) {
                    this.c.remove(c0032a);
                }
            }
        }

        public void a(j jVar, int i, int i2, com.applovin.exoplayer2.v vVar, int i3, Object obj, long j, long j2) {
            a(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void a(final j jVar, final m mVar) {
            for (C0032a c0032a : this.c) {
                final q qVar = c0032a.b;
                ai.a(c0032a.f473a, new Runnable() { // from class: com.applovin.exoplayer2.h.q$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(qVar, jVar, mVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(q qVar, j jVar, m mVar) {
            qVar.a(this.f472a, this.b, jVar, mVar);
        }

        public void b(j jVar, int i, int i2, com.applovin.exoplayer2.v vVar, int i3, Object obj, long j, long j2) {
            b(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void b(final j jVar, final m mVar) {
            for (C0032a c0032a : this.c) {
                final q qVar = c0032a.b;
                ai.a(c0032a.f473a, new Runnable() { // from class: com.applovin.exoplayer2.h.q$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(qVar, jVar, mVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(q qVar, j jVar, m mVar) {
            qVar.b(this.f472a, this.b, jVar, mVar);
        }

        public void c(j jVar, int i, int i2, com.applovin.exoplayer2.v vVar, int i3, Object obj, long j, long j2) {
            c(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)));
        }

        public void c(final j jVar, final m mVar) {
            for (C0032a c0032a : this.c) {
                final q qVar = c0032a.b;
                ai.a(c0032a.f473a, new Runnable() { // from class: com.applovin.exoplayer2.h.q$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(qVar, jVar, mVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar) {
            qVar.c(this.f472a, this.b, jVar, mVar);
        }

        public void a(j jVar, int i, int i2, com.applovin.exoplayer2.v vVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            a(jVar, new m(i, i2, vVar, i3, obj, a(j), a(j2)), iOException, z);
        }

        public void a(final j jVar, final m mVar, final IOException iOException, final boolean z) {
            for (C0032a c0032a : this.c) {
                final q qVar = c0032a.b;
                ai.a(c0032a.f473a, new Runnable() { // from class: com.applovin.exoplayer2.h.q$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(qVar, jVar, mVar, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, j jVar, m mVar, IOException iOException, boolean z) {
            qVar.a(this.f472a, this.b, jVar, mVar, iOException, z);
        }

        public void a(int i, com.applovin.exoplayer2.v vVar, int i2, Object obj, long j) {
            a(new m(1, i, vVar, i2, obj, a(j), -9223372036854775807L));
        }

        public void a(final m mVar) {
            for (C0032a c0032a : this.c) {
                final q qVar = c0032a.b;
                ai.a(c0032a.f473a, new Runnable() { // from class: com.applovin.exoplayer2.h.q$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(qVar, mVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(q qVar, m mVar) {
            qVar.a(this.f472a, this.b, mVar);
        }

        private long a(long j) {
            long jA = com.applovin.exoplayer2.h.a(j);
            if (jA == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jA;
        }

        /* JADX INFO: renamed from: com.applovin.exoplayer2.h.q$a$a, reason: collision with other inner class name */
        private static final class C0032a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f473a;
            public q b;

            public C0032a(Handler handler, q qVar) {
                this.f473a = handler;
                this.b = qVar;
            }
        }
    }
}
