package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbtb extends zzasv implements zzbtd {
    zzbtb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zze(zzbsv zzbsvVar, zzbtg zzbtgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbsvVar);
        zzasx.zzg(parcelZza, zzbtgVar);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zzf(zzbsr zzbsrVar, zzbtg zzbtgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbsrVar);
        zzasx.zzg(parcelZza, zzbtgVar);
        zzbh(1, parcelZza);
    }
}
