package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcmu implements zzfuf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmv zzb;

    zzcmu(zzcmv zzcmvVar, String str) {
        this.zzb = zzcmvVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzcmv zzcmvVar = this.zzb;
        zzcmvVar.zzh.zza(zzcmvVar.zzg.zzd(zzcmvVar.zze, zzcmvVar.zzf, false, this.zza, null, zzcmvVar.zzf.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcmv zzcmvVar = this.zzb;
        zzcmvVar.zzh.zza(zzcmvVar.zzg.zzd(zzcmvVar.zze, zzcmvVar.zzf, false, this.zza, str, zzcmvVar.zzf.zzd));
    }
}
