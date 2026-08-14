package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhf implements zzfuf {
    final /* synthetic */ zzcei zza;

    zzbhf(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        new com.google.android.gms.ads.internal.util.zzby(this.zza.getContext(), this.zza.zzn().zza, (String) obj).zzb();
    }
}
