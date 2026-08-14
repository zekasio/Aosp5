package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzern implements zzepn {
    final zzfuu zza;
    final Context zzb;
    final zzavt zzc;

    public zzern(zzavt zzavtVar, zzfuu zzfuuVar, Context context, byte[] bArr) {
        this.zzc = zzavtVar;
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzero(new JSONObject());
            }
        });
    }
}
