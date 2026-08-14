package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsa implements zzgsp {
    private final zzgrw zza;
    private final zzgtg zzb;
    private final boolean zzc;
    private final zzgpz zzd;

    private zzgsa(zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrw zzgrwVar) {
        this.zzb = zzgtgVar;
        this.zzc = zzgpzVar.zzh(zzgrwVar);
        this.zzd = zzgpzVar;
        this.zza = zzgrwVar;
    }

    static zzgsa zzc(zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrw zzgrwVar) {
        return new zzgsa(zzgtgVar, zzgpzVar, zzgrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zza(Object obj) {
        zzgtg zzgtgVar = this.zzb;
        int iZzb = zzgtgVar.zzb(zzgtgVar.zzd(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final Object zze() {
        zzgrw zzgrwVar = this.zza;
        return zzgrwVar instanceof zzgqm ? ((zzgqm) zzgrwVar).zzaD() : zzgrwVar.zzaO().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, Object obj2) {
        zzgsr.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgsr.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzh(Object obj, zzgsh zzgshVar, zzgpy zzgpyVar) throws IOException {
        boolean zZzO;
        zzgtg zzgtgVar = this.zzb;
        zzgpz zzgpzVar = this.zzd;
        Object objZzc = zzgtgVar.zzc(obj);
        zzgqd zzgqdVarZzb = zzgpzVar.zzb(obj);
        while (zzgshVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzgshVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzc2 = zzgpzVar.zzc(zzgpyVar, this.zza, iZzd >>> 3);
                        if (objZzc2 != null) {
                            zzgpzVar.zzf(zzgshVar, objZzc2, zzgpyVar, zzgqdVarZzb);
                        } else {
                            zZzO = zzgtgVar.zzp(objZzc, zzgshVar);
                        }
                    } else {
                        zZzO = zzgshVar.zzO();
                    }
                    if (!zZzO) {
                        return;
                    }
                } else {
                    Object objZzc3 = null;
                    zzgpe zzgpeVarZzp = null;
                    int iZzj = 0;
                    while (zzgshVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzgshVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzgshVar.zzj();
                            objZzc3 = zzgpzVar.zzc(zzgpyVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzc3 != null) {
                                zzgpzVar.zzf(zzgshVar, objZzc3, zzgpyVar, zzgqdVarZzb);
                            } else {
                                zzgpeVarZzp = zzgshVar.zzp();
                            }
                        } else if (!zzgshVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgshVar.zzd() != 12) {
                        throw zzgqy.zzb();
                    }
                    if (zzgpeVarZzp != null) {
                        if (objZzc3 != null) {
                            zzgpzVar.zzg(zzgpeVarZzp, objZzc3, zzgpyVar, zzgqdVarZzb);
                        } else {
                            zzgtgVar.zzk(objZzc, iZzj, zzgpeVarZzp);
                        }
                    }
                }
            } finally {
                zzgtgVar.zzn(obj, objZzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        zzgqm zzgqmVar = (zzgqm) obj;
        if (zzgqmVar.zzc == zzgth.zzc()) {
            zzgqmVar.zzc = zzgth.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzm(Object obj, zzgpu zzgpuVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
