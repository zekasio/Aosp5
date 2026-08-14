package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcva extends zzczy implements zzcus {
    public zzcva(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcux
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcve) obj).zzk(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzb() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcve) obj).zzk(zzezx.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzc(final zzded zzdedVar) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcuz
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcve) obj).zzk(zzezx.zzd(12, zzdedVar.getMessage(), null));
            }
        });
    }
}
