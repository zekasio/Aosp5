package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzatw implements Runnable {
    final /* synthetic */ zzatx zza;

    zzatw(zzatx zzatxVar) {
        this.zza = zzatxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzatx zzatxVar = this.zza;
            if (zzatxVar.zzd && zzatxVar.zze) {
                zzatxVar.zzd = false;
                zzbza.zze("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzaty) it.next()).zza(false);
                    } catch (Exception e) {
                        zzbza.zzh("", e);
                    }
                }
            } else {
                zzbza.zze("App is still foreground");
            }
        }
    }
}
