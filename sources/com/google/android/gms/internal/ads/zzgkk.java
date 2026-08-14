package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkk extends zzgqm implements zzgrx {
    private static final zzgkk zzb;
    private zzgkn zzd;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgqm.zzaT(zzgkk.class, zzgkkVar);
    }

    private zzgkk() {
    }

    public static zzgkj zza() {
        return (zzgkj) zzb.zzaA();
    }

    public static zzgkk zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgkk) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzf(zzgkk zzgkkVar, zzgkn zzgknVar) {
        zzgknVar.getClass();
        zzgkkVar.zzd = zzgknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgkk();
        }
        zzgki zzgkiVar = null;
        if (i2 == 4) {
            return new zzgkj(zzgkiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkn zze() {
        zzgkn zzgknVar = this.zzd;
        return zzgknVar == null ? zzgkn.zzd() : zzgknVar;
    }
}
