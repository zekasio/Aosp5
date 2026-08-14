package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglk extends zzgqm implements zzgrx {
    private static final zzglk zzb;
    private zzgky zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzglk zzglkVar = new zzglk();
        zzb = zzglkVar;
        zzgqm.zzaT(zzglk.class, zzglkVar);
    }

    private zzglk() {
    }

    public static zzglj zzd() {
        return (zzglj) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzglk zzglkVar, zzgky zzgkyVar) {
        zzgkyVar.getClass();
        zzglkVar.zzd = zzgkyVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzglk();
        }
        zzglh zzglhVar = null;
        if (i2 == 4) {
            return new zzglj(zzglhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgky zzc() {
        zzgky zzgkyVar = this.zzd;
        return zzgkyVar == null ? zzgky.zze() : zzgkyVar;
    }

    public final zzgme zzf() {
        zzgme zzgmeVarZzb = zzgme.zzb(this.zzg);
        return zzgmeVarZzb == null ? zzgme.UNRECOGNIZED : zzgmeVarZzb;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
