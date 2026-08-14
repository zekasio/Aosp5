package com.applovin.exoplayer2.h;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f471a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public o(Object obj) {
        this(obj, -1L);
    }

    public o(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public o(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public o(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    protected o(o oVar) {
        this.f471a = oVar.f471a;
        this.b = oVar.b;
        this.c = oVar.c;
        this.d = oVar.d;
        this.e = oVar.e;
    }

    private o(Object obj, int i, int i2, long j, int i3) {
        this.f471a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public o a(Object obj) {
        return this.f471a.equals(obj) ? this : new o(obj, this.b, this.c, this.d, this.e);
    }

    public boolean a() {
        return this.b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f471a.equals(oVar.f471a) && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e;
    }

    public int hashCode() {
        return ((((((((527 + this.f471a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
