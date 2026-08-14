package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private final p b;
    private final y c;
    private final String d;
    private final com.applovin.impl.mediation.a.f e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private com.applovin.impl.mediation.a.a i;
    private View j;
    private MaxNativeAd k;
    private MaxNativeAdView l;
    private MaxAdapterResponseParameters n;
    private final boolean r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f1112a = new Handler(Looper.getMainLooper());
    private final a m = new a();
    private final AtomicBoolean o = new AtomicBoolean(true);
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final AtomicBoolean q = new AtomicBoolean(false);

    i(com.applovin.impl.mediation.a.f fVar, MaxAdapter maxAdapter, boolean z, p pVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.d = fVar.Y();
        this.g = maxAdapter;
        this.b = pVar;
        this.c = pVar.L();
        this.e = fVar;
        this.f = maxAdapter.getClass().getSimpleName();
        this.r = z;
    }

    void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        a("initialize", new Runnable() { // from class: com.applovin.impl.mediation.i.1
            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                y unused = i.this.c;
                if (y.a()) {
                    i.this.c.b("MediationAdapterWrapper", "Initializing " + i.this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + i.this.e.af());
                }
                i.this.g.initialize(maxAdapterInitializationParameters, activity, new b(i.this.b, i.this.e, jElapsedRealtime, runnable));
            }
        });
    }

    void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.h = str;
        this.i = aVar;
    }

    public View a() {
        return this.j;
    }

    public MaxNativeAd b() {
        return this.k;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public MaxNativeAdView c() {
        return this.l;
    }

    public String d() {
        return this.d;
    }

    public MediationServiceImpl.a e() {
        return this.m.b;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.o.get()) {
            String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            y.i("MediationAdapterWrapper", str2);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
            return;
        }
        this.n = maxAdapterResponseParameters;
        this.m.a(aVar2);
        final MaxAdFormat maxAdFormatP = aVar.p() != null ? aVar.p() : aVar.getFormat();
        if (maxAdFormatP == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.12
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) i.this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, i.this.m);
                }
            };
        } else if (maxAdFormatP == MaxAdFormat.APP_OPEN) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.13
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAppOpenAdapter) i.this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, i.this.m);
                }
            };
        } else if (maxAdFormatP == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.14
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) i.this.g).loadRewardedAd(maxAdapterResponseParameters, activity, i.this.m);
                }
            };
        } else if (maxAdFormatP == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.15
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) i.this.g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, i.this.m);
                }
            };
        } else if (maxAdFormatP == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.16
                @Override // java.lang.Runnable
                public void run() {
                    ((MediationAdapterBase) i.this.g).loadNativeAd(maxAdapterResponseParameters, activity, i.this.m);
                }
            };
        } else if (maxAdFormatP.isAdViewAd()) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.17
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) i.this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormatP, activity, i.this.m);
                }
            };
        } else {
            throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " (" + aVar.p() + ") is not a supported ad format");
        }
        a("load_ad", maxAdFormatP, new Runnable() { // from class: com.applovin.impl.mediation.i.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str3 = "Failed to start loading ad for " + i.this.d + " due to: " + th;
                    y.i("MediationAdapterWrapper", str3);
                    i.this.m.a("load_ad", new MaxErrorImpl(-1, str3));
                    i.this.a("load_ad");
                    i.this.b.an().a(i.this.e.X(), "load_ad", i.this.i);
                }
                if (i.this.p.get()) {
                    return;
                }
                long jAj = i.this.e.aj();
                if (jAj > 0) {
                    y unused = i.this.c;
                    if (y.a()) {
                        i.this.c.b("MediationAdapterWrapper", "Setting timeout " + jAj + "ms. for " + aVar);
                    }
                    i.this.b.M().a(new d(), o.a.MEDIATION_TIMEOUT, jAj);
                    return;
                }
                y unused2 = i.this.c;
                if (y.a()) {
                    i.this.c.b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                }
            }
        });
    }

    public void a(final com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.p() != null) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.19
                    @Override // java.lang.Runnable
                    public void run() {
                        i.this.b.aq().a((com.applovin.impl.mediation.a.c) aVar, activity, i.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) i.this.g).showInterstitialAd(i.this.n, activity, i.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxAppOpenAdapter) i.this.g).showAppOpenAd(i.this.n, activity, i.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) i.this.g).showRewardedAd(i.this.n, activity, i.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) i.this.g).showRewardedInterstitialAd(i.this.n, activity, i.this.m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, aVar);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) i.this.g).showInterstitialAd(i.this.n, viewGroup, lifecycle, activity, i.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) i.this.g).showRewardedAd(i.this.n, viewGroup, lifecycle, activity, i.this.m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, aVar);
        }
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (aVar.i() == null) {
            y.i("MediationAdapterWrapper", "Adapter has been garbage collected");
            this.m.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
            return false;
        }
        if (aVar.i() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != aVar.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (!this.o.get()) {
            String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
            y.i("MediationAdapterWrapper", str);
            this.m.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
            return false;
        }
        if (g()) {
            return true;
        }
        throw new IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
    }

    private void a(final Runnable runnable, com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", aVar.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.i.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad for " + i.this.d + " due to: " + th;
                    y.i("MediationAdapterWrapper", str);
                    i.this.m.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
                    i.this.a("show_ad");
                    i.this.b.an().a(i.this.e.X(), "show_ad", i.this.i);
                }
            }
        });
    }

    public boolean f() {
        return this.o.get();
    }

    public boolean g() {
        return this.p.get() && this.q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            y.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            a("sdk_version");
            this.b.an().a(this.e.X(), "sdk_version", this.i);
            return null;
        }
    }

    public String i() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            y.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            a(TapjoyConstants.TJC_ADAPTER_VERSION);
            this.b.an().a(this.e.X(), TapjoyConstants.TJC_ADAPTER_VERSION, this.i);
            return null;
        }
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.mediation.a.h hVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!this.o.get()) {
            y.i("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f + ") is disabled");
            return;
        }
        final c cVar = new c(hVar, maxSignalCollectionListener);
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter instanceof MaxSignalProvider) {
            final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
            a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.i.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.i.9.1
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str) {
                                i.this.a(str, cVar);
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str) {
                                i.this.b(str, cVar);
                            }
                        });
                    } catch (Throwable th) {
                        String str = "Failed signal collection for " + i.this.d + " due to: " + th;
                        y.i("MediationAdapterWrapper", str);
                        i.this.b(str, cVar);
                        i.this.a("collect_signal");
                        i.this.b.an().a(i.this.e.X(), "collect_signal", i.this.i);
                    }
                    if (cVar.c.get()) {
                        return;
                    }
                    if (hVar.aj() == 0) {
                        y unused = i.this.c;
                        if (y.a()) {
                            i.this.c.b("MediationAdapterWrapper", "Failing signal collection " + hVar + " since it has 0 timeout");
                        }
                        i.this.b("The adapter (" + i.this.f + ") has 0 timeout", cVar);
                        return;
                    }
                    if (hVar.aj() > 0) {
                        y unused2 = i.this.c;
                        if (y.a()) {
                            i.this.c.b("MediationAdapterWrapper", "Setting timeout " + hVar.aj() + "ms. for " + hVar);
                        }
                        i.this.b.M().a(new e(cVar), o.a.MEDIATION_TIMEOUT, hVar.aj());
                        return;
                    }
                    y unused3 = i.this.c;
                    if (y.a()) {
                        i.this.c.b("MediationAdapterWrapper", "Negative timeout set for " + hVar + ", not scheduling a timeout");
                    }
                }
            });
        } else {
            b("The adapter (" + this.f + ") does not support signal collection", cVar);
        }
    }

    void j() {
        if (this.r) {
            return;
        }
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.i.10
            @Override // java.lang.Runnable
            public void run() {
                i.this.a("destroy");
                i.this.g.onDestroy();
                i.this.g = null;
                i.this.j = null;
                i.this.k = null;
                i.this.l = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, c cVar) {
        if (!cVar.c.compareAndSet(false, true) || cVar.b == null) {
            return;
        }
        cVar.b.onSignalCollected(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, c cVar) {
        if (!cVar.c.compareAndSet(false, true) || cVar.b == null) {
            return;
        }
        cVar.b.onSignalCollectionFailed(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (y.a()) {
            this.c.c("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        }
        this.o.set(false);
    }

    private void a(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.i.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    y unused = i.this.c;
                    if (y.a()) {
                        i.this.c.b("MediationAdapterWrapper", i.this.f + ": running " + str + "...");
                    }
                    runnable.run();
                    y unused2 = i.this.c;
                    if (y.a()) {
                        i.this.c.b("MediationAdapterWrapper", i.this.f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    y.c("MediationAdapterWrapper", "Failed operation " + str + " for " + i.this.d, th);
                    i iVar = i.this;
                    StringBuilder sb = new StringBuilder("fail_");
                    sb.append(str);
                    iVar.a(sb.toString());
                    if (str.equals("destroy")) {
                        return;
                    }
                    i.this.b.an().a(i.this.e.X(), str, i.this.i);
                }
            }
        };
        if (a(str, maxAdFormat)) {
            this.f1112a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolShouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.e.af();
        }
        if ("initialize".equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null && (boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) != null) {
            return boolShouldShowAdsOnUiThread.booleanValue();
        }
        return this.e.af();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'}";
    }

    private class d extends com.applovin.impl.sdk.e.a {
        private d() {
            super("TaskTimeoutMediatedAd", i.this.b);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.p.get()) {
                return;
            }
            if (i.this.i.o()) {
                y yVar = this.h;
                if (y.a()) {
                    this.h.b(this.g, i.this.f + " is timing out, considering JS Tag ad loaded: " + i.this.i);
                }
                a(i.this.i);
                return;
            }
            y yVar2 = this.h;
            if (y.a()) {
                this.h.e(this.g, i.this.f + " is timing out " + i.this.i + "...");
            }
            a(i.this.i);
            i.this.m.a(this.g, new MaxErrorImpl(-5101, "Adapter timed out"));
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f.ar().a(aVar);
            }
        }
    }

    private class e extends com.applovin.impl.sdk.e.a {
        private final c b;

        private e(c cVar) {
            super("TaskTimeoutSignalCollection", i.this.b);
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c.get()) {
                return;
            }
            y yVar = this.h;
            if (y.a()) {
                this.h.e(this.g, i.this.f + " is timing out " + this.b.f1155a + "...");
            }
            i.this.b("The adapter (" + i.this.f + ") timed out", this.b);
        }
    }

    private class a implements MaxAdViewAdapterListener, MaxAppOpenAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        private MediationServiceImpl.a b;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.b = aVar;
        }

        private void a(String str, final Bundle bundle) {
            if (i.this.i.A().get()) {
                y unused = i.this.c;
                if (y.a()) {
                    i.this.c.e("MediationAdapterWrapper", i.this.f + ": blocking ad loaded callback for " + i.this.i + " since onAdHidden() has been called");
                }
                i.this.b.ab().b(i.this.i, str);
                return;
            }
            i.this.q.set(true);
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i.this.p.compareAndSet(false, true)) {
                        a.this.b.a(i.this.i, bundle);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (i.this.i.A().get()) {
                y unused = i.this.c;
                if (y.a()) {
                    i.this.c.e("MediationAdapterWrapper", i.this.f + ": blocking ad load failed callback for " + i.this.i + " since onAdHidden() has been called");
                }
                i.this.b.ab().b(i.this.i, str);
                return;
            }
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.12
                @Override // java.lang.Runnable
                public void run() {
                    if (i.this.p.compareAndSet(false, true)) {
                        a.this.b.onAdLoadFailed(i.this.h, maxError);
                    }
                }
            });
        }

        private void b(String str, final Bundle bundle) {
            if (i.this.i.A().get()) {
                y unused = i.this.c;
                if (y.a()) {
                    i.this.c.e("MediationAdapterWrapper", i.this.f + ": blocking ad displayed callback for " + i.this.i + " since onAdHidden() has been called");
                }
                i.this.b.ab().b(i.this.i, str);
                return;
            }
            if (i.this.i.z().compareAndSet(false, true)) {
                a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.13
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b.b(i.this.i, bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (i.this.i.A().get()) {
                y unused = i.this.c;
                if (y.a()) {
                    i.this.c.e("MediationAdapterWrapper", i.this.f + ": blocking ad display failed callback for " + i.this.i + " since onAdHidden() has been called");
                }
                i.this.b.ab().b(i.this.i, str);
                return;
            }
            a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.14
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.a(i.this.i, maxError, bundle);
                }
            });
        }

        private void c(String str, final Bundle bundle) {
            if (i.this.i.A().compareAndSet(false, true)) {
                a(str, this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b.c(i.this.i, bundle);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": interstitial ad loaded with extra info: " + bundle);
            }
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": interstitial ad displayed with extra info: " + bundle);
            }
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": interstitial ad hidden with extra info " + bundle);
            }
            c("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded ad loaded with extra info: " + bundle);
            }
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded ad displayed with extra info: " + bundle);
            }
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded ad hidden with extra info: " + bundle);
            }
            c("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (i.this.i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) i.this.i;
                if (cVar.P().compareAndSet(false, true)) {
                    y unused = i.this.c;
                    if (y.a()) {
                        i.this.c.c("MediationAdapterWrapper", i.this.f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.18
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.b.a(cVar, maxReward, bundle);
                        }
                    });
                }
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.19
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoStarted(i.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoCompleted(i.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            c("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoStarted(i.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onRewardedVideoCompleted(i.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": app open ad loaded with extra info: " + bundle);
            }
            a("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": app open ad displayed with extra info: " + bundle);
            }
            b("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": app open ad hidden with extra info: " + bundle);
            }
            c("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad loaded with extra info: " + bundle);
            }
            i.this.j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad displayed with extra info: " + bundle);
            }
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad hidden with extra info: " + bundle);
            }
            c("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.8
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.e(i.this.i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.onAdCollapsed(i.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": native ad loaded with extra info: " + bundle);
            }
            i.this.k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.d("MediationAdapterWrapper", i.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": native ad displayed with extra info: " + bundle);
            }
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            y unused = i.this.c;
            if (y.a()) {
                i.this.c.c("MediationAdapterWrapper", i.this.f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.b, new Runnable() { // from class: com.applovin.impl.mediation.i.a.10
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.d(i.this.i, bundle);
                }
            });
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            i.this.f1112a.post(new Runnable() { // from class: com.applovin.impl.mediation.i.a.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        y.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener2 != null ? maxAdListener2.getClass().getName() : null), e);
                    }
                }
            });
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.h f1155a;
        private final MaxSignalCollectionListener b;
        private final AtomicBoolean c = new AtomicBoolean();

        c(com.applovin.impl.mediation.a.h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f1155a = hVar;
            this.b = maxSignalCollectionListener;
        }
    }

    private static class b implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f1153a;
        private final com.applovin.impl.mediation.a.f b;
        private final long c;
        private final Runnable d;

        public b(p pVar, com.applovin.impl.mediation.a.f fVar, long j, Runnable runnable) {
            this.f1153a = pVar;
            this.b = fVar;
            this.c = j;
            this.d = runnable;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            long jAk = this.b.ak();
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.i.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f1153a.ao().a(b.this.b, SystemClock.elapsedRealtime() - b.this.c, initializationStatus, str);
                    if (b.this.d != null) {
                        b.this.d.run();
                    }
                }
            };
            if (((Boolean) this.f1153a.a(com.applovin.impl.sdk.c.b.fS)).booleanValue()) {
                this.f1153a.M().a(new z(this.f1153a, runnable), o.a.BACKGROUND, Math.max(jAk, 0L));
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, jAk);
            }
        }
    }
}
