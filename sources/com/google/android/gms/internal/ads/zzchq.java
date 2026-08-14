package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchq extends zzequ {
    private final zzesa zza;
    private final zzchy zzb;
    private final zzchq zzc = this;
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

    /* synthetic */ zzchq(zzchy zzchyVar, zzesa zzesaVar, zzchp zzchpVar) {
        this.zzb = zzchyVar;
        this.zza = zzesaVar;
        zzesc zzescVar = new zzesc(zzesaVar);
        this.zzd = zzescVar;
        zzgxl zzgxlVarZzc = zzgwx.zzc(zzdoh.zza());
        this.zze = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(zzdof.zza());
        this.zzf = zzgxlVarZzc2;
        zzgxl zzgxlVarZzc3 = zzgwx.zzc(zzdoj.zza());
        this.zzg = zzgxlVarZzc3;
        zzgxl zzgxlVarZzc4 = zzgwx.zzc(zzdol.zza());
        this.zzh = zzgxlVarZzc4;
        zzgxb zzgxbVarZzc = zzgxc.zzc(4);
        zzgxbVarZzc.zzb(zzfcu.GMS_SIGNALS, zzgxlVarZzc);
        zzgxbVarZzc.zzb(zzfcu.BUILD_URL, zzgxlVarZzc2);
        zzgxbVarZzc.zzb(zzfcu.HTTP, zzgxlVarZzc3);
        zzgxbVarZzc.zzb(zzfcu.PRE_PROCESS, zzgxlVarZzc4);
        zzgxc zzgxcVarZzc = zzgxbVarZzc.zzc();
        this.zzi = zzgxcVarZzc;
        zzgxl zzgxlVarZzc5 = zzgwx.zzc(new zzdom(zzescVar, zzchyVar.zzh, zzfbv.zza(), zzgxcVarZzc));
        this.zzj = zzgxlVarZzc5;
        zzgxi zzgxiVarZza = zzgxj.zza(0, 1);
        zzgxiVarZza.zza(zzgxlVarZzc5);
        zzgxj zzgxjVarZzc = zzgxiVarZza.zzc();
        this.zzk = zzgxjVarZzc;
        zzfdd zzfddVar = new zzfdd(zzgxjVarZzc);
        this.zzl = zzfddVar;
        this.zzm = zzgwx.zzc(new zzfdc(zzfbv.zza(), zzchyVar.zzn, zzfddVar));
        this.zzn = zzgwx.zzc(new zzfeo(zzchyVar.zzH));
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final zzepq zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgxg.zzb(contextZza);
        zzbxx zzbxxVar = new zzbxx();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        zzeru zzeruVar = new zzeru(zzbxxVar, zzfuuVar, zzesb.zza(this.zza), null);
        zzfuu zzfuuVar2 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar2);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfen zzfenVar = (zzfen) this.zzn.zzb();
        zzdpi zzdpiVar = (zzdpi) this.zzb.zzZ.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzent(zzeruVar, 0L, scheduledExecutorService));
        return new zzepq(contextZza, zzfuuVar2, hashSet, zzfenVar, zzdpiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final zzfda zzb() {
        return (zzfda) this.zzm.zzb();
    }
}
