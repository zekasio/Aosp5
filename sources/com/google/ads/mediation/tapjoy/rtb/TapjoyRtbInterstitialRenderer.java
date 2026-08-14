package com.google.ads.mediation.tapjoy.rtb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.tapjoy.TapjoyMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyAuctionFlags;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TapjoyRtbInterstitialRenderer implements MediationInterstitialAd {
    private static final String MEDIATION_AGENT = "admob";
    private static final String PLACEMENT_NAME_SERVER_PARAMETER_KEY = "placementName";
    private static final String TAPJOY_INTERNAL_ADAPTER_VERSION = "2.0.0";
    private static final HashMap<String, WeakReference<TapjoyRtbInterstitialRenderer>> placementsInUse = new HashMap<>();
    private final MediationAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> callback;
    private TJPlacement interstitialPlacement;
    private MediationInterstitialAdCallback listener;
    private final String TAG = "TapjoyRTB Interstitial";
    private String interstitialPlacementName = null;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public TapjoyRtbInterstitialRenderer(MediationAdConfiguration mediationAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationAdConfiguration;
        this.callback = mediationAdLoadCallback;
    }

    public void render() {
        Log.i("TapjoyRTB Interstitial", "Rendering interstitial placement for AdMob adapter.");
        String string = this.adConfiguration.getServerParameters().getString(PLACEMENT_NAME_SERVER_PARAMETER_KEY);
        this.interstitialPlacementName = string;
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid Tapjoy placement name.", "com.google.ads.mediation.tapjoy");
            Log.e("TapjoyRTB Interstitial", adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        HashMap<String, WeakReference<TapjoyRtbInterstitialRenderer>> map = placementsInUse;
        if (map.containsKey(this.interstitialPlacementName) && map.get(this.interstitialPlacementName).get() != null) {
            AdError adError2 = new AdError(106, String.format("An ad has already been requested for placement: %s.", this.interstitialPlacementName), "com.google.ads.mediation.tapjoy");
            Log.e("TapjoyRTB Interstitial", adError2.getMessage());
            this.callback.onFailure(adError2);
        } else {
            map.put(this.interstitialPlacementName, new WeakReference<>(this));
            createInterstitialPlacementAndRequestContent();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        Log.i("TapjoyRTB Interstitial", "Show interstitial content for Tapjoy-AdMob adapter.");
        TJPlacement tJPlacement = this.interstitialPlacement;
        if (tJPlacement == null || !tJPlacement.isContentAvailable()) {
            return;
        }
        this.interstitialPlacement.showContent();
    }

    private void createInterstitialPlacementAndRequestContent() {
        TJPlacement placement = Tapjoy.getPlacement(this.interstitialPlacementName, new TJPlacementListener() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1
            @Override // com.tapjoy.TJPlacementListener
            public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestSuccess(TJPlacement tJPlacement) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyRtbInterstitialRenderer.this.interstitialPlacement.isContentAvailable()) {
                            return;
                        }
                        TapjoyRtbInterstitialRenderer.placementsInUse.remove(TapjoyRtbInterstitialRenderer.this.interstitialPlacementName);
                        AdError adError = new AdError(108, "Tapjoy request successful but no content was returned.", "com.google.ads.mediation.tapjoy");
                        Log.w("TapjoyRTB Interstitial", adError.getMessage());
                        TapjoyRtbInterstitialRenderer.this.callback.onFailure(adError);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onRequestFailure(TJPlacement tJPlacement, final TJError tJError) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyRtbInterstitialRenderer.placementsInUse.remove(TapjoyRtbInterstitialRenderer.this.interstitialPlacementName);
                        AdError adError = new AdError(tJError.code, tJError.message == null ? "Tapjoy request failed." : tJError.message, TapjoyMediationAdapter.TAPJOY_SDK_ERROR_DOMAIN);
                        Log.e("TapjoyRTB Interstitial", adError.getMessage());
                        TapjoyRtbInterstitialRenderer.this.callback.onFailure(adError);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentReady(TJPlacement tJPlacement) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        TapjoyRtbInterstitialRenderer.this.listener = (MediationInterstitialAdCallback) TapjoyRtbInterstitialRenderer.this.callback.onSuccess(TapjoyRtbInterstitialRenderer.this);
                        Log.d("TapjoyRTB Interstitial", "Interstitial onContentReady.");
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentShow(TJPlacement tJPlacement) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyRtbInterstitialRenderer.this.listener != null) {
                            TapjoyRtbInterstitialRenderer.this.listener.onAdOpened();
                            TapjoyRtbInterstitialRenderer.this.listener.reportAdImpression();
                        }
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onContentDismiss(TJPlacement tJPlacement) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyRtbInterstitialRenderer.this.listener != null) {
                            TapjoyRtbInterstitialRenderer.this.listener.onAdClosed();
                        }
                        TapjoyRtbInterstitialRenderer.placementsInUse.remove(TapjoyRtbInterstitialRenderer.this.interstitialPlacementName);
                    }
                });
            }

            @Override // com.tapjoy.TJPlacementListener
            public void onClick(TJPlacement tJPlacement) {
                TapjoyRtbInterstitialRenderer.this.mainHandler.post(new Runnable() { // from class: com.google.ads.mediation.tapjoy.rtb.TapjoyRtbInterstitialRenderer.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TapjoyRtbInterstitialRenderer.this.listener != null) {
                            TapjoyRtbInterstitialRenderer.this.listener.reportAdClicked();
                            TapjoyRtbInterstitialRenderer.this.listener.onAdLeftApplication();
                        }
                    }
                });
            }
        });
        this.interstitialPlacement = placement;
        placement.setMediationName("admob");
        this.interstitialPlacement.setAdapterVersion(TAPJOY_INTERNAL_ADAPTER_VERSION);
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(this.adConfiguration.getBidResponse());
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString(TapjoyAuctionFlags.AUCTION_DATA);
            map.put("id", string);
            map.put(TapjoyAuctionFlags.AUCTION_DATA, string2);
        } catch (JSONException e) {
            Log.e("TapjoyRTB Interstitial", "Bid Response JSON Error: " + e.getMessage());
        }
        this.interstitialPlacement.setAuctionData(map);
        this.interstitialPlacement.requestContent();
    }
}
