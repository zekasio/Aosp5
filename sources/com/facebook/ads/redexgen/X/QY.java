package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QY extends AnimatorListenerAdapter {
    public final /* synthetic */ IY A00;

    public QY(IY iy) {
        this.A00 = iy;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            MS.A0L(this.A00.A03);
        }
        this.A00.A03.setAlpha(1.0f);
        this.A00.A01 = QS.A03;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00.A04) {
            MS.A0H(this.A00.A03);
        }
        this.A00.A01 = QS.A05;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
