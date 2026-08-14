package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcis implements zzeur {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzchy zzd;
    private final zzcis zze = this;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    /* synthetic */ zzcis(zzchy zzchyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcir zzcirVar) {
        this.zzd = zzchyVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgwy zzgwyVarZza = zzgwz.zza(context);
        this.zzf = zzgwyVarZza;
        zzgwy zzgwyVarZza2 = zzgwz.zza(zzqVar);
        this.zzg = zzgwyVarZza2;
        zzgxl zzgxlVarZzc = zzgwx.zzc(new zzeic(zzchyVar.zzo));
        this.zzh = zzgxlVarZzc;
        zzgxl zzgxlVarZzc2 = zzgwx.zzc(zzeih.zza());
        this.zzi = zzgxlVarZzc2;
        zzgxl zzgxlVarZzc3 = zzgwx.zzc(zzczm.zza());
        this.zzj = zzgxlVarZzc3;
        this.zzk = zzgwx.zzc(new zzeup(zzgwyVarZza, zzchyVar.zzp, zzgwyVarZza2, zzchyVar.zzU, zzgxlVarZzc, zzgxlVarZzc2, zzeyz.zza(), zzgxlVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeur
    public final zzehh zza() {
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzeuo zzeuoVar = (zzeuo) this.zzk.zzb();
        zzeib zzeibVar = (zzeib) this.zzh.zzb();
        zzbzg zzbzgVarZzd = this.zzd.zza.zzd();
        zzgxg.zzb(zzbzgVarZzd);
        return new zzehh(context, zzqVar, str, zzeuoVar, zzeibVar, zzbzgVarZzd);
    }
}
