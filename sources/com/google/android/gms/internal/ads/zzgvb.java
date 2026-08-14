package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvb extends zzgqm implements zzgrx {
    private static final zzgvb zzb;
    private int zzd;
    private zzgva zze;
    private int zzi;
    private byte zzj = 2;
    private zzgqv zzf = zzaM();
    private zzgpe zzg = zzgpe.zzb;
    private zzgpe zzh = zzgpe.zzb;

    static {
        zzgvb zzgvbVar = new zzgvb();
        zzb = zzgvbVar;
        zzgqm.zzaT(zzgvb.class, zzgvbVar);
    }

    private zzgvb() {
    }

    public static zzguy zza() {
        return (zzguy) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgvb zzgvbVar, zzgux zzguxVar) {
        zzguxVar.getClass();
        zzgqv zzgqvVar = zzgvbVar.zzf;
        if (!zzgqvVar.zzc()) {
            zzgvbVar.zzf = zzgqm.zzaN(zzgqvVar);
        }
        zzgvbVar.zzf.add(zzguxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgux.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgvb();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzguy(zzgubVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
