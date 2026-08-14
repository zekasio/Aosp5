package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjq implements zzewi {
    private final zzchy zza;
    private final zzcjq zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    /* synthetic */ zzcjq(zzchy zzchyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjp zzcjpVar) {
        this.zza = zzchyVar;
        zzgwy zzgwyVarZza = zzgwz.zza(context);
        this.zzc = zzgwyVarZza;
        zzgwy zzgwyVarZza2 = zzgwz.zza(zzqVar);
        this.zzd = zzgwyVarZza2;
        zzgwy zzgwyVarZza3 = zzgwz.zza(str);
        this.zze = zzgwyVarZza3;
        zzgxl zzgxlVarZzc = zzgwx.zzc(new zzeic(zzchyVar.zzo));
        this.zzf = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(new zzexg(zzchyVar.zzaE));
        this.zzg = zzgxlVarZzc2;
        zzgxl zzgxlVarZzc3 = zzgwx.zzc(new zzewg(zzgwyVarZza, zzchyVar.zzp, zzchyVar.zzU, zzgxlVarZzc, zzgxlVarZzc2, zzeyz.zza()));
        this.zzh = zzgxlVarZzc3;
        this.zzi = zzgwx.zzc(new zzeik(zzgwyVarZza, zzgwyVarZza2, zzgwyVarZza3, zzgxlVarZzc3, zzgxlVarZzc, zzgxlVarZzc2, zzchyVar.zzi, zzchyVar.zzV));
    }

    @Override // com.google.android.gms.internal.ads.zzewi
    public final zzeij zza() {
        return (zzeij) this.zzi.zzb();
    }
}
