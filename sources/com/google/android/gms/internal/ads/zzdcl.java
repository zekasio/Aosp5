package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcl extends zzczy implements zzbie {
    public zzdcl(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zza(final zzbup zzbupVar) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdci
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzbie) obj).zza(zzbupVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zzb() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdck
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzbie) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final synchronized void zzc() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdcj
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzbie) obj).zzc();
            }
        });
    }
}
