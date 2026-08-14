package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqt implements zzdqh {
    private final long zza;
    private final zzeij zzb;

    zzdqt(long j, Context context, zzdqm zzdqmVar, zzcgd zzcgdVar, String str) {
        this.zza = j;
        zzewh zzewhVarZzt = zzcgdVar.zzt();
        zzewhVarZzt.zzc(context);
        zzewhVarZzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzewhVarZzt.zzb(str);
        zzeij zzeijVarZza = zzewhVarZzt.zzd().zza();
        this.zzb = zzeijVarZza;
        zzeijVarZza.zzD(new zzdqs(this, zzdqmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
