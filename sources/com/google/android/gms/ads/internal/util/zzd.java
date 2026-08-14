package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        if (zzbyz.zzk(context) && !zzbyz.zzm()) {
            zzfut zzfutVarZzb = new zzc(context).zzb();
            zzbza.zzi("Updating ad debug logging enablement.");
            zzbzq.zza(zzfutVarZzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
