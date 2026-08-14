package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcaj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcan zzc;

    zzcaj(zzcan zzcanVar, int i, int i2) {
        this.zzc = zzcanVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcan zzcanVar = this.zzc;
        if (zzcanVar.zzr != null) {
            zzcanVar.zzr.zzj(this.zza, this.zzb);
        }
    }
}
