package com.applovin.exoplayer2.m.a;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f644a;
    public final a b;
    public final int c;
    public final boolean d;

    public static e a(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static e a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8 = i;
        int i9 = i2;
        com.applovin.exoplayer2.l.a.a(f > 0.0f);
        com.applovin.exoplayer2.l.a.a(i8 >= 1);
        com.applovin.exoplayer2.l.a.a(i9 >= 1);
        com.applovin.exoplayer2.l.a.a(f2 > 0.0f && f2 <= 180.0f);
        com.applovin.exoplayer2.l.a.a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i8;
        float f6 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f7 = radians / 2.0f;
            float f8 = (i12 * f5) - f7;
            int i15 = i12 + 1;
            float f9 = (i15 * f5) - f7;
            int i16 = 0;
            while (i16 < i10) {
                float f10 = f8;
                int i17 = i15;
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == 0) {
                        f4 = f10;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f9;
                    }
                    float f11 = i16 * f6;
                    float f12 = f6;
                    int i19 = i16;
                    double d = f;
                    float f13 = f5;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    double dSin = Math.sin(d2);
                    Double.isNaN(d);
                    int i20 = i18;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f14 = f9;
                    fArr2[i13] = -((float) (dSin * d * Math.cos(d3)));
                    double dSin2 = Math.sin(d3);
                    Double.isNaN(d);
                    float f15 = radians;
                    float f16 = radians2;
                    fArr2[i13 + 1] = (float) (d * dSin2);
                    int i21 = i13 + 3;
                    double dCos = Math.cos(d2);
                    Double.isNaN(d);
                    fArr2[i13 + 2] = (float) (d * dCos * Math.cos(d3));
                    fArr4[i14] = f11 / f16;
                    int i22 = i14 + 2;
                    fArr4[i14 + 1] = ((i12 + i20) * f13) / f15;
                    if (i19 == 0 && i20 == 0) {
                        i5 = i2;
                        i6 = i19;
                        i7 = i20;
                    } else {
                        i5 = i2;
                        i6 = i19;
                        i7 = i20;
                        if (i6 != i5 || i7 != 1) {
                            fArr = fArr4;
                            i14 = i22;
                            i13 = i21;
                        }
                        i18 = i7 + 1;
                        i9 = i5;
                        i16 = i6;
                        fArr3 = fArr;
                        radians = f15;
                        i10 = i4;
                        f6 = f12;
                        f5 = f13;
                        radians2 = f16;
                        f9 = f14;
                    }
                    System.arraycopy(fArr2, i13, fArr2, i21, 3);
                    i13 += 6;
                    fArr = fArr4;
                    System.arraycopy(fArr, i14, fArr, i22, 2);
                    i14 += 4;
                    i18 = i7 + 1;
                    i9 = i5;
                    i16 = i6;
                    fArr3 = fArr;
                    radians = f15;
                    i10 = i4;
                    f6 = f12;
                    f5 = f13;
                    radians2 = f16;
                    f9 = f14;
                }
                float f17 = radians2;
                int i23 = i16;
                int i24 = i9;
                int i25 = i23 + 1;
                f8 = f10;
                i15 = i17;
                f5 = f5;
                radians2 = f17;
                f9 = f9;
                i9 = i24;
                i16 = i25;
            }
            i8 = i;
            i12 = i15;
        }
        return new e(new a(new b(0, fArr2, fArr3, 1)), i3);
    }

    public e(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public e(a aVar, a aVar2, int i) {
        this.f644a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f646a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f646a = i;
            com.applovin.exoplayer2.l.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f645a;

        public a(b... bVarArr) {
            this.f645a = bVarArr;
        }

        public int a() {
            return this.f645a.length;
        }

        public b a(int i) {
            return this.f645a[i];
        }
    }
}
