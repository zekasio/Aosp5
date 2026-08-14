package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfem {
    public static void zza(zzfut zzfutVar, zzfen zzfenVar, zzfec zzfecVar) {
        zzg(zzfutVar, zzfenVar, zzfecVar, false);
    }

    public static void zzb(zzfut zzfutVar, zzfen zzfenVar, zzfec zzfecVar) {
        zzg(zzfutVar, zzfenVar, zzfecVar, true);
    }

    public static void zzc(zzfut zzfutVar, zzfen zzfenVar, zzfec zzfecVar) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfutVar), new zzfel(zzfenVar, zzfecVar), zzbzn.zzf);
        }
    }

    public static void zzd(zzfut zzfutVar, zzfec zzfecVar) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfutVar), new zzfej(zzfecVar), zzbzn.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzia), str);
    }

    public static int zzf(zzeyx zzeyxVar) {
        int iZze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzeyxVar) - 1;
        return (iZze == 0 || iZze == 1) ? 7 : 23;
    }

    private static void zzg(zzfut zzfutVar, zzfen zzfenVar, zzfec zzfecVar, boolean z) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfuj.zzq(zzfua.zzv(zzfutVar), new zzfek(zzfenVar, zzfecVar, z), zzbzn.zzf);
        }
    }
}
