package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjb extends zzasv implements IInterface {
    zzfjb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfiz zze(zzfix zzfixVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzfixVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzfiz zzfizVar = (zzfiz) zzasx.zza(parcelZzbg, zzfiz.CREATOR);
        parcelZzbg.recycle();
        return zzfizVar;
    }

    public final zzfji zzf(zzfjg zzfjgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzfjgVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzfji zzfjiVar = (zzfji) zzasx.zza(parcelZzbg, zzfji.CREATOR);
        parcelZzbg.recycle();
        return zzfjiVar;
    }

    public final void zzg(zzfiu zzfiuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzfiuVar);
        zzbh(2, parcelZza);
    }
}
