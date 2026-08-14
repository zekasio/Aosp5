package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevv implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzevv(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevt zzb() {
        Context context = (Context) this.zza.zzb();
        zzfaf zzfafVar = (zzfaf) this.zzb.zzb();
        zzfax zzfaxVar = (zzfax) this.zzc.zzb();
        zzbyd zzbydVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfT)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzbydVarZzh != null && zzbydVarZzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgj)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfS)).booleanValue() || z) {
                zzfaw zzfawVarZza = zzfaxVar.zza(zzfan.AppOpen, context, zzfafVar, new zzeux(new zzeuu()));
                return new zzeuz(new zzevj(new zzevi()), new zzevf(zzfawVarZza.zza, zzbzn.zza), zzfawVarZza.zzb, zzfawVarZza.zza.zza().zzf, zzbzn.zza);
            }
        }
        return new zzevi();
    }
}
