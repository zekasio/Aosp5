package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxq extends zzasw implements zzbxr {
    public zzbxq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbxr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbxr ? (zzbxr) iInterfaceQueryLocalInterface : new zzbxp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxo zzbxmVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxv zzbxvVar = (zzbxv) zzasx.zza(parcel, zzbxv.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxmVar = iInterfaceQueryLocalInterface instanceof zzbxo ? (zzbxo) iInterfaceQueryLocalInterface : new zzbxm(strongBinder);
                }
                zzasx.zzc(parcel);
                zze(iObjectWrapperAsInterface, zzbxvVar, zzbxmVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrr zzbrrVarZzb = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzl(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbrrVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrr zzbrrVarZzb2 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzk(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbrrVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbsa zzbsaVar = (zzbsa) zzasx.zza(parcel, zzbsa.CREATOR);
                zzasx.zzc(parcel);
                zzf(zzbsaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrr zzbrrVarZzb3 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzh(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbrrVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrr zzbrrVarZzb4 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzg(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbrrVarZzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
