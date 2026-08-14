package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdri implements zzfuf {
    final /* synthetic */ zzdrk zza;

    zzdri(zzdrk zzdrkVar) {
        this.zza = zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdri zzdriVar = this.zza;
                    zzdrk.zzj(zzdriVar.zza, str);
                }
            });
        }
    }
}
