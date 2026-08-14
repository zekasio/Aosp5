package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1954a;
    public final Matrix b;
    public final float[] c;

    public z(Context context) {
        super(context);
        this.f1954a = 0;
        this.b = new Matrix();
        this.c = new float[2];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f1954a
            if (r0 != 0) goto L9
            super.dispatchDraw(r9)
            goto Lb6
        L9:
            r9.save()
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            r2 = 0
            r9.clipRect(r2, r2, r0, r1)
            android.view.ViewParent r2 = r8.getParent()     // Catch: java.lang.Exception -> L51
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.Exception -> L51
            android.view.ViewParent r3 = r2.getParent()     // Catch: java.lang.Exception -> L2d
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Exception -> L2d
            boolean r4 = r3 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L2d
            if (r4 != 0) goto L2c
            boolean r4 = r3 instanceof android.widget.HorizontalScrollView     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L2d
        L2c:
            r2 = r3
        L2d:
            int r3 = r8.getLeft()     // Catch: java.lang.Exception -> L51
            int r4 = r2.getScrollX()     // Catch: java.lang.Exception -> L51
            int r3 = r3 - r4
            int r4 = r8.getTop()     // Catch: java.lang.Exception -> L51
            int r5 = r2.getScrollY()     // Catch: java.lang.Exception -> L51
            int r4 = r4 - r5
            int r5 = 0 - r3
            int r6 = 0 - r4
            int r7 = r2.getWidth()     // Catch: java.lang.Exception -> L51
            int r7 = r7 - r3
            int r2 = r2.getHeight()     // Catch: java.lang.Exception -> L51
            int r2 = r2 - r4
            r9.clipRect(r5, r6, r7, r2)     // Catch: java.lang.Exception -> L51
            goto L52
        L51:
        L52:
            int r2 = r8.f1954a
            int r2 = r2 * 90
            float r2 = (float) r2
            r9.rotate(r2)
            int r2 = r8.f1954a
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == r6) goto L7a
            if (r2 == r4) goto L72
            if (r2 != r3) goto L6c
            int r2 = -r1
            float r2 = (float) r2
            r9.translate(r2, r5)
            goto L7f
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L72:
            int r2 = -r0
            float r2 = (float) r2
            int r7 = -r1
            float r7 = (float) r7
            r9.translate(r2, r7)
            goto L7f
        L7a:
            int r2 = -r0
            float r2 = (float) r2
            r9.translate(r5, r2)
        L7f:
            android.graphics.Matrix r2 = r8.b
            int r7 = r8.f1954a
            int r7 = r7 * (-90)
            float r7 = (float) r7
            r2.setRotate(r7)
            int r2 = r8.f1954a
            if (r2 == r6) goto La9
            if (r2 == r4) goto L9f
            if (r2 != r3) goto L99
            android.graphics.Matrix r0 = r8.b
            int r1 = r1 - r6
            float r1 = (float) r1
            r0.postTranslate(r1, r5)
            goto Lb0
        L99:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L9f:
            android.graphics.Matrix r2 = r8.b
            int r0 = r0 - r6
            float r0 = (float) r0
            int r1 = r1 - r6
            float r1 = (float) r1
            r2.postTranslate(r0, r1)
            goto Lb0
        La9:
            android.graphics.Matrix r1 = r8.b
            int r0 = r0 - r6
            float r0 = (float) r0
            r1.postTranslate(r5, r0)
        Lb0:
            super.dispatchDraw(r9)
            r9.restore()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f1954a == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float[] fArr = this.c;
        fArr[0] = motionEvent.getX();
        fArr[1] = motionEvent.getY();
        this.b.mapPoints(fArr);
        motionEvent.setLocation(fArr[0], fArr[1]);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getRotationCount() {
        return this.f1954a;
    }

    @Override // com.tapjoy.internal.a0, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1954a % 2 == 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setRotationCount(int i) {
        this.f1954a = i & 3;
    }
}
