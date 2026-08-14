package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.mediation.AdapterParametersParser;
import com.vungle.mediation.VungleExtrasBuilder;
import com.vungle.mediation.VungleManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes.dex */
public class VungleRtbInterstitialAd implements MediationInterstitialAd {
    private AdConfig mAdConfig;
    private String mAdMarkup;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mMediationAdLoadCallback;
    private String mPlacement;
    private MediationInterstitialAdCallback mediationInterstitialAdCallback;
    private final MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration;

    public VungleRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.mediationInterstitialAdConfiguration = mediationInterstitialAdConfiguration;
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void render() {
        Bundle mediationExtras = this.mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = this.mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(VungleMediationAdapter.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.mMediationAdLoadCallback.onFailure(adError);
            return;
        }
        String strFindPlacement = VungleManager.getInstance().findPlacement(mediationExtras, serverParameters);
        this.mPlacement = strFindPlacement;
        if (TextUtils.isEmpty(strFindPlacement)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.mMediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.mAdMarkup = this.mediationInterstitialAdConfiguration.getBidResponse();
        Log.d(VungleMediationAdapter.TAG, "Render interstitial mAdMarkup=" + this.mAdMarkup);
        AdapterParametersParser.Config config = AdapterParametersParser.parse(string, mediationExtras);
        this.mAdConfig = VungleExtrasBuilder.adConfigWithNetworkExtras(mediationExtras, false);
        VungleInitializer.getInstance().initialize(config.getAppId(), this.mediationInterstitialAdConfiguration.getContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                VungleRtbInterstitialAd.this.loadAd();
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError3) {
                Log.w(VungleMediationAdapter.TAG, adError3.toString());
                VungleRtbInterstitialAd.this.mMediationAdLoadCallback.onFailure(adError3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd() {
        if (Vungle.canPlayAd(this.mPlacement, this.mAdMarkup)) {
            this.mediationInterstitialAdCallback = this.mMediationAdLoadCallback.onSuccess(this);
        } else {
            Vungle.loadAd(this.mPlacement, this.mAdMarkup, this.mAdConfig, new LoadAdCallback() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.2
                @Override // com.vungle.warren.LoadAdCallback
                public void onAdLoad(String str) {
                    VungleRtbInterstitialAd vungleRtbInterstitialAd = VungleRtbInterstitialAd.this;
                    vungleRtbInterstitialAd.mediationInterstitialAdCallback = (MediationInterstitialAdCallback) vungleRtbInterstitialAd.mMediationAdLoadCallback.onSuccess(VungleRtbInterstitialAd.this);
                }

                @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
                public void onError(String str, VungleException vungleException) {
                    AdError adError = VungleMediationAdapter.getAdError(vungleException);
                    Log.w(VungleMediationAdapter.TAG, adError.toString());
                    VungleRtbInterstitialAd.this.mMediationAdLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        Vungle.playAd(this.mPlacement, this.mAdMarkup, this.mAdConfig, new PlayAdCallback() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.3
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
            public void onAdStart(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdOpened();
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdEnd(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdClosed();
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdClick(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.reportAdClicked();
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdLeftApplication(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdLeftApplication();
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onError(String str, VungleException vungleException) {
                Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleException).toString());
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdClosed();
                }
            }

            @Override // com.vungle.warren.PlayAdCallback
            public void onAdViewed(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.reportAdImpression();
                }
            }
        });
    }
}
