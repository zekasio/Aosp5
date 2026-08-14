package com.applovin.exoplayer2.k;

import android.os.Handler;
import com.applovin.exoplayer2.k.d;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    aa a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    public interface a {
        void b(int i, long j, long j2);

        /* JADX INFO: renamed from: com.applovin.exoplayer2.k.d$a$a, reason: collision with other inner class name */
        public static final class C0042a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0043a> f574a = new CopyOnWriteArrayList<>();

            public void a(Handler handler, a aVar) {
                com.applovin.exoplayer2.l.a.b(handler);
                com.applovin.exoplayer2.l.a.b(aVar);
                a(aVar);
                this.f574a.add(new C0043a(handler, aVar));
            }

            public void a(a aVar) {
                for (C0043a c0043a : this.f574a) {
                    if (c0043a.b == aVar) {
                        c0043a.a();
                        this.f574a.remove(c0043a);
                    }
                }
            }

            public void a(final int i, final long j, final long j2) {
                for (final C0043a c0043a : this.f574a) {
                    if (!c0043a.c) {
                        c0043a.f575a.post(new Runnable() { // from class: com.applovin.exoplayer2.k.d$a$a$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0042a.a(c0043a, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0043a c0043a, int i, long j, long j2) {
                c0043a.b.b(i, j, j2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: com.applovin.exoplayer2.k.d$a$a$a, reason: collision with other inner class name */
            static final class C0043a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f575a;
                private final a b;
                private boolean c;

                public C0043a(Handler handler, a aVar) {
                    this.f575a = handler;
                    this.b = aVar;
                }

                public void a() {
                    this.c = true;
                }
            }
        }
    }
}
