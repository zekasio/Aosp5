package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzse {
    private final zzaab zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzff zze;

    public zzse(zzaab zzaabVar) {
        this.zza = zzaabVar;
    }

    public final void zza(zzff zzffVar) {
        if (zzffVar != this.zze) {
            this.zze = zzffVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
