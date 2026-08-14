package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaki extends Thread {
    private final BlockingQueue zza;
    private final zzakh zzb;
    private final zzajy zzc;
    private volatile boolean zzd = false;
    private final zzakf zze;

    public zzaki(BlockingQueue blockingQueue, zzakh zzakhVar, zzajy zzajyVar, zzakf zzakfVar, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzakhVar;
        this.zzc = zzajyVar;
        this.zze = zzakfVar;
    }

    private void zzb() throws InterruptedException {
        zzako zzakoVar = (zzako) this.zza.take();
        SystemClock.elapsedRealtime();
        zzakoVar.zzt(3);
        try {
            zzakoVar.zzm("network-queue-take");
            zzakoVar.zzw();
            TrafficStats.setThreadStatsTag(zzakoVar.zzc());
            zzakk zzakkVarZza = this.zzb.zza(zzakoVar);
            zzakoVar.zzm("network-http-complete");
            if (zzakkVarZza.zze && zzakoVar.zzv()) {
                zzakoVar.zzp("not-modified");
                zzakoVar.zzr();
                return;
            }
            zzaku zzakuVarZzh = zzakoVar.zzh(zzakkVarZza);
            zzakoVar.zzm("network-parse-complete");
            if (zzakuVarZzh.zzb != null) {
                this.zzc.zzd(zzakoVar.zzj(), zzakuVarZzh.zzb);
                zzakoVar.zzm("network-cache-written");
            }
            zzakoVar.zzq();
            this.zze.zzb(zzakoVar, zzakuVarZzh, null);
            zzakoVar.zzs(zzakuVarZzh);
        } catch (zzakx e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzakoVar, e);
            zzakoVar.zzr();
        } catch (Exception e2) {
            zzala.zzc(e2, "Unhandled exception %s", e2.toString());
            zzakx zzakxVar = new zzakx(e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzakoVar, zzakxVar);
            zzakoVar.zzr();
        } finally {
            zzakoVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzala.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
