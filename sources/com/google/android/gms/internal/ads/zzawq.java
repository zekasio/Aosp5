package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawq extends zzgqm implements zzgrx {
    private static final zzawq zzb;
    private int zzd;
    private int zze;
    private zzaxg zzg;
    private zzaxi zzh;
    private zzaxk zzj;
    private zzayu zzk;
    private zzayk zzl;
    private zzaxy zzm;
    private zzaya zzn;
    private int zzf = 1000;
    private zzgqv zzi = zzaM();
    private zzgqv zzo = zzaM();

    static {
        zzawq zzawqVar = new zzawq();
        zzb = zzawqVar;
        zzgqm.zzaT(zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    public static zzawq zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzawq zzawqVar, zzawo zzawoVar) {
        zzawqVar.zze = zzawoVar.zza();
        zzawqVar.zzd |= 1;
    }

    static /* synthetic */ void zzf(zzawq zzawqVar, zzaxi zzaxiVar) {
        zzaxiVar.getClass();
        zzawqVar.zzh = zzaxiVar;
        zzawqVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzawo.zzc(), "zzf", zzaxr.zza, "zzg", "zzh", "zzi", zzaxe.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzazg.class});
        }
        if (i2 == 3) {
            return new zzawq();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzawp(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaxi zzd() {
        zzaxi zzaxiVar = this.zzh;
        return zzaxiVar == null ? zzaxi.zzc() : zzaxiVar;
    }
}
