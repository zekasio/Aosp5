package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqm extends zzbfa {
    final /* synthetic */ zzbqp zza;

    /* synthetic */ zzbqm(zzbqp zzbqpVar, zzbql zzbqlVar) {
        this.zza = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        zzbqp zzbqpVar = this.zza;
        if (zzbqpVar.zzb == null) {
            return;
        }
        zzbqpVar.zzb.onCustomClick(zzbqpVar.zzf(zzberVar), str);
    }
}
