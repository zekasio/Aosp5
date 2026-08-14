package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeio {
    private final zzdgt zza;
    private final zzeib zzb;
    private final zzcur zzc;

    public zzeio(zzdgt zzdgtVar, zzfdk zzfdkVar) {
        this.zza = zzdgtVar;
        final zzeib zzeibVar = new zzeib(zzfdkVar);
        this.zzb = zzeibVar;
        final zzbkg zzbkgVarZzg = zzdgtVar.zzg();
        this.zzc = new zzcur() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzcur
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeib zzeibVar2 = zzeibVar;
                zzbkg zzbkgVar = zzbkgVarZzg;
                zzeibVar2.zza(zzeVar);
                if (zzbkgVar != null) {
                    try {
                        zzbkgVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzbza.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbkgVar != null) {
                    try {
                        zzbkgVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzbza.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcur zza() {
        return this.zzc;
    }

    public final zzcwc zzb() {
        return this.zzb;
    }

    public final zzden zzc() {
        return new zzden(this.zza, this.zzb.zzc());
    }

    public final zzeib zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zze(zzbhVar);
    }
}
