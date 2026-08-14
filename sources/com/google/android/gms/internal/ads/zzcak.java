package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcak implements Runnable {
    final /* synthetic */ zzcan zza;

    zzcak(zzcan zzcanVar) {
        this.zza = zzcanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcan zzcanVar = this.zza;
        if (zzcanVar.zzr != null) {
            zzcanVar.zzr.zzd();
            this.zza.zzr.zzi();
        }
    }
}
