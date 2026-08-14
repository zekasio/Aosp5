package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpl implements zzfdb {
    private final zzdpd zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdpl(zzdpd zzdpdVar, Set set, Clock clock) {
        this.zzb = zzdpdVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdpk zzdpkVar = (zzdpk) it.next();
            this.zzd.put(zzdpkVar.zzc, zzdpkVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfcu zzfcuVar, boolean z) {
        zzfcu zzfcuVar2 = ((zzdpk) this.zzd.get(zzfcuVar)).zzb;
        if (this.zza.containsKey(zzfcuVar2)) {
            String str = true != z ? "f." : "s.";
            this.zzb.zza().put("label.".concat(((zzdpk) this.zzd.get(zzfcuVar)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfcuVar2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbB(zzfcu zzfcuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbC(zzfcu zzfcuVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfcuVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfcuVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfcuVar)) {
            zze(zzfcuVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzc(zzfcu zzfcuVar, String str) {
        this.zza.put(zzfcuVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzd(zzfcu zzfcuVar, String str) {
        if (this.zza.containsKey(zzfcuVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfcuVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfcuVar)) {
            zze(zzfcuVar, true);
        }
    }
}
