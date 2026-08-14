package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzblf implements Runnable {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzbkm zzb;
    final /* synthetic */ zzblr zzc;

    zzblf(zzblr zzblrVar, zzblq zzblqVar, zzbkm zzbkmVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzbkmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzc.zza) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfuu zzfuuVar = zzbzn.zze;
                final zzbkm zzbkmVar = this.zzb;
                zzfuuVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzble
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbkmVar.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
