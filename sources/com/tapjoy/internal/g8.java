package com.tapjoy.internal;

import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public class g8 {
    public ByteBuffer b;
    public f8 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1807a = new byte[256];
    public int d = 0;

    public g8 a(byte[] bArr) {
        if (bArr != null) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.b = null;
            Arrays.fill(this.f1807a, (byte) 0);
            this.c = new f8();
            this.d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferWrap.asReadOnlyBuffer();
            this.b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.b = null;
            this.c.b = 2;
        }
        return this;
    }

    public f8 b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        String string = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sbA = w1.a(string);
            sbA.append((char) c());
            string = sbA.toString();
        }
        if (string.startsWith("GIF")) {
            this.c.f = e();
            this.c.g = e();
            int iC = c();
            this.c.h = (iC & 128) != 0;
            f8 f8Var = this.c;
            f8Var.i = 2 << (iC & 7);
            f8Var.j = c();
            this.c.k = c();
            if (this.c.h && !a()) {
                f8 f8Var2 = this.c;
                f8Var2.f1799a = a(f8Var2.i);
                f8 f8Var3 = this.c;
                f8Var3.l = f8Var3.f1799a[f8Var3.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new e8();
                        c();
                        int iC4 = c();
                        e8 e8Var = this.c.d;
                        e8Var.g = (iC4 & 28) >> 2;
                        if (e8Var.g == 0) {
                            e8Var.g = 1;
                        }
                        this.c.d.f = (iC4 & 1) != 0;
                        int iE = e();
                        if (iE < 2) {
                            iE = 10;
                        }
                        e8 e8Var2 = this.c.d;
                        e8Var2.i = iE * 10;
                        e8Var2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        String string2 = "";
                        for (int i2 = 0; i2 < 11; i2++) {
                            StringBuilder sbA2 = w1.a(string2);
                            sbA2.append((char) this.f1807a[i2]);
                            string2 = sbA2.toString();
                        }
                        if (string2.equals("NETSCAPE2.0")) {
                            do {
                                d();
                                byte[] bArr = this.f1807a;
                                if (bArr[0] == 1) {
                                    int i3 = bArr[1] & UByte.MAX_VALUE;
                                    int i4 = bArr[2] & UByte.MAX_VALUE;
                                    f8 f8Var4 = this.c;
                                    f8Var4.m = (i4 << 8) | i3;
                                    if (f8Var4.m == 0) {
                                        f8Var4.m = -1;
                                    }
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    f8 f8Var5 = this.c;
                    if (f8Var5.d == null) {
                        f8Var5.d = new e8();
                    }
                    this.c.d.f1794a = e();
                    this.c.d.b = e();
                    this.c.d.c = e();
                    this.c.d.d = e();
                    int iC5 = c();
                    boolean z2 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    this.c.d.e = (iC5 & 64) != 0;
                    if (z2) {
                        this.c.d.k = a(iPow);
                    } else {
                        this.c.d.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        f8 f8Var6 = this.c;
                        f8Var6.c++;
                        f8Var6.e.add(f8Var6.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            f8 f8Var7 = this.c;
            if (f8Var7.c < 0) {
                f8Var7.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int d() {
        int iC = c();
        this.d = iC;
        int i = 0;
        if (iC > 0) {
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.d;
                    if (i >= i2) {
                        break;
                    }
                    i2 -= i;
                    this.b.get(this.f1807a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Integer.valueOf(this.d);
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    public final int e() {
        return this.b.getShort();
    }

    public final void f() {
        int iC;
        do {
            try {
                iC = c();
                ByteBuffer byteBuffer = this.b;
                byteBuffer.position(byteBuffer.position() + iC);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iC > 0);
    }

    public final int[] a(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & UByte.MAX_VALUE;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & UByte.MAX_VALUE;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i5] & UByte.MAX_VALUE);
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
        }
        return iArr;
    }

    public final boolean a() {
        return this.c.b != 0;
    }
}
