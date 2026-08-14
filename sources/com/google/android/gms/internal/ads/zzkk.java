package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkk {
    private final zzkj zza;
    private final zzki zzb;
    private final zzdm zzc;
    private final zzcn zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzkk(zzki zzkiVar, zzkj zzkjVar, zzcn zzcnVar, int i, zzdm zzdmVar, Looper looper) {
        this.zzb = zzkiVar;
        this.zza = zzkjVar;
        this.zzd = zzcnVar;
        this.zzg = looper;
        this.zzc = zzdmVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzkj zzc() {
        return this.zza;
    }

    public final zzkk zzd() {
        zzdl.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzkk zze(Object obj) {
        zzdl.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzkk zzf(int i) {
        zzdl.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzdl.zzf(this.zzi);
        zzdl.zzf(this.zzg.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
