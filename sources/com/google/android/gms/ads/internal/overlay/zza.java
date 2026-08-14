package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzzVar, zzx zzxVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzzVar, zzxVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzbza.zzj(e.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzz zzzVar, zzx zzxVar) {
        int i = 0;
        if (zzcVar == null) {
            zzbza.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbar.zzc(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            zzbza.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                zzbza.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = zzcVar.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzba.zzc().zzb(zzbar.zzec)).booleanValue()) {
            intent2.addFlags(DriveFile.MODE_READ_ONLY);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzeb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intent2);
            }
        }
        return zza(context, intent2, zzzVar, zzxVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzz zzzVar, zzx zzxVar) {
        int iZzk;
        try {
            iZzk = com.google.android.gms.ads.internal.zzt.zzp().zzk(context, uri);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
        } catch (ActivityNotFoundException e) {
            zzbza.zzj(e.getMessage());
            iZzk = 6;
        }
        if (zzxVar != null) {
            zzxVar.zzb(iZzk);
        }
        return iZzk == 5;
    }
}
