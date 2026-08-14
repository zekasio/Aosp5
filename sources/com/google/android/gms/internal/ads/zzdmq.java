package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmq {
    private final zzceu zza;
    private final Context zzb;
    private final zzapw zzc;
    private final zzbbt zzd;
    private final zzbzg zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzawe zzg;
    private final zzcxd zzh;

    public zzdmq(zzceu zzceuVar, Context context, zzapw zzapwVar, zzbbt zzbbtVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, zzcxd zzcxdVar) {
        this.zza = zzceuVar;
        this.zzb = context;
        this.zzc = zzapwVar;
        this.zzd = zzbbtVar;
        this.zze = zzbzgVar;
        this.zzf = zzaVar;
        this.zzg = zzaweVar;
        this.zzh = zzcxdVar;
    }

    public final zzcei zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzeyc zzeycVar, zzeyf zzeyfVar) throws zzcet {
        return zzceu.zza(this.zzb, zzcfx.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdmf(this), this.zzf, this.zzg, zzeycVar, zzeyfVar);
    }
}
