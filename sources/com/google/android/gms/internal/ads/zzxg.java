package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxg {
    public static final zzxa zza = new zzxa(0, -9223372036854775807L, null);
    public static final zzxa zzb = new zzxa(1, -9223372036854775807L, null);
    public static final zzxa zzc = new zzxa(2, -9223372036854775807L, null);
    public static final zzxa zzd = new zzxa(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzew.zzR("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzxb zzf;
    private IOException zzg;

    public zzxg(String str) {
    }

    public static zzxa zzb(boolean z, long j) {
        return new zzxa(z ? 1 : 0, j, null);
    }

    public final long zza(zzxc zzxcVar, zzwy zzwyVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzdl.zzb(looperMyLooper);
        this.zzg = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzxb(this, looperMyLooper, zzxcVar, zzwyVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzxb zzxbVar = this.zzf;
        zzdl.zzb(zzxbVar);
        zzxbVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzxb zzxbVar = this.zzf;
        if (zzxbVar != null) {
            zzxbVar.zzb(i);
        }
    }

    public final void zzj(zzxd zzxdVar) {
        zzxb zzxbVar = this.zzf;
        if (zzxbVar != null) {
            zzxbVar.zza(true);
        }
        this.zze.execute(new zzxe(zzxdVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
