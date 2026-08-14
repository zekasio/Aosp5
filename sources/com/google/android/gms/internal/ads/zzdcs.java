package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcs extends zzczy {
    private boolean zzb;

    protected zzdcs(Set set) {
        super(set);
    }

    public final void zza() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdco
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdcq
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzp(zzdcp.zza);
            this.zzb = true;
        }
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdcr
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzp(zzdcp.zza);
        this.zzb = true;
    }
}
