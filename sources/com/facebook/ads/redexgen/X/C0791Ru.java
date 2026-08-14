package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0791Ru extends OX {
    public final ImageView A00;
    public final C0947Xy A01;

    public C0791Ru(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A01 = c0947Xy;
        this.A00 = new ImageView(c0947Xy);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        T3 t3 = new T3(this.A00, this.A01);
        t3.A04();
        t3.A07(str);
    }
}
