package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenx implements zzepn {
    private final zzfuu zza;
    private final Bundle zzb;

    public zzenx(zzfuu zzfuuVar, Bundle bundle) {
        this.zza = zzfuuVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeny zzc() throws Exception {
        return new zzeny(this.zzb);
    }
}
