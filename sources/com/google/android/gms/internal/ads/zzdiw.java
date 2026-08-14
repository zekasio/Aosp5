package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdiw {
    private final zzfuu zza;
    private final zzdjj zzb;
    private final zzdjo zzc;

    public zzdiw(zzfuu zzfuuVar, zzdjj zzdjjVar, zzdjo zzdjoVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdjjVar;
        this.zzc = zzdjoVar;
    }

    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        zzfut zzfutVarZzh;
        final zzfut zzfutVarZzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdiu
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzeek {
                zzeyo zzeyoVar2 = zzeyoVar;
                zzeyc zzeycVar2 = zzeycVar;
                JSONObject jSONObject2 = jSONObject;
                zzdgi zzdgiVar = new zzdgi();
                zzdgiVar.zzX(jSONObject2.optInt(ReportDBAdapter.ReportColumns.COLUMN_TEMPATE_ID, -1));
                zzdgiVar.zzJ(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                zzdgiVar.zzU(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                zzeyx zzeyxVar = zzeyoVar2.zza.zza;
                if (!zzeyxVar.zzg.contains(Integer.toString(zzdgiVar.zzc()))) {
                    throw new zzeek(1, "Invalid template ID: " + zzdgiVar.zzc());
                }
                if (zzdgiVar.zzc() == 3) {
                    if (zzdgiVar.zzz() == null) {
                        throw new zzeek(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzeyxVar.zzh.contains(zzdgiVar.zzz())) {
                        throw new zzeek(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdgiVar.zzV(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzeycVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    strOptString = com.google.android.gms.ads.internal.util.zzs.zzu() + " : " + strOptString;
                }
                zzdgiVar.zzW("headline", strOptString);
                zzdgiVar.zzW("body", jSONObject2.optString("body", null));
                zzdgiVar.zzW("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdgiVar.zzW(TapjoyConstants.TJC_STORE, jSONObject2.optString(TapjoyConstants.TJC_STORE, null));
                zzdgiVar.zzW(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                zzdgiVar.zzW(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, jSONObject2.optString(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, null));
                return zzdgiVar;
            }
        });
        final zzfut zzfutVarZzf = this.zzb.zzf(jSONObject, "images");
        final zzfut zzfutVarZzg = this.zzb.zzg(jSONObject, "images", zzeycVar, zzeyoVar.zzb.zzb);
        final zzfut zzfutVarZze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfut zzfutVarZze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfut zzfutVarZzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfut zzfutVarZzh2 = this.zzb.zzh(jSONObject, zzeycVar, zzeyoVar.zzb.zzb);
        final zzfut zzfutVarZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdjj zzdjjVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            zzfutVarZzh = TextUtils.isEmpty(strOptString) ? zzfuj.zzh(null) : zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdiy
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzdjjVar.zzc(strOptString, obj);
                }
            }, zzbzn.zze);
        } else {
            zzfutVarZzh = zzfuj.zzh(null);
        }
        final zzfut zzfutVar = zzfutVarZzh;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzfutVarZzb);
        arrayList.add(zzfutVarZzf);
        arrayList.add(zzfutVarZzg);
        arrayList.add(zzfutVarZze);
        arrayList.add(zzfutVarZze2);
        arrayList.add(zzfutVarZzd);
        arrayList.add(zzfutVarZzh2);
        arrayList.add(zzfutVarZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
            arrayList.add(zzfutVar);
        }
        return zzfuj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdiv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfut zzfutVar2 = zzfutVarZzb;
                zzfut zzfutVar3 = zzfutVarZzf;
                zzfut zzfutVar4 = zzfutVarZze2;
                zzfut zzfutVar5 = zzfutVarZze;
                zzfut zzfutVar6 = zzfutVarZzd;
                JSONObject jSONObject2 = jSONObject;
                zzfut zzfutVar7 = zzfutVarZzh2;
                zzfut zzfutVar8 = zzfutVarZzg;
                zzfut zzfutVar9 = zzfutVar;
                zzfut zzfutVar10 = zzfutVarZza;
                zzdgi zzdgiVar = (zzdgi) zzfutVar2.get();
                zzdgiVar.zzO((List) zzfutVar3.get());
                zzdgiVar.zzL((zzbdx) zzfutVar4.get());
                zzdgiVar.zzP((zzbdx) zzfutVar5.get());
                zzdgiVar.zzI((zzbdp) zzfutVar6.get());
                zzdgiVar.zzR(zzdjj.zzj(jSONObject2));
                zzdgiVar.zzK(zzdjj.zzi(jSONObject2));
                zzcei zzceiVar = (zzcei) zzfutVar7.get();
                if (zzceiVar != null) {
                    zzdgiVar.zzaa(zzceiVar);
                    zzdgiVar.zzZ(zzceiVar.zzF());
                    zzdgiVar.zzY(zzceiVar.zzq());
                }
                zzcei zzceiVar2 = (zzcei) zzfutVar8.get();
                if (zzceiVar2 != null) {
                    zzdgiVar.zzN(zzceiVar2);
                    zzdgiVar.zzab(zzceiVar2.zzF());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
                    zzdgiVar.zzT(zzfutVar9);
                } else {
                    zzcei zzceiVar3 = (zzcei) zzfutVar9.get();
                    if (zzceiVar3 != null) {
                        zzdgiVar.zzS(zzceiVar3);
                    }
                }
                for (zzdjn zzdjnVar : (List) zzfutVar10.get()) {
                    if (zzdjnVar.zza != 1) {
                        zzdgiVar.zzM(zzdjnVar.zzb, zzdjnVar.zzd);
                    } else {
                        zzdgiVar.zzW(zzdjnVar.zzb, zzdjnVar.zzc);
                    }
                }
                return zzdgiVar;
            }
        }, this.zza);
    }
}
