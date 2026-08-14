package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzblh implements zzbzu {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    zzblh(zzblr zzblrVar, zzblq zzblqVar, zzfec zzfecVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblrVar = this.zzc;
                if (zzblrVar.zze != null) {
                    zzfep zzfepVar = zzblrVar.zze;
                    zzfec zzfecVar = this.zzb;
                    zzfecVar.zzf(false);
                    zzfepVar.zzb(zzfecVar.zzl());
                }
            }
        }
    }
}
