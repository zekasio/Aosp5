package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbwm extends zzbxg {
    private final Clock zzb;
    private final zzbwm zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    /* synthetic */ zzbwm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxf zzbxfVar, zzbwl zzbwlVar) {
        this.zzb = clock;
        zzgwy zzgwyVarZza = zzgwz.zza(context);
        this.zzd = zzgwyVarZza;
        zzgwy zzgwyVarZza2 = zzgwz.zza(zzgVar);
        this.zze = zzgwyVarZza2;
        zzgwy zzgwyVarZza3 = zzgwz.zza(zzbxfVar);
        this.zzf = zzgwyVarZza3;
        this.zzg = zzgwx.zzc(new zzbwe(zzgwyVarZza, zzgwyVarZza2, zzgwyVarZza3));
        zzgwy zzgwyVarZza4 = zzgwz.zza(clock);
        this.zzh = zzgwyVarZza4;
        zzgxl zzgxlVarZzc = zzgwx.zzc(new zzbwg(zzgwyVarZza4, zzgwyVarZza2, zzgwyVarZza3));
        this.zzi = zzgxlVarZzc;
        zzbwi zzbwiVar = new zzbwi(zzgwyVarZza4, zzgxlVarZzc);
        this.zzj = zzbwiVar;
        this.zzk = zzgwx.zzc(new zzbxl(zzgwyVarZza, zzbwiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    final zzbwd zza() {
        return (zzbwd) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    final zzbwh zzb() {
        return new zzbwh(this.zzb, (zzbwf) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    final zzbxk zzc() {
        return (zzbxk) this.zzk.zzb();
    }
}
