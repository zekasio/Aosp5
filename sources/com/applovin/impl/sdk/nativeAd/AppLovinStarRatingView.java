package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinStarRatingView extends View {
    private static final int DEFAULT_PADDING_DP = 2;
    private static final float DEFAULT_STROKE_WIDTH = 0.5f;
    private static final int DEFAULT_TOTAL_NUMBER_OF_STARS = 5;
    private static final float INTERNAL_ANGLE_OF_PENTAGON_RADIANS = 1.8849556f;
    private static final float SUM_OF_CENTRAL_ANGLES_IN_CIRCLE_RADIANS = 6.2831855f;
    private static final float TWELVE_OCLOCK_POSITION_RADIANS = 4.712389f;
    private static final Paint emptyStarPaint = new Paint(1);
    private static final Paint filledStarPaint = new Paint(1);
    private final float interStarsSpacingDp;
    private final float paddingDp;
    private float sideLength;
    private final Double starRating;

    public AppLovinStarRatingView(Double d, Context context) {
        super(context);
        this.starRating = d;
        this.paddingDp = AppLovinSdkUtils.dpToPx(context, 2);
        this.interStarsSpacingDp = AppLovinSdkUtils.dpToPx(context, 2);
        setupPaints();
    }

    private void setupPaints() {
        Paint paint = emptyStarPaint;
        paint.setColor(g.a(R.color.applovin_sdk_starColor, getContext()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
        Paint paint2 = filledStarPaint;
        paint2.setColor(g.a(R.color.applovin_sdk_starColor, getContext()));
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.starRating == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        double d = width;
        double totalHorizontalSpacing = getTotalHorizontalSpacing();
        Double.isNaN(d);
        float fMin = (float) Math.min((d - totalHorizontalSpacing) / 5.0d, height - (this.paddingDp * 2.0f));
        this.sideLength = fMin;
        if (fMin <= 0.0f) {
            return;
        }
        Path combinedPathForAllStarsWithSide = getCombinedPathForAllStarsWithSide(fMin);
        drawEmptyStars(canvas, combinedPathForAllStarsWithSide);
        drawFilledStars(canvas, combinedPathForAllStarsWithSide);
    }

    private void drawEmptyStars(Canvas canvas, Path path) {
        canvas.drawPath(path, emptyStarPaint);
    }

    private void drawFilledStars(Canvas canvas, Path path) {
        if (this.starRating.doubleValue() == 0.0d) {
            return;
        }
        float fRoundUpToNearestHalfInt = (float) roundUpToNearestHalfInt(this.starRating.doubleValue());
        double d = this.paddingDp;
        double dCeil = Math.ceil(fRoundUpToNearestHalfInt - 1.0f);
        double d2 = this.interStarsSpacingDp;
        Double.isNaN(d2);
        Double.isNaN(d);
        canvas.clipPath(path);
        canvas.drawRect(new RectF(0.0f, 0.0f, ((float) (d + (dCeil * d2))) + ((fRoundUpToNearestHalfInt / 5.0f) * 5.0f * this.sideLength), getHeight()), filledStarPaint);
    }

    private Path getCombinedPathForAllStarsWithSide(float f) {
        PointF pointF = new PointF(0.0f, this.paddingDp);
        float f2 = pointF.x + this.paddingDp;
        Path path = new Path();
        for (int i = 0; i < 5; i++) {
            Path starPath = getStarPath(new RectF(f2, pointF.y, f2 + f, pointF.y + f));
            f2 += this.interStarsSpacingDp + f;
            path.addPath(starPath);
        }
        return path;
    }

    private Path getStarPath(RectF rectF) {
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        double dWidth = rectF.width();
        Double.isNaN(dWidth);
        List<PointF> starPointsOnACircle = getStarPointsOnACircle(pointF, (float) (dWidth * 0.5d), TWELVE_OCLOCK_POSITION_RADIANS);
        PointF pointF2 = starPointsOnACircle.get(0);
        PointF midpointBetweenPoints = getMidpointBetweenPoints(pointF2, starPointsOnACircle.get(1));
        double distanceBetweenPoints = getDistanceBetweenPoints(pointF2, midpointBetweenPoints);
        double dTan = Math.tan(0.9424778f);
        Double.isNaN(distanceBetweenPoints);
        List<PointF> starPointsOnACircle2 = getStarPointsOnACircle(pointF, getDistanceBetweenPoints(pointF, midpointBetweenPoints) - ((float) (distanceBetweenPoints / dTan)), 5.340708f);
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        for (int i = 0; i < 5; i++) {
            PointF pointF3 = starPointsOnACircle.get(i);
            PointF pointF4 = starPointsOnACircle2.get(i);
            path.lineTo(pointF3.x, pointF3.y);
            path.lineTo(pointF4.x, pointF4.y);
        }
        path.close();
        return path;
    }

    private List<PointF> getStarPointsOnACircle(PointF pointF, float f, float f2) {
        float f3 = SUM_OF_CENTRAL_ANGLES_IN_CIRCLE_RADIANS / 5;
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            double d = pointF.x;
            double d2 = f;
            double d3 = f2;
            double dCos = Math.cos(d3);
            Double.isNaN(d2);
            Double.isNaN(d);
            float f4 = (float) (d + (dCos * d2));
            double d4 = pointF.y;
            double dSin = Math.sin(d3);
            Double.isNaN(d2);
            Double.isNaN(d4);
            arrayList.add(new PointF(f4, (float) (d4 + (d2 * dSin))));
            f2 += f3;
        }
        return arrayList;
    }

    private double getTotalHorizontalSpacing() {
        return (this.paddingDp * 2.0f) + (this.interStarsSpacingDp * 4.0f);
    }

    private double roundUpToNearestHalfInt(double d) {
        return Math.ceil(d * 2.0d) / 2.0d;
    }

    private static PointF getMidpointBetweenPoints(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        double d = pointF.x;
        double d2 = f;
        Double.isNaN(d2);
        Double.isNaN(d);
        float f3 = (float) (d + (d2 * 0.5d));
        double d3 = pointF.y;
        double d4 = f2;
        Double.isNaN(d4);
        Double.isNaN(d3);
        return new PointF(f3, (float) (d3 + (d4 * 0.5d)));
    }

    private static float getDistanceBetweenPoints(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }
}
