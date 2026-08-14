package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaof extends zzgqm implements zzgrx {
    private static final zzaof zzb;
    private int zzd;
    private zzgqv zze = zzaM();
    private zzgpe zzf = zzgpe.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzaof zzaofVar = new zzaof();
        zzb = zzaofVar;
        zzgqm.zzaT(zzaof.class, zzaofVar);
    }

    private zzaof() {
    }

    public static zzaoe zza() {
        return (zzaoe) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaof zzaofVar, zzgpe zzgpeVar) {
        zzgqv zzgqvVar = zzaofVar.zze;
        if (!zzgqvVar.zzc()) {
            zzaofVar.zze = zzgqm.zzaN(zzgqvVar);
        }
        zzaofVar.zze.add(zzgpeVar);
    }

    static /* synthetic */ void zze(zzaof zzaofVar, zzgpe zzgpeVar) {
        zzaofVar.zzd |= 1;
        zzaofVar.zzf = zzgpeVar;
    }

    static /* synthetic */ void zzf(zzaof zzaofVar, int i) {
        zzaofVar.zzh = i - 1;
        zzaofVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzanz.zza, "zzh", zzanx.zza});
        }
        if (i2 == 3) {
            return new zzaof();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzaoe(zzamuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
