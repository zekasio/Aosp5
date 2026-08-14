package com.applovin.exoplayer2.b;

import android.os.Handler;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.b.g$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(g _this, int i, long j, long j2) {
        }

        public static void $default$a(g _this, long j) {
        }

        @Deprecated
        public static void $default$a(g _this, com.applovin.exoplayer2.v vVar) {
        }

        public static void $default$a_(g _this, boolean z) {
        }

        public static void $default$b(g _this, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
        }

        public static void $default$b(g _this, Exception exc) {
        }

        public static void $default$b(g _this, String str) {
        }

        public static void $default$b(g _this, String str, long j, long j2) {
        }

        public static void $default$c(g _this, com.applovin.exoplayer2.c.e eVar) {
        }

        public static void $default$c(g _this, Exception exc) {
        }

        public static void $default$d(g _this, com.applovin.exoplayer2.c.e eVar) {
        }
    }

    void a(int i, long j, long j2);

    void a(long j);

    @Deprecated
    void a(com.applovin.exoplayer2.v vVar);

    void a_(boolean z);

    void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar);

    void b(Exception exc);

    void b(String str);

    void b(String str, long j, long j2);

    void c(com.applovin.exoplayer2.c.e eVar);

    void c(Exception exc);

    void d(com.applovin.exoplayer2.c.e eVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f66a;
        private final g b;

        public a(Handler handler, g gVar) {
            this.f66a = gVar != null ? (Handler) com.applovin.exoplayer2.l.a.b(handler) : null;
            this.b = gVar;
        }

        public void a(final com.applovin.exoplayer2.c.e eVar) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(eVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.applovin.exoplayer2.c.e eVar) {
            ((g) ai.a(this.b)).c(eVar);
        }

        public void a(final String str, final long j, final long j2) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((g) ai.a(this.b)).b(str, j, j2);
        }

        public void a(final com.applovin.exoplayer2.v vVar, final com.applovin.exoplayer2.c.h hVar) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(vVar, hVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
            ((g) ai.a(this.b)).a(vVar);
            ((g) ai.a(this.b)).b(vVar, hVar);
        }

        public void a(final long j) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j) {
            ((g) ai.a(this.b)).a(j);
        }

        public void a(final int i, final long j, final long j2) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j, long j2) {
            ((g) ai.a(this.b)).a(i, j, j2);
        }

        public void a(final String str) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((g) ai.a(this.b)).b(str);
        }

        public void b(final com.applovin.exoplayer2.c.e eVar) {
            eVar.a();
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda9
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
            ((g) ai.a(this.b)).d(eVar);
        }

        public void a(final boolean z) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            ((g) ai.a(this.b)).a_(z);
        }

        public void a(final Exception exc) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Exception exc) {
            ((g) ai.a(this.b)).b(exc);
        }

        public void b(final Exception exc) {
            Handler handler = this.f66a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.exoplayer2.b.g$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Exception exc) {
            ((g) ai.a(this.b)).c(exc);
        }
    }
}
