package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfci {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfci(zzfcs zzfcsVar, Object obj, List list, zzfch zzfchVar) {
        this.zza = zzfcsVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfcr zza(Callable callable) {
        zzfui zzfuiVarZzb = zzfuj.zzb(this.zzc);
        zzfut zzfutVarZza = zzfuiVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbzn.zzf);
        zzfcs zzfcsVar = this.zza;
        return new zzfcr(zzfcsVar, this.zzb, zzfutVarZza, this.zzc, zzfuiVarZzb.zza(callable, zzfcsVar.zzb));
    }
}
