package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.o;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements AppLovinBroadcastManager.Receiver, b.a {
    private long B;
    private boolean C;
    private final l F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f738a;
    protected final p b;
    protected final y c;
    protected final com.applovin.impl.sdk.d.d d;
    protected Activity e;
    protected AppLovinAdView f;
    protected u g;
    protected final m h;
    protected final m i;
    protected boolean l;
    protected boolean p;
    protected AppLovinAdClickListener q;
    protected AppLovinAdDisplayListener r;
    protected AppLovinAdVideoPlaybackListener s;
    protected final com.applovin.impl.sdk.b.b t;
    protected com.applovin.impl.sdk.utils.p u;
    private final com.applovin.impl.sdk.utils.a w;
    private final AppLovinBroadcastManager.Receiver x;
    private final k.a y;
    private final Handler v = new Handler(Looper.getMainLooper());
    protected final long j = SystemClock.elapsedRealtime();
    private final AtomicBoolean z = new AtomicBoolean();
    private final AtomicBoolean A = new AtomicBoolean();
    protected long k = -1;
    private int D = 0;
    private final ArrayList<Long> E = new ArrayList<>();
    protected int m = 0;
    protected int n = 0;
    protected int o = k.f1337a;
    private boolean G = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0048a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    public abstract void a(long j);

    public abstract void a(ViewGroup viewGroup);

    public abstract void d();

    public abstract void e();

    protected abstract void m();

    protected abstract boolean r();

    protected abstract boolean s();

    protected abstract void u();

    static /* synthetic */ int c(a aVar) {
        int i = aVar.D;
        aVar.D = i + 1;
        return i;
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map<String, Object> map, p pVar, Activity activity, InterfaceC0048a interfaceC0048a) {
        a bVar;
        boolean zAJ = eVar.aJ();
        if (eVar instanceof com.applovin.impl.c.a) {
            if (zAJ) {
                try {
                    bVar = new c(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    try {
                        bVar = new d(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        interfaceC0048a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + pVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new d(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    interfaceC0048a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + pVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (eVar.hasVideoUrl()) {
            if (eVar.aM()) {
                try {
                    bVar = new g(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th4) {
                    interfaceC0048a.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + pVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (zAJ) {
                try {
                    bVar = new e(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th5) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    try {
                        bVar = new f(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th6) {
                        interfaceC0048a.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + pVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new f(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    interfaceC0048a.a("Failed to create FullscreenVideoAdPresenter with sdk: " + pVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                bVar = new com.applovin.impl.adview.activity.b.b(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                interfaceC0048a.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + pVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        bVar.c();
        interfaceC0048a.a(bVar);
    }

    a(final com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, final p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f738a = eVar;
        this.b = pVar;
        this.c = pVar.L();
        this.e = activity;
        this.q = appLovinAdClickListener;
        this.r = appLovinAdDisplayListener;
        this.s = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, pVar);
        this.t = bVar;
        bVar.a(this);
        com.applovin.impl.sdk.d.d dVar = new com.applovin.impl.sdk.d.d(eVar, pVar);
        this.d = dVar;
        this.F = new l(pVar);
        b bVar2 = new b();
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cU)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        n nVar = new n(pVar.K(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                y yVar = a.this.c;
                if (y.a()) {
                    a.this.c.b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                y yVar = a.this.c;
                if (y.a()) {
                    a.this.c.b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                a.this.h();
            }
        });
        this.f.getController().a(dVar);
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.az)).booleanValue()) {
            this.g = new u(new o(map, pVar), activity);
        }
        pVar.E().trackImpression(eVar);
        List<Integer> listU = eVar.u();
        if (eVar.t() >= 0 || listU != null) {
            m mVar = new m(eVar.v(), activity);
            this.h = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(bVar2);
        } else {
            this.h = null;
        }
        m mVar2 = new m(i.a.WHITE_ON_TRANSPARENT, activity);
        this.i = mVar2;
        mVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.h();
            }
        });
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cE)).booleanValue()) {
            this.x = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Intent intent, Map<String, Object> map2) {
                    pVar.E().trackAppKilled(eVar);
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            };
        } else {
            this.x = null;
        }
        if (eVar.al()) {
            this.y = new k.a() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // com.applovin.impl.sdk.k.a
                public void a(int i) {
                    if (a.this.o != k.f1337a) {
                        a.this.p = true;
                    }
                    com.applovin.impl.adview.d dVarS = a.this.f.getController().s();
                    if (k.a(i) && !k.a(a.this.o)) {
                        dVarS.a("javascript:al_muteSwitchOn();");
                    } else if (i == 2) {
                        dVarS.a("javascript:al_muteSwitchOff();");
                    }
                    a.this.o = i;
                }
            };
        } else {
            this.y = null;
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fo)).booleanValue()) {
            this.w = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                    if (a.this.A.get()) {
                        return;
                    }
                    if (activity2.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity2.getApplicationContext()))) {
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                y.i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                try {
                                    a.this.h();
                                } catch (Throwable th) {
                                    y.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                                    try {
                                        a.this.n();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        });
                    }
                }
            };
        } else {
            this.w = null;
        }
    }

    private void c() {
        AppLovinBroadcastManager.Receiver receiver = this.x;
        if (receiver != null) {
            AppLovinBroadcastManager.registerReceiver(receiver, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.y != null) {
            this.b.ad().a(this.y);
        }
        if (this.w != null) {
            this.b.w().a(this.w);
        }
    }

    protected void a(boolean z) {
        List<Uri> listCheckCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.f738a, this.b, this.e);
        if (listCheckCachedResourcesExist.isEmpty()) {
            return;
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ft)).booleanValue()) {
            if (y.a()) {
                this.c.e("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listCheckCachedResourcesExist);
            }
            com.applovin.impl.adview.p.a(this.f738a, this.r, "Missing ad resources", null, null);
            h();
            return;
        }
        if (y.a()) {
            this.c.e("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listCheckCachedResourcesExist);
        }
        this.f738a.a();
    }

    protected void b(boolean z) {
        a(z, ((Long) this.b.a(com.applovin.impl.sdk.c.b.cR)).longValue());
        com.applovin.impl.sdk.utils.k.a(this.r, this.f738a);
        this.b.Z().a(this.f738a);
        if (this.f738a.hasVideoUrl() || t()) {
            com.applovin.impl.sdk.utils.k.a(this.s, this.f738a);
        }
        new com.applovin.impl.adview.activity.b(this.e).a(this.f738a);
        this.d.a();
        this.f738a.setHasShown(true);
    }

    public void f() {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onResume()");
        }
        this.d.d(SystemClock.elapsedRealtime() - this.B);
        a("javascript:al_onAppResumed();");
        q();
        if (this.t.c()) {
            this.t.a();
        }
    }

    public void c(boolean z) {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    public void g() {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onPause()");
        }
        this.B = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        if (this.t.c()) {
            this.t.a();
        }
        p();
    }

    public void h() {
        this.C = true;
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.e eVar = this.f738a;
        if (eVar != null) {
            eVar.o().e();
        }
        this.v.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f738a.T());
        n();
        this.d.c();
        this.F.a();
        if (this.x != null) {
            com.applovin.impl.sdk.utils.p.a(TimeUnit.SECONDS.toMillis(2L), this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.e.stopService(new Intent(a.this.e.getApplicationContext(), (Class<?>) AppKilledService.class));
                    AppLovinBroadcastManager.unregisterReceiver(a.this.x);
                }
            });
        }
        if (this.y != null) {
            this.b.ad().b(this.y);
        }
        if (this.w != null) {
            this.b.w().b(this.w);
        }
        if (o()) {
            this.e.finish();
            return;
        }
        this.b.L();
        if (y.a()) {
            this.b.L().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        k();
    }

    public boolean i() {
        return this.C;
    }

    public void j() {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public void k() {
        AppLovinAdView appLovinAdView = this.f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f.destroy();
            this.f = null;
            if ((parent instanceof ViewGroup) && o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        n();
        this.q = null;
        this.r = null;
        this.s = null;
        this.e = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void a(Configuration configuration) {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i, KeyEvent keyEvent) {
        if (this.c == null || !y.a()) {
            return;
        }
        this.c.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    public void l() {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.G) {
            h();
        }
        if (this.f738a.V()) {
            b("javascript:onBackPressed();");
        }
    }

    protected void a(String str) {
        if (this.f738a.W()) {
            a(str, 0L);
        }
    }

    protected void b(String str) {
        a(str, 0L);
    }

    protected void a(final String str, long j) {
        if (j >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.d dVarS;
                    if (!StringUtils.isValidString(str) || a.this.f == null || (dVarS = a.this.f.getController().s()) == null) {
                        return;
                    }
                    dVarS.a(str);
                }
            }, j);
        }
    }

    protected void a(m mVar, long j, Runnable runnable) {
        if (j >= ((Long) this.b.a(com.applovin.impl.sdk.c.b.cB)).longValue()) {
            return;
        }
        this.b.M().a(new z(this.b, new AnonymousClass9(mVar, runnable)), o.a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.b.a$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f749a;
        final /* synthetic */ Runnable b;

        AnonymousClass9(m mVar, Runnable runnable) {
            this.f749a = mVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.9.1
                @Override // java.lang.Runnable
                public void run() {
                    r.a(AnonymousClass9.this.f749a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.9.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass9.this.f749a.bringToFront();
                            AnonymousClass9.this.b.run();
                        }
                    });
                }
            });
        }
    }

    protected void a(int i, boolean z, boolean z2, long j) {
        if (this.z.compareAndSet(false, true)) {
            if (this.f738a.hasVideoUrl() || t()) {
                com.applovin.impl.sdk.utils.k.a(this.s, this.f738a, i, z2);
            }
            if (this.f738a.hasVideoUrl()) {
                this.d.c(i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            this.b.E().trackVideoEnd(this.f738a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z);
            long jElapsedRealtime2 = this.k != -1 ? SystemClock.elapsedRealtime() - this.k : -1L;
            this.b.E().trackFullScreenAdClosed(this.f738a, jElapsedRealtime2, this.E, j, this.p, this.o);
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    protected void n() {
        if (this.A.compareAndSet(false, true)) {
            com.applovin.impl.sdk.utils.k.b(this.r, this.f738a);
            this.b.Z().b(this.f738a);
        }
    }

    protected boolean o() {
        return this.e instanceof AppLovinFullscreenActivity;
    }

    protected void p() {
        com.applovin.impl.sdk.utils.p pVar = this.u;
        if (pVar != null) {
            pVar.b();
        }
    }

    protected void q() {
        com.applovin.impl.sdk.utils.p pVar = this.u;
        if (pVar != null) {
            pVar.c();
        }
    }

    protected boolean t() {
        return AppLovinAdType.INCENTIVIZED == this.f738a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f738a.getType();
    }

    protected void b(long j) {
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.u = com.applovin.impl.sdk.utils.p.a(j, this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.10
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f738a.ag().getAndSet(true)) {
                    return;
                }
                a.this.b.M().a(new v(a.this.f738a, a.this.b), o.a.REWARD);
            }
        });
    }

    protected void a(boolean z, long j) {
        if (this.f738a.U()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    protected void v() {
        com.applovin.impl.adview.d dVarS;
        AppLovinAdView appLovinAdView = this.f;
        if (appLovinAdView == null || (dVarS = appLovinAdView.getController().s()) == null) {
            return;
        }
        this.F.a(dVarS, new l.a() { // from class: com.applovin.impl.adview.activity.b.a.2
            @Override // com.applovin.impl.sdk.l.a
            public void a(View view) {
                a.this.b.aj().a(t.a.BLACK_VIEW, CollectionUtils.map("clcode", a.this.f738a.getClCode()));
                if (((Boolean) a.this.b.a(com.applovin.impl.sdk.c.b.fK)).booleanValue()) {
                    a.this.h();
                    return;
                }
                a aVar = a.this;
                aVar.G = ((Boolean) aVar.b.a(com.applovin.impl.sdk.c.b.fL)).booleanValue();
                if (!((Boolean) a.this.b.a(com.applovin.impl.sdk.c.b.fM)).booleanValue() || a.this.h == null) {
                    return;
                }
                a.this.h.setVisibility(0);
            }
        });
    }

    public void w() {
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.l = true;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (!"com.applovin.render_process_gone".equals(intent.getAction()) || this.l) {
            return;
        }
        w();
    }

    protected void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.v);
    }

    private class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            y yVar = a.this.c;
            if (y.a()) {
                a.this.c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            com.applovin.impl.sdk.utils.k.a(a.this.q, appLovinAd);
            a.this.d.b();
            a.this.n++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == a.this.h && ((Boolean) a.this.b.a(com.applovin.impl.sdk.c.b.cC)).booleanValue()) {
                a.c(a.this);
                if (a.this.f738a.V()) {
                    a.this.b("javascript:al_onCloseButtonTapped(" + a.this.D + "," + a.this.m + "," + a.this.n + ");");
                }
                List<Integer> listU = a.this.f738a.u();
                y yVar = a.this.c;
                if (y.a()) {
                    a.this.c.b("AppLovinFullscreenActivity", "Handling close button tap " + a.this.D + " with multi close delay: " + listU);
                }
                if (listU != null && listU.size() > a.this.D) {
                    a.this.E.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.k));
                    List<i.a> listW = a.this.f738a.w();
                    if (listW != null && listW.size() > a.this.D) {
                        a.this.h.a(listW.get(a.this.D));
                    }
                    y yVar2 = a.this.c;
                    if (y.a()) {
                        a.this.c.b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listU.get(a.this.D));
                    }
                    a.this.h.setVisibility(8);
                    a aVar = a.this;
                    aVar.a(aVar.h, listU.get(a.this.D).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.k = SystemClock.elapsedRealtime();
                        }
                    });
                    return;
                }
                a.this.h();
                return;
            }
            y yVar3 = a.this.c;
            if (y.a()) {
                a.this.c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }
}
