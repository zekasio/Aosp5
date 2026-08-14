package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f1325a;
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean();
    private boolean d;
    private final p e;
    private final WeakReference<a> f;
    private long g;

    public interface a {
        void onAdRefresh();
    }

    public f(p pVar, a aVar) {
        this.f = new WeakReference<>(aVar);
        this.e = pVar;
    }

    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.f1325a != null;
        }
        return z;
    }

    public long b() {
        long jA;
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.p pVar = this.f1325a;
            jA = pVar != null ? pVar.a() : -1L;
        }
        return jA;
    }

    public void a(long j) {
        synchronized (this.b) {
            c();
            this.g = j;
            this.f1325a = com.applovin.impl.sdk.utils.p.a(j, this.e, new Runnable() { // from class: com.applovin.impl.sdk.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                    a aVar = (a) f.this.f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.e.a(com.applovin.impl.sdk.c.a.q)).booleanValue() && (this.e.Z().b() || this.e.Y().isApplicationPaused())) {
                this.f1325a.b();
            }
            if (this.c.compareAndSet(true, false) && ((Boolean) this.e.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.e.L();
                if (y.a()) {
                    this.e.L().b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f1325a.b();
            }
        }
    }

    public void c() {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.p pVar = this.f1325a;
            if (pVar != null) {
                pVar.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.b) {
            i();
            this.d = true;
        }
    }

    public void e() {
        synchronized (this.b) {
            j();
            this.d = false;
        }
    }

    public boolean f() {
        return this.d;
    }

    private void i() {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.p pVar = this.f1325a;
            if (pVar != null) {
                pVar.b();
            } else {
                this.e.L();
                if (y.a()) {
                    this.e.L().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.b) {
            com.applovin.impl.sdk.utils.p pVar = this.f1325a;
            if (pVar != null) {
                pVar.c();
            } else {
                this.c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.b) {
            this.f1325a = null;
            if (!((Boolean) this.e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            g();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }

    public void g() {
        if (((Boolean) this.e.a(com.applovin.impl.sdk.c.a.p)).booleanValue()) {
            i();
        }
    }

    public void h() {
        a aVar;
        if (((Boolean) this.e.a(com.applovin.impl.sdk.c.a.p)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.e.L();
                    if (y.a()) {
                        this.e.L().b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.e.Z().b()) {
                    this.e.L();
                    if (y.a()) {
                        this.e.L().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                boolean z = false;
                if (this.f1325a != null) {
                    long jB = this.g - b();
                    long jLongValue = ((Long) this.e.a(com.applovin.impl.sdk.c.a.o)).longValue();
                    if (jLongValue >= 0 && jB > jLongValue) {
                        c();
                        z = true;
                    } else {
                        this.f1325a.c();
                    }
                }
                if (!z || (aVar = this.f.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    private void l() {
        if (((Boolean) this.e.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            i();
        }
    }

    private void m() {
        if (((Boolean) this.e.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.e.L();
                    if (y.a()) {
                        this.e.L().b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.e.Y().isApplicationPaused()) {
                    this.e.L();
                    if (y.a()) {
                        this.e.L().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    com.applovin.impl.sdk.utils.p pVar = this.f1325a;
                    if (pVar != null) {
                        pVar.c();
                    }
                }
            }
        }
    }
}
