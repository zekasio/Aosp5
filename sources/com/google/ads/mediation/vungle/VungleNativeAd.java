package com.google.ads.mediation.vungle;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.vungle.warren.AdConfig;
import com.vungle.warren.NativeAd;
import com.vungle.warren.NativeAdLayout;
import com.vungle.warren.NativeAdListener;
import com.vungle.warren.ui.view.MediaView;

/* JADX INFO: loaded from: classes.dex */
public class VungleNativeAd {
    private final MediaView mediaView;
    private final NativeAd nativeAd;
    private final NativeAdLayout nativeAdLayout;
    private final String placementId;

    public VungleNativeAd(Context context, String str, boolean z) {
        this.placementId = str;
        this.nativeAd = new NativeAd(context, str);
        NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
        this.nativeAdLayout = nativeAdLayout;
        nativeAdLayout.disableLifeCycleManagement(z);
        this.mediaView = new MediaView(context);
    }

    public void loadNativeAd(AdConfig adConfig, String str, NativeAdListener nativeAdListener) {
        this.nativeAd.loadAd(adConfig, str, nativeAdListener);
    }

    public NativeAd getNativeAd() {
        return this.nativeAd;
    }

    public NativeAdLayout getNativeAdLayout() {
        return this.nativeAdLayout;
    }

    public MediaView getMediaView() {
        return this.mediaView;
    }

    public void destroyAd() {
        NativeAdLayout nativeAdLayout = this.nativeAdLayout;
        if (nativeAdLayout != null) {
            nativeAdLayout.removeAllViews();
            if (this.nativeAdLayout.getParent() != null) {
                ((ViewGroup) this.nativeAdLayout.getParent()).removeView(this.nativeAdLayout);
            }
        }
        MediaView mediaView = this.mediaView;
        if (mediaView != null) {
            mediaView.removeAllViews();
            if (this.mediaView.getParent() != null) {
                ((ViewGroup) this.mediaView.getParent()).removeView(this.mediaView);
            }
        }
        if (this.nativeAd != null) {
            Log.d(VungleMediationAdapter.TAG, "Vungle native adapter cleanUp: destroyAd # " + this.nativeAd.hashCode());
            this.nativeAd.unregisterView();
            this.nativeAd.destroy();
        }
    }

    public String toString() {
        return " [placementId=" + this.placementId + " # nativeAdLayout=" + this.nativeAdLayout + " # mediaView=" + this.mediaView + " # nativeAd=" + this.nativeAd + " # hashcode=" + hashCode() + "] ";
    }
}
