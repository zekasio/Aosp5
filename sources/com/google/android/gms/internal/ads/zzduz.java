package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduz extends zzdut {
    private String zzg;
    private int zzh = 1;

    zzduz(Context context) {
        this.zzf = new zzbsn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdut, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdvi(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdus(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdus(this));
                        } else {
                            this.zza.zze(new zzdvi(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zze(new zzdvi(1));
                    }
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zze(new zzdvi(1));
                }
            }
        }
    }

    public final zzfut zzb(zzbtn zzbtnVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzfuj.zzg(new zzdvi(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbtnVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzbzn.zzf);
            return this.zza;
        }
    }

    public final zzfut zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzfuj.zzg(new zzdvi(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdux
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzbzn.zzf);
            return this.zza;
        }
    }
}
