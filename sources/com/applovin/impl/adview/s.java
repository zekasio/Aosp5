package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.i;

/* JADX INFO: loaded from: classes.dex */
public final class s extends i {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);
    private final float[] e;
    private Path f;

    public s(Context context) {
        super(context);
        this.e = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        c.setARGB(80, 0, 0, 0);
        Paint paint = d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getStrokeWidth() {
        return this.f818a * 2.0f;
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i) {
        setViewScale(i / 30.0f);
        a();
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        Paint paint = d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f, paint);
    }

    private void a() {
        int i = 0;
        while (true) {
            float[] fArr = this.e;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f818a;
                i++;
            } else {
                Path path = new Path();
                this.f = path;
                float[] fArr2 = this.e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f;
                float[] fArr3 = this.e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f;
                float[] fArr4 = this.e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f;
                float[] fArr5 = this.e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f;
                float[] fArr6 = this.e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f;
                float[] fArr7 = this.e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
