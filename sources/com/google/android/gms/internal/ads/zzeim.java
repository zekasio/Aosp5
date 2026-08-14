package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeim {
    private final zzeir zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzeim(zzeir zzeirVar, String str) {
        this.zza = zzeirVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzeis(i), new zzeil(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
