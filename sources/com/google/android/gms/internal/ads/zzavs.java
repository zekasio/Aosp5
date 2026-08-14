package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavs extends zzasv implements IInterface {
    zzavs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzavq zzavqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzavqVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        long j = parcelZzbg.readLong();
        parcelZzbg.recycle();
        return j;
    }

    public final zzavn zzf(zzavq zzavqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzavqVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzavn zzavnVar = (zzavn) zzasx.zza(parcelZzbg, zzavn.CREATOR);
        parcelZzbg.recycle();
        return zzavnVar;
    }

    public final zzavn zzg(zzavq zzavqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzavqVar);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        zzavn zzavnVar = (zzavn) zzasx.zza(parcelZzbg, zzavn.CREATOR);
        parcelZzbg.recycle();
        return zzavnVar;
    }
}
