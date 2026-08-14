package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawk {
    zzata zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzawk() {
        this.zzc = zzbyp.zzb;
    }

    public zzawk(final Context context) {
        ExecutorService executorService = zzbyp.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawf
            @Override // java.lang.Runnable
            public final void run() {
                zzawk zzawkVar = this.zza;
                Context context2 = context;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzew)).booleanValue()) {
                    try {
                        zzawkVar.zza = (zzata) zzbze.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbzc() { // from class: com.google.android.gms.internal.ads.zzawg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzbzc
                            public final Object zza(Object obj) {
                                return zzasz.zzb(obj);
                            }
                        });
                        zzawkVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzawkVar.zzb = true;
                    } catch (RemoteException | zzbzd | NullPointerException unused) {
                        zzbza.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
