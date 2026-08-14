package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgs extends zzcn {
    private final int zzc;
    private final zzum zzd;

    public zzgs(boolean z, zzum zzumVar, byte[] bArr) {
        this.zzd = zzumVar;
        this.zzc = zzumVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        int iZza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        if (iZzp == -1 || (iZza = zzu(iZzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(iZzp) + iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        int iZzq = zzq(i);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i - zzs(iZzq), zzckVar, z);
        zzckVar.zzd += iZzt;
        if (z) {
            Object objZzv = zzv(iZzq);
            Object obj = zzckVar.zzc;
            obj.getClass();
            zzckVar.zzc = Pair.create(objZzv, obj);
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i - iZzt, zzcmVar, j);
        Object objZzv = zzv(iZzr);
        if (!zzcm.zza.equals(zzcmVar.zzc)) {
            objZzv = Pair.create(objZzv, zzcmVar.zzc);
        }
        zzcmVar.zzc = objZzv;
        zzcmVar.zzo += iZzs;
        zzcmVar.zzp += iZzs;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        int iZzq = zzq(i);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzg(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int iZza = z ? this.zzd.zza() : 0;
        while (zzu(iZza).zzo()) {
            iZza = zzw(iZza, z);
            if (iZza == -1) {
                return -1;
            }
        }
        return zzt(iZza) + zzu(iZza).zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int iZzb = z ? this.zzd.zzb() : i - 1;
        while (zzu(iZzb).zzo()) {
            iZzb = zzx(iZzb, z);
            if (iZzb == -1) {
                return -1;
            }
        }
        return zzt(iZzb) + zzu(iZzb).zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzj(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i - iZzt, i2 == 2 ? 0 : i2, z);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z);
        }
        if (iZzw != -1) {
            return zzt(iZzw) + zzu(iZzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzk(int i, int i2, boolean z) {
        int iZzr = zzr(i);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx != -1) {
            return zzt(iZzx) + zzu(iZzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzn(Object obj, zzck zzckVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzckVar);
        zzckVar.zzd += iZzt;
        zzckVar.zzc = obj;
        return zzckVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzcn zzu(int i);

    protected abstract Object zzv(int i);
}
