package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface d extends g {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.j.d$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(d _this, boolean z) {
        }

        public static void $default$g(d _this) {
        }

        public static void $default$h(d _this) {
        }
    }

    public interface b {
        d[] a(a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar);
    }

    void a();

    void a(float f);

    void a(boolean z);

    void b();

    int c();

    v f();

    void g();

    void h();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ac f562a;
        public final int[] b;
        public final int c;

        public a(ac acVar, int... iArr) {
            this(acVar, iArr, 0);
        }

        public a(ac acVar, int[] iArr, int i) {
            this.f562a = acVar;
            this.b = iArr;
            this.c = i;
        }
    }
}
