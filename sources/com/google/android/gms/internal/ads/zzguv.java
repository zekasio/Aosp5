package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzguv extends zzgqm implements zzgrx {
    private static final zzguv zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzguv zzguvVar = new zzguv();
        zzb = zzguvVar;
        zzgqm.zzaT(zzguv.class, zzguvVar);
    }

    private zzguv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzguu.zza, "zzf", zzgus.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzguv();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgut(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
