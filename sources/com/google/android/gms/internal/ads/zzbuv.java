package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbuv extends zzasw implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbuw zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbuw ? (zzbuw) iInterfaceQueryLocalInterface : new zzbuu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvd zzbvbVar = null;
        zzbvd zzbvbVar2 = null;
        zzbve zzbveVar = null;
        zzbuz zzbuxVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvbVar = iInterfaceQueryLocalInterface instanceof zzbvd ? (zzbvd) iInterfaceQueryLocalInterface : new zzbvb(strongBinder);
                }
                zzasx.zzc(parcel);
                zzf(zzlVar, zzbvbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbuxVar = iInterfaceQueryLocalInterface2 instanceof zzbuz ? (zzbuz) iInterfaceQueryLocalInterface2 : new zzbux(strongBinder2);
                }
                zzasx.zzc(parcel);
                zzk(zzbuxVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zZzo);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzm(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbveVar = iInterfaceQueryLocalInterface3 instanceof zzbve ? (zzbve) iInterfaceQueryLocalInterface3 : new zzbve(strongBinder3);
                }
                zzasx.zzc(parcel);
                zzp(zzbveVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbvk zzbvkVar = (zzbvk) zzasx.zza(parcel, zzbvk.CREATOR);
                zzasx.zzc(parcel);
                zzl(zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzddVarZzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, bundleZzb);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzn(iObjectWrapperAsInterface2, zZzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbut zzbutVarZzd = zzd();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbutVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzdnVarZzc = zzc();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzdnVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvbVar2 = iInterfaceQueryLocalInterface4 instanceof zzbvd ? (zzbvd) iInterfaceQueryLocalInterface4 : new zzbvb(strongBinder4);
                }
                zzasx.zzc(parcel);
                zzg(zzlVar2, zzbvbVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzh2 = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzh(zZzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
