package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcmy implements zzbhp {
    final /* synthetic */ zzcnb zza;

    zzcmy(zzcnb zzcnbVar) {
        this.zza = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (zzcnb.zzg(this.zza, map)) {
            this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzg();
                }
            });
        }
    }
}
