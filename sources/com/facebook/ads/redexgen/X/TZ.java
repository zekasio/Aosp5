package com.facebook.ads.redexgen.X;

import android.R;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TZ extends L8 {
    public final /* synthetic */ AnimationAnimationListenerC0664Mx A00;

    public TZ(AnimationAnimationListenerC0664Mx animationAnimationListenerC0664Mx) {
        this.A00 = animationAnimationListenerC0664Mx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0H().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
