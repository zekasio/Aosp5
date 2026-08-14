package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzese implements zzepn {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbrg zzc;

    public zzese(zzbrg zzbrgVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbrgVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzl(zzfuj.zzn(zzfuj.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdG)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return new zzesf((Bundle) obj);
            }
        }, zzbzn.zza);
    }
}
