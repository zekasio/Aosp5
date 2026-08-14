package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f625a;
    private long[] b;

    public r() {
        this(32);
    }

    public r(int i) {
        this.b = new long[i];
    }

    public void a(long j) {
        int i = this.f625a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f625a;
        this.f625a = i2 + 1;
        jArr2[i2] = j;
    }

    public long a(int i) {
        if (i < 0 || i >= this.f625a) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f625a);
        }
        return this.b[i];
    }

    public int a() {
        return this.f625a;
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.f625a);
    }
}
