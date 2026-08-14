package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeem implements zzftq {
    private final zzfda zza;
    private final zzcuq zzb;
    private final zzffb zzc;
    private final zzfff zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqp zzg;
    private final zzeeh zzh;
    private final zzeay zzi;
    private final Context zzj;
    private final zzfen zzk;

    zzeem(Context context, zzfda zzfdaVar, zzeeh zzeehVar, zzcuq zzcuqVar, zzffb zzffbVar, zzfff zzfffVar, zzcqp zzcqpVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeay zzeayVar, zzfen zzfenVar) {
        this.zzj = context;
        this.zza = zzfdaVar;
        this.zzh = zzeehVar;
        this.zzb = zzcuqVar;
        this.zzc = zzffbVar;
        this.zzd = zzfffVar;
        this.zzg = zzcqpVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeayVar;
        this.zzk = zzfenVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // com.google.android.gms.internal.ads.zzftq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfut zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfut");
    }

    final /* synthetic */ zzfut zzb(zzeyc zzeycVar, zzeyo zzeyoVar, zzeat zzeatVar, Throwable th) throws Exception {
        zzfec zzfecVarZza = zzfeb.zza(this.zzj, 12);
        zzfecVarZza.zzd(zzeycVar.zzF);
        zzfecVarZza.zzh();
        zzeeh zzeehVar = this.zzh;
        zzfut zzfutVarZzn = zzfuj.zzn(zzeatVar.zza(zzeyoVar, zzeycVar), zzeycVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeehVar.zze(zzeyoVar, zzeycVar, zzfutVarZzn, this.zzc);
        zzfem.zza(zzfutVarZzn, this.zzk, zzfecVarZza);
        return zzfutVarZzn;
    }
}
