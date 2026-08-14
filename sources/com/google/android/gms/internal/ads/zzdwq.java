package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwq {
    public zzfut zza;
    private final zzcxh zzb;
    private final zzdvy zzc;
    private final zzfda zzd;
    private final zzeyx zze;
    private final zzbzg zzf;
    private final zzfep zzg;
    private final zzfen zzh;
    private final Context zzi;
    private final zzfuu zzj;

    zzdwq(zzcxh zzcxhVar, zzdvy zzdvyVar, zzfda zzfdaVar, zzeyx zzeyxVar, zzbzg zzbzgVar, zzfep zzfepVar, zzfen zzfenVar, Context context, zzfuu zzfuuVar) {
        this.zzb = zzcxhVar;
        this.zzc = zzdvyVar;
        this.zzd = zzfdaVar;
        this.zze = zzeyxVar;
        this.zzf = zzbzgVar;
        this.zzg = zzfepVar;
        this.zzh = zzfenVar;
        this.zzi = context;
        this.zzj = zzfuuVar;
    }

    final /* synthetic */ zzbsv zza(zzbtn zzbtnVar, zzdyb zzdybVar) {
        Context context = this.zzi;
        zzdybVar.zzc.put("Content-Type", zzdybVar.zze);
        zzdybVar.zzc.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbtnVar.zzb.zza));
        String str = zzdybVar.zza;
        int i = zzdybVar.zzb;
        Map map = zzdybVar.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbsv(str, i, bundle, zzdybVar.zzd, zzdybVar.zzf, zzbtnVar.zzd, zzbtnVar.zzh);
    }

    public final zzfut zzc(final zzbtn zzbtnVar, final JSONObject jSONObject, final zzbtq zzbtqVar) {
        this.zzb.zzbA(zzbtnVar);
        zzfcr zzfcrVarZzb = this.zzd.zzb(zzfcu.PROXY, zzfuj.zzl(this.zzd.zzb(zzfcu.PREPARE_HTTP_REQUEST, zzfuj.zzh(new zzdyf(jSONObject, zzbtqVar))).zze(new zzdyg(zzbtnVar.zzg, this.zzh, zzfeb.zza(this.zzi, 9))).zza(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdwo
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return this.zza.zza(zzbtnVar, (zzdyb) obj);
            }
        }, this.zzj));
        final zzdvy zzdvyVar = this.zzc;
        zzfcf zzfcfVarZza = zzfcrVarZzb.zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdvyVar.zzc((zzbsv) obj);
            }
        }).zza();
        this.zza = zzfcfVarZza;
        zzfut zzfutVarZzm = zzfuj.zzm(this.zzd.zzb(zzfcu.PRE_PROCESS, zzfcfVarZza).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                return new zzdxo(zzdyc.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbtqVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdxo.zza, zzbmc.zzb)).zza(), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzfuj.zzq(zzfutVarZzm, new zzdwp(this), this.zzj);
        return zzfutVarZzm;
    }

    final /* synthetic */ zzfut zzd(InputStream inputStream) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zze), zzeyn.zza(new InputStreamReader(inputStream))));
    }
}
