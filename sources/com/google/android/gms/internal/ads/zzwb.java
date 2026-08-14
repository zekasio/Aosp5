package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwb extends zzvy {
    private final boolean zze;
    private final zzvq zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwb(int r5, com.google.android.gms.internal.ads.zzcp r6, int r7, com.google.android.gms.internal.ads.zzvq r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwb.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvq, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfrs zzfrsVarZza = (zzwbVar.zze && zzwbVar.zzh) ? zzwc.zzc : zzwc.zzc.zza();
        zzfpz zzfpzVarZzj = zzfpz.zzj();
        Integer numValueOf = Integer.valueOf(zzwbVar.zzi);
        Integer numValueOf2 = Integer.valueOf(zzwbVar2.zzi);
        boolean z = zzwbVar.zzf.zzz;
        return zzfpzVarZzj.zzc(numValueOf, numValueOf2, zzwc.zzd).zzc(Integer.valueOf(zzwbVar.zzj), Integer.valueOf(zzwbVar2.zzj), zzfrsVarZza).zzc(Integer.valueOf(zzwbVar.zzi), Integer.valueOf(zzwbVar2.zzi), zzfrsVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfpz zzfpzVarZzb = zzfpz.zzj().zzd(zzwbVar.zzh, zzwbVar2.zzh).zzb(zzwbVar.zzl, zzwbVar2.zzl);
        boolean z = zzwbVar.zzm;
        boolean z2 = zzwbVar2.zzm;
        zzfpz zzfpzVarZzc = zzfpzVarZzb.zzd(true, true).zzd(zzwbVar.zze, zzwbVar2.zze).zzd(zzwbVar.zzg, zzwbVar2.zzg).zzc(Integer.valueOf(zzwbVar.zzk), Integer.valueOf(zzwbVar2.zzk), zzfrs.zzc().zza());
        boolean z3 = zzwbVar.zzo;
        zzfpz zzfpzVarZzd = zzfpzVarZzc.zzd(z3, zzwbVar2.zzo);
        boolean z4 = zzwbVar.zzp;
        zzfpz zzfpzVarZzd2 = zzfpzVarZzd.zzd(z4, zzwbVar2.zzp);
        if (z3 && z4) {
            zzfpzVarZzd2 = zzfpzVarZzd2.zzb(zzwbVar.zzq, zzwbVar2.zzq);
        }
        return zzfpzVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzwb zzwbVar = (zzwb) zzvyVar;
        if (!zzew.zzU(this.zzd.zzm, zzwbVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        return this.zzo == zzwbVar.zzo && this.zzp == zzwbVar.zzp;
    }
}
