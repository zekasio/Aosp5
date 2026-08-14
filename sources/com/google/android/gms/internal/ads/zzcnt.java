package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnt {
    private final zzfdk zza;
    private final zzdpi zzb;
    private final zzeyo zzc;

    public zzcnt(zzdpi zzdpiVar, zzeyo zzeyoVar, zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
        this.zzb = zzdpiVar;
        this.zzc = zzeyoVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdk zzfdkVar = this.zza;
            zzfdj zzfdjVarZzb = zzfdj.zzb("ad_closed");
            zzfdjVarZzb.zzg(this.zzc.zzb.zzb);
            zzfdjVarZzb.zza("show_time", String.valueOf(j));
            zzfdjVarZzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzfdjVarZzb.zza("acr", zzb(i));
            zzfdkVar.zzb(zzfdjVarZzb);
            return;
        }
        zzdph zzdphVarZza = this.zzb.zza();
        zzdphVarZza.zze(this.zzc.zzb.zzb);
        zzdphVarZza.zzb("action", "ad_closed");
        zzdphVarZza.zzb("show_time", String.valueOf(j));
        zzdphVarZza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zzdphVarZza.zzb("acr", zzb(i));
        zzdphVarZza.zzg();
    }
}
