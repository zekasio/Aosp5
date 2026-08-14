package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbke extends zzasv implements zzbkg {
    zzbke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zze(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzeVar);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzg(zzbka zzbkaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzbkaVar);
        zzbh(1, parcelZza);
    }
}
