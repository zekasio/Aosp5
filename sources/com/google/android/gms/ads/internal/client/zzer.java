package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.zza.zza;
        if (zzeuVar.zza != null) {
            try {
                zzeuVar.zza.zze(1);
            } catch (RemoteException e) {
                zzbza.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
