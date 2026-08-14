package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcn {
    public static final zzcn zza = new zzci();
    private static final String zzc = zzew.zzP(0);
    private static final String zzd = zzew.zzP(1);
    private static final String zze = zzew.zzP(2);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzch
    };

    protected zzcn() {
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcn)) {
            return false;
        }
        zzcn zzcnVar = (zzcn) obj;
        if (zzcnVar.zzc() == zzc() && zzcnVar.zzb() == zzb()) {
            zzcm zzcmVar = new zzcm();
            zzck zzckVar = new zzck();
            zzcm zzcmVar2 = new zzcm();
            zzck zzckVar2 = new zzck();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzcmVar, 0L).equals(zzcnVar.zze(i, zzcmVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzckVar, true).equals(zzcnVar.zzd(i2, zzckVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzcnVar.zzg(true) && (iZzh = zzh(true)) == zzcnVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzcnVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzcm zzcmVar = new zzcm();
        zzck zzckVar = new zzck();
        int iZzc = zzc() + 217;
        for (int i = 0; i < zzc(); i++) {
            iZzc = (iZzc * 31) + zze(i, zzcmVar, 0L).hashCode();
        }
        int iZzb = (iZzc * 31) + zzb();
        for (int i2 = 0; i2 < zzb(); i2++) {
            iZzb = (iZzb * 31) + zzd(i2, zzckVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzck zzd(int i, zzck zzckVar, boolean z);

    public abstract zzcm zze(int i, zzcm zzcmVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzck zzckVar, zzcm zzcmVar, int i2, boolean z) {
        int i3 = zzd(i, zzckVar, false).zzd;
        if (zze(i3, zzcmVar, 0L).zzp != i) {
            return i + 1;
        }
        int iZzj = zzj(i3, i2, z);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzcmVar, 0L).zzo;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcm zzcmVar, zzck zzckVar, int i, long j) {
        Pair pairZzm = zzm(zzcmVar, zzckVar, i, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzcm zzcmVar, zzck zzckVar, int i, long j, long j2) {
        zzdl.zza(i, 0, zzc());
        zze(i, zzcmVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcmVar.zzm;
            j = 0;
        }
        int i2 = zzcmVar.zzo;
        zzd(i2, zzckVar, false);
        while (i2 < zzcmVar.zzp) {
            long j4 = zzckVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzckVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzckVar, true);
        long j6 = zzckVar.zzf;
        long j7 = zzckVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzckVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzck zzn(Object obj, zzck zzckVar) {
        return zzd(zza(obj), zzckVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
