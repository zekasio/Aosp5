package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class af<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f609a;
    private V[] b;
    private int c;
    private int d;

    public af() {
        this(10);
    }

    public af(int i) {
        this.f609a = new long[i];
        this.b = (V[]) a(i);
    }

    public synchronized void a(long j, V v) {
        b(j);
        e();
        b(j, v);
    }

    public synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public synchronized int b() {
        return this.d;
    }

    public synchronized V c() {
        return this.d == 0 ? null : d();
    }

    public synchronized V a(long j) {
        return a(j, true);
    }

    private V a(long j, boolean z) {
        V vD = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f609a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vD = d();
            j2 = j3;
        }
        return vD;
    }

    private V d() {
        a.b(this.d > 0);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    private void b(long j) {
        if (this.d > 0) {
            if (j <= this.f609a[((this.c + r0) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private void e() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) a(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.f609a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.f609a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.f609a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    private void b(long j, V v) {
        int i = this.c;
        int i2 = this.d;
        V[] vArr = this.b;
        int length = (i + i2) % vArr.length;
        this.f609a[length] = j;
        vArr[length] = v;
        this.d = i2 + 1;
    }

    private static <V> V[] a(int i) {
        return (V[]) new Object[i];
    }
}
