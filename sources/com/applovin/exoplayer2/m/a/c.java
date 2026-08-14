package com.applovin.exoplayer2.m.a;

import android.opengl.Matrix;
import com.applovin.exoplayer2.l.af;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af<float[]> f642a;
    private boolean b;

    public void a(long j, float[] fArr) {
        this.f642a.a(j, fArr);
    }

    public void a() {
        this.f642a.a();
        this.b = false;
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }
}
