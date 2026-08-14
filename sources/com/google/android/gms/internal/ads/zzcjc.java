package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjc implements zzdqj {
    private final Long zza;
    private final String zzb;
    private final zzchy zzc;
    private final zzcjg zzd;
    private final zzcjc zze = this;

    /* synthetic */ zzcjc(zzchy zzchyVar, zzcjg zzcjgVar, Long l, String str, zzcjb zzcjbVar) {
        this.zzc = zzchyVar;
        this.zzd = zzcjgVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdqt zza() {
        long jLongValue = this.zza.longValue();
        zzcjg zzcjgVar = this.zzd;
        return zzdqu.zza(jLongValue, zzcjgVar.zza, zzdqn.zzc(zzcjgVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdqx zzb() {
        long jLongValue = this.zza.longValue();
        zzcjg zzcjgVar = this.zzd;
        return zzdqy.zza(jLongValue, zzcjgVar.zza, zzdqn.zzc(zzcjgVar.zzb), this.zzc, this.zzb);
    }
}
