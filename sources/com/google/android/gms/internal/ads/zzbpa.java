package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpa extends zzasv implements zzbpc {
    zzbpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final zzbpq zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(parcelZzbg, zzbpq.CREATOR);
        parcelZzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final zzbpq zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(parcelZzbg, zzbpq.CREATOR);
        parcelZzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpf zzbpfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzasx.zze(parcelZza, bundle);
        zzasx.zze(parcelZza, bundle2);
        zzasx.zze(parcelZza, zzqVar);
        zzasx.zzg(parcelZza, zzbpfVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbon zzbonVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbonVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzboqVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzasx.zze(parcelZza, zzqVar);
        zzbh(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzboqVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzasx.zze(parcelZza, zzqVar);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbot zzbotVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbotVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbowVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar, zzbdl zzbdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbowVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzasx.zze(parcelZza, zzbdlVar);
        zzbh(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbozVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zze(parcelZza, zzlVar);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbozVar);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(24, parcelZza);
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }
}
