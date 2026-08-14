package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnd extends zzasv implements zzbnf {
    zzbnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzbni zzb(String str) throws RemoteException {
        zzbni zzbngVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbngVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbngVar = iInterfaceQueryLocalInterface instanceof zzbni ? (zzbni) iInterfaceQueryLocalInterface : new zzbng(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzbpc zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzbpc zzbpcVarZzb = zzbpb.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbpcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(4, parcelZza);
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }
}
