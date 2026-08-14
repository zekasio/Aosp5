package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpk implements zzof {
    final /* synthetic */ zzpl zza;

    /* synthetic */ zzpk(zzpl zzplVar, zzpj zzpjVar) {
        this.zza = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zza(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzb() {
        zzpl zzplVar = this.zza;
        if (zzplVar.zzl != null) {
            zzplVar.zzl.zzb();
        }
    }
}
