package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f724a;
    private final int b;
    private final int c;
    private final ClickRecognitionState d;
    private long e;
    private PointF f;
    private boolean g;
    private final Context h;
    private final OnClickListener i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.p pVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.f724a = ((Long) pVar.a(com.applovin.impl.sdk.c.b.aX)).longValue();
        this.b = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.aY)).intValue();
        this.c = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.bb)).intValue());
        this.d = ClickRecognitionState.values()[((Integer) pVar.a(bVar)).intValue()];
        this.h = context;
        this.i = onClickListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.g && this.d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.g && this.d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
                float fA = a(this.f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.g) {
                    long j = this.f724a;
                    if ((j < 0 || jElapsedRealtime < j) && ((i = this.b) < 0 || fA < i)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.e = SystemClock.elapsedRealtime();
            this.f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.g = false;
        }
        return true;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.g = true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f * f) + (f2 * f2)));
    }

    private float a(float f) {
        return f / this.h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.c <= 0) {
            return true;
        }
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.c;
        return rawX >= ((float) i) && rawY >= ((float) i) && rawX <= ((float) (pointA.x - this.c)) && rawY <= ((float) (pointA.y - this.c));
    }
}
