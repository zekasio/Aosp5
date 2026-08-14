package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbjz extends zzasw implements zzbka {
    public zzbjz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbkd zzbkbVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = zzb();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzdqVarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbkbVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbkbVar = iInterfaceQueryLocalInterface instanceof zzbkd ? (zzbkd) iInterfaceQueryLocalInterface : new zzbkb(strongBinder);
            }
            zzasx.zzc(parcel);
            zzf(iObjectWrapperAsInterface, zzbkbVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbdu zzbduVarZzc = zzc();
        parcel2.writeNoException();
        zzasx.zzg(parcel2, zzbduVarZzc);
        return true;
    }
}
