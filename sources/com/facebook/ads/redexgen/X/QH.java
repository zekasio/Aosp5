package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vungle.warren.AdLoader;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QH extends AnimatorListenerAdapter {
    public final /* synthetic */ C03007o A00;

    public QH(C03007o c03007o) {
        this.A00 = c03007o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new KU(this), AdLoader.RETRY_DELAY);
    }
}
