package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghi extends zzgqm implements zzgrx {
    private static final zzghi zzb;
    private zzgho zzd;
    private zzgkc zze;

    static {
        zzghi zzghiVar = new zzghi();
        zzb = zzghiVar;
        zzgqm.zzaT(zzghi.class, zzghiVar);
    }

    private zzghi() {
    }

    public static zzghh zza() {
        return (zzghh) zzb.zzaA();
    }

    public static zzghi zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghi) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzg(zzghi zzghiVar, zzgho zzghoVar) {
        zzghoVar.getClass();
        zzghiVar.zzd = zzghoVar;
    }

    static /* synthetic */ void zzh(zzghi zzghiVar, zzgkc zzgkcVar) {
        zzgkcVar.getClass();
        zzghiVar.zze = zzgkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzghi();
        }
        zzghg zzghgVar = null;
        if (i2 == 4) {
            return new zzghh(zzghgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgho zze() {
        zzgho zzghoVar = this.zzd;
        return zzghoVar == null ? zzgho.zze() : zzghoVar;
    }

    public final zzgkc zzf() {
        zzgkc zzgkcVar = this.zze;
        return zzgkcVar == null ? zzgkc.zze() : zzgkcVar;
    }
}
