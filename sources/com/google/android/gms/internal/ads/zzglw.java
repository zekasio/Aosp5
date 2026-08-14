package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglw extends zzgqm implements zzgrx {
    private static final zzglw zzb;
    private String zzd = "";

    static {
        zzglw zzglwVar = new zzglw();
        zzb = zzglwVar;
        zzgqm.zzaT(zzglw.class, zzglwVar);
    }

    private zzglw() {
    }

    public static zzglw zzc() {
        return zzb;
    }

    public static zzglw zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzglw) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzglw();
        }
        zzglu zzgluVar = null;
        if (i2 == 4) {
            return new zzglv(zzgluVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zzd;
    }
}
