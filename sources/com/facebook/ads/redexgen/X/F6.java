package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F6 extends C1101bc {
    public InterfaceC0740Pv A00;

    public final void A04(C0947Xy c0947Xy, NativeBannerAd nativeBannerAd, K7 k7, NativeAdLayout nativeAdLayout) {
        MediaView adIconView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        k7.A09(adOptionsView, 20);
        this.A00 = new C0788Rr(c0947Xy, nativeBannerAd, k7, UB.A0L(nativeBannerAd.getInternalNativeAd()).A17(), adIconView, adOptionsView);
        MS.A0M(nativeAdLayout, k7.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, adIconView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
