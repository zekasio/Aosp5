package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FacebookRewardedAd implements MediationRewardedAd, RewardedVideoAdExtendedListener {
    private final MediationRewardedAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private MediationRewardedAdCallback mRewardedAdCallback;
    private RewardedVideoAd rewardedAd;
    private final AtomicBoolean showAdCalled = new AtomicBoolean();
    private boolean isRtbAd = false;
    private final AtomicBoolean didRewardedAdClose = new AtomicBoolean();

    public FacebookRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void render() {
        final Context context = this.adConfiguration.getContext();
        final String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.mMediationAdLoadCallback.onFailure(adError);
            return;
        }
        String bidResponse = this.adConfiguration.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.isRtbAd = true;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        if (this.isRtbAd) {
            this.rewardedAd = new RewardedVideoAd(context, placementID);
            if (!TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.rewardedAd.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.rewardedAd;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(bidResponse).withAdExperience(getAdExperienceType()).build());
            return;
        }
        FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookRewardedAd.1
            @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
            public void onInitializeSuccess() {
                FacebookRewardedAd.this.createAndLoadRewardedVideo(context, placementID);
            }

            @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
            public void onInitializeError(AdError adError2) {
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                if (FacebookRewardedAd.this.mMediationAdLoadCallback != null) {
                    FacebookRewardedAd.this.mMediationAdLoadCallback.onFailure(adError2);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.showAdCalled.set(true);
        if (!this.rewardedAd.show()) {
            AdError adError = new AdError(110, "Failed to present rewarded ad.", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.rewardedAd.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.mRewardedAdCallback.onAdOpened();
        }
    }

    AdExperienceType getAdExperienceType() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadRewardedVideo(Context context, String str) {
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(context, str);
        this.rewardedAd = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withAdExperience(getAdExperienceType()).build());
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.mRewardedAdCallback.onVideoComplete();
        this.mRewardedAdCallback.onUserEarnedReward(new FacebookReward());
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.showAdCalled.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.rewardedAd.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.didRewardedAdClose.getAndSet(true) && (mediationRewardedAdCallback = this.mRewardedAdCallback) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.rewardedAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.didRewardedAdClose.getAndSet(true) && (mediationRewardedAdCallback = this.mRewardedAdCallback) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.rewardedAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }
}
