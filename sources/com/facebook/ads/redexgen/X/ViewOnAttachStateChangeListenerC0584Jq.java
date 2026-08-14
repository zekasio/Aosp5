package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0584Jq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0582Jo A00;
    public final /* synthetic */ C0583Jp A01;

    public ViewOnAttachStateChangeListenerC0584Jq(C0583Jp c0583Jp, EnumC0582Jo enumC0582Jo) {
        this.A01 = c0583Jp;
        this.A00 = enumC0582Jo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
