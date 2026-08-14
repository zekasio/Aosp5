package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbsx extends zzasv implements zzbsz {
    zzbsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbtnVar);
        zzasx.zzg(parcelZza, zzbtjVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbtnVar);
        zzasx.zzg(parcelZza, zzbtjVar);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbtnVar);
        zzasx.zzg(parcelZza, zzbtjVar);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(String str, zzbtj zzbtjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbtjVar);
        zzbh(7, parcelZza);
    }
}
