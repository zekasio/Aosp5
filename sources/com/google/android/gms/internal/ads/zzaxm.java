package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxm extends zzgqm implements zzgrx {
    private static final zzaxm zzb;
    private int zzd;
    private zzazc zzf;
    private int zzg;
    private zzaze zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzaxm zzaxmVar = new zzaxm();
        zzb = zzaxmVar;
        zzgqm.zzaT(zzaxm.class, zzaxmVar);
    }

    private zzaxm() {
    }

    public static zzaxm zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzaxm zzaxmVar, String str) {
        zzaxmVar.zzd |= 1;
        zzaxmVar.zze = str;
    }

    static /* synthetic */ void zze(zzaxm zzaxmVar, zzaze zzazeVar) {
        zzazeVar.getClass();
        zzaxmVar.zzh = zzazeVar;
        zzaxmVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgqq zzgqqVar = zzaxr.zza;
            return zzaQ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgqqVar, "zzk", zzgqqVar, "zzl", zzgqqVar});
        }
        if (i2 == 3) {
            return new zzaxm();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaxl(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
