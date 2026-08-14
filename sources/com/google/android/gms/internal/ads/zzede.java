package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzede extends zzbos {
    private final zzeaw zza;

    @Override // com.google.android.gms.internal.ads.zzbot
    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzecq) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final void zzg() throws RemoteException {
        ((zzecq) this.zza.zzc).zzo();
    }
}
