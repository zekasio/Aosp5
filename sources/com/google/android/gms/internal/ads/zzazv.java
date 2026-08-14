package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazv extends zzgqm implements zzgrx {
    private static final zzazv zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;
    private zzazc zzg;

    static {
        zzazv zzazvVar = new zzazv();
        zzb = zzazvVar;
        zzgqm.zzaT(zzazv.class, zzazvVar);
    }

    private zzazv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxr.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzazv();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzazu(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
