package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvw extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzvw(int i, zzcp zzcpVar, int i2, zzvq zzvqVar, int i3, String str) {
        int iZza;
        super(i, zzcpVar, i2);
        int i4 = 0;
        this.zzf = zzwc.zzm(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzvqVar.zzx;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzfqk zzfqkVarZzp = zzvqVar.zzv.isEmpty() ? zzfqk.zzp("") : zzvqVar.zzv;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfqkVarZzp.size()) {
                i7 = Integer.MAX_VALUE;
                iZza = 0;
                break;
            }
            zzaf zzafVar = this.zzd;
            String str2 = (String) zzfqkVarZzp.get(i7);
            boolean z = zzvqVar.zzy;
            iZza = zzwc.zza(zzafVar, str2, false);
            if (iZza > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.zzi = i7;
        this.zzj = iZza;
        int i8 = this.zzd.zzf;
        int i9 = zzvqVar.zzw;
        int iBitCount = Integer.bitCount(0);
        this.zzk = iBitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        int iZza2 = zzwc.zza(this.zzd, str, zzwc.zzf(str) == null);
        this.zzl = iZza2;
        boolean z2 = iZza > 0 || (zzvqVar.zzv.isEmpty() && iBitCount > 0) || this.zzg || (this.zzh && iZza2 > 0);
        if (zzwc.zzm(i3, zzvqVar.zzQ) && z2) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzvw zzvwVar) {
        zzfpz zzfpzVarZzb = zzfpz.zzj().zzd(this.zzf, zzvwVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzvwVar.zzi), zzfrs.zzc().zza()).zzb(this.zzj, zzvwVar.zzj).zzb(this.zzk, zzvwVar.zzk).zzd(this.zzg, zzvwVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzvwVar.zzh), this.zzj == 0 ? zzfrs.zzc() : zzfrs.zzc().zza()).zzb(this.zzl, zzvwVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzvwVar.zzm;
            zzfpzVarZzb = zzfpzVarZzb.zze(false, false);
        }
        return zzfpzVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        return false;
    }
}
