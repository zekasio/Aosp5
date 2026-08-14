package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmp extends zzfml {
    final /* synthetic */ zzfmv zza;

    zzfmp(zzfmv zzfmvVar) {
        this.zza = zzfmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfmv zzfmvVar = this.zza;
            if (zzfmvVar.zzn != null) {
                zzfmvVar.zzc.zzc("Unbind from service.", new Object[0]);
                zzfmv zzfmvVar2 = this.zza;
                zzfmvVar2.zzb.unbindService(zzfmvVar2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
