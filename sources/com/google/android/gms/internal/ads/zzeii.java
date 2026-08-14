package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeii implements zzeiq {
    final /* synthetic */ zzeij zza;

    zzeii(zzeij zzeijVar) {
        this.zza = zzeijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdcv zzdcvVar = (zzdcv) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdcvVar;
            this.zza.zzi.zzj();
        }
    }
}
