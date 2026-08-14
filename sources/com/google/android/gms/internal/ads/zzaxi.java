package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxi extends zzgqm implements zzgrx {
    private static final zzaxi zzb;
    private int zzd;
    private String zze = "";
    private zzgqv zzf = zzaM();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzb = zzaxiVar;
        zzgqm.zzaT(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
    }

    public static zzaxi zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzaxi zzaxiVar, String str) {
        str.getClass();
        zzaxiVar.zzd |= 1;
        zzaxiVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgqq zzgqqVar = zzaxr.zza;
            return zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", zzaxe.class, "zzg", zzgqqVar, "zzh", zzgqqVar, "zzi", zzgqqVar});
        }
        if (i2 == 3) {
            return new zzaxi();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaxh(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
