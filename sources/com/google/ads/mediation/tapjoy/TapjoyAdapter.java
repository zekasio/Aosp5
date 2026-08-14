package com.google.ads.mediation.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.ads.mediation.tapjoy.TapjoyInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyConnectFlag;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class TapjoyAdapter extends TapjoyMediationAdapter implements MediationInterstitialAdapter {
    private static final HashMap<String, WeakReference<TapjoyAdapter>> placementsInUse = new HashMap<>();
    private TJPlacement interstitialPlacement;
    private MediationInterstitialListener mediationInterstitialListener;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private String interstitialPlacementName = null;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, final Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(103, "Tapjoy SDK requires an Activity context to request ads.", "com.google.ads.mediation.tapjoy");
            Log.e(TAG, adError.getMessage());
            this.mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        Activity activity = (Activity) context;
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError2 = new AdError(101, "Missing or invalid SDK key.", "com.google.ads.mediation.tapjoy");
            Log.e(TAG, adError2.getMessage());
            this.mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            Hashtable<String, Object> hashtable = new Hashtable<>();
            if (bundle2 != null && bundle2.containsKey("enable_debug")) {
                hashtable.put(TapjoyConnectFlag.ENABLE_LOGGING, Boolean.valueOf(bundle2.getBoolean("enable_debug", false)));
            }
            Tapjoy.setActivity(activity);
            TapjoyInitializer.getInstance().initialize(activity, string, hashtable, new TapjoyInitializer.Listener() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.1
                @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
                public void onInitializeSucceeded() {
                    TapjoyAdapter.this.interstitialPlacementName = bundle.getString("placementName");
                    if (!TextUtils.isEmpty(TapjoyAdapter.this.interstitialPlacementName)) {
                        if (!TapjoyAdapter.placementsInUse.containsKey(TapjoyAdapter.this.interstitialPlacementName) || ((WeakReference) TapjoyAdapter.placementsInUse.get(TapjoyAdapter.this.interstitialPlacementName)).get() == null) {
                            TapjoyAdapter.placementsInUse.put(TapjoyAdapter.this.interstitialPlacementName, new WeakReference(TapjoyAdapter.this));
                            if (TapjoyAdapter.this.interstitialPlacement == null || !TapjoyAdapter.this.interstitialPlacement.isContentAvailable()) {
                                TapjoyAdapter.this.createInterstitialPlacementAndRequestContent();
                                return;
                            } else {
                                TapjoyAdapter.this.mediationInterstitialListener.onAdLoaded(TapjoyAdapter.this);
                                return;
                            }
                        }
                        AdError adError3 = new AdError(106, String.format("An ad has already been requested for placement: %s.", TapjoyAdapter.this.interstitialPlacementName), "com.google.ads.mediation.tapjoy");
                        Log.e(TapjoyMediationAdapter.TAG, adError3.getMessage());
                        TapjoyAdapter.this.mediationInterstitialListener.onAdFailedToLoad(TapjoyAdapter.this, adError3);
                        return;
                    }
                    AdError adError4 = new AdError(101, "Missing or invalid Tapjoy placement name.", "com.google.ads.mediation.tapjoy");
                    Log.e(TapjoyMediationAdapter.TAG, adError4.getMessage());
                    TapjoyAdapter.this.mediationInterstitialListener.onAdFailedToLoad(TapjoyAdapter.this, adError4);
                }

                @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
                public void onInitializeFailed(String str) {
                    AdError adError3 = new AdError(104, str, "com.google.ads.mediation.tapjoy");
                    Log.e(TapjoyMediationAdapter.TAG, adError3.getMessage());
                    TapjoyAdapter.this.mediationInterstitialListener.onAdFailedToLoad(TapjoyAdapter.this, adError3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createInterstitialPlacementAndRequestContent() {
        Log.i(TAG, "Creating interstitial placement for AdMob adapter.");
        TJPlacement placement = Tapjoy.getPlacement(this.interstitialPlacementName, new TJPlacementListener() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2
            @Override // com.tapjoy.TJPlacementListener
            public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestSuccess(TJPlacement tJPlacement) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyAdapter.this.interstitialPlacement.isContentAvailable()) {
                            return;
                        }
                        TapjoyAdapter.placementsInUse.remove(TapjoyAdapter.this.interstitialPlacementName);
                        AdError adError = new AdError(108, "Tapjoy request successful but no content was returned.", "com.google.ads.mediation.tapjoy");
                        Log.w(TapjoyMediationAdapter.TAG, adError.getMessage());
                        TapjoyAdapter.this.mediationInterstitialListener.onAdFailedToLoad(TapjoyAdapter.this, adError);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestFailure(TJPlacement tJPlacement, final TJError tJError) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyAdapter.placementsInUse.remove(TapjoyAdapter.this.interstitialPlacementName);
                        AdError adError = new AdError(tJError.code, tJError.message == null ? "Tapjoy request failed." : tJError.message, TapjoyMediationAdapter.TAPJOY_SDK_ERROR_DOMAIN);
                        Log.e(TapjoyMediationAdapter.TAG, adError.getMessage());
                        TapjoyAdapter.this.mediationInterstitialListener.onAdFailedToLoad(TapjoyAdapter.this, adError);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentReady(TJPlacement tJPlacement) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyAdapter.this.mediationInterstitialListener.onAdLoaded(TapjoyAdapter.this);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentShow(TJPlacement tJPlacement) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyAdapter.this.mediationInterstitialListener.onAdOpened(TapjoyAdapter.this);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentDismiss(TJPlacement tJPlacement) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyAdapter.placementsInUse.remove(TapjoyAdapter.this.interstitialPlacementName);
                        TapjoyAdapter.this.mediationInterstitialListener.onAdClosed(TapjoyAdapter.this);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onClick(TJPlacement tJPlacement) {
                TapjoyAdapter.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyAdapter.2.6
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyAdapter.this.mediationInterstitialListener.onAdClicked(TapjoyAdapter.this);
                        TapjoyAdapter.this.mediationInterstitialListener.onAdLeftApplication(TapjoyAdapter.this);
                    }
                });
            }
        });
        this.interstitialPlacement = placement;
        placement.setMediationName(AppLovinMediationProvider.ADMOB);
        this.interstitialPlacement.setAdapterVersion("1.0.0");
        requestInterstitialPlacementContent();
    }

    private void requestInterstitialPlacementContent() {
        this.interstitialPlacement.requestContent();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        Log.i(TAG, "Show interstitial content for Tapjoy-AdMob adapter");
        TJPlacement tJPlacement = this.interstitialPlacement;
        if (tJPlacement == null || !tJPlacement.isContentAvailable()) {
            return;
        }
        this.interstitialPlacement.showContent();
    }

    public static final class TapjoyExtrasBundleBuilder {
        private static final String DEBUG = "enable_debug";
        private boolean debugEnabled = false;

        public TapjoyExtrasBundleBuilder setDebug(boolean z) {
            this.debugEnabled = z;
            return this;
        }

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(DEBUG, this.debugEnabled);
            return bundle;
        }
    }
}
