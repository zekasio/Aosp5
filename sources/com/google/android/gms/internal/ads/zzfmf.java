package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmf extends zzasv implements zzfmh {
    zzfmf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zze(Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, bundle);
        zzasx.zzg(parcelZza, zzfmjVar);
        zzbi(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zzf(String str, Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzasx.zze(parcelZza, bundle);
        zzasx.zzg(parcelZza, zzfmjVar);
        zzbi(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zzg(Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, bundle);
        zzasx.zzg(parcelZza, zzfmjVar);
        zzbi(3, parcelZza);
    }
}
