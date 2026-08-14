package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcxc implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcxd zzcxdVar = (zzcxd) this.zza.get();
        if (zzcxdVar != null) {
            zzcxdVar.zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcxa
                @Override // com.google.android.gms.internal.ads.zzczx
                public final void zza(Object obj) {
                    ((zzcxe) obj).zza();
                }
            });
        }
    }
}
