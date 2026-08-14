package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvy extends zzgqm implements zzgrx {
    private static final zzgvy zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private zzgqr zzg = zzaJ();
    private zzgqv zzi = zzaM();
    private zzgpe zzj = zzgpe.zzb;

    static {
        zzgvy zzgvyVar = new zzgvy();
        zzb = zzgvyVar;
        zzgqm.zzaT(zzgvy.class, zzgvyVar);
    }

    private zzgvy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgvw.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzgvy();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgvx(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
