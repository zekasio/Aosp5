package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbgb extends zzbfd {
    final /* synthetic */ zzbgc zza;

    /* synthetic */ zzbgb(zzbgc zzbgcVar, zzbga zzbgaVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) {
        zzbgc zzbgcVar = this.zza;
        zzbgcVar.zza.onCustomTemplateAdLoaded(zzbgcVar.zzf(zzberVar));
    }
}
