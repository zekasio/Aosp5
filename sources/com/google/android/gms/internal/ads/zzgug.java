package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgug extends zzgqm implements zzgrx {
    private static final zzgug zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzgug zzgugVar = new zzgug();
        zzb = zzgugVar;
        zzgqm.zzaT(zzgug.class, zzgugVar);
    }

    private zzgug() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzguf.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgug();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgue(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
