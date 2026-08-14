package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnm implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzdnm(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcgj) this.zza).zza();
        final String strZzb = ((zzdtx) this.zzb).zzb();
        zzbzg zzbzgVarZza = ((zzcgu) this.zzc).zza();
        final zzawo zzawoVar = (zzawo) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzawe zzaweVar = new zzawe(new zzawk(contextZza));
        zzazd zzazdVarZza = zzaze.zza();
        zzazdVarZza.zza(zzbzgVarZza.zzb);
        zzazdVarZza.zzc(zzbzgVarZza.zzc);
        zzazdVarZza.zzb(true != zzbzgVarZza.zzd ? 2 : 0);
        final zzaze zzazeVar = (zzaze) zzazdVarZza.zzal();
        zzaweVar.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdnl
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzawo zzawoVar2 = zzawoVar;
                String str2 = strZzb;
                zzaze zzazeVar2 = zzazeVar;
                String str3 = str;
                zzawp zzawpVar = (zzawp) zzaxtVar.zza().zzaB();
                zzawpVar.zza(zzawoVar2);
                zzaxtVar.zze(zzawpVar);
                zzaxl zzaxlVar = (zzaxl) zzaxtVar.zzb().zzaB();
                zzaxlVar.zza(str2);
                zzaxlVar.zzb(zzazeVar2);
                zzaxtVar.zzg(zzaxlVar);
                zzaxtVar.zzh(str3);
            }
        });
        return zzaweVar;
    }
}
