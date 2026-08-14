package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxh {
    static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzt.zzn().zzu(context)) {
            return uri.toString();
        }
        String strZza = com.google.android.gms.ads.internal.zzt.zzn().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzac);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzab)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
            return zzd(string, context).replace(str, strZza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
        com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
        return string2;
    }

    public static String zzc(String str, Context context, boolean z) {
        String strZza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaj)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzn().zzu(context) || TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzt.zzn().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzac);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzab)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
                com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
                return zzd(str, context).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzn().zzn(context, strZza);
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzn(context, strZza);
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static String zzd(String str, Context context) {
        String strZze = com.google.android.gms.ads.internal.zzt.zzn().zze(context);
        String strZzc = com.google.android.gms.ads.internal.zzt.zzn().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZze)) {
            str = zza(str, "gmp_app_id", strZze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzc)) ? str : zza(str, "fbs_aiid", strZzc).toString();
    }
}
