package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgur extends zzgqm implements zzgrx {
    private static final zzgur zzb;
    private int zzd;
    private zzguq zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        zzgur zzgurVar = new zzgur();
        zzb = zzgurVar;
        zzgqm.zzaT(zzgur.class, zzgurVar);
    }

    private zzgur() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgur();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzguo(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
