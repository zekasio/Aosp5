package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1269a = TimeUnit.SECONDS.toMillis(2);
    private final p b;
    private final y c;
    private final HashSet<c> d = new HashSet<>();
    private final Object e = new Object();

    public interface a {
        void onAdExpired(com.applovin.impl.sdk.ad.g gVar);
    }

    public d(p pVar) {
        this.b = pVar;
        this.c = pVar.L();
    }

    public boolean a(com.applovin.impl.sdk.ad.g gVar, a aVar) {
        synchronized (this.e) {
            if (b(gVar) != null) {
                if (y.a()) {
                    this.c.b("AdNewExpirationManager", "Ad expiration already scheduled for ad: " + gVar);
                }
                return true;
            }
            if (gVar.Q() <= f1269a) {
                if (y.a()) {
                    this.c.b("AdNewExpirationManager", "Ad has already expired: " + gVar);
                }
                gVar.S();
                return false;
            }
            if (y.a()) {
                this.c.b("AdNewExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(gVar.Q()) + " seconds from now for " + gVar + "...");
            }
            if (this.d.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.d.add(c.a(gVar, aVar, this.b));
            return true;
        }
    }

    public void a(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.e) {
            c cVarB = b(gVar);
            if (cVarB != null) {
                if (y.a()) {
                    this.c.b("AdNewExpirationManager", "Cancelling expiration timer for ad: " + gVar);
                }
                cVarB.b();
                a(cVarB);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this.e) {
            this.d.remove(cVar);
            if (this.d.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private c b(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.e) {
            if (gVar == null) {
                return null;
            }
            for (c cVar : this.d) {
                if (gVar == cVar.a()) {
                    return cVar;
                }
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void a() {
        synchronized (this.e) {
            Iterator<c> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    private void b() {
        HashSet<c> hashSet = new HashSet();
        synchronized (this.e) {
            for (c cVar : this.d) {
                com.applovin.impl.sdk.ad.g gVarA = cVar.a();
                if (gVarA == null) {
                    hashSet.add(cVar);
                } else {
                    long jQ = gVarA.Q();
                    if (jQ <= 0) {
                        if (y.a()) {
                            this.c.b("AdNewExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + gVarA);
                        }
                        hashSet.add(cVar);
                    } else {
                        if (y.a()) {
                            this.c.b("AdNewExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(jQ) + " seconds for ad: " + gVarA);
                        }
                        cVar.a(jQ);
                    }
                }
            }
        }
        for (c cVar2 : hashSet) {
            a(cVar2);
            cVar2.c();
        }
    }
}
