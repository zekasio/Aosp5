package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjg implements zzdqr {
    private final Context zza;
    private final zzbim zzb;
    private final zzchy zzc;
    private final zzcjg zzd = this;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    /* synthetic */ zzcjg(zzchy zzchyVar, Context context, zzbim zzbimVar, zzcjf zzcjfVar) {
        this.zzc = zzchyVar;
        this.zza = context;
        this.zzb = zzbimVar;
        zzgwy zzgwyVarZza = zzgwz.zza(this);
        this.zze = zzgwyVarZza;
        zzgwy zzgwyVarZza2 = zzgwz.zza(zzbimVar);
        this.zzf = zzgwyVarZza2;
        zzdqn zzdqnVar = new zzdqn(zzgwyVarZza2);
        this.zzg = zzdqnVar;
        this.zzh = zzgwx.zzc(new zzdqp(zzgwyVarZza, zzdqnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqr
    public final zzdqi zzb() {
        return new zzcja(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqr
    public final zzdqo zzd() {
        return (zzdqo) this.zzh.zzb();
    }
}
