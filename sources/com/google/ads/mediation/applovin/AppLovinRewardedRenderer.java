package com.google.ads.mediation.applovin;

import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinRewardedRenderer implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected MediationRewardedAdConfiguration adConfiguration;
    protected MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected AppLovinSdk appLovinSdk;
    private boolean fullyWatched;
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private AppLovinRewardItem rewardItem;
    protected MediationRewardedAdCallback rewardedAdCallback;

    public abstract void loadAd();

    protected AppLovinRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
    }

    public void adReceived(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(4, "Rewarded video did load ad: " + appLovinAd.getAdIdNumber());
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinRewardedRenderer appLovinRewardedRenderer = AppLovinRewardedRenderer.this;
                appLovinRewardedRenderer.rewardedAdCallback = appLovinRewardedRenderer.adLoadCallback.onSuccess(AppLovinRewardedRenderer.this);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        final AdError adError = AppLovinUtils.getAdError(i);
        ApplovinAdapter.log(5, adError.toString());
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                AppLovinRewardedRenderer.this.adLoadCallback.onFailure(adError);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video displayed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (this.fullyWatched) {
            mediationRewardedAdCallback.onUserEarnedReward(this.rewardItem);
        }
        this.rewardedAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video playback began.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
        ApplovinAdapter.log(3, "Rewarded video playback ended at playback percent: " + d + "%.");
        this.fullyWatched = z;
        if (z) {
            this.rewardedAdCallback.onVideoComplete();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        ApplovinAdapter.log(6, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        ApplovinAdapter.log(6, "Rewarded video validation request for ad failed with error code: " + i);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        ApplovinAdapter.log(6, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get("currency");
        int i = (int) Double.parseDouble(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
        ApplovinAdapter.log(3, "Rewarded " + i + " " + str);
        this.rewardItem = new AppLovinRewardItem(i, str);
    }
}
