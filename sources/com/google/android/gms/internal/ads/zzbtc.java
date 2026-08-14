package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbtc extends zzasw implements zzbtd {
    public zzbtc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbtg zzbteVar = null;
        if (i == 1) {
            zzbsr zzbsrVar = (zzbsr) zzasx.zza(parcel, zzbsr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbteVar = iInterfaceQueryLocalInterface instanceof zzbtg ? (zzbtg) iInterfaceQueryLocalInterface : new zzbte(strongBinder);
            }
            zzasx.zzc(parcel);
            zzf(zzbsrVar, zzbteVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof zzbtg) {
                }
            }
            zzasx.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbsv zzbsvVar = (zzbsv) zzasx.zza(parcel, zzbsv.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbteVar = iInterfaceQueryLocalInterface3 instanceof zzbtg ? (zzbtg) iInterfaceQueryLocalInterface3 : new zzbte(strongBinder3);
            }
            zzasx.zzc(parcel);
            zze(zzbsvVar, zzbteVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
