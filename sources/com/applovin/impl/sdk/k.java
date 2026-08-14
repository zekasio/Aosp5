package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1337a = -1;
    private final AudioManager b;
    private final Context c;
    private final p d;
    private final Set<a> e = new HashSet();
    private final Object f = new Object();
    private boolean g;
    private int h;

    public interface a {
        void a(int i);
    }

    public static boolean a(int i) {
        return i == 0 || i == 1;
    }

    k(p pVar) {
        this.d = pVar;
        Context contextY = p.y();
        this.c = contextY;
        this.b = (AudioManager) contextY.getSystemService("audio");
    }

    public int a() {
        return this.b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f) {
            if (this.e.contains(aVar)) {
                return;
            }
            this.e.add(aVar);
            if (this.e.size() == 1) {
                b();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f) {
            if (this.e.contains(aVar)) {
                this.e.remove(aVar);
                if (this.e.isEmpty()) {
                    c();
                }
            }
        }
    }

    private void b() {
        this.d.L();
        if (y.a()) {
            this.d.L().b("AudioSessionManager", "Observing ringer mode...");
        }
        this.h = f1337a;
        this.c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void c() {
        this.d.L();
        if (y.a()) {
            this.d.L().b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.c.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    private void b(final int i) {
        if (this.g) {
            return;
        }
        this.d.L();
        if (y.a()) {
            this.d.L().b("AudioSessionManager", "Ringer mode is " + i);
        }
        synchronized (this.f) {
            for (final a aVar : this.e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(i);
                    }
                });
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.g = true;
            this.h = this.b.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.g = false;
            if (this.h != this.b.getRingerMode()) {
                this.h = f1337a;
                b(this.b.getRingerMode());
            }
        }
    }
}
