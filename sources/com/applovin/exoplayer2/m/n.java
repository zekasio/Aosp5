package com.applovin.exoplayer2.m;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.m.n$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(n _this, int i, long j) {
        }

        public static void $default$a(n _this, long j, int i) {
        }

        public static void $default$a(n _this, com.applovin.exoplayer2.c.e eVar) {
        }

        public static void $default$a(n _this, o oVar) {
        }

        public static void $default$a(n _this, v vVar, com.applovin.exoplayer2.c.h hVar) {
        }

        public static void $default$a(n _this, Exception exc) {
        }

        public static void $default$a(n _this, Object obj, long j) {
        }

        public static void $default$a(n _this, String str) {
        }

        public static void $default$a(n _this, String str, long j, long j2) {
        }

        @Deprecated
        public static void $default$a_(n _this, v vVar) {
        }

        public static void $default$b(n _this, com.applovin.exoplayer2.c.e eVar) {
        }
    }

    void a(int i, long j);

    void a(long j, int i);

    void a(com.applovin.exoplayer2.c.e eVar);

    void a(o oVar);

    void a(v vVar, com.applovin.exoplayer2.c.h hVar);

    void a(Exception exc);

    void a(Object obj, long j);

    void a(String str);

    void a(String str, long j, long j2);

    @Deprecated
    void a_(v vVar);

    void b(com.applovin.exoplayer2.c.e eVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f665a;
        private final n b;

        public a(Handler handler, n nVar) {
            this.f665a = nVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.b = nVar;
        }

        public void a(final com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(eVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((n) ai.a(this.b)).a(eVar);
        }

        public void a(final String str, final long j, final long j2) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((n) ai.a(this.b)).a(str, j, j2);
        }

        public void a(final v vVar, final com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(vVar, hVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((n) ai.a(this.b)).a_(vVar);
            ((n) ai.a(this.b)).a(vVar, hVar);
        }

        public void a(final int i, final long j) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(i, j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            ((n) ai.a(this.b)).a(i, j);
        }

        public void a(final long j, final int i) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(j, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j, int i) {
            ((n) ai.a(this.b)).a(j, i);
        }

        public void a(final o oVar) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(oVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(o oVar) {
            ((n) ai.a(this.b)).a(oVar);
        }

        public void a(final Object obj) {
            if (this.f665a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f665a.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j) {
            ((n) ai.a(this.b)).a(obj, j);
        }

        public void a(final String str) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((n) ai.a(this.b)).a(str);
        }

        public void b(final com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(eVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            ((n) ai.a(this.b)).b(eVar);
        }

        public void a(final Exception exc) {
            Handler handler = this.f665a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.m.n$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Exception exc) {
            ((n) ai.a(this.b)).a(exc);
        }
    }
}
