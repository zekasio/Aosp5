package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxt extends HandlerThread implements Handler.Callback {
    private zzdr zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzxv zze;

    public zzxt() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        zzdr zzdrVar;
        zzdr zzdrVar2;
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    zzdrVar2 = this.zza;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (zzdrVar2 == null) {
                    throw null;
                }
                zzdrVar2.zzc();
                return true;
            }
            try {
                i = message.arg1;
                zzdrVar = this.zza;
            } catch (zzds e) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzd = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzc = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzee.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            if (zzdrVar == null) {
                throw null;
            }
            zzdrVar.zzb(i);
            this.zze = new zzxv(this, this.zza.zza(), i != 0, null);
            synchronized (this) {
                notify();
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzxv zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdr(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzxv zzxvVar = this.zze;
        zzxvVar.getClass();
        return zzxvVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
