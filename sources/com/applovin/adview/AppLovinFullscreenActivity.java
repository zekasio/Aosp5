package com.applovin.adview;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.p;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements k {
    public static p parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.p f6a;
    private com.applovin.impl.adview.activity.b.a b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;
    private a e;
    private boolean f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                y.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            y.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            y.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            p pVar = parentInterstitialWrapper;
            if (pVar != null && pVar.f() != null) {
                p.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        com.applovin.impl.sdk.p pVar2 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).coreSdk;
        this.f6a = pVar2;
        this.f = ((Boolean) pVar2.a(b.cS)).booleanValue();
        if (((Boolean) this.f6a.a(b.cT)).booleanValue()) {
            viewFindViewById.setFitsSystemWindows(true);
        }
        com.applovin.impl.sdk.utils.b.a(this.f, this);
        if (h.l() && ((Boolean) this.f6a.a(b.fF)).booleanValue()) {
            this.e = new a(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinFullscreenActivity.this.a();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.e);
        }
        p pVar3 = parentInterstitialWrapper;
        if (pVar3 != null) {
            com.applovin.impl.adview.activity.b.a.a(pVar3.f(), parentInterstitialWrapper.e(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.b(), this.f6a, this, new a.InterfaceC0048a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.2
                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                public void a(com.applovin.impl.adview.activity.b.a aVar) {
                    AppLovinFullscreenActivity.this.b = aVar;
                    aVar.d();
                }

                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                public void a(String str, Throwable th2) {
                    p.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f6a);
        this.d = aVar;
        bindService(intent, aVar, 1);
        if (h.h()) {
            String str = this.f6a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.DISABLE_SET_DATA_DIRECTORY_SUFFIX);
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    public void setPresenter(com.applovin.impl.adview.activity.b.a aVar) {
        this.b = aVar;
    }

    @Override // com.applovin.impl.adview.k
    public void dismiss() {
        if (h.l() && this.e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.e);
            this.e = null;
        }
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        com.applovin.impl.adview.activity.b.a aVar;
        try {
            super.onResume();
            if (this.c.get() || (aVar = this.b) == null) {
                return;
            }
            aVar.f();
        } catch (IllegalArgumentException e) {
            this.f6a.L();
            if (y.a()) {
                this.f6a.L().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            dismiss();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.b != null) {
            if (!this.c.getAndSet(false) || (this.b instanceof e)) {
                this.b.c(z);
            }
            if (z) {
                com.applovin.impl.sdk.utils.b.a(this.f, this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.adview.activity.b.a aVar = this.b;
        if (aVar != null) {
            aVar.l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.applovin.impl.sdk.p pVar = this.f6a;
        if (pVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) pVar.a(b.fA)).booleanValue());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        com.applovin.impl.adview.activity.b.a aVar2 = this.b;
        if (aVar2 != null) {
            if (!aVar2.i()) {
                this.b.h();
            }
            this.b.k();
        }
        super.onDestroy();
    }

    private static class a implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f9a;

        protected a(Runnable runnable) {
            this.f9a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f9a.run();
        }
    }
}
