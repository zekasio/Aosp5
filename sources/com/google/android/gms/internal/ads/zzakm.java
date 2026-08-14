package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzako zzc;

    zzakm(zzako zzakoVar, String str, long j) {
        this.zzc = zzakoVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzako zzakoVar = this.zzc;
        zzakoVar.zza.zzb(zzakoVar.toString());
    }
}
