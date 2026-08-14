package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejq implements zzepn {
    private final zzfut zza;
    private final Executor zzb;

    public zzejq(zzfut zzfutVar, Executor executor) {
        this.zza = zzfutVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzm(this.zza, new zzftq() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                final String str = (String) obj;
                return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzejo
                    @Override // com.google.android.gms.internal.ads.zzepm
                    public final void zzh(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
