package com.applovin.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes.dex */
final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f93a;
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public bc(Context context) {
        this.f93a = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.f93a;
            if (wifiManager == null) {
                com.applovin.exoplayer2.l.q.c("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
