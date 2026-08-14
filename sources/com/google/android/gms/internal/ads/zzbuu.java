package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbuu extends zzasv implements zzbuw {
    zzbuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzasx.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final zzbut zzd() throws RemoteException {
        zzbut zzburVar;
        Parcel parcelZzbg = zzbg(11, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzburVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzburVar = iInterfaceQueryLocalInterface instanceof zzbut ? (zzbut) iInterfaceQueryLocalInterface : new zzbur(strongBinder);
        }
        parcelZzbg.recycle();
        return zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, zzbvdVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, zzbvdVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzd(parcelZza, z);
        zzbh(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzddVar);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzdgVar);
        zzbh(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzk(zzbuz zzbuzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzbuzVar);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzl(zzbvk zzbvkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbvkVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzbve zzbveVar) throws RemoteException {
        throw null;
    }
}
