package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazx extends zzgqm implements zzgrx {
    private static final zzazx zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;

    static {
        zzazx zzazxVar = new zzazx();
        zzb = zzazxVar;
        zzgqm.zzaT(zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzaxr.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzazx();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzazw(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
