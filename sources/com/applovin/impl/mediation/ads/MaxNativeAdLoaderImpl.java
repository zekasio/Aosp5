package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements d.a, d.a {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f967a;
    private String b;
    private String c;
    private f.a d;
    private MaxNativeAdListener e;
    private final Map<String, MaxNativeAdView> f;
    private final Object g;

    public MaxNativeAdLoaderImpl(String str, p pVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", pVar);
        this.f967a = new a();
        this.d = f.a.PUBLISHER_INITIATED;
        this.f = CollectionUtils.map();
        this.g = new Object();
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f967a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        MediationServiceImpl mediationServiceImplAp = this.sdk.ap();
        String str = this.adUnitId;
        MaxAdFormat maxAdFormat = MaxAdFormat.NATIVE;
        f.a aVar = this.d;
        Map<String, Object> map = this.localExtraParameters;
        Map<String, Object> map2 = this.extraParameters;
        p pVar = this.sdk;
        mediationServiceImplAp.loadAd(str, lowerCase, maxAdFormat, aVar, map, map2, p.y(), this.f967a);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.mediation.a.d)) {
            y.i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            y.i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.E)).booleanValue()) {
            y.i(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, dVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void registerClickableViews(final List<View> list, final ViewGroup viewGroup, MaxAd maxAd) {
        com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.e(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        this.sdk.af().a(dVar);
        a((com.applovin.impl.mediation.a.a) dVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new b(dVar, viewGroup, this.f967a, this.sdk));
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (nativeAd.prepareForInteraction(list, viewGroup)) {
                    return;
                }
                y.i(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
            }
        };
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.M().a(new z(this.sdk, runnable), o.a.MEDIATION_MAIN);
        }
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((com.applovin.impl.mediation.a.d) maxAd).getNativeAd();
        if (nativeAd == null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.e(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.b();
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.e = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public String getPlacement() {
        return this.b;
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.e = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        b adViewTracker;
        if (maxAd instanceof com.applovin.impl.mediation.a.d) {
            com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
            if (dVar.G()) {
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Native ad (" + dVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            MaxNativeAdView maxNativeAdViewD = dVar.D();
            if (maxNativeAdViewD != null && (adViewTracker = maxNativeAdViewD.getAdViewTracker()) != null && maxAd.equals(adViewTracker.c())) {
                maxNativeAdViewD.recycle();
            }
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            if (this.sdk.V() != null) {
                this.sdk.V().a(dVar);
            } else {
                dVar.K();
            }
            this.sdk.ap().destroyAd(dVar);
            this.sdk.au().a(this.adUnitId, dVar.a());
            return;
        }
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof f.a)) {
            this.d = (f.a) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.d dVar) {
        if (this.sdk.V() != null) {
            if (dVar.H().get()) {
                return;
            }
            this.sdk.V().a(dVar, this);
            return;
        }
        dVar.a(this);
    }

    @Override // com.applovin.impl.mediation.a.d.a
    public void onAdExpiredOld(com.applovin.impl.mediation.a.d dVar) {
        onAdExpired(dVar);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdExpired(g gVar) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + gVar + "), listener=" + this.e);
        }
        k.b(this.e, (MaxAd) gVar, true);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.g) {
            this.f.put(str, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdViewRemove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.g) {
            maxNativeAdViewRemove = this.f.remove(str);
        }
        return maxNativeAdViewRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MaxNativeAdView maxNativeAdView, final com.applovin.impl.mediation.a.d dVar, final MaxNativeAd maxNativeAd) {
        dVar.a(maxNativeAdView);
        a((com.applovin.impl.mediation.a.a) dVar);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.2
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxNativeAdLoaderImpl.this.logger;
                if (y.a()) {
                    MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Rendering native ad view: " + maxNativeAdView);
                }
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f967a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                if (maxNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView)) {
                    return;
                }
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        } else {
            this.sdk.M().a(new z(this.sdk, runnable), o.a.MEDIATION_MAIN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (h.c()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.b();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.b();
            }
        }
    }

    private class a implements a.InterfaceC0058a {
        @Override // com.applovin.impl.mediation.f.b
        public void a(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        private a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Native ad loaded");
                    }
                    com.applovin.impl.mediation.a.d dVar = (com.applovin.impl.mediation.a.d) maxAd;
                    dVar.e(MaxNativeAdLoaderImpl.this.b);
                    dVar.f(MaxNativeAdLoaderImpl.this.c);
                    MaxNativeAdLoaderImpl.this.sdk.af().a(dVar);
                    MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(dVar.a());
                    if (maxNativeAdViewA == null) {
                        y yVar2 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "No custom view provided, checking template");
                        }
                        String strE = dVar.E();
                        if (StringUtils.isValidString(strE)) {
                            y yVar3 = MaxNativeAdLoaderImpl.this.logger;
                            if (y.a()) {
                                MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Using template: " + strE + "...");
                            }
                            p pVar = MaxNativeAdLoaderImpl.this.sdk;
                            maxNativeAdViewA = new MaxNativeAdView(strE, p.y());
                        }
                    }
                    if (maxNativeAdViewA != null) {
                        a.this.a(maxNativeAdViewA);
                        MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, dVar, dVar.getNativeAd());
                        y yVar4 = MaxNativeAdLoaderImpl.this.logger;
                        if (y.a()) {
                            MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.e);
                        }
                        k.a(MaxNativeAdLoaderImpl.this.e, maxNativeAdViewA, maxAd, true);
                        MaxNativeAdLoaderImpl.this.a(dVar);
                        MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
                        return;
                    }
                    y yVar5 = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                    }
                    y yVar6 = MaxNativeAdLoaderImpl.this.logger;
                    if (y.a()) {
                        MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.e);
                    }
                    k.a(MaxNativeAdLoaderImpl.this.e, (MaxNativeAdView) null, maxAd, true);
                    MaxNativeAdLoaderImpl.this.a(dVar);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.e);
            }
            k.a(MaxNativeAdLoaderImpl.this.e, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.e);
            }
            k.a(MaxNativeAdLoaderImpl.this.e, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            k.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MaxNativeAdView maxNativeAdView) {
            com.applovin.impl.mediation.a.d dVarC;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (dVarC = adViewTracker.c()) == null) {
                return;
            }
            y yVar = MaxNativeAdLoaderImpl.this.logger;
            if (y.a()) {
                MaxNativeAdLoaderImpl.this.logger.b(MaxNativeAdLoaderImpl.this.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(dVarC);
        }
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.e + ", revenueListener=" + this.revenueListener + '}';
    }
}
