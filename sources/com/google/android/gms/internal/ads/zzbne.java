package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbne extends zzasw implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbnf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbnf ? (zzbnf) iInterfaceQueryLocalInterface : new zzbnd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzasx.zzc(parcel);
            zzbni zzbniVarZzb = zzb(string);
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzbniVarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzasx.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zZze);
        } else if (i == 3) {
            String string3 = parcel.readString();
            zzasx.zzc(parcel);
            zzbpc zzbpcVarZzc = zzc(string3);
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzbpcVarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzasx.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zZzd);
        }
        return true;
    }
}
