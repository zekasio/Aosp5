package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwc extends zzgqm implements zzgrx {
    private static final zzgwc zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgwc zzgwcVar = new zzgwc();
        zzb = zzgwcVar;
        zzgqm.zzaT(zzgwc.class, zzgwcVar);
    }

    private zzgwc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgwc();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgwb(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
