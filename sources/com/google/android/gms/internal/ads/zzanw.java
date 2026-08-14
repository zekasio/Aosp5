package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanw extends zzgqm implements zzgrx {
    private static final zzanw zzb;
    private int zzd;
    private zzgpe zze = zzgpe.zzb;
    private zzgpe zzf;
    private zzgpe zzg;
    private zzgpe zzh;

    static {
        zzanw zzanwVar = new zzanw();
        zzb = zzanwVar;
        zzgqm.zzaT(zzanw.class, zzanwVar);
    }

    private zzanw() {
        zzgpe zzgpeVar = zzgpe.zzb;
        this.zzf = zzgpeVar;
        this.zzg = zzgpeVar;
        this.zzh = zzgpeVar;
    }

    public static zzanv zza() {
        return (zzanv) zzb.zzaA();
    }

    public static zzanw zzd(byte[] bArr, zzgpy zzgpyVar) throws zzgqy {
        return (zzanw) zzgqm.zzaI(zzb, bArr, zzgpyVar);
    }

    static /* synthetic */ void zzi(zzanw zzanwVar, zzgpe zzgpeVar) {
        zzanwVar.zzd |= 1;
        zzanwVar.zze = zzgpeVar;
    }

    static /* synthetic */ void zzj(zzanw zzanwVar, zzgpe zzgpeVar) {
        zzanwVar.zzd |= 2;
        zzanwVar.zzf = zzgpeVar;
    }

    static /* synthetic */ void zzk(zzanw zzanwVar, zzgpe zzgpeVar) {
        zzanwVar.zzd |= 4;
        zzanwVar.zzg = zzgpeVar;
    }

    static /* synthetic */ void zzl(zzanw zzanwVar, zzgpe zzgpeVar) {
        zzanwVar.zzd |= 8;
        zzanwVar.zzh = zzgpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzanw();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzanv(zzamuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpe zze() {
        return this.zze;
    }

    public final zzgpe zzf() {
        return this.zzf;
    }

    public final zzgpe zzg() {
        return this.zzh;
    }

    public final zzgpe zzh() {
        return this.zzg;
    }
}
