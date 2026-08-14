package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ab f17a = new b().a();
    public static final g.a<ab> g = new g.a() { // from class: com.applovin.exoplayer2.ab$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return ab.a(bundle);
        }
    };
    public final String b;
    public final f c;
    public final e d;
    public final ac e;
    public final c f;

    public static ab a(Uri uri) {
        return new b().a(uri).a();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19a;
        private Uri b;
        private String c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private d.a i;
        private List<Object> j;
        private String k;
        private List<Object> l;
        private a m;
        private Object n;
        private ac o;
        private e.a p;

        public b() {
            this.e = Long.MIN_VALUE;
            this.i = new d.a();
            this.j = Collections.emptyList();
            this.l = Collections.emptyList();
            this.p = new e.a();
        }

        private b(ab abVar) {
            d.a aVar;
            this();
            this.e = abVar.f.b;
            this.f = abVar.f.c;
            this.g = abVar.f.d;
            this.d = abVar.f.f20a;
            this.h = abVar.f.e;
            this.f19a = abVar.b;
            this.o = abVar.e;
            this.p = abVar.d.a();
            f fVar = abVar.c;
            if (fVar != null) {
                this.k = fVar.f;
                this.c = fVar.b;
                this.b = fVar.f25a;
                this.j = fVar.e;
                this.l = fVar.g;
                this.n = fVar.h;
                if (fVar.c != null) {
                    aVar = fVar.c.b();
                } else {
                    aVar = new d.a();
                }
                this.i = aVar;
                this.m = fVar.d;
            }
        }

        public b a(String str) {
            this.f19a = (String) com.applovin.exoplayer2.l.a.b(str);
            return this;
        }

        public b a(Uri uri) {
            this.b = uri;
            return this;
        }

        public b b(String str) {
            this.k = str;
            return this;
        }

        public b a(Object obj) {
            this.n = obj;
            return this;
        }

        public ab a() {
            f fVar;
            com.applovin.exoplayer2.l.a.b(this.i.b == null || this.i.f22a != null);
            Uri uri = this.b;
            if (uri != null) {
                fVar = new f(uri, this.c, this.i.f22a != null ? this.i.a() : null, this.m, this.j, this.k, this.l, this.n);
            } else {
                fVar = null;
            }
            String str = this.f19a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            c cVar = new c(this.d, this.e, this.f, this.g, this.h);
            e eVarA = this.p.a();
            ac acVar = this.o;
            if (acVar == null) {
                acVar = ac.f26a;
            }
            return new ab(str2, cVar, fVar, eVarA, acVar);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f21a;
        public final Uri b;
        public final com.applovin.exoplayer2.common.a.u<String, String> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final com.applovin.exoplayer2.common.a.s<Integer> g;
        private final byte[] h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f22a;
            private Uri b;
            private com.applovin.exoplayer2.common.a.u<String, String> c;
            private boolean d;
            private boolean e;
            private boolean f;
            private com.applovin.exoplayer2.common.a.s<Integer> g;
            private byte[] h;

            @Deprecated
            private a() {
                this.c = com.applovin.exoplayer2.common.a.u.a();
                this.g = com.applovin.exoplayer2.common.a.s.g();
            }

            private a(d dVar) {
                this.f22a = dVar.f21a;
                this.b = dVar.b;
                this.c = dVar.c;
                this.d = dVar.d;
                this.e = dVar.e;
                this.f = dVar.f;
                this.g = dVar.g;
                this.h = dVar.h;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            com.applovin.exoplayer2.l.a.b((aVar.f && aVar.b == null) ? false : true);
            this.f21a = (UUID) com.applovin.exoplayer2.l.a.b(aVar.f22a);
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.f = aVar.f;
            this.e = aVar.e;
            this.g = aVar.g;
            this.h = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21a.equals(dVar.f21a) && com.applovin.exoplayer2.l.ai.a(this.b, dVar.b) && com.applovin.exoplayer2.l.ai.a(this.c, dVar.c) && this.d == dVar.d && this.f == dVar.f && this.e == dVar.e && this.g.equals(dVar.g) && Arrays.equals(this.h, dVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f21a.hashCode() * 31;
            Uri uri = this.b;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18a;
        public final Object b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18a.equals(aVar.f18a) && com.applovin.exoplayer2.l.ai.a(this.b, aVar.b);
        }

        public int hashCode() {
            int iHashCode = this.f18a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f25a;
        public final String b;
        public final d c;
        public final a d;
        public final List<Object> e;
        public final String f;
        public final List<Object> g;
        public final Object h;

        private f(Uri uri, String str, d dVar, a aVar, List<Object> list, String str2, List<Object> list2, Object obj) {
            this.f25a = uri;
            this.b = str;
            this.c = dVar;
            this.d = aVar;
            this.e = list;
            this.f = str2;
            this.g = list2;
            this.h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f25a.equals(fVar.f25a) && com.applovin.exoplayer2.l.ai.a((Object) this.b, (Object) fVar.b) && com.applovin.exoplayer2.l.ai.a(this.c, fVar.c) && com.applovin.exoplayer2.l.ai.a(this.d, fVar.d) && this.e.equals(fVar.e) && com.applovin.exoplayer2.l.ai.a((Object) this.f, (Object) fVar.f) && this.g.equals(fVar.g) && com.applovin.exoplayer2.l.ai.a(this.h, fVar.h);
        }

        public int hashCode() {
            int iHashCode = this.f25a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.c;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            a aVar = this.d;
            int iHashCode4 = (((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.e.hashCode()) * 31;
            String str2 = this.f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.g.hashCode()) * 31;
            Object obj = this.h;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f23a = new a().a();
        public static final g.a<e> g = new g.a() { // from class: com.applovin.exoplayer2.ab$e$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return ab.e.a(bundle);
            }
        };
        public final long b;
        public final long c;
        public final long d;
        public final float e;
        public final float f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f24a;
            private long b;
            private long c;
            private float d;
            private float e;

            public a() {
                this.f24a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(e eVar) {
                this.f24a = eVar.b;
                this.b = eVar.c;
                this.c = eVar.d;
                this.d = eVar.e;
                this.e = eVar.f;
            }

            public e a() {
                return new e(this);
            }
        }

        private e(a aVar) {
            this(aVar.f24a, aVar.b, aVar.c, aVar.d, aVar.e);
        }

        @Deprecated
        public e(long j, long j2, long j3, float f, float f2) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = f;
            this.f = f2;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f;
        }

        public int hashCode() {
            long j = this.b;
            long j2 = this.c;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.d;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.e;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            return new e(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    public static final class c implements g {
        public static final g.a<c> f = new g.a() { // from class: com.applovin.exoplayer2.ab$c$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return ab.c.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        private c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f20a = j;
            this.b = j2;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20a == cVar.f20a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public int hashCode() {
            long j = this.f20a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c a(Bundle bundle) {
            return new c(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    private ab(String str, c cVar, f fVar, e eVar, ac acVar) {
        this.b = str;
        this.c = fVar;
        this.d = eVar;
        this.e = acVar;
        this.f = cVar;
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return com.applovin.exoplayer2.l.ai.a((Object) this.b, (Object) abVar.b) && this.f.equals(abVar.f) && com.applovin.exoplayer2.l.ai.a(this.c, abVar.c) && com.applovin.exoplayer2.l.ai.a(this.d, abVar.d) && com.applovin.exoplayer2.l.ai.a(this.e, abVar.e);
    }

    public int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        f fVar = this.c;
        return ((((((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ab a(Bundle bundle) {
        e eVar;
        ac acVar;
        c cVar;
        String str = (String) com.applovin.exoplayer2.l.a.b(bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            eVar = e.f23a;
        } else {
            eVar = (e) e.g.fromBundle(bundle2);
        }
        e eVar2 = eVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            acVar = ac.f26a;
        } else {
            acVar = (ac) ac.H.fromBundle(bundle3);
        }
        ac acVar2 = acVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            cVar = new c(0L, Long.MIN_VALUE, false, false, false);
        } else {
            cVar = (c) c.f.fromBundle(bundle4);
        }
        return new ab(str, cVar, null, eVar2, acVar2);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
