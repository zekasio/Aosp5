package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.mediation.VungleExtrasBuilder;
import com.vungle.mediation.VungleManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes.dex */
public class VungleRtbRewardedAd implements MediationRewardedAd, LoadAdCallback, PlayAdCallback {
    private AdConfig mAdConfig;
    private String mAdMarkup;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private MediationRewardedAdCallback mMediationRewardedAdCallback;
    private String mPlacement;
    private String mUserID;
    private final MediationRewardedAdConfiguration mediationRewardedAdConfiguration;

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
    }

    public VungleRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationRewardedAdConfiguration = mediationRewardedAdConfiguration;
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void render() {
        Bundle mediationExtras = this.mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = this.mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.mUserID = mediationExtras.getString(VungleExtrasBuilder.EXTRA_USER_ID);
        }
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
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.mMediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.mAdMarkup = this.mediationRewardedAdConfiguration.getBidResponse();
        Log.d(VungleMediationAdapter.TAG, "Render rewarded mAdMarkup=" + this.mAdMarkup);
        this.mAdConfig = VungleExtrasBuilder.adConfigWithNetworkExtras(mediationExtras, false);
        VungleInitializer.getInstance().updateCoppaStatus(this.mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleInitializer.getInstance().initialize(string, this.mediationRewardedAdConfiguration.getContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                Vungle.setIncentivizedFields(VungleRtbRewardedAd.this.mUserID, null, null, null, null);
                if (!Vungle.canPlayAd(VungleRtbRewardedAd.this.mPlacement, VungleRtbRewardedAd.this.mAdMarkup)) {
                    Vungle.loadAd(VungleRtbRewardedAd.this.mPlacement, VungleRtbRewardedAd.this.mAdMarkup, VungleRtbRewardedAd.this.mAdConfig, VungleRtbRewardedAd.this);
                } else {
                    VungleRtbRewardedAd vungleRtbRewardedAd = VungleRtbRewardedAd.this;
                    vungleRtbRewardedAd.mMediationRewardedAdCallback = (MediationRewardedAdCallback) vungleRtbRewardedAd.mMediationAdLoadCallback.onSuccess(VungleRtbRewardedAd.this);
                }
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError3) {
                Log.w(VungleMediationAdapter.TAG, adError3.toString());
                VungleRtbRewardedAd.this.mMediationAdLoadCallback.onFailure(adError3);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Vungle.playAd(this.mPlacement, this.mAdMarkup, this.mAdConfig, this);
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mMediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mMediationRewardedAdCallback.onUserEarnedReward(new VungleMediationAdapter.VungleReward("vungle", 1));
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
            return;
        }
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        this.mMediationRewardedAdCallback.onVideoStart();
        this.mMediationRewardedAdCallback.reportAdImpression();
    }
}
