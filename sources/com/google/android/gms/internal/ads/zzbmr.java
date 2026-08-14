package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmr implements zzftq {
    private final zzblx zza;
    private final zzbly zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfut zzd;

    zzbmr(zzfut zzfutVar, String str, zzbly zzblyVar, zzblx zzblxVar) {
        this.zzd = zzfutVar;
        this.zzb = zzblyVar;
        this.zza = zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final zzfut zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfut zzb(final Object obj) {
        return zzfuj.zzm(this.zzd, new zzftq() { // from class: com.google.android.gms.internal.ads.zzbmp
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj2) {
                return this.zza.zzc(obj, (zzbls) obj2);
            }
        }, zzbzn.zzf);
    }

    final /* synthetic */ zzfut zzc(Object obj, zzbls zzblsVar) throws Exception {
        zzbzs zzbzsVar = new zzbzs();
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzbho.zzo.zzc(string, new zzbmq(this, zzbzsVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzblsVar.zzl(this.zzc, jSONObject);
        return zzbzsVar;
    }
}
