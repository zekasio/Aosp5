package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcju implements zzexw {
    private final zzchy zza;
    private final zzcju zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    /* synthetic */ zzcju(zzchy zzchyVar, Context context, String str, zzcjt zzcjtVar) {
        this.zza = zzchyVar;
        zzgwy zzgwyVarZza = zzgwz.zza(context);
        this.zzc = zzgwyVarZza;
        zzevw zzevwVar = new zzevw(zzgwyVarZza, zzchyVar.zzaE, zzchyVar.zzaF);
        this.zzd = zzevwVar;
        zzgxl zzgxlVarZzc = zzgwx.zzc(new zzexg(zzchyVar.zzaE));
        this.zze = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(zzeyu.zza());
        this.zzf = zzgxlVarZzc2;
        zzgxl zzgxlVarZzc3 = zzgwx.zzc(new zzexq(zzgwyVarZza, zzchyVar.zzp, zzchyVar.zzU, zzevwVar, zzgxlVarZzc, zzeyz.zza(), zzgxlVarZzc2));
        this.zzg = zzgxlVarZzc3;
        this.zzh = zzgwx.zzc(new zzeya(zzgxlVarZzc3, zzgxlVarZzc, zzgxlVarZzc2));
        zzgwy zzgwyVarZzc = zzgwz.zzc(str);
        this.zzi = zzgwyVarZzc;
        this.zzj = zzgwx.zzc(new zzexu(zzgwyVarZzc, zzgxlVarZzc3, zzgwyVarZza, zzgxlVarZzc, zzgxlVarZzc2, zzchyVar.zzi, zzchyVar.zzV));
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final zzext zza() {
        return (zzext) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final zzexz zzb() {
        return (zzexz) this.zzh.zzb();
    }
}
