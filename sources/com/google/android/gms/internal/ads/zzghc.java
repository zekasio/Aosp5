package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghc extends zzgqm implements zzgrx {
    private static final zzghc zzb;
    private int zzd;

    static {
        zzghc zzghcVar = new zzghc();
        zzb = zzghcVar;
        zzgqm.zzaT(zzghc.class, zzghcVar);
    }

    private zzghc() {
    }

    public static zzghb zzc() {
        return (zzghb) zzb.zzaA();
    }

    public static zzghc zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzghc();
        }
        zzgha zzghaVar = null;
        if (i2 == 4) {
            return new zzghb(zzghaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
