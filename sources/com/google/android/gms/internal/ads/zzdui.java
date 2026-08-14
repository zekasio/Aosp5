package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdui implements zzfuf {
    final /* synthetic */ zzduj zza;

    zzdui(zzduj zzdujVar) {
        this.zza = zzdujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            Matcher matcher = zzduj.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeyo zzeyoVar = (zzeyo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            this.zza.zzf.zzi(zzeyoVar.zzb.zzb.zze);
            this.zza.zzf.zzj(zzeyoVar.zzb.zzb.zzf);
        }
    }
}
