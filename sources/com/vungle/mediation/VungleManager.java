package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.VungleNativeAd;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.vungle.warren.AdConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class VungleManager {
    private static final String PLAYING_PLACEMENT = "placementID";
    private static VungleManager sInstance;
    private final ConcurrentHashMap<String, VungleBannerAd> mVungleBanners = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, VungleNativeAd> mVungleNativeAds = new ConcurrentHashMap<>();

    public static synchronized VungleManager getInstance() {
        if (sInstance == null) {
            sInstance = new VungleManager();
        }
        return sInstance;
    }

    private VungleManager() {
    }

    public String findPlacement(Bundle bundle, Bundle bundle2) {
        String string = (bundle == null || !bundle.containsKey("playPlacement")) ? null : bundle.getString("playPlacement");
        if (bundle2 != null && bundle2.containsKey(PLAYING_PLACEMENT)) {
            if (string != null) {
                Log.i(VungleMediationAdapter.TAG, "'placementID' had a value in both serverParameters and networkExtras. Used one from serverParameters");
            }
            string = bundle2.getString(PLAYING_PLACEMENT);
        }
        if (string == null) {
            Log.e(VungleMediationAdapter.TAG, "placementID not provided from serverParameters.");
        }
        return string;
    }

    private void cleanLeakedBannerAdapters() {
        for (String str : new HashSet(this.mVungleBanners.keySet())) {
            VungleBannerAd vungleBannerAd = this.mVungleBanners.get(str);
            if (vungleBannerAd != null && vungleBannerAd.getAdapter() == null) {
                removeActiveBannerAd(str, vungleBannerAd);
            }
        }
    }

    public synchronized boolean canRequestBannerAd(String str, String str2) {
        cleanLeakedBannerAdapters();
        VungleBannerAd vungleBannerAd = this.mVungleBanners.get(str);
        if (vungleBannerAd == null) {
            return true;
        }
        if (vungleBannerAd.getAdapter() == null) {
            this.mVungleBanners.remove(str);
            return true;
        }
        String uniqueRequestId = vungleBannerAd.getAdapter().getUniqueRequestId();
        Log.d(VungleMediationAdapter.TAG, "activeUniqueId: " + uniqueRequestId + " ###  RequestId: " + str2);
        if (uniqueRequestId == null) {
            Log.w(VungleMediationAdapter.TAG, "Ad already loaded for placement ID: " + str + ", and cannot determine if this is a refresh. Set Vungle extras when making an ad request to support refresh on Vungle banner ads.");
            return false;
        }
        if (uniqueRequestId.equals(str2)) {
            return true;
        }
        Log.w(VungleMediationAdapter.TAG, "Ad already loaded for placement ID: " + str);
        return false;
    }

    public void removeActiveBannerAd(String str, VungleBannerAd vungleBannerAd) {
        Log.d(VungleMediationAdapter.TAG, "try to removeActiveBannerAd: " + str);
        if (!this.mVungleBanners.remove(str, vungleBannerAd) || vungleBannerAd == null) {
            return;
        }
        Log.d(VungleMediationAdapter.TAG, "removeActiveBannerAd: " + vungleBannerAd + "; size=" + this.mVungleBanners.size());
        vungleBannerAd.detach();
        vungleBannerAd.destroyAd();
    }

    public void registerBannerAd(String str, VungleBannerAd vungleBannerAd) {
        removeActiveBannerAd(str, this.mVungleBanners.get(str));
        if (this.mVungleBanners.containsKey(str)) {
            return;
        }
        this.mVungleBanners.put(str, vungleBannerAd);
        Log.d(VungleMediationAdapter.TAG, "registerBannerAd: " + vungleBannerAd + "; size=" + this.mVungleBanners.size());
    }

    public VungleBannerAd getVungleBannerAd(String str) {
        return this.mVungleBanners.get(str);
    }

    public void removeActiveNativeAd(String str, VungleNativeAd vungleNativeAd) {
        Log.d(VungleMediationAdapter.TAG, "try to removeActiveNativeAd: " + str);
        if (!this.mVungleNativeAds.remove(str, vungleNativeAd) || vungleNativeAd == null) {
            return;
        }
        Log.d(VungleMediationAdapter.TAG, "removeActiveNativeAd: " + vungleNativeAd + "; size=" + this.mVungleNativeAds.size());
        vungleNativeAd.destroyAd();
    }

    public void registerNativeAd(String str, VungleNativeAd vungleNativeAd) {
        removeActiveNativeAd(str, this.mVungleNativeAds.get(str));
        if (this.mVungleNativeAds.containsKey(str)) {
            return;
        }
        this.mVungleNativeAds.put(str, vungleNativeAd);
        Log.d(VungleMediationAdapter.TAG, "registerNativeAd: " + vungleNativeAd + "; size=" + this.mVungleNativeAds.size());
    }

    public boolean hasBannerSizeAd(Context context, AdSize adSize, AdConfig adConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(AdConfig.AdSize.BANNER_SHORT.getWidth(), AdConfig.AdSize.BANNER_SHORT.getHeight()));
        arrayList.add(new AdSize(AdConfig.AdSize.BANNER.getWidth(), AdConfig.AdSize.BANNER.getHeight()));
        arrayList.add(new AdSize(AdConfig.AdSize.BANNER_LEADERBOARD.getWidth(), AdConfig.AdSize.BANNER_LEADERBOARD.getHeight()));
        arrayList.add(new AdSize(AdConfig.AdSize.VUNGLE_MREC.getWidth(), AdConfig.AdSize.VUNGLE_MREC.getHeight()));
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            Log.i(VungleMediationAdapter.TAG, "Not found closest ad size: " + adSize);
            return false;
        }
        Log.i(VungleMediationAdapter.TAG, "Found closest ad size: " + adSizeFindClosestSize + " for requested ad size: " + adSize);
        if (adSizeFindClosestSize.getWidth() == AdConfig.AdSize.BANNER_SHORT.getWidth() && adSizeFindClosestSize.getHeight() == AdConfig.AdSize.BANNER_SHORT.getHeight()) {
            adConfig.setAdSize(AdConfig.AdSize.BANNER_SHORT);
            return true;
        }
        if (adSizeFindClosestSize.getWidth() == AdConfig.AdSize.BANNER.getWidth() && adSizeFindClosestSize.getHeight() == AdConfig.AdSize.BANNER.getHeight()) {
            adConfig.setAdSize(AdConfig.AdSize.BANNER);
            return true;
        }
        if (adSizeFindClosestSize.getWidth() == AdConfig.AdSize.BANNER_LEADERBOARD.getWidth() && adSizeFindClosestSize.getHeight() == AdConfig.AdSize.BANNER_LEADERBOARD.getHeight()) {
            adConfig.setAdSize(AdConfig.AdSize.BANNER_LEADERBOARD);
            return true;
        }
        if (adSizeFindClosestSize.getWidth() != AdConfig.AdSize.VUNGLE_MREC.getWidth() || adSizeFindClosestSize.getHeight() != AdConfig.AdSize.VUNGLE_MREC.getHeight()) {
            return true;
        }
        adConfig.setAdSize(AdConfig.AdSize.VUNGLE_MREC);
        return true;
    }
}
