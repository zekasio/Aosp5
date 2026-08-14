package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QU implements Animator.AnimatorListener {
    public final /* synthetic */ C0548Ig A00;

    public QU(C0548Ig c0548Ig) {
        this.A00 = c0548Ig;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = QS.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
