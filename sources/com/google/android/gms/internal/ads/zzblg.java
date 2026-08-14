package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzblg implements zzbzw {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    zzblg(zzblr zzblrVar, zzblq zzblqVar, zzfec zzfecVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzblr zzblrVar = this.zzc;
            if (zzblrVar.zzh != null && this.zza != zzblrVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblrVar2 = this.zzc;
                if (zzblrVar2.zze != null) {
                    zzfep zzfepVar = zzblrVar2.zze;
                    zzfec zzfecVar = this.zzb;
                    zzfecVar.zzf(true);
                    zzfepVar.zzb(zzfecVar.zzl());
                }
            }
        }
    }
}
