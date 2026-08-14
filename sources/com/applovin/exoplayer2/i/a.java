package com.applovin.exoplayer2.i;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f486a = new C0033a().a("").e();
    public static final g.a<a> s = new g.a() { // from class: com.applovin.exoplayer2.i.a$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return a.a(bundle);
        }
    };
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Layout.Alignment d;
    public final Bitmap e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            com.applovin.exoplayer2.l.a.b(bitmap);
        } else {
            com.applovin.exoplayer2.l.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.b = charSequence.toString();
        } else {
            this.b = null;
        }
        this.c = alignment;
        this.d = alignment2;
        this.e = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public C0033a a() {
        return new C0033a();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && ((bitmap = this.e) != null ? !((bitmap2 = aVar.e) == null || !bitmap.sameAs(bitmap2)) : aVar.e == null) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.c, this.d, this.e, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r));
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a$a, reason: collision with other inner class name */
    public static final class C0033a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f487a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public C0033a() {
            this.f487a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = ViewCompat.MEASURED_STATE_MASK;
            this.p = Integer.MIN_VALUE;
        }

        private C0033a(a aVar) {
            this.f487a = aVar.b;
            this.b = aVar.e;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.f;
            this.f = aVar.g;
            this.g = aVar.h;
            this.h = aVar.i;
            this.i = aVar.j;
            this.j = aVar.o;
            this.k = aVar.p;
            this.l = aVar.k;
            this.m = aVar.l;
            this.n = aVar.m;
            this.o = aVar.n;
            this.p = aVar.q;
            this.q = aVar.r;
        }

        public C0033a a(CharSequence charSequence) {
            this.f487a = charSequence;
            return this;
        }

        public CharSequence a() {
            return this.f487a;
        }

        public C0033a a(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public C0033a a(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public C0033a b(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public C0033a a(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public C0033a a(int i) {
            this.g = i;
            return this;
        }

        public int b() {
            return this.g;
        }

        public C0033a a(float f) {
            this.h = f;
            return this;
        }

        public C0033a b(int i) {
            this.i = i;
            return this;
        }

        public int c() {
            return this.i;
        }

        public C0033a b(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public C0033a b(float f) {
            this.l = f;
            return this;
        }

        public C0033a c(float f) {
            this.m = f;
            return this;
        }

        public C0033a c(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public C0033a d() {
            this.n = false;
            return this;
        }

        public C0033a d(int i) {
            this.p = i;
            return this;
        }

        public C0033a d(float f) {
            this.q = f;
            return this;
        }

        public a e() {
            return new a(this.f487a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(Bundle bundle) {
        C0033a c0033a = new C0033a();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            c0033a.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            c0033a.a(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            c0033a.b(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            c0033a.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            c0033a.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            c0033a.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            c0033a.a(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            c0033a.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            c0033a.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            c0033a.b(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            c0033a.c(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            c0033a.c(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            c0033a.d();
        }
        if (bundle.containsKey(a(15))) {
            c0033a.d(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            c0033a.d(bundle.getFloat(a(16)));
        }
        return c0033a.e();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
