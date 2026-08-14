package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkn extends zzgqm implements zzgrx {
    private static final zzgkn zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgkn zzgknVar = new zzgkn();
        zzb = zzgknVar;
        zzgqm.zzaT(zzgkn.class, zzgknVar);
    }

    private zzgkn() {
    }

    public static zzgkm zza() {
        return (zzgkm) zzb.zzaA();
    }

    public static zzgkn zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkn();
        }
        zzgkl zzgklVar = null;
        if (i2 == 4) {
            return new zzgkm(zzgklVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zze() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
