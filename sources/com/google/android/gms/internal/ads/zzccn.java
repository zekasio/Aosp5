package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccn implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    final zzccm zza(zzcbj zzcbjVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccm zzccmVar = (zzccm) it.next();
            if (zzccmVar.zza == zzcbjVar) {
                return zzccmVar;
            }
        }
        return null;
    }

    public final void zzb(zzccm zzccmVar) {
        this.zza.add(zzccmVar);
    }

    public final void zzc(zzccm zzccmVar) {
        this.zza.remove(zzccmVar);
    }

    public final boolean zzd(zzcbj zzcbjVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccm zzccmVar = (zzccm) it.next();
            if (zzccmVar.zza == zzcbjVar) {
                arrayList.add(zzccmVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzccm) it2.next()).zzb.zzf();
        }
        return true;
    }
}
