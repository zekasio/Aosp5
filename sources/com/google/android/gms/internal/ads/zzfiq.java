package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfiq extends zzgqm implements zzgrx {
    private static final zzfiq zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfim zzh;

    static {
        zzfiq zzfiqVar = new zzfiq();
        zzb = zzfiqVar;
        zzgqm.zzaT(zzfiq.class, zzfiqVar);
    }

    private zzfiq() {
    }

    public static zzfio zza() {
        return (zzfio) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfiq zzfiqVar, String str) {
        str.getClass();
        zzfiqVar.zzd |= 2;
        zzfiqVar.zzf = str;
    }

    static /* synthetic */ void zze(zzfiq zzfiqVar, zzfim zzfimVar) {
        zzfimVar.getClass();
        zzfiqVar.zzh = zzfimVar;
        zzfiqVar.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfiq zzfiqVar, int i) {
        zzfiqVar.zze = 1;
        zzfiqVar.zzd = 1 | zzfiqVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfip.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfiq();
        }
        zzfin zzfinVar = null;
        if (i2 == 4) {
            return new zzfio(zzfinVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
