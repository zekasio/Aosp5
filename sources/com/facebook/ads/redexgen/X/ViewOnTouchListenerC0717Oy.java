package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0717Oy implements View.OnTouchListener {
    public final /* synthetic */ A2 A00;

    public ViewOnTouchListenerC0717Oy(A2 a2) {
        this.A00 = a2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0E.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
