package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftd extends zzftf {
    zzftd(zzfut zzfutVar, zzftq zzftqVar) {
        super(zzfutVar, zzftqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzftq zzftqVar = (zzftq) obj;
        zzfut zzfutVarZza = zzftqVar.zza(obj2);
        zzfnu.zzd(zzfutVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzftqVar);
        return zzfutVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfut) obj);
    }
}
