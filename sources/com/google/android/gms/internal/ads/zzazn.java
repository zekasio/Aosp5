package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazn extends zzgqm implements zzgrx {
    private static final zzazn zzb;
    private int zzd;
    private zzaze zze;
    private int zzf = 1000;
    private zzazl zzg;
    private zzazc zzh;

    static {
        zzazn zzaznVar = new zzazn();
        zzb = zzaznVar;
        zzgqm.zzaT(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzazn();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzazm(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
