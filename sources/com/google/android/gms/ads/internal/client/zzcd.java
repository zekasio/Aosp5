package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcd extends zzasw implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbnf zzbnfVarZzf = zzbne.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbu zzbuVarZzd = zzd(iObjectWrapperAsInterface, zzqVar, string, zzbnfVarZzf, i3);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbuVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbnf zzbnfVarZzf2 = zzbne.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbu zzbuVarZze = zze(iObjectWrapperAsInterface2, zzqVar2, string2, zzbnfVarZzf2, i4);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbuVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbnf zzbnfVarZzf3 = zzbne.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbq zzbqVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbnfVarZzf3, i5);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbqVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbeb zzbebVarZzi = zzi(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbebVarZzi);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzbnfVarZzf4 = zzbne.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbug zzbugVarZzn = zzn(iObjectWrapperAsInterface6, zzbnfVarZzf4, i6);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbugVarZzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbrc zzbrcVarZzm = zzm(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbrcVarZzm);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzasx.zzc(parcel);
                zzco zzcoVarZzg = zzg(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzcoVarZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbu zzbuVarZzf = zzf(iObjectWrapperAsInterface9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbuVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbeh zzbehVarZzj = zzj(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbehVarZzj);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbnf zzbnfVarZzf5 = zzbne.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbuw zzbuwVarZzo = zzo(iObjectWrapperAsInterface13, string5, zzbnfVarZzf5, i9);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbuwVarZzo);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbnf zzbnfVarZzf6 = zzbne.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface14, zzqVar4, string6, zzbnfVarZzf6, i10);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbuVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzbnfVarZzf7 = zzbne.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbxr zzbxrVarZzp = zzp(iObjectWrapperAsInterface15, zzbnfVarZzf7, i11);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbxrVarZzp);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzbnfVarZzf8 = zzbne.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbqv zzbqvVarZzl = zzl(iObjectWrapperAsInterface16, zzbnfVarZzf8, i12);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbqvVarZzl);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzbnfVarZzf9 = zzbne.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbim zzbimVarZzc = zzbil.zzc(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbip zzbipVarZzk = zzk(iObjectWrapperAsInterface17, zzbnfVarZzf9, i13, zzbimVarZzc);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbipVarZzk);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzbnfVarZzf10 = zzbne.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzasx.zzc(parcel);
                zzdj zzdjVarZzh = zzh(iObjectWrapperAsInterface18, zzbnfVarZzf10, i14);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
