package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaya extends zzgqm implements zzgrx {
    private static final zzaya zzb;
    private int zzd;
    private zzaxw zze;
    private zzgqv zzf = zzaM();
    private int zzg;
    private zzazc zzh;

    static {
        zzaya zzayaVar = new zzaya();
        zzb = zzayaVar;
        zzgqm.zzaT(zzaya.class, zzayaVar);
    }

    private zzaya() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaza.class, "zzg", zzaxr.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzaya();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaxz(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
