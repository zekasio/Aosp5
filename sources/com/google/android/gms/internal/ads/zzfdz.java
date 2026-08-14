package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdz implements zzdbl, zzcve, zzdbp {
    private final zzfen zza;
    private final zzfec zzb;

    zzfdz(Context context, zzfen zzfenVar) {
        this.zza = zzfenVar;
        this.zzb = zzfeb.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzb() {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            zzfen zzfenVar = this.zza;
            zzfec zzfecVar = this.zzb;
            zzfecVar.zzf(true);
            zzfenVar.zza(zzfecVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzg() {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            zzfen zzfenVar = this.zza;
            zzfec zzfecVar = this.zzb;
            zzfecVar.zzc(zzeVar.zza().toString());
            zzfecVar.zzf(false);
            zzfenVar.zza(zzfecVar);
        }
    }
}
