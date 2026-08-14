package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzezf implements zzfuf {
    final /* synthetic */ zzcei zza;
    final /* synthetic */ zzfff zzb;
    final /* synthetic */ zzeaf zzc;

    zzezf(zzcei zzceiVar, zzfff zzfffVar, zzeaf zzeafVar) {
        this.zza = zzceiVar;
        this.zzb = zzfffVar;
        this.zzc = zzeafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            this.zzb.zzc(str, null);
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i = 2;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfQ)).booleanValue() || !this.zza.zzD().zzT) {
                i = 1;
            }
        }
        this.zzc.zzd(new zzeah(jCurrentTimeMillis, str2, str, i));
    }
}
