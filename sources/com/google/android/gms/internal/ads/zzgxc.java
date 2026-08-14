package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxc extends zzgwu {
    private static final zzgxl zza = zzgwz.zza(Collections.emptyMap());

    /* synthetic */ zzgxc(Map map, zzgxa zzgxaVar) {
        super(map);
    }

    public static zzgxb zzc(int i) {
        return new zzgxb(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzgwv.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzgxl) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
