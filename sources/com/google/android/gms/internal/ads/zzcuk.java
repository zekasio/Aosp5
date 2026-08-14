package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcuk implements zzgwy {
    private final zzcuj zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzcuk(zzcuj zzcujVar, zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzcujVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
        this.zzd = zzgxlVar3;
        this.zze = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzbzg zzbzgVarZza = ((zzcgu) this.zzc).zza();
        zzeyc zzeycVarZza = ((zzcrc) this.zzd).zza();
        zzbvx zzbvxVar = new zzbvx();
        if (zzeycVarZza.zzB == null) {
            return null;
        }
        zzeyh zzeyhVar = zzeycVarZza.zzt;
        return new zzbvw(context, zzbzgVarZza, zzeycVarZza.zzB, zzeyhVar == null ? null : zzeyhVar.zzb, zzbvxVar, null);
    }
}
