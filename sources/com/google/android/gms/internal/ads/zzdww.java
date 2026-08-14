package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdww extends zzdwz {
    private zzbsr zzh;

    zzdww(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zzf(this.zzh, new zzdwy(this));
            } catch (RemoteException unused) {
                this.zza.zze(new zzdvi(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.zza.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwz, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzbza.zze(str);
        this.zza.zze(new zzdvi(1, str));
    }

    public final synchronized zzfut zza(zzbsr zzbsrVar, long j) {
        if (this.zzb) {
            return zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbsrVar;
        zzb();
        zzfut zzfutVarZzn = zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzfutVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, zzbzn.zzf);
        return zzfutVarZzn;
    }
}
