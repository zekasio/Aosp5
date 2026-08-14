package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxp extends zzasv implements zzbxr {
    zzbxp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zze(IObjectWrapper iObjectWrapper, zzbxv zzbxvVar, zzbxo zzbxoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzbxvVar);
        zzasx.zzg(parcelZza, zzbxoVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzf(zzbsa zzbsaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzbsaVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbrrVar);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbrrVar);
        zzbh(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbrrVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbrrVar);
        zzbh(5, parcelZza);
    }
}
