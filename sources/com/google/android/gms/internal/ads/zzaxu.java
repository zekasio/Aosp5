package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxu extends zzgqm implements zzgrx {
    private static final zzaxu zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzaze zzi;
    private zzaxm zzk;
    private zzaxp zzl;
    private zzayi zzm;
    private zzawq zzn;
    private zzays zzo;
    private zzazz zzp;
    private zzawz zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgqu zzj = zzaL();

    static {
        zzaxu zzaxuVar = new zzaxu();
        zzb = zzaxuVar;
        zzgqm.zzaT(zzaxu.class, zzaxuVar);
    }

    private zzaxu() {
    }

    public static zzaxt zzd() {
        return (zzaxt) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzaxu zzaxuVar, String str) {
        str.getClass();
        zzaxuVar.zzd |= 2;
        zzaxuVar.zzf = str;
    }

    static /* synthetic */ void zzh(zzaxu zzaxuVar, Iterable iterable) {
        zzgqu zzgquVar = zzaxuVar.zzj;
        if (!zzgquVar.zzc()) {
            int size = zzgquVar.size();
            zzaxuVar.zzj = zzgquVar.zzd(size == 0 ? 10 : size + size);
        }
        zzgon.zzav(iterable, zzaxuVar.zzj);
    }

    static /* synthetic */ void zzj(zzaxu zzaxuVar, zzaxm zzaxmVar) {
        zzaxmVar.getClass();
        zzaxuVar.zzk = zzaxmVar;
        zzaxuVar.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzaxu zzaxuVar, zzawq zzawqVar) {
        zzawqVar.getClass();
        zzaxuVar.zzn = zzawqVar;
        zzaxuVar.zzd |= 256;
    }

    static /* synthetic */ void zzl(zzaxu zzaxuVar, zzays zzaysVar) {
        zzaysVar.getClass();
        zzaxuVar.zzo = zzaysVar;
        zzaxuVar.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzaxu zzaxuVar, zzazz zzazzVar) {
        zzazzVar.getClass();
        zzaxuVar.zzp = zzazzVar;
        zzaxuVar.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzaxu zzaxuVar, zzawz zzawzVar) {
        zzawzVar.getClass();
        zzaxuVar.zzq = zzawzVar;
        zzaxuVar.zzd |= 2048;
    }

    public final zzawq zza() {
        zzawq zzawqVar = this.zzn;
        return zzawqVar == null ? zzawq.zzc() : zzawqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzaxr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzaxu();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaxt(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaxm zzc() {
        zzaxm zzaxmVar = this.zzk;
        return zzaxmVar == null ? zzaxm.zzc() : zzaxmVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
