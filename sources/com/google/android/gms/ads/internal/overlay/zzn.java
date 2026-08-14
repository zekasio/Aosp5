package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbzg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder5 = null;
        String strCreateString3 = null;
        zzbzg zzbzgVar = null;
        String strCreateString4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinder6 = null;
        String strCreateString5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, header, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 7:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 11:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    zzbzgVar = (zzbzg) SafeParcelReader.createParcelable(parcel, header, zzbzg.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 16:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 20:
                    iBinder7 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 21:
                    iBinder8 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 22:
                    iBinder9 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 23:
                    iBinder10 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 24:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    iBinder11 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 27:
                    iBinder12 = SafeParcelReader.readIBinder(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, strCreateString, z, strCreateString2, iBinder5, i, i2, strCreateString3, zzbzgVar, strCreateString4, zzjVar, iBinder6, strCreateString5, iBinder7, iBinder8, iBinder9, iBinder10, strCreateString6, strCreateString7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
