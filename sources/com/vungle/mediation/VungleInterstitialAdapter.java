package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.mediation.AdapterParametersParser;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes2.dex */
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private AdConfig mAdConfig;
    private MediationBannerListener mMediationBannerListener;
    private MediationInterstitialListener mMediationInterstitialListener;
    private String mPlacement;
    private VungleManager mVungleManager;
    private VungleBannerAdapter vungleBannerAdapter;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String string = bundle.getString(VungleMediationAdapter.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            if (mediationInterstitialListener != null) {
                AdError adError = new AdError(101, "Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                mediationInterstitialListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        this.mMediationInterstitialListener = mediationInterstitialListener;
        VungleManager vungleManager = VungleManager.getInstance();
        this.mVungleManager = vungleManager;
        String strFindPlacement = vungleManager.findPlacement(bundle2, bundle);
        this.mPlacement = strFindPlacement;
        if (TextUtils.isEmpty(strFindPlacement)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.mMediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
            AdapterParametersParser.Config config = AdapterParametersParser.parse(string, bundle2);
            this.mAdConfig = VungleExtrasBuilder.adConfigWithNetworkExtras(bundle2, false);
            VungleInitializer.getInstance().initialize(config.getAppId(), context.getApplicationContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.vungle.mediation.VungleInterstitialAdapter.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    VungleInterstitialAdapter.this.loadAd();
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError3) {
                    if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                        VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError3);
                        Log.w(VungleMediationAdapter.TAG, adError3.toString());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd() {
        if (Vungle.canPlayAd(this.mPlacement)) {
            MediationInterstitialListener mediationInterstitialListener = this.mMediationInterstitialListener;
            if (mediationInterstitialListener != null) {
                mediationInterstitialListener.onAdLoaded(this);
                return;
            }
            return;
        }
        Vungle.loadAd(this.mPlacement, new LoadAdCallback() { // from class: com.vungle.mediation.VungleInterstitialAdapter.2
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str) {
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
                }
            }

            @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
            public void onError(String str, VungleException vungleException) {
                AdError adError = VungleMediationAdapter.getAdError(vungleException);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        Vungle.playAd(this.mPlacement, this.mAdConfig, new PlayAdCallback() { // from class: com.vungle.mediation.VungleInterstitialAdapter.3
            @Override // com.vungle.warren.PlayAdCallback
            public void creativeId(String str) {
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdEnd(String str, boolean z, boolean z2) {
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdRewarded(String str) {
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdViewed(String str) {
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdStart(String str) {
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdEnd(String str) {
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdClick(String str) {
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdLeftApplication(String str) {
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onError(String str, VungleException vungleException) {
                Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleException).toString());
                if (VungleInterstitialAdapter.this.mMediationInterstitialListener != null) {
                    VungleInterstitialAdapter.this.mMediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        VungleBannerAdapter vungleBannerAdapter = this.vungleBannerAdapter;
        if (vungleBannerAdapter != null) {
            vungleBannerAdapter.destroy();
            this.vungleBannerAdapter = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        Log.d(VungleMediationAdapter.TAG, "onPause");
        VungleBannerAdapter vungleBannerAdapter = this.vungleBannerAdapter;
        if (vungleBannerAdapter != null) {
            vungleBannerAdapter.updateVisibility(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        Log.d(VungleMediationAdapter.TAG, "onResume");
        VungleBannerAdapter vungleBannerAdapter = this.vungleBannerAdapter;
        if (vungleBannerAdapter != null) {
            vungleBannerAdapter.updateVisibility(true);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mMediationBannerListener = mediationBannerListener;
        String string = bundle.getString(VungleMediationAdapter.KEY_APP_ID);
        AdapterParametersParser.Config config = AdapterParametersParser.parse(string, bundle2);
        if (TextUtils.isEmpty(string)) {
            if (mediationBannerListener != null) {
                AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or invalid app ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                mediationBannerListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
        VungleManager vungleManager = VungleManager.getInstance();
        this.mVungleManager = vungleManager;
        String strFindPlacement = vungleManager.findPlacement(bundle2, bundle);
        Log.d(VungleMediationAdapter.TAG, "requestBannerAd for Placement: " + strFindPlacement + " ### Adapter instance: " + hashCode());
        if (TextUtils.isEmpty(strFindPlacement)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.mMediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        AdConfig adConfigAdConfigWithNetworkExtras = VungleExtrasBuilder.adConfigWithNetworkExtras(bundle2, true);
        if (!this.mVungleManager.hasBannerSizeAd(context, adSize, adConfigAdConfigWithNetworkExtras)) {
            AdError adError3 = new AdError(102, "Failed to load ad from Vungle. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError3.toString());
            this.mMediationBannerListener.onAdFailedToLoad(this, adError3);
            return;
        }
        String requestUniqueId = config.getRequestUniqueId();
        if (!this.mVungleManager.canRequestBannerAd(strFindPlacement, requestUniqueId)) {
            AdError adError4 = new AdError(104, "Vungle adapter does not support multiple banner instances for same placement.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError4.toString());
            this.mMediationBannerListener.onAdFailedToLoad(this, adError4);
            return;
        }
        this.vungleBannerAdapter = new VungleBannerAdapter(strFindPlacement, requestUniqueId, adConfigAdConfigWithNetworkExtras, this);
        Log.d(VungleMediationAdapter.TAG, "New banner adapter: " + this.vungleBannerAdapter + "; size: " + adConfigAdConfigWithNetworkExtras.getAdSize());
        this.mVungleManager.registerBannerAd(strFindPlacement, new VungleBannerAd(strFindPlacement, this.vungleBannerAdapter));
        Log.d(VungleMediationAdapter.TAG, "Requesting banner with ad size: " + adConfigAdConfigWithNetworkExtras.getAdSize());
        this.vungleBannerAdapter.requestBannerAd(context, config.getAppId(), adSize, this.mMediationBannerListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.vungleBannerAdapter.getAdLayout();
    }
}
