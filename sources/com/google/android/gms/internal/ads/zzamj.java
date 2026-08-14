package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamj extends zzgqm implements zzgrx {
    private static final zzamj zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzamj zzamjVar = new zzamj();
        zzb = zzamjVar;
        zzgqm.zzaT(zzamj.class, zzamjVar);
    }

    private zzamj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzamj();
        }
        zzamg zzamgVar = null;
        if (i2 == 4) {
            return new zzami(zzamgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
