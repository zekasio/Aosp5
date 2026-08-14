package com.tapjoy.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class x8 implements Serializable, Comparable<x8> {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final x8 e = new x8((byte[]) new byte[0].clone());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1945a;
    public transient int b;
    public transient String c;

    public x8(byte[] bArr) {
        this.f1945a = bArr;
    }

    public String a() {
        byte[] bArr = this.f1945a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public int b() {
        return this.f1945a.length;
    }

    public String c() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f1945a, j9.f1829a);
        this.c = str2;
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(com.tapjoy.internal.x8 r8) {
        /*
            r7 = this;
            com.tapjoy.internal.x8 r8 = (com.tapjoy.internal.x8) r8
            int r0 = r7.b()
            int r1 = r8.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L26
            byte r5 = r7.a(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.a(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L23
            int r4 = r4 + 1
            goto L10
        L23:
            if (r5 >= r6) goto L2d
            goto L2b
        L26:
            if (r0 != r1) goto L29
            goto L2e
        L29:
            if (r0 >= r1) goto L2d
        L2b:
            r3 = -1
            goto L2e
        L2d:
            r3 = 1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.x8.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x8) {
            x8 x8Var = (x8) obj;
            int iB = x8Var.b();
            byte[] bArr = this.f1945a;
            if (iB == bArr.length && x8Var.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f1945a);
        this.b = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.x8.toString():java.lang.String");
    }

    public x8 a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f1945a;
            if (i2 > bArr.length) {
                StringBuilder sbA = w1.a("endIndex > length(");
                sbA.append(this.f1945a.length);
                sbA.append(")");
                throw new IllegalArgumentException(sbA.toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, i3);
                return new x8(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte a(int i) {
        return this.f1945a[i];
    }

    public void a(u8 u8Var) {
        byte[] bArr = this.f1945a;
        u8Var.a(bArr, 0, bArr.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f1945a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && j9.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }
}
