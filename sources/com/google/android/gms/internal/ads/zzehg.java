package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzehg implements zzeiq {
    final /* synthetic */ zzehh zza;

    zzehg(zzehh zzehhVar) {
        this.zza = zzehhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcok zzcokVar = (zzcok) obj;
        synchronized (this.zza) {
            zzehh zzehhVar = this.zza;
            if (zzehhVar.zzh != null) {
                zzehhVar.zzh.zzb();
            }
            this.zza.zzh = zzcokVar;
            this.zza.zzh.zzj();
        }
    }
}
