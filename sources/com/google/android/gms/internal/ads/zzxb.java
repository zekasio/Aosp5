package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxb extends Handler implements Runnable {
    final /* synthetic */ zzxg zza;
    private final zzxc zzb;
    private final long zzc;
    private zzwy zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxb(zzxg zzxgVar, Looper looper, zzxc zzxcVar, zzwy zzwyVar, int i, long j) {
        super(looper);
        this.zza = zzxgVar;
        this.zzb = zzxcVar;
        this.zzd = zzwyVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzwy zzwyVar = this.zzd;
        zzwyVar.getClass();
        if (this.zzh) {
            zzwyVar.zzI(this.zzb, jElapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            try {
                zzwyVar.zzJ(this.zzb, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                zzee.zzc("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzxf(e);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        zzxa zzxaVarZzt = zzwyVar.zzt(this.zzb, jElapsedRealtime, j, iOException, i2);
        if (zzxaVarZzt.zza == 3) {
            this.zza.zzg = this.zze;
        } else if (zzxaVarZzt.zza != 2) {
            if (zzxaVarZzt.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzxaVarZzt.zzb != -9223372036854775807L ? zzxaVarZzt.zzb : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i = zzew.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(2, new zzxf(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(2, new zzxf(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzwy zzwyVar = this.zzd;
            zzwyVar.getClass();
            zzwyVar.zzI(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzdl.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        this.zze = null;
        zzxg zzxgVar = this.zza;
        ExecutorService executorService = zzxgVar.zze;
        zzxb zzxbVar = zzxgVar.zzf;
        zzxbVar.getClass();
        executorService.execute(zzxbVar);
    }
}
