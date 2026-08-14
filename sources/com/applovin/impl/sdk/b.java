package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.vungle.warren.AdLoader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1244a;
    private final y b;
    private final a c;
    private com.applovin.impl.sdk.utils.p d;
    private final Object e = new Object();
    private long f;

    public interface a {
        void onAdExpired();
    }

    public b(p pVar, a aVar) {
        this.f1244a = pVar;
        this.b = pVar.L();
        this.c = aVar;
    }

    public boolean a(com.applovin.impl.mediation.a.a aVar) {
        long J;
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            J = ((com.applovin.impl.mediation.a.c) aVar).R();
        } else if (aVar instanceof com.applovin.impl.mediation.a.d) {
            J = ((com.applovin.impl.mediation.a.d) aVar).J();
        } else {
            throw new IllegalArgumentException("Ad does not support scheduling expiration");
        }
        long jElapsedRealtime = J - (SystemClock.elapsedRealtime() - aVar.x());
        if (jElapsedRealtime > AdLoader.RETRY_DELAY) {
            if (y.a()) {
                this.b.b("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from now for " + aVar.getAdUnitId() + "...");
            }
            a(jElapsedRealtime);
            return true;
        }
        if (!y.a()) {
            return false;
        }
        this.b.b("AdExpirationManager", "Ad is already expired");
        return false;
    }

    private void a(long j) {
        synchronized (this.e) {
            a();
            this.f = System.currentTimeMillis() + j;
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            if (((Boolean) this.f1244a.a(com.applovin.impl.sdk.c.b.bG)).booleanValue() || !this.f1244a.Y().isApplicationPaused()) {
                this.d = com.applovin.impl.sdk.utils.p.a(j, this.f1244a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a();
                        b.this.c.onAdExpired();
                    }
                });
            }
        }
    }

    public void a() {
        synchronized (this.e) {
            b();
            AppLovinBroadcastManager.unregisterReceiver(this);
        }
    }

    private void b() {
        com.applovin.impl.sdk.utils.p pVar = this.d;
        if (pVar != null) {
            pVar.d();
            this.d = null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        }
    }

    private void c() {
        synchronized (this.e) {
            b();
        }
    }

    private void d() {
        boolean z;
        synchronized (this.e) {
            long jCurrentTimeMillis = this.f - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                a();
                z = true;
            } else {
                a(jCurrentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.c.onAdExpired();
        }
    }
}
