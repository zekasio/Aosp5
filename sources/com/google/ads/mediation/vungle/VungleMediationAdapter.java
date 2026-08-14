package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.vungle.mediation.BuildConfig;
import com.vungle.mediation.VungleExtrasBuilder;
import com.vungle.mediation.VungleManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, LoadAdCallback, PlayAdCallback {
    public static final int ERROR_AD_ALREADY_LOADED = 104;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_VUNGLE_BANNER_NULL = 106;
    public static final String KEY_APP_ID = "appid";
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.warren";
    private static final HashMap<String, WeakReference<VungleMediationAdapter>> mPlacementsInUse = new HashMap<>();
    private AdConfig mAdConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private MediationRewardedAdCallback mMediationRewardedAdCallback;
    private String mPlacement;
    private String mUserID;
    private VungleRtbInterstitialAd rtbInterstitialAd;
    private VungleRtbNativeAd rtbNativeAd;
    private VungleRtbRewardedAd rtbRewardedAd;
    private VungleRtbRewardedAd rtbRewardedInterstitialAd;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

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

    public static AdError getAdError(VungleException vungleException) {
        return new AdError(vungleException.getExceptionCode(), vungleException.getLocalizedMessage(), "com.vungle.warren");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = com.vungle.warren.BuildConfig.VERSION_NAME.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", com.vungle.warren.BuildConfig.VERSION_NAME));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        String availableBidTokens = Vungle.getAvailableBidTokens(rtbSignalData.getContext());
        Log.d(TAG, "token=" + availableBidTokens);
        signalCallbacks.onSuccess(availableBidTokens);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (Vungle.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(KEY_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", KEY_APP_ID, hashSet, str));
            }
            VungleInitializer.getInstance().initialize(str, context.getApplicationContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError) {
                    Log.w(VungleMediationAdapter.TAG, adError.toString());
                    initializationCompleteCallback.onInitializationFailed(adError.toString());
                }
            });
            return;
        }
        if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            initializationCompleteCallback.onInitializationFailed(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.mUserID = mediationExtras.getString(VungleExtrasBuilder.EXTRA_USER_ID);
        }
        String strFindPlacement = VungleManager.getInstance().findPlacement(mediationExtras, serverParameters);
        this.mPlacement = strFindPlacement;
        if (TextUtils.isEmpty(strFindPlacement)) {
            AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or invalid Placement ID.", ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        HashMap<String, WeakReference<VungleMediationAdapter>> map = mPlacementsInUse;
        if (map.containsKey(this.mPlacement) && map.get(this.mPlacement).get() != null) {
            AdError adError2 = new AdError(104, "Only a maximum of one ad can be loaded per placement.", ERROR_DOMAIN);
            Log.w(TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String string = serverParameters.getString(KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError3 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid App ID.", ERROR_DOMAIN);
            Log.w(TAG, adError3.toString());
            mediationAdLoadCallback.onFailure(adError3);
        } else {
            this.mAdConfig = VungleExtrasBuilder.adConfigWithNetworkExtras(mediationExtras, false);
            VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
            VungleInitializer.getInstance().initialize(string, mediationRewardedAdConfiguration.getContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.2
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    Vungle.setIncentivizedFields(VungleMediationAdapter.this.mUserID, null, null, null, null);
                    VungleMediationAdapter.mPlacementsInUse.put(VungleMediationAdapter.this.mPlacement, new WeakReference(VungleMediationAdapter.this));
                    if (!Vungle.canPlayAd(VungleMediationAdapter.this.mPlacement)) {
                        Vungle.loadAd(VungleMediationAdapter.this.mPlacement, VungleMediationAdapter.this.mAdConfig, VungleMediationAdapter.this);
                    } else {
                        VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
                        vungleMediationAdapter.mMediationRewardedAdCallback = (MediationRewardedAdCallback) vungleMediationAdapter.mMediationAdLoadCallback.onSuccess(VungleMediationAdapter.this);
                    }
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError4) {
                    Log.w(VungleMediationAdapter.TAG, adError4.toString());
                    VungleMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError4);
                    VungleMediationAdapter.mPlacementsInUse.remove(VungleMediationAdapter.this.mPlacement);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Vungle.playAd(this.mPlacement, this.mAdConfig, this);
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mMediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
        mPlacementsInUse.put(this.mPlacement, new WeakReference<>(this));
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
        mPlacementsInUse.remove(str);
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
            this.mMediationRewardedAdCallback.onUserEarnedReward(new VungleReward("vungle", 1));
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        AdError adError = getAdError(vungleException);
        Log.w(TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        } else {
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError);
            }
        }
        mPlacementsInUse.remove(str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        this.mMediationRewardedAdCallback.onVideoStart();
        this.mMediationRewardedAdCallback.reportAdImpression();
    }

    public static class VungleReward implements RewardItem {
        private final int mAmount;
        private final String mType;

        public VungleReward(String str, int i) {
            this.mType = str;
            this.mAmount = i;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return this.mAmount;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public String getType() {
            return this.mType;
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadNativeAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRewardedInterstitialAd()...");
        Log.d(str, "Vungle adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Vungle.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbInterstitialAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbInterstitialAd vungleRtbInterstitialAd = new VungleRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.rtbInterstitialAd = vungleRtbInterstitialAd;
        vungleRtbInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbNativeAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = TAG;
        Log.d(str, "loadRtbRewardedInterstitialAd()...");
        Log.d(str, "Vungle adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Vungle.");
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedInterstitialAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }
}
