package com.applovin.exoplayer2.i.g;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f531a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private String l;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private b r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    public int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public boolean b() {
        return this.f == 1;
    }

    public g a(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public boolean c() {
        return this.g == 1;
    }

    public g b(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public g c(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public g d(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public String d() {
        return this.f531a;
    }

    public g a(String str) {
        this.f531a = str;
        return this;
    }

    public int e() {
        if (!this.c) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.b;
    }

    public g a(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public boolean f() {
        return this.c;
    }

    public int g() {
        if (!this.e) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.d;
    }

    public g b(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public boolean h() {
        return this.e;
    }

    public g a(float f) {
        this.s = f;
        return this;
    }

    public float i() {
        return this.s;
    }

    public g a(g gVar) {
        return a(gVar, true);
    }

    private g a(g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.c && gVar.c) {
                a(gVar.b);
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f531a == null && (str = gVar.f531a) != null) {
                this.f531a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.g == -1) {
                this.g = gVar.g;
            }
            if (this.n == -1) {
                this.n = gVar.n;
            }
            if (this.o == null && (alignment2 = gVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = gVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = gVar.q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.r == null) {
                this.r = gVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gVar.s;
            }
            if (z && !this.e && gVar.e) {
                b(gVar.d);
            }
            if (z && this.m == -1 && (i = gVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public g b(String str) {
        this.l = str;
        return this;
    }

    public String j() {
        return this.l;
    }

    public g c(int i) {
        this.m = i;
        return this;
    }

    public int k() {
        return this.m;
    }

    public g d(int i) {
        this.n = i;
        return this;
    }

    public int l() {
        return this.n;
    }

    public Layout.Alignment m() {
        return this.o;
    }

    public g a(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public Layout.Alignment n() {
        return this.p;
    }

    public g b(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public boolean o() {
        return this.q == 1;
    }

    public g e(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public b p() {
        return this.r;
    }

    public g a(b bVar) {
        this.r = bVar;
        return this;
    }

    public g b(float f) {
        this.k = f;
        return this;
    }

    public g e(int i) {
        this.j = i;
        return this;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.k;
    }
}
