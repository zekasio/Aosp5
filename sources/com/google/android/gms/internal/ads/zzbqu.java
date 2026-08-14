package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqu extends zzasw implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbqv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbqv ? (zzbqv) iInterfaceQueryLocalInterface : new zzbqt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Intent intent = (Intent) zzasx.zza(parcel, Intent.CREATOR);
            zzasx.zzc(parcel);
            zze(intent);
        } else if (i == 2) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzasx.zzc(parcel);
            zzg(iObjectWrapperAsInterface, string, string2);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
