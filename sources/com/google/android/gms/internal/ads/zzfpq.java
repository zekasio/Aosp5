package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfpq implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzfpu zze;

    /* synthetic */ zzfpq(zzfpu zzfpuVar, zzfpm zzfpmVar) {
        this.zze = zzfpuVar;
        this.zzb = zzfpuVar.zzf;
        this.zzc = zzfpuVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfnu.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfpu zzfpuVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzfpuVar.zzb;
        objArr.getClass();
        zzfpuVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
