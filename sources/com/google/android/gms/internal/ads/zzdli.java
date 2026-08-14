package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdli extends zzdks implements zzdcc {
    private zzdcc zza;

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbgi zzbgiVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbgk zzbgkVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, zzdcc zzdccVar) {
        super.zzh(zzaVar, zzbgiVar, zzoVar, zzbgkVar, zzzVar);
        this.zza = zzdccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final synchronized void zzr() {
        zzdcc zzdccVar = this.zza;
        if (zzdccVar != null) {
            zzdccVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final synchronized void zzs() {
        zzdcc zzdccVar = this.zza;
        if (zzdccVar != null) {
            zzdccVar.zzs();
        }
    }
}
