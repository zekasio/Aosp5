package com.tapjoy.internal;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class u8 implements w8, v8, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9 f1925a;
    public long b;

    @Override // com.tapjoy.internal.w8
    public long b() {
        long jF;
        long j = this.b;
        if (j < 8) {
            StringBuilder sbA = w1.a("size < 8: ");
            sbA.append(this.b);
            throw new IllegalStateException(sbA.toString());
        }
        d9 d9Var = this.f1925a;
        int i = d9Var.b;
        int i2 = d9Var.c;
        if (i2 - i < 8) {
            jF = ((((long) f()) & 4294967295L) << 32) | (4294967295L & ((long) f()));
        } else {
            byte[] bArr = d9Var.f1783a;
            int i3 = i + 7;
            long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            this.b = j - 8;
            if (i4 == i2) {
                this.f1925a = d9Var.a();
                e9.a(d9Var);
            } else {
                d9Var.b = i4;
            }
            jF = j3;
        }
        return j9.a(jF);
    }

    @Override // com.tapjoy.internal.w8
    public boolean c() {
        return this.b == 0;
    }

    @Override // com.tapjoy.internal.h9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.tapjoy.internal.w8
    public void d(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public byte[] e() {
        try {
            return e(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        long j = this.b;
        if (j != u8Var.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        d9 d9Var = this.f1925a;
        d9 d9Var2 = u8Var.f1925a;
        int i = d9Var.b;
        int i2 = d9Var2.b;
        while (j2 < this.b) {
            long jMin = Math.min(d9Var.c - i, d9Var2.c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (d9Var.f1783a[i] != d9Var2.f1783a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == d9Var.c) {
                d9Var = d9Var.f;
                i = d9Var.b;
            }
            if (i2 == d9Var2.c) {
                d9Var2 = d9Var2.f;
                i2 = d9Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public int f() {
        long j = this.b;
        if (j < 4) {
            StringBuilder sbA = w1.a("size < 4: ");
            sbA.append(this.b);
            throw new IllegalStateException(sbA.toString());
        }
        d9 d9Var = this.f1925a;
        int i = d9Var.b;
        int i2 = d9Var.c;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = d9Var.f1783a;
        int i3 = ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24);
        int i4 = i + 3;
        int i5 = i3 | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int i6 = i + 4;
        int i7 = (bArr[i4] & UByte.MAX_VALUE) | i5;
        this.b = j - 4;
        if (i6 == i2) {
            this.f1925a = d9Var.a();
            e9.a(d9Var);
        } else {
            d9Var.b = i6;
        }
        return i7;
    }

    @Override // com.tapjoy.internal.g9, java.io.Flushable
    public void flush() {
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        d9 d9Var = this.f1925a;
        if (d9Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = d9Var.c;
            for (int i3 = d9Var.b; i3 < i2; i3++) {
                i = (i * 31) + d9Var.f1783a[i3];
            }
            d9Var = d9Var.f;
        } while (d9Var != this.f1925a);
        return i;
    }

    @Override // com.tapjoy.internal.w8
    public byte readByte() {
        long j = this.b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        d9 d9Var = this.f1925a;
        int i = d9Var.b;
        int i2 = d9Var.c;
        int i3 = i + 1;
        byte b = d9Var.f1783a[i];
        this.b = j - 1;
        if (i3 == i2) {
            this.f1925a = d9Var.a();
            e9.a(d9Var);
        } else {
            d9Var.b = i3;
        }
        return b;
    }

    @Override // com.tapjoy.internal.w8
    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.f1925a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.c - r0.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            d9 d9Var = this.f1925a;
            d9Var.b += iMin;
            if (d9Var.b == d9Var.c) {
                this.f1925a = d9Var.a();
                e9.a(d9Var);
            }
        }
    }

    public String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? x8.e : new f9(this, i)).toString();
        }
        StringBuilder sbA = w1.a("size > Integer.MAX_VALUE: ");
        sbA.append(this.b);
        throw new IllegalArgumentException(sbA.toString());
    }

    @Override // com.tapjoy.internal.w8
    public String c(long j) {
        Charset charset = j9.f1829a;
        j9.a(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        d9 d9Var = this.f1925a;
        int i = d9Var.b;
        if (((long) i) + j > d9Var.c) {
            return new String(e(j), charset);
        }
        String str = new String(d9Var.f1783a, i, (int) j, charset);
        d9Var.b = (int) (((long) d9Var.b) + j);
        this.b -= j;
        if (d9Var.b == d9Var.c) {
            this.f1925a = d9Var.a();
            e9.a(d9Var);
        }
        return str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u8 m328clone() {
        u8 u8Var = new u8();
        if (this.b == 0) {
            return u8Var;
        }
        d9 d9Var = new d9(this.f1925a);
        u8Var.f1925a = d9Var;
        d9Var.g = d9Var;
        d9Var.f = d9Var;
        for (d9 d9Var2 = this.f1925a.f; d9Var2 != this.f1925a; d9Var2 = d9Var2.f) {
            u8Var.f1925a.g.a(new d9(d9Var2));
        }
        u8Var.b = this.b;
        return u8Var;
    }

    public void d() {
        try {
            skip(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.tapjoy.internal.v8
    public u8 writeByte(int i) {
        d9 d9VarB = b(1);
        byte[] bArr = d9VarB.f1783a;
        int i2 = d9VarB.c;
        d9VarB.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // com.tapjoy.internal.w8
    public int a() {
        return j9.a(f());
    }

    public byte[] e(long j) throws EOFException {
        int iMin;
        j9.a(this.b, 0L, j);
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                j9.a(i, i2, i3);
                d9 d9Var = this.f1925a;
                if (d9Var == null) {
                    iMin = -1;
                } else {
                    iMin = Math.min(i3, d9Var.c - d9Var.b);
                    System.arraycopy(d9Var.f1783a, d9Var.b, bArr, i2, iMin);
                    d9Var.b += iMin;
                    this.b -= (long) iMin;
                    if (d9Var.b == d9Var.c) {
                        this.f1925a = d9Var.a();
                        e9.a(d9Var);
                    }
                }
                if (iMin == -1) {
                    throw new EOFException();
                }
                i2 += iMin;
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.tapjoy.internal.v8
    public u8 a(x8 x8Var) {
        if (x8Var != null) {
            x8Var.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.tapjoy.internal.v8
    public v8 a(x8 x8Var) {
        if (x8Var != null) {
            x8Var.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.tapjoy.internal.v8
    public u8 a(String str) {
        char cCharAt;
        int length = str.length();
        if (length >= 0) {
            if (length > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
            }
            int i = 0;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    d9 d9VarB = b(1);
                    byte[] bArr = d9VarB.f1783a;
                    int i2 = d9VarB.c - i;
                    int iMin = Math.min(length, 8192 - i2);
                    int i3 = i + 1;
                    bArr[i + i2] = (byte) cCharAt2;
                    while (true) {
                        i = i3;
                        if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i3 = i + 1;
                        bArr[i + i2] = (byte) cCharAt;
                    }
                    int i4 = d9VarB.c;
                    int i5 = (i2 + i) - i4;
                    d9VarB.c = i4 + i5;
                    this.b += (long) i5;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | 192);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i6 = i + 1;
                        char cCharAt3 = i6 < length ? str.charAt(i6) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i7 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            writeByte((i7 >> 18) | 240);
                            writeByte(((i7 >> 12) & 63) | 128);
                            writeByte(((i7 >> 6) & 63) | 128);
                            writeByte((i7 & 63) | 128);
                            i += 2;
                        } else {
                            writeByte(63);
                            i = i6;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
    }

    @Override // com.tapjoy.internal.w8
    public x8 b(long j) {
        return new x8(e(j));
    }

    public d9 b(int i) {
        if (i >= 1 && i <= 8192) {
            d9 d9Var = this.f1925a;
            if (d9Var == null) {
                d9 d9VarA = e9.a();
                this.f1925a = d9VarA;
                d9VarA.g = d9VarA;
                d9VarA.f = d9VarA;
                return d9VarA;
            }
            d9 d9Var2 = d9Var.g;
            return (d9Var2.c + i > 8192 || !d9Var2.e) ? d9Var2.a(e9.a()) : d9Var2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.tapjoy.internal.h9
    public long b(u8 u8Var, long j) {
        if (u8Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            u8Var.a(this, j);
            return j;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public u8 a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            j9.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                d9 d9VarB = b(1);
                int iMin = Math.min(i3 - i, 8192 - d9VarB.c);
                System.arraycopy(bArr, i, d9VarB.f1783a, d9VarB.c, iMin);
                i += iMin;
                d9VarB.c += iMin;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.tapjoy.internal.v8
    public u8 a(int i) {
        int iA = j9.a(i);
        d9 d9VarB = b(4);
        byte[] bArr = d9VarB.f1783a;
        int i2 = d9VarB.c;
        bArr[i2] = (byte) ((iA >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((iA >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((iA >>> 8) & 255);
        bArr[i2 + 3] = (byte) (iA & 255);
        d9VarB.c = i2 + 4;
        this.b += 4;
        return this;
    }

    @Override // com.tapjoy.internal.v8
    public u8 a(long j) {
        long jA = j9.a(j);
        d9 d9VarB = b(8);
        byte[] bArr = d9VarB.f1783a;
        int i = d9VarB.c;
        bArr[i] = (byte) ((jA >>> 56) & 255);
        bArr[i + 1] = (byte) ((jA >>> 48) & 255);
        bArr[i + 2] = (byte) ((jA >>> 40) & 255);
        bArr[i + 3] = (byte) ((jA >>> 32) & 255);
        bArr[i + 4] = (byte) ((jA >>> 24) & 255);
        bArr[i + 5] = (byte) ((jA >>> 16) & 255);
        bArr[i + 6] = (byte) ((jA >>> 8) & 255);
        bArr[i + 7] = (byte) (jA & 255);
        d9VarB.c = i + 8;
        this.b += 8;
        return this;
    }

    @Override // com.tapjoy.internal.g9
    public void a(u8 u8Var, long j) {
        if (u8Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (u8Var != this) {
            j9.a(u8Var.b, 0L, j);
            while (j > 0) {
                d9 d9Var = u8Var.f1925a;
                if (j < d9Var.c - d9Var.b) {
                    d9 d9Var2 = this.f1925a;
                    d9 d9Var3 = d9Var2 != null ? d9Var2.g : null;
                    if (d9Var3 != null && d9Var3.e) {
                        if ((((long) d9Var3.c) + j) - ((long) (d9Var3.d ? 0 : d9Var3.b)) <= 8192) {
                            u8Var.f1925a.a(d9Var3, (int) j);
                            u8Var.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    u8Var.f1925a = u8Var.f1925a.a((int) j);
                }
                d9 d9Var4 = u8Var.f1925a;
                long j2 = d9Var4.c - d9Var4.b;
                u8Var.f1925a = d9Var4.a();
                d9 d9Var5 = this.f1925a;
                if (d9Var5 == null) {
                    this.f1925a = d9Var4;
                    d9Var4.g = d9Var4;
                    d9Var4.f = d9Var4;
                } else {
                    d9 d9VarA = d9Var5.g.a(d9Var4);
                    d9 d9Var6 = d9VarA.g;
                    if (d9Var6 != d9VarA) {
                        if (d9Var6.e) {
                            int i = d9VarA.c - d9VarA.b;
                            if (i <= (8192 - d9Var6.c) + (d9Var6.d ? 0 : d9Var6.b)) {
                                d9VarA.a(d9VarA.g, i);
                                d9VarA.a();
                                e9.a(d9VarA);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                u8Var.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
