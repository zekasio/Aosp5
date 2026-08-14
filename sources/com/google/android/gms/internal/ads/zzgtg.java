package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgtg {
    zzgtg() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzgpe zzgpeVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract boolean zzq(zzgsh zzgshVar);

    abstract void zzr(Object obj, zzgpu zzgpuVar) throws IOException;

    final boolean zzp(Object obj, zzgsh zzgshVar) throws IOException {
        int iZzd = zzgshVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgshVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzgshVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzgshVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgqy.zza();
            }
            zzh(obj, i, zzgshVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzgshVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzgshVar)) {
        }
        if ((4 | i3) != zzgshVar.zzd()) {
            throw zzgqy.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
