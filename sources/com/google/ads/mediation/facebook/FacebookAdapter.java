package com.google.ads.mediation.facebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class FacebookAdapter extends FacebookMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    private static final int MAX_STAR_RATING = 5;
    private boolean isNativeBanner;
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private InterstitialAd mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsImpressionRecorded;
    private MediaView mMediaView;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private MediationNativeListener mNativeListener;
    private FrameLayout mWrappedAdView;
    private final AtomicBoolean showInterstitialCalled = new AtomicBoolean();
    private final AtomicBoolean didInterstitialAdClose = new AtomicBoolean();

    private interface NativeAdMapperListener {
        void onMappingFailed(AdError adError);

        void onMappingSuccess();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        MediaView mediaView = this.mMediaView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, MediationBannerListener mediationBannerListener, Bundle bundle, final AdSize adSize, final MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Log.w(TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mBannerListener = mediationBannerListener;
        final String placementID = getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(TAG, adError.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final com.facebook.ads.AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 == null) {
            AdError adError2 = new AdError(102, "There is no matching Facebook ad size for Google ad size.", "com.google.ads.mediation.facebook");
            Log.w(TAG, adError2.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.1
            @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
            public void onInitializeSuccess() {
                FacebookAdapter.this.mAdView = new AdView(context, placementID, adSize2);
                FacebookAdapter.this.buildAdRequest(mediationAdRequest);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), -2);
                FacebookAdapter.this.mWrappedAdView = new FrameLayout(context);
                FacebookAdapter.this.mAdView.setLayoutParams(layoutParams);
                FacebookAdapter.this.mWrappedAdView.addView(FacebookAdapter.this.mAdView);
                FacebookAdapter.this.mAdView.loadAd(FacebookAdapter.this.mAdView.buildLoadAdConfig().withAdListener(new BannerListener()).build());
            }

            @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
            public void onInitializeError(AdError adError3) {
                if (FacebookAdapter.this.mBannerListener != null) {
                    FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError3);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mWrappedAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, final MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Log.w(TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mInterstitialListener = mediationInterstitialListener;
        final String placementID = getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            this.mInterstitialListener.onAdFailedToLoad(this, new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook"));
        } else {
            FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.2
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    FacebookAdapter.this.createAndLoadInterstitial(context, placementID, mediationAdRequest);
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(AdError adError) {
                    if (FacebookAdapter.this.mInterstitialListener != null) {
                        FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.showInterstitialCalled.set(true);
        if (this.mInterstitialAd.show()) {
            return;
        }
        Log.w(TAG, new AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook").getMessage());
        MediationInterstitialListener mediationInterstitialListener = this.mInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdOpened(this);
            this.mInterstitialListener.onAdClosed(this);
        }
    }

    @Override // com.google.ads.mediation.facebook.FacebookMediationAdapter, com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.w(TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        super.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(final Context context, MediationNativeListener mediationNativeListener, Bundle bundle, final NativeMediationAdRequest nativeMediationAdRequest, final Bundle bundle2) {
        Log.w(TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mNativeListener = mediationNativeListener;
        final String placementID = getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(TAG, adError.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError);
        } else {
            if (!nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
                AdError adError2 = new AdError(105, "Unified Native Ads should be requested.", "com.google.ads.mediation.facebook");
                Log.w(TAG, adError2.getMessage());
                this.mNativeListener.onAdFailedToLoad(this, adError2);
                return;
            }
            FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.3
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    FacebookAdapter.this.createAndLoadNativeAd(context, placementID, nativeMediationAdRequest, bundle2);
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(AdError adError3) {
                    Log.w(FacebookMediationAdapter.TAG, adError3.getMessage());
                    if (FacebookAdapter.this.mNativeListener != null) {
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError3);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
                AdSettings.setMixedAudience(true);
            } else if (mediationAdRequest.taggedForChildDirectedTreatment() == 0) {
                AdSettings.setMixedAudience(false);
            }
        }
    }

    private class BannerListener implements AdListener {
        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        private BannerListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            FacebookAdapter.this.mBannerListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadInterstitial(Context context, String str, MediationAdRequest mediationAdRequest) {
        this.mInterstitialAd = new InterstitialAd(context, str);
        buildAdRequest(mediationAdRequest);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialListener()).build());
    }

    private class InterstitialListener implements InterstitialAdExtendedListener {
        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }

        private InterstitialListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mInterstitialListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, FacebookMediationAdapter.getAdError(adError).getMessage());
            if (FacebookAdapter.this.showInterstitialCalled.get()) {
                FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
                FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
            } else {
                FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (bundle != null) {
            this.isNativeBanner = bundle.getBoolean(FacebookExtras.NATIVE_BANNER);
        }
        if (this.isNativeBanner) {
            this.mNativeBannerAd = new NativeBannerAd(context, str);
            buildAdRequest(nativeMediationAdRequest);
            NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new NativeBannerListener(context, this.mNativeBannerAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
            return;
        }
        this.mMediaView = new MediaView(context);
        this.mNativeAd = new NativeAd(context, str);
        buildAdRequest(nativeMediationAdRequest);
        NativeAd nativeAd = this.mNativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeListener(context, this.mNativeAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
    }

    private class NativeBannerListener implements AdListener, NativeAdListener {
        private final WeakReference<Context> mContext;
        private final NativeBannerAd mNativeBannerAd;

        private NativeBannerListener(Context context, NativeBannerAd nativeBannerAd) {
            this.mContext = new WeakReference<>(context);
            this.mNativeBannerAd = nativeBannerAd;
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.mNativeBannerAd) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new AdError(106, "Ad loaded is not a native banner ad.", "com.google.ads.mediation.facebook"));
                return;
            }
            Context context = this.mContext.get();
            if (context == null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new AdError(107, "Failed to create ad options view. Context is null.", "com.google.ads.mediation.facebook"));
            } else {
                final UnifiedAdMapper unifiedAdMapper = FacebookAdapter.this.new UnifiedAdMapper(this.mNativeBannerAd);
                unifiedAdMapper.mapUnifiedNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.NativeBannerListener.1
                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingSuccess() {
                        FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, unifiedAdMapper);
                    }

                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingFailed(AdError adError) {
                        Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                    }
                });
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                FacebookAdapter.this.mIsImpressionRecorded = true;
            } else {
                Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
            }
        }
    }

    private class NativeListener implements AdListener, NativeAdListener {
        private final WeakReference<Context> mContext;
        private final NativeAd mNativeAd;

        private NativeListener(Context context, NativeAd nativeAd) {
            this.mContext = new WeakReference<>(context);
            this.mNativeAd = nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                FacebookAdapter.this.mIsImpressionRecorded = true;
            } else {
                Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.mNativeAd) {
                AdError adError = new AdError(106, "Ad loaded is not a native ad.", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                return;
            }
            Context context = this.mContext.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Failed to create ad options view. Context is null", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
            } else {
                final UnifiedAdMapper unifiedAdMapper = FacebookAdapter.this.new UnifiedAdMapper(this.mNativeAd);
                unifiedAdMapper.mapUnifiedNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.NativeListener.1
                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingSuccess() {
                        FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, unifiedAdMapper);
                    }

                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingFailed(AdError adError3) {
                        Log.w(FacebookMediationAdapter.TAG, adError3.getMessage());
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError3);
                    }
                });
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            if (!TextUtils.isEmpty(adError.getErrorMessage())) {
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            }
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    private com.facebook.ads.AdSize getAdSize(Context context, AdSize adSize) {
        int width = adSize.getWidth();
        if (width < 0) {
            width = Math.round(adSize.getWidthInPixels(context) / context.getResources().getDisplayMetrics().density);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(0, new AdSize(width, 50));
        arrayList.add(1, new AdSize(width, 90));
        arrayList.add(2, new AdSize(width, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        Log.i(TAG, "Potential ad sizes: " + arrayList);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        Log.i(TAG, "Found closest ad size: " + adSizeFindClosestSize);
        int height = adSizeFindClosestSize.getHeight();
        if (height == com.facebook.ads.AdSize.BANNER_HEIGHT_50.getHeight()) {
            return com.facebook.ads.AdSize.BANNER_HEIGHT_50;
        }
        if (height == com.facebook.ads.AdSize.BANNER_HEIGHT_90.getHeight()) {
            return com.facebook.ads.AdSize.BANNER_HEIGHT_90;
        }
        if (height == com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250.getHeight()) {
            return com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    class UnifiedAdMapper extends UnifiedNativeAdMapper {
        private NativeAd mNativeAd;
        private NativeBannerAd mNativeBannerAd;

        public UnifiedAdMapper(NativeAd nativeAd) {
            this.mNativeAd = nativeAd;
        }

        public UnifiedAdMapper(NativeBannerAd nativeBannerAd) {
            this.mNativeBannerAd = nativeBannerAd;
        }

        public void mapUnifiedNativeAd(Context context, NativeAdMapperListener nativeAdMapperListener) {
            AdOptionsView adOptionsView;
            if (FacebookAdapter.this.isNativeBanner) {
                if (!containsRequiredFieldsForNativeBannerAd(this.mNativeBannerAd)) {
                    AdError adError = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                    Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                    nativeAdMapperListener.onMappingFailed(adError);
                    return;
                }
                setHeadline(this.mNativeBannerAd.getAdHeadline());
                setBody(this.mNativeBannerAd.getAdBodyText());
                if (this.mNativeBannerAd.getPreloadedIconViewDrawable() == null) {
                    if (this.mNativeBannerAd.getAdIcon() == null) {
                        setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage());
                    } else {
                        setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeBannerAd.getAdIcon().getUrl())));
                    }
                } else {
                    setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage(this.mNativeBannerAd.getPreloadedIconViewDrawable()));
                }
                setCallToAction(this.mNativeBannerAd.getAdCallToAction());
                setAdvertiser(this.mNativeBannerAd.getAdvertiserName());
                Bundle bundle = new Bundle();
                bundle.putCharSequence("id", this.mNativeBannerAd.getId());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeBannerAd.getAdSocialContext());
                setExtras(bundle);
            } else {
                if (!containsRequiredFieldsForUnifiedNativeAd(this.mNativeAd)) {
                    AdError adError2 = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                    Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                    nativeAdMapperListener.onMappingFailed(adError2);
                    return;
                }
                setHeadline(this.mNativeAd.getAdHeadline());
                ArrayList arrayList = new ArrayList();
                arrayList.add(FacebookAdapter.this.new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAd.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(this.mNativeAd.getAdBodyText());
                if (this.mNativeAd.getPreloadedIconViewDrawable() == null) {
                    if (this.mNativeAd.getAdIcon() == null) {
                        setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage());
                    } else {
                        setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAd.getAdIcon().getUrl())));
                    }
                } else {
                    setIcon(FacebookAdapter.this.new FacebookAdapterNativeAdImage(this.mNativeAd.getPreloadedIconViewDrawable()));
                }
                setCallToAction(this.mNativeAd.getAdCallToAction());
                setAdvertiser(this.mNativeAd.getAdvertiserName());
                FacebookAdapter.this.mMediaView.setListener(new MediaViewListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.UnifiedAdMapper.1
                    @Override // com.facebook.ads.MediaViewListener
                    public void onEnterFullscreen(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onExitFullscreen(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onFullscreenBackground(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onFullscreenForeground(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onPause(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onPlay(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onVolumeChange(MediaView mediaView, float f) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onComplete(MediaView mediaView) {
                        if (FacebookAdapter.this.mNativeListener != null) {
                            FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                        }
                    }
                });
                setMediaView(FacebookAdapter.this.mMediaView);
                setHasVideoContent(true);
                Double rating = getRating(this.mNativeAd.getAdStarRating());
                if (rating != null) {
                    setStarRating(rating);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putCharSequence("id", this.mNativeAd.getId());
                bundle2.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeAd.getAdSocialContext());
                setExtras(bundle2);
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
            if (FacebookAdapter.this.isNativeBanner) {
                adOptionsView = new AdOptionsView(context, this.mNativeBannerAd, nativeAdLayout);
            } else {
                adOptionsView = new AdOptionsView(context, this.mNativeAd, nativeAdLayout);
            }
            setAdChoicesContent(adOptionsView);
            nativeAdMapperListener.onMappingSuccess();
        }

        private boolean containsRequiredFieldsForUnifiedNativeAd(NativeAd nativeAd) {
            return (nativeAd.getAdHeadline() == null || nativeAd.getAdCoverImage() == null || nativeAd.getAdBodyText() == null || nativeAd.getAdIcon() == null || nativeAd.getAdCallToAction() == null || FacebookAdapter.this.mMediaView == null) ? false : true;
        }

        private boolean containsRequiredFieldsForNativeBannerAd(NativeBannerAd nativeBannerAd) {
            return (nativeBannerAd.getAdHeadline() == null || nativeBannerAd.getAdBodyText() == null || nativeBannerAd.getAdIcon() == null || nativeBannerAd.getAdCallToAction() == null) ? false : true;
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            View value = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    value = entry.getValue();
                }
            }
            if (!FacebookAdapter.this.isNativeBanner) {
                if (value instanceof ImageView) {
                    this.mNativeAd.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, (ImageView) value, arrayList);
                    return;
                } else {
                    Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView.Calling registerViewForInteraction() without a reference to the icon view.");
                    this.mNativeAd.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, arrayList);
                    return;
                }
            }
            if (value == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
            } else if (!(value instanceof ImageView)) {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", value.getClass()));
            } else {
                this.mNativeBannerAd.registerViewForInteraction(view, (ImageView) value);
            }
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void untrackView(View view) {
            NativeBannerAd nativeBannerAd;
            if (FacebookAdapter.this.isNativeBanner && (nativeBannerAd = this.mNativeBannerAd) != null) {
                nativeBannerAd.unregisterView();
            } else {
                NativeAd nativeAd = this.mNativeAd;
                if (nativeAd != null) {
                    nativeAd.unregisterView();
                }
            }
            super.untrackView(view);
        }

        private Double getRating(NativeAdBase.Rating rating) {
            if (rating == null) {
                return null;
            }
            return Double.valueOf((rating.getValue() * 5.0d) / rating.getScale());
        }
    }

    private class FacebookAdapterNativeAdImage extends NativeAd.Image {
        private Drawable mDrawable;
        private Uri mUri;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public FacebookAdapterNativeAdImage() {
        }

        public FacebookAdapterNativeAdImage(Uri uri) {
            this.mUri = uri;
        }

        public FacebookAdapterNativeAdImage(Drawable drawable) {
            this.mDrawable = drawable;
        }

        protected void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.mDrawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.mUri;
        }
    }
}
