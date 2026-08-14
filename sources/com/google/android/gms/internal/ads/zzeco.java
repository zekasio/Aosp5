package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeco implements zzeat {
    private final zzcph zza;
    private final zzebv zzb;
    private final zzfuu zzc;
    private final zzcuq zzd;
    private final ScheduledExecutorService zze;

    public zzeco(zzcph zzcphVar, zzebv zzebvVar, zzcuq zzcuqVar, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar) {
        this.zza = zzcphVar;
        this.zzb = zzebvVar;
        this.zzd = zzcuqVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzecl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzeyoVar, zzeycVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        return zzeyoVar.zza.zza.zza() != null && this.zzb.zzb(zzeyoVar, zzeycVar);
    }

    final /* synthetic */ zzcok zzc(final zzeyo zzeyoVar, final zzeyc zzeycVar) throws Exception {
        return this.zza.zzb(new zzcrb(zzeyoVar, zzeycVar, null), new zzcpu(zzeyoVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzeyoVar, zzeycVar);
            }
        })).zza();
    }

    final /* synthetic */ void zzf(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzfuj.zzq(zzfuj.zzn(this.zzb.zza(zzeyoVar, zzeycVar), zzeycVar.zzS, TimeUnit.SECONDS, this.zze), new zzecn(this), this.zzc);
    }
}
