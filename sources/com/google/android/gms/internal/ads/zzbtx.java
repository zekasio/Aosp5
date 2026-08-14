package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbtx extends zzbty {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzblv zzd;

    public zzbtx(Context context, zzblv zzblvVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzblvVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbzg.zza().zza);
            jSONObject.put("mf", zzbck.zza.zze());
            jSONObject.put("cl", "513548808");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    public final zzfut zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbck.zzb.zze()).longValue()) {
            return zzfuj.zzh(null);
        }
        return zzfuj.zzl(this.zzd.zzb(zzc(this.zzb)), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbtw
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                this.zza.zzb((JSONObject) obj);
                return null;
            }
        }, zzbzn.zzf);
    }

    final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbar.zzd(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
