package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavm {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzavi(this);
    private final Object zzc = new Object();
    private zzavp zzd;
    private Context zze;
    private zzavs zzf;

    static /* bridge */ /* synthetic */ void zzh(zzavm zzavmVar) {
        synchronized (zzavmVar.zzc) {
            zzavp zzavpVar = zzavmVar.zzd;
            if (zzavpVar == null) {
                return;
            }
            if (zzavpVar.isConnected() || zzavmVar.zzd.isConnecting()) {
                zzavmVar.zzd.disconnect();
            }
            zzavmVar.zzd = null;
            zzavmVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzavp zzavpVarZzd = zzd(new zzavk(this), new zzavl(this));
                this.zzd = zzavpVarZzd;
                zzavpVarZzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzavq zzavqVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzavqVar);
                } catch (RemoteException e) {
                    zzbza.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzavn zzb(zzavq zzavqVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzavn();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzavqVar);
                }
                return this.zzf.zzf(zzavqVar);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call into cache service.", e);
                return new zzavn();
            }
        }
    }

    protected final synchronized zzavp zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzavp(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdM)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzavj(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdN)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzn.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdO)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
