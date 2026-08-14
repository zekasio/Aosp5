package com.applovin.exoplayer2.e.i;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f360a;
    public int b;
    private final int c;
    private boolean d;
    private boolean e;

    public r(int i, int i2) {
        this.c = i;
        byte[] bArr = new byte[i2 + 3];
        this.f360a = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.d = false;
        this.e = false;
    }

    public boolean b() {
        return this.e;
    }

    public void a(int i) {
        com.applovin.exoplayer2.l.a.b(!this.d);
        boolean z = i == this.c;
        this.d = z;
        if (z) {
            this.b = 3;
            this.e = false;
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f360a;
            int length = bArr2.length;
            int i4 = this.b;
            if (length < i4 + i3) {
                this.f360a = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f360a, this.b, i3);
            this.b += i3;
        }
    }

    public boolean b(int i) {
        if (!this.d) {
            return false;
        }
        this.b -= i;
        this.d = false;
        this.e = true;
        return true;
    }
}
