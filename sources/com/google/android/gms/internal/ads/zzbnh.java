package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnh extends zzasw implements zzbni {
    public zzbnh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnl zzbnjVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface : new zzbnj(strongBinder);
                }
                zzbnl zzbnlVar = zzbnjVar;
                zzasx.zzc(parcel);
                zzu(iObjectWrapperAsInterface, zzqVar, zzlVar, string, zzbnlVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, iObjectWrapperZzn);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface2 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface2 : new zzbnj(strongBinder2);
                }
                zzasx.zzc(parcel);
                zzx(iObjectWrapperAsInterface2, zzlVar2, string2, zzbnjVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface3 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface3 : new zzbnj(strongBinder3);
                }
                zzbnl zzbnlVar2 = zzbnjVar;
                zzasx.zzc(parcel);
                zzv(iObjectWrapperAsInterface3, zzqVar2, zzlVar3, string3, string4, zzbnlVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface4 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface4 : new zzbnj(strongBinder4);
                }
                zzbnl zzbnlVar3 = zzbnjVar;
                zzasx.zzc(parcel);
                zzy(iObjectWrapperAsInterface4, zzlVar4, string5, string6, zzbnlVar3);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string7 = parcel.readString();
                zzbuo zzbuoVarZzb = zzbun.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzasx.zzc(parcel);
                zzp(iObjectWrapperAsInterface5, zzlVar5, string7, zzbuoVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string9 = parcel.readString();
                zzasx.zzc(parcel);
                zzs(zzlVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zZzN);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface5 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface5 : new zzbnj(strongBinder5);
                }
                zzbnl zzbnlVar4 = zzbnjVar;
                zzbdl zzbdlVar = (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzasx.zzc(parcel);
                zzz(iObjectWrapperAsInterface6, zzlVar7, string10, string11, zzbnlVar4, zzbdlVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, bundleZzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzasx.zzc(parcel);
                zzB(zzlVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzD(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzasx.zzd(parcel2, false);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuo zzbuoVarZzb2 = zzbun.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzasx.zzc(parcel);
                zzr(iObjectWrapperAsInterface8, zzbuoVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzber zzberVarZzi = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzberVarZzi);
                return true;
            case 25:
                boolean zZzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzG(zZzh);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzdqVarZzh);
                return true;
            case 27:
                zzbnu zzbnuVarZzk = zzk();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbnuVarZzk);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface6 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface6 : new zzbnj(strongBinder6);
                }
                zzasx.zzc(parcel);
                zzA(iObjectWrapperAsInterface9, zzlVar9, string14, zzbnjVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzK(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbjp zzbjpVarZzb = zzbjo.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbjv.CREATOR);
                zzasx.zzc(parcel);
                zzq(iObjectWrapperAsInterface11, zzbjpVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface7 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface7 : new zzbnj(strongBinder7);
                }
                zzasx.zzc(parcel);
                zzC(iObjectWrapperAsInterface12, zzlVar10, string15, zzbnjVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbpq zzbpqVarZzl = zzl();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzbpqVarZzl);
                return true;
            case 34:
                zzbpq zzbpqVarZzm = zzm();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzbpqVarZzm);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar11 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface8 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface8 : new zzbnj(strongBinder8);
                }
                zzbnl zzbnlVar5 = zzbnjVar;
                zzasx.zzc(parcel);
                zzw(iObjectWrapperAsInterface13, zzqVar3, zzlVar11, string16, string17, zzbnlVar5);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbno zzbnoVarZzj = zzj();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbnoVarZzj);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzJ(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar12 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnjVar = iInterfaceQueryLocalInterface9 instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface9 : new zzbnj(strongBinder9);
                }
                zzasx.zzc(parcel);
                zzt(iObjectWrapperAsInterface15, zzlVar12, string18, zzbnjVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzH(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
