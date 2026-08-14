package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadg extends zzadp {
    public static final Parcelable.Creator<zzadg> CREATOR = new zzadf();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzadp[] zze;

    zzadg(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzew.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzew.zzH(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.zze = new zzadp[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (zzadp) parcel.readParcelable(zzadp.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadg zzadgVar = (zzadg) obj;
            if (this.zzb == zzadgVar.zzb && this.zzc == zzadgVar.zzc && zzew.zzU(this.zza, zzadgVar.zza) && Arrays.equals(this.zzd, zzadgVar.zzd) && Arrays.equals(this.zze, zzadgVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0);
        String str = this.zza;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzadp zzadpVar : this.zze) {
            parcel.writeParcelable(zzadpVar, 0);
        }
    }

    public zzadg(String str, boolean z, boolean z2, String[] strArr, zzadp[] zzadpVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzadpVarArr;
    }
}
