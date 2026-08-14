package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbya {
    public final zzfut zza(Context context, int i) {
        zzbzs zzbzsVar = new zzbzs();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbyt.zzu(context)) {
            zzbzn.zza.execute(new zzbxz(this, context, zzbzsVar));
        }
        return zzbzsVar;
    }
}
