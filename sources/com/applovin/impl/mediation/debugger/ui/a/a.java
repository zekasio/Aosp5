package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0064a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f1044a;
    private com.applovin.impl.mediation.debugger.b.a.a b;
    private b c;
    private com.applovin.impl.mediation.debugger.b.a.b d;
    private MaxAdView e;
    private MaxInterstitialAd f;
    private MaxAppOpenAd g;
    private MaxRewardedInterstitialAd h;
    private MaxRewardedAd i;
    private MaxNativeAdView j;
    private MaxNativeAdLoader k;
    private d l;
    private ListView m;
    private View n;
    private AdControlButton o;
    private TextView p;
    private com.applovin.impl.mediation.debugger.a.a q;

    public void initialize(final com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, final p pVar) {
        List<?> listA;
        this.f1044a = pVar;
        this.b = aVar;
        this.d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.c = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (cVar instanceof b.a) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitDetailActivity.class, pVar.w(), new b.a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.sdk.utils.b.a
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((b.a) cVar).d(), pVar);
                        }
                    });
                }
            }
        });
        a();
        if (aVar.e().d()) {
            if ((bVar != null && !bVar.a().c().A()) || (listA = pVar.as().a(aVar.a())) == null || listA.isEmpty()) {
                return;
            }
            this.q = new com.applovin.impl.mediation.debugger.a.a(listA, aVar.d(), this);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        return this.f1044a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.c.a());
        this.m = (ListView) findViewById(R.id.listView);
        this.n = findViewById(R.id.ad_presenter_view);
        this.o = (AdControlButton) findViewById(R.id.ad_control_button);
        this.p = (TextView) findViewById(R.id.status_textview);
        this.m.setAdapter((ListAdapter) this.c);
        this.p.setText(this.f1044a.av().a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.p.setTypeface(Typeface.DEFAULT_BOLD);
        this.o.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.n.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.d != null) {
            this.f1044a.av().a((String) null);
            this.f1044a.av().a(false);
        }
        MaxAdView maxAdView = this.e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.h;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
    }

    private void a() {
        String strA = this.b.a();
        if (this.b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strA, this.b.d(), this.f1044a.K(), this);
            this.e = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, TJAdUnitConstants.String.FALSE);
            this.e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strA, this.f1044a.K(), this);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.d()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strA, this.f1044a.K());
            this.g = maxAppOpenAd;
            maxAppOpenAd.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(strA, this.f1044a.K(), this);
            this.h = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strA, this.f1044a.K(), this);
            this.i = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strA, this.f1044a.K(), this);
            this.k = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (maxNativeAdView != null) {
                        a.this.j = maxNativeAdView;
                    } else {
                        a aVar = a.this;
                        p unused = a.this.f1044a;
                        aVar.j = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, p.y());
                        a.this.k.render(a.this.j, maxAd);
                    }
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
            this.k.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f1044a.av().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat maxAdFormatD = this.b.d();
        if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            com.applovin.impl.mediation.debugger.a.a aVar = this.q;
            if (aVar != null) {
                aVar.a();
                return;
            } else {
                a(maxAdFormatD);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatD.isAdViewAd() && maxAdFormatD != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(AdControlButton.b.LOAD);
            }
            b(maxAdFormatD);
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.d != null) {
            this.f1044a.av().a(this.d.a().a());
            this.f1044a.av().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.e.setPlacement("[Mediation Debugger Live Ad]");
            this.e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.d()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            this.h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.d()) {
            this.i.loadAd();
        } else if (MaxAdFormat.NATIVE == this.b.d()) {
            this.k.setPlacement("[Mediation Debugger Live Ad]");
            this.k.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    a.this.e.startAutoRefresh();
                }
            });
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            this.f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.d()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            this.h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.b.d()) {
            this.i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.b.d()) {
            a(this.j, MaxAdFormat.MREC.getSize(), null);
        }
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.l != null) {
            return;
        }
        d dVar = new d(viewGroup, size, this);
        this.l = dVar;
        dVar.setOnShowListener(onShowListener);
        this.l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof MaxAdView) {
                    ((MaxAdView) viewGroup2).stopAutoRefresh();
                }
                a.this.l = null;
            }
        });
        this.l.show();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.p.setText(maxAd.getNetworkName() + " ad loaded");
        this.o.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.e, maxAd.getFormat().getSize(), null);
        } else if (MaxAdFormat.NATIVE == this.b.d()) {
            a(this.j, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.o.setControlState(AdControlButton.b.LOAD);
        this.p.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.o.setControlState(AdControlButton.b.LOAD);
        this.p.setText("");
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
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
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
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
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0064a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }
}
