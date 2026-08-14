package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f315a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean m;
    public l o;
    public boolean q;
    public long r;
    public boolean s;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public int[] j = new int[0];
    public long[] k = new long[0];
    public boolean[] l = new boolean[0];
    public boolean[] n = new boolean[0];
    public final y p = new y();

    public void a() {
        this.e = 0;
        this.r = 0L;
        this.s = false;
        this.m = false;
        this.q = false;
        this.o = null;
    }

    public void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.h.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        if (this.i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.i = new int[i3];
            this.j = new int[i3];
            this.k = new long[i3];
            this.l = new boolean[i3];
            this.n = new boolean[i3];
        }
    }

    public void a(int i) {
        this.p.a(i);
        this.m = true;
        this.q = true;
    }

    public void a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        iVar.b(this.p.d(), 0, this.p.b());
        this.p.d(0);
        this.q = false;
    }

    public void a(y yVar) {
        yVar.a(this.p.d(), 0, this.p.b());
        this.p.d(0);
        this.q = false;
    }

    public long b(int i) {
        return this.k[i] + ((long) this.j[i]);
    }

    public boolean c(int i) {
        return this.m && this.n[i];
    }
}
