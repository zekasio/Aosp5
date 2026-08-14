package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<f> f1449a = new HashSet();
    private final p b;
    private final com.applovin.impl.sdk.p c;

    public static f a(long j, com.applovin.impl.sdk.p pVar, Runnable runnable) {
        return new f(j, pVar, runnable);
    }

    private f(long j, com.applovin.impl.sdk.p pVar, final Runnable runnable) {
        this.b = p.a(j, pVar, new Runnable() { // from class: com.applovin.impl.sdk.utils.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.c = pVar;
        f1449a.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.b.d();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f1449a.remove(this);
    }

    public long b() {
        return this.b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.b.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.b.c();
        }
    }
}
