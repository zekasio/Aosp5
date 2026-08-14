package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {
    private final com.applovin.exoplayer2.k.g b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f279a = new byte[4096];

    public e(com.applovin.exoplayer2.k.g gVar, long j, long j2) {
        this.b = gVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        int iE = e(bArr, i, i2);
        if (iE == 0) {
            iE = a(bArr, i, i2, 0, true);
        }
        g(iE);
        return iE;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iE = e(bArr, i, i2);
        while (iE < i2 && iE != -1) {
            iE = a(bArr, i, i2, iE, z);
        }
        g(iE);
        return iE != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(byte[] bArr, int i, int i2) throws IOException {
        a(bArr, i, i2, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public int a(int i) throws IOException {
        int iE = e(i);
        if (iE == 0) {
            byte[] bArr = this.f279a;
            iE = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        g(iE);
        return iE;
    }

    public boolean a(int i, boolean z) throws IOException {
        int iE = e(i);
        while (iE < i && iE != -1) {
            iE = a(this.f279a, -iE, Math.min(i, this.f279a.length + iE), iE, z);
        }
        g(iE);
        return iE != -1;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void b(int i) throws IOException {
        a(i, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public int c(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        d(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = a(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void d(byte[] bArr, int i, int i2) throws IOException {
        b(bArr, i, i2, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public boolean b(int i, boolean z) throws IOException {
        d(i);
        int iA = this.g - this.f;
        while (iA < i) {
            iA = a(this.e, this.f, i, iA, z);
            if (iA == -1) {
                return false;
            }
            this.g = this.f + iA;
        }
        this.f += i;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.i
    public void c(int i) throws IOException {
        b(i, false);
    }

    @Override // com.applovin.exoplayer2.e.i
    public void a() {
        this.f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long b() {
        return this.d + ((long) this.f);
    }

    @Override // com.applovin.exoplayer2.e.i
    public long c() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.e.i
    public long d() {
        return this.c;
    }

    private void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, ai.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int e(int i) {
        int iMin = Math.min(this.g, i);
        f(iMin);
        return iMin;
    }

    private int e(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, iMin);
        f(iMin);
        return iMin;
    }

    private void f(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iA = this.b.a(bArr, i + i3, i2 - i3);
        if (iA != -1) {
            return i3 + iA;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private void g(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }
}
