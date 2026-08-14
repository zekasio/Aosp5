package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfia {
    private final Context zza;
    private final Looper zzb;

    public zzfia(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfio zzfioVarZza = zzfiq.zza();
        zzfioVarZza.zza(this.zza.getPackageName());
        zzfioVarZza.zzc(2);
        zzfil zzfilVarZza = zzfim.zza();
        zzfilVarZza.zza(str);
        zzfilVarZza.zzb(2);
        zzfioVarZza.zzb(zzfilVarZza);
        new zzfib(this.zza, this.zzb, (zzfiq) zzfioVarZza.zzal()).zza();
    }
}
