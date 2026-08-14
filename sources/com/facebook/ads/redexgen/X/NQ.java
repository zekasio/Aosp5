package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NQ extends RelativeLayout implements Q7 {

    @Nullable
    public QK A00;

    public NQ(C0947Xy c0947Xy) {
        super(c0947Xy);
    }

    public NQ(C0947Xy c0947Xy, AttributeSet attributeSet, int i) {
        super(c0947Xy, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A8o(QK qk) {
        this.A00 = qk;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void AFG(QK qk) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public QK getVideoView() {
        return this.A00;
    }
}
