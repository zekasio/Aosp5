package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcr {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final String zzc;
    private final zzfut zzd;
    private final List zze;
    private final zzfut zzf;

    private zzfcr(zzfcs zzfcsVar, Object obj, String str, zzfut zzfutVar, List list, zzfut zzfutVar2) {
        this.zza = zzfcsVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfutVar;
        this.zze = list;
        this.zzf = zzfutVar2;
    }

    public final zzfcf zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfcf zzfcfVar = new zzfcf(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfcfVar);
        this.zzd.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // java.lang.Runnable
            public final void run() {
                zzfcr zzfcrVar = this.zza;
                zzfcrVar.zza.zzd.zzc(zzfcfVar);
            }
        }, zzbzn.zzf);
        zzfuj.zzq(zzfcfVar, new zzfcp(this, zzfcfVar), zzbzn.zzf);
        return zzfcfVar;
    }

    public final zzfcr zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfcr zzc(Class cls, zzftq zzftqVar) {
        zzfcs zzfcsVar = this.zza;
        return new zzfcr(zzfcsVar, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzf(this.zzf, cls, zzftqVar, zzfcsVar.zzb));
    }

    public final zzfcr zzd(final zzfut zzfutVar) {
        return zzg(new zzftq() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfutVar;
            }
        }, zzbzn.zzf);
    }

    public final zzfcr zze(final zzfcd zzfcdVar) {
        return zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzfcdVar.zza(obj));
            }
        });
    }

    public final zzfcr zzf(zzftq zzftqVar) {
        return zzg(zzftqVar, this.zza.zzb);
    }

    public final zzfcr zzg(zzftq zzftqVar, Executor executor) {
        return new zzfcr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzm(this.zzf, zzftqVar, executor));
    }

    public final zzfcr zzh(String str) {
        return new zzfcr(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfcr zzi(long j, TimeUnit timeUnit) {
        zzfcs zzfcsVar = this.zza;
        return new zzfcr(zzfcsVar, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzn(this.zzf, j, timeUnit, zzfcsVar.zzc));
    }
}
