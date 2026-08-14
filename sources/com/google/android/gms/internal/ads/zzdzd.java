package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzd implements zzcwc, zzcur {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzdzn zzd;

    public zzdzd(zzdzn zzdznVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzdznVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfM)).intValue();
            }
            if (i >= iIntValue) {
                return;
            }
            this.zzd.zzd(z);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        zzb(true);
    }
}
