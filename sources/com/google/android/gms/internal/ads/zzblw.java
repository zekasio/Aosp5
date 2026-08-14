package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzblw {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbmf zzc;
    private zzbmf zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbmf zza(Context context, zzbzg zzbzgVar, zzfep zzfepVar) {
        zzbmf zzbmfVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbmf(zzc(context), zzbzgVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zza), zzfepVar);
            }
            zzbmfVar = this.zzc;
        }
        return zzbmfVar;
    }

    public final zzbmf zzb(Context context, zzbzg zzbzgVar, zzfep zzfepVar) {
        zzbmf zzbmfVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbmf(zzc(context), zzbzgVar, (String) zzbcu.zzb.zze(), zzfepVar);
            }
            zzbmfVar = this.zzd;
        }
        return zzbmfVar;
    }
}
