package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcj extends zzasv implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbnf getAdapterCreator() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        zzbnf zzbnfVarZzf = zzbne.zzf(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbnfVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzasx.zza(parcelZzbg, zzen.CREATOR);
        parcelZzbg.recycle();
        return zzenVar;
    }
}
