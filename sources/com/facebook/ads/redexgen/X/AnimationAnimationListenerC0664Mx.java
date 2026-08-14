package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC0664Mx implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ TW A01;
    public final /* synthetic */ TW A02;

    public AnimationAnimationListenerC0664Mx(TW tw, TW tw2, AnonymousClass59 anonymousClass59) {
        this.A01 = tw;
        this.A02 = tw2;
        this.A00 = anonymousClass59;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        MS.A0H(this.A02);
        new Handler().postDelayed(new TZ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
