package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxw extends zzgqm implements zzgrx {
    private static final zzaxw zzb;
    private int zzd;
    private int zzf;
    private zzazc zzh;
    private String zze = "";
    private zzgqr zzg = zzaJ();

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzb = zzaxwVar;
        zzgqm.zzaT(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaxw();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaxv(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
