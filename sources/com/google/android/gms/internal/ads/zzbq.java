package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbo();
    public final long zza;
    private final zzbp[] zzb;

    public zzbq(long j, zzbp... zzbpVarArr) {
        this.zza = j;
        this.zzb = zzbpVarArr;
    }

    zzbq(Parcel parcel) {
        this.zzb = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.zzb;
            if (i >= zzbpVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbpVarArr[i] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i++;
            }
        }
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
            zzbq zzbqVar = (zzbq) obj;
            if (Arrays.equals(this.zzb, zzbqVar.zzb) && this.zza == zzbqVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String string = Arrays.toString(this.zzb);
        long j = this.zza;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbp zzbpVar : this.zzb) {
            parcel.writeParcelable(zzbpVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbp zzb(int i) {
        return this.zzb[i];
    }

    public final zzbq zzc(zzbp... zzbpVarArr) {
        return zzbpVarArr.length == 0 ? this : new zzbq(this.zza, (zzbp[]) zzew.zzae(this.zzb, zzbpVarArr));
    }

    public final zzbq zzd(zzbq zzbqVar) {
        return zzbqVar == null ? this : zzc(zzbqVar.zzb);
    }

    public zzbq(List list) {
        this(-9223372036854775807L, (zzbp[]) list.toArray(new zzbp[0]));
    }
}
