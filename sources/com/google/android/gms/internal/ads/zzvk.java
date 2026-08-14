package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvk extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzvq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzvk(int r5, com.google.android.gms.internal.ads.zzcp r6, int r7, com.google.android.gms.internal.ads.zzvq r8, int r9, boolean r10, com.google.android.gms.internal.ads.zzfnv r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvk.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvq, int, boolean, com.google.android.gms.internal.ads.zzfnv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzvk zzvkVar = (zzvk) zzvyVar;
        zzvq zzvqVar = this.zzh;
        boolean z = zzvqVar.zzN;
        zzaf zzafVar = this.zzd;
        int i = zzafVar.zzz;
        if (i == -1) {
            return false;
        }
        zzaf zzafVar2 = zzvkVar.zzd;
        if (i != zzafVar2.zzz) {
            return false;
        }
        boolean z2 = zzvqVar.zzL;
        String str = zzafVar.zzm;
        if (str == null || !TextUtils.equals(str, zzafVar2.zzm)) {
            return false;
        }
        zzvq zzvqVar2 = this.zzh;
        boolean z3 = zzvqVar2.zzM;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzvkVar.zzd.zzA) {
            return false;
        }
        boolean z4 = zzvqVar2.zzO;
        return this.zzu == zzvkVar.zzu && this.zzv == zzvkVar.zzv;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzvk zzvkVar) {
        zzfrs zzfrsVarZza = (this.zzf && this.zzi) ? zzwc.zzc : zzwc.zzc.zza();
        zzfpz zzfpzVarZzd = zzfpz.zzj().zzd(this.zzi, zzvkVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzvkVar.zzk), zzfrs.zzc().zza()).zzb(this.zzj, zzvkVar.zzj).zzb(this.zzl, zzvkVar.zzl).zzd(this.zzp, zzvkVar.zzp);
        boolean z = zzvkVar.zzm;
        zzfpz zzfpzVarZzc = zzfpzVarZzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzvkVar.zzn), zzfrs.zzc().zza()).zzb(this.zzo, zzvkVar.zzo).zzd(this.zzf, zzvkVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzvkVar.zzt), zzfrs.zzc().zza());
        Integer numValueOf = Integer.valueOf(this.zzs);
        Integer numValueOf2 = Integer.valueOf(zzvkVar.zzs);
        boolean z2 = this.zzh.zzz;
        zzfpz zzfpzVarZzc2 = zzfpzVarZzc.zzc(numValueOf, numValueOf2, zzwc.zzd).zzd(this.zzu, zzvkVar.zzu).zzd(this.zzv, zzvkVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzvkVar.zzq), zzfrsVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzvkVar.zzr), zzfrsVarZza);
        Integer numValueOf3 = Integer.valueOf(this.zzs);
        Integer numValueOf4 = Integer.valueOf(zzvkVar.zzs);
        if (!zzew.zzU(this.zzg, zzvkVar.zzg)) {
            zzfrsVarZza = zzwc.zzd;
        }
        return zzfpzVarZzc2.zzc(numValueOf3, numValueOf4, zzfrsVarZza).zza();
    }
}
