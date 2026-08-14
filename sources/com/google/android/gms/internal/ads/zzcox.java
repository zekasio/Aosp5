package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcox implements zzgwy {
    private final zzcor zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzcox(zzcor zzcorVar, zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzcorVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
        this.zzd = zzgxlVar3;
        this.zze = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzcor.zzf((Context) this.zzb.zzb(), ((zzcgu) this.zzc).zza(), ((zzcrc) this.zzd).zza(), ((zzcuf) this.zze).zza());
    }
}
