package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqy implements zzepn {
    private final Context zza;
    private final String zzb;
    private final zzfuu zzc;

    public zzeqy(zzbtp zzbtpVar, Context context, String str, zzfuu zzfuuVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqz(new JSONObject());
            }
        });
    }
}
