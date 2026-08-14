package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffz {
    private static final zzffz zza = new zzffz();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzffz() {
    }

    public static zzffz zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzffo zzffoVar) {
        this.zzb.add(zzffoVar);
    }

    public final void zze(zzffo zzffoVar) {
        boolean zZzg = zzg();
        this.zzb.remove(zzffoVar);
        this.zzc.remove(zzffoVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfgf.zzb().zzf();
    }

    public final void zzf(zzffo zzffoVar) {
        boolean zZzg = zzg();
        this.zzc.add(zzffoVar);
        if (zZzg) {
            return;
        }
        zzfgf.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
