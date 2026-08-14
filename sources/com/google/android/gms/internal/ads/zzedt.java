package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzedt extends zzbov {
    final /* synthetic */ zzedu zza;
    private final zzeaw zzb;

    /* synthetic */ zzedt(zzedu zzeduVar, zzeaw zzeawVar, zzeds zzedsVar) {
        this.zza = zzeduVar;
        this.zzb = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbow
    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbow
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbow
    public final void zzg(zzbnu zzbnuVar) throws RemoteException {
        this.zza.zzc = zzbnuVar;
        ((zzecq) this.zzb.zzc).zzo();
    }
}
