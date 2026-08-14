package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbiq extends zzasv implements zzbis {
    zzbiq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final zzbip zze(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i, zzbim zzbimVar) throws RemoteException {
        zzbip zzbinVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzasx.zzg(parcelZza, zzbimVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbinVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbinVar = iInterfaceQueryLocalInterface instanceof zzbip ? (zzbip) iInterfaceQueryLocalInterface : new zzbin(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbinVar;
    }
}
