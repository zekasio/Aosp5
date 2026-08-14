package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiz implements zzepn {
    private final Context zza;

    zzeiz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcx)).booleanValue()) {
            return zzfuj.zzh(new zzeja(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfuj.zzh(null);
    }
}
