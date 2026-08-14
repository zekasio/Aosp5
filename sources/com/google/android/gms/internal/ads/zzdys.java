package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdys implements zzfdb {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfdj zzc;

    public zzdys(Set set, zzfdj zzfdjVar) {
        this.zzc = zzfdjVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyr zzdyrVar = (zzdyr) it.next();
            this.zza.put(zzdyrVar.zzb, zzdyrVar.zza);
            this.zzb.put(zzdyrVar.zzc, zzdyrVar.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbB(zzfcu zzfcuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbC(zzfcu zzfcuVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfcuVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfcuVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzc(zzfcu zzfcuVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfcuVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfcuVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzd(zzfcu zzfcuVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfcuVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfcuVar))), "s.");
        }
    }
}
