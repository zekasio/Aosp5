package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagl implements zzaax {
    final /* synthetic */ zzagm zza;

    /* synthetic */ zzagl(zzagm zzagmVar, zzagk zzagkVar) {
        this.zza = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        zzagm zzagmVar = this.zza;
        return zzagmVar.zzd.zzf(zzagmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzaay zzaayVar = new zzaay(j, zzew.zzr((r0.zzb + ((r0.zzd.zzg(j) * (r0.zzc - r0.zzb)) / r0.zzf)) - 30000, this.zza.zzb, r0.zzc - 1));
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
