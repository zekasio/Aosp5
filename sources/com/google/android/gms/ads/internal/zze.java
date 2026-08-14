package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzbzg zzbzgVar, String str, Runnable runnable, zzfep zzfepVar) {
        zzb(context, zzbzgVar, true, null, str, null, runnable, zzfepVar);
    }

    final void zzb(Context context, zzbzg zzbzgVar, boolean z, zzbyd zzbydVar, String str, String str2, Runnable runnable, final zzfep zzfepVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzbza.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbydVar != null) {
            if (zzt.zzB().currentTimeMillis() - zzbydVar.zza() <= ((Long) zzba.zzc().zzb(zzbar.zzdF)).longValue() && zzbydVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzbza.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzbza.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfec zzfecVarZza = zzfeb.zza(context, 4);
        zzfecVarZza.zzh();
        zzblv zzblvVarZza = zzt.zzf().zza(this.zza, zzbzgVar, zzfepVar).zza("google.afma.config.fetchAppSettings", zzbmc.zza, zzbmc.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbar.zza()));
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put(ClientCookie.VERSION_ATTR, packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfut zzfutVarZzb = zzblvVarZza.zzb(jSONObject);
            zzfut zzfutVarZzm = zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) throws JSONException {
                    zzfep zzfepVar2 = zzfepVar;
                    zzfec zzfecVar = zzfecVarZza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfecVar.zzf(zOptBoolean);
                    zzfepVar2.zzb(zzfecVar.zzl());
                    return zzfuj.zzh(null);
                }
            }, zzbzn.zzf);
            if (runnable != null) {
                zzfutVarZzb.zzc(runnable, zzbzn.zzf);
            }
            zzbzq.zza(zzfutVarZzm, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            zzbza.zzh("Error requesting application settings", e);
            zzfecVarZza.zzg(e);
            zzfecVarZza.zzf(false);
            zzfepVar.zzb(zzfecVarZza.zzl());
        }
    }

    public final void zzc(Context context, zzbzg zzbzgVar, String str, zzbyd zzbydVar, zzfep zzfepVar) {
        zzb(context, zzbzgVar, false, zzbydVar, zzbydVar != null ? zzbydVar.zzb() : null, str, null, zzfepVar);
    }
}
