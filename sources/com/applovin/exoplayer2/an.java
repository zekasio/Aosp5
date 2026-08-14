package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface an {

    @Deprecated
    public interface b {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.an$b$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(b _this, ab abVar, int i) {
            }

            public static void $default$a(b _this, ac acVar) {
            }

            public static void $default$a(b _this, ak akVar) {
            }

            public static void $default$a(b _this, am amVar) {
            }

            public static void $default$a(b _this, a aVar) {
            }

            public static void $default$a(b _this, e eVar, e eVar2, int i) {
            }

            public static void $default$a(b _this, an anVar, c cVar) {
            }

            public static void $default$a(b _this, ba baVar, int i) {
            }

            public static void $default$a(b _this, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
            }

            @Deprecated
            public static void $default$a(b _this, boolean z, int i) {
            }

            @Deprecated
            public static void $default$b(b _this) {
            }

            public static void $default$b(b _this, int i) {
            }

            public static void $default$b(b _this, ak akVar) {
            }

            public static void $default$b(b _this, boolean z, int i) {
            }

            public static void $default$b_(b _this, boolean z) {
            }

            public static void $default$c(b _this, int i) {
            }

            @Deprecated
            public static void $default$c(b _this, boolean z) {
            }

            public static void $default$d(b _this, int i) {
            }

            public static void $default$d(b _this, boolean z) {
            }

            @Deprecated
            public static void $default$e(b _this, int i) {
            }

            public static void $default$e(b _this, boolean z) {
            }
        }

        void a(ab abVar, int i);

        void a(ac acVar);

        void a(ak akVar);

        void a(am amVar);

        void a(a aVar);

        void a(e eVar, e eVar2, int i);

        void a(an anVar, c cVar);

        void a(ba baVar, int i);

        void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar);

        @Deprecated
        void a(boolean z, int i);

        @Deprecated
        void b();

        void b(int i);

        void b(ak akVar);

        void b(boolean z, int i);

        void b_(boolean z);

        void c(int i);

        @Deprecated
        void c(boolean z);

        void d(int i);

        void d(boolean z);

        @Deprecated
        void e(int i);

        void e(boolean z);
    }

    public interface d extends b {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.an$d$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(d _this) {
            }

            public static void $default$a(d _this, float f) {
            }

            public static void $default$a(d _this, int i, int i2) {
            }

            public static void $default$a(d _this, int i, boolean z) {
            }

            public static void $default$a(d _this, ab abVar, int i) {
            }

            public static void $default$a(d _this, ac acVar) {
            }

            public static void $default$a(d _this, ak akVar) {
            }

            public static void $default$a(d _this, am amVar) {
            }

            public static void $default$a(d _this, a aVar) {
            }

            public static void $default$a(d _this, e eVar, e eVar2, int i) {
            }

            public static void $default$a(d _this, an anVar, c cVar) {
            }

            public static void $default$a(d _this, ba baVar, int i) {
            }

            public static void $default$a(d _this, com.applovin.exoplayer2.g.a aVar) {
            }

            public static void $default$a(d _this, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
            }

            public static void $default$a(d _this, com.applovin.exoplayer2.m.o oVar) {
            }

            public static void $default$a(d _this, o oVar) {
            }

            public static void $default$a(d _this, List list) {
            }

            public static void $default$a_(d _this, boolean z) {
            }

            public static void $default$b(d _this, int i) {
            }

            public static void $default$b(d _this, ak akVar) {
            }

            public static void $default$b(d _this, boolean z, int i) {
            }

            public static void $default$b_(d _this, boolean z) {
            }

            public static void $default$c(d _this, int i) {
            }

            public static void $default$d(d _this, int i) {
            }

            public static void $default$d(d _this, boolean z) {
            }

            public static void $default$e(d _this, boolean z) {
            }
        }

        void a();

        void a(float f);

        void a(int i, int i2);

        void a(int i, boolean z);

        @Override // com.applovin.exoplayer2.an.b
        void a(ab abVar, int i);

        @Override // com.applovin.exoplayer2.an.b
        void a(ac acVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(ak akVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(am amVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(a aVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(e eVar, e eVar2, int i);

        @Override // com.applovin.exoplayer2.an.b
        void a(an anVar, c cVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(ba baVar, int i);

        void a(com.applovin.exoplayer2.g.a aVar);

        @Override // com.applovin.exoplayer2.an.b
        void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar);

        void a(com.applovin.exoplayer2.m.o oVar);

        void a(o oVar);

        void a(List<com.applovin.exoplayer2.i.a> list);

        void a_(boolean z);

        @Override // com.applovin.exoplayer2.an.b
        void b(int i);

        @Override // com.applovin.exoplayer2.an.b
        void b(ak akVar);

        @Override // com.applovin.exoplayer2.an.b
        void b(boolean z, int i);

        @Override // com.applovin.exoplayer2.an.b
        void b_(boolean z);

        @Override // com.applovin.exoplayer2.an.b
        void c(int i);

        @Override // com.applovin.exoplayer2.an.b
        void d(int i);

        @Override // com.applovin.exoplayer2.an.b
        void d(boolean z);

        @Override // com.applovin.exoplayer2.an.b
        void e(boolean z);
    }

    long A();

    long B();

    long C();

    am D();

    int F();

    int G();

    long H();

    long I();

    long J();

    boolean K();

    int L();

    int M();

    long N();

    long O();

    com.applovin.exoplayer2.h.ad P();

    com.applovin.exoplayer2.j.h Q();

    ac R();

    ba S();

    com.applovin.exoplayer2.m.o T();

    List<com.applovin.exoplayer2.i.a> V();

    void a(int i, long j);

    void a(long j);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(d dVar);

    void a(boolean z);

    boolean a();

    boolean a(int i);

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(d dVar);

    void b(boolean z);

    void c();

    void c(int i);

    void d();

    ak e();

    void g();

    void j();

    boolean o();

    Looper r();

    a s();

    int t();

    int u();

    void w();

    boolean x();

    int y();

    boolean z();

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.m f41a;

        public c(com.applovin.exoplayer2.l.m mVar) {
            this.f41a = mVar;
        }

        public boolean a(int i) {
            return this.f41a.a(i);
        }

        public boolean a(int... iArr) {
            return this.f41a.a(iArr);
        }

        public int hashCode() {
            return this.f41a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f41a.equals(((c) obj).f41a);
            }
            return false;
        }
    }

    public static final class e implements g {
        public static final g.a<e> j = new g.a() { // from class: com.applovin.exoplayer2.an$e$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return an.e.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f42a;
        public final int b;
        public final ab c;
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        public e(Object obj, int i, ab abVar, Object obj2, int i2, long j2, long j3, int i3, int i4) {
            this.f42a = obj;
            this.b = i;
            this.c = abVar;
            this.d = obj2;
            this.e = i2;
            this.f = j2;
            this.g = j3;
            this.h = i3;
            this.i = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && Objects.equal(this.f42a, eVar.f42a) && Objects.equal(this.d, eVar.d) && Objects.equal(this.c, eVar.c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f42a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.b), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(null, bundle.getInt(a(0), -1), (ab) com.applovin.exoplayer2.l.c.a(ab.g, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39a = new C0009a().a();
        public static final g.a<a> b = new g.a() { // from class: com.applovin.exoplayer2.an$a$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return an.a.a(bundle);
            }
        };
        private final com.applovin.exoplayer2.l.m c;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.an$a$a, reason: collision with other inner class name */
        public static final class C0009a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final int[] f40a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
            private final m.a b = new m.a();

            public C0009a a(int i) {
                this.b.a(i);
                return this;
            }

            public C0009a a(int i, boolean z) {
                this.b.a(i, z);
                return this;
            }

            public C0009a a(int... iArr) {
                this.b.a(iArr);
                return this;
            }

            public C0009a a(a aVar) {
                this.b.a(aVar.c);
                return this;
            }

            public a a() {
                return new a(this.b.a());
            }
        }

        private a(com.applovin.exoplayer2.l.m mVar) {
            this.c = mVar;
        }

        public boolean a(int i) {
            return this.c.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.c.equals(((a) obj).c);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f39a;
            }
            C0009a c0009a = new C0009a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                c0009a.a(integerArrayList.get(i).intValue());
            }
            return c0009a.a();
        }

        private static String b(int i) {
            return Integer.toString(i, 36);
        }
    }
}
