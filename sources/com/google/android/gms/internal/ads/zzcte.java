package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcte implements zzcxj {
    private final Context zza;
    private final zzeyx zzb;
    private final zzbzg zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdrk zze;
    private final zzfep zzf;

    public zzcte(Context context, zzeyx zzeyxVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdrk zzdrkVar, zzfep zzfepVar) {
        this.zza = context;
        this.zzb = zzeyxVar;
        this.zzc = zzbzgVar;
        this.zzd = zzgVar;
        this.zze = zzdrkVar;
        this.zzf = zzfepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdz)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
