package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezx {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzeax) {
            zzeax zzeaxVar = (zzeax) th;
            return zzc(zzeaxVar.zza(), zzeaxVar.zzb());
        }
        if (th instanceof zzdtf) {
            return th.getMessage() == null ? zzd(((zzdtf) th).zza(), null, null) : zzd(((zzdtf) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzay)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
        return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfoj.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzeay zzeayVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zza(th);
        int i = zzeVarZza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarZza.zzd = null;
        }
        if (zzeayVar != null) {
            zzeVarZza.zze = zzeayVar.zzb();
        }
        return zzeVarZza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhE)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return zzd(i, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezx.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
