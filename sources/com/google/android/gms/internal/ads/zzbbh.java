package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbbh {
    private final Map zza = new HashMap();
    private final zzbbj zzb;

    public zzbbh(zzbbj zzbbjVar) {
        this.zzb = zzbbjVar;
    }

    public final zzbbj zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbbg zzbbgVar) {
        this.zza.put(str, zzbbgVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbbj zzbbjVar = this.zzb;
        zzbbg zzbbgVar = (zzbbg) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbbgVar != null) {
            zzbbjVar.zze(zzbbgVar, j, strArr);
        }
        this.zza.put(str, new zzbbg(j, null, null));
    }
}
