package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkf extends zzgqm implements zzgrx {
    private static final zzgkf zzb;
    private int zzd;
    private int zze;

    static {
        zzgkf zzgkfVar = new zzgkf();
        zzb = zzgkfVar;
        zzgqm.zzaT(zzgkf.class, zzgkfVar);
    }

    private zzgkf() {
    }

    public static zzgke zzc() {
        return (zzgke) zzb.zzaA();
    }

    public static zzgkf zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgkf();
        }
        zzgkd zzgkdVar = null;
        if (i2 == 4) {
            return new zzgke(zzgkdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int iZzb = zzgjw.zzb(this.zzd);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
