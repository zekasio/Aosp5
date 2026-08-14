package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements b.a, d.a, g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f953a;
    private final com.applovin.impl.sdk.b b;
    private final com.applovin.impl.mediation.b c;
    private final Object d;
    private com.applovin.impl.mediation.a.c e;
    private c f;
    private final AtomicBoolean g;
    private boolean h;
    private boolean i;
    private WeakReference<Activity> j;
    private WeakReference<ViewGroup> k;
    private WeakReference<Lifecycle> l;
    protected final b listenerWrapper;

    public interface a {
        Activity getActivity();
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, p pVar) {
        super(str, maxAdFormat, str2, pVar);
        this.d = new Object();
        this.e = null;
        this.f = c.IDLE;
        this.g = new AtomicBoolean();
        this.j = new WeakReference<>(null);
        this.k = new WeakReference<>(null);
        this.l = new WeakReference<>(null);
        this.f953a = aVar;
        b bVar = new b();
        this.listenerWrapper = bVar;
        this.c = new com.applovin.impl.mediation.b(pVar, bVar);
        if (pVar.V() != null) {
            this.b = null;
        } else {
            this.b = new com.applovin.impl.sdk.b(pVar, this);
        }
        pVar.am().a(this);
        y.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.d) {
            com.applovin.impl.mediation.a.c cVar = this.e;
            z = cVar != null && cVar.g() && this.f == c.READY;
        }
        if (!z) {
            this.sdk.Z().a(this.adUnitId);
        }
        return z;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.d) {
                    if (MaxFullscreenAdImpl.this.e != null) {
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.e + "...");
                        }
                        MaxFullscreenAdImpl.this.sdk.ap().destroyAd(MaxFullscreenAdImpl.this.e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.am().b(MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public void loadAd(Activity activity) {
        loadAd(activity, f.a.PUBLISHER_INITIATED);
    }

    public void loadAd(final Activity activity, final f.a aVar) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            y yVar2 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            y yVar3 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.e + "), listener=" + this.adListener);
            }
            k.a(this.adListener, (MaxAd) this.e, true);
            return;
        }
        a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
            @Override // java.lang.Runnable
            public void run() {
                Context contextY = activity;
                if (contextY == null) {
                    if (MaxFullscreenAdImpl.this.sdk.x() != null) {
                        contextY = MaxFullscreenAdImpl.this.sdk.x();
                    } else {
                        p pVar = MaxFullscreenAdImpl.this.sdk;
                        contextY = p.y();
                    }
                }
                MaxFullscreenAdImpl.this.sdk.ap().loadAd(MaxFullscreenAdImpl.this.adUnitId, null, MaxFullscreenAdImpl.this.adFormat, aVar, MaxFullscreenAdImpl.this.localExtraParameters, MaxFullscreenAdImpl.this.extraParameters, contextY, MaxFullscreenAdImpl.this.listenerWrapper);
            }
        });
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        String strC = this.sdk.av().c();
        if (this.sdk.av().b() && strC != null && !strC.equals(this.e.Y())) {
            final String str3 = "Attempting to show ad from <" + this.e.Y() + "> which does not match selected ad network <" + strC + ">";
            y.i(this.tag, str3);
            a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.e;
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.e);
                    MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3);
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + cVar + ", error=" + maxErrorImpl + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                    }
                    k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl, true);
                    MaxFullscreenAdImpl.this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl, cVar);
                }
            });
            return;
        }
        if (activity == null) {
            activity = this.sdk.x();
        }
        if (a(activity, str)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(str, str2);
                    MaxFullscreenAdImpl.this.h = false;
                    MaxFullscreenAdImpl.this.j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.ap().showFullscreenAd(MaxFullscreenAdImpl.this.e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Activity activityX = this.j.get();
        if (activityX == null) {
            activityX = this.sdk.x();
        }
        Activity activity = activityX;
        if (this.h) {
            showAd(this.e.getPlacement(), this.e.am(), this.k.get(), this.l.get(), activity);
        } else {
            showAd(this.e.getPlacement(), this.e.am(), activity);
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        if (viewGroup == null || lifecycle == null) {
            y.i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl, true);
            this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.e);
            return;
        }
        if (!viewGroup.isShown() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.T)).booleanValue()) {
            y.i(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
            MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
            k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl2, true);
            this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.e);
            return;
        }
        String strC = this.sdk.av().c();
        if (this.sdk.av().b() && strC != null && !strC.equals(this.e.Y())) {
            final String str3 = "Attempting to show ad from <" + this.e.Y() + "> which does not match selected ad network <" + strC + ">";
            y.i(this.tag, str3);
            a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.e;
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.a((MaxAd) maxFullscreenAdImpl.e);
                    MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3);
                    y yVar2 = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + cVar + ", error=" + maxErrorImpl3 + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                    }
                    k.a(MaxFullscreenAdImpl.this.adListener, (MaxAd) cVar, (MaxError) maxErrorImpl3, true);
                    MaxFullscreenAdImpl.this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, cVar);
                }
            });
            return;
        }
        if (activity == null) {
            activity = this.sdk.x();
        }
        final Activity activity2 = activity;
        if (a(activity2, str)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(str, str2);
                    MaxFullscreenAdImpl.this.h = true;
                    MaxFullscreenAdImpl.this.j = new WeakReference(activity2);
                    MaxFullscreenAdImpl.this.k = new WeakReference(viewGroup);
                    MaxFullscreenAdImpl.this.l = new WeakReference(lifecycle);
                    MaxFullscreenAdImpl.this.sdk.ap().showFullscreenAd(MaxFullscreenAdImpl.this.e, viewGroup, lifecycle, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            y.i(this.tag, str2);
            this.sdk.Z().a(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            com.applovin.impl.mediation.k kVar = new com.applovin.impl.mediation.k(this.adUnitId, this.adFormat, str);
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + kVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            k.a(this.adListener, (MaxAd) kVar, (MaxError) maxErrorImpl, true);
            if (this.e != null) {
                this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.e);
            }
            return false;
        }
        p pVar = this.sdk;
        if (Utils.getAlwaysFinishActivitiesSetting(p.y()) != 0 && this.sdk.C().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            p pVar2 = this.sdk;
            if (Utils.isPubInDebugMode(p.y(), this.sdk)) {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.S)).booleanValue()) {
                y.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                y yVar2 = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                }
                k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl2, true);
                this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.e);
                return false;
            }
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.z)).booleanValue() && (this.sdk.Z().a() || this.sdk.Z().b())) {
            y.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
            y yVar3 = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
            }
            k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl3, true);
            this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.e);
            return false;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.A)).booleanValue()) {
            p pVar3 = this.sdk;
            if (!i.a(p.y())) {
                y.i(this.tag, "Attempting to show ad with no internet connection");
                MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-1009);
                y yVar4 = this.logger;
                if (y.a()) {
                    this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl4 + "), listener=" + this.adListener);
                }
                k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl4, true);
                this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.e);
                return false;
            }
        }
        String str3 = this.sdk.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.BLOCK_FULLSCREEN_ADS_SHOWING_IF_ACTIVITY_FINISHING);
        if (((!StringUtils.isValidString(str3) || !Boolean.valueOf(str3).booleanValue()) && !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue()) || activity == null || !activity.isFinishing()) {
            return true;
        }
        y.i(this.tag, "Attempting to show ad when activity is finishing");
        MaxErrorImpl maxErrorImpl5 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
        y yVar5 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl5 + "), listener=" + this.adListener);
        }
        k.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl5, true);
        this.sdk.ap().processAdDisplayErrorPostbackForUserError(maxErrorImpl5, this.e);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        this.c.b(this.e);
        this.e.e(str);
        this.e.f(str2);
        this.sdk.af().a(this.e);
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.e + "...");
        }
        a((com.applovin.impl.mediation.a.a) this.e);
    }

    private void b() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.d) {
            cVar = this.e;
            this.e = null;
        }
        this.sdk.ap().destroyAd(cVar);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdExpired(com.applovin.impl.sdk.ad.g gVar) {
        onAdExpired();
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Ad expired " + getAdUnitId());
        }
        this.g.set(true);
        a aVar = this.f953a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.w().a()) == null) {
            c();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.ap().loadAd(this.adUnitId, null, this.adFormat, f.a.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        boolean zA;
        if (this.sdk.V() != null) {
            zA = this.sdk.V().a(cVar, this);
        } else {
            zA = this.b.a(cVar);
        }
        if (zA) {
            y yVar = this.logger;
            if (y.a()) {
                this.logger.b(this.tag, "Handle ad loaded for regular ad: " + cVar);
            }
            this.e = cVar;
            return;
        }
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.g.compareAndSet(true, false)) {
            synchronized (this.d) {
                cVar = this.e;
                this.e = null;
            }
            this.sdk.ap().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.c cVar = this.e;
        if (cVar == null || !cVar.h().equalsIgnoreCase(str)) {
            return;
        }
        this.e.b(str2);
        k.a(this.adReviewListener, str2, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179 A[Catch: all -> 0x01d4, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x0019, B:90:0x0179, B:92:0x0181, B:93:0x01a3, B:97:0x01cb, B:94:0x01a6, B:96:0x01ae, B:9:0x001f, B:12:0x0025, B:14:0x0029, B:15:0x0031, B:17:0x0039, B:18:0x004d, B:20:0x0051, B:23:0x0057, B:25:0x005b, B:27:0x0065, B:30:0x006b, B:32:0x006f, B:33:0x0077, B:36:0x007d, B:38:0x0085, B:39:0x0099, B:41:0x009d, B:44:0x00a3, B:46:0x00a7, B:47:0x00af, B:49:0x00b3, B:51:0x00bb, B:52:0x00c5, B:55:0x00cb, B:58:0x00d1, B:60:0x00d9, B:61:0x00ee, B:63:0x00f2, B:66:0x00f8, B:68:0x00fc, B:69:0x0105, B:71:0x0109, B:73:0x0111, B:74:0x011c, B:76:0x0120, B:77:0x0129, B:80:0x012e, B:82:0x0136, B:83:0x014b, B:85:0x014f, B:86:0x0158, B:88:0x0160), top: B:107:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6 A[Catch: all -> 0x01d4, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x0019, B:90:0x0179, B:92:0x0181, B:93:0x01a3, B:97:0x01cb, B:94:0x01a6, B:96:0x01ae, B:9:0x001f, B:12:0x0025, B:14:0x0029, B:15:0x0031, B:17:0x0039, B:18:0x004d, B:20:0x0051, B:23:0x0057, B:25:0x005b, B:27:0x0065, B:30:0x006b, B:32:0x006f, B:33:0x0077, B:36:0x007d, B:38:0x0085, B:39:0x0099, B:41:0x009d, B:44:0x00a3, B:46:0x00a7, B:47:0x00af, B:49:0x00b3, B:51:0x00bb, B:52:0x00c5, B:55:0x00cb, B:58:0x00d1, B:60:0x00d9, B:61:0x00ee, B:63:0x00f2, B:66:0x00f8, B:68:0x00fc, B:69:0x0105, B:71:0x0109, B:73:0x0111, B:74:0x011c, B:76:0x0120, B:77:0x0129, B:80:0x012e, B:82:0x0136, B:83:0x014b, B:85:0x014f, B:86:0x0158, B:88:0x0160), top: B:107:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c r13, java.lang.Runnable r14) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        if (this.sdk.V() != null) {
            this.sdk.V().a((com.applovin.impl.mediation.a.c) maxAd);
        } else {
            this.b.a();
        }
        b();
        this.sdk.at().b((com.applovin.impl.mediation.a.a) maxAd);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        sb.append(this.adListener == this.f953a ? "this" : this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    private class b implements a.InterfaceC0058a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.sdk.Z().c(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (!MaxFullscreenAdImpl.this.g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MaxFullscreenAdImpl.this.i) {
                            MaxFullscreenAdImpl.this.a();
                            return;
                        }
                        y yVar = MaxFullscreenAdImpl.this.logger;
                        if (y.a()) {
                            MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                        }
                        k.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                    }
                });
            } else {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.c();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                    }
                    k.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.impl.mediation.f.b
        public void a(MaxAd maxAd) {
            com.applovin.impl.mediation.a.c cVar;
            if (maxAd == null || maxAd == MaxFullscreenAdImpl.this.e) {
                return;
            }
            com.applovin.impl.mediation.a.c cVar2 = (com.applovin.impl.mediation.a.c) maxAd;
            cVar2.i().e().a(this);
            if (cVar2.f().endsWith("load")) {
                onAdRevenuePaid(cVar2);
            }
            synchronized (MaxFullscreenAdImpl.this.d) {
                cVar = MaxFullscreenAdImpl.this.e;
                MaxFullscreenAdImpl.this.e = cVar2;
            }
            if (MaxFullscreenAdImpl.this.sdk.V() == null) {
                MaxFullscreenAdImpl.this.b.a(MaxFullscreenAdImpl.this.e);
            } else {
                MaxFullscreenAdImpl.this.sdk.V().a(cVar);
                MaxFullscreenAdImpl.this.sdk.V().a(MaxFullscreenAdImpl.this.e, MaxFullscreenAdImpl.this);
            }
            MaxFullscreenAdImpl.this.sdk.ap().destroyAd(cVar);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.i = false;
            if (MaxFullscreenAdImpl.this.sdk.V() == null) {
                MaxFullscreenAdImpl.this.b.a();
            } else {
                MaxFullscreenAdImpl.this.sdk.V().a((com.applovin.impl.mediation.a.c) maxAd);
            }
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            k.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.i = false;
            MaxFullscreenAdImpl.this.c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                    }
                    k.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            k.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            k.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z = MaxFullscreenAdImpl.this.i;
            MaxFullscreenAdImpl.this.i = false;
            final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    if (!z && cVar.J() && MaxFullscreenAdImpl.this.sdk.au().a(MaxFullscreenAdImpl.this.adUnitId)) {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MaxFullscreenAdImpl.this.i = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f953a != null ? MaxFullscreenAdImpl.this.f953a.getActivity() : null);
                            }
                        });
                        return;
                    }
                    y yVar = MaxFullscreenAdImpl.this.logger;
                    if (y.a()) {
                        MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                    }
                    k.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxRewardedAdListener.onRewardedVideoStarted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            k.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxRewardedAdListener.onRewardedVideoCompleted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            k.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            k.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxFullscreenAdImpl.this.logger;
            if (y.a()) {
                MaxFullscreenAdImpl.this.logger.b(MaxFullscreenAdImpl.this.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            k.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }
    }
}
