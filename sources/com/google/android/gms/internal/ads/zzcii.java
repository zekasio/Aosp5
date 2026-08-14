package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcii implements zzetd {
    private final zzchy zza;
    private final zzcii zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    /* synthetic */ zzcii(zzchy zzchyVar, Context context, String str, zzcih zzcihVar) {
        this.zza = zzchyVar;
        zzgwy zzgwyVarZza = zzgwz.zza(context);
        this.zzc = zzgwyVarZza;
        zzgwy zzgwyVarZza2 = zzgwz.zza(str);
        this.zzd = zzgwyVarZza2;
        zzevv zzevvVar = new zzevv(zzgwyVarZza, zzchyVar.zzaE, zzchyVar.zzaF);
        this.zze = zzevvVar;
        zzgxl zzgxlVarZzc = zzgwx.zzc(new zzeub(zzchyVar.zzaE));
        this.zzf = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(new zzeud(zzgwyVarZza, zzchyVar.zzp, zzchyVar.zzU, zzevvVar, zzgxlVarZzc, zzeyz.zza(), zzchyVar.zzi));
        this.zzg = zzgxlVarZzc2;
        this.zzh = zzgwx.zzc(new zzeuj(zzchyVar.zzU, zzgwyVarZza, zzgwyVarZza2, zzgxlVarZzc2, zzgxlVarZzc, zzchyVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzetd
    public final zzeui zza() {
        return (zzeui) this.zzh.zzb();
    }
}
