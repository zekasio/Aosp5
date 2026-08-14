package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmc implements zzcls {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcmc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean z = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (z) {
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcy)).booleanValue()) {
                        zzfkv.zzj(this.zza).zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcH)).booleanValue()) {
                        zzfkv.zzj(this.zza).zzl();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcz)).booleanValue()) {
                        zzfkw.zzi(this.zza).zzj();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcD)).booleanValue()) {
                            zzfkw.zzi(this.zza).zzk();
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcE)).booleanValue()) {
                            zzfkw.zzi(this.zza).zzl();
                        }
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzar)).booleanValue()) {
                this.zzb.zzH(z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue() && z) {
                    this.zza.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzam)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
        }
    }
}
