package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwe {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdww zzc;

    zzdwe(zzfuu zzfuuVar, zzfuu zzfuuVar2, zzdww zzdwwVar) {
        this.zza = zzfuuVar;
        this.zzb = zzfuuVar2;
        this.zzc = zzdwwVar;
    }

    final /* synthetic */ zzfut zza(zzbsr zzbsrVar) throws Exception {
        return this.zzc.zza(zzbsrVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjH)).longValue());
    }

    public final zzfut zzb(final zzbsr zzbsrVar) {
        String str = zzbsrVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfuj.zzm(zzfuj.zzf(zzfua.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfuj.zzg(new zzdvi(1, "Ads signal service force local")) : zzfuj.zzf(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzdwa
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return this.zza.zza(zzbsrVar);
            }
        }, this.zza), ExecutionException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwb
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfuj.zzg(cause2);
            }
        }, this.zzb)), zzdvi.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(null);
            }
        }, this.zzb), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzfuj.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzJ(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzfuj.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
