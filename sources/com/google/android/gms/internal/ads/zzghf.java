package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghf extends zzgqm implements zzgrx {
    private static final zzghf zzb;
    private int zzd;
    private zzghl zze;
    private zzgjz zzf;

    static {
        zzghf zzghfVar = new zzghf();
        zzb = zzghfVar;
        zzgqm.zzaT(zzghf.class, zzghfVar);
    }

    private zzghf() {
    }

    public static zzghe zzc() {
        return (zzghe) zzb.zzaA();
    }

    public static zzghf zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghf) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzi(zzghf zzghfVar, zzghl zzghlVar) {
        zzghlVar.getClass();
        zzghfVar.zze = zzghlVar;
    }

    static /* synthetic */ void zzj(zzghf zzghfVar, zzgjz zzgjzVar) {
        zzgjzVar.getClass();
        zzghfVar.zzf = zzgjzVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzghf();
        }
        zzghd zzghdVar = null;
        if (i2 == 4) {
            return new zzghe(zzghdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzghl zzf() {
        zzghl zzghlVar = this.zze;
        return zzghlVar == null ? zzghl.zze() : zzghlVar;
    }

    public final zzgjz zzg() {
        zzgjz zzgjzVar = this.zzf;
        return zzgjzVar == null ? zzgjz.zze() : zzgjzVar;
    }
}
