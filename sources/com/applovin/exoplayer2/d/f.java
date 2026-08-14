package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.d.g;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void a(g.a aVar);

    boolean a(String str);

    void b(g.a aVar);

    int c();

    boolean d();

    a e();

    UUID f();

    com.applovin.exoplayer2.c.b g();

    Map<String, String> h();

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.f$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$d(f _this) {
            return false;
        }

        public static void a(f fVar, f fVar2) {
            if (fVar == fVar2) {
                return;
            }
            if (fVar2 != null) {
                fVar2.a((g.a) null);
            }
            if (fVar != null) {
                fVar.b(null);
            }
        }
    }

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f250a;

        public a(Throwable th, int i) {
            super(th);
            this.f250a = i;
        }
    }
}
