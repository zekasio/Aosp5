package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacr implements zzbp {
    public static final Parcelable.Creator<zzacr> CREATOR;
    private static final zzaf zzf;
    private static final zzaf zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/id3");
        zzf = zzadVar.zzY();
        zzad zzadVar2 = new zzad();
        zzadVar2.zzS("application/x-scte35");
        zzg = zzadVar2.zzY();
        CREATOR = new zzacq();
    }

    zzacr(Parcel parcel) {
        String string = parcel.readString();
        int i = zzew.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public zzacr(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
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
            zzacr zzacrVar = (zzacr) obj;
            if (this.zzc == zzacrVar.zzc && this.zzd == zzacrVar.zzd && zzew.zzU(this.zza, zzacrVar.zza) && zzew.zzU(this.zzb, zzacrVar.zzb) && Arrays.equals(this.zze, zzacrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
