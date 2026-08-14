package com.tapjoy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class TJWebView extends WebView {

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a(TJWebView tJWebView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    public TJWebView(Context context) {
        super(context);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        new GestureDetector(new a(this));
        if (getSettings() != null) {
            getSettings().setJavaScriptEnabled(true);
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        super.destroy();
    }

    public TJWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
