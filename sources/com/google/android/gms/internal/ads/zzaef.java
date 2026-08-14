package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaef implements zzbp {
    public static final Parcelable.Creator<zzaef> CREATOR = new zzaed();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaef(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    /* synthetic */ zzaef(Parcel parcel, zzaee zzaeeVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
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
            zzaef zzaefVar = (zzaef) obj;
            if (this.zza == zzaefVar.zza && this.zzb == zzaefVar.zzb && this.zzc == zzaefVar.zzc && this.zzd == zzaefVar.zzd && this.zze == zzaefVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = j ^ (j >>> 32);
        long j3 = this.zzb;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.zzc;
        long j6 = j5 ^ (j5 >>> 32);
        long j7 = this.zzd;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.zze;
        return ((((((((((int) j2) + 527) * 31) + ((int) j4)) * 31) + ((int) j6)) * 31) + ((int) j8)) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
