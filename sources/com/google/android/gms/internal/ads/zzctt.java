package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctt {
    private final zzfda zza;
    private final zzbzg zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgws zzg;
    private final String zzh;
    private final zzepq zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzeyx zzk;

    public zzctt(zzfda zzfdaVar, zzbzg zzbzgVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgws zzgwsVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzepq zzepqVar, zzeyx zzeyxVar) {
        this.zza = zzfdaVar;
        this.zzb = zzbzgVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgwsVar;
        this.zzh = str2;
        this.zzi = zzepqVar;
        this.zzj = zzgVar;
        this.zzk = zzeyxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzbtn zza(zzfut zzfutVar) throws Exception {
        return new zzbtn((Bundle) zzfutVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfut) this.zzg.zzb()).get(), this.zzh, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgK)).booleanValue() && this.zzj.zzP(), this.zzk.zzb());
    }

    public final zzfut zzb() {
        zzfda zzfdaVar = this.zza;
        return zzfck.zzc(this.zzi.zza(new Bundle()), zzfcu.SIGNALS, zzfdaVar).zza();
    }

    public final zzfut zzc() {
        final zzfut zzfutVarZzb = zzb();
        return this.zza.zza(zzfcu.REQUEST_PARCEL, zzfutVarZzb, (zzfut) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcts
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(zzfutVarZzb);
            }
        }).zza();
    }
}
