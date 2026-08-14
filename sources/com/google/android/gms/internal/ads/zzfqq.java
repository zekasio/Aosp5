package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqq {
    public static boolean zza(Iterable iterable, zzfnv zzfnvVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfnvVar.getClass();
            return zzc((List) iterable, zzfnvVar);
        }
        Iterator it = iterable.iterator();
        zzfnvVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfnvVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzfnv zzfnvVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfnvVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean zzc(List list, zzfnv zzfnvVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfnvVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfnvVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfnvVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
