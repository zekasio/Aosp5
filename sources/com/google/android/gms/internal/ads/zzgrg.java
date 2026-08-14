package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrg extends zzgrk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgrg() {
        super(null);
    }

    /* synthetic */ zzgrg(zzgrf zzgrfVar) {
        super(null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List list2 = (List) zzgtq.zzh(obj, j);
        if (list2.isEmpty()) {
            List zzgrdVar = list2 instanceof zzgre ? new zzgrd(i) : ((list2 instanceof zzgsd) && (list2 instanceof zzgqv)) ? ((zzgqv) list2).zzd(i) : new ArrayList(i);
            zzgtq.zzv(obj, j, zzgrdVar);
            return zzgrdVar;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzgtq.zzv(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzgtl)) {
                if (!(list2 instanceof zzgsd) || !(list2 instanceof zzgqv)) {
                    return list2;
                }
                zzgqv zzgqvVar = (zzgqv) list2;
                if (zzgqvVar.zzc()) {
                    return list2;
                }
                zzgqv zzgqvVarZzd = zzgqvVar.zzd(list2.size() + i);
                zzgtq.zzv(obj, j, zzgqvVarZzd);
                return zzgqvVarZzd;
            }
            zzgrd zzgrdVar2 = new zzgrd(list2.size() + i);
            zzgrdVar2.addAll(zzgrdVar2.size(), (zzgtl) list2);
            zzgtq.zzv(obj, j, zzgrdVar2);
            list = zzgrdVar2;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzgtq.zzh(obj, j);
        if (list instanceof zzgre) {
            objUnmodifiableList = ((zzgre) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgsd) && (list instanceof zzgqv)) {
                zzgqv zzgqvVar = (zzgqv) list;
                if (zzgqvVar.zzc()) {
                    zzgqvVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzgtq.zzv(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgtq.zzh(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzgtq.zzv(obj, j, list);
    }
}
