package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class h extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f817a;
    private PointF b;

    public h(Context context) {
        super(context);
        this.b = new PointF();
        if (f817a == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f817a = true;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.y.i("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f817a = false;
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.b = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        if (f817a.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public PointF getLastClickLocation() {
        return this.b;
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.b;
        this.b = new PointF();
        return pointF;
    }
}
