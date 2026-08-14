package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmy {
    private static zzbmy zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbmy() {
    }

    public static zzbmy zza() {
        if (zza == null) {
            zza = new zzbmy();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmx
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                zzbar.zzc(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaf)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzam)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcgc) zzbze.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzbzc() { // from class: com.google.android.gms.internal.ads.zzbmw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzbzc
                        public final Object zza(Object obj) {
                            return zzcgb.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbmv(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                } catch (RemoteException | zzbzd | NullPointerException e) {
                    zzbza.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
