package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbll extends zzbzz {
    private final Object zza = new Object();
    private final zzblq zzb;
    private boolean zzc;

    public zzbll(zzblq zzblqVar) {
        this.zzb = zzblqVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbli(this), new zzbzv());
            zzi(new zzblj(this), new zzblk(this));
        }
    }
}
