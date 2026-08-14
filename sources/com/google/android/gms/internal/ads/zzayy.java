package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayy extends zzgqm implements zzgrx {
    private static final zzayy zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzayy zzayyVar = new zzayy();
        zzb = zzayyVar;
        zzgqm.zzaT(zzayy.class, zzayyVar);
    }

    private zzayy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzayy();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzayx(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
