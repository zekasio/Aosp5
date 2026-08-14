package com.google.ads.mediation.vungle;

import com.vungle.mediation.VungleBannerAdapter;
import com.vungle.mediation.VungleManager;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class VunglePlayAdCallback implements PlayAdCallback {
    private final WeakReference<VungleBannerAdapter> adapterReference;
    private final WeakReference<PlayAdCallback> callbackReference;
    private final VungleBannerAd vungleBannerAd;

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
    }

    public VunglePlayAdCallback(PlayAdCallback playAdCallback, VungleBannerAdapter vungleBannerAdapter, VungleBannerAd vungleBannerAd) {
        this.callbackReference = new WeakReference<>(playAdCallback);
        this.adapterReference = new WeakReference<>(vungleBannerAdapter);
        this.vungleBannerAd = vungleBannerAd;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onAdStart(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onAdEnd(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onAdClick(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onAdRewarded(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onAdLeftApplication(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        VungleManager.getInstance().removeActiveBannerAd(str, this.vungleBannerAd);
        PlayAdCallback playAdCallback = this.callbackReference.get();
        VungleBannerAdapter vungleBannerAdapter = this.adapterReference.get();
        if (playAdCallback == null || vungleBannerAdapter == null || !vungleBannerAdapter.isRequestPending()) {
            return;
        }
        playAdCallback.onError(str, vungleException);
    }
}
