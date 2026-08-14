package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzceo implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcei zza;
    private final com.google.android.gms.ads.internal.overlay.zzo zzb;

    public zzceo(zzcei zzceiVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zza = zzceiVar;
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
        this.zza.zzX();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
        this.zza.zzV();
    }
}
