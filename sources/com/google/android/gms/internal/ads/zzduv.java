package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduv extends zzdut {
    zzduv(Context context) {
        this.zzf = new zzbsn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzdus(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzdvi(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zze(new zzdvi(1));
                }
            }
        }
    }

    public final zzfut zzb(zzbtn zzbtnVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbtnVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzbzn.zzf);
            return this.zza;
        }
    }
}
