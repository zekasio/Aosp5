package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0452Em extends C1101bc {
    public InterfaceC0740Pv A00;

    public final void A04(NativeAdLayout nativeAdLayout, C0947Xy c0947Xy, NativeAd nativeAd, K7 k7) {
        OW ow = new OW(c0947Xy);
        MediaView mediaView = new MediaView(c0947Xy);
        AdOptionsView adOptionsView = new AdOptionsView(c0947Xy, nativeAd, nativeAdLayout);
        k7.A09(adOptionsView, 28);
        this.A00 = new C0787Rq(c0947Xy, nativeAd, k7, UB.A0L(nativeAd.getInternalNativeAd()).A17(), ow, mediaView, adOptionsView);
        MS.A0M(nativeAdLayout, k7.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ow, this.A00.getViewsForInteraction());
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
