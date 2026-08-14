package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanu extends zzgqm implements zzgrx {
    private static final zzanu zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgqr zzh = zzaJ();
    private long zzi;

    static {
        zzanu zzanuVar = new zzanu();
        zzb = zzanuVar;
        zzgqm.zzaT(zzanu.class, zzanuVar);
    }

    private zzanu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzanu();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzant(zzamuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
