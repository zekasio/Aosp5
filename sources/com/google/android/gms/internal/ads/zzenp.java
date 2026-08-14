package com.google.android.gms.internal.ads;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenp implements zzepn {
    private final zzfuu zza;
    private final Context zzb;
    private final Set zzc;

    public zzenp(zzfuu zzfuuVar, Context context, Set set) {
        this.zza = zzfuuVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzenq zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains(TapjoyConstants.TJC_PLUGIN_NATIVE) || set.contains("banner")) {
                com.google.android.gms.ads.internal.zzt.zzA();
                return new zzenq(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() ? "a.1.3.37-google_20220829" : null);
            }
        }
        return new zzenq(null);
    }
}
