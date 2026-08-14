package com.applovin.impl.sdk.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.h;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {
    protected final p b;
    protected final AppLovinAdServiceImpl c;
    private AppLovinAd d;
    private String e;
    private SoftReference<AppLovinAdLoadListener> f;
    private volatile String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f1246a = Collections.synchronizedMap(CollectionUtils.map());
    private final Object g = new Object();
    private volatile boolean i = false;

    public a(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.coreSdk;
        this.c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.L();
        if (y.a()) {
            this.b.L().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference<>(appLovinAdLoadListener);
        if (a()) {
            y.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        b(new C0073a(appLovinAdLoadListener));
    }

    public boolean a() {
        return this.d != null;
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(-300);
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            y.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            c();
        }
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.M().a(new aa(eVar, appLovinAdRewardListener, this.b), o.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public String b() {
        return this.e;
    }

    public void a(String str, Object obj) {
        this.f1246a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            this.b.L();
            if (y.a()) {
                this.b.L().e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd appLovinAdMaybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.b);
        if (appLovinAdMaybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.b.K(), context);
        for (String str : this.f1246a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f1246a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(bVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdMaybeRetrieveNonDummyAd);
        if (appLovinAdMaybeRetrieveNonDummyAd instanceof e) {
            a((e) appLovinAdMaybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            this.b.L();
            if (y.a()) {
                this.b.L().e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd appLovinAdMaybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.b);
        if (appLovinAdMaybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.b.K(), context);
        for (String str : this.f1246a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f1246a.get(str));
        }
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(bVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(bVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdMaybeRetrieveNonDummyAd, viewGroup, lifecycle);
        if (appLovinAdMaybeRetrieveNonDummyAd instanceof e) {
            a((e) appLovinAdMaybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.b.P().a(f.l);
        k.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        k.b(appLovinAdDisplayListener, appLovinAd);
    }

    private class b implements h, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            k.a(this.b, appLovinAd);
        }

        @Override // com.applovin.impl.sdk.ad.h
        public void onAdDisplayFailed(String str) {
            k.a(this.b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.f) {
                appLovinAd = ((com.applovin.impl.sdk.ad.f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
                return;
            }
            a.this.b.L();
            if (y.a()) {
                a.this.b.L().e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        private void a(e eVar) {
            String str;
            int i;
            String strD = a.this.d();
            if (!StringUtils.isValidString(strD) || !a.this.i) {
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().e("IncentivizedAdController", "Invalid reward state - result: " + strD + " and wasFullyEngaged: " + a.this.i);
                }
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.aH();
                if (a.this.i) {
                    a.this.b.L();
                    if (y.a()) {
                        a.this.b.L().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    a.this.b.L();
                    if (y.a()) {
                        a.this.b.L().e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                eVar.a(c.a(str));
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                k.a(this.e, eVar, i);
            }
            a.this.a(eVar);
            a.this.b.L();
            if (y.a()) {
                a.this.b.L().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            k.b(this.b, eVar);
            if (eVar.ag().getAndSet(true)) {
                return;
            }
            a.this.b.L();
            if (y.a()) {
                a.this.b.L().b("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            a.this.b.M().a(new v(eVar, a.this.b), o.a.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            k.a(this.c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            k.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            k.a(this.d, appLovinAd, d, z);
            a.this.i = z;
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            k.a(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            k.b(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            k.c(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            a.this.a("network_timeout");
            k.a(this.e, appLovinAd, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof com.applovin.impl.sdk.ad.f) {
                if (appLovinAd == ((com.applovin.impl.sdk.ad.f) appLovinAd2).a()) {
                    this.d = null;
                }
            } else if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.b.a$a, reason: collision with other inner class name */
    private class C0073a implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener b;

        C0073a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.d = appLovinAd;
            if (this.b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0073a.this.b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0073a.this.b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            y.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                a.this.b.L();
                if (y.a()) {
                    a.this.b.L().e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }
}
