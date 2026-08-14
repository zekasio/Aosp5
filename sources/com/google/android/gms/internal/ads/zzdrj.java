package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdrj extends zzbjo {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfec zzd;
    final /* synthetic */ zzbzs zze;
    final /* synthetic */ zzdrk zzf;

    zzdrj(zzdrk zzdrkVar, Object obj, String str, long j, zzfec zzfecVar, zzbzs zzbzsVar) {
        this.zzf = zzdrkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfecVar;
        this.zze = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfep zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzc(str);
            zzfecVar.zzf(false);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfep zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzf(true);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(true);
        }
    }
}
