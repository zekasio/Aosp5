package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezt {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfuu zzc;

    public zzezt(Callable callable, zzfuu zzfuuVar) {
        this.zzb = callable;
        this.zzc = zzfuuVar;
    }

    public final synchronized zzfut zza() {
        zzc(1);
        return (zzfut) this.zza.poll();
    }

    public final synchronized void zzb(zzfut zzfutVar) {
        this.zza.addFirst(zzfutVar);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
