package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102a;
    public final v b;
    public final v c;
    public final int d;
    public final int e;

    public h(String str, v vVar, v vVar2, int i, int i2) {
        com.applovin.exoplayer2.l.a.a(i == 0 || i2 == 0);
        this.f102a = com.applovin.exoplayer2.l.a.a(str);
        this.b = (v) com.applovin.exoplayer2.l.a.b(vVar);
        this.c = (v) com.applovin.exoplayer2.l.a.b(vVar2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.d == hVar.d && this.e == hVar.e && this.f102a.equals(hVar.f102a) && this.b.equals(hVar.b) && this.c.equals(hVar.c);
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.f102a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
