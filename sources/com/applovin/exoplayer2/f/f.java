package com.applovin.exoplayer2.f;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f403a = 0;
    private int b = -1;
    private int c = 0;
    private int[] d = new int[16];
    private int e;

    public f() {
        this.e = r0.length - 1;
    }

    public void a(int i) {
        if (this.c == this.d.length) {
            d();
        }
        int i2 = (this.b + 1) & this.e;
        this.b = i2;
        this.d[i2] = i;
        this.c++;
    }

    public int a() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d;
        int i2 = this.f403a;
        int i3 = iArr[i2];
        this.f403a = (i2 + 1) & this.e;
        this.c = i - 1;
        return i3;
    }

    public boolean b() {
        return this.c == 0;
    }

    public void c() {
        this.f403a = 0;
        this.b = -1;
        this.c = 0;
    }

    private void d() {
        int[] iArr = this.d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.f403a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.d, 0, iArr2, i2, i);
        this.f403a = 0;
        this.b = this.c - 1;
        this.d = iArr2;
        this.e = iArr2.length - 1;
    }
}
