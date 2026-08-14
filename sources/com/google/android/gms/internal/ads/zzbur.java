package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbur extends zzasv implements zzbut {
    zzbur(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final int zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        int i = parcelZzbg.readInt();
        parcelZzbg.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final String zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(1, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }
}
