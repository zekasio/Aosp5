package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazt extends zzgqm implements zzgrx {
    private static final zzazt zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzazt zzaztVar = new zzazt();
        zzb = zzaztVar;
        zzgqm.zzaT(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzaxr.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzazt();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzazs(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
