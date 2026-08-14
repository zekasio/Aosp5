package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class MaxHybridNativeAdActivity extends b {
    private MaxNativeAdView d;

    protected void a(com.applovin.impl.mediation.a.c cVar, final MaxNativeAd maxNativeAd, p pVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, pVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), this);
        this.d = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        Runnable runnable = new Runnable() { // from class: com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.1
            @Override // java.lang.Runnable
            public void run() {
                if (maxNativeAd.prepareForInteraction(MaxHybridNativeAdActivity.this.d.getClickableViews(), MaxHybridNativeAdActivity.this.d)) {
                    return;
                }
                maxNativeAd.prepareViewForInteraction(MaxHybridNativeAdActivity.this.d);
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(runnable);
        } else {
            pVar.M().a(new z(pVar, runnable), o.a.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(android.R.id.content)).addView(this.d);
        this.b.bringToFront();
    }
}
