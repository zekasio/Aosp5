package com.google.ads.mediation.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.tapjoy.TapjoyInitializer;
import com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer;
import com.google.android.gms.ads.AdError;
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
import com.tapjoy.Tapjoy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TapjoyMediationAdapter extends RtbAdapter {
    public static final int ERROR_AD_ALREADY_REQUESTED = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.tapjoy";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_NO_CONTENT_AVAILABLE = 108;
    public static final int ERROR_PRESENTATION_VIDEO_PLAYBACK = 105;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 107;
    public static final int ERROR_TAPJOY_INITIALIZATION = 104;
    static final String MEDIATION_AGENT = "admob";
    static final String PLACEMENT_NAME_SERVER_PARAMETER_KEY = "placementName";
    static final String SDK_KEY_SERVER_PARAMETER_KEY = "sdkKey";
    static final String TAG = "TapjoyMediationAdapter";
    static final String TAPJOY_INTERNAL_ADAPTER_VERSION = "1.0.0";
    public static final String TAPJOY_SDK_ERROR_DOMAIN = "com.tapjoy";

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
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
        String version = Tapjoy.getVersion();
        String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (!(context instanceof Activity)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(103, "Tapjoy SDK requires an Activity context to initialize.", "com.google.ads.mediation.tapjoy").getMessage());
            return;
        }
        Activity activity = (Activity) context;
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("sdkKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid SDK key.", "com.google.ads.mediation.tapjoy").getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Tapjoy SDK.", "sdkKey", hashSet, str));
        }
        Tapjoy.setActivity(activity);
        TapjoyInitializer.getInstance().initialize(activity, str, new Hashtable<>(), new TapjoyInitializer.Listener() { // from class: com.google.ads.mediation.tapjoy.TapjoyMediationAdapter.1
            @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
            public void onInitializeSucceeded() {
                initializationCompleteCallback.onInitializationSucceeded();
            }

            @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
            public void onInitializeFailed(String str2) {
                initializationCompleteCallback.onInitializationFailed(new AdError(104, str2, "com.google.ads.mediation.tapjoy").getMessage());
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(Tapjoy.getUserToken());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new TapjoyRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback).render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new TapjoyRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback).render();
    }
}
