package com.applovin.exoplayer2.d;

import android.os.Handler;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.g$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(g _this, int i, p.a aVar) {
        }

        public static void $default$a(g _this, int i, p.a aVar, int i2) {
        }

        public static void $default$a(g _this, int i, p.a aVar, Exception exc) {
        }

        public static void $default$b(g _this, int i, p.a aVar) {
        }

        public static void $default$c(g _this, int i, p.a aVar) {
        }

        public static void $default$d(g _this, int i, p.a aVar) {
        }

        @Deprecated
        public static void $default$e(g _this, int i, p.a aVar) {
        }
    }

    void a(int i, p.a aVar);

    void a(int i, p.a aVar, int i2);

    void a(int i, p.a aVar, Exception exc);

    void b(int i, p.a aVar);

    void c(int i, p.a aVar);

    void d(int i, p.a aVar);

    @Deprecated
    void e(int i, p.a aVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f251a;
        public final p.a b;
        private final CopyOnWriteArrayList<C0020a> c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0020a> copyOnWriteArrayList, int i, p.a aVar) {
            this.c = copyOnWriteArrayList;
            this.f251a = i;
            this.b = aVar;
        }

        public a a(int i, p.a aVar) {
            return new a(this.c, i, aVar);
        }

        public void a(Handler handler, g gVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(gVar);
            this.c.add(new C0020a(handler, gVar));
        }

        public void a(g gVar) {
            for (C0020a c0020a : this.c) {
                if (c0020a.b == gVar) {
                    this.c.remove(c0020a);
                }
            }
        }

        public void a(final int i) {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(gVar, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, int i) {
            gVar.e(this.f251a, this.b);
            gVar.a(this.f251a, this.b, i);
        }

        public void a() {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.e(gVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(g gVar) {
            gVar.a(this.f251a, this.b);
        }

        public void a(final Exception exc) {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(gVar, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, Exception exc) {
            gVar.a(this.f251a, this.b, exc);
        }

        public void b() {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(gVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(g gVar) {
            gVar.b(this.f251a, this.b);
        }

        public void c() {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(gVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(g gVar) {
            gVar.c(this.f251a, this.b);
        }

        public void d() {
            for (C0020a c0020a : this.c) {
                final g gVar = c0020a.b;
                ai.a(c0020a.f252a, new Runnable() { // from class: com.applovin.exoplayer2.d.g$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(gVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(g gVar) {
            gVar.d(this.f251a, this.b);
        }

        /* JADX INFO: renamed from: com.applovin.exoplayer2.d.g$a$a, reason: collision with other inner class name */
        private static final class C0020a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f252a;
            public g b;

            public C0020a(Handler handler, g gVar) {
                this.f252a = handler;
                this.b = gVar;
            }
        }
    }
}
