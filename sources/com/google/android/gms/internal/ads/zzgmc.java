package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmc extends zzgqm implements zzgrx {
    private static final zzgmc zzb;
    private String zzd = "";
    private zzgld zze;

    static {
        zzgmc zzgmcVar = new zzgmc();
        zzb = zzgmcVar;
        zzgqm.zzaT(zzgmc.class, zzgmcVar);
    }

    private zzgmc() {
    }

    public static zzgmc zzd() {
        return zzb;
    }

    public static zzgmc zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgmc) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public final zzgld zza() {
        zzgld zzgldVar = this.zze;
        return zzgldVar == null ? zzgld.zzd() : zzgldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgmc();
        }
        zzgma zzgmaVar = null;
        if (i2 == 4) {
            return new zzgmb(zzgmaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
