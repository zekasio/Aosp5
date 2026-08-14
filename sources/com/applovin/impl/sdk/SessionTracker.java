package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";
    private static final AtomicBoolean b = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f1184a;
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicInteger e = new AtomicInteger();
    private Date f;
    private Date g;

    SessionTracker(p pVar) {
        this.f1184a = pVar;
        final Application application = (Application) p.y();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.SessionTracker.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                SessionTracker.this.a();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.SessionTracker.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                SessionTracker.this.e.set(i);
                if (i == 20) {
                    SessionTracker.this.b();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.SessionTracker.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        SessionTracker.this.a();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    SessionTracker.this.b();
                }
            }
        }, intentFilter);
        if ((((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cE)).booleanValue() || ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dc)).booleanValue()) && b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, (Class<?>) AppKilledService.class);
            application.startService(intent);
            AppLovinBroadcastManager.registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.SessionTracker.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Intent intent2, Map<String, Object> map) {
                    application.stopService(intent);
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    public boolean isApplicationPaused() {
        return this.d.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.e.get();
    }

    public void pauseForClick() {
        this.c.set(true);
    }

    public void resumeForClick() {
        this.c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d.compareAndSet(true, false)) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.d.compareAndSet(false, true)) {
            c();
        }
    }

    private void c() {
        this.f1184a.L();
        if (y.a()) {
            this.f1184a.L().b("SessionTracker", "Application Paused");
        }
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f1184a.a(com.applovin.impl.sdk.c.b.dC)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f1184a.a(com.applovin.impl.sdk.c.b.dE)).longValue());
        if (this.f == null || System.currentTimeMillis() - this.f.getTime() >= millis) {
            this.f1184a.G().trackEvent(TJAdUnitConstants.String.VIDEO_PAUSED);
            if (zBooleanValue) {
                this.f = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f = new Date();
    }

    private void d() {
        this.f1184a.L();
        if (y.a()) {
            this.f1184a.L().b("SessionTracker", "Application Resumed");
        }
        boolean zBooleanValue = ((Boolean) this.f1184a.a(com.applovin.impl.sdk.c.b.dC)).booleanValue();
        long jLongValue = ((Long) this.f1184a.a(com.applovin.impl.sdk.c.b.dD)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.g == null || System.currentTimeMillis() - this.g.getTime() >= millis) {
            this.f1184a.G().trackEvent("resumed");
            if (zBooleanValue) {
                this.g = new Date();
            }
        }
        if (!zBooleanValue) {
            this.g = new Date();
        }
        this.f1184a.P().a(com.applovin.impl.sdk.d.f.m);
    }
}
