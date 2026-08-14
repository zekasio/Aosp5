package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.1
                @Override // java.lang.Runnable
                public void run() {
                    ((com.applovin.impl.sdk.ad.h) appLovinAdDisplayListener).onAdDisplayFailed(str);
                }
            });
        }
    }

    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdDisplayListener.adDisplayed(k.b(appLovinAd));
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdDisplayListener.adHidden(k.b(appLovinAd));
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.32
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdClickListener.adClicked(k.b(appLovinAd));
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdVideoPlaybackListener.videoPlaybackBegan(k.b(appLovinAd));
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.34
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdVideoPlaybackListener.videoPlaybackEnded(k.b(appLovinAd), d, z);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.35
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adOpenedFullscreen(k.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.36
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adClosedFullscreen(k.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                }
            }
        });
    }

    public static void c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.37
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adLeftApplication(k.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adFailedToDisplay(k.b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userRewardVerified(k.b(appLovinAd), map);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userOverQuota(k.b(appLovinAd), map);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                }
            }
        });
    }

    public static void c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userRewardRejected(k.b(appLovinAd), map);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.validationRequestFailed(k.b(appLovinAd), i);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AppLovinAd b(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdLoaded(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                }
            }
        });
    }

    public static void a(final f.b bVar, final MaxAd maxAd) {
        if (maxAd == null || bVar == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bVar.a(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify waterfall processing completed event", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static void a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                }
            }
        });
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    public static void b(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdDisplayed(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                }
            }
        });
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    public static void c(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdHidden(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                }
            }
        });
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void d(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdClicked(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdListener.onAdDisplayFailed(maxAd, maxError);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                }
            }
        });
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static void a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdRevenueListener.onAdRevenuePaid(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad revenue being paid", th);
                }
            }
        });
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    public static void a(final MaxAdRequestListener maxAdRequestListener, final String str, boolean z) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.16
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxAdRequestListener.onAdRequestStarted(str);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify request listener about ad request starting", th);
                }
            }
        });
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void e(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                }
            }
        });
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void f(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                }
            }
        });
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false);
    }

    public static void g(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.20
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                }
            }
        });
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false);
    }

    public static void h(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.21
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                }
            }
        });
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.22
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being loaded", th);
                }
            }
        });
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.24
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad failing to load", th);
                }
            }
        });
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.25
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxNativeAdListener.onNativeAdClicked(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being clicked", th);
                }
            }
        });
    }

    public static void b(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.26
            @Override // java.lang.Runnable
            public void run() {
                try {
                    maxNativeAdListener.onNativeAdExpired(maxAd);
                } catch (Throwable th) {
                    y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being expired", th);
                }
            }
        });
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        y.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.28
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        y.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.29
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
                    } catch (Throwable th) {
                        y.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.k.30
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
                    } catch (Throwable th) {
                        y.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
                    }
                }
            });
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.k.31
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
                    } catch (Throwable th) {
                        y.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
                    }
                }
            });
        }
    }
}
