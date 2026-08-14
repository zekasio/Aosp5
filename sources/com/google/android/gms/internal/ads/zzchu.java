package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchu extends zzeqw {
    private final zzeqk zza;
    private final zzchy zzb;
    private final zzchu zzc = this;
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

    /* synthetic */ zzchu(zzchy zzchyVar, zzeqk zzeqkVar, zzcht zzchtVar) {
        this.zzb = zzchyVar;
        this.zza = zzeqkVar;
        this.zzd = zzgwx.zzc(new zzfeo(zzchyVar.zzH));
        zzeqs zzeqsVar = new zzeqs(zzeqkVar);
        this.zze = zzeqsVar;
        zzgxl zzgxlVarZzc = zzgwx.zzc(zzdoh.zza());
        this.zzf = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(zzdof.zza());
        this.zzg = zzgxlVarZzc2;
        zzgxl zzgxlVarZzc3 = zzgwx.zzc(zzdoj.zza());
        this.zzh = zzgxlVarZzc3;
        zzgxl zzgxlVarZzc4 = zzgwx.zzc(zzdol.zza());
        this.zzi = zzgxlVarZzc4;
        zzgxb zzgxbVarZzc = zzgxc.zzc(4);
        zzgxbVarZzc.zzb(zzfcu.GMS_SIGNALS, zzgxlVarZzc);
        zzgxbVarZzc.zzb(zzfcu.BUILD_URL, zzgxlVarZzc2);
        zzgxbVarZzc.zzb(zzfcu.HTTP, zzgxlVarZzc3);
        zzgxbVarZzc.zzb(zzfcu.PRE_PROCESS, zzgxlVarZzc4);
        zzgxc zzgxcVarZzc = zzgxbVarZzc.zzc();
        this.zzj = zzgxcVarZzc;
        zzgxl zzgxlVarZzc5 = zzgwx.zzc(new zzdom(zzeqsVar, zzchyVar.zzh, zzfbv.zza(), zzgxcVarZzc));
        this.zzk = zzgxlVarZzc5;
        zzgxi zzgxiVarZza = zzgxj.zza(0, 1);
        zzgxiVarZza.zza(zzgxlVarZzc5);
        zzgxj zzgxjVarZzc = zzgxiVarZza.zzc();
        this.zzl = zzgxjVarZzc;
        zzfdd zzfddVar = new zzfdd(zzgxjVarZzc);
        this.zzm = zzfddVar;
        this.zzn = zzgwx.zzc(new zzfdc(zzfbv.zza(), zzchyVar.zzn, zzfddVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeqw
    public final zzepq zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgxg.zzb(contextZza);
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        zzbxx zzbxxVar = new zzbxx();
        zzfuu zzfuuVar2 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar2);
        zzepn zzepnVarZza = zzesq.zza(new zzeru(zzbxxVar, zzfuuVar2, zzeql.zza(this.zza), null), zzenn.zza(), (ScheduledExecutorService) this.zzb.zzn.zzb(), 0);
        zzbrg zzbrgVar = new zzbrg();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzn.zzb();
        Context contextZza2 = this.zzb.zza.zza();
        zzgxg.zzb(contextZza2);
        zzepn zzepnVarZzb = zzesq.zzb(new zzese(zzbrgVar, scheduledExecutorService, contextZza2, null), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzbya zzbyaVar = new zzbya();
        Context contextZza3 = this.zzb.zza.zza();
        zzgxg.zzb(contextZza3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfuu zzfuuVar3 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar3);
        zzepn zzepnVarZza2 = zzesr.zza(zzeqe.zza(zzbyaVar, contextZza3, scheduledExecutorService2, zzfuuVar3, zzeqm.zza(this.zza), zzeqo.zza(this.zza), zzeqp.zza(this.zza)), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzfuu zzfuuVar4 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar4);
        zzepn zzepnVarZzc = zzesq.zzc(new zzesz(zzfuuVar4), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzeso zzesoVar = zzeso.zza;
        Context contextZza4 = this.zzb.zza.zza();
        zzgxg.zzb(contextZza4);
        String strZza = zzeql.zza(this.zza);
        zzfuu zzfuuVar5 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar5);
        zzeqy zzeqyVar = new zzeqy(null, contextZza4, strZza, zzfuuVar5);
        zzavt zzavtVar = new zzavt();
        zzfuu zzfuuVar6 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar6);
        Context contextZza5 = this.zzb.zza.zza();
        zzgxg.zzb(contextZza5);
        zzbac zzbacVar = new zzbac();
        zzfuu zzfuuVar7 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar7);
        zzbya zzbyaVar2 = new zzbya();
        zzfuu zzfuuVar8 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar8);
        zzbya zzbyaVar3 = new zzbya();
        int iZza = zzeqm.zza(this.zza);
        Context contextZza6 = this.zzb.zza.zza();
        zzgxg.zzb(contextZza6);
        zzbyj zzbyjVar = (zzbyj) this.zzb.zzag.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfuu zzfuuVar9 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar9);
        String strZza2 = zzeql.zza(this.zza);
        zzavh zzavhVar = new zzavh();
        zzbyj zzbyjVar2 = (zzbyj) this.zzb.zzag.zzb();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.zzb.zzn.zzb();
        zzfuu zzfuuVar10 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar10);
        return new zzepq(contextZza, zzfuuVar, zzfqp.zzp(zzepnVarZza, zzepnVarZzb, zzepnVarZza2, zzepnVarZzc, zzesoVar, zzeqyVar, new zzern(zzavtVar, zzfuuVar6, contextZza5, null), new zzery(zzbacVar, zzfuuVar7, zzeqn.zza(this.zza), null), new zzeqi(zzbyaVar2, zzfuuVar8, zzeqq.zza(this.zza), zzeqr.zza(this.zza), zzeqm.zza(this.zza), null), new zzerj(zzbyaVar3, iZza, contextZza6, zzbyjVar, scheduledExecutorService3, zzfuuVar9, zzeql.zza(this.zza), null), (zzepn) this.zzb.zzaI.zzb(), zzerf.zza(strZza2, zzavhVar, zzbyjVar2, scheduledExecutorService4, zzfuuVar10)), (zzfen) this.zzd.zzb(), (zzdpi) this.zzb.zzZ.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeqw
    public final zzfda zzb() {
        return (zzfda) this.zzn.zzb();
    }
}
