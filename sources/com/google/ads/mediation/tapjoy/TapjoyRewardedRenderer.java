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
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConnectFlag;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TapjoyRewardedRenderer implements MediationRewardedAd, TJPlacementVideoListener {
    private static final String TAPJOY_DEBUG_FLAG_KEY = "enable_debug";
    private static boolean isRtbAd = false;
    private static final HashMap<String, WeakReference<TapjoyRewardedRenderer>> placementsInUse = new HashMap<>();
    private final MediationRewardedAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private TJPlacement videoPlacement;

    public TapjoyRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
    }

    public void render() {
        if (!this.adConfiguration.getBidResponse().equals("")) {
            isRtbAd = true;
        }
        Context context = this.adConfiguration.getContext();
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(103, "Tapjoy SDK requires an Activity context to request ads.", "com.google.ads.mediation.tapjoy");
            Log.e(TapjoyMediationAdapter.TAG, adError.getMessage());
            this.adLoadCallback.onFailure(adError);
            return;
        }
        Activity activity = (Activity) context;
        final Bundle serverParameters = this.adConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError2 = new AdError(101, "Missing or invalid SDK key.", "com.google.ads.mediation.tapjoy");
            Log.e(TapjoyMediationAdapter.TAG, adError2.getMessage());
            this.adLoadCallback.onFailure(adError2);
            return;
        }
        Bundle mediationExtras = this.adConfiguration.getMediationExtras();
        Hashtable<String, Object> hashtable = new Hashtable<>();
        if (mediationExtras.containsKey(TAPJOY_DEBUG_FLAG_KEY)) {
            hashtable.put(TapjoyConnectFlag.ENABLE_LOGGING, Boolean.valueOf(mediationExtras.getBoolean(TAPJOY_DEBUG_FLAG_KEY, false)));
        }
        Log.i(TapjoyMediationAdapter.TAG, "Loading ad for Tapjoy-AdMob adapter");
        Tapjoy.setActivity(activity);
        TapjoyInitializer.getInstance().initialize(activity, string, hashtable, new TapjoyInitializer.Listener() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.1
            @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
            public void onInitializeSucceeded() {
                String string2 = serverParameters.getString("placementName");
                if (!TextUtils.isEmpty(string2)) {
                    if (!TapjoyRewardedRenderer.placementsInUse.containsKey(string2) || ((WeakReference) TapjoyRewardedRenderer.placementsInUse.get(string2)).get() == null) {
                        TapjoyRewardedRenderer.placementsInUse.put(string2, new WeakReference(TapjoyRewardedRenderer.this));
                        TapjoyRewardedRenderer.this.createVideoPlacementAndRequestContent(string2);
                        return;
                    } else {
                        AdError adError3 = new AdError(106, String.format("An ad has already been requested for placement: %s.", string2), "com.google.ads.mediation.tapjoy");
                        Log.e(TapjoyMediationAdapter.TAG, adError3.getMessage());
                        TapjoyRewardedRenderer.this.adLoadCallback.onFailure(adError3);
                        return;
                    }
                }
                AdError adError4 = new AdError(101, "Missing or invalid Tapjoy placement name.", "com.google.ads.mediation.tapjoy");
                Log.e(TapjoyMediationAdapter.TAG, adError4.getMessage());
                TapjoyRewardedRenderer.this.adLoadCallback.onFailure(adError4);
            }

            @Override // com.google.ads.mediation.tapjoy.TapjoyInitializer.Listener
            public void onInitializeFailed(String str) {
                AdError adError3 = new AdError(104, str, "com.google.ads.mediation.tapjoy");
                Log.e(TapjoyMediationAdapter.TAG, adError3.getMessage());
                TapjoyRewardedRenderer.this.adLoadCallback.onFailure(adError3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVideoPlacementAndRequestContent(final String str) {
        Log.i(TapjoyMediationAdapter.TAG, "Creating video placement for AdMob adapter.");
        TJPlacement placement = Tapjoy.getPlacement(str, new TJPlacementListener() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2
            @Override // com.tapjoy.TJPlacementListener
            public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str2) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str2, int i) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestSuccess(TJPlacement tJPlacement) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyRewardedRenderer.this.videoPlacement.isContentAvailable()) {
                            return;
                        }
                        TapjoyRewardedRenderer.placementsInUse.remove(str);
                        AdError adError = new AdError(108, "Tapjoy request successful but no content was returned.", "com.google.ads.mediation.tapjoy");
                        Log.w(TapjoyMediationAdapter.TAG, adError.getMessage());
                        if (TapjoyRewardedRenderer.this.adLoadCallback != null) {
                            TapjoyRewardedRenderer.this.adLoadCallback.onFailure(adError);
                        }
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestFailure(TJPlacement tJPlacement, final TJError tJError) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyRewardedRenderer.placementsInUse.remove(str);
                        AdError adError = new AdError(tJError.code, tJError.message == null ? "Tapjoy request failed." : tJError.message, TapjoyMediationAdapter.TAPJOY_SDK_ERROR_DOMAIN);
                        Log.e(TapjoyMediationAdapter.TAG, adError.getMessage());
                        if (TapjoyRewardedRenderer.this.adLoadCallback != null) {
                            TapjoyRewardedRenderer.this.adLoadCallback.onFailure(adError);
                        }
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentReady(TJPlacement tJPlacement) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad is available.");
                        if (TapjoyRewardedRenderer.this.adLoadCallback != null) {
                            TapjoyRewardedRenderer.this.mediationRewardedAdCallback = (MediationRewardedAdCallback) TapjoyRewardedRenderer.this.adLoadCallback.onSuccess(TapjoyRewardedRenderer.this);
                        }
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentShow(TJPlacement tJPlacement) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad has been opened.");
                        if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                            TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onAdOpened();
                        }
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentDismiss(TJPlacement tJPlacement) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad has been closed.");
                        if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                            TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onAdClosed();
                        }
                        TapjoyRewardedRenderer.placementsInUse.remove(str);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onClick(TJPlacement tJPlacement) {
                TapjoyRewardedRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.2.6
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad has been clicked.");
                        if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                            TapjoyRewardedRenderer.this.mediationRewardedAdCallback.reportAdClicked();
                        }
                    }
                });
            }
        });
        this.videoPlacement = placement;
        placement.setMediationName(AppLovinMediationProvider.ADMOB);
        this.videoPlacement.setAdapterVersion("1.0.0");
        if (isRtbAd) {
            HashMap<String, String> map = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(this.adConfiguration.getBidResponse());
                String string = jSONObject.getString("id");
                String string2 = jSONObject.getString(TapjoyAuctionFlags.AUCTION_DATA);
                map.put("id", string);
                map.put(TapjoyAuctionFlags.AUCTION_DATA, string2);
            } catch (JSONException e) {
                Log.e(TapjoyMediationAdapter.TAG, "Bid Response JSON Error: " + e.getMessage());
            }
            this.videoPlacement.setAuctionData(map);
        }
        this.videoPlacement.setVideoListener(this);
        this.videoPlacement.requestContent();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Log.i(TapjoyMediationAdapter.TAG, "Show video content for Tapjoy-AdMob adapter.");
        TJPlacement tJPlacement = this.videoPlacement;
        if (tJPlacement != null && tJPlacement.isContentAvailable()) {
            this.videoPlacement.showContent();
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(108, "Tapjoy content not available.", "com.google.ads.mediation.tapjoy");
            Log.w(TapjoyMediationAdapter.TAG, adError.getMessage());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.tapjoy.TJPlacementVideoListener
    public void onVideoStart(TJPlacement tJPlacement) {
        this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.3
            @Override // java.lang.Runnable
            public void run() {
                Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad has started playing.");
                if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                    TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onVideoStart();
                    TapjoyRewardedRenderer.this.mediationRewardedAdCallback.reportAdImpression();
                }
            }
        });
    }

    @Override // com.tapjoy.TJPlacementVideoListener
    public void onVideoError(final TJPlacement tJPlacement, final String str) {
        this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.4
            @Override // java.lang.Runnable
            public void run() {
                TapjoyRewardedRenderer.placementsInUse.remove(tJPlacement.getName());
                AdError adError = new AdError(105, str, "com.google.ads.mediation.tapjoy");
                Log.w(TapjoyMediationAdapter.TAG, adError.getMessage());
                if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                    TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onAdFailedToShow(adError);
                }
            }
        });
    }

    @Override // com.tapjoy.TJPlacementVideoListener
    public void onVideoComplete(TJPlacement tJPlacement) {
        this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.TapjoyRewardedRenderer.5
            @Override // java.lang.Runnable
            public void run() {
                Log.d(TapjoyMediationAdapter.TAG, "Tapjoy Rewarded Ad has finished playing.");
                if (TapjoyRewardedRenderer.this.mediationRewardedAdCallback != null) {
                    TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onVideoComplete();
                    TapjoyRewardedRenderer.this.mediationRewardedAdCallback.onUserEarnedReward(TapjoyRewardedRenderer.this.new TapjoyReward());
                }
            }
        });
    }

    public class TapjoyReward implements RewardItem {
        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return 1;
        }

        public TapjoyReward() {
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public String getType() {
            return "";
        }
    }
}
