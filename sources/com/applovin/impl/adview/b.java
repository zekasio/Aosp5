package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdDisplayListener A;
    private volatile AppLovinAdViewEventListener B;
    private volatile AppLovinAdClickListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f791a;
    private ViewGroup b;
    private com.applovin.impl.sdk.p c;
    private AppLovinAdServiceImpl d;
    private com.applovin.impl.sdk.y e;
    private AppLovinCommunicator f;
    private AppLovinAdSize h;
    private String i;
    private com.applovin.impl.sdk.d.d j;
    private e k;
    private c l;
    private d m;
    private u n;
    private Runnable o;
    private Runnable p;
    private volatile AppLovinAdLoadListener z;
    private final Map<String, Object> g = Collections.synchronizedMap(CollectionUtils.map());
    private volatile com.applovin.impl.sdk.ad.e q = null;
    private volatile AppLovinAd r = null;
    private l s = null;
    private l t = null;
    private final AtomicReference<AppLovinAd> u = new AtomicReference<>();
    private final AtomicBoolean v = new AtomicBoolean();
    private volatile boolean w = false;
    private volatile boolean x = false;
    private volatile boolean y = false;
    private volatile g D = null;

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.p pVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.c = pVar;
        this.d = pVar.E();
        this.e = pVar.L();
        this.f = AppLovinCommunicator.getInstance(context);
        this.h = appLovinAdSize;
        this.i = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f791a = context;
        this.b = appLovinAdView;
        this.k = new e(this, pVar);
        this.p = new a();
        this.o = new RunnableC0049b();
        this.l = new c(this, pVar);
        a(appLovinAdSize);
    }

    protected void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.k, this.c, this.f791a);
            this.m = dVar;
            dVar.setBackgroundColor(0);
            this.m.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.m);
            b(this.m, appLovinAdSize);
            if (!this.w) {
                a(this.p);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.m.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
                }
            });
            this.w = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.v.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int iApplyDimension2 = -1;
        if (appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
            iApplyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            iApplyDimension = displayMetrics.widthPixels;
        } else {
            iApplyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                iApplyDimension2 = displayMetrics.heightPixels;
            } else {
                iApplyDimension2 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.utils.c.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
            if (com.applovin.impl.sdk.utils.c.b(attributeSet)) {
                a();
            }
        }
    }

    public void a() {
        if (this.c != null && this.l != null && this.f791a != null && this.w) {
            this.d.loadNextAd(this.i, this.h, this.l);
        } else {
            com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.z = appLovinAdLoadListener;
    }

    public AppLovinAdSize b() {
        return this.h;
    }

    public String c() {
        return this.i;
    }

    public void d() {
        if (!this.w || this.x) {
            return;
        }
        this.x = true;
    }

    public void e() {
        if (this.w) {
            AppLovinAd andSet = this.u.getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
            this.x = false;
        }
    }

    public void f() {
        if (this.m != null && this.s != null) {
            k();
        }
        t();
    }

    private void t() {
        if (this.e != null && com.applovin.impl.sdk.y.a() && com.applovin.impl.sdk.y.a()) {
            this.e.b("AppLovinAdView", "Destroying...");
        }
        com.applovin.impl.sdk.utils.s.a(this.m);
        this.m = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.B = null;
        this.x = true;
    }

    public AppLovinAdViewEventListener g() {
        return this.B;
    }

    public void a(String str, Object obj) {
        this.g.put(str, obj);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.A = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.B = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.C = appLovinAdClickListener;
    }

    public void a(g gVar) {
        this.D = gVar;
    }

    public g h() {
        return this.D;
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.s != null) {
                    com.applovin.impl.sdk.y unused = b.this.e;
                    if (com.applovin.impl.sdk.y.a()) {
                        b.this.e.b("AppLovinAdView", "Detaching expanded ad: " + b.this.s.a());
                    }
                    b bVar = b.this;
                    bVar.t = bVar.s;
                    b.this.s = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.h);
                }
            }
        });
    }

    public void i() {
        if (com.applovin.impl.sdk.utils.c.a(this.m)) {
            this.c.P().a(com.applovin.impl.sdk.d.f.o);
        }
    }

    public void j() {
        if (this.w) {
            com.applovin.impl.sdk.utils.k.b(this.A, this.q);
            if (this.q != null && this.q.isOpenMeasurementEnabled() && Utils.isBML(this.q.getSize())) {
                this.q.o().e();
            }
            if (this.m != null && this.s != null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                u();
            } else if (com.applovin.impl.sdk.y.a()) {
                this.e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    public void a(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        Utils.validateAdSdkKey(appLovinAd, this.c);
        if (this.w) {
            com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.c);
            if (eVar == null || eVar == this.q) {
                if (eVar == null) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.e.d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.y.a()) {
                    this.e.d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
                }
                if (((Boolean) this.c.a(com.applovin.impl.sdk.c.b.co)).booleanValue()) {
                    throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                }
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.e.b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
            }
            com.applovin.impl.sdk.utils.k.b(this.A, this.q);
            if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                w();
            }
            if (this.q != null && this.q.isOpenMeasurementEnabled()) {
                this.q.o().e();
            }
            this.u.set(null);
            this.r = null;
            this.q = eVar;
            if (!this.x && Utils.isBML(this.h)) {
                this.c.E().trackImpression(eVar);
            }
            if (this.s != null) {
                u();
            }
            a(this.o);
            return;
        }
        com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
    }

    public void a(final WebView webView) {
        if (this.q == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.q != this.r) {
                this.r = this.q;
                if (this.A != null) {
                    this.c.af().a(this.q);
                    com.applovin.impl.sdk.utils.k.a(this.A, this.q);
                    this.m.a("javascript:al_onAdViewRendered();");
                }
                if (Utils.isBML(this.h) && this.q.isOpenMeasurementEnabled()) {
                    this.c.M().a(new z(this.c, new Runnable() { // from class: com.applovin.impl.adview.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.q.o().b(webView);
                            if (b.this.n == null || !b.this.n.b()) {
                                b.this.q.o().a((View) webView);
                            } else {
                                b.this.q.o().a(webView, Collections.singletonList(new com.applovin.impl.sdk.a.d(b.this.n, FriendlyObstructionPurpose.NOT_VISIBLE, b.this.n.getIdentifier())));
                            }
                            b.this.q.o().c();
                            b.this.q.o().d();
                        }
                    }), o.a.MAIN, 500L);
                }
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.s == null && (b.this.q instanceof com.applovin.impl.sdk.ad.a) && b.this.m != null) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) b.this.q;
                    Activity activityRetrieveParentActivity = b.this.f791a instanceof Activity ? (Activity) b.this.f791a : Utils.retrieveParentActivity(b.this.m, b.this.c);
                    if (activityRetrieveParentActivity != null && !activityRetrieveParentActivity.isFinishing()) {
                        if (b.this.b != null) {
                            b.this.b.removeView(b.this.m);
                        }
                        b.this.s = new l(aVar, b.this.m, activityRetrieveParentActivity, b.this.c);
                        b.this.s.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.6.1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface) {
                                b.this.k();
                            }
                        });
                        b.this.s.show();
                        com.applovin.impl.sdk.utils.k.a(b.this.B, b.this.q, (AppLovinAdView) b.this.b);
                        if (b.this.j != null) {
                            b.this.j.d();
                        }
                        if (b.this.q.isOpenMeasurementEnabled()) {
                            b.this.q.o().a((View) b.this.s.b());
                            return;
                        }
                        return;
                    }
                    com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    Uri uriJ = aVar.j();
                    if (uriJ != null) {
                        AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.d;
                        AppLovinAdView appLovinAdViewR = b.this.r();
                        b bVar = b.this;
                        appLovinAdServiceImpl.trackAndLaunchClick(aVar, appLovinAdViewR, bVar, uriJ, pointF, bVar.y, false);
                        if (b.this.j != null) {
                            b.this.j.b();
                        }
                    }
                    b.this.m.a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.b == null || b.this.m == null || b.this.m.getParent() != null) {
                    return;
                }
                b.this.b.addView(b.this.m);
                b.b(b.this.m, b.this.q.getSize());
                if (b.this.q.isOpenMeasurementEnabled()) {
                    b.this.q.o().a((View) b.this.m);
                }
            }
        });
    }

    public void l() {
        if (this.s != null || this.t != null) {
            k();
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.e.b("AppLovinAdView", "Ad: " + this.q + " closed.");
        }
        a(this.p);
        com.applovin.impl.sdk.utils.k.b(this.A, this.q);
        this.q = null;
    }

    void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF, boolean z) {
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.y, z);
        } else if (com.applovin.impl.sdk.y.a()) {
            this.e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        com.applovin.impl.sdk.utils.k.a(this.C, eVar);
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.x) {
                a(appLovinAd);
            } else {
                this.u.set(appLovinAd);
                if (com.applovin.impl.sdk.y.a()) {
                    this.e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.8
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.v.compareAndSet(true, false)) {
                        b bVar = b.this;
                        bVar.a(bVar.h);
                    }
                    try {
                        if (b.this.z != null) {
                            b.this.z.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y.i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.e.e("AppLovinAdView", "No provided when to the view controller");
        }
        a(-1);
    }

    void a(final int i) {
        if (!this.x) {
            a(this.p);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.z != null) {
                        b.this.z.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    public void m() {
        this.y = true;
    }

    public void n() {
        this.y = false;
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void o() {
        if ((this.f791a instanceof k) && this.q != null && this.q.G() == e.a.DISMISS) {
            ((k) this.f791a).dismiss();
        }
    }

    public com.applovin.impl.sdk.ad.e p() {
        return this.q;
    }

    public com.applovin.impl.sdk.p q() {
        return this.c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.b;
    }

    public d s() {
        return this.m;
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.m;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a aVarA;
                if (b.this.t == null && b.this.s == null) {
                    return;
                }
                if (b.this.t != null) {
                    aVarA = b.this.t.a();
                    b.this.t.dismiss();
                    b.this.t = null;
                } else {
                    aVarA = b.this.s.a();
                    b.this.s.dismiss();
                    b.this.s = null;
                }
                com.applovin.impl.sdk.utils.k.b(b.this.B, aVarA, (AppLovinAdView) b.this.b);
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.j;
        if (dVar != null) {
            dVar.c();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.applovin.impl.sdk.ad.e eVar = this.q;
        com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
        lVar.a().a(eVar).a(r());
        if (!Utils.isBML(eVar.getSize())) {
            lVar.a().a("Fullscreen Ad Properties").b(eVar);
        }
        lVar.a(this.c);
        lVar.a();
        if (com.applovin.impl.sdk.y.a()) {
            this.e.b("AppLovinAdView", lVar.toString());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.s().loadUrl("chrome://crash");
                }
            });
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "b";
    }

    static class c implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f806a;

        c(b bVar, com.applovin.impl.sdk.p pVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (pVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f806a = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b bVarA = a();
            if (bVarA != null) {
                bVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.y.i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            b bVarA = a();
            if (bVarA != null) {
                bVarA.a(i);
            }
        }

        private b a() {
            return this.f806a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.b$b, reason: collision with other inner class name */
    private class RunnableC0049b implements Runnable {
        private RunnableC0049b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.q != null) {
                if (b.this.m != null) {
                    b.this.x();
                    com.applovin.impl.sdk.y unused = b.this.e;
                    if (com.applovin.impl.sdk.y.a()) {
                        b.this.e.b("AppLovinAdView", "Rendering advertisement ad for #" + b.this.q.getAdIdNumber() + "...");
                    }
                    b.b(b.this.m, b.this.q.getSize());
                    if (b.this.n != null) {
                        com.applovin.impl.sdk.utils.r.a(b.this.n);
                        b.this.n = null;
                    }
                    if (((Boolean) b.this.c.a(com.applovin.impl.sdk.c.b.az)).booleanValue()) {
                        b.this.n = new u(new o(b.this.g, b.this.c), b.this.f791a);
                        b.this.n.a(new u.a() { // from class: com.applovin.impl.adview.b.b.1
                            @Override // com.applovin.impl.adview.u.a
                            public void a() {
                                b.this.m.addView(b.this.n, new ViewGroup.LayoutParams(-1, -1));
                            }

                            @Override // com.applovin.impl.adview.u.a
                            public void b() {
                                com.applovin.impl.sdk.y unused2 = b.this.e;
                                if (com.applovin.impl.sdk.y.a()) {
                                    b.this.e.e("AppLovinAdView", "Watermark failed to render.");
                                }
                            }
                        });
                    }
                    b.this.m.a(b.this.q);
                    if (b.this.q.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.x) {
                        b bVar = b.this;
                        bVar.j = new com.applovin.impl.sdk.d.d(bVar.q, b.this.c);
                        b.this.j.a();
                        b.this.m.setStatsManagerHelper(b.this.j);
                        b.this.q.setHasShown(true);
                    }
                    if (b.this.m.getStatsManagerHelper() != null) {
                        b.this.m.getStatsManagerHelper().a(b.this.q.A() ? 0L : 1L);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y.i("AppLovinAdView", "Unable to render advertisement for ad #" + b.this.q.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                com.applovin.impl.sdk.utils.k.a(b.this.B, b.this.q, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
            }
        }
    }

    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.m != null) {
                b.this.m.setVisibility(8);
            }
        }
    }
}
