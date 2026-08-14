package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdqv extends zzbvc {
    final /* synthetic */ zzdqx zza;

    zzdqv(zzdqx zzdqxVar) {
        this.zza = zzdqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze(int i) throws RemoteException {
        zzdqx zzdqxVar = this.zza;
        zzdqxVar.zzb.zzm(zzdqxVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdqx zzdqxVar = this.zza;
        zzdqxVar.zzb.zzm(zzdqxVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg() throws RemoteException {
        zzdqx zzdqxVar = this.zza;
        zzdqxVar.zzb.zzp(zzdqxVar.zza);
    }
}
