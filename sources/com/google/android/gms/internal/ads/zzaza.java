package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaza extends zzgqm implements zzgrx {
    private static final zzaza zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzazc zzg;

    static {
        zzaza zzazaVar = new zzaza();
        zzb = zzazaVar;
        zzgqm.zzaT(zzaza.class, zzazaVar);
    }

    private zzaza() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzaza();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzayz(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
