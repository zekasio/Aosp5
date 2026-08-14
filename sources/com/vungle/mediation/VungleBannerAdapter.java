package com.vungle.mediation;

import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.VunglePlayAdCallback;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.vungle.warren.AdConfig;
import com.vungle.warren.BannerAdConfig;
import com.vungle.warren.Banners;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes2.dex */
public class VungleBannerAdapter implements PlayAdCallback {
    private RelativeLayout adLayout;
    private final AdConfig mAdConfig;
    private MediationBannerAdapter mediationAdapter;
    private MediationBannerListener mediationListener;
    private final String placementId;
    private final String uniqueRequestId;
    private VungleBannerAd vungleBannerAd;
    private boolean mPendingRequestBanner = false;
    private boolean mVisibility = true;
    private final LoadAdCallback mAdLoadCallback = new LoadAdCallback() { // from class: com.vungle.mediation.VungleBannerAdapter.3
        @Override // com.vungle.warren.LoadAdCallback
        public void onAdLoad(String str) {
            VungleBannerAdapter.this.createBanner();
        }

        @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            VungleBannerAdapter.this.mVungleManager.removeActiveBannerAd(VungleBannerAdapter.this.placementId, VungleBannerAdapter.this.vungleBannerAd);
            if (VungleBannerAdapter.this.mPendingRequestBanner) {
                if (VungleBannerAdapter.this.mediationAdapter == null || VungleBannerAdapter.this.mediationListener == null) {
                    return;
                }
                AdError adError = VungleMediationAdapter.getAdError(vungleException);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                VungleBannerAdapter.this.mediationListener.onAdFailedToLoad(VungleBannerAdapter.this.mediationAdapter, adError);
                return;
            }
            Log.w(VungleMediationAdapter.TAG, "No banner request fired.");
        }
    };
    private final VungleManager mVungleManager = VungleManager.getInstance();

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
    }

    VungleBannerAdapter(String str, String str2, AdConfig adConfig, MediationBannerAdapter mediationBannerAdapter) {
        this.placementId = str;
        this.uniqueRequestId = str2;
        this.mAdConfig = adConfig;
        this.mediationAdapter = mediationBannerAdapter;
    }

    public String getUniqueRequestId() {
        return this.uniqueRequestId;
    }

    public RelativeLayout getAdLayout() {
        return this.adLayout;
    }

    public boolean isRequestPending() {
        return this.mPendingRequestBanner;
    }

    void requestBannerAd(Context context, String str, AdSize adSize, MediationBannerListener mediationBannerListener) {
        this.mediationListener = mediationBannerListener;
        requestBannerAd(context, str, adSize);
    }

    private void requestBannerAd(Context context, String str, AdSize adSize) {
        this.adLayout = new RelativeLayout(context) { // from class: com.vungle.mediation.VungleBannerAdapter.1
            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                VungleBannerAdapter.this.attach();
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                VungleBannerAdapter.this.detach();
            }
        };
        int heightInPixels = adSize.getHeightInPixels(context);
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(this.mAdConfig.getAdSize().getHeight() * context.getResources().getDisplayMetrics().density);
        }
        this.adLayout.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        Log.d(VungleMediationAdapter.TAG, "requestBannerAd: " + this);
        this.mPendingRequestBanner = true;
        VungleInitializer.getInstance().initialize(str, context.getApplicationContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleBannerAdapter.2
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                VungleBannerAdapter.this.loadBanner();
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError) {
                VungleBannerAdapter.this.mVungleManager.removeActiveBannerAd(VungleBannerAdapter.this.placementId, VungleBannerAdapter.this.vungleBannerAd);
                if (!VungleBannerAdapter.this.mPendingRequestBanner || VungleBannerAdapter.this.mediationAdapter == null || VungleBannerAdapter.this.mediationListener == null) {
                    return;
                }
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                VungleBannerAdapter.this.mediationListener.onAdFailedToLoad(VungleBannerAdapter.this.mediationAdapter, adError);
            }
        });
    }

    void destroy() {
        Log.d(VungleMediationAdapter.TAG, "Vungle banner adapter destroy:" + this);
        this.mVisibility = false;
        this.mVungleManager.removeActiveBannerAd(this.placementId, this.vungleBannerAd);
        VungleBannerAd vungleBannerAd = this.vungleBannerAd;
        if (vungleBannerAd != null) {
            vungleBannerAd.detach();
            this.vungleBannerAd.destroyAd();
        }
        this.vungleBannerAd = null;
        this.mPendingRequestBanner = false;
    }

    void preCache() {
        Banners.loadBanner(this.placementId, new BannerAdConfig(this.mAdConfig), (LoadAdCallback) null);
    }

    void updateVisibility(boolean z) {
        VungleBannerAd vungleBannerAd = this.vungleBannerAd;
        if (vungleBannerAd == null) {
            return;
        }
        this.mVisibility = z;
        if (vungleBannerAd.getVungleBanner() != null) {
            this.vungleBannerAd.getVungleBanner().setAdVisibility(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadBanner() {
        Log.d(VungleMediationAdapter.TAG, "loadBanner: " + this);
        Banners.loadBanner(this.placementId, new BannerAdConfig(this.mAdConfig), this.mAdLoadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createBanner() {
        MediationBannerListener mediationBannerListener;
        MediationBannerListener mediationBannerListener2;
        MediationBannerListener mediationBannerListener3;
        Log.d(VungleMediationAdapter.TAG, "create banner: " + this);
        if (this.mPendingRequestBanner) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            layoutParams.addRule(15, -1);
            VungleBannerAd vungleBannerAd = this.mVungleManager.getVungleBannerAd(this.placementId);
            this.vungleBannerAd = vungleBannerAd;
            VunglePlayAdCallback vunglePlayAdCallback = new VunglePlayAdCallback(this, this, vungleBannerAd);
            if (AdConfig.AdSize.isBannerAdSize(this.mAdConfig.getAdSize())) {
                VungleBanner banner = Banners.getBanner(this.placementId, new BannerAdConfig(this.mAdConfig), vunglePlayAdCallback);
                if (banner != null) {
                    Log.d(VungleMediationAdapter.TAG, "display banner:" + banner.hashCode() + this);
                    VungleBannerAd vungleBannerAd2 = this.vungleBannerAd;
                    if (vungleBannerAd2 != null) {
                        vungleBannerAd2.setVungleBanner(banner);
                    }
                    updateVisibility(this.mVisibility);
                    banner.setLayoutParams(layoutParams);
                    MediationBannerAdapter mediationBannerAdapter = this.mediationAdapter;
                    if (mediationBannerAdapter == null || (mediationBannerListener3 = this.mediationListener) == null) {
                        return;
                    }
                    mediationBannerListener3.onAdLoaded(mediationBannerAdapter);
                    return;
                }
                AdError adError = new AdError(106, "Vungle SDK returned a successful load callback, but Banners.getBanner() or Vungle.getNativeAd() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.d(VungleMediationAdapter.TAG, adError.toString());
                MediationBannerAdapter mediationBannerAdapter2 = this.mediationAdapter;
                if (mediationBannerAdapter2 == null || (mediationBannerListener2 = this.mediationListener) == null) {
                    return;
                }
                mediationBannerListener2.onAdFailedToLoad(mediationBannerAdapter2, adError);
                return;
            }
            AdError adError2 = new AdError(106, "Vungle SDK returned a successful load callback, but Banners.getBanner() or Vungle.getNativeAd() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            MediationBannerAdapter mediationBannerAdapter3 = this.mediationAdapter;
            if (mediationBannerAdapter3 == null || (mediationBannerListener = this.mediationListener) == null) {
                return;
            }
            mediationBannerListener.onAdFailedToLoad(mediationBannerAdapter3, adError2);
        }
    }

    public String toString() {
        return " [placementId=" + this.placementId + " # uniqueRequestId=" + this.uniqueRequestId + " # hashcode=" + hashCode() + "] ";
    }

    void attach() {
        VungleBannerAd vungleBannerAd = this.vungleBannerAd;
        if (vungleBannerAd != null) {
            vungleBannerAd.attach();
        }
    }

    void detach() {
        VungleBannerAd vungleBannerAd = this.vungleBannerAd;
        if (vungleBannerAd != null) {
            vungleBannerAd.detach();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        preCache();
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.mediationAdapter;
        if (mediationBannerAdapter == null || (mediationBannerListener = this.mediationListener) == null) {
            return;
        }
        mediationBannerListener.onAdClicked(mediationBannerAdapter);
        this.mediationListener.onAdOpened(this.mediationAdapter);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
        MediationBannerListener mediationBannerListener;
        MediationBannerAdapter mediationBannerAdapter = this.mediationAdapter;
        if (mediationBannerAdapter == null || (mediationBannerListener = this.mediationListener) == null) {
            return;
        }
        mediationBannerListener.onAdLeftApplication(mediationBannerAdapter);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        MediationBannerListener mediationBannerListener;
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationBannerAdapter mediationBannerAdapter = this.mediationAdapter;
        if (mediationBannerAdapter == null || (mediationBannerListener = this.mediationListener) == null) {
            return;
        }
        mediationBannerListener.onAdFailedToLoad(mediationBannerAdapter, adError);
    }
}
