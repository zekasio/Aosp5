package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cz.msebera.android.httpclient.cookie.SM;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyg implements zzfcd {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfec zzc;
    private final zzfen zzd;

    public zzdyg(String str, zzfen zzfenVar, zzfec zzfecVar) {
        this.zzb = str;
        this.zzd = zzfenVar;
        this.zzc = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdtf zzdtfVar;
        String strConcat;
        zzdyf zzdyfVar = (zzdyf) obj;
        int iOptInt = zzdyfVar.zza.optInt("http_timeout_millis", 60000);
        zzbtq zzbtqVar = zzdyfVar.zzb;
        String strJoin = "";
        if (zzbtqVar.zza() != -2) {
            if (zzbtqVar.zza() == 1) {
                if (zzbtqVar.zzf() != null) {
                    strJoin = TextUtils.join(", ", zzbtqVar.zzf());
                    zzbza.zzg(strJoin);
                }
                zzdtfVar = new zzdtf(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdtfVar = new zzdtf(1);
            }
            zzfen zzfenVar = this.zzd;
            zzfec zzfecVar = this.zzc;
            zzfecVar.zzg(zzdtfVar);
            zzfecVar.zzf(false);
            zzfenVar.zza(zzfecVar);
            throw zzdtfVar;
        }
        HashMap map = new HashMap();
        if (zzdyfVar.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaI)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(strConcat)) {
                                strConcat = strConcat.concat("; ");
                            }
                            strConcat = strConcat.concat(strGroup);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(SM.COOKIE, strConcat);
                }
            } else {
                map.put(SM.COOKIE, this.zzb);
            }
        }
        if (zzdyfVar.zzb.zzi()) {
            zzdyh.zza(map, zzdyfVar.zza);
        }
        if (zzdyfVar.zzb != null && !TextUtils.isEmpty(zzdyfVar.zzb.zzd())) {
            strJoin = zzdyfVar.zzb.zzd();
        }
        zzfen zzfenVar2 = this.zzd;
        zzfec zzfecVar2 = this.zzc;
        zzfecVar2.zzf(true);
        zzfenVar2.zza(zzfecVar2);
        return new zzdyb(zzdyfVar.zzb.zze(), iOptInt, map, strJoin.getBytes(zzfnh.zzc), "", zzdyfVar.zzb.zzi());
    }
}
