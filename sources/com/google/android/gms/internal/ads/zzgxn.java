package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxn extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgxn(zzbbs zzbbsVar, byte[] bArr) {
        this.zza = new WeakReference(zzbbsVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbbs zzbbsVar = (zzbbs) this.zza.get();
        if (zzbbsVar != null) {
            zzbbsVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbbs zzbbsVar = (zzbbs) this.zza.get();
        if (zzbbsVar != null) {
            zzbbsVar.zzd();
        }
    }
}
