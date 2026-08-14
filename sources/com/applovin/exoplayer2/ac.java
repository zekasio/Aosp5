package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements g {
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final Uri i;
    public final aq j;
    public final aq k;
    public final byte[] l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;

    @Deprecated
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ac f26a = new a().a();
    public static final g.a<ac> H = new g.a() { // from class: com.applovin.exoplayer2.ac$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return ac.a(bundle);
        }
    };

    public static final class a {
        private Integer A;
        private Integer B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f27a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private Uri h;
        private aq i;
        private aq j;
        private byte[] k;
        private Integer l;
        private Uri m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Boolean q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private Integer w;
        private CharSequence x;
        private CharSequence y;
        private CharSequence z;

        public a() {
        }

        private a(ac acVar) {
            this.f27a = acVar.b;
            this.b = acVar.c;
            this.c = acVar.d;
            this.d = acVar.e;
            this.e = acVar.f;
            this.f = acVar.g;
            this.g = acVar.h;
            this.h = acVar.i;
            this.i = acVar.j;
            this.j = acVar.k;
            this.k = acVar.l;
            this.l = acVar.m;
            this.m = acVar.n;
            this.n = acVar.o;
            this.o = acVar.p;
            this.p = acVar.q;
            this.q = acVar.r;
            this.r = acVar.t;
            this.s = acVar.u;
            this.t = acVar.v;
            this.u = acVar.w;
            this.v = acVar.x;
            this.w = acVar.y;
            this.x = acVar.z;
            this.y = acVar.A;
            this.z = acVar.B;
            this.A = acVar.C;
            this.B = acVar.D;
            this.C = acVar.E;
            this.D = acVar.F;
            this.E = acVar.G;
        }

        public a a(CharSequence charSequence) {
            this.f27a = charSequence;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public a c(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public a d(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public a a(Uri uri) {
            this.h = uri;
            return this;
        }

        public a a(aq aqVar) {
            this.i = aqVar;
            return this;
        }

        public a b(aq aqVar) {
            this.j = aqVar;
            return this;
        }

        public a a(byte[] bArr, Integer num) {
            this.k = bArr == null ? null : (byte[]) bArr.clone();
            this.l = num;
            return this;
        }

        public a a(byte[] bArr, int i) {
            if (this.k == null || com.applovin.exoplayer2.l.ai.a((Object) Integer.valueOf(i), (Object) 3) || !com.applovin.exoplayer2.l.ai.a((Object) this.l, (Object) 3)) {
                this.k = (byte[]) bArr.clone();
                this.l = Integer.valueOf(i);
            }
            return this;
        }

        public a b(Uri uri) {
            this.m = uri;
            return this;
        }

        public a a(Integer num) {
            this.n = num;
            return this;
        }

        public a b(Integer num) {
            this.o = num;
            return this;
        }

        public a c(Integer num) {
            this.p = num;
            return this;
        }

        public a a(Boolean bool) {
            this.q = bool;
            return this;
        }

        public a d(Integer num) {
            this.r = num;
            return this;
        }

        public a e(Integer num) {
            this.s = num;
            return this;
        }

        public a f(Integer num) {
            this.t = num;
            return this;
        }

        public a g(Integer num) {
            this.u = num;
            return this;
        }

        public a h(Integer num) {
            this.v = num;
            return this;
        }

        public a i(Integer num) {
            this.w = num;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public a i(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public a j(CharSequence charSequence) {
            this.z = charSequence;
            return this;
        }

        public a j(Integer num) {
            this.A = num;
            return this;
        }

        public a k(Integer num) {
            this.B = num;
            return this;
        }

        public a k(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public a l(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public a a(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public a a(com.applovin.exoplayer2.g.a aVar) {
            for (int i = 0; i < aVar.a(); i++) {
                aVar.a(i).a(this);
            }
            return this;
        }

        public a a(List<com.applovin.exoplayer2.g.a> list) {
            for (int i = 0; i < list.size(); i++) {
                com.applovin.exoplayer2.g.a aVar = list.get(i);
                for (int i2 = 0; i2 < aVar.a(); i2++) {
                    aVar.a(i2).a(this);
                }
            }
            return this;
        }

        public ac a() {
            return new ac(this);
        }
    }

    private ac(a aVar) {
        this.b = aVar.f27a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        this.E = aVar.C;
        this.F = aVar.D;
        this.G = aVar.E;
    }

    public a a() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        return com.applovin.exoplayer2.l.ai.a(this.b, acVar.b) && com.applovin.exoplayer2.l.ai.a(this.c, acVar.c) && com.applovin.exoplayer2.l.ai.a(this.d, acVar.d) && com.applovin.exoplayer2.l.ai.a(this.e, acVar.e) && com.applovin.exoplayer2.l.ai.a(this.f, acVar.f) && com.applovin.exoplayer2.l.ai.a(this.g, acVar.g) && com.applovin.exoplayer2.l.ai.a(this.h, acVar.h) && com.applovin.exoplayer2.l.ai.a(this.i, acVar.i) && com.applovin.exoplayer2.l.ai.a(this.j, acVar.j) && com.applovin.exoplayer2.l.ai.a(this.k, acVar.k) && Arrays.equals(this.l, acVar.l) && com.applovin.exoplayer2.l.ai.a(this.m, acVar.m) && com.applovin.exoplayer2.l.ai.a(this.n, acVar.n) && com.applovin.exoplayer2.l.ai.a(this.o, acVar.o) && com.applovin.exoplayer2.l.ai.a(this.p, acVar.p) && com.applovin.exoplayer2.l.ai.a(this.q, acVar.q) && com.applovin.exoplayer2.l.ai.a(this.r, acVar.r) && com.applovin.exoplayer2.l.ai.a(this.t, acVar.t) && com.applovin.exoplayer2.l.ai.a(this.u, acVar.u) && com.applovin.exoplayer2.l.ai.a(this.v, acVar.v) && com.applovin.exoplayer2.l.ai.a(this.w, acVar.w) && com.applovin.exoplayer2.l.ai.a(this.x, acVar.x) && com.applovin.exoplayer2.l.ai.a(this.y, acVar.y) && com.applovin.exoplayer2.l.ai.a(this.z, acVar.z) && com.applovin.exoplayer2.l.ai.a(this.A, acVar.A) && com.applovin.exoplayer2.l.ai.a(this.B, acVar.B) && com.applovin.exoplayer2.l.ai.a(this.C, acVar.C) && com.applovin.exoplayer2.l.ai.a(this.D, acVar.D) && com.applovin.exoplayer2.l.ai.a(this.E, acVar.E) && com.applovin.exoplayer2.l.ai.a(this.F, acVar.F);
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ac a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        a aVar = new a();
        aVar.a(bundle.getCharSequence(a(0))).b(bundle.getCharSequence(a(1))).c(bundle.getCharSequence(a(2))).d(bundle.getCharSequence(a(3))).e(bundle.getCharSequence(a(4))).f(bundle.getCharSequence(a(5))).g(bundle.getCharSequence(a(6))).a((Uri) bundle.getParcelable(a(7))).a(bundle.getByteArray(a(10)), bundle.containsKey(a(29)) ? Integer.valueOf(bundle.getInt(a(29))) : null).b((Uri) bundle.getParcelable(a(11))).h(bundle.getCharSequence(a(22))).i(bundle.getCharSequence(a(23))).j(bundle.getCharSequence(a(24))).k(bundle.getCharSequence(a(27))).l(bundle.getCharSequence(a(28))).a(bundle.getBundle(a(1000)));
        if (bundle.containsKey(a(8)) && (bundle3 = bundle.getBundle(a(8))) != null) {
            aVar.a((aq) aq.b.fromBundle(bundle3));
        }
        if (bundle.containsKey(a(9)) && (bundle2 = bundle.getBundle(a(9))) != null) {
            aVar.b((aq) aq.b.fromBundle(bundle2));
        }
        if (bundle.containsKey(a(12))) {
            aVar.a(Integer.valueOf(bundle.getInt(a(12))));
        }
        if (bundle.containsKey(a(13))) {
            aVar.b(Integer.valueOf(bundle.getInt(a(13))));
        }
        if (bundle.containsKey(a(14))) {
            aVar.c(Integer.valueOf(bundle.getInt(a(14))));
        }
        if (bundle.containsKey(a(15))) {
            aVar.a(Boolean.valueOf(bundle.getBoolean(a(15))));
        }
        if (bundle.containsKey(a(16))) {
            aVar.d(Integer.valueOf(bundle.getInt(a(16))));
        }
        if (bundle.containsKey(a(17))) {
            aVar.e(Integer.valueOf(bundle.getInt(a(17))));
        }
        if (bundle.containsKey(a(18))) {
            aVar.f(Integer.valueOf(bundle.getInt(a(18))));
        }
        if (bundle.containsKey(a(19))) {
            aVar.g(Integer.valueOf(bundle.getInt(a(19))));
        }
        if (bundle.containsKey(a(20))) {
            aVar.h(Integer.valueOf(bundle.getInt(a(20))));
        }
        if (bundle.containsKey(a(21))) {
            aVar.i(Integer.valueOf(bundle.getInt(a(21))));
        }
        if (bundle.containsKey(a(25))) {
            aVar.j(Integer.valueOf(bundle.getInt(a(25))));
        }
        if (bundle.containsKey(a(26))) {
            aVar.k(Integer.valueOf(bundle.getInt(a(26))));
        }
        return aVar.a();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
