package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.i;

/* JADX INFO: loaded from: classes.dex */
public final class y extends i {
    private static final Paint c = new Paint(1);
    private static final Paint d = new Paint(1);
    private static final Paint e = new Paint(1);

    public y(Context context) {
        super(context);
        c.setColor(-1);
        d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCrossOffset() {
        return this.f818a * 10.0f;
    }

    protected float getStrokeWidth() {
        return this.f818a * 3.0f;
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f818a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
