package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduo {
    private final zzcgd zza;
    private final Context zzb;
    private final zzbzg zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfen zzg;
    private final zzezj zzh;
    private final zzdpd zzi;

    public zzduo(zzcgd zzcgdVar, Context context, zzbzg zzbzgVar, zzeyx zzeyxVar, Executor executor, String str, zzfen zzfenVar, zzdpd zzdpdVar) {
        this.zza = zzcgdVar;
        this.zzb = context;
        this.zzc = zzbzgVar;
        this.zzd = zzeyxVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfenVar;
        this.zzh = zzcgdVar.zzv();
        this.zzi = zzdpdVar;
    }

    private final zzfut zzc(final String str, final String str2) {
        zzfec zzfecVarZza = zzfeb.zza(this.zzb, 11);
        zzfecVarZza.zzh();
        final zzblv zzblvVarZza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbmc.zza, zzbmc.zza);
        zzfut zzfutVarZzm = zzfuj.zzm(zzfuj.zzm(zzfuj.zzm(zzfuj.zzh(""), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdul
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) throws JSONException {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfuj.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdum
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzblvVarZza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdun
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfem.zza(zzfutVarZzm, this.zzg, zzfecVarZza);
        return zzfutVarZzm;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzbza.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final zzfut zza() {
        String strZzb = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgz)).booleanValue()) {
                String strZze = zze(strZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgL)).booleanValue() && strZze.isEmpty()) {
                    int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                    strZze = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strZze)) {
                    return zzfuj.zzg(new zzeek(15, "Invalid ad string."));
                }
                String strZzb2 = this.zza.zzm().zzb(strZze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgL)).booleanValue()) {
                    zzdpd zzdpdVar = this.zzi;
                    if (!TextUtils.isEmpty(strZzb2)) {
                        Boolean bool = new JSONObject(strZzb2).optString("is_gbid").equals("true");
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strZze.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strZzb2).getString("arek");
                                    } catch (JSONException e) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strZzb = zzezj.zzb(bArrDecode, bytes, string, zzdpdVar);
                                } catch (UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return zzc(strZzb, zzd(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgx)).booleanValue()) {
                String strZze2 = zze(zzcVar.zza);
                String strZze3 = zze(zzcVar.zzb);
                if (TextUtils.isEmpty(strZze3) || !strZze2.equals(strZze3)) {
                    this.zzi.zza().put("ridmm", "true");
                } else {
                    this.zza.zzm().zzf(strZze2);
                    this.zzi.zza().put("rid", strZze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzfuj.zzg(new zzeek(14, "Mismatch request IDs."));
    }

    final /* synthetic */ zzfut zzb(JSONObject jSONObject) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zzd), zzeyn.zza(new StringReader(jSONObject.toString()))));
    }
}
