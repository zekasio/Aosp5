package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbve extends zzasv implements IInterface {
    zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbut zzbutVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzbutVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbh(2, parcelZza);
    }
}
