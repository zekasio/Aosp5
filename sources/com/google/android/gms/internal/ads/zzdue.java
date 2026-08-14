package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdue {
    private final ScheduledExecutorService zza;
    private final zzfuu zzb;
    private final zzfuu zzc;
    private final zzduv zzd;
    private final zzgws zze;

    public zzdue(ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar, zzfuu zzfuuVar2, zzduv zzduvVar, zzgws zzgwsVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfuuVar;
        this.zzc = zzfuuVar2;
        this.zzd = zzduvVar;
        this.zze = zzgwsVar;
    }

    final /* synthetic */ zzfut zza(zzbtn zzbtnVar, int i, Throwable th) throws Exception {
        return ((zzdxp) this.zze.zzb()).zzd(zzbtnVar, i);
    }

    public final zzfut zzb(final zzbtn zzbtnVar) {
        zzfut zzfutVarZzb;
        String str = zzbtnVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfutVarZzb = zzfuj.zzg(new zzdvi(1));
        } else {
            zzfutVarZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhc)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzduc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc(zzbtnVar);
                }
            }) : this.zzd.zzb(zzbtnVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfuj.zzf((zzfua) zzfuj.zzn(zzfua.zzv(zzfutVarZzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdud
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zza(zzbtnVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzc(zzbtn zzbtnVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbtnVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
    }
}
