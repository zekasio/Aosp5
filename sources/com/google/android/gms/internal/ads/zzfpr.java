package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfpr extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    zzfpr(zzfpu zzfpuVar) {
        this.zza = zzfpuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfpu zzfpuVar = this.zza;
        Map mapZzj = zzfpuVar.zzj();
        return mapZzj != null ? mapZzj.keySet().iterator() : new zzfpm(zzfpuVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        return mapZzj != null ? mapZzj.keySet().remove(obj) : this.zza.zzr(obj) != zzfpu.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
