package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayn extends zzgqm implements zzgrx {
    private static final zzgqs zzb = new zzayl();
    private static final zzayn zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgqr zzj = zzaJ();
    private zzayi zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzayn zzaynVar = new zzayn();
        zzd = zzaynVar;
        zzgqm.zzaT(zzayn.class, zzaynVar);
    }

    private zzayn() {
    }

    static /* synthetic */ void zzA(zzayn zzaynVar, int i) {
        zzaynVar.zzm = i - 1;
        zzaynVar.zze |= 64;
    }

    static /* synthetic */ void zzB(zzayn zzaynVar, int i) {
        zzaynVar.zzn = i - 1;
        zzaynVar.zze |= 128;
    }

    static /* synthetic */ void zzC(zzayn zzaynVar, int i) {
        zzaynVar.zzp = i - 1;
        zzaynVar.zze |= 512;
    }

    public static zzaym zzg() {
        return (zzaym) zzd.zzaA();
    }

    public static zzayn zzi(byte[] bArr) throws zzgqy {
        return (zzayn) zzgqm.zzaF(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzayn zzaynVar, long j) {
        zzaynVar.zze |= 1;
        zzaynVar.zzf = j;
    }

    static /* synthetic */ void zzm(zzayn zzaynVar, long j) {
        zzaynVar.zze |= 4;
        zzaynVar.zzh = j;
    }

    static /* synthetic */ void zzn(zzayn zzaynVar, long j) {
        zzaynVar.zze |= 8;
        zzaynVar.zzi = j;
    }

    static /* synthetic */ void zzo(zzayn zzaynVar, Iterable iterable) {
        zzgqr zzgqrVar = zzaynVar.zzj;
        if (!zzgqrVar.zzc()) {
            zzaynVar.zzj = zzgqm.zzaK(zzgqrVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzaynVar.zzj.zzh(((zzaxc) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzayn zzaynVar, zzayi zzayiVar) {
        zzayiVar.getClass();
        zzaynVar.zzk = zzayiVar;
        zzaynVar.zze |= 16;
    }

    static /* synthetic */ void zzq(zzayn zzaynVar, int i) {
        zzaynVar.zze |= 256;
        zzaynVar.zzo = i;
    }

    static /* synthetic */ void zzr(zzayn zzaynVar, zzayr zzayrVar) {
        zzaynVar.zzq = zzayrVar.zza();
        zzaynVar.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzayn zzaynVar, long j) {
        zzaynVar.zze |= 2048;
        zzaynVar.zzr = j;
    }

    static /* synthetic */ void zzy(zzayn zzaynVar, int i) {
        zzaynVar.zzg = i - 1;
        zzaynVar.zze |= 2;
    }

    static /* synthetic */ void zzz(zzayn zzaynVar, int i) {
        zzaynVar.zzl = i - 1;
        zzaynVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgqq zzgqqVarZzc = zzaxc.zzc();
            zzgqq zzgqqVarZzc2 = zzayr.zzc();
            zzgqq zzgqqVar = zzaxr.zza;
            return zzaQ(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgqqVar, "zzh", "zzi", "zzj", zzgqqVarZzc, "zzk", "zzl", zzgqqVar, "zzm", zzgqqVar, "zzn", zzgqqVar, "zzo", "zzp", zzgqqVar, "zzq", zzgqqVarZzc2, "zzr"});
        }
        if (i2 == 3) {
            return new zzayn();
        }
        zzawl zzawlVar = null;
        if (i2 == 4) {
            return new zzaym(zzawlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzayi zzf() {
        zzayi zzayiVar = this.zzk;
        return zzayiVar == null ? zzayi.zzd() : zzayiVar;
    }

    public final zzayr zzj() {
        zzayr zzayrVarZzb = zzayr.zzb(this.zzq);
        return zzayrVarZzb == null ? zzayr.UNSPECIFIED : zzayrVarZzb;
    }

    public final List zzk() {
        return new zzgqt(this.zzj, zzb);
    }

    public final int zzt() {
        int iZza = zzaxs.zza(this.zzm);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzu() {
        int iZza = zzaxs.zza(this.zzn);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzv() {
        int iZza = zzaxs.zza(this.zzp);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzw() {
        int iZza = zzaxs.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzx() {
        int iZza = zzaxs.zza(this.zzl);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
