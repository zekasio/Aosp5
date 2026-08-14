package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.applovin.exoplayer2.g {
    public static final g.a<i> N;
    public static final i o;

    @Deprecated
    public static final i p;
    public final boolean A;
    public final s<String> B;
    public final s<String> C;
    public final int D;
    public final int E;
    public final int F;
    public final s<String> G;
    public final s<String> H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final w<Integer> M;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f566a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private s<String> l;
        private s<String> m;
        private int n;
        private int o;
        private int p;
        private s<String> q;
        private s<String> r;
        private int s;
        private boolean t;
        private boolean u;
        private boolean v;
        private w<Integer> w;

        @Deprecated
        public a() {
            this.f566a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = s.g();
            this.m = s.g();
            this.n = 0;
            this.o = Integer.MAX_VALUE;
            this.p = Integer.MAX_VALUE;
            this.q = s.g();
            this.r = s.g();
            this.s = 0;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = w.g();
        }

        public a(Context context) {
            this();
            b(context);
            b(context, true);
        }

        protected a(Bundle bundle) {
            this.f566a = bundle.getInt(i.a(6), i.o.q);
            this.b = bundle.getInt(i.a(7), i.o.r);
            this.c = bundle.getInt(i.a(8), i.o.s);
            this.d = bundle.getInt(i.a(9), i.o.t);
            this.e = bundle.getInt(i.a(10), i.o.u);
            this.f = bundle.getInt(i.a(11), i.o.v);
            this.g = bundle.getInt(i.a(12), i.o.w);
            this.h = bundle.getInt(i.a(13), i.o.x);
            this.i = bundle.getInt(i.a(14), i.o.y);
            this.j = bundle.getInt(i.a(15), i.o.z);
            this.k = bundle.getBoolean(i.a(16), i.o.A);
            this.l = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(17)), new String[0]));
            this.m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(1)), new String[0]));
            this.n = bundle.getInt(i.a(2), i.o.D);
            this.o = bundle.getInt(i.a(18), i.o.E);
            this.p = bundle.getInt(i.a(19), i.o.F);
            this.q = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(20)), new String[0]));
            this.r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(3)), new String[0]));
            this.s = bundle.getInt(i.a(4), i.o.I);
            this.t = bundle.getBoolean(i.a(5), i.o.J);
            this.u = bundle.getBoolean(i.a(21), i.o.K);
            this.v = bundle.getBoolean(i.a(22), i.o.L);
            this.w = w.a((Collection) com.applovin.exoplayer2.common.b.c.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(i.a(23)), new int[0])));
        }

        public a b(Context context, boolean z) {
            Point pointD = ai.d(context);
            return b(pointD.x, pointD.y, z);
        }

        public a b(int i, int i2, boolean z) {
            this.i = i;
            this.j = i2;
            this.k = z;
            return this;
        }

        public a b(Context context) {
            if (ai.f611a >= 19) {
                a(context);
            }
            return this;
        }

        public i b() {
            return new i(this);
        }

        private void a(Context context) {
            CaptioningManager captioningManager;
            if ((ai.f611a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.r = s.a(ai.a(locale));
                }
            }
        }

        private static s<String> a(String[] strArr) {
            s.a aVarI = s.i();
            for (String str : (String[]) com.applovin.exoplayer2.l.a.b(strArr)) {
                aVarI.a(ai.b((String) com.applovin.exoplayer2.l.a.b(str)));
            }
            return aVarI.a();
        }
    }

    static {
        i iVarB = new a().b();
        o = iVarB;
        p = iVarB;
        N = new g.a() { // from class: com.applovin.exoplayer2.j.i$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
                return i.a(bundle);
            }
        };
    }

    protected i(a aVar) {
        this.q = aVar.f566a;
        this.r = aVar.b;
        this.s = aVar.c;
        this.t = aVar.d;
        this.u = aVar.e;
        this.v = aVar.f;
        this.w = aVar.g;
        this.x = aVar.h;
        this.y = aVar.i;
        this.z = aVar.j;
        this.A = aVar.k;
        this.B = aVar.l;
        this.C = aVar.m;
        this.D = aVar.n;
        this.E = aVar.o;
        this.F = aVar.p;
        this.G = aVar.q;
        this.H = aVar.r;
        this.I = aVar.s;
        this.J = aVar.t;
        this.K = aVar.u;
        this.L = aVar.v;
        this.M = aVar.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.q == iVar.q && this.r == iVar.r && this.s == iVar.s && this.t == iVar.t && this.u == iVar.u && this.v == iVar.v && this.w == iVar.w && this.x == iVar.x && this.A == iVar.A && this.y == iVar.y && this.z == iVar.z && this.B.equals(iVar.B) && this.C.equals(iVar.C) && this.D == iVar.D && this.E == iVar.E && this.F == iVar.F && this.G.equals(iVar.G) && this.H.equals(iVar.H) && this.I == iVar.I && this.J == iVar.J && this.K == iVar.K && this.L == iVar.L && this.M.equals(iVar.M);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.q + 31) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + (this.A ? 1 : 0)) * 31) + this.y) * 31) + this.z) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + this.M.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i a(Bundle bundle) {
        return new a(bundle).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(int i) {
        return Integer.toString(i, 36);
    }
}
