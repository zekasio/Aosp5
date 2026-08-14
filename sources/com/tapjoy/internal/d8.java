package com.tapjoy.internal;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1782a;
    public ByteBuffer c;
    public byte[] d;
    public byte[] e;
    public g8 h;
    public short[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public int[] m;
    public int n;
    public int o;
    public a q;
    public Bitmap r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public final int[] b = new int[256];
    public int f = 0;
    public int g = 0;
    public f8 p = new f8();

    public interface a {
    }

    public d8(a aVar) {
        this.q = aVar;
    }

    public int a() {
        return this.p.c;
    }

    public final Bitmap b() {
        Bitmap bitmapA = ((i8) this.q).a(this.w, this.v, this.x ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32, types: [short] */
    /* JADX WARN: Type inference failed for: r2v34 */
    public synchronized Bitmap c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        int i9;
        int i10;
        int i11 = 1;
        if (this.p.c <= 0 || this.n < 0) {
            Integer.valueOf(this.p.c);
            Integer.valueOf(this.n);
            this.t = 1;
        }
        int i12 = this.t;
        if (i12 != 1 && i12 != 2) {
            int i13 = 0;
            this.t = 0;
            e8 e8Var = this.p.e.get(this.n);
            int i14 = this.n - 1;
            e8 e8Var2 = i14 >= 0 ? this.p.e.get(i14) : null;
            int[] iArr = e8Var.k;
            if (iArr == null) {
                iArr = this.p.f1799a;
            }
            this.f1782a = iArr;
            if (iArr == null) {
                Integer.valueOf(this.n);
                this.t = 1;
                return null;
            }
            if (e8Var.f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.f1782a = iArr2;
                iArr2[e8Var.h] = 0;
            }
            int[] iArr3 = this.m;
            if (e8Var2 == null) {
                Arrays.fill(iArr3, 0);
            }
            if (e8Var2 != null && (i9 = e8Var2.g) > 0) {
                if (i9 == 2) {
                    if (!e8Var.f) {
                        f8 f8Var = this.p;
                        i10 = f8Var.l;
                        if (e8Var.k != null && f8Var.j == e8Var.h) {
                        }
                        a(iArr3, e8Var2, i10);
                    } else if (this.n == 0) {
                        this.x = true;
                    }
                    i10 = 0;
                    a(iArr3, e8Var2, i10);
                } else if (i9 == 3) {
                    Bitmap bitmap = this.r;
                    if (bitmap == null) {
                        a(iArr3, e8Var2, 0);
                    } else {
                        int i15 = e8Var2.d;
                        int i16 = this.u;
                        int i17 = e8Var2.b / i16;
                        int i18 = e8Var2.c / i16;
                        int i19 = e8Var2.f1794a / i16;
                        int i20 = this.w;
                        bitmap.getPixels(iArr3, (i17 * i20) + i19, i20, i19, i17, i18, i15 / i16);
                    }
                }
            }
            this.f = 0;
            this.g = 0;
            this.c.position(e8Var.j);
            int i21 = e8Var.c * e8Var.d;
            byte[] bArr = this.l;
            if (bArr == null || bArr.length < i21) {
                this.l = ((i8) this.q).a(i21);
            }
            if (this.i == null) {
                this.i = new short[4096];
            }
            if (this.j == null) {
                this.j = new byte[4096];
            }
            if (this.k == null) {
                this.k = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
            }
            int iD = d();
            int i22 = 1 << iD;
            int i23 = i22 + 1;
            int i24 = i22 + 2;
            int i25 = iD + 1;
            int i26 = (1 << i25) - 1;
            for (int i27 = 0; i27 < i22; i27++) {
                this.i[i27] = 0;
                this.j[i27] = (byte) i27;
            }
            int i28 = i25;
            int i29 = i24;
            int i30 = i26;
            int i31 = 0;
            int iD2 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = -1;
            while (true) {
                if (i31 >= i21) {
                    break;
                }
                if (iD2 == 0) {
                    iD2 = d();
                    if (iD2 > 0) {
                        try {
                            if (this.d == null) {
                                this.d = ((i8) this.q).a(255);
                            }
                            int i39 = this.f;
                            int i40 = this.g;
                            int i41 = i39 - i40;
                            if (i41 >= iD2) {
                                System.arraycopy(this.e, i40, this.d, i13, iD2);
                                this.g += iD2;
                            } else if (this.c.remaining() + i41 >= iD2) {
                                try {
                                    System.arraycopy(this.e, this.g, this.d, i13, i41);
                                    this.g = this.f;
                                    e();
                                    int i42 = iD2 - i41;
                                    System.arraycopy(this.e, i13, this.d, i41, i42);
                                    this.g += i42;
                                } catch (Exception unused) {
                                    i11 = 1;
                                    this.t = i11;
                                }
                            } else {
                                this.t = i11;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    if (iD2 <= 0) {
                        this.t = 3;
                        break;
                    }
                    i33 = 0;
                }
                i32 += (this.d[i33] & UByte.MAX_VALUE) << i34;
                i33++;
                iD2--;
                int i43 = i34 + 8;
                int i44 = i36;
                int i45 = i29;
                int i46 = i28;
                int i47 = i38;
                while (i43 >= i46) {
                    int i48 = i25;
                    int i49 = i32 & i30;
                    i32 >>= i46;
                    i43 -= i46;
                    if (i49 != i22) {
                        if (i49 > i45) {
                            i8 = i43;
                            this.t = 3;
                        } else {
                            i8 = i43;
                            if (i49 != i23) {
                                if (i47 == -1) {
                                    this.k[i37] = this.j[i49];
                                    i37++;
                                    i47 = i49;
                                    i44 = i47;
                                    i25 = i48;
                                    i43 = i8;
                                } else {
                                    if (i49 >= i45) {
                                        this.k[i37] = (byte) i44;
                                        s = i47;
                                        i37++;
                                    } else {
                                        s = i49;
                                    }
                                    while (s >= i22) {
                                        this.k[i37] = this.j[s];
                                        s = this.i[s];
                                        i37++;
                                        i49 = i49;
                                    }
                                    int i50 = i49;
                                    byte[] bArr2 = this.j;
                                    int i51 = bArr2[s] & UByte.MAX_VALUE;
                                    int i52 = i37 + 1;
                                    int i53 = i22;
                                    byte b = (byte) i51;
                                    this.k[i37] = b;
                                    if (i45 < 4096) {
                                        this.i[i45] = (short) i47;
                                        bArr2[i45] = b;
                                        i45++;
                                        if ((i45 & i30) == 0 && i45 < 4096) {
                                            i46++;
                                            i30 += i45;
                                        }
                                    }
                                    i37 = i52;
                                    while (i37 > 0) {
                                        i37--;
                                        this.l[i35] = this.k[i37];
                                        i31++;
                                        i35++;
                                    }
                                    i44 = i51;
                                    i25 = i48;
                                    i43 = i8;
                                    i47 = i50;
                                    i22 = i53;
                                }
                            }
                        }
                        i38 = i47;
                        i28 = i46;
                        i25 = i48;
                        i34 = i8;
                        i13 = 0;
                        i11 = 1;
                        i36 = i44;
                        i29 = i45;
                        break;
                    }
                    i45 = i24;
                    i30 = i26;
                    i25 = i48;
                    i46 = i25;
                    i47 = -1;
                }
                i38 = i47;
                i34 = i43;
                i36 = i44;
                i29 = i45;
                i28 = i46;
                i13 = 0;
                i11 = 1;
            }
            for (int i54 = i35; i54 < i21; i54++) {
                this.l[i54] = 0;
            }
            int i55 = e8Var.d;
            int i56 = this.u;
            int i57 = i55 / i56;
            int i58 = e8Var.b / i56;
            int i59 = e8Var.c / i56;
            int i60 = e8Var.f1794a / i56;
            boolean z = this.n == 0;
            int i61 = 0;
            int i62 = 1;
            int i63 = 0;
            int i64 = 8;
            while (i63 < i57) {
                if (e8Var.e) {
                    if (i61 >= i57) {
                        i62++;
                        if (i62 == 2) {
                            i61 = 4;
                        } else if (i62 == 3) {
                            i61 = 2;
                            i64 = 4;
                        } else if (i62 == 4) {
                            i61 = 1;
                            i64 = 2;
                        }
                    }
                    i2 = i61 + i64;
                } else {
                    i2 = i61;
                    i61 = i63;
                }
                int i65 = i61 + i58;
                if (i65 < this.v) {
                    int i66 = this.w;
                    int i67 = i65 * i66;
                    int i68 = i67 + i60;
                    int i69 = i68 + i59;
                    int i70 = i67 + i66;
                    if (i70 < i69) {
                        i69 = i70;
                    }
                    int i71 = this.u;
                    int i72 = i63 * i71 * e8Var.c;
                    int i73 = ((i69 - i68) * i71) + i72;
                    int i74 = i68;
                    while (i74 < i69) {
                        int i75 = i57;
                        int i76 = i58;
                        if (this.u == 1) {
                            i6 = this.f1782a[this.l[i72] & UByte.MAX_VALUE];
                            i3 = i59;
                            i4 = i60;
                            i5 = i62;
                        } else {
                            int i77 = e8Var.c;
                            i3 = i59;
                            int i78 = i72;
                            int i79 = 0;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            while (true) {
                                if (i78 >= this.u + i72) {
                                    i4 = i60;
                                    break;
                                }
                                byte[] bArr3 = this.l;
                                i4 = i60;
                                if (i78 >= bArr3.length || i78 >= i73) {
                                    break;
                                }
                                int i84 = this.f1782a[bArr3[i78] & UByte.MAX_VALUE];
                                if (i84 != 0) {
                                    i7 = i62;
                                    i82 += (i84 >> 24) & 255;
                                    i81 += (i84 >> 16) & 255;
                                    i80 += (i84 >> 8) & 255;
                                    i79 += i84 & 255;
                                    i83++;
                                } else {
                                    i7 = i62;
                                }
                                i78++;
                                i60 = i4;
                                i62 = i7;
                            }
                            i5 = i62;
                            int i85 = i77 + i72;
                            for (int i86 = i85; i86 < this.u + i85; i86++) {
                                byte[] bArr4 = this.l;
                                if (i86 >= bArr4.length || i86 >= i73) {
                                    break;
                                }
                                int i87 = this.f1782a[bArr4[i86] & UByte.MAX_VALUE];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & 255;
                                    i81 += (i87 >> 16) & 255;
                                    i80 += (i87 >> 8) & 255;
                                    i79 += i87 & 255;
                                    i83++;
                                }
                            }
                            i6 = i83 == 0 ? 0 : ((i82 / i83) << 24) | ((i81 / i83) << 16) | ((i80 / i83) << 8) | (i79 / i83);
                        }
                        if (i6 != 0) {
                            iArr3[i74] = i6;
                        } else if (!this.x && z) {
                            this.x = true;
                        }
                        i72 += this.u;
                        i74++;
                        i57 = i75;
                        i58 = i76;
                        i59 = i3;
                        i60 = i4;
                        i62 = i5;
                    }
                }
                i63++;
                i61 = i2;
                i57 = i57;
                i58 = i58;
                i59 = i59;
                i60 = i60;
                i62 = i62;
            }
            if (this.s && ((i = e8Var.g) == 0 || i == 1)) {
                if (this.r == null) {
                    this.r = b();
                }
                Bitmap bitmap2 = this.r;
                int i88 = this.w;
                bitmap2.setPixels(iArr3, 0, i88, 0, 0, i88, this.v);
            }
            Bitmap bitmapB = b();
            int i89 = this.w;
            bitmapB.setPixels(iArr3, 0, i89, 0, 0, i89, this.v);
            return bitmapB;
        }
        Integer.valueOf(i12);
        return null;
    }

    public final int d() {
        try {
            e();
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            return bArr[i] & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.t = 1;
            return 0;
        }
    }

    public final void e() {
        if (this.f > this.g) {
            return;
        }
        if (this.e == null) {
            this.e = ((i8) this.q).a(16384);
        }
        this.g = 0;
        int iMin = Math.min(this.c.remaining(), 16384);
        this.f = iMin;
        this.c.get(this.e, 0, iMin);
    }

    public boolean a(int i) {
        if (i < -1 || i >= this.p.c) {
            return false;
        }
        this.n = i;
        return true;
    }

    public synchronized void a(f8 f8Var, byte[] bArr) {
        a(f8Var, ByteBuffer.wrap(bArr));
    }

    public synchronized void a(f8 f8Var, ByteBuffer byteBuffer) {
        a(f8Var, byteBuffer, 1);
    }

    public synchronized void a(f8 f8Var, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int iHighestOneBit = Integer.highestOneBit(i);
            this.t = 0;
            this.p = f8Var;
            this.x = false;
            this.n = -1;
            this.o = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.c = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.c.order(ByteOrder.LITTLE_ENDIAN);
            this.s = false;
            Iterator<e8> it = f8Var.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().g == 3) {
                    this.s = true;
                    break;
                }
            }
            this.u = iHighestOneBit;
            int i2 = f8Var.f;
            this.w = i2 / iHighestOneBit;
            int i3 = f8Var.g;
            this.v = i3 / iHighestOneBit;
            this.l = ((i8) this.q).a(i2 * i3);
            this.m = ((i8) this.q).b(this.w * this.v);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public synchronized int a(byte[] bArr) {
        if (this.h == null) {
            this.h = new g8();
        }
        f8 f8VarB = this.h.a(bArr).b();
        this.p = f8VarB;
        if (bArr != null) {
            a(f8VarB, bArr);
        }
        return this.t;
    }

    public final void a(int[] iArr, e8 e8Var, int i) {
        int i2 = e8Var.d;
        int i3 = this.u;
        int i4 = i2 / i3;
        int i5 = e8Var.b / i3;
        int i6 = e8Var.c / i3;
        int i7 = e8Var.f1794a / i3;
        int i8 = this.w;
        int i9 = (i5 * i8) + i7;
        int i10 = (i4 * i8) + i9;
        while (i9 < i10) {
            int i11 = i9 + i6;
            for (int i12 = i9; i12 < i11; i12++) {
                iArr[i12] = i;
            }
            i9 += this.w;
        }
    }
}
