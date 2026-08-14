package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgis extends zzgqm implements zzgrx {
    private static final zzgis zzb;
    private int zzd;
    private int zze;

    static {
        zzgis zzgisVar = new zzgis();
        zzb = zzgisVar;
        zzgqm.zzaT(zzgis.class, zzgisVar);
    }

    private zzgis() {
    }

    public static zzgir zzc() {
        return (zzgir) zzb.zzaA();
    }

    public static zzgis zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgis) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgis();
        }
        zzgiq zzgiqVar = null;
        if (i2 == 4) {
            return new zzgir(zzgiqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
