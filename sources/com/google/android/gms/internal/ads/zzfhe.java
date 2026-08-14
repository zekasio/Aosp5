package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhe {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfhd zzd = null;

    public zzfhe() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfhd zzfhdVar = (zzfhd) this.zzc.poll();
        this.zzd = zzfhdVar;
        if (zzfhdVar != null) {
            zzfhdVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfhd zzfhdVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfhd zzfhdVar) {
        zzfhdVar.zzb(this);
        this.zzc.add(zzfhdVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
