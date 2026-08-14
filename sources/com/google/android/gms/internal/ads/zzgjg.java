package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjg extends zzgqm implements zzgrx {
    private static final zzgjg zzb;
    private zzgjj zzd;

    static {
        zzgjg zzgjgVar = new zzgjg();
        zzb = zzgjgVar;
        zzgqm.zzaT(zzgjg.class, zzgjgVar);
    }

    private zzgjg() {
    }

    public static zzgjf zza() {
        return (zzgjf) zzb.zzaA();
    }

    public static zzgjg zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgjg) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzf(zzgjg zzgjgVar, zzgjj zzgjjVar) {
        zzgjjVar.getClass();
        zzgjgVar.zzd = zzgjjVar;
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
            return new zzgjg();
        }
        zzgje zzgjeVar = null;
        if (i2 == 4) {
            return new zzgjf(zzgjeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjj zze() {
        zzgjj zzgjjVar = this.zzd;
        return zzgjjVar == null ? zzgjj.zze() : zzgjjVar;
    }
}
