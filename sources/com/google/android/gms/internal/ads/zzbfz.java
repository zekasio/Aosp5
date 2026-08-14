package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbfz extends zzbfa {
    final /* synthetic */ zzbgc zza;

    /* synthetic */ zzbfz(zzbgc zzbgcVar, zzbfy zzbfyVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        zzbgc zzbgcVar = this.zza;
        if (zzbgcVar.zzb == null) {
            return;
        }
        zzbgcVar.zzb.onCustomClick(zzbgcVar.zzf(zzberVar), str);
    }
}
