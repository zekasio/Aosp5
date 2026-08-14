package com.applovin.exoplayer2.m.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f643a;
    private final float[] b;
    private final float[] c;
    private final float[] d;
    private final Display e;
    private final a[] f;
    private boolean g;

    public interface a {
        void a(float[] fArr, float f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f643a, sensorEvent.values);
        a(this.f643a, this.e.getRotation());
        float fB = b(this.f643a);
        c(this.f643a);
        a(this.f643a);
        a(this.f643a, fB);
    }

    private void a(float[] fArr, float f) {
        for (a aVar : this.f) {
            aVar.a(fArr, f);
        }
    }

    private void a(float[] fArr) {
        if (!this.g) {
            c.a(this.c, fArr);
            this.g = true;
        }
        float[] fArr2 = this.b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.b, 0, this.c, 0);
    }

    private float b(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.d);
        return this.d[2];
    }

    private void a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i2 = 2;
                i3 = 129;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.b, i2, i3, fArr);
        }
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }
}
