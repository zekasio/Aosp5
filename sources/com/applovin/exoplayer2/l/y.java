package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f637a;
    private int b;
    private int c;

    public y() {
        this.f637a = ai.f;
    }

    public y(int i) {
        this.f637a = new byte[i];
        this.c = i;
    }

    public y(byte[] bArr) {
        this.f637a = bArr;
        this.c = bArr.length;
    }

    public y(byte[] bArr, int i) {
        this.f637a = bArr;
        this.c = i;
    }

    public void a(int i) {
        a(e() < i ? new byte[i] : this.f637a, i);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.f637a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void b(int i) {
        if (i > e()) {
            this.f637a = Arrays.copyOf(this.f637a, i);
        }
    }

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        return this.c;
    }

    public void c(int i) {
        a.a(i >= 0 && i <= this.f637a.length);
        this.c = i;
    }

    public int c() {
        return this.b;
    }

    public void d(int i) {
        a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public byte[] d() {
        return this.f637a;
    }

    public int e() {
        return this.f637a.length;
    }

    public void e(int i) {
        d(this.b + i);
    }

    public void a(x xVar, int i) {
        a(xVar.f636a, 0, i);
        xVar.a(0);
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f637a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public int f() {
        return this.f637a[this.b] & UByte.MAX_VALUE;
    }

    public char g() {
        byte[] bArr = this.f637a;
        int i = this.b;
        return (char) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public int h() {
        byte[] bArr = this.f637a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public int i() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.b = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | i3;
    }

    public int j() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.b = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public short k() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | i3);
    }

    public short l() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.b = i + 2;
        return (short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | i3);
    }

    public int m() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | i5;
    }

    public int n() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & UByte.MAX_VALUE) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | i5;
    }

    public long o() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public long p() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public int q() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        this.b = i + 4;
        return (bArr[i6] & UByte.MAX_VALUE) | i7;
    }

    public int r() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.b = i + 4;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    public long s() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public long t() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public int u() {
        byte[] bArr = this.f637a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & UByte.MAX_VALUE) | i3;
        this.b = i + 4;
        return i4;
    }

    public int v() {
        return (h() << 21) | (h() << 14) | (h() << 7) | h();
    }

    public int w() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int x() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        throw new IllegalStateException("Top bit not zero: " + iR);
    }

    public long y() {
        long jS = s();
        if (jS >= 0) {
            return jS;
        }
        throw new IllegalStateException("Top bit not zero: " + jS);
    }

    public float z() {
        return Float.intBitsToFloat(q());
    }

    public double A() {
        return Double.longBitsToDouble(s());
    }

    public String f(int i) {
        return a(i, Charsets.UTF_8);
    }

    public String a(int i, Charset charset) {
        String str = new String(this.f637a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public String g(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strA = ai.a(this.f637a, i2, (i3 >= this.c || this.f637a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strA;
    }

    public String B() {
        return a((char) 0);
    }

    public String a(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.f637a[i] != c) {
            i++;
        }
        byte[] bArr = this.f637a;
        int i2 = this.b;
        String strA = ai.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return strA;
    }

    public String C() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !ai.a((int) this.f637a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f637a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f637a;
        int i3 = this.b;
        String strA = ai.a(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.c;
        if (i == i4) {
            return strA;
        }
        byte[] bArr3 = this.f637a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.b = i5;
            if (i5 == i4) {
                return strA;
            }
        }
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return strA;
    }

    public long D() {
        int i;
        int i2;
        long j = this.f637a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f637a[this.b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i2;
        return j;
    }
}
