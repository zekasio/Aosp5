package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgho extends zzgqm implements zzgrx {
    private static final zzgho zzb;
    private zzghr zzd;
    private int zze;

    static {
        zzgho zzghoVar = new zzgho();
        zzb = zzghoVar;
        zzgqm.zzaT(zzgho.class, zzghoVar);
    }

    private zzgho() {
    }

    public static zzghn zzc() {
        return (zzghn) zzb.zzaA();
    }

    public static zzgho zze() {
        return zzb;
    }

    public static zzgho zzf(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgho) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzh(zzgho zzghoVar, zzghr zzghrVar) {
        zzghrVar.getClass();
        zzghoVar.zzd = zzghrVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgho();
        }
        zzghm zzghmVar = null;
        if (i2 == 4) {
            return new zzghn(zzghmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzghr zzg() {
        zzghr zzghrVar = this.zzd;
        return zzghrVar == null ? zzghr.zze() : zzghrVar;
    }
}
