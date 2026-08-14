package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqo extends zzbfd {
    final /* synthetic */ zzbqp zza;

    /* synthetic */ zzbqo(zzbqp zzbqpVar, zzbqn zzbqnVar) {
        this.zza = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) {
        zzbqp zzbqpVar = this.zza;
        zzbqpVar.zza.onCustomFormatAdLoaded(zzbqpVar.zzf(zzberVar));
    }
}
