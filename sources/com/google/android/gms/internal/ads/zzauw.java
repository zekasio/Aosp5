package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauw extends zzasv implements zzauy {
    zzauw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzd(parcelZza, z);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzdgVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzi(IObjectWrapper iObjectWrapper, zzavf zzavfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzavfVar);
        zzbh(4, parcelZza);
    }
}
