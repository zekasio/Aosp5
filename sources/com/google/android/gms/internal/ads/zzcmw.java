package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmw implements zzgwy {
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
    private final zzgxl zzl;
    private final zzgxl zzm;
    private final zzgxl zzn;
    private final zzgxl zzo;

    public zzcmw(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9, zzgxl zzgxlVar10, zzgxl zzgxlVar11, zzgxl zzgxlVar12, zzgxl zzgxlVar13, zzgxl zzgxlVar14, zzgxl zzgxlVar15) {
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
        this.zzl = zzgxlVar12;
        this.zzm = zzgxlVar13;
        this.zzn = zzgxlVar14;
        this.zzo = zzgxlVar15;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzcgj) this.zza).zza();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzcmv(contextZza, zzfuuVar, (Executor) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), ((zzcrf) this.zze).zza(), ((zzcrc) this.zzf).zza(), (zzffb) this.zzg.zzb(), (zzezg) this.zzh.zzb(), (View) this.zzi.zzb(), (zzcei) this.zzj.zzb(), (zzapw) this.zzk.zzb(), (zzbbt) this.zzl.zzb(), new zzbbv(), (zzfen) this.zzn.zzb(), ((zzcuc) this.zzo).zza(), null);
    }
}
