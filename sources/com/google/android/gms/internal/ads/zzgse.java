package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgse {
    private static final zzgse zza = new zzgse();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgsq zzb = new zzgro();

    private zzgse() {
    }

    public static zzgse zza() {
        return zza;
    }

    public final zzgsp zzb(Class cls) {
        zzgqw.zzf(cls, "messageType");
        zzgsp zzgspVarZza = (zzgsp) this.zzc.get(cls);
        if (zzgspVarZza == null) {
            zzgspVarZza = this.zzb.zza(cls);
            zzgqw.zzf(cls, "messageType");
            zzgqw.zzf(zzgspVarZza, "schema");
            zzgsp zzgspVar = (zzgsp) this.zzc.putIfAbsent(cls, zzgspVarZza);
            if (zzgspVar != null) {
                return zzgspVar;
            }
        }
        return zzgspVarZza;
    }
}
