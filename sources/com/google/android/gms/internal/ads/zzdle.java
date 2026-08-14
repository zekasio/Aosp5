package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdle implements zzbhp {
    final /* synthetic */ zzdlf zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbhp zzd;

    /* synthetic */ zzdle(zzdlf zzdlfVar, WeakReference weakReference, String str, zzbhp zzbhpVar, zzdld zzdldVar) {
        this.zza = zzdlfVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
