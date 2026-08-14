package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class o implements n.a, AppLovinWebViewActivity.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f1395a = new AtomicBoolean();
    private static WeakReference<AppLovinWebViewActivity> b;
    private final p c;
    private final y d;
    private AppLovinUserService.OnConsentDialogDismissListener e;
    private n f;
    private WeakReference<Activity> g;
    private com.applovin.impl.sdk.utils.a h;
    private AtomicBoolean i = new AtomicBoolean();

    @Override // com.applovin.impl.sdk.n.a
    public void b() {
    }

    o(p pVar) {
        this.g = new WeakReference<>(null);
        this.c = pVar;
        this.d = pVar.L();
        if (pVar.t() != null) {
            this.g = new WeakReference<>(pVar.t());
        }
        p.a(p.y()).a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.o.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                o.this.g = new WeakReference(activity);
            }
        });
        this.f = new n(this, pVar);
    }

    public void c() {
        if (this.i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.c.a(com.applovin.impl.sdk.c.b.aG);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.2
            @Override // java.lang.Runnable
            public void run() {
                p unused = o.this.c;
                WebView webViewTryToCreateWebView = Utils.tryToCreateWebView(p.y(), "preloading consent dialog", true);
                if (webViewTryToCreateWebView == null) {
                    return;
                }
                webViewTryToCreateWebView.loadUrl(str);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.3
            @Override // java.lang.Runnable
            public void run() {
                o oVar = o.this;
                if (!oVar.a(oVar.c) || o.f1395a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                o.this.g = new WeakReference(activity);
                o.this.e = onConsentDialogDismissListener;
                o.this.h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.o.3.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!o.this.d() || o.b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = o.b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) o.this.c.a(com.applovin.impl.sdk.c.b.aG), o.this);
                            }
                            o.f1395a.set(false);
                        }
                    }
                };
                o.this.c.w().a(o.this.h);
                Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, o.this.c.B());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) o.this.c.a(com.applovin.impl.sdk.c.b.aH));
                activity.startActivity(intent);
            }
        });
    }

    public void a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.4
            @Override // java.lang.Runnable
            public void run() {
                y unused = o.this.d;
                if (y.a()) {
                    o.this.d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                o.this.f.a(j, o.this.c, o.this);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, p.y());
            g();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, p.y());
            a(((Boolean) this.c.a(com.applovin.impl.sdk.c.b.aJ)).booleanValue(), ((Long) this.c.a(com.applovin.impl.sdk.c.b.aO)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.c.a(com.applovin.impl.sdk.c.b.aK)).booleanValue(), ((Long) this.c.a(com.applovin.impl.sdk.c.b.aP)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.c.a(com.applovin.impl.sdk.c.b.aL)).booleanValue(), ((Long) this.c.a(com.applovin.impl.sdk.c.b.aQ)).longValue());
        }
    }

    private void a(boolean z, long j) {
        g();
        if (z) {
            a(j);
        }
    }

    @Override // com.applovin.impl.sdk.n.a
    public void a() {
        final Activity activity = this.g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o.5
                @Override // java.lang.Runnable
                public void run() {
                    o.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.c.a(com.applovin.impl.sdk.c.b.aI)).longValue());
        }
    }

    boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(p pVar) {
        if (d()) {
            y.i("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!com.applovin.impl.sdk.utils.i.a(p.y())) {
            y.i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.aF)).booleanValue()) {
            if (y.a()) {
                this.d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        }
        if (StringUtils.isValidString((String) pVar.a(com.applovin.impl.sdk.c.b.aG))) {
            return true;
        }
        if (y.a()) {
            this.d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        }
        return false;
    }

    private void g() {
        this.c.w().b(this.h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = b.get();
            b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.e = null;
                }
            }
        }
    }
}
