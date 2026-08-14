package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghu extends zzgqm implements zzgrx {
    private static final zzghu zzb;
    private int zzd;
    private zzgia zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzghu zzghuVar = new zzghu();
        zzb = zzghuVar;
        zzgqm.zzaT(zzghu.class, zzghuVar);
    }

    private zzghu() {
    }

    public static zzght zzc() {
        return (zzght) zzb.zzaA();
    }

    public static zzghu zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghu) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    static /* synthetic */ void zzi(zzghu zzghuVar, zzgia zzgiaVar) {
        zzgiaVar.getClass();
        zzghuVar.zze = zzgiaVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzghu();
        }
        zzghs zzghsVar = null;
        if (i2 == 4) {
            return new zzght(zzghsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgia zzf() {
        zzgia zzgiaVar = this.zze;
        return zzgiaVar == null ? zzgia.zze() : zzgiaVar;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }
}
