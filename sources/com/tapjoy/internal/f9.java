package com.tapjoy.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f9 extends x8 {
    public final transient byte[][] f;
    public final transient int[] g;

    public f9(u8 u8Var, int i) {
        super(null);
        j9.a(u8Var.b, 0L, i);
        d9 d9Var = u8Var.f1925a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = d9Var.c;
            int i6 = d9Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            d9Var = d9Var.f;
        }
        this.f = new byte[i4][];
        this.g = new int[i4 * 2];
        d9 d9Var2 = u8Var.f1925a;
        int i7 = 0;
        while (i2 < i) {
            this.f[i7] = d9Var2.f1783a;
            int i8 = (d9Var2.c - d9Var2.b) + i2;
            i2 = i8 > i ? i : i8;
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[this.f.length + i7] = d9Var2.b;
            d9Var2.d = true;
            i7++;
            d9Var2 = d9Var2.f;
        }
    }

    @Override // com.tapjoy.internal.x8
    public String a() {
        return d().a();
    }

    public final int b(int i) {
        int iBinarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : iBinarySearch ^ (-1);
    }

    @Override // com.tapjoy.internal.x8
    public String c() {
        return d().c();
    }

    public final x8 d() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return new x8(bArr2);
    }

    @Override // com.tapjoy.internal.x8
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x8) {
            x8 x8Var = (x8) obj;
            if (x8Var.b() == b()) {
                int iB = b();
                if (b() - iB >= 0) {
                    int iB2 = b(0);
                    int i = 0;
                    int i2 = 0;
                    while (iB > 0) {
                        int i3 = iB2 == 0 ? 0 : this.g[iB2 - 1];
                        int iMin = Math.min(iB, ((this.g[iB2] - i3) + i3) - i2);
                        int[] iArr = this.g;
                        byte[][] bArr = this.f;
                        if (x8Var.a(i, bArr[iB2], (i2 - i3) + iArr[bArr.length + iB2], iMin)) {
                            i2 += iMin;
                            i += iMin;
                            iB -= iMin;
                            iB2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tapjoy.internal.x8
    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.b = i4;
        return i4;
    }

    @Override // com.tapjoy.internal.x8
    public String toString() {
        return d().toString();
    }

    @Override // com.tapjoy.internal.x8
    public x8 a(int i, int i2) {
        return d().a(i, i2);
    }

    @Override // com.tapjoy.internal.x8
    public int b() {
        return this.g[this.f.length - 1];
    }

    @Override // com.tapjoy.internal.x8
    public byte a(int i) {
        j9.a(this.g[this.f.length - 1], i, 1L);
        int iB = b(i);
        int i2 = iB == 0 ? 0 : this.g[iB - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[iB][(i - i2) + iArr[bArr.length + iB]];
    }

    @Override // com.tapjoy.internal.x8
    public void a(u8 u8Var) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            d9 d9Var = new d9(this.f[i], i3, (i3 + i4) - i2);
            d9 d9Var2 = u8Var.f1925a;
            if (d9Var2 == null) {
                d9Var.g = d9Var;
                d9Var.f = d9Var;
                u8Var.f1925a = d9Var;
            } else {
                d9Var2.g.a(d9Var);
            }
            i++;
            i2 = i4;
        }
        u8Var.b += (long) i2;
    }

    @Override // com.tapjoy.internal.x8
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iB = b(i);
        while (i3 > 0) {
            int i4 = iB == 0 ? 0 : this.g[iB - 1];
            int iMin = Math.min(i3, ((this.g[iB] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!j9.a(bArr2[iB], (i - i4) + iArr[bArr2.length + iB], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iB++;
        }
        return true;
    }
}
