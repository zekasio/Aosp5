package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqt {
    public final List zza;

    public zzcqt(zzcqm zzcqmVar) {
        this.zza = Collections.singletonList(zzfuj.zzh(zzcqmVar));
    }

    public zzcqt(List list) {
        this.zza = list;
    }

    public static zzeat zza(zzeat zzeatVar) {
        return new zzeau(zzeatVar, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzcqs
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return new zzcqt((zzcqm) obj);
            }
        });
    }
}
