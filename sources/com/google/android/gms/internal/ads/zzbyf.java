package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyf extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbyj zza;

    zzbyf(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbyj zzbyjVar = this.zza;
        zzbax zzbaxVar = new zzbax(zzbyjVar.zze, zzbyjVar.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbba.zza(this.zza.zzh, zzbaxVar);
            } catch (IllegalArgumentException e) {
                zzbza.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
