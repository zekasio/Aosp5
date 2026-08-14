package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeuh implements zzeiq {
    final /* synthetic */ zzeui zza;

    zzeuh(zzeui zzeuiVar) {
        this.zza = zzeuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcoe zzcoeVar = (zzcoe) obj;
        synchronized (this.zza) {
            zzcoe zzcoeVar2 = this.zza.zza;
            if (zzcoeVar2 != null) {
                zzcoeVar2.zzb();
            }
            zzeui zzeuiVar = this.zza;
            zzeuiVar.zza = zzcoeVar;
            zzcoeVar.zzc(zzeuiVar);
            zzeui zzeuiVar2 = this.zza;
            zzeuiVar2.zzg.zzl(new zzcof(zzcoeVar, zzeuiVar2, zzeuiVar2.zzg));
            zzcoeVar.zzj();
        }
    }
}
