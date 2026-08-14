package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadc extends zzadp {
    public static final Parcelable.Creator<zzadc> CREATOR = new zzadb();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzadc(Parcel parcel) {
        String string = parcel.readString();
        int i = zzew.zza;
        super(string);
        this.zza = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadc zzadcVar = (zzadc) obj;
            if (this.zzf.equals(zzadcVar.zzf) && Arrays.equals(this.zza, zzadcVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzadc(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
