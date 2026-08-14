package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbte extends zzasv implements zzbtg {
    zzbte(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzazVar);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, parcelFileDescriptor);
        zzbh(1, parcelZza);
    }
}
