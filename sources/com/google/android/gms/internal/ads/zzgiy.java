package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgiy extends zzgqm implements zzgrx {
    private static final zzgiy zzb;

    static {
        zzgiy zzgiyVar = new zzgiy();
        zzb = zzgiyVar;
        zzgqm.zzaT(zzgiy.class, zzgiyVar);
    }

    private zzgiy() {
    }

    public static zzgiy zzc() {
        return zzb;
    }

    public static zzgiy zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgiy) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzgiw zzgiwVar = null;
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzgiy();
        }
        if (i2 == 4) {
            return new zzgix(zzgiwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
