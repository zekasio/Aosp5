package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbti extends zzasw implements zzbtj {
    public zzbti() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzasx.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzasx.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) zzasx.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR);
            zzasx.zzc(parcel);
            zze(zzazVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
