package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelw implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelw(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfqp zzfqpVarZzm;
        zzelm zzelmVarZza = zzelo.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdC)).booleanValue()) {
            zzfqpVarZzm = zzfqp.zzn(new zzent(zzelmVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdD)).intValue(), scheduledExecutorService));
        } else {
            zzfqpVarZzm = zzfqp.zzm();
        }
        zzgxg.zzb(zzfqpVarZzm);
        return zzfqpVarZzm;
    }
}
