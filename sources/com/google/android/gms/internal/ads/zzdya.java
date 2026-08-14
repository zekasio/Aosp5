package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdya implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;

    public zzdya(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzeqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzeqt, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzcgj) this.zza).zza();
        ?? Zzb = this.zzb.zzb();
        ?? Zzb2 = this.zzc.zzb();
        zzdye zzdyeVar = new zzdye();
        zzdyh zzdyhVarZzb = ((zzdyi) this.zze).zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdxz(contextZza, Zzb, Zzb2, zzdyeVar, zzdyhVarZzb, zzfuuVar, new zzbtz(), null);
    }
}
