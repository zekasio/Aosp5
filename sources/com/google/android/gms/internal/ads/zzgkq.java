package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkq extends zzgqm implements zzgrx {
    private static final zzgkq zzb;
    private int zzd;
    private zzgkt zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgkq zzgkqVar = new zzgkq();
        zzb = zzgkqVar;
        zzgqm.zzaT(zzgkq.class, zzgkqVar);
    }

    private zzgkq() {
    }

    public static zzgkp zzc() {
        return (zzgkp) zzb.zzaA();
    }

    public static zzgkq zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgkq) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzi(zzgkq zzgkqVar, zzgkt zzgktVar) {
        zzgktVar.getClass();
        zzgkqVar.zze = zzgktVar;
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
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkq();
        }
        zzgko zzgkoVar = null;
        if (i2 == 4) {
            return new zzgkp(zzgkoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkt zzf() {
        zzgkt zzgktVar = this.zze;
        return zzgktVar == null ? zzgkt.zzf() : zzgktVar;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }

    public final boolean zzk() {
        return this.zze != null;
    }
}
