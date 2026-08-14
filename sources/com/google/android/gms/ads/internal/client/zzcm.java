package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcm extends zzasv implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        float f = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbg.createTypedArrayList(zzbjl.CREATOR);
        parcelZzbg.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzd(parcelZza, z);
        zzbh(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzdaVar);
        zzbh(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbnf zzbnfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzbnfVar);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzd(parcelZza, z);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbjs zzbjsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, zzbjsVar);
        zzbh(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzffVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }
}
