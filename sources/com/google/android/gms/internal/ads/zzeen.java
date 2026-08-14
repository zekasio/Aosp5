package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeen implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    public zzeen(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9, zzgxl zzgxlVar10, zzgxl zzgxlVar11) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
        this.zzh = zzgxlVar8;
        this.zzi = zzgxlVar9;
        this.zzj = zzgxlVar10;
        this.zzk = zzgxlVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeem zzb() {
        Context contextZza = ((zzcgj) this.zza).zza();
        zzfda zzfdaVar = (zzfda) this.zzb.zzb();
        zzeeh zzeehVar = (zzeeh) this.zzc.zzb();
        zzcuq zzcuqVar = (zzcuq) this.zzd.zzb();
        zzffb zzffbVar = (zzffb) this.zze.zzb();
        zzfff zzfffVar = (zzfff) this.zzf.zzb();
        zzcqp zzcqpVar = (zzcqp) this.zzg.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzeem(contextZza, zzfdaVar, zzeehVar, zzcuqVar, zzffbVar, zzfffVar, zzcqpVar, zzfuuVar, (ScheduledExecutorService) this.zzi.zzb(), (zzeay) this.zzj.zzb(), (zzfen) this.zzk.zzb());
    }
}
