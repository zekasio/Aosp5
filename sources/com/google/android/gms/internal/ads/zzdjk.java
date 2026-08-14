package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjk implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;
    private final zzgxl zzl;
    private final zzgxl zzm;
    private final zzgxl zzn;
    private final zzgxl zzo;
    private final zzgxl zzp;

    public zzdjk(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9, zzgxl zzgxlVar10, zzgxl zzgxlVar11, zzgxl zzgxlVar12, zzgxl zzgxlVar13, zzgxl zzgxlVar14, zzgxl zzgxlVar15, zzgxl zzgxlVar16) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
        this.zzh = zzgxlVar8;
        this.zzi = zzgxlVar9;
        this.zzj = zzgxlVar10;
        this.zzk = zzgxlVar11;
        this.zzl = zzgxlVar12;
        this.zzm = zzgxlVar13;
        this.zzn = zzgxlVar14;
        this.zzo = zzgxlVar15;
        this.zzp = zzgxlVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdjj zzb() {
        Context context = (Context) this.zza.zzb();
        zzdis zzdisVar = (zzdis) this.zzb.zzb();
        zzapw zzapwVar = (zzapw) this.zzc.zzb();
        zzbzg zzbzgVarZza = ((zzcgu) this.zzd).zza();
        com.google.android.gms.ads.internal.zza zzaVarZza = com.google.android.gms.ads.internal.zza.zza();
        zzawe zzaweVar = (zzawe) this.zzf.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdjj(context, zzdisVar, zzapwVar, zzbzgVarZza, zzaVarZza, zzaweVar, zzfuuVar, ((zzcuf) this.zzh).zza(), (zzdkb) this.zzi.zzb(), (zzdmq) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzdpi) this.zzl.zzb(), (zzfdk) this.zzm.zzb(), (zzfff) this.zzn.zzb(), (zzeaf) this.zzo.zzb(), (zzdll) this.zzp.zzb());
    }
}
