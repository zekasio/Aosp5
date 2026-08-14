package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczk implements zzcxj {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzba)).intValue();

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final synchronized void zzb(zzeyo zzeyoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbb)).booleanValue()) {
            try {
                this.zza = zzeyoVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
