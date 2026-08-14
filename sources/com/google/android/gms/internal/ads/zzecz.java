package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzecz implements zzdee {
    private final zzeyc zza;
    private final zzbpc zzb;
    private final AdFormat zzc;
    private zzcvg zzd = null;

    zzecz(zzeyc zzeycVar, zzbpc zzbpcVar, AdFormat adFormat) {
        this.zza = zzeycVar;
        this.zzb = zzbpcVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zza(boolean z, Context context, zzcvb zzcvbVar) throws zzded {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzded("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbp)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzded("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzded(th);
        }
    }

    public final void zzb(zzcvg zzcvgVar) {
        this.zzd = zzcvgVar;
    }
}
