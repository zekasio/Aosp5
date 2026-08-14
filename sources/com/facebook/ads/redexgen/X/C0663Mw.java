package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0663Mw extends AdNativeComponentView {
    public static final int A01 = (int) (Lr.A00 * 1.0f);
    public final ImageView A00;

    public C0663Mw(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A00 = new N8(c0947Xy);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0637Lw.A04(this.A00, EnumC0637Lw.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        MS.A0M(this.A00, -2130706433);
        int i = A01;
        setPadding(i, i, i, i);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
