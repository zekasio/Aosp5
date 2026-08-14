package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziy extends zzap {
    final /* synthetic */ zzjm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziy(zzjm zzjmVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjmVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zzt.zzay().zzk().zza("Tasks have been queued for a long time");
    }
}
