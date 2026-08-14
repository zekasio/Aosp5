package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaob extends zzgqm implements zzgrx {
    private static final zzaob zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzaob zzaobVar = new zzaob();
        zzb = zzaobVar;
        zzgqm.zzaT(zzaob.class, zzaobVar);
    }

    private zzaob() {
    }

    public static zzaob zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaob();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzaoa(zzamuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
