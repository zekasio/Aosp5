package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcah implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcan zzc;

    zzcah(zzcan zzcanVar, String str, String str2) {
        this.zzc = zzcanVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcan zzcanVar = this.zzc;
        if (zzcanVar.zzr != null) {
            zzcanVar.zzr.zzb(this.zza, this.zzb);
        }
    }
}
