package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfsf {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfnv zzfnvVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzfsc) {
                zzfsc zzfscVar = (zzfsc) set;
                return new zzfsc(zzfscVar.zza, zzfny.zza(zzfscVar.zzb, zzfnvVar));
            }
            set.getClass();
            zzfnvVar.getClass();
            return new zzfsc(set, zzfnvVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzfsc) {
            zzfsc zzfscVar2 = (zzfsc) sortedSet;
            return new zzfsd((SortedSet) zzfscVar2.zza, zzfny.zza(zzfscVar2.zzb, zzfnvVar));
        }
        sortedSet.getClass();
        zzfnvVar.getClass();
        return new zzfsd(sortedSet, zzfnvVar);
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfrp) {
            collection = ((zzfrp) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
