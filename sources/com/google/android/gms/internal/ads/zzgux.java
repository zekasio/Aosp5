package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgux extends zzgqm implements zzgrx {
    private static final zzgux zzb;
    private int zzd;
    private byte zzg = 2;
    private zzgpe zze = zzgpe.zzb;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgux zzguxVar = new zzgux();
        zzb = zzguxVar;
        zzgqm.zzaT(zzgux.class, zzguxVar);
    }

    private zzgux() {
    }

    public static zzguw zza() {
        return (zzguw) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgux zzguxVar, zzgpe zzgpeVar) {
        zzguxVar.zzd |= 1;
        zzguxVar.zze = zzgpeVar;
    }

    static /* synthetic */ void zze(zzgux zzguxVar, zzgpe zzgpeVar) {
        zzguxVar.zzd |= 2;
        zzguxVar.zzf = zzgpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgux();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzguw(zzgubVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
