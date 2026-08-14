package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbps implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbpu zza;

    zzbps(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzbza.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbpu zzbpuVar = this.zza;
        zzbpuVar.zzb.onAdOpened(zzbpuVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzbza.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        zzbza.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbpu zzbpuVar = this.zza;
        zzbpuVar.zzb.onAdClosed(zzbpuVar);
    }
}
