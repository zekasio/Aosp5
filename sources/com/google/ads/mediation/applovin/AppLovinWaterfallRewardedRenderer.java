package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinWaterfallRewardedRenderer extends AppLovinRewardedRenderer implements MediationRewardedAd {
    private static final String DEFAULT_ZONE = "";
    private String zoneId;
    private static final Object INCENTIVIZED_ADS_LOCK = new Object();
    private static final HashMap<String, WeakReference<AppLovinWaterfallRewardedRenderer>> INCENTIVIZED_ADS = new HashMap<>();

    protected AppLovinWaterfallRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd() {
        final Context context = this.adConfiguration.getContext();
        final Bundle serverParameters = this.adConfiguration.getServerParameters();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, serverParameters);
        if (TextUtils.isEmpty(strRetrieveSdkKey)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.toString());
            this.adLoadCallback.onFailure(adError);
            return;
        }
        AppLovinInitializer.getInstance().initialize(context, strRetrieveSdkKey, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.1
            @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
            public void onInitializeSuccess(String str) {
                AppLovinWaterfallRewardedRenderer.this.zoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                AppLovinWaterfallRewardedRenderer.this.appLovinSdk = AppLovinUtils.retrieveSdk(serverParameters, context);
                boolean z = true;
                ApplovinAdapter.log(3, String.format("Requesting rewarded video for zone '%s'", AppLovinWaterfallRewardedRenderer.this.zoneId));
                synchronized (AppLovinWaterfallRewardedRenderer.INCENTIVIZED_ADS_LOCK) {
                    if (!AppLovinWaterfallRewardedRenderer.INCENTIVIZED_ADS.containsKey(AppLovinWaterfallRewardedRenderer.this.zoneId)) {
                        AppLovinWaterfallRewardedRenderer.INCENTIVIZED_ADS.put(AppLovinWaterfallRewardedRenderer.this.zoneId, new WeakReference(AppLovinWaterfallRewardedRenderer.this));
                        z = false;
                    }
                }
                if (z) {
                    AdError adError2 = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                    ApplovinAdapter.log(6, adError2.toString());
                    AppLovinWaterfallRewardedRenderer.this.adLoadCallback.onFailure(adError2);
                } else {
                    if ("".equals(AppLovinWaterfallRewardedRenderer.this.zoneId)) {
                        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = AppLovinWaterfallRewardedRenderer.this;
                        appLovinWaterfallRewardedRenderer.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinWaterfallRewardedRenderer.appLovinSdk);
                    } else {
                        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer2 = AppLovinWaterfallRewardedRenderer.this;
                        appLovinWaterfallRewardedRenderer2.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinWaterfallRewardedRenderer2.zoneId, AppLovinWaterfallRewardedRenderer.this.appLovinSdk);
                    }
                    AppLovinWaterfallRewardedRenderer.this.incentivizedInterstitial.preload(AppLovinWaterfallRewardedRenderer.this);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.zoneId;
        if (str != null) {
            ApplovinAdapter.log(3, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (!this.incentivizedInterstitial.isAdReadyToDisplay()) {
            AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.toString());
            this.rewardedAdCallback.onAdFailedToShow(adError);
            return;
        }
        this.incentivizedInterstitial.show(context, this, this, this, this);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        INCENTIVIZED_ADS.remove(this.zoneId);
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        INCENTIVIZED_ADS.remove(this.zoneId);
        super.adHidden(appLovinAd);
    }
}
