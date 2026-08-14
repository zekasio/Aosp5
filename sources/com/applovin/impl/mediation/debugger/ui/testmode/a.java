package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0064a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.c.b f1094a;
    private p b;
    private MaxAdView c;
    private MaxAdView d;
    private MaxInterstitialAd e;
    private MaxAppOpenAd f;
    private MaxRewardedInterstitialAd g;
    private MaxRewardedAd h;
    private MaxAd i;
    private MaxNativeAdLoader j;
    private String k;
    private AdControlButton l;
    private AdControlButton m;
    private AdControlButton n;
    private AdControlButton o;
    private AdControlButton p;
    private AdControlButton q;
    private AdControlButton r;
    private Button s;
    private Button t;
    private FrameLayout u;
    private FrameLayout v;
    private Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> w;

    public void initialize(com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f1094a = bVar;
        this.b = bVar.y();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        return this.b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f1094a == null) {
            y.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f1094a.i() + " Test Ads");
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.s = (Button) findViewById(R.id.show_mrec_button);
        this.t = (Button) findViewById(R.id.show_native_button);
        if (!this.f1094a.q() || !this.f1094a.p().contains(MaxAdFormat.MREC)) {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            this.v.setVisibility(8);
            this.s.setBackgroundColor(-1);
            this.t.setBackgroundColor(-3355444);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.u.setVisibility(0);
                    a.this.v.setVisibility(8);
                    a.this.s.setBackgroundColor(-1);
                    a.this.t.setBackgroundColor(-3355444);
                }
            });
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.v.setVisibility(0);
                    a.this.u.setVisibility(8);
                    a.this.t.setBackgroundColor(-1);
                    a.this.s.setBackgroundColor(-3355444);
                }
            });
        }
        if (StringUtils.isValidString(this.f1094a.B()) && this.f1094a.C() != null && this.f1094a.C().size() > 0) {
            AdRegistration.getInstance(this.f1094a.B(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = CollectionUtils.map(this.f1094a.C().size());
            for (MaxAdFormat maxAdFormat : this.f1094a.C().keySet()) {
                map.put(maxAdFormat, new com.applovin.impl.mediation.debugger.a.a(this.f1094a.C().get(maxAdFormat), maxAdFormat, this));
            }
            this.w = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            y.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.b.av().a((String) null);
        MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader == null || (maxAd = this.i) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f1094a.p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.K(), this);
            this.c = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, TJAdUnitConstants.String.FALSE);
            this.c.setListener(this);
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b() {
        this.u = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        if (this.f1094a.p().contains(MaxAdFormat.MREC)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.b.K(), this);
            this.d = maxAdView;
            maxAdView.setListener(this);
            this.u.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.m.setFormat(MaxAdFormat.MREC);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.u.setVisibility(8);
    }

    private void c() {
        if (this.f1094a.p().contains(MaxAdFormat.INTERSTITIAL)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.K(), this);
            this.e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.n.setFormat(MaxAdFormat.INTERSTITIAL);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void d() {
        if (this.f1094a.p().contains(MaxAdFormat.REWARDED)) {
            String str = "test_mode_rewarded_" + this.f1094a.h();
            this.k = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.K(), this);
            this.h = maxRewardedAd;
            maxRewardedAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.q.setFormat(MaxAdFormat.REWARDED);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    private void e() {
        this.v = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f1094a.q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.b.K(), this);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (a.this.i != null) {
                        a.this.j.destroy(a.this.i);
                    }
                    a.this.i = maxAd;
                    a.this.v.removeAllViews();
                    a.this.v.addView(maxNativeAdView);
                    a.this.onAdLoaded(maxAd);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    a.this.onAdLoadFailed(str, maxError);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdClicked(MaxAd maxAd) {
                    a.this.onAdClicked(maxAd);
                }
            });
            this.j.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.r = adControlButton;
            adControlButton.setOnClickListener(this);
            this.r.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.v.setVisibility(8);
    }

    private void a(MaxAdFormat maxAdFormat) {
        this.b.av().a(getTestModeNetwork(maxAdFormat));
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.loadAd();
            return;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.g.loadAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.loadAd();
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.g.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.showAd();
        }
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f1094a.v() != null && this.f1094a.v().containsKey(maxAdFormat)) {
            return this.f1094a.v().get(maxAdFormat);
        }
        return this.f1094a.h();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = this.w;
            if (map != null && map.get(format) != null) {
                this.w.get(format).a();
                return;
            } else {
                a(format);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOAD);
            b(format);
        }
    }

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.l;
        }
        if (str.equals("test_mode_mrec")) {
            return this.m;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.n;
        }
        if (str.equals("test_mode_app_open")) {
            return this.o;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.p;
        }
        if (str.equals(this.k)) {
            return this.q;
        }
        if (str.equals("test_mode_native")) {
            return this.r;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0064a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0064a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.c.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }
}
