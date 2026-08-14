package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbez extends zzasv implements zzbfb {
    zzbez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzberVar);
        parcelZza.writeString(str);
        zzbh(1, parcelZza);
    }
}
