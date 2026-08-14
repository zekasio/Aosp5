package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0743Py implements View.OnTouchListener {
    public final /* synthetic */ QK A00;

    public ViewOnTouchListenerC0743Py(QK qk) {
        this.A00 = qk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0B.A02(new C0607Kp(view, motionEvent));
        return false;
    }
}
