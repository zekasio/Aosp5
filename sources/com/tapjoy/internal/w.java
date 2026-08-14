package com.tapjoy.internal;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes2.dex */
public class w extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1933a;
    public final float b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public final float g;
    public float h;
    public float i;
    public Camera j;

    public w(boolean z, float f, float f2, int i, float f3, int i2, float f4) {
        this.f1933a = z;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = f3;
        this.f = i2;
        this.g = f4;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.b;
        float f3 = ((this.c - f2) * f) + f2;
        Matrix matrix = transformation.getMatrix();
        Camera camera = this.j;
        camera.save();
        if (this.f1933a) {
            camera.rotateX(f3);
        } else {
            camera.rotateY(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        float f4 = this.h;
        float f5 = this.i;
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.h = resolveSize(this.d, this.e, i, i3);
        this.i = resolveSize(this.f, this.g, i2, i4);
        this.j = new Camera();
    }
}
