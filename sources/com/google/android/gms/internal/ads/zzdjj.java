package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjj {
    private final Context zza;
    private final zzdis zzb;
    private final zzapw zzc;
    private final zzbzg zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzawe zzf;
    private final Executor zzg;
    private final zzbdl zzh;
    private final zzdkb zzi;
    private final zzdmq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdll zzl;
    private final zzdpi zzm;
    private final zzfdk zzn;
    private final zzfff zzo;
    private final zzeaf zzp;

    public zzdjj(Context context, zzdis zzdisVar, zzapw zzapwVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, Executor executor, zzeyx zzeyxVar, zzdkb zzdkbVar, zzdmq zzdmqVar, ScheduledExecutorService scheduledExecutorService, zzdpi zzdpiVar, zzfdk zzfdkVar, zzfff zzfffVar, zzeaf zzeafVar, zzdll zzdllVar) {
        this.zza = context;
        this.zzb = zzdisVar;
        this.zzc = zzapwVar;
        this.zzd = zzbzgVar;
        this.zze = zzaVar;
        this.zzf = zzaweVar;
        this.zzg = executor;
        this.zzh = zzeyxVar.zzi;
        this.zzi = zzdkbVar;
        this.zzj = zzdmqVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdpiVar;
        this.zzn = zzfdkVar;
        this.zzo = zzfffVar;
        this.zzp = zzeafVar;
        this.zzl = zzdllVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(AnalyticsEvent.Ad.mute);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(AnalyticsEvent.Ad.mute);
        if (jSONObjectOptJSONObject == null) {
            return zzfqk.zzo();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfqk.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzelVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzelVarZzr != null) {
                arrayList.add(zzelVarZzr);
            }
        }
        return zzfqk.zzm(arrayList);
    }

    private static zzfut zzl(zzfut zzfutVar, Object obj) {
        final Object obj2 = null;
        return zzfuj.zzf(zzfutVar, Exception.class, new zzftq(obj2) { // from class: com.google.android.gms.internal.ads.zzdjg
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfuj.zzh(null);
            }
        }, zzbzn.zzf);
    }

    private static zzfut zzm(boolean z, final zzfut zzfutVar, Object obj) {
        return z ? zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdje
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj2) {
                return obj2 != null ? zzfutVar : zzfuj.zzg(new zzeek(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzn.zzf) : zzl(zzfutVar, null);
    }

    private final zzfut zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfuj.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzfuj.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt(TJAdUnitConstants.String.WIDTH, -1);
        final int iOptInt2 = jSONObject.optInt(TJAdUnitConstants.String.HEIGHT, -1);
        if (z) {
            return zzfuj.zzh(new zzbdj(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfuj.zzl(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str = strOptString;
                return new zzbdj(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final zzfut zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjf
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbdj zzbdjVar : (List) obj) {
                    if (zzbdjVar != null) {
                        arrayList2.add(zzbdjVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final zzfut zzp(JSONObject jSONObject, zzeyc zzeycVar, zzeyf zzeyfVar) {
        final zzfut zzfutVarZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(TJAdUnitConstants.String.HTML), zzeycVar, zzeyfVar, zzk(jSONObject.optInt(TJAdUnitConstants.String.WIDTH, 0), jSONObject.optInt(TJAdUnitConstants.String.HEIGHT, 0)));
        return zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdji
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) throws zzeek {
                zzfut zzfutVar = zzfutVarZzb;
                zzcei zzceiVar = (zzcei) obj;
                if (zzceiVar == null || zzceiVar.zzq() == null) {
                    throw new zzeek(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfutVar;
            }
        }, zzbzn.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(strOptString, strOptString2);
    }

    final /* synthetic */ zzbdg zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbdg(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ zzfut zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzeyc zzeycVar, zzeyf zzeyfVar, String str, String str2, Object obj) throws Exception {
        zzcei zzceiVarZza = this.zzj.zza(zzqVar, zzeycVar, zzeyfVar);
        final zzbzr zzbzrVarZza = zzbzr.zza(zzceiVarZza);
        zzdli zzdliVarZzb = this.zzl.zzb();
        zzceiVarZza.zzN().zzM(zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzdliVarZzb, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdo)).booleanValue()) {
            zzceiVarZza.zzad("/getNativeAdViewSignals", zzbho.zzs);
        }
        zzceiVarZza.zzad("/getNativeClickMeta", zzbho.zzt);
        zzceiVarZza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdjd
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzbzr zzbzrVar = zzbzrVarZza;
                if (z) {
                    zzbzrVar.zzb();
                } else {
                    zzbzrVar.zze(new zzeek(1, "Image Web View failed to load."));
                }
            }
        });
        zzceiVarZza.zzab(str, str2, null);
        return zzbzrVarZza;
    }

    final /* synthetic */ zzfut zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcei zzceiVarZza = zzceu.zza(this.zza, zzcfx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzbzr zzbzrVarZza = zzbzr.zza(zzceiVarZza);
        zzceiVarZza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzbzrVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeF)).booleanValue()) {
            zzceiVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzceiVarZza.loadData(str, "text/html", "UTF-8");
        }
        return zzbzrVarZza;
    }

    public final zzfut zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzfuj.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzfuj.zzl(zzo(jSONArrayOptJSONArray, false, true), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfut zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfut zzf(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        zzbdl zzbdlVar = this.zzh;
        return zzo(jSONArrayOptJSONArray, zzbdlVar.zzb, zzbdlVar.zzd);
    }

    public final zzfut zzg(JSONObject jSONObject, String str, final zzeyc zzeycVar, final zzeyf zzeyfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziT)).booleanValue()) {
            return zzfuj.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfuj.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzfuj.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString(TJAdUnitConstants.String.HTML);
        final com.google.android.gms.ads.internal.client.zzq zzqVarZzk = zzk(jSONObjectOptJSONObject.optInt(TJAdUnitConstants.String.WIDTH, 0), jSONObjectOptJSONObject.optInt(TJAdUnitConstants.String.HEIGHT, 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzfuj.zzh(null);
        }
        final zzfut zzfutVarZzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjb
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzb(zzqVarZzk, zzeycVar, zzeyfVar, strOptString, strOptString2, obj);
            }
        }, zzbzn.zze);
        return zzfuj.zzm(zzfutVarZzm, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjc
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) throws zzeek {
                zzfut zzfutVar = zzfutVarZzm;
                if (((zzcei) obj) != null) {
                    return zzfutVar;
                }
                throw new zzeek(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzn.zzf);
    }

    public final zzfut zzh(JSONObject jSONObject, zzeyc zzeycVar, zzeyf zzeyfVar) {
        zzfut zzfutVarZza;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return zzp(jSONObjectZzg, zzeycVar, zzeyfVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Advertisement.KEY_VIDEO);
        if (jSONObjectOptJSONObject == null) {
            return zzfuj.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziS)).booleanValue() && jSONObjectOptJSONObject.has(TJAdUnitConstants.String.HTML)) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                zzfutVarZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(zzfuj.zzn(zzfutVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            zzbza.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzfuj.zzh(null);
        }
        zzfutVarZza = zzp(jSONObjectOptJSONObject, zzeycVar, zzeyfVar);
        return zzl(zzfuj.zzn(zzfutVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
