package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtt implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbtv zzb;

    zzbtt(zzbtv zzbtvVar, Context context) {
        this.zzb = zzbtvVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbtu zzbtuVar = (zzbtu) this.zzb.zza.get(this.zza);
        zzbts zzbtsVarZza = (zzbtuVar == null || zzbtuVar.zza + ((Long) zzbca.zza.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) ? new zzbtr(this.zza).zza() : new zzbtr(this.zza, zzbtuVar.zzb).zza();
        zzbtv zzbtvVar = this.zzb;
        zzbtvVar.zza.put(this.zza, new zzbtu(zzbtvVar, zzbtsVarZza));
        return zzbtsVarZza;
    }
}
