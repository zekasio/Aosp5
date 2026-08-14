package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexs implements zzeiq {
    final /* synthetic */ zzext zza;

    zzexs(zzext zzextVar) {
        this.zza = zzextVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzh = (zzdlu) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdb)).booleanValue()) {
                ((zzdlu) obj).zzd().zza = this.zza.zzd;
            }
            this.zza.zzh.zzj();
        }
    }
}
