package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzekn implements zzepn {
    private final Executor zza;
    private final zzbyj zzb;

    zzekn(Executor executor, zzbyj zzbyjVar) {
        this.zza = executor;
        this.zzb = zzbyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcp)).booleanValue() ? zzfuj.zzh(null) : zzfuj.zzl(this.zzb.zzj(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzepm() { // from class: com.google.android.gms.internal.ads.zzekm
                    @Override // com.google.android.gms.internal.ads.zzepm
                    public final void zzh(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
