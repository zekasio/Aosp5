package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacu implements zzbp {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzact();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzacu(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzacu(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = zzew.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public static zzacu zzb(zzen zzenVar) {
        int iZze = zzenVar.zze();
        String strZzx = zzenVar.zzx(zzenVar.zze(), zzfnh.zza);
        String strZzx2 = zzenVar.zzx(zzenVar.zze(), zzfnh.zzc);
        int iZze2 = zzenVar.zze();
        int iZze3 = zzenVar.zze();
        int iZze4 = zzenVar.zze();
        int iZze5 = zzenVar.zze();
        int iZze6 = zzenVar.zze();
        byte[] bArr = new byte[iZze6];
        zzenVar.zzB(bArr, 0, iZze6);
        return new zzacu(iZze, strZzx, strZzx2, iZze2, iZze3, iZze4, iZze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacu zzacuVar = (zzacu) obj;
            if (this.zza == zzacuVar.zza && this.zzb.equals(zzacuVar.zzb) && this.zzc.equals(zzacuVar.zzc) && this.zzd == zzacuVar.zzd && this.zze == zzacuVar.zze && this.zzf == zzacuVar.zzf && this.zzg == zzacuVar.zzg && Arrays.equals(this.zzh, zzacuVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        zzbkVar.zza(this.zzh, this.zza);
    }
}
