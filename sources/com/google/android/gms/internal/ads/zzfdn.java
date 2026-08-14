package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfdn implements zzfdk {
    private final zzfdk zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhV)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfdn(zzfdk zzfdkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfdkVar;
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhU)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // java.lang.Runnable
            public final void run() {
                zzfdn.zzc(this.zza);
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfdn zzfdnVar) {
        while (!zzfdnVar.zzb.isEmpty()) {
            zzfdnVar.zza.zzb((zzfdj) zzfdnVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final String zza(zzfdj zzfdjVar) {
        return this.zza.zza(zzfdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final void zzb(zzfdj zzfdjVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfdjVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue queue = this.zzb;
        zzfdj zzfdjVarZzb = zzfdj.zzb("dropped_event");
        Map mapZzj = zzfdjVar.zzj();
        if (mapZzj.containsKey("action")) {
            zzfdjVarZzb.zza("dropped_action", (String) mapZzj.get("action"));
        }
        queue.offer(zzfdjVarZzb);
    }
}
