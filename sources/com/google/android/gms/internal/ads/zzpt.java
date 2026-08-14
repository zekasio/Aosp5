package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpt {
    public final int zza;
    public final zzss zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzpt(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzss zzssVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzssVar;
    }

    public final zzpt zza(int i, zzss zzssVar) {
        return new zzpt(this.zzc, 0, zzssVar);
    }

    public final void zzb(Handler handler, zzpu zzpuVar) {
        this.zzc.add(new zzps(handler, zzpuVar));
    }

    public final void zzc(zzpu zzpuVar) {
        for (zzps zzpsVar : this.zzc) {
            if (zzpsVar.zzb == zzpuVar) {
                this.zzc.remove(zzpsVar);
            }
        }
    }
}
