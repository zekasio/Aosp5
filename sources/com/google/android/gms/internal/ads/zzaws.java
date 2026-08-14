package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaws extends zzgqm implements zzgrx {
    private static final zzaws zzb;
    private int zzd;
    private int zze;
    private zzaww zzf;
    private zzawy zzg;

    static {
        zzaws zzawsVar = new zzaws();
        zzb = zzawsVar;
        zzgqm.zzaT(zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    public static zzawr zza() {
        return (zzawr) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaws zzawsVar, zzaww zzawwVar) {
        zzawwVar.getClass();
        zzawsVar.zzf = zzawwVar;
        zzawsVar.zzd |= 2;
    }

    static /* synthetic */ void zze(zzaws zzawsVar, zzawy zzawyVar) {
        zzawyVar.getClass();
        zzawsVar.zzg = zzawyVar;
        zzawsVar.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzaws zzawsVar, int i) {
        zzawsVar.zze = 1;
        zzawsVar.zzd = 1 | zzawsVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzawu.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaws();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzawr(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
