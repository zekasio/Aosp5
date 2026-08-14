package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasr extends zzgqm implements zzgrx {
    private static final zzasr zzb;
    private int zzd;
    private zzasu zze;
    private zzgpe zzf = zzgpe.zzb;
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzasr zzasrVar = new zzasr();
        zzb = zzasrVar;
        zzgqm.zzaT(zzasr.class, zzasrVar);
    }

    private zzasr() {
    }

    public static zzasr zzc(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzasr) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzasr();
        }
        zzasp zzaspVar = null;
        if (i2 == 4) {
            return new zzasq(zzaspVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzasu zzd() {
        zzasu zzasuVar = this.zze;
        return zzasuVar == null ? zzasu.zzg() : zzasuVar;
    }

    public final zzgpe zze() {
        return this.zzg;
    }

    public final zzgpe zzf() {
        return this.zzf;
    }
}
