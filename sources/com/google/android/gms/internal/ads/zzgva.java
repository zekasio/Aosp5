package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgva extends zzgqm implements zzgrx {
    private static final zzgva zzb;
    private int zzd;
    private zzgpe zze = zzgpe.zzb;
    private zzgpe zzf;
    private zzgpe zzg;

    static {
        zzgva zzgvaVar = new zzgva();
        zzb = zzgvaVar;
        zzgqm.zzaT(zzgva.class, zzgvaVar);
    }

    private zzgva() {
        zzgpe zzgpeVar = zzgpe.zzb;
        this.zzf = zzgpeVar;
        this.zzg = zzgpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgva();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzguz(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
