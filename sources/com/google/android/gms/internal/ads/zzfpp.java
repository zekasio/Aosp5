package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfpp extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    zzfpp(zzfpu zzfpuVar) {
        this.zza = zzfpuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzp = this.zza.zzp(entry.getKey());
            if (iZzp != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfnp.zza(objArr[iZzp], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfpu zzfpuVar = this.zza;
        Map mapZzj = zzfpuVar.zzj();
        return mapZzj != null ? mapZzj.entrySet().iterator() : new zzfpn(zzfpuVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfpu zzfpuVar = this.zza;
        if (zzfpuVar.zzn()) {
            return false;
        }
        int iZzo = zzfpuVar.zzo();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object objZzi = zzfpu.zzi(this.zza);
        zzfpu zzfpuVar2 = this.zza;
        int[] iArr = zzfpuVar2.zza;
        iArr.getClass();
        Object[] objArr = zzfpuVar2.zzb;
        objArr.getClass();
        Object[] objArr2 = zzfpuVar2.zzc;
        objArr2.getClass();
        int iZzb = zzfpv.zzb(key, value, iZzo, objZzi, iArr, objArr, objArr2);
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzm(iZzb, iZzo);
        zzfpu.zzb(this.zza);
        this.zza.zzk();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
