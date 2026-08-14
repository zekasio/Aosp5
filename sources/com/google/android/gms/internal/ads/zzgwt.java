package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgwt {
    final LinkedHashMap zza;

    zzgwt(int i) {
        this.zza = zzgwv.zzb(i);
    }

    final zzgwt zza(Object obj, zzgxl zzgxlVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgxg.zza(obj, "key");
        zzgxg.zza(zzgxlVar, "provider");
        linkedHashMap.put(obj, zzgxlVar);
        return this;
    }
}
