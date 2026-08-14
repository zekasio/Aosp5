package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfpf extends zzfpi implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfpf(Map map) {
        zzfnu.zze(map.isEmpty());
        this.zza = map;
    }

    static /* synthetic */ int zzd(zzfpf zzfpfVar) {
        int i = zzfpfVar.zzb;
        zzfpfVar.zzb = i + 1;
        return i;
    }

    static /* synthetic */ int zze(zzfpf zzfpfVar) {
        int i = zzfpfVar.zzb;
        zzfpfVar.zzb = i - 1;
        return i;
    }

    static /* synthetic */ int zzf(zzfpf zzfpfVar, int i) {
        int i2 = zzfpfVar.zzb + i;
        zzfpfVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ int zzg(zzfpf zzfpfVar, int i) {
        int i2 = zzfpfVar.zzb - i;
        zzfpfVar.zzb = i2;
        return i2;
    }

    static /* synthetic */ void zzq(zzfpf zzfpfVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfpfVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfpfVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    final Collection zzi() {
        return new zzfph(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    final Iterator zzj() {
        return new zzfop(this);
    }

    final List zzk(Object obj, List list, @CheckForNull zzfpc zzfpcVar) {
        return list instanceof RandomAccess ? new zzfoy(this, obj, list, zzfpcVar) : new zzfpe(this, obj, list, zzfpcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    Map zzm() {
        throw null;
    }

    final Map zzn() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfow(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfoz(this, (SortedMap) map) : new zzfos(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    Set zzo() {
        throw null;
    }

    final Set zzp() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfox(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfpa(this, (SortedMap) map) : new zzfov(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final void zzr() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi, com.google.android.gms.internal.ads.zzfrg
    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
