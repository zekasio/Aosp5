package com.google.ads.mediation.applovin;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 110;
    public static final int ERROR_PRESENTATON_AD_NOT_READY = 106;
    public static AppLovinSdkSettings appLovinSdkSettings;
    private AppLovinWaterfallRewardedRenderer rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static AppLovinSdkSettings getSdkSettings(Context context) {
        if (appLovinSdkSettings == null) {
            appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        return appLovinSdkSettings;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        final HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, null);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            hashSet.add(strRetrieveSdkKey);
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", ERROR_DOMAIN);
            ApplovinAdapter.log(5, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            final HashSet hashSet2 = new HashSet();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                AppLovinInitializer.getInstance().initialize(context, (String) it2.next(), new AppLovinInitializer.OnInitializeSuccessListener(this) { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.1
                    @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                    public void onInitializeSuccess(String str) {
                        hashSet2.add(str);
                        if (hashSet2.equals(hashSet)) {
                            initializationCompleteCallback.onInitializationSucceeded();
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        ApplovinAdapter.log(5, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String str = AppLovinSdk.VERSION;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        ApplovinAdapter.log(5, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        MediationConfiguration configuration = rtbSignalData.getConfiguration();
        if (configuration.getFormat() == AdFormat.NATIVE) {
            AdError adError = new AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.getMessage());
            signalCallbacks.onFailure(adError);
            return;
        }
        ApplovinAdapter.log(4, "Extras for signal collection: " + rtbSignalData.getNetworkExtras());
        String bidToken = AppLovinUtils.retrieveSdk(configuration.getServerParameters(), rtbSignalData.getContext()).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            AdError adError2 = new AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError2.getMessage());
            signalCallbacks.onFailure(adError2);
        } else {
            ApplovinAdapter.log(4, "Generated bid token: " + bidToken);
            signalCallbacks.onSuccess(bidToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = new AppLovinWaterfallRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedRenderer = appLovinWaterfallRewardedRenderer;
        appLovinWaterfallRewardedRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd();
    }
}
