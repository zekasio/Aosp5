package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbp extends zzasw implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzasx.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbev zzbevVarZzb = zzbeu.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzf(zzbevVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbey zzbeyVarZzb = zzbex.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzg(zzbeyVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbfe zzbfeVarZzb = zzbfd.zzb(parcel.readStrongBinder());
                zzbfb zzbfbVarZzb = zzbfa.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzh(string, zzbfeVarZzb, zzbfbVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbdl zzbdlVar = (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR);
                zzasx.zzc(parcel);
                zzo(zzbdlVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzasx.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbfi zzbfiVarZzb = zzbfh.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                zzasx.zzc(parcel);
                zzj(zzbfiVarZzb, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzasx.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzasx.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbfl zzbflVarZzb = zzbfk.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzk(zzbflVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbjx zzbjxVar = (zzbjx) zzasx.zza(parcel, zzbjx.CREATOR);
                zzasx.zzc(parcel);
                zzn(zzbjxVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbkg zzbkgVarZzb = zzbkf.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(zzbkgVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzasx.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzasx.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
