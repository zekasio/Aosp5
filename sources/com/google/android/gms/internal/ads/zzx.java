package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzu();
    public final String zza;
    public final int zzb;
    private final zzw[] zzc;
    private int zzd;

    zzx(Parcel parcel) {
        this.zza = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) zzew.zzH((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.zzc = zzwVarArr;
        this.zzb = zzwVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        return zzo.zza.equals(zzwVar3.zza) ? !zzo.zza.equals(zzwVar4.zza) ? 1 : 0 : zzwVar3.zza.compareTo(zzwVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (zzew.zzU(this.zza, zzxVar.zza) && Arrays.equals(this.zzc, zzxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzw zza(int i) {
        return this.zzc[i];
    }

    public final zzx zzb(String str) {
        return zzew.zzU(this.zza, str) ? this : new zzx(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    private zzx(String str, boolean z, zzw... zzwVarArr) {
        this.zza = str;
        zzwVarArr = z ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.zzc = zzwVarArr;
        this.zzb = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }
}
