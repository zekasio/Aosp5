package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzade extends zzadp {
    public static final Parcelable.Creator<zzade> CREATOR = new zzadd();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzadp[] zzg;

    zzade(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzew.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new zzadp[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (zzadp) parcel.readParcelable(zzadp.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzade zzadeVar = (zzade) obj;
            if (this.zzb == zzadeVar.zzb && this.zzc == zzadeVar.zzc && this.zzd == zzadeVar.zzd && this.zze == zzadeVar.zze && zzew.zzU(this.zza, zzadeVar.zza) && Arrays.equals(this.zzg, zzadeVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.zzb + 527) * 31) + this.zzc;
        int i2 = (int) this.zzd;
        int i3 = (int) this.zze;
        String str = this.zza;
        return (((((i * 31) + i2) * 31) + i3) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzadp zzadpVar : this.zzg) {
            parcel.writeParcelable(zzadpVar, 0);
        }
    }

    public zzade(String str, int i, int i2, long j, long j2, zzadp[] zzadpVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzadpVarArr;
    }
}
