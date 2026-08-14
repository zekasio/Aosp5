package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements ad.a, f.a, g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f945a;
    private final MaxAdView b;
    private final String c;
    private final View d;
    private long e;
    private com.applovin.impl.mediation.a.b f;
    private String g;
    private String h;
    private final a i;
    private final c j;
    private final f k;
    private final ac l;
    private final ad m;
    private final Object n;
    private com.applovin.impl.mediation.a.b o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, p pVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", pVar);
        this.c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.e = Long.MAX_VALUE;
        this.n = new Object();
        this.o = null;
        this.t = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f945a = context.getApplicationContext();
        this.b = maxAdView;
        this.d = view;
        this.i = new a();
        this.j = new c();
        this.k = new f(pVar, this);
        this.l = new ac(maxAdView, pVar);
        this.m = new ad(maxAdView, pVar, this);
        pVar.am().a(this);
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    public void setPlacement(String str) {
        if (this.o != null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.d(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
            }
        }
        this.g = str;
    }

    public String getPlacement() {
        return this.g;
    }

    public void setCustomData(String str) {
        if (this.o != null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.d(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
            }
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.h = str;
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public void setPublisherBackgroundColor(int i) {
        this.e = i;
    }

    public void stopAutoRefresh() {
        if (this.o != null) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Pausing auto-refresh with remaining time: " + this.k.b() + "ms");
            }
            this.k.d();
            return;
        }
        if (this.u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.t)).booleanValue()) {
            this.q = true;
        } else {
            y.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public void startAutoRefresh() {
        this.q = false;
        if (this.k.f()) {
            this.k.e();
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Resumed auto-refresh with remaining time: " + this.k.b() + "ms");
                return;
            }
            return;
        }
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void loadAd() {
        loadAd(f.a.PUBLISHER_INITIATED);
    }

    public void loadAd(f.a aVar) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.t)).booleanValue();
        if (z && !this.k.f() && this.k.a()) {
            y.i(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.k.b()) + " seconds.");
            return;
        }
        if (z) {
            if (this.f != null) {
                y yVar2 = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Rendering cached ad");
                }
                c();
                return;
            }
            if (this.s) {
                y yVar3 = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Waiting for precache ad to load to render");
                }
                this.r = true;
                return;
            }
            y yVar4 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Loading ad...");
            }
            a(aVar, this.i);
            return;
        }
        y yVar5 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Loading ad...");
        }
        a(aVar, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final f.a aVar, final a.InterfaceC0058a interfaceC0058a) {
        if (e()) {
            y.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.o != null) {
                        long jA = MaxAdViewImpl.this.l.a(MaxAdViewImpl.this.o);
                        MaxAdViewImpl.this.extraParameters.put("visible_ad_ad_unit_id", MaxAdViewImpl.this.o.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(jA));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int iPxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.b.getContext(), MaxAdViewImpl.this.b.getWidth());
                    int iPxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.b.getContext(), MaxAdViewImpl.this.b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
                    MaxAdViewImpl.this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(MaxAdViewImpl.this.k.f() || MaxAdViewImpl.this.q));
                    MaxAdViewImpl.this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(MaxAdViewImpl.this.v));
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + interfaceC0058a + "...");
                    }
                    MaxAdViewImpl.this.sdk.ap().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.c, MaxAdViewImpl.this.adFormat, aVar, MaxAdViewImpl.this.localExtraParameters, MaxAdViewImpl.this.extraParameters, MaxAdViewImpl.this.f945a, interfaceC0058a);
                }
            });
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    private void a(String str, String str2) {
        if (AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE.equalsIgnoreCase(str)) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.u = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES.equalsIgnoreCase(str)) {
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.v = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_PRECACHE.equalsIgnoreCase(str)) {
            y yVar3 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated precached disabled to: " + str2);
            }
            this.w = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_REFRESH_ON_AD_EXPAND.equals(str)) {
            y yVar4 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.x = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.FORCE_PRECACHE.equals(str)) {
            y yVar5 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated force precache to: " + str2);
            }
            this.y = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER.equalsIgnoreCase(str)) {
            y yVar6 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Updated is adaptive banner to: " + str2);
            }
            this.z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a();
        if (this.f != null) {
            this.sdk.ap().destroyAd(this.f);
        }
        synchronized (this.n) {
            this.t = true;
        }
        this.k.c();
        this.sdk.am().b(this);
        this.sdk.au().a(this.adUnitId, this.c);
        super.destroy();
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.r)).booleanValue() && this.k.a()) {
            if (r.a(i)) {
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Ad view visible");
                }
                this.k.h();
                return;
            }
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Ad view hidden");
            }
            this.k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.c.a(maxAdView, this.d);
        }
        this.m.a();
        synchronized (this.n) {
            bVar = this.o;
        }
        if (bVar != null) {
            this.sdk.ap().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2
            @Override // java.lang.Runnable
            public void run() {
                View viewR = bVar.r();
                String str = viewR == null ? "MaxAdView does not have a loaded ad view" : null;
                MaxAdView maxAdView = MaxAdViewImpl.this.b;
                if (maxAdView == null) {
                    str = "MaxAdView does not have a parent view";
                }
                if (str == null) {
                    MaxAdViewImpl.this.a();
                    MaxAdViewImpl.this.a((com.applovin.impl.mediation.a.a) bVar);
                    if (bVar.T()) {
                        MaxAdViewImpl.this.m.a(bVar);
                    }
                    maxAdView.setDescendantFocusability(393216);
                    if (bVar.J() != Long.MAX_VALUE) {
                        MaxAdViewImpl.this.d.setBackgroundColor((int) bVar.J());
                    } else if (MaxAdViewImpl.this.e != Long.MAX_VALUE) {
                        MaxAdViewImpl.this.d.setBackgroundColor((int) MaxAdViewImpl.this.e);
                    } else {
                        MaxAdViewImpl.this.d.setBackgroundColor(0);
                    }
                    maxAdView.addView(viewR);
                    MaxAdViewImpl.this.a(viewR, bVar);
                    MaxAdViewImpl.this.sdk.af().a(bVar);
                    MaxAdViewImpl.this.b(bVar);
                    synchronized (MaxAdViewImpl.this.n) {
                        MaxAdViewImpl.this.o = bVar;
                    }
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Scheduling impression for ad manually...");
                    }
                    MaxAdViewImpl.this.sdk.ap().processRawAdImpressionPostback(bVar, MaxAdViewImpl.this.i);
                    if (StringUtils.isValidString(MaxAdViewImpl.this.o.getAdReviewCreativeId())) {
                        k.a(MaxAdViewImpl.this.adReviewListener, MaxAdViewImpl.this.o.getAdReviewCreativeId(), (MaxAd) MaxAdViewImpl.this.o, true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long jA = MaxAdViewImpl.this.l.a(bVar);
                            if (!bVar.T()) {
                                MaxAdViewImpl.this.a(bVar, jA);
                            }
                            MaxAdViewImpl.this.a(jA);
                        }
                    }, bVar.F());
                    return;
                }
                y yVar2 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.e(MaxAdViewImpl.this.tag, str);
                }
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
                y yVar3 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + bVar + ", error=" + maxErrorImpl + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.a(MaxAdViewImpl.this.adListener, bVar, maxErrorImpl);
                MaxAdViewImpl.this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl, bVar);
            }
        });
    }

    private void b() {
        if (d()) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Scheduling refresh precache request now");
            }
            this.s = true;
            this.sdk.M().a(new z(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    y yVar2 = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl.this.a(f.a.SEQUENTIAL_OR_PRECACHE, MaxAdViewImpl.this.j);
                }
            }), com.applovin.impl.mediation.d.c.a(this.adFormat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.n).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (this.q || this.k.f()) {
            if (this.s) {
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                }
                this.s = false;
            }
            if (this.r) {
                y yVar2 = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
                }
                k.a(this.adListener, this.adUnitId, maxError);
                return;
            }
            return;
        }
        this.p = true;
        this.s = false;
        long jLongValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.m)).longValue();
        if (jLongValue >= 0) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
            }
            this.k.a(jLongValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int iD = bVar.D();
        int iE = bVar.E();
        int iDpToPx = iD == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iD);
        int iDpToPx2 = iE != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iE) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : r.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f945a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f945a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.z ? format.getAdaptiveSize(iPxToDp2, this.f945a) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), h.a(this.f945a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb = new StringBuilder("\n**************************************************\n`MaxAdView` size ");
                sb.append(iPxToDp2);
                sb.append("x");
                sb.append(iPxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.z ? "adaptive " : "");
                sb.append("size: ");
                sb.append(iMin);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb.toString();
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.e("AppLovinSdk", string);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        this.r = false;
        if (this.f != null) {
            c();
            return;
        }
        if (d()) {
            if (this.p) {
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                }
                loadAd(f.a.REFRESH);
                return;
            }
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.r = true;
            return;
        }
        y yVar3 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Refreshing ad from network...");
        }
        loadAd(f.a.REFRESH);
    }

    private void c() {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.i.onAdLoaded(this.f);
        this.f = null;
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.o, this.l.a(this.o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.ap().processViewabilityAdImpressionPostback(bVar, j, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (Utils.bitMaskContainsFlag(j, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.x)).longValue()) && !this.y) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.p = true;
            return;
        }
        y yVar3 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
        }
        this.p = false;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.s = false;
        if (this.r) {
            this.r = false;
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.i.onAdLoaded(maxAd);
            return;
        }
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Saving pre-cache ad...");
        }
        com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
        this.f = bVar;
        bVar.e(this.g);
        this.f.f(this.h);
    }

    private boolean d() {
        if (this.w) {
            return false;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.y)).booleanValue();
    }

    private boolean e() {
        boolean z;
        synchronized (this.n) {
            z = this.t;
        }
        return z;
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.b bVar = this.o;
        if (bVar != null && bVar.h().equalsIgnoreCase(str)) {
            this.o.b(str2);
            k.a(this.adReviewListener, str2, this.o);
            return;
        }
        com.applovin.impl.mediation.a.b bVar2 = this.f;
        if (bVar2 == null || !bVar2.h().equalsIgnoreCase(str)) {
            return;
        }
        this.f.b(str2);
    }

    private abstract class b implements a.InterfaceC0058a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f951a;

        @Override // com.applovin.impl.mediation.f.b
        public void a(MaxAd maxAd) {
        }

        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            k.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            k.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.I() || MaxAdViewImpl.this.x) && !MaxAdViewImpl.this.k.f()) {
                    this.f951a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.o)) {
                if ((MaxAdViewImpl.this.o.I() || MaxAdViewImpl.this.x) && this.f951a) {
                    this.f951a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }
    }

    private class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.ap().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.e(MaxAdViewImpl.this.g);
            bVar.f(MaxAdViewImpl.this.h);
            if (bVar.r() != null) {
                MaxAdViewImpl.this.a(bVar);
                if (bVar.G()) {
                    long jH = bVar.H();
                    MaxAdViewImpl.this.sdk.L();
                    if (y.a()) {
                        MaxAdViewImpl.this.sdk.L().b(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jH + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.k.a(jH);
                    if (MaxAdViewImpl.this.k.f() || MaxAdViewImpl.this.q) {
                        y yVar2 = MaxAdViewImpl.this.logger;
                        if (y.a()) {
                            MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.k.d();
                    }
                }
                y yVar3 = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                k.a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.ap().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            k.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }
    }

    private class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.ap().destroyAd(maxAd);
                return;
            }
            y yVar2 = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        sb.append(this.adListener == this.b ? "this" : this.adListener);
        sb.append(", isDestroyed=");
        sb.append(e());
        sb.append('}');
        return sb.toString();
    }
}
