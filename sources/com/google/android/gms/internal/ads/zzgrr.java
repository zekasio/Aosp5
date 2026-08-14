package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrr {
    zzgrr() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzgrq zzgrqVar = (zzgrq) obj;
        if (zzgrqVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgrqVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgrq) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgrq zzgrqVarZzb = (zzgrq) obj;
        zzgrq zzgrqVar = (zzgrq) obj2;
        if (!zzgrqVar.isEmpty()) {
            if (!zzgrqVarZzb.zze()) {
                zzgrqVarZzb = zzgrqVarZzb.zzb();
            }
            zzgrqVarZzb.zzd(zzgrqVar);
        }
        return zzgrqVarZzb;
    }
}
