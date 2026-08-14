package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzapm implements zzfis {
    final /* synthetic */ zzfhp zza;

    zzapm(zzfhp zzfhpVar) {
        this.zza = zzfhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
