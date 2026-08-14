package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdca extends zzczy implements zzdcc {
    zzdca(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdby
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdcc) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdbz
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdcc) obj).zzs();
            }
        });
    }
}
