package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvy {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdwt zzc;
    private final zzgws zzd;

    zzdvy(zzfuu zzfuuVar, zzfuu zzfuuVar2, zzdwt zzdwtVar, zzgws zzgwsVar) {
        this.zza = zzfuuVar;
        this.zzb = zzfuuVar2;
        this.zzc = zzdwtVar;
        this.zzd = zzgwsVar;
    }

    final /* synthetic */ zzfut zza(zzbsv zzbsvVar) throws Exception {
        return this.zzc.zza(zzbsvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjI)).longValue());
    }

    final /* synthetic */ zzfut zzb(zzbsv zzbsvVar, int i, zzdvi zzdviVar) throws Exception {
        return ((zzdxz) this.zzd.zzb()).zzb(zzbsvVar, i);
    }

    public final zzfut zzc(final zzbsv zzbsvVar) {
        String str = zzbsvVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfut zzfutVarZzg = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfuj.zzg(new zzdvi(1, "Ads service proxy force local")) : zzfuj.zzf(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzdvv
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return this.zza.zza(zzbsvVar);
            }
        }, this.zza), ExecutionException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvw
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfuj.zzg(cause2);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfuj.zzf(zzfutVarZzg, zzdvi.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvx
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzb(zzbsvVar, callingUid, (zzdvi) obj);
            }
        }, this.zzb);
    }
}
