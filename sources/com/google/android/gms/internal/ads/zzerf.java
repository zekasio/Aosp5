package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerf implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzerf(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
    }

    public static zzerd zza(String str, zzavh zzavhVar, zzbyj zzbyjVar, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar) {
        return new zzerd(str, zzavhVar, zzbyjVar, scheduledExecutorService, zzfuuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strZza = ((zzesi) this.zza).zza();
        zzavh zzavhVar = new zzavh();
        zzbyj zzbyjVar = (zzbyj) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzerd(strZza, zzavhVar, zzbyjVar, scheduledExecutorService, zzfuuVar, null);
    }
}
