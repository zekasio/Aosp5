package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0705Om implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0809Sm A00;

    public C0705Om(C0809Sm c0809Sm) {
        this.A00 = c0809Sm;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A06.getLayoutParams().height = num.intValue();
        this.A00.A06.requestLayout();
    }
}
