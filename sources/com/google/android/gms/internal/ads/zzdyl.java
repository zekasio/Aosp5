package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyl implements zzcxj, zzcwc, zzcur {
    private final zzfdj zza;
    private final zzfdk zzb;
    private final zzbyn zzc;

    public zzdyl(zzfdj zzfdjVar, zzfdk zzfdkVar, zzbyn zzbynVar) {
        this.zza = zzfdjVar;
        this.zzb = zzfdkVar;
        this.zzc = zzbynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdj zzfdjVar = this.zza;
        zzfdjVar.zza("action", "ftl");
        zzfdjVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfdjVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        this.zza.zzh(zzeyoVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
        this.zza.zzi(zzbtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        zzfdk zzfdkVar = this.zzb;
        zzfdj zzfdjVar = this.zza;
        zzfdjVar.zza("action", TJAdUnitConstants.String.VIDEO_LOADED);
        zzfdkVar.zzb(zzfdjVar);
    }
}
