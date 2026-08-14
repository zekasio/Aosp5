package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.drive.DriveFile;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f833a;
    private final WeakReference<Context> b;
    private final Map<String, Object> c = Collections.synchronizedMap(CollectionUtils.map());
    private volatile AppLovinAdLoadListener d;
    private volatile AppLovinAdDisplayListener e;
    private volatile AppLovinAdVideoPlaybackListener f;
    private volatile AppLovinAdClickListener g;
    private volatile com.applovin.impl.sdk.ad.e h;

    public Map<String, Object> b() {
        return this.c;
    }

    public AppLovinAdDisplayListener c() {
        return this.e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f;
    }

    public AppLovinAdClickListener e() {
        return this.g;
    }

    public com.applovin.impl.sdk.ad.e f() {
        return this.h;
    }

    public p(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f833a = appLovinSdk.coreSdk;
        this.b = new WeakReference<>(context);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.p.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                p.this.b(appLovinAd);
                p.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                p.this.a(i);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAdMaybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f833a);
        Context contextH = h();
        if (!a(appLovinAdMaybeRetrieveNonDummyAd, appLovinAd, contextH)) {
            a(appLovinAd);
        } else {
            a((com.applovin.impl.sdk.ad.e) appLovinAdMaybeRetrieveNonDummyAd, contextH);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup == null || lifecycle == null) {
            com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            a(appLovinAd);
            return;
        }
        AppLovinAd appLovinAdMaybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f833a);
        Context contextH = h();
        if (!a(appLovinAdMaybeRetrieveNonDummyAd, appLovinAd, contextH)) {
            a(appLovinAd);
            return;
        }
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f833a);
        lifecycle.addObserver(appLovinFullscreenAdViewObserver);
        a((com.applovin.impl.sdk.ad.e) appLovinAdMaybeRetrieveNonDummyAd, viewGroup, appLovinFullscreenAdViewObserver, contextH);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.c.put(str, obj);
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.y.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
            com.applovin.impl.sdk.utils.k.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.k.b(appLovinAdDisplayListener, eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    public void a() {
        this.g = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f833a.E().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private boolean a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return false;
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd2);
            return false;
        }
        if (((AppLovinAdImpl) appLovinAd).hasShown() && ((Boolean) this.f833a.a(com.applovin.impl.sdk.c.b.co)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        }
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.e) {
            return true;
        }
        this.f833a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f833a.L().e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + appLovinAd + "'");
        }
        return false;
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, final Context context) {
        g();
        this.h = eVar;
        final long jMax = Math.max(0L, ((Long) this.f833a.a(com.applovin.impl.sdk.c.b.cA)).longValue());
        this.f833a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f833a.L().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + jMax);
        }
        a(eVar, context, new Runnable() { // from class: com.applovin.impl.adview.p.2
            @Override // java.lang.Runnable
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        p.this.f833a.L();
                        if (com.applovin.impl.sdk.y.a()) {
                            p.this.f833a.L().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        p.this.a(context);
                    }
                }, jMax);
            }
        });
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        g();
        this.h = eVar;
        long jMax = Math.max(0L, ((Long) this.f833a.a(com.applovin.impl.sdk.c.b.cA)).longValue());
        this.f833a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f833a.L().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + jMax);
        }
        a(eVar, context, new AnonymousClass3(context, viewGroup, appLovinFullscreenAdViewObserver, jMax));
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.p$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f837a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ AppLovinFullscreenAdViewObserver c;
        final /* synthetic */ long d;

        AnonymousClass3(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j) {
            this.f837a = context;
            this.b = viewGroup;
            this.c = appLovinFullscreenAdViewObserver;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.f837a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.3.1
                @Override // java.lang.Runnable
                public void run() {
                    p.this.f833a.L();
                    if (com.applovin.impl.sdk.y.a()) {
                        p.this.f833a.L().b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + AnonymousClass3.this.b + ")");
                    }
                    AnonymousClass3.this.b.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    com.applovin.impl.adview.activity.b.a.a(p.this.h, p.this.g, p.this.e, p.this.f, p.this.c, p.this.f833a, (Activity) AnonymousClass3.this.f837a, new a.InterfaceC0048a() { // from class: com.applovin.impl.adview.p.3.1.1
                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                        public void a(com.applovin.impl.adview.activity.b.a aVar) {
                            if (com.applovin.impl.sdk.utils.b.a((Activity) AnonymousClass3.this.f837a)) {
                                com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                                p.a(p.this.h, p.this.e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                                return;
                            }
                            AnonymousClass3.this.c.setPresenter(aVar);
                            try {
                                aVar.a(AnonymousClass3.this.b);
                            } catch (Throwable th) {
                                String str = "Failed to show interstitial: presenter threw exception " + th;
                                com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", str);
                                p.a(p.this.h, p.this.e, str, null, null);
                            }
                        }

                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                        public void a(String str, Throwable th) {
                            p.a(p.this.h, p.this.e, str, th, null);
                        }
                    });
                }
            }, this.d);
        }
    }

    private void g() {
        if (this.f833a.w().b() == null) {
            this.f833a.P().a(com.applovin.impl.sdk.d.f.o);
        }
    }

    private Context h() {
        return this.b.get();
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context, final Runnable runnable) {
        if (TextUtils.isEmpty(eVar.N()) && eVar.ah() && !com.applovin.impl.sdk.utils.i.a(context) && (context instanceof Activity)) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(eVar.ai()).setMessage(eVar.aj()).setPositiveButton(eVar.ak(), (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p.4
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            alertDialogCreate.show();
            return;
        }
        runnable.run();
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.e != null) {
            this.e.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f833a.B());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f833a.w().b() == null && ((Boolean) this.f833a.a(com.applovin.impl.sdk.c.b.cV)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.5
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.d != null) {
                    p.this.d.adReceived(appLovinAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.6
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.d != null) {
                    p.this.d.failedToReceiveAd(i);
                }
            }
        });
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
